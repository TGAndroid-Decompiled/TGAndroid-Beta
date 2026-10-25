package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class j0 {
    public static final Object f16175t = new Object();
    public static ScheduledExecutorService f16176u;
    public static int v;
    public final AudioTrack f16177a;
    public final p f16178b;
    public final float f16179c;
    public final jg.s0 d;
    public f0 e;
    public final m0 f16180f;
    public final boolean f16181g;
    public final int h;
    public final i0 f16182i;
    public final e2.r f16183j = new e2.r(Thread.currentThread());
    public boolean f16184k;
    public long f16185l;
    public long f16186m;
    public long f16187n;
    public ByteBuffer f16188o;
    public int f16189p;
    public int f16190q;
    public int f16191r;
    public boolean f16192s;

    public j0(AudioTrack audioTrack, p pVar, jg.s0 s0Var, float f7, e2.g0 g0Var) {
        i0 i0Var;
        this.f16177a = audioTrack;
        this.f16178b = pVar;
        this.f16179c = f7;
        this.d = s0Var;
        boolean M = e2.n0.M(pVar.f16249a);
        this.f16181g = M;
        if (M) {
            this.h = e2.n0.u(pVar.f16249a) * Integer.bitCount(pVar.f16251c);
        } else {
            this.h = -1;
        }
        this.f16180f = new m0(new jg.i(this), g0Var, audioTrack, pVar.f16249a, this.h, pVar.f16252f);
        if (Build.VERSION.SDK_INT >= 24 && s0Var != null) {
            this.e = new f0(audioTrack, s0Var);
        }
        if (c()) {
            i0Var = new i0(this);
        } else {
            i0Var = null;
        }
        this.f16182i = i0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.j0.a():long");
    }

    public final long b() {
        if (this.f16181g) {
            long j10 = this.f16185l;
            long j11 = this.h;
            String str = e2.n0.f9692a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f16186m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f16177a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f16177a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f16177a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            m0 m0Var = this.f16180f;
            m0Var.A = true;
            m0Var.h.f16131a.f16126f = true;
        }
    }

    public final void f(j2.j jVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = jVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f16177a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        jg.s0 s0Var;
        l0 l0Var;
        f fVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        p pVar = this.f16178b;
        boolean z12 = this.f16181g;
        if (!z12 && this.f16190q == 0) {
            this.f16190q = u0.k(pVar.f16249a, byteBuffer);
        }
        e2.r rVar = this.f16183j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f9713a;
        AudioTrack audioTrack2 = this.f16177a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f16192s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.n0.f9692a;
                audioTrack = audioTrack2;
                if (b10 > e2.n0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f16192s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f16191r + 1;
                } else {
                    i11 = this.f16191r;
                }
            }
            if (i11 > this.f16191r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f16191r = i11;
            if (z11) {
                rVar.e(-1, new jh.l(3));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (pVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f16187n;
            } else {
                this.f16187n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f16188o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f16188o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f16188o.putInt(1431633921);
                }
                if (this.f16189p == 0) {
                    this.f16188o.putInt(4, remaining2);
                    this.f16188o.putLong(8, j11 * 1000);
                    this.f16188o.position(0);
                    this.f16189p = remaining2;
                }
                int remaining3 = this.f16188o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f16188o, remaining3, 1);
                    if (write2 < 0) {
                        this.f16189p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f16189p = 0;
                } else {
                    this.f16189p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (s0Var = this.d) != null && (fVar = (l0Var = (l0) s0Var.f15828b).f16209i) != null) {
                b bVar = b.f16118f;
                l0Var.h = bVar;
                fVar.b(bVar);
            }
            throw new i(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f16185l += write;
            return z13;
        }
        if (z13) {
            this.f16186m = (this.f16190q * i10) + this.f16186m;
        }
        return z13;
    }
}
