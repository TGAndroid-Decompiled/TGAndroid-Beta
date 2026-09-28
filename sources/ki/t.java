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
    public final File f13865a;
    public final int f13866b;
    public final boolean f13867c;
    public final m d;
    public final ah.b e;
    public MP4Builder f13870i;
    public MediaFormat f13871j;
    public MediaFormat f13872k;
    public long f13875n;
    public long f13876o;
    public long f13877p;
    public long f13879r;
    public ByteBuffer f13880s;
    public boolean f13882u;
    public boolean v;
    public final ArrayList f13868f = new ArrayList();
    public final s f13869g = new s(33333);
    public final s h = new s(21333);
    public int f13873l = -1;
    public int f13874m = -1;
    public long f13878q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f13881t = new MediaCodec.BufferInfo();

    public t(File file, int i10, boolean z10, m mVar, ah.b bVar) {
        this.f13865a = file;
        this.f13866b = i10;
        this.f13867c = z10;
        this.d = mVar;
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
        s sVar3 = this.f13869g;
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
            if (this.f13878q != j3) {
                this.f13878q = j3;
                long j13 = sVar3.f13842c;
                if (j13 != Long.MIN_VALUE) {
                    j12 = Math.max(1L, sVar3.d) + j13;
                }
                long j14 = sVar2.f13842c;
                if (j14 == Long.MIN_VALUE) {
                    max2 = 0;
                } else {
                    max2 = Math.max(1L, sVar2.d) + j14;
                }
                this.f13879r = Math.max(j3, Math.max(j12, max2));
                j10 = Long.MIN_VALUE;
                sVar3.f13840a = Long.MIN_VALUE;
                sVar3.f13841b = Long.MIN_VALUE;
                sVar2.f13840a = Long.MIN_VALUE;
                sVar2.f13841b = Long.MIN_VALUE;
            } else {
                j10 = Long.MIN_VALUE;
            }
            if (sVar.f13840a == j10) {
                sVar.f13840a = bufferInfo.presentationTimeUs;
            }
            j11 = 0;
            max = this.f13879r + Math.max(0L, bufferInfo.presentationTimeUs - sVar.f13840a);
        }
        long j15 = max;
        long j16 = bufferInfo.presentationTimeUs;
        long j17 = sVar.f13841b;
        if (j17 != Long.MIN_VALUE) {
            long j18 = j16 - j17;
            if (j18 > j11 && j18 < 1000000) {
                sVar.d = j18;
            }
        }
        sVar.f13841b = j16;
        sVar.f13842c = Math.max(sVar.f13842c, j15);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j15, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void d(File file) {
        if (this.f13870i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13870i.finishMovie(file);
                m mVar = this.d;
                mVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
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
        if (this.f13870i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13870i.finishMovie();
                this.v = true;
                i(this.f13865a.length());
                m mVar = this.d;
                mVar.b("MP4 finalized: file=" + this.f13865a.getName() + ", size=" + this.f13865a.length() + ", videoSamples=" + this.f13876o + ", audioSamples=" + this.f13877p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw a("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void g() {
        ArrayList arrayList = this.f13868f;
        if (this.f13871j != null) {
            boolean z10 = this.f13867c;
            if (!z10 || this.f13872k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f13865a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f13866b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f13870i = createMovie;
                    this.f13873l = createMovie.addTrack(this.f13871j, false);
                    if (z10) {
                        this.f13874m = this.f13870i.addTrack(this.f13872k, true);
                    }
                    m mVar = this.d;
                    mVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        r rVar = (r) arrayList.get(i11);
                        n(rVar.f13833a, rVar.f13834b, rVar.f13835c);
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
                ByteBuffer byteBuffer2 = this.f13880s;
                if (byteBuffer2 == null || byteBuffer2.capacity() < i16) {
                    this.f13880s = ByteBuffer.allocateDirect(i16);
                }
                this.f13880s.clear();
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
                            this.f13880s.putInt(i10 - l11);
                            byteBuffer.position(l11);
                            byteBuffer.limit(i10);
                            this.f13880s.put(byteBuffer);
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
                this.f13880s.flip();
                this.f13881t.set(0, this.f13880s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                return 2;
            }
        }
        return 0;
    }

    public final void i(long j3) {
        if (j3 > this.f13875n) {
            this.f13875n = j3;
            if (this.f13882u) {
                return;
            }
            ah.b bVar = this.e;
            s0 s0Var = (s0) bVar.f420b;
            o0 o0Var = (o0) bVar.f421c;
            synchronized (s0Var.f13847g) {
                try {
                    long j10 = o0Var.f13802c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !o0Var.d) {
                        o0Var.f13802c = j3;
                        s0Var.f13850k.execute(new a3.g0(s0Var, o0Var, j10, j11, 3));
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
            if (this.f13870i != null) {
                if (z10) {
                    mediaFormat2 = this.f13871j;
                } else {
                    mediaFormat2 = this.f13872k;
                }
                if ((z10 && !j(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f13867c && !j(mediaFormat2, mediaFormat, "csd-0"))) {
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
                this.f13871j = mediaFormat;
            } else if (this.f13867c) {
                this.f13872k = mediaFormat;
            }
            g();
        } finally {
        }
    }

    public final synchronized void m(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.v) {
                if (!z10) {
                    if (this.f13867c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo c10 = c(z10, bufferInfo, j3);
                    if (this.f13870i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        c10.offset = 0;
                        this.f13868f.add(new r(z10, allocateDirect, c10));
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
