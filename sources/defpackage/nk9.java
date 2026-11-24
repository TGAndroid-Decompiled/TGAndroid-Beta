package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class nk9 {
    public final File a;
    public final short b;
    public final boolean c;
    public final ek9 d;
    public final kq8 e;
    public MP4Builder i;
    public MediaFormat j;
    public MediaFormat k;
    public long n;
    public long o;
    public long p;
    public long r;
    public int s;
    public ByteBuffer t;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ArrayList f = new ArrayList();
    public final mk9 g = new mk9(33333);
    public final mk9 h = new mk9(21333);
    public int l = -1;
    public int m = -1;
    public long q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo u = new MediaCodec.BufferInfo();

    public nk9(File file, int i, boolean z, ek9 ek9Var, kq8 kq8Var) {
        this.a = file;
        this.b = i;
        this.c = z;
        this.d = ek9Var;
        this.e = kq8Var;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        if (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
            return 3;
        }
        return 0;
    }

    public static String d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return "offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", ptsUs=" + bufferInfo.presentationTimeUs + ", flags=" + bufferInfo.flags + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity();
    }

    public static String e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i;
        int i2;
        String str;
        p(byteBuffer, bufferInfo);
        int i3 = bufferInfo.offset;
        int i4 = bufferInfo.size + i3;
        int f = f(byteBuffer, i3, i4);
        if (f == bufferInfo.offset) {
            i = o(byteBuffer, f, i4);
            i2 = 0;
            while (f >= 0) {
                i2++;
                f = f(byteBuffer, o(byteBuffer, f, i4) + f, i4);
            }
        } else {
            i = 0;
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder(d(byteBuffer, bufferInfo));
        sb.append(", format=");
        if (i2 > 0) {
            str = "annex-b";
        } else {
            str = "avcc";
        }
        sb.append(str);
        sb.append(", nalCount=");
        sb.append(i2);
        sb.append(", firstPrefix=");
        sb.append(i);
        sb.append(", head=");
        int i5 = bufferInfo.offset;
        StringBuilder sb2 = new StringBuilder();
        int min = Math.min(16, i4 - i5);
        for (int i6 = 0; i6 < min; i6++) {
            if (i6 > 0) {
                sb2.append(' ');
            }
            int i7 = byteBuffer.get(i5 + i6) & 255;
            if (i7 < 16) {
                sb2.append('0');
            }
            sb2.append(Integer.toHexString(i7));
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        while (true) {
            int i4 = i + 2;
            if (i4 < i2) {
                if (byteBuffer.get(i) != 0 || byteBuffer.get(i + 1) != 0 || (byteBuffer.get(i4) != 1 && ((i3 = i + 3) >= i2 || byteBuffer.get(i4) != 0 || byteBuffer.get(i3) != 1))) {
                    i++;
                }
            } else {
                return -1;
            }
        }
        return i;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a = a(byteBuffer);
                    int a2 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a;
                    if (limit == byteBuffer2.limit() - a2) {
                        for (int i = 0; i < limit; i++) {
                            if (byteBuffer.get(a + i) == byteBuffer2.get(a2 + i)) {
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

    public static int o(ByteBuffer byteBuffer, int i, int i2) {
        if (i + 3 < i2 && byteBuffer.get(i + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i = bufferInfo.offset;
        int i2 = bufferInfo.size;
        long j = i + i2;
        if (i >= 0 && i2 >= 0 && j <= byteBuffer.limit()) {
            return;
        }
        int i3 = bufferInfo.offset;
        int i4 = bufferInfo.size;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int capacity = byteBuffer.capacity();
        throw new IOException("Invalid codec buffer range: offset=" + i3 + ", size=" + i4 + ", position=" + position + ", limit=" + limit + ", capacity=" + capacity);
    }

    public final MediaCodec.BufferInfo b(boolean z, MediaCodec.BufferInfo bufferInfo, long j) {
        mk9 mk9Var;
        long max;
        mk9 mk9Var2 = this.h;
        mk9 mk9Var3 = this.g;
        if (z) {
            mk9Var = mk9Var3;
        } else {
            mk9Var = mk9Var2;
        }
        if (j < 0) {
            max = Math.max(0L, j + bufferInfo.presentationTimeUs);
        } else {
            if (this.q != j) {
                this.q = j;
                this.r = Math.max(j, Math.max(mk9Var3.a(), mk9Var2.a()));
                mk9Var3.a = Long.MIN_VALUE;
                mk9Var3.b = Long.MIN_VALUE;
                mk9Var2.a = Long.MIN_VALUE;
                mk9Var2.b = Long.MIN_VALUE;
            }
            long j2 = mk9Var.a;
            if (j2 == Long.MIN_VALUE) {
                j2 = bufferInfo.presentationTimeUs;
                mk9Var.a = j2;
            }
            max = Math.max(0L, bufferInfo.presentationTimeUs - j2) + this.r;
        }
        long j3 = bufferInfo.presentationTimeUs;
        long j4 = mk9Var.b;
        if (j4 != Long.MIN_VALUE) {
            long j5 = j3 - j4;
            if (j5 > 0 && j5 < 1000000) {
                mk9Var.d = j5;
            }
        }
        mk9Var.b = j3;
        mk9Var.c = Math.max(mk9Var.c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.i.finishMovie(file);
                ek9 ek9Var = this.d;
                ek9Var.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e) {
                throw new IOException("Unable to create preview MP4", e);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.x) {
            return;
        }
        if (this.i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.i.finishMovie();
                this.x = true;
                l(this.a.length());
                ek9 ek9Var = this.d;
                ek9Var.b("MP4 finalized: file=" + this.a.getName() + ", size=" + this.a.length() + ", videoSamples=" + this.o + ", audioSamples=" + this.p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw new IOException("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final synchronized long h() {
        long a;
        a = this.g.a();
        if (this.c) {
            a = Math.max(a, this.h.a());
        }
        return a / 1000;
    }

    public final synchronized int i() {
        return this.s;
    }

    public final void j() {
        ArrayList arrayList = this.f;
        if (this.j != null) {
            boolean z = this.c;
            if (!z || this.k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.a;
                mp4Movie.setCacheFile(file);
                short s = this.b;
                mp4Movie.setSize(s, s);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.i = createMovie;
                    this.l = createMovie.addTrack(this.j, false);
                    if (z) {
                        this.m = this.i.addTrack(this.k, true);
                    }
                    ek9 ek9Var = this.d;
                    ek9Var.b("MP4 initialized: file=" + file.getName() + ", output=" + ((int) s) + "x" + ((int) s) + ", includeAudio=" + z + ", pendingSamples=" + arrayList.size());
                    for (int i = 0; i < arrayList.size(); i++) {
                        lk9 lk9Var = (lk9) arrayList.get(i);
                        r(lk9Var.a, lk9Var.b, lk9Var.c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw new IOException("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        int i;
        int i2;
        p(byteBuffer, bufferInfo);
        int i3 = bufferInfo.offset;
        int i4 = bufferInfo.size + i3;
        int f = f(byteBuffer, i3, i4);
        int i5 = bufferInfo.offset;
        MediaCodec.BufferInfo bufferInfo2 = this.u;
        if (f != i5) {
            int i6 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i6) {
                this.t = ByteBuffer.allocateDirect(i6);
            }
            this.t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.t.flip();
                bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i7 = 0;
        int i8 = f;
        int i9 = 0;
        while (i8 >= 0) {
            int o = o(byteBuffer, i8, i4) + i8;
            i8 = f(byteBuffer, o, i4);
            if (i8 < 0) {
                i2 = i4;
            } else {
                i2 = i8;
            }
            if (i2 > o) {
                i7++;
                i9 = ((i2 + 4) - o) + i9;
            }
        }
        if (i7 != 0) {
            ByteBuffer byteBuffer3 = this.t;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i9) {
                this.t = ByteBuffer.allocateDirect(i9);
            }
            this.t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f >= 0) {
                try {
                    int o2 = f + o(byteBuffer, f, i4);
                    int f2 = f(byteBuffer, o2, i4);
                    if (f2 < 0) {
                        i = i4;
                    } else {
                        i = f2;
                    }
                    if (i > o2) {
                        this.t.putInt(i - o2);
                        byteBuffer.position(o2);
                        byteBuffer.limit(i);
                        this.t.put(byteBuffer);
                        byteBuffer.limit(limit);
                    }
                    f = f2;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.t.flip();
            bufferInfo2.set(0, this.t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        k93.f("Annex-B video sample contains no NAL units");
    }

    public final void l(long j) {
        if (j > this.n) {
            this.n = j;
            if (this.w) {
                return;
            }
            kq8 kq8Var = this.e;
            ul9 ul9Var = (ul9) kq8Var.b;
            ql9 ql9Var = (ql9) kq8Var.c;
            synchronized (ul9Var.g) {
                long j2 = ql9Var.c;
                long j3 = j - j2;
                if (j3 > 0 && !ql9Var.d) {
                    ql9Var.c = j;
                    ul9Var.k.execute(new n30(ul9Var, ql9Var, j2, j3, (byte) 13));
                }
            }
        }
    }

    public final synchronized void n(android.media.MediaFormat r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk9.n(android.media.MediaFormat, boolean):void");
    }

    public final synchronized void q(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j) {
        if (!this.x && ((z || this.c) && bufferInfo.size > 0)) {
            MediaCodec.BufferInfo b = b(z, bufferInfo, j);
            if (this.i == null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                allocateDirect.put(byteBuffer).flip();
                b.offset = 0;
                this.f.add(new lk9(z, allocateDirect, b));
                return;
            }
            r(z, byteBuffer, b);
        }
    }

    public final void r(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i;
        ek9 ek9Var = this.d;
        String str2 = null;
        if (z) {
            try {
                if (!this.v) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.t;
                bufferInfo2 = this.u;
                if (!this.v) {
                    this.v = true;
                    ek9Var.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e) {
                if (z) {
                    if (str2 == null) {
                        try {
                            d = e(byteBuffer, bufferInfo);
                        } catch (Exception unused) {
                            d = d(byteBuffer, bufferInfo);
                        }
                        str2 = d;
                    }
                } else {
                    str2 = d(byteBuffer, bufferInfo);
                }
                StringBuilder sb = new StringBuilder("MP4 sample write failed: track=");
                String str3 = "audio";
                if (!z) {
                    str = "audio";
                } else {
                    str = "video";
                }
                ek9Var.a(ls6.o(str, ", ", str2, sb), e);
                StringBuilder sb2 = new StringBuilder("Unable to write ");
                if (z) {
                    str3 = "video";
                }
                throw new IOException(ls6.o(str3, " MP4 sample: ", str2, sb2), e);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.i;
        if (z) {
            i = this.l;
        } else {
            i = this.m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i, byteBuffer2, bufferInfo2, false);
        if (z) {
            this.o++;
        } else {
            this.p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
