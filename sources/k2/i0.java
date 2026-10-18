package k2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
public final class i0 {
    public static final Object f14692t = new Object();
    public static ScheduledExecutorService f14693u;
    public static int v;
    public final AudioTrack f14694a;
    public final o f14695b;
    public final float f14696c;
    public final a6.i d;
    public d0 e;
    public final l0 f14697f;
    public final boolean f14698g;
    public final int h;
    public final h0 f14699i;
    public final e2.r f14700j = new e2.r(Thread.currentThread());
    public boolean f14701k;
    public long f14702l;
    public long f14703m;
    public long f14704n;
    public ByteBuffer f14705o;
    public int f14706p;
    public int f14707q;
    public int f14708r;
    public boolean f14709s;

    public i0(AudioTrack audioTrack, o oVar, a6.i iVar, float f7, e2.g0 g0Var) {
        h0 h0Var;
        this.f14694a = audioTrack;
        this.f14695b = oVar;
        this.f14696c = f7;
        this.d = iVar;
        boolean M = e2.m0.M(oVar.f14766a);
        this.f14698g = M;
        if (M) {
            this.h = e2.m0.u(oVar.f14766a) * Integer.bitCount(oVar.f14768c);
        } else {
            this.h = -1;
        }
        this.f14697f = new l0(new ya.d(this, 26), g0Var, audioTrack, oVar.f14766a, this.h, oVar.f14769f);
        if (Build.VERSION.SDK_INT >= 24 && iVar != null) {
            this.e = new d0(audioTrack, iVar);
        }
        if (c()) {
            h0Var = new h0(this);
        } else {
            h0Var = null;
        }
        this.f14699i = h0Var;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.i0.a():long");
    }

    public final long b() {
        if (this.f14698g) {
            long j10 = this.f14702l;
            long j11 = this.h;
            String str = e2.m0.f8253a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.f14703m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.f14694a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f14694a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.f14694a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            l0 l0Var = this.f14697f;
            l0Var.A = true;
            l0Var.h.f14650a.f14642f = true;
        }
    }

    public final void f(j2.k kVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a2 = kVar.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a2.equals(logSessionId)) {
                this.f14694a.setLogSessionId(a2);
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
        o oVar = this.f14695b;
        boolean z12 = this.f14698g;
        if (!z12 && this.f14707q == 0) {
            this.f14707q = t0.k(oVar.f14766a, byteBuffer);
        }
        e2.r rVar = this.f14700j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.f8273a;
        AudioTrack audioTrack2 = this.f14694a;
        boolean z13 = false;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z14 = this.f14709s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.m0.f8253a;
                audioTrack = audioTrack2;
                if (b10 > e2.m0.a0(a2, sampleRate, 1000000L, RoundingMode.UP)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14709s = z10;
                if (z14 && !z10 && audioTrack.getPlayState() != 1) {
                    i11 = this.f14708r + 1;
                } else {
                    i11 = this.f14708r;
                }
            }
            if (i11 > this.f14708r) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f14708r = i11;
            if (z11) {
                rVar.e(-1, new j2.e(27));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f14704n;
            } else {
                this.f14704n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.f14705o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f14705o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f14705o.putInt(1431633921);
                }
                if (this.f14706p == 0) {
                    this.f14705o.putInt(4, remaining2);
                    this.f14705o.putLong(8, j11 * 1000);
                    this.f14705o.position(0);
                    this.f14706p = remaining2;
                }
                int remaining3 = this.f14705o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.f14705o, remaining3, 1);
                    if (write2 < 0) {
                        this.f14706p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f14706p = 0;
                } else {
                    this.f14706p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                z13 = true;
            }
            if (z13 && (iVar = this.d) != null && (eVar = (k0Var = (k0) iVar.f306b).f14726i) != null) {
                b bVar = b.f14645f;
                k0Var.h = bVar;
                eVar.b(bVar);
            }
            throw new h(write, z13);
        }
        if (write == remaining) {
            z13 = true;
        }
        if (z12) {
            this.f14702l += write;
            return z13;
        }
        if (z13) {
            this.f14703m = (this.f14707q * i10) + this.f14703m;
        }
        return z13;
    }
}
