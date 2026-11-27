package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class uxe {
    public static so9 a(File file, bo9 bo9Var, long j, long j2, boolean z, ro9 ro9Var) {
        MediaFormat mediaFormat;
        long j3;
        long j4;
        String str;
        String str2;
        MediaFormat mediaFormat2;
        boolean z2;
        bo9 bo9Var2 = bo9Var;
        long max = Math.max(0L, j * 1000);
        long max2 = Math.max(max, j2 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d2 = d(mediaExtractor, false);
            if (d >= 0 && (!z || d2 >= 0)) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
                if (z) {
                    mediaFormat = mediaExtractor.getTrackFormat(d2);
                } else {
                    mediaFormat = null;
                }
                mediaExtractor.release();
                int i = ro9Var.c;
                synchronized (bo9Var) {
                    bo9Var2.s = i;
                }
                if (mediaFormat != null) {
                    bo9Var2.n(mediaFormat, false);
                }
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(file.getAbsolutePath());
                    int d3 = d(mediaExtractor, true);
                    long j5 = Long.MAX_VALUE;
                    if (d3 >= 0) {
                        mediaExtractor.selectTrack(d3);
                        j3 = Long.MIN_VALUE;
                        while (true) {
                            if (mediaExtractor.getSampleTime() < 0) {
                                break;
                            }
                            long sampleTime = mediaExtractor.getSampleTime();
                            if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (sampleTime >= max2) {
                                break;
                            }
                            if (z2) {
                                if (sampleTime <= max) {
                                    j3 = sampleTime;
                                } else {
                                    j5 = sampleTime;
                                    break;
                                }
                            }
                            mediaExtractor.advance();
                        }
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    mediaExtractor.release();
                    long[] jArr = {j3, j5};
                    long j6 = jArr[0];
                    long j7 = jArr[1];
                    if (j6 != Long.MIN_VALUE) {
                        if (j6 == max) {
                            bo9Var2.n(trackFormat, true);
                            b(file, bo9Var2, max, max, max2);
                            str2 = "copy";
                            j4 = 0;
                        } else {
                            long min = Math.min(j7, max2);
                            ko9 ko9Var = new ko9((byte) 1);
                            j4 = 0;
                            xxe.c(file, j6, max, min, ro9Var.a, ro9Var.b, ro9Var.c, ko9Var);
                            if (((MediaFormat) ko9Var.d) != null && !((ArrayList) ko9Var.b).isEmpty()) {
                                boolean m = bo9.m(trackFormat, (MediaFormat) ko9Var.d, "csd-0", "csd-1");
                                if (min >= max2) {
                                    if (m) {
                                        mediaFormat2 = trackFormat;
                                    } else {
                                        mediaFormat2 = (MediaFormat) ko9Var.d;
                                    }
                                    bo9Var2.n(mediaFormat2, true);
                                    e(bo9Var2, ko9Var, max);
                                    str2 = "reencode-range-in-gop";
                                    max = max;
                                } else {
                                    if (m) {
                                        bo9Var2.n(trackFormat, true);
                                        e(bo9Var2, ko9Var, max);
                                        b(file, bo9Var2, j7, max, max2);
                                        max = max;
                                        str = "reencode-head";
                                    } else {
                                        max = max;
                                        xxe.c(file, j6, max, max2, ro9Var.a, ro9Var.b, ro9Var.c, new zg2(bo9Var2, max, (byte) 6));
                                        str = "reencode-all";
                                    }
                                    str2 = str;
                                }
                            } else {
                                su3.e("Re-encoded trim start produced no frames");
                                return null;
                            }
                        }
                        if (z) {
                            mediaExtractor = new MediaExtractor();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
                            try {
                                mediaExtractor.setDataSource(file.getAbsolutePath());
                                int d4 = d(mediaExtractor, false);
                                if (d4 >= 0) {
                                    mediaExtractor.selectTrack(d4);
                                    mediaExtractor.seekTo(max, 2);
                                    while (mediaExtractor.getSampleTime() >= j4 && mediaExtractor.getSampleTime() < max) {
                                        mediaExtractor.advance();
                                    }
                                    while (mediaExtractor.getSampleTime() >= j4 && mediaExtractor.getSampleTime() < max2) {
                                        allocateDirect.clear();
                                        int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                                        if (readSampleData < 0) {
                                            break;
                                        }
                                        bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                        bo9Var2.q(false, allocateDirect, bufferInfo, -max);
                                        mediaExtractor.advance();
                                        bo9Var2 = bo9Var;
                                    }
                                } else {
                                    throw new IOException("Source track disappeared");
                                }
                            } finally {
                            }
                        }
                        return new so9(max / 1000, bo9Var.h(), str2);
                    }
                    su3.e("Trim range has no video sync sample");
                    return null;
                } finally {
                }
            }
            throw new IOException("Source file has no required tracks");
        } finally {
        }
    }

    public static void b(File file, bo9 bo9Var, long j, long j2, long j3) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        bo9 bo9Var2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            if (d >= 0) {
                mediaExtractor.selectTrack(d);
                mediaExtractor.seekTo(j, 0);
                while (mediaExtractor.getSampleTime() >= 0) {
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (sampleTime >= j3) {
                        break;
                    }
                    if (sampleTime >= j) {
                        allocateDirect.clear();
                        int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                        if (readSampleData < 0) {
                            break;
                        }
                        bufferInfo2.set(0, readSampleData, sampleTime, mediaExtractor.getSampleFlags());
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        bo9Var2 = bo9Var;
                        bo9Var2.q(true, byteBuffer, bufferInfo, -j2);
                    } else {
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        bo9Var2 = bo9Var;
                    }
                    mediaExtractor.advance();
                    bo9Var = bo9Var2;
                    allocateDirect = byteBuffer;
                    bufferInfo2 = bufferInfo;
                }
                return;
            }
            throw new IOException("Source track disappeared");
        } finally {
            mediaExtractor.release();
        }
    }

    public static void c(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0L);
            randomAccessFile.close();
        } catch (IOException unused) {
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public static int d(MediaExtractor mediaExtractor, boolean z) {
        String str;
        if (z) {
            str = "video/";
        } else {
            str = "audio/";
        }
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i;
            }
        }
        return -1;
    }

    public static void e(bo9 bo9Var, ko9 ko9Var, long j) {
        ArrayList arrayList = (ArrayList) ko9Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            bo9Var.q(true, (ByteBuffer) arrayList.get(i), (MediaCodec.BufferInfo) ((ArrayList) ko9Var.c).get(i), -j);
        }
    }
}
