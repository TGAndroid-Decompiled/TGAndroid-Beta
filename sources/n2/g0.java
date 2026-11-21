package n2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import hi.t5;
import hi.w4;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class g0 {
    public static final Object f21126t = new Object();
    public static ScheduledExecutorService f21127u;
    public static int v;
    public final AudioTrack f21128a;
    public final n f21129b;
    public final float f21130c;
    public final t5 d;
    public c0 f21131e;
    public final j0 f21132f;
    public final boolean f21133g;
    public final int h;
    public final f0 f21134i;
    public final h2.r f21135j = new h2.r(Thread.currentThread());
    public boolean f21136k;
    public long f21137l;
    public long f21138m;
    public long f21139n;
    public ByteBuffer f21140o;
    public int f21141p;
    public int f21142q;
    public int f21143r;
    public boolean f21144s;

    public g0(AudioTrack audioTrack, n nVar, t5 t5Var, float f10, h2.g0 g0Var) {
        f0 f0Var;
        this.f21128a = audioTrack;
        this.f21129b = nVar;
        this.f21130c = f10;
        this.d = t5Var;
        boolean M = h2.l0.M(nVar.f21207a);
        this.f21133g = M;
        if (M) {
            this.h = h2.l0.u(nVar.f21207a) * Integer.bitCount(nVar.f21209c);
        } else {
            this.h = -1;
        }
        this.f21132f = new j0(new w4(this, 14), g0Var, audioTrack, nVar.f21207a, this.h, nVar.f21211f);
        if (Build.VERSION.SDK_INT >= 24 && t5Var != null) {
            this.f21131e = new c0(audioTrack, t5Var);
        }
        if (c()) {
            f0Var = new f0(this);
        } else {
            f0Var = null;
        }
        this.f21134i = f0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.g0.a():long");
    }

    public final long b() {
        if (this.f21133g) {
            long j3 = this.f21137l;
            long j10 = this.h;
            String str = h2.l0.f13812a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.f21138m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f21128a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f21128a.setOffloadDelayPadding(i7, i10);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f21128a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            j0 j0Var = this.f21132f;
            j0Var.A = true;
            j0Var.h.f21312a.f21309f = true;
        }
    }

    public final void f(m2.i iVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a10 = iVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a10.equals(logSessionId)) {
                this.f21128a.setLogSessionId(a10);
            }
        }
    }

    public final boolean g(long j3, int i7, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        t5 t5Var;
        i0 i0Var;
        e eVar;
        boolean z10;
        int i10;
        boolean z11;
        long j10 = j3;
        n nVar = this.f21129b;
        boolean z12 = this.f21133g;
        if (!z12 && this.f21142q == 0) {
            this.f21142q = r0.k(nVar.f21207a, byteBuffer);
        }
        h2.r rVar = this.f21135j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f13839a;
        AudioTrack audioTrack2 = this.f21128a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f21144s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = h2.l0.f13812a;
                audioTrack = audioTrack2;
                if (b10 > h2.l0.a0(a10, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21144s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i10 = this.f21143r + 1;
                } else {
                    i10 = this.f21143r;
                }
            }
            if (i10 > this.f21143r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21143r = i10;
            if (z11) {
                rVar.e(-1, new a0(0));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f21139n;
            } else {
                this.f21139n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f21140o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f21140o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f21140o.putInt(1431633921);
                }
                if (this.f21141p == 0) {
                    this.f21140o.putInt(4, remaining2);
                    this.f21140o.putLong(8, j10 * 1000);
                    this.f21140o.position(0);
                    this.f21141p = remaining2;
                }
                int remaining3 = this.f21140o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f21140o, remaining3, 1);
                    if (write2 < 0) {
                        this.f21141p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f21141p = 0;
                } else {
                    this.f21141p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (t5Var = this.d) != null && (eVar = (i0Var = (i0) t5Var.f15505b).f21161i) != null) {
                b bVar = b.f21094f;
                i0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new g(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f21137l += write;
            return z13;
        }
        if (z13) {
            this.f21138m = (this.f21142q * i7) + this.f21138m;
        }
        return z13;
    }
}
