package c8;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class le {
    public static n2.q0 a(File file, zi.y yVar, long j3, long j10, boolean z10, b7.d dVar) {
        MediaFormat mediaFormat;
        long j11;
        long j12;
        String str;
        MediaFormat mediaFormat2;
        boolean z11;
        zi.y yVar2 = yVar;
        long max = Math.max(0L, j3 * 1000);
        long max2 = Math.max(max, j10 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d2 = d(mediaExtractor, false);
            if (d >= 0 && (!z10 || d2 >= 0)) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
                if (z10) {
                    mediaFormat = mediaExtractor.getTrackFormat(d2);
                } else {
                    mediaFormat = null;
                }
                mediaExtractor.release();
                int i7 = dVar.f2950c;
                synchronized (yVar) {
                    yVar2.f61807s = i7;
                }
                if (mediaFormat != null) {
                    yVar2.n(mediaFormat, false);
                }
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(file.getAbsolutePath());
                    int d10 = d(mediaExtractor, true);
                    long j13 = Long.MAX_VALUE;
                    if (d10 >= 0) {
                        mediaExtractor.selectTrack(d10);
                        j11 = Long.MIN_VALUE;
                        while (true) {
                            if (mediaExtractor.getSampleTime() < 0) {
                                break;
                            }
                            long sampleTime = mediaExtractor.getSampleTime();
                            if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (sampleTime >= max2) {
                                break;
                            }
                            if (z11) {
                                if (sampleTime <= max) {
                                    j11 = sampleTime;
                                } else {
                                    j13 = sampleTime;
                                    break;
                                }
                            }
                            mediaExtractor.advance();
                        }
                    } else {
                        j11 = Long.MIN_VALUE;
                    }
                    mediaExtractor.release();
                    long[] jArr = {j11, j13};
                    long j14 = jArr[0];
                    long j15 = jArr[1];
                    if (j14 != Long.MIN_VALUE) {
                        if (j14 == max) {
                            yVar2.n(trackFormat, true);
                            b(file, yVar2, max, max, max2);
                            str = "copy";
                            j12 = 0;
                        } else {
                            long min = Math.min(j15, max2);
                            y7.f7 f7Var = new y7.f7(4);
                            j12 = 0;
                            me.c(file, j14, max, min, dVar.f2948a, dVar.f2949b, dVar.f2950c, f7Var);
                            if (((MediaFormat) f7Var.f60247c) != null && !((ArrayList) f7Var.f60245a).isEmpty()) {
                                boolean m10 = zi.y.m(trackFormat, (MediaFormat) f7Var.f60247c, "csd-0", "csd-1");
                                if (min >= max2) {
                                    if (m10) {
                                        mediaFormat2 = trackFormat;
                                    } else {
                                        mediaFormat2 = (MediaFormat) f7Var.f60247c;
                                    }
                                    yVar2.n(mediaFormat2, true);
                                    e(yVar2, f7Var, max);
                                    str = "reencode-range-in-gop";
                                    max = max;
                                } else if (m10) {
                                    yVar2.n(trackFormat, true);
                                    e(yVar2, f7Var, max);
                                    b(file, yVar2, j15, max, max2);
                                    max = max;
                                    str = "reencode-head";
                                } else {
                                    max = max;
                                    me.c(file, j14, max, max2, dVar.f2948a, dVar.f2949b, dVar.f2950c, new a8.va(yVar2, max, 11));
                                    str = "reencode-all";
                                }
                            } else {
                                throw new IOException("Re-encoded trim start produced no frames");
                            }
                        }
                        if (z10) {
                            mediaExtractor = new MediaExtractor();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
                            try {
                                mediaExtractor.setDataSource(file.getAbsolutePath());
                                int d11 = d(mediaExtractor, false);
                                if (d11 >= 0) {
                                    mediaExtractor.selectTrack(d11);
                                    mediaExtractor.seekTo(max, 2);
                                    while (mediaExtractor.getSampleTime() >= j12 && mediaExtractor.getSampleTime() < max) {
                                        mediaExtractor.advance();
                                    }
                                    while (mediaExtractor.getSampleTime() >= j12 && mediaExtractor.getSampleTime() < max2) {
                                        allocateDirect.clear();
                                        int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                                        if (readSampleData >= 0) {
                                            bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                            ByteBuffer byteBuffer = allocateDirect;
                                            yVar2.q(false, byteBuffer, bufferInfo, -max);
                                            mediaExtractor.advance();
                                            allocateDirect = byteBuffer;
                                            yVar2 = yVar;
                                        }
                                    }
                                } else {
                                    throw new IOException("Source track disappeared");
                                }
                            } finally {
                            }
                        }
                        long h = yVar.h();
                        ?? obj = new Object();
                        obj.f20843a = max / 1000;
                        obj.f20844b = h;
                        obj.f20845c = str;
                        return obj;
                    }
                    throw new IOException("Trim range has no video sync sample");
                } finally {
                }
            }
            throw new IOException("Source file has no required tracks");
        } finally {
        }
    }

    public static void b(File file, zi.y yVar, long j3, long j10, long j11) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        zi.y yVar2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            if (d >= 0) {
                mediaExtractor.selectTrack(d);
                mediaExtractor.seekTo(j3, 0);
                while (mediaExtractor.getSampleTime() >= 0) {
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (sampleTime < j11) {
                        if (sampleTime >= j3) {
                            allocateDirect.clear();
                            int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                            if (readSampleData < 0) {
                                break;
                            }
                            bufferInfo2.set(0, readSampleData, sampleTime, mediaExtractor.getSampleFlags());
                            byteBuffer = allocateDirect;
                            bufferInfo = bufferInfo2;
                            yVar2 = yVar;
                            yVar2.q(true, byteBuffer, bufferInfo, -j10);
                        } else {
                            byteBuffer = allocateDirect;
                            bufferInfo = bufferInfo2;
                            yVar2 = yVar;
                        }
                        mediaExtractor.advance();
                        yVar = yVar2;
                        allocateDirect = byteBuffer;
                        bufferInfo2 = bufferInfo;
                    }
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

    public static int d(MediaExtractor mediaExtractor, boolean z10) {
        String str;
        if (z10) {
            str = "video/";
        } else {
            str = "audio/";
        }
        for (int i7 = 0; i7 < mediaExtractor.getTrackCount(); i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i7;
            }
        }
        return -1;
    }

    public static void e(zi.y yVar, y7.f7 f7Var, long j3) {
        ArrayList arrayList = (ArrayList) f7Var.f60245a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            yVar.q(true, (ByteBuffer) arrayList.get(i7), (MediaCodec.BufferInfo) ((ArrayList) f7Var.f60246b).get(i7), -j3);
        }
    }
}
