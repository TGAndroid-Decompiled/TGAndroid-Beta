package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class g0 {
    public static final Object f20737t = new Object();
    public static ScheduledExecutorService f20738u;
    public static int v;
    public final AudioTrack f20739a;
    public final n f20740b;
    public final float f20741c;
    public final ia.d d;
    public c0 f20742e;
    public final j0 f20743f;
    public final boolean f20744g;
    public final int h;
    public final f0 f20745i;
    public final h2.r f20746j = new h2.r(Thread.currentThread());
    public boolean f20747k;
    public long f20748l;
    public long f20749m;
    public long f20750n;
    public ByteBuffer f20751o;
    public int f20752p;
    public int f20753q;
    public int f20754r;
    public boolean f20755s;

    public g0(AudioTrack audioTrack, n nVar, ia.d dVar, float f10, h2.g0 g0Var) {
        f0 f0Var;
        this.f20739a = audioTrack;
        this.f20740b = nVar;
        this.f20741c = f10;
        this.d = dVar;
        boolean M = h2.l0.M(nVar.f20818a);
        this.f20744g = M;
        if (M) {
            this.h = h2.l0.u(nVar.f20818a) * Integer.bitCount(nVar.f20820c);
        } else {
            this.h = -1;
        }
        this.f20743f = new j0(new gc.b(this, 19), g0Var, audioTrack, nVar.f20818a, this.h, nVar.f20822f);
        if (Build.VERSION.SDK_INT >= 24 && dVar != null) {
            this.f20742e = new c0(audioTrack, dVar);
        }
        if (c()) {
            f0Var = new f0(this);
        } else {
            f0Var = null;
        }
        this.f20745i = f0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.g0.a():long");
    }

    public final long b() {
        if (this.f20744g) {
            long j3 = this.f20748l;
            long j10 = this.h;
            String str = h2.l0.f13471a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f20749m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f20739a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f20739a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f20739a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            j0 j0Var = this.f20743f;
            j0Var.A = true;
            j0Var.h.f20923a.f20920f = true;
        }
    }

    public final void f(m2.j jVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = jVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f20739a.setLogSessionId(a10);
            }
        }
    }

    public final boolean g(long j3, int i7, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        ia.d dVar;
        i0 i0Var;
        e eVar;
        boolean z10;
        int i10;
        boolean z11;
        long j10 = j3;
        n nVar = this.f20740b;
        boolean z12 = this.f20744g;
        if (!z12 && this.f20753q == 0) {
            this.f20753q = r0.k(nVar.f20818a, byteBuffer);
        }
        h2.r rVar = this.f20746j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f13498a;
        AudioTrack audioTrack2 = this.f20739a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f20755s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.l0.f13471a;
                audioTrack = audioTrack2;
                if (b10 > h2.l0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f20755s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f20754r + 1;
                } else {
                    i10 = this.f20754r;
                }
            }
            if (i10 > this.f20754r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f20754r = i10;
            if (z11) {
                rVar.e(-1, new m2.c());
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f20750n;
            } else {
                this.f20750n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f20751o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f20751o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f20751o.putInt(1431633921);
                }
                if (this.f20752p == 0) {
                    this.f20751o.putInt(4, remaining2);
                    this.f20751o.putLong(8, j10 * 1000);
                    this.f20751o.position(0);
                    this.f20752p = remaining2;
                }
                int remaining3 = this.f20751o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f20751o, remaining3, 1);
                    if (write2 < 0) {
                        this.f20752p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f20752p = 0;
                } else {
                    this.f20752p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (dVar = this.d) != null && (eVar = (i0Var = (i0) dVar.f15881b).f20772i) != null) {
                b bVar = b.f20705f;
                i0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f20748l += write;
            return z13;
        }
        if (z13) {
            this.f20749m = (this.f20753q * i7) + this.f20749m;
        }
        return z13;
    }
}
