package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class j0 {
    public static final Object f10672t = new Object();
    public static ScheduledExecutorService f10673u;
    public static int v;
    public final AudioTrack f10674a;
    public final o f10675b;
    public final float f10676c;
    public final m0 d;
    public f0 e;
    public final o0 f10677f;
    public final boolean f10678g;
    public final int h;
    public final i0 f10679i;
    public final e2.r f10680j = new e2.r(Thread.currentThread());
    public boolean f10681k;
    public long f10682l;
    public long f10683m;
    public long f10684n;
    public ByteBuffer f10685o;
    public int f10686p;
    public int f10687q;
    public int f10688r;
    public boolean f10689s;

    public j0(AudioTrack audioTrack, o oVar, m0 m0Var, float f7, e2.g0 g0Var) {
        i0 i0Var;
        this.f10674a = audioTrack;
        this.f10675b = oVar;
        this.f10676c = f7;
        this.d = m0Var;
        boolean M = e2.l0.M(oVar.f10717a);
        this.f10678g = M;
        if (M) {
            this.h = e2.l0.u(oVar.f10717a) * Integer.bitCount(oVar.f10719c);
        } else {
            this.h = -1;
        }
        this.f10677f = new o0(new a4.l(this, 23), g0Var, audioTrack, oVar.f10717a, this.h, oVar.f10720f);
        if (Build.VERSION.SDK_INT >= 24 && m0Var != null) {
            this.e = new f0(audioTrack, m0Var);
        }
        if (c()) {
            i0Var = new i0(this);
        } else {
            i0Var = null;
        }
        this.f10679i = i0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.j0.a():long");
    }

    public final long b() {
        if (this.f10678g) {
            long j10 = this.f10682l;
            long j11 = this.h;
            String str = e2.l0.f6165a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f10683m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f10674a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f10674a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f10674a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            o0 o0Var = this.f10677f;
            o0Var.A = true;
            o0Var.h.f10629a.f10623f = true;
        }
    }

    public final void f(j2.l lVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = lVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f10674a.setLogSessionId(a2);
            }
        }
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        m0 m0Var;
        n0 n0Var;
        e eVar;
        boolean z10;
        int i11;
        boolean z11;
        long j11 = j10;
        o oVar = this.f10675b;
        boolean z12 = this.f10678g;
        if (!z12 && this.f10687q == 0) {
            this.f10687q = w0.k(oVar.f10717a, byteBuffer);
        }
        e2.r rVar = this.f10680j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f6188a;
        AudioTrack audioTrack2 = this.f10674a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f10689s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.l0.f6165a;
                audioTrack = audioTrack2;
                if (b10 > e2.l0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f10689s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f10688r + 1;
                } else {
                    i11 = this.f10688r;
                }
            }
            if (i11 > this.f10688r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f10688r = i11;
            if (z11) {
                rVar.e(-1, new j2.e(26));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f10684n;
            } else {
                this.f10684n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, 1000 * j11);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f10685o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f10685o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f10685o.putInt(1431633921);
                }
                if (this.f10686p == 0) {
                    this.f10685o.putInt(4, remaining2);
                    this.f10685o.putLong(8, j11 * 1000);
                    this.f10685o.position(0);
                    this.f10686p = remaining2;
                }
                int remaining3 = this.f10685o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f10685o, remaining3, 1);
                    if (write2 < 0) {
                        this.f10686p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f10686p = 0;
                } else {
                    this.f10686p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (m0Var = this.d) != null && (eVar = (n0Var = (n0) m0Var.f10700a).f10714i) != null) {
                b bVar = b.f10601f;
                n0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new h(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f10682l += write;
            return z13;
        }
        if (z13) {
            this.f10683m = (this.f10687q * i10) + this.f10683m;
        }
        return z13;
    }
}
