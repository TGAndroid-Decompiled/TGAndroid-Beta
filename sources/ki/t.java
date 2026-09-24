package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class t {
    public final File f13857a;
    public final int f13858b;
    public final boolean f13859c;
    public final l d;
    public final ah.b e;
    public MP4Builder f13862i;
    public MediaFormat f13863j;
    public MediaFormat f13864k;
    public long f13867n;
    public long f13868o;
    public long f13869p;
    public long f13871r;
    public ByteBuffer f13872s;
    public boolean f13874u;
    public boolean v;
    public final ArrayList f13860f = new ArrayList();
    public final s f13861g = new s(33333);
    public final s h = new s(21333);
    public int f13865l = -1;
    public int f13866m = -1;
    public long f13870q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f13873t = new MediaCodec.BufferInfo();

    public t(File file, int i10, boolean z10, l lVar, ah.b bVar) {
        this.f13857a = file;
        this.f13858b = i10;
        this.f13859c = z10;
        this.d = lVar;
        this.e = bVar;
    }

    public static IOException a(String str, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        return new IOException(str, exc);
    }

    public static int b(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        if (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
            return 3;
        }
        return 0;
    }

    public static int e(ByteBuffer byteBuffer, int i10, int i11) {
        int i12;
        while (true) {
            int i13 = i10 + 2;
            if (i13 < i11) {
                if (byteBuffer.get(i10) != 0 || byteBuffer.get(i10 + 1) != 0 || (byteBuffer.get(i13) != 1 && ((i12 = i10 + 3) >= i11 || byteBuffer.get(i13) != 0 || byteBuffer.get(i12) != 1))) {
                    i10++;
                }
            } else {
                return -1;
            }
        }
        return i10;
    }

    public static boolean j(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int b10 = b(byteBuffer);
                    int b11 = b(byteBuffer2);
                    int limit = byteBuffer.limit() - b10;
                    if (limit == byteBuffer2.limit() - b11) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(b10 + i10) == byteBuffer2.get(b11 + i10)) {
                            }
                        }
                        continue;
                    }
                } else if (byteBuffer == byteBuffer2) {
                }
            }
            return true;
        }
        return false;
    }

    public static int l(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 + 3 < i11 && byteBuffer.get(i10 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public final MediaCodec.BufferInfo c(boolean z10, MediaCodec.BufferInfo bufferInfo, long j3) {
        s sVar;
        long j10;
        long j11;
        long max;
        long max2;
        s sVar2 = this.h;
        s sVar3 = this.f13861g;
        if (z10) {
            sVar = sVar3;
        } else {
            sVar = sVar2;
        }
        long j12 = 0;
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
            j11 = 0;
        } else {
            if (this.f13870q != j3) {
                this.f13870q = j3;
                long j13 = sVar3.f13856c;
                if (j13 != Long.MIN_VALUE) {
                    j12 = Math.max(1L, sVar3.d) + j13;
                }
                long j14 = sVar2.f13856c;
                if (j14 == Long.MIN_VALUE) {
                    max2 = 0;
                } else {
                    max2 = Math.max(1L, sVar2.d) + j14;
                }
                this.f13871r = Math.max(j3, Math.max(j12, max2));
                j10 = Long.MIN_VALUE;
                sVar3.f13854a = Long.MIN_VALUE;
                sVar3.f13855b = Long.MIN_VALUE;
                sVar2.f13854a = Long.MIN_VALUE;
                sVar2.f13855b = Long.MIN_VALUE;
            } else {
                j10 = Long.MIN_VALUE;
            }
            if (sVar.f13854a == j10) {
                sVar.f13854a = bufferInfo.presentationTimeUs;
            }
            j11 = 0;
            max = this.f13871r + Math.max(0L, bufferInfo.presentationTimeUs - sVar.f13854a);
        }
        long j15 = max;
        long j16 = bufferInfo.presentationTimeUs;
        long j17 = sVar.f13855b;
        if (j17 != Long.MIN_VALUE) {
            long j18 = j16 - j17;
            if (j18 > j11 && j18 < 1000000) {
                sVar.d = j18;
            }
        }
        sVar.f13855b = j16;
        sVar.f13856c = Math.max(sVar.f13856c, j15);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j15, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void d(File file) {
        if (this.f13862i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13862i.finishMovie(file);
                l lVar = this.d;
                lVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e) {
                throw a("Unable to create preview MP4", e);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void f() {
        if (this.v) {
            return;
        }
        if (this.f13862i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13862i.finishMovie();
                this.v = true;
                i(this.f13857a.length());
                l lVar = this.d;
                lVar.b("MP4 finalized: file=" + this.f13857a.getName() + ", size=" + this.f13857a.length() + ", videoSamples=" + this.f13868o + ", audioSamples=" + this.f13869p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw a("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void g() {
        ArrayList arrayList = this.f13860f;
        if (this.f13863j != null) {
            boolean z10 = this.f13859c;
            if (!z10 || this.f13864k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f13857a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f13858b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f13862i = createMovie;
                    this.f13865l = createMovie.addTrack(this.f13863j, false);
                    if (z10) {
                        this.f13866m = this.f13862i.addTrack(this.f13864k, true);
                    }
                    l lVar = this.d;
                    lVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        r rVar = (r) arrayList.get(i11);
                        n(rVar.f13829a, rVar.f13830b, rVar.f13831c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw a("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final int h(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        int i11;
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int e = e(byteBuffer, i12, i13);
        if (e == bufferInfo.offset) {
            int l4 = l(byteBuffer, e, i13);
            int e7 = e(byteBuffer, e + l4, i13);
            if (l4 == 4 && e7 < 0) {
                return 1;
            }
            int i14 = e;
            int i15 = 0;
            int i16 = 0;
            while (i14 >= 0) {
                int l10 = l(byteBuffer, i14, i13) + i14;
                i14 = e(byteBuffer, l10, i13);
                if (i14 < 0) {
                    i11 = i13;
                } else {
                    i11 = i14;
                }
                if (i11 > l10) {
                    i15++;
                    i16 += (i11 + 4) - l10;
                }
            }
            if (i15 != 0) {
                ByteBuffer byteBuffer2 = this.f13872s;
                if (byteBuffer2 == null || byteBuffer2.capacity() < i16) {
                    this.f13872s = ByteBuffer.allocateDirect(i16);
                }
                this.f13872s.clear();
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                while (e >= 0) {
                    try {
                        int l11 = e + l(byteBuffer, e, i13);
                        int e10 = e(byteBuffer, l11, i13);
                        if (e10 < 0) {
                            i10 = i13;
                        } else {
                            i10 = e10;
                        }
                        if (i10 > l11) {
                            this.f13872s.putInt(i10 - l11);
                            byteBuffer.position(l11);
                            byteBuffer.limit(i10);
                            this.f13872s.put(byteBuffer);
                        }
                        e = e10;
                    } catch (Throwable th2) {
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        throw th2;
                    }
                }
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f13872s.flip();
                this.f13873t.set(0, this.f13872s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                return 2;
            }
        }
        return 0;
    }

    public final void i(long j3) {
        if (j3 > this.f13867n) {
            this.f13867n = j3;
            if (this.f13874u) {
                return;
            }
            ah.b bVar = this.e;
            r0 r0Var = (r0) bVar.f420b;
            n0 n0Var = (n0) bVar.f421c;
            synchronized (r0Var.f13835f) {
                try {
                    long j10 = n0Var.f13797c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !n0Var.d) {
                        n0Var.f13797c = j3;
                        r0Var.f13838j.execute(new a3.g0(r0Var, n0Var, j10, j11, 3));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void k(MediaFormat mediaFormat, boolean z10) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.v) {
                return;
            }
            if (this.f13862i != null) {
                if (z10) {
                    mediaFormat2 = this.f13863j;
                } else {
                    mediaFormat2 = this.f13864k;
                }
                if ((z10 && !j(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f13859c && !j(mediaFormat2, mediaFormat, "csd-0"))) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z10) {
                        str = "Video";
                    } else {
                        str = "Audio";
                    }
                    sb2.append(str);
                    sb2.append(" codec configuration changed between segments");
                    throw new IOException(sb2.toString());
                }
                return;
            }
            if (z10) {
                this.f13863j = mediaFormat;
            } else if (this.f13859c) {
                this.f13864k = mediaFormat;
            }
            g();
        } finally {
        }
    }

    public final synchronized void m(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.v) {
                if (!z10) {
                    if (this.f13859c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo c10 = c(z10, bufferInfo, j3);
                    if (this.f13862i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        c10.offset = 0;
                        this.f13860f.add(new r(z10, allocateDirect, c10));
                        return;
                    }
                    n(z10, byteBuffer, c10);
                }
            }
        } finally {
        }
    }

    public final void n(boolean r5, java.nio.ByteBuffer r6, android.media.MediaCodec.BufferInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: ki.t.n(boolean, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
    }
}
