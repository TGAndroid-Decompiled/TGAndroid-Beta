package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.messenger.audioinfo.mp3.MP3Frame;

public class MP3Info extends AudioInfo {
    static final Logger LOGGER = Logger.getLogger(MP3Info.class.getName());

    public interface StopReadCondition {
        boolean stopRead(MP3Input mP3Input) throws IOException;
    }

    public MP3Info(InputStream inputStream, long j) throws IOException, ID3v2Exception, MP3Exception {
        this(inputStream, j, Level.FINEST);
    }

    public MP3Info(InputStream inputStream, long j, Level level) throws IOException, ID3v2Exception, MP3Exception {
        this.brand = "MP3";
        MP3Input mP3Input = new MP3Input(inputStream);
        if (ID3v2Info.isID3v2StartPosition(mP3Input)) {
            ID3v2Info iD3v2Info = new ID3v2Info(mP3Input, level);
            this.album = iD3v2Info.getAlbum();
            this.albumArtist = iD3v2Info.getAlbumArtist();
            this.artist = iD3v2Info.getArtist();
            this.comment = iD3v2Info.getComment();
            this.cover = iD3v2Info.getCover();
            this.smallCover = iD3v2Info.getSmallCover();
            this.compilation = iD3v2Info.isCompilation();
            this.composer = iD3v2Info.getComposer();
            this.copyright = iD3v2Info.getCopyright();
            this.disc = iD3v2Info.getDisc();
            this.discs = iD3v2Info.getDiscs();
            this.duration = iD3v2Info.getDuration();
            this.genre = iD3v2Info.getGenre();
            this.grouping = iD3v2Info.getGrouping();
            this.lyrics = iD3v2Info.getLyrics();
            this.title = iD3v2Info.getTitle();
            this.track = iD3v2Info.getTrack();
            this.tracks = iD3v2Info.getTracks();
            this.year = iD3v2Info.getYear();
        }
        long j2 = this.duration;
        if (j2 <= 0 || j2 >= 3600000) {
            try {
                this.duration = calculateDuration(mP3Input, j, new StopReadCondition(this, j) {
                    final long stopPosition;
                    final long val$fileLength;

                    {
                        this.val$fileLength = j;
                        this.stopPosition = j - 128;
                    }

                    @Override
                    public boolean stopRead(MP3Input mP3Input2) throws IOException {
                        return mP3Input2.getPosition() == this.stopPosition && ID3v1Info.isID3v1StartPosition(mP3Input2);
                    }
                });
            } catch (MP3Exception e) {
                Logger logger = LOGGER;
                if (logger.isLoggable(level)) {
                    logger.log(level, "Could not determine MP3 duration", (Throwable) e);
                }
            }
        }
        if (this.title == null || this.album == null || this.artist == null) {
            long j3 = j - 128;
            if (mP3Input.getPosition() <= j3) {
                mP3Input.skipFully(j3 - mP3Input.getPosition());
                if (ID3v1Info.isID3v1StartPosition(inputStream)) {
                    ID3v1Info iD3v1Info = new ID3v1Info(inputStream);
                    if (this.album == null) {
                        this.album = iD3v1Info.getAlbum();
                    }
                    if (this.artist == null) {
                        this.artist = iD3v1Info.getArtist();
                    }
                    if (this.comment == null) {
                        this.comment = iD3v1Info.getComment();
                    }
                    if (this.genre == null) {
                        this.genre = iD3v1Info.getGenre();
                    }
                    if (this.title == null) {
                        this.title = iD3v1Info.getTitle();
                    }
                    if (this.track == 0) {
                        this.track = iD3v1Info.getTrack();
                    }
                    if (this.year == 0) {
                        this.year = iD3v1Info.getYear();
                    }
                }
            }
        }
    }

