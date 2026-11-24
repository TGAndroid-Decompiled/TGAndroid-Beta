package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class cte {
    public static defpackage.dl9 a(java.io.File r28, defpackage.nk9 r29, long r30, long r32, boolean r34, defpackage.cl9 r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cte.a(java.io.File, nk9, long, long, boolean, cl9):dl9");
    }

    public static void b(File file, nk9 nk9Var, long j, long j2, long j3) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        nk9 nk9Var2;
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
                        nk9Var2 = nk9Var;
                        nk9Var2.q(true, byteBuffer, bufferInfo, -j2);
                    } else {
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        nk9Var2 = nk9Var;
                    }
                    mediaExtractor.advance();
                    nk9Var = nk9Var2;
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

    public static void e(nk9 nk9Var, vk9 vk9Var, long j) {
        ArrayList arrayList = (ArrayList) vk9Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            nk9Var.q(true, (ByteBuffer) arrayList.get(i), (MediaCodec.BufferInfo) ((ArrayList) vk9Var.c).get(i), -j);
        }
    }
}
