package m2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import gi.v5;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class h0 {
    public static final Object f18864t = new Object();
    public static ScheduledExecutorService f18865u;
    public static int v;
    public final AudioTrack f18866a;
    public final n f18867b;
    public final float f18868c;
    public final hi.d d;
    public d0 f18869e;
    public final k0 f18870f;
    public final boolean f18871g;
    public final int h;
    public final g0 f18872i;
    public final g2.s f18873j = new g2.s(Thread.currentThread());
    public boolean f18874k;
    public long f18875l;
    public long f18876m;
    public long f18877n;
    public ByteBuffer f18878o;
    public int f18879p;
    public int f18880q;
    public int f18881r;
    public boolean f18882s;

    public h0(AudioTrack audioTrack, n nVar, hi.d dVar, float f10, g2.h0 h0Var) {
        g0 g0Var;
        this.f18866a = audioTrack;
        this.f18867b = nVar;
        this.f18868c = f10;
        this.d = dVar;
        boolean M = g2.n0.M(nVar.f18944a);
        this.f18871g = M;
        if (M) {
            this.h = g2.n0.u(nVar.f18944a) * Integer.bitCount(nVar.f18946c);
        } else {
            this.h = -1;
        }
        this.f18870f = new k0(new v5(this, 13), h0Var, audioTrack, nVar.f18944a, this.h, nVar.f18948f);
        if (Build.VERSION.SDK_INT >= 24 && dVar != null) {
            this.f18869e = new d0(audioTrack, dVar);
        }
        if (c()) {
            g0Var = new g0(this);
        } else {
            g0Var = null;
        }
        this.f18872i = g0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: m2.h0.a():long");
    }

    public final long b() {
        if (this.f18871g) {
            long j10 = this.f18875l;
            long j11 = this.h;
            String str = g2.n0.f11873a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f18876m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f18866a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i3, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f18866a.setOffloadDelayPadding(i3, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f18866a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            k0 k0Var = this.f18870f;
            k0Var.A = true;
            k0Var.h.f18823a.f18814f = true;
        }
    }

    public final void f(l2.k kVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = kVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f18866a.setLogSessionId(a10);
            }
        }
    }

    public final boolean g(long j10, int i3, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        hi.d dVar;
        j0 j0Var;
        e eVar;
        boolean z10;
        int i10;
        boolean z11;
        long j11 = j10;
        n nVar = this.f18867b;
        boolean z12 = this.f18871g;
        if (!z12 && this.f18880q == 0) {
            this.f18880q = s0.k(nVar.f18944a, byteBuffer);
        }
        g2.s sVar = this.f18873j;
        sVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = sVar.f11900a;
        AudioTrack audioTrack2 = this.f18866a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f18882s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = g2.n0.f11873a;
                audioTrack = audioTrack2;
                if (b10 > g2.n0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f18882s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f18881r + 1;
                } else {
                    i10 = this.f18881r;
                }
            }
            if (i10 > this.f18881r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f18881r = i10;
            if (z11) {
                sVar.e(-1, new l2.d(18));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f18877n;
            } else {
                this.f18877n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f18878o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f18878o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f18878o.putInt(1431633921);
                }
                if (this.f18879p == 0) {
                    this.f18878o.putInt(4, remaining2);
                    this.f18878o.putLong(8, j11 * 1000);
                    this.f18878o.position(0);
                    this.f18879p = remaining2;
                }
                int remaining3 = this.f18878o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f18878o, remaining3, 1);
                    if (write2 < 0) {
                        this.f18879p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f18879p = 0;
                } else {
                    this.f18879p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (dVar = this.d) != null && (eVar = (j0Var = (j0) dVar.f14429b).f18902i) != null) {
                b bVar = b.f18818f;
                j0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f18875l += write;
            return z13;
        }
        if (z13) {
            this.f18876m = (this.f18880q * i3) + this.f18876m;
        }
        return z13;
    }
}
