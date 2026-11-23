package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class h0 {
    public static final Object f21195t = new Object();
    public static ScheduledExecutorService f21196u;
    public static int v;
    public final AudioTrack f21197a;
    public final n f21198b;
    public final float f21199c;
    public final hi.u0 d;
    public d0 f21200e;
    public final k0 f21201f;
    public final boolean f21202g;
    public final int h;
    public final g0 f21203i;
    public final h2.r f21204j = new h2.r(Thread.currentThread());
    public boolean f21205k;
    public long f21206l;
    public long f21207m;
    public long f21208n;
    public ByteBuffer f21209o;
    public int f21210p;
    public int f21211q;
    public int f21212r;
    public boolean f21213s;

    public h0(AudioTrack audioTrack, n nVar, hi.u0 u0Var, float f10, h2.g0 g0Var) {
        g0 g0Var2;
        this.f21197a = audioTrack;
        this.f21198b = nVar;
        this.f21199c = f10;
        this.d = u0Var;
        boolean M = h2.l0.M(nVar.f21275a);
        this.f21202g = M;
        if (M) {
            this.h = h2.l0.u(nVar.f21275a) * Integer.bitCount(nVar.f21277c);
        } else {
            this.h = -1;
        }
        this.f21201f = new k0(new h6.o(this, 16), g0Var, audioTrack, nVar.f21275a, this.h, nVar.f21279f);
        if (Build.VERSION.SDK_INT >= 24 && u0Var != null) {
            this.f21200e = new d0(audioTrack, u0Var);
        }
        if (c()) {
            g0Var2 = new g0(this);
        } else {
            g0Var2 = null;
        }
        this.f21203i = g0Var2;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.a():long");
    }

    public final long b() {
        if (this.f21202g) {
            long j3 = this.f21206l;
            long j10 = this.h;
            String str = h2.l0.f13778a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f21207m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f21197a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f21197a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f21197a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            k0 k0Var = this.f21201f;
            k0Var.A = true;
            k0Var.h.f21380a.f21377f = true;
        }
    }

    public final void f(m2.i iVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = iVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f21197a.setLogSessionId(a10);
            }
        }
    }

    public final boolean g(long j3, int i7, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        hi.u0 u0Var;
        j0 j0Var;
        e eVar;
        boolean z10;
        int i10;
        boolean z11;
        long j10 = j3;
        n nVar = this.f21198b;
        boolean z12 = this.f21202g;
        if (!z12 && this.f21211q == 0) {
            this.f21211q = s0.k(nVar.f21275a, byteBuffer);
        }
        h2.r rVar = this.f21204j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f13805a;
        AudioTrack audioTrack2 = this.f21197a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f21213s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.l0.f13778a;
                audioTrack = audioTrack2;
                if (b10 > h2.l0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21213s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f21212r + 1;
                } else {
                    i10 = this.f21212r;
                }
            }
            if (i10 > this.f21212r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21212r = i10;
            if (z11) {
                rVar.e(-1, new a0(0));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f21208n;
            } else {
                this.f21208n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f21209o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f21209o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f21209o.putInt(1431633921);
                }
                if (this.f21210p == 0) {
                    this.f21209o.putInt(4, remaining2);
                    this.f21209o.putLong(8, j10 * 1000);
                    this.f21209o.position(0);
                    this.f21210p = remaining2;
                }
                int remaining3 = this.f21209o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f21209o, remaining3, 1);
                    if (write2 < 0) {
                        this.f21210p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f21210p = 0;
                } else {
                    this.f21210p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (u0Var = this.d) != null && (eVar = (j0Var = (j0) u0Var.f15482b).f21233i) != null) {
                b bVar = b.f21153f;
                j0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f21206l += write;
            return z13;
        }
        if (z13) {
            this.f21207m = (this.f21211q * i7) + this.f21207m;
        }
        return z13;
    }
}
