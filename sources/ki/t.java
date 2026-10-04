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
    public final File f15067a;
    public final int f15068b;
    public final boolean f15069c;
    public final m d;
    public final ah.b f15070e;
    public MP4Builder f15073i;
    public MediaFormat f15074j;
    public MediaFormat f15075k;
    public long f15078n;
    public long f15079o;
    public long f15080p;
    public long f15082r;
    public ByteBuffer f15083s;
    public boolean f15085u;
    public boolean v;
    public boolean f15086w;
    public final ArrayList f15071f = new ArrayList();
    public final s f15072g = new s(33333);
    public final s h = new s(21333);
    public int f15076l = -1;
    public int f15077m = -1;
    public long f15081q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f15084t = new MediaCodec.BufferInfo();

    public t(File file, int i10, boolean z10, m mVar, ah.b bVar) {
        this.f15067a = file;
        this.f15068b = i10;
        this.f15069c = z10;
        this.d = mVar;
        this.f15070e = bVar;
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
        s sVar;
        long j10;
        long j11;
        long max;
        long max2;
        s sVar2 = this.h;
        s sVar3 = this.f15072g;
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
            if (this.f15081q != j3) {
                this.f15081q = j3;
                long j13 = sVar3.f15043c;
                if (j13 != Long.MIN_VALUE) {
                    j12 = Math.max(1L, sVar3.d) + j13;
                }
                long j14 = sVar2.f15043c;
                if (j14 == Long.MIN_VALUE) {
                    max2 = 0;
                } else {
                    max2 = Math.max(1L, sVar2.d) + j14;
                }
                this.f15082r = Math.max(j3, Math.max(j12, max2));
                j10 = Long.MIN_VALUE;
                sVar3.f15041a = Long.MIN_VALUE;
                sVar3.f15042b = Long.MIN_VALUE;
                sVar2.f15041a = Long.MIN_VALUE;
                sVar2.f15042b = Long.MIN_VALUE;
            } else {
                j10 = Long.MIN_VALUE;
            }
            if (sVar.f15041a == j10) {
                sVar.f15041a = bufferInfo.presentationTimeUs;
            }
            j11 = 0;
            max = this.f15082r + Math.max(0L, bufferInfo.presentationTimeUs - sVar.f15041a);
        }
        long j15 = max;
        long j16 = bufferInfo.presentationTimeUs;
        long j17 = sVar.f15042b;
        if (j17 != Long.MIN_VALUE) {
            long j18 = j16 - j17;
            if (j18 > j11 && j18 < 1000000) {
                sVar.d = j18;
            }
        }
        sVar.f15042b = j16;
        sVar.f15043c = Math.max(sVar.f15043c, j15);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j15, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f15073i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f15073i.finishMovie(file);
                m mVar = this.d;
                mVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e7) {
                throw new IOException("Unable to create preview MP4", e7);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f15086w) {
            return;
        }
        if (this.f15073i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f15073i.finishMovie();
                this.f15086w = true;
                j(this.f15067a.length());
                m mVar = this.d;
                mVar.b("MP4 finalized: file=" + this.f15067a.getName() + ", size=" + this.f15067a.length() + ", videoSamples=" + this.f15079o + ", audioSamples=" + this.f15080p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e7) {
                throw new IOException("Unable to finish MP4", e7);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void h() {
        ArrayList arrayList = this.f15071f;
        if (this.f15074j != null) {
            boolean z10 = this.f15069c;
            if (!z10 || this.f15075k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f15067a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f15068b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f15073i = createMovie;
                    this.f15076l = createMovie.addTrack(this.f15074j, false);
                    if (z10) {
                        this.f15077m = this.f15073i.addTrack(this.f15075k, true);
                    }
                    m mVar = this.d;
                    mVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        r rVar = (r) arrayList.get(i11);
                        p(rVar.f15033a, rVar.f15034b, rVar.f15035c);
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
            ByteBuffer byteBuffer2 = this.f15083s;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                this.f15083s = ByteBuffer.allocateDirect(i14);
            }
            this.f15083s.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f15083s.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f15083s.flip();
                this.f15084t.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
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
            ByteBuffer byteBuffer3 = this.f15083s;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i17) {
                this.f15083s = ByteBuffer.allocateDirect(i17);
            }
            this.f15083s.clear();
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
                        this.f15083s.putInt(i10 - m11);
                        byteBuffer.position(m11);
                        byteBuffer.limit(i10);
                        this.f15083s.put(byteBuffer);
                    }
                    f7 = f10;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f15083s.flip();
            this.f15084t.set(0, this.f15083s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void j(long j3) {
        if (j3 > this.f15078n) {
            this.f15078n = j3;
            if (this.v) {
                return;
            }
            ah.b bVar = this.f15070e;
            s0 s0Var = (s0) bVar.f453b;
            o0 o0Var = (o0) bVar.f454c;
            synchronized (s0Var.f15049g) {
                try {
                    long j10 = o0Var.f15000c;
                    long j11 = j3 - j10;
                    if (j11 > 0 && !o0Var.d) {
                        o0Var.f15000c = j3;
                        s0Var.f15052k.execute(new a3.g0(s0Var, o0Var, j10, j11, 3));
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
            if (this.f15086w) {
                return;
            }
            if (this.f15073i != null) {
                if (z10) {
                    mediaFormat2 = this.f15074j;
                } else {
                    mediaFormat2 = this.f15075k;
                }
                if ((z10 && !k(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f15069c && !k(mediaFormat2, mediaFormat, "csd-0"))) {
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
                this.f15074j = mediaFormat;
            } else if (this.f15069c) {
                this.f15075k = mediaFormat;
            }
            h();
        } finally {
        }
    }

    public final synchronized void o(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f15086w) {
                if (!z10) {
                    if (this.f15069c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j3);
                    if (this.f15073i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f15071f.add(new r(z10, allocateDirect, b10));
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
        m mVar = this.d;
        String str2 = null;
        if (z10) {
            try {
                if (!this.f15085u) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                i(byteBuffer, bufferInfo);
                byteBuffer2 = this.f15083s;
                bufferInfo2 = this.f15084t;
                if (!this.f15085u) {
                    this.f15085u = true;
                    mVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
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
                mVar.a(a4.a.r(str, ", ", str2, sb2), e7);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str3 = "video";
                }
                throw new IOException(a4.a.r(str3, " MP4 sample: ", str2, sb3), e7);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f15073i;
        if (z10) {
            i10 = this.f15076l;
        } else {
            i10 = this.f15077m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.f15079o++;
        } else {
            this.f15080p++;
        }
        if (writeSampleData > 0) {
            j(writeSampleData);
        }
    }
}
