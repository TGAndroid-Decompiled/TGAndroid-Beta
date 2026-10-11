package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class u {
    public final File f15139a;
    public final int f15140b;
    public final boolean f15141c;
    public final n d;
    public final ah.b f15142e;
    public MP4Builder f15145i;
    public MediaFormat f15146j;
    public MediaFormat f15147k;
    public long f15150n;
    public long f15151o;
    public long f15152p;
    public long f15154r;
    public ByteBuffer f15155s;
    public boolean f15157u;
    public boolean v;
    public boolean f15158w;
    public final ArrayList f15143f = new ArrayList();
    public final t f15144g = new t(33333);
    public final t h = new t(21333);
    public int f15148l = -1;
    public int f15149m = -1;
    public long f15153q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f15156t = new MediaCodec.BufferInfo();

    public u(File file, int i10, boolean z10, n nVar, ah.b bVar) {
        this.f15139a = file;
        this.f15140b = i10;
        this.f15141c = z10;
        this.d = nVar;
        this.f15142e = bVar;
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
        int i10;
        int i11;
        String str;
        n(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 == bufferInfo.offset) {
            i10 = m(byteBuffer, f7, i13);
            i11 = 0;
            while (f7 >= 0) {
                i11++;
                f7 = f(byteBuffer, m(byteBuffer, f7, i13) + f7, i13);
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        if (i11 > 0) {
            str = "annex-b";
        } else {
            str = "avcc";
        }
        sb2.append(str);
        sb2.append(", nalCount=");
        sb2.append(i11);
        sb2.append(", firstPrefix=");
        sb2.append(i10);
        sb2.append(", head=");
        int i14 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i13 - i14);
        for (int i15 = 0; i15 < min; i15++) {
            if (i15 > 0) {
                sb3.append(' ');
            }
            int i16 = byteBuffer.get(i14 + i15) & 255;
            if (i16 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i16));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i10, int i11) {
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

    public static boolean k(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a2 = a(byteBuffer);
                    int a10 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a2;
                    if (limit == byteBuffer2.limit() - a10) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(a2 + i10) == byteBuffer2.get(a10 + i10)) {
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

    public static int m(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 + 3 < i11 && byteBuffer.get(i10 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size;
        long j3 = i10 + i11;
        if (i10 >= 0 && i11 >= 0 && j3 <= byteBuffer.limit()) {
            return;
        }
        throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j3) {
        t tVar;
        long j10;
        long max;
        long max2;
        t tVar2 = this.h;
        t tVar3 = this.f15144g;
        if (z10) {
            tVar = tVar3;
        } else {
            tVar = tVar2;
        }
        long j11 = 0;
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f15153q != j3) {
                this.f15153q = j3;
                long j12 = tVar3.f15115c;
                if (j12 != Long.MIN_VALUE) {
                    j11 = Math.max(1L, tVar3.d) + j12;
                }
                long j13 = tVar2.f15115c;
                if (j13 == Long.MIN_VALUE) {
                    max2 = 0;
                } else {
                    max2 = Math.max(1L, tVar2.d) + j13;
                }
                this.f15154r = Math.max(j3, Math.max(j11, max2));
                j10 = Long.MIN_VALUE;
                tVar3.f15113a = Long.MIN_VALUE;
                tVar3.f15114b = Long.MIN_VALUE;
                tVar2.f15113a = Long.MIN_VALUE;
                tVar2.f15114b = Long.MIN_VALUE;
            } else {
                j10 = Long.MIN_VALUE;
            }
            if (tVar.f15113a == j10) {
                tVar.f15113a = bufferInfo.presentationTimeUs;
            }
            j11 = 0;
            max = this.f15154r + Math.max(0L, bufferInfo.presentationTimeUs - tVar.f15113a);
        }
        long j14 = max;
        long j15 = bufferInfo.presentationTimeUs;
        long j16 = tVar.f15114b;
        if (j16 != Long.MIN_VALUE) {
            long j17 = j15 - j16;
            if (j17 > j11 && j17 < 1000000) {
                tVar.d = j17;
            }
        }
        tVar.f15114b = j15;
        tVar.f15115c = Math.max(tVar.f15115c, j14);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j14, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f15145i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f15145i.finishMovie(file);
                n nVar = this.d;
                nVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e7) {
                throw new IOException("Unable to create preview MP4", e7);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f15158w) {
            return;
        }
        if (this.f15145i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f15145i.finishMovie();
                this.f15158w = true;
                j(this.f15139a.length());
                n nVar = this.d;
                nVar.b("MP4 finalized: file=" + this.f15139a.getName() + ", size=" + this.f15139a.length() + ", videoSamples=" + this.f15151o + ", audioSamples=" + this.f15152p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e7) {
                throw new IOException("Unable to finish MP4", e7);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void h() {
        ArrayList arrayList = this.f15143f;
        if (this.f15146j != null) {
            boolean z10 = this.f15141c;
            if (!z10 || this.f15147k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f15139a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f15140b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f15145i = createMovie;
                    this.f15148l = createMovie.addTrack(this.f15146j, false);
                    if (z10) {
                        this.f15149m = this.f15145i.addTrack(this.f15147k, true);
                    }
                    n nVar = this.d;
                    nVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        s sVar = (s) arrayList.get(i11);
                        p(sVar.f15105a, sVar.f15106b, sVar.f15107c);
                    }
                    arrayList.clear();
                } catch (Exception e7) {
                    throw new IOException("Unable to initialize MP4", e7);
                }
            }
        }
    }

    public final void i(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        int i10;
        int i11;
        n(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 != bufferInfo.offset) {
            int i14 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.f15155s;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                this.f15155s = ByteBuffer.allocateDirect(i14);
            }
            this.f15155s.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f15155s.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f15155s.flip();
                this.f15156t.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i15 = 0;
        int i16 = f7;
        int i17 = 0;
        while (i16 >= 0) {
            int m10 = m(byteBuffer, i16, i13) + i16;
            i16 = f(byteBuffer, m10, i13);
            if (i16 < 0) {
                i11 = i13;
            } else {
                i11 = i16;
            }
            if (i11 > m10) {
                i15++;
                i17 = ((i11 + 4) - m10) + i17;
            }
        }
        if (i15 != 0) {
            ByteBuffer byteBuffer3 = this.f15155s;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i17) {
                this.f15155s = ByteBuffer.allocateDirect(i17);
            }
            this.f15155s.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f7 >= 0) {
                try {
                    int m11 = f7 + m(byteBuffer, f7, i13);
                    int f10 = f(byteBuffer, m11, i13);
                    if (f10 < 0) {
                        i10 = i13;
                    } else {
                        i10 = f10;
                    }
                    if (i10 > m11) {
                        this.f15155s.putInt(i10 - m11);
                        byteBuffer.position(m11);
                        byteBuffer.limit(i10);
                        this.f15155s.put(byteBuffer);
                    }
                    f7 = f10;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f15155s.flip();
            this.f15156t.set(0, this.f15155s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void j(long j3) {
        if (j3 > this.f15150n) {
            this.f15150n = j3;
            if (this.v) {
                return;
            }
            ah.b bVar = this.f15142e;
            t0 t0Var = (t0) bVar.f539b;
            p0 p0Var = (p0) bVar.f540c;
            synchronized (t0Var.f15121g) {
                try {
                    long j10 = p0Var.f15072c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !p0Var.d) {
                        p0Var.f15072c = j3;
                        t0Var.f15124k.execute(new a3.g0(t0Var, p0Var, j10, j11, 3));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void l(MediaFormat mediaFormat, boolean z10) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f15158w) {
                return;
            }
            if (this.f15145i != null) {
                if (z10) {
                    mediaFormat2 = this.f15146j;
                } else {
                    mediaFormat2 = this.f15147k;
                }
                if ((z10 && !k(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f15141c && !k(mediaFormat2, mediaFormat, "csd-0"))) {
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
                this.f15146j = mediaFormat;
            } else if (this.f15141c) {
                this.f15147k = mediaFormat;
            }
            h();
        } finally {
        }
    }

    public final synchronized void o(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f15158w) {
                if (!z10) {
                    if (this.f15141c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j3);
                    if (this.f15145i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f15143f.add(new s(z10, allocateDirect, b10));
                        return;
                    }
                    p(z10, byteBuffer, b10);
                }
            }
        } finally {
        }
    }

    public final void p(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i10;
        n nVar = this.d;
        String str2 = null;
        if (z10) {
            try {
                if (!this.f15157u) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                i(byteBuffer, bufferInfo);
                byteBuffer2 = this.f15155s;
                bufferInfo2 = this.f15156t;
                if (!this.f15157u) {
                    this.f15157u = true;
                    nVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e7) {
                if (z10) {
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
                StringBuilder sb2 = new StringBuilder("MP4 sample write failed: track=");
                String str3 = "audio";
                if (!z10) {
                    str = "audio";
                } else {
                    str = "video";
                }
                nVar.a(a1.g.r(str, ", ", str2, sb2), e7);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str3 = "video";
                }
                throw new IOException(a1.g.r(str3, " MP4 sample: ", str2, sb3), e7);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f15145i;
        if (z10) {
            i10 = this.f15148l;
        } else {
            i10 = this.f15149m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.f15151o++;
        } else {
            this.f15152p++;
        }
        if (writeSampleData > 0) {
            j(writeSampleData);
        }
    }
}