    MP3Frame readFirstFrame(MP3Input mP3Input, StopReadCondition stopReadCondition) throws IOException {
        MP3Frame.Header header;
        int read = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
        int i = 0;
        while (read != -1) {
            if (i == 255 && (read & 224) == 224) {
                mP3Input.mark(2);
                int read2 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                if (read2 == -1) {
                    break;
                }
                int read3 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                if (read3 == -1) {
                    break;
                }
                try {
                    header = new MP3Frame.Header(read, read2, read3);
                } catch (MP3Exception unused) {
                    header = null;
                }
                if (header != null) {
                    mP3Input.reset();
                    mP3Input.mark(header.getFrameSize() + 2);
                    int frameSize = header.getFrameSize();
                    byte[] bArr = new byte[frameSize];
                    bArr[0] = -1;
                    bArr[1] = (byte) read;
                    int i2 = frameSize - 2;
                    try {
                        mP3Input.readFully(bArr, 2, i2);
                        MP3Frame mP3Frame = new MP3Frame(header, bArr);
                        if (!mP3Frame.isChecksumError()) {
                            int read4 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                            int read5 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                            if (read4 != -1 && read5 != -1) {
                                if (read4 == 255 && (read5 & 254) == (read & 254)) {
                                    int read6 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                                    int read7 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                                    if (read6 != -1 && read7 != -1) {
                                        try {
                                            if (new MP3Frame.Header(read5, read6, read7).isCompatible(header)) {
                                                mP3Input.reset();
                                                mP3Input.skipFully(i2);
                                            }
                                        } catch (MP3Exception unused2) {
                                        }
                                    }
                                }
                            }
                            return mP3Frame;
                        }
                    } catch (EOFException unused3) {
                    }
                }
                mP3Input.reset();
            }
            i = read;
            read = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
        }
        return null;
    }

    MP3Frame readNextFrame(MP3Input mP3Input, StopReadCondition stopReadCondition, MP3Frame mP3Frame) throws IOException {
        MP3Frame.Header header;
        MP3Frame.Header header2 = mP3Frame.getHeader();
        mP3Input.mark(4);
        int read = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
        int read2 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
        if (read != -1 && read2 != -1) {
            if (read == 255 && (read2 & 224) == 224) {
                int read3 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                int read4 = stopReadCondition.stopRead(mP3Input) ? -1 : mP3Input.read();
                if (read3 != -1 && read4 != -1) {
                    try {
                        header = new MP3Frame.Header(read2, read3, read4);
                    } catch (MP3Exception unused) {
                        header = null;
                    }
                    if (header != null && header.isCompatible(header2)) {
                        int frameSize = header.getFrameSize();
                        byte[] bArr = new byte[frameSize];
                        bArr[0] = (byte) read;
                        bArr[1] = (byte) read2;
                        bArr[2] = (byte) read3;
                        bArr[3] = (byte) read4;
                        try {
                            mP3Input.readFully(bArr, 4, frameSize - 4);
                            return new MP3Frame(header, bArr);
                        } catch (EOFException unused2) {
                        }
                    }
                }
                return null;
            }
            mP3Input.reset();
        }
        return null;
    }

    long calculateDuration(MP3Input mP3Input, long j, StopReadCondition stopReadCondition) throws IOException, MP3Exception {
        int numberOfFrames;
        MP3Frame readFirstFrame = readFirstFrame(mP3Input, stopReadCondition);
        if (readFirstFrame != null) {
            if (readFirstFrame.getNumberOfFrames() > 0) {
                return readFirstFrame.getHeader().getTotalDuration(numberOfFrames * readFirstFrame.getSize());
            }
            long position = mP3Input.getPosition() - readFirstFrame.getSize();
            long size = readFirstFrame.getSize();
            int bitrate = readFirstFrame.getHeader().getBitrate();
            long j2 = bitrate;
            boolean z = false;
            int duration = 10000 / readFirstFrame.getHeader().getDuration();
            int i = 1;
            while (true) {
                if (i == duration && !z && j > 0) {
                    return readFirstFrame.getHeader().getTotalDuration(j - position);
                }
                readFirstFrame = readNextFrame(mP3Input, stopReadCondition, readFirstFrame);
                if (readFirstFrame != null) {
                    int bitrate2 = readFirstFrame.getHeader().getBitrate();
                    int i2 = i;
                    if (bitrate2 != bitrate) {
                        z = true;
                    }
                    j2 += bitrate2;
                    size += readFirstFrame.getSize();
                    i = i2 + 1;
                } else {
                    return (((size * 1000) * i) * 8) / j2;
                }
            }
        } else {
            throw new MP3Exception("No audio frame");
        }
    }
}
