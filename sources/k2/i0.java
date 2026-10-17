package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class i0 {
    public static final Object f14687t = new Object();
    public static ScheduledExecutorService f14688u;
    public static int v;
    public final AudioTrack f14689a;
    public final o f14690b;
    public final float f14691c;
    public final a6.i d;
    public d0 e;
    public final l0 f14692f;
    public final boolean f14693g;
    public final int h;
    public final h0 f14694i;
    public final e2.r f14695j = new e2.r(Thread.currentThread());
    public boolean f14696k;
    public long f14697l;
    public long f14698m;
    public long f14699n;
    public ByteBuffer f14700o;
    public int f14701p;
    public int f14702q;
    public int f14703r;
    public boolean f14704s;

    public i0(AudioTrack audioTrack, o oVar, a6.i iVar, float f7, e2.g0 g0Var) {
        h0 h0Var;
        this.f14689a = audioTrack;
        this.f14690b = oVar;
        this.f14691c = f7;
        this.d = iVar;
        boolean M = e2.m0.M(oVar.f14761a);
        this.f14693g = M;
        if (M) {
            this.h = e2.m0.u(oVar.f14761a) * Integer.bitCount(oVar.f14763c);
        } else {
            this.h = -1;
        }
        this.f14692f = new l0(new ya.c(this, 26), g0Var, audioTrack, oVar.f14761a, this.h, oVar.f14764f);
        if (Build.VERSION.SDK_INT >= 24 && iVar != null) {
            this.e = new d0(audioTrack, iVar);
        }
        if (c()) {
            h0Var = new h0(this);
        } else {
            h0Var = null;
        }
        this.f14694i = h0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.i0.a():long");
    }

    public final long b() {
        if (this.f14693g) {
            long j10 = this.f14697l;
            long j11 = this.h;
            String str = e2.m0.f8254a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f14698m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f14689a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f14689a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f14689a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            l0 l0Var = this.f14692f;
            l0Var.A = true;
            l0Var.h.f14645a.f14637f = true;
        }
    }

    public final void f(j2.k kVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = kVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f14689a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        a6.i iVar;
        k0 k0Var;
        e eVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        o oVar = this.f14690b;
        boolean z12 = this.f14693g;
        if (!z12 && this.f14702q == 0) {
            this.f14702q = t0.k(oVar.f14761a, byteBuffer);
        }
        e2.r rVar = this.f14695j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f8274a;
        AudioTrack audioTrack2 = this.f14689a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f14704s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.m0.f8254a;
                audioTrack = audioTrack2;
                if (b10 > e2.m0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14704s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f14703r + 1;
                } else {
                    i11 = this.f14703r;
                }
            }
            if (i11 > this.f14703r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f14703r = i11;
            if (z11) {
                rVar.e(-1, new j2.e(27));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f14699n;
            } else {
                this.f14699n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f14700o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f14700o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f14700o.putInt(1431633921);
                }
                if (this.f14701p == 0) {
                    this.f14700o.putInt(4, remaining2);
                    this.f14700o.putLong(8, j11 * 1000);
                    this.f14700o.position(0);
                    this.f14701p = remaining2;
                }
                int remaining3 = this.f14700o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f14700o, remaining3, 1);
                    if (write2 < 0) {
                        this.f14701p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f14701p = 0;
                } else {
                    this.f14701p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (iVar = this.d) != null && (eVar = (k0Var = (k0) iVar.f306b).f14721i) != null) {
                b bVar = b.f14640f;
                k0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new h(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f14697l += write;
            return z13;
        }
        if (z13) {
            this.f14698m = (this.f14702q * i10) + this.f14698m;
        }
        return z13;
    }
}
