package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class i0 {
    public static final Object f14738t = new Object();
    public static ScheduledExecutorService f14739u;
    public static int v;
    public final AudioTrack f14740a;
    public final p f14741b;
    public final float f14742c;
    public final a6.i d;
    public e0 e;
    public final l0 f14743f;
    public final boolean f14744g;
    public final int h;
    public final h0 f14745i;
    public final e2.r f14746j = new e2.r(Thread.currentThread());
    public boolean f14747k;
    public long f14748l;
    public long f14749m;
    public long f14750n;
    public ByteBuffer f14751o;
    public int f14752p;
    public int f14753q;
    public int f14754r;
    public boolean f14755s;

    public i0(AudioTrack audioTrack, p pVar, a6.i iVar, float f7, e2.g0 g0Var) {
        h0 h0Var;
        this.f14740a = audioTrack;
        this.f14741b = pVar;
        this.f14742c = f7;
        this.d = iVar;
        boolean M = e2.m0.M(pVar.f14813a);
        this.f14744g = M;
        if (M) {
            this.h = e2.m0.u(pVar.f14813a) * Integer.bitCount(pVar.f14815c);
        } else {
            this.h = -1;
        }
        this.f14743f = new l0(new ya.c(this, 26), g0Var, audioTrack, pVar.f14813a, this.h, pVar.f14816f);
        if (Build.VERSION.SDK_INT >= 24 && iVar != null) {
            this.e = new e0(audioTrack, iVar);
        }
        if (c()) {
            h0Var = new h0(this);
        } else {
            h0Var = null;
        }
        this.f14745i = h0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.i0.a():long");
    }

    public final long b() {
        if (this.f14744g) {
            long j10 = this.f14748l;
            long j11 = this.h;
            String str = e2.m0.f8259a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f14749m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f14740a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f14740a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f14740a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            l0 l0Var = this.f14743f;
            l0Var.A = true;
            l0Var.h.f14697a.f14693f = true;
        }
    }

    public final void f(j2.j jVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = jVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f14740a.setLogSessionId(a2);
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
        p pVar = this.f14741b;
        boolean z12 = this.f14744g;
        if (!z12 && this.f14753q == 0) {
            this.f14753q = t0.k(pVar.f14813a, byteBuffer);
        }
        e2.r rVar = this.f14746j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f8279a;
        AudioTrack audioTrack2 = this.f14740a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f14755s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.m0.f8259a;
                audioTrack = audioTrack2;
                if (b10 > e2.m0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14755s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f14754r + 1;
                } else {
                    i11 = this.f14754r;
                }
            }
            if (i11 > this.f14754r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f14754r = i11;
            if (z11) {
                rVar.e(-1, new f(1));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (pVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f14750n;
            } else {
                this.f14750n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f14751o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f14751o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f14751o.putInt(1431633921);
                }
                if (this.f14752p == 0) {
                    this.f14751o.putInt(4, remaining2);
                    this.f14751o.putLong(8, j11 * 1000);
                    this.f14751o.position(0);
                    this.f14752p = remaining2;
                }
                int remaining3 = this.f14751o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f14751o, remaining3, 1);
                    if (write2 < 0) {
                        this.f14752p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f14752p = 0;
                } else {
                    this.f14752p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (iVar = this.d) != null && (eVar = (k0Var = (k0) iVar.f307b).f14769i) != null) {
                b bVar = b.f14685f;
                k0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new i(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f14748l += write;
            return z13;
        }
        if (z13) {
            this.f14749m = (this.f14753q * i10) + this.f14749m;
        }
        return z13;
    }
}
