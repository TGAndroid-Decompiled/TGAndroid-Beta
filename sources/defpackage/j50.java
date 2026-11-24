package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class j50 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final r10 b;
    public final ni6 c;
    public e50 d;
    public final m50 e;
    public final boolean f;
    public final int g;
    public final i50 h;
    public final a86 i = new a86(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public boolean r;

    public j50(AudioTrack audioTrack, r10 r10Var, ni6 ni6Var, bfb bfbVar) {
        int i;
        i50 i50Var;
        this.a = audioTrack;
        this.b = r10Var;
        this.c = ni6Var;
        int i2 = r10Var.a;
        boolean N = hac.N(i2);
        this.f = N;
        if (N) {
            i = hac.u(i2) * Integer.bitCount(r10Var.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new m50(new sz4(this), bfbVar, audioTrack, r10Var.a, i, r10Var.f);
        if (Build.VERSION.SDK_INT >= 24 && ni6Var != null) {
            this.d = new e50(audioTrack, ni6Var);
        }
        if (c()) {
            i50Var = new i50(this);
        } else {
            i50Var = null;
        }
        this.h = i50Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.a():long");
    }

    public final long b() {
        if (this.f) {
            long j = this.k;
            long j2 = this.g;
            String str = hac.a;
            return ((j + j2) - 1) / j2;
        }
        return this.l;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            m50 m50Var = this.e;
            m50Var.A = true;
            m50Var.h.a.f = true;
        }
    }

    public final void f(we8 we8Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a = we8Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a.equals(logSessionId)) {
                this.a.setLogSessionId(a);
            }
        }
    }

    public final boolean g(long j, int i, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        ni6 ni6Var;
        l50 l50Var;
        u00 u00Var;
        boolean z;
        int i2;
        boolean z2;
        long j2 = j;
        r10 r10Var = this.b;
        boolean z3 = this.f;
        if (!z3 && this.p == 0) {
            this.p = cb3.k(r10Var.a, byteBuffer);
        }
        a86 a86Var = this.i;
        a86Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = a86Var.a;
        AudioTrack audioTrack2 = this.a;
        boolean z4 = false;
        if (currentThread == thread) {
            long b = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i2 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z5 = this.r;
                audioTrack = audioTrack2;
                if (b > hac.b0(a(), audioTrack2.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    z = true;
                } else {
                    z = false;
                }
                this.r = z;
                if (z5 && !z && audioTrack.getPlayState() != 1) {
                    i2 = this.q + 1;
                } else {
                    i2 = this.q;
                }
            }
            if (i2 > this.q) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.q = i2;
            if (z2) {
                a86Var.e(-1, new w00((byte) 2));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (r10Var.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.m;
            } else {
                this.m = j2;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j2 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.n == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.n = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.n.putInt(1431633921);
                }
                if (this.o == 0) {
                    this.n.putInt(4, remaining2);
                    this.n.putLong(8, j2 * 1000);
                    this.n.position(0);
                    this.o = remaining2;
                }
                int remaining3 = this.n.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.n, remaining3, 1);
                    if (write2 < 0) {
                        this.o = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.o = 0;
                } else {
                    this.o -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z4 = true;
            }
            if (z4 && (ni6Var = this.c) != null && (u00Var = (l50Var = (l50) ni6Var.b).h) != null) {
                r00 r00Var = r00.f;
                l50Var.g = r00Var;
                u00Var.k(r00Var);
            }
            throw new l10(write, z4);
        }
        if (write == remaining) {
            z4 = true;
        }
        if (z3) {
            this.k += write;
            return z4;
        }
        if (z4) {
            this.l = (this.p * i) + this.l;
        }
        return z4;
    }
}
