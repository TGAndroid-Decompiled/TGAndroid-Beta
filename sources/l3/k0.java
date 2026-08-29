package l3;

import ag.o1;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import j3.x1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jh.w2;
public final class k0 implements t {
    public static final Object f14113d0 = new Object();
    public static ExecutorService f14114e0;
    public static int f14115f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public j[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public x X;
    public e0 Y;
    public boolean Z;
    public final g f14116a;
    public long f14117a0;
    public final g0 f14118b;
    public boolean f14119b0;
    public final boolean f14120c;
    public boolean f14121c0;
    public final z d;
    public final v0 f14122e;
    public final j[] f14123f;
    public final j[] f14124g;
    public final f5.c h;
    public final w f14125i;
    public final ArrayDeque f14126j;
    public final boolean f14127k;
    public final int f14128l;
    public j0 f14129m;
    public final f2.c f14130n;
    public final f2.c f14131o;
    public final l0 f14132p;
    public k3.k f14133q;
    public r f14134r;
    public f0 f14135s;
    public f0 f14136t;
    public AudioTrack f14137u;
    public e v;
    public h0 f14138w;
    public h0 f14139x;
    public x1 f14140y;
    public ByteBuffer f14141z;

    public k0(androidx.biometric.e eVar) {
        this.f14116a = (g) eVar.f1030b;
        g0 g0Var = (g0) eVar.f1031c;
        this.f14118b = g0Var;
        int i10 = f5.d0.f6579a;
        this.f14120c = false;
        this.f14127k = false;
        this.f14128l = 0;
        this.f14132p = (l0) eVar.d;
        ?? obj = new Object();
        this.h = obj;
        obj.c();
        this.f14125i = new w(new o1(this, 20));
        ?? yVar = new y();
        this.d = yVar;
        ?? yVar2 = new y();
        yVar2.f14223m = f5.d0.f6583f;
        this.f14122e = yVar2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new y(), yVar, yVar2);
        Collections.addAll(arrayList, (j[]) g0Var.f14096b);
        this.f14123f = (j[]) arrayList.toArray(new j[0]);
        this.f14124g = new j[]{new y()};
        this.J = 1.0f;
        this.v = e.h;
        this.W = 0;
        this.X = new Object();
        x1 x1Var = x1.d;
        this.f14139x = new h0(x1Var, false, 0L, 0L);
        this.f14140y = x1Var;
        this.R = -1;
        this.K = new j[0];
        this.L = new ByteBuffer[0];
        this.f14126j = new ArrayDeque();
        this.f14130n = new f2.c(4);
        this.f14131o = new f2.c(4);
    }

    public static AudioFormat f(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        if (f5.d0.f6579a >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(x1 x1Var) {
        x1 x1Var2 = new x1(f5.d0.g(x1Var.f10848a, 0.1f, 8.0f), f5.d0.g(x1Var.f10849b, 0.1f, 8.0f));
        if (this.f14127k && f5.d0.f6579a >= 23) {
            y(x1Var2);
        } else {
            x(x1Var2, i().f14103b);
        }
    }

    public final boolean B() {
        if (!this.Z && "audio/raw".equals(this.f14136t.f14084a.B)) {
            int i10 = this.f14136t.f14084a.Q;
            if (this.f14120c) {
                int i11 = f5.d0.f6579a;
                if (i10 != 536870912 && i10 != 805306368 && i10 != 4) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean C(j3.t0 t0Var, e eVar) {
        int i10;
        int m10;
        int i11;
        boolean z10;
        boolean z11;
        int i12 = f5.d0.f6579a;
        if (i12 >= 29 && (i10 = this.f14128l) != 0) {
            String str = t0Var.B;
            str.getClass();
            int b10 = f5.o.b(str, t0Var.f10803r);
            if (b10 == 0 || (m10 = f5.d0.m(t0Var.O)) == 0) {
                return false;
            }
            AudioFormat f9 = f(t0Var.P, m10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) eVar.a().f7981b;
            if (i12 >= 31) {
                i11 = AudioManager.getPlaybackOffloadSupport(f9, audioAttributes);
            } else if (!AudioManager.isOffloadedPlaybackSupported(f9, audioAttributes)) {
                i11 = 0;
            } else if (i12 == 30 && f5.d0.d.startsWith("Pixel")) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return true;
                    }
                    throw new IllegalStateException();
                }
                if (t0Var.R == 0 && t0Var.S == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void D(ByteBuffer byteBuffer, long j10) {
        ByteBuffer byteBuffer2;
        int write;
        boolean z10;
        int write2;
        r rVar;
        boolean z11;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            boolean z12 = true;
            if (byteBuffer3 != null) {
                if (byteBuffer3 == byteBuffer) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f5.a.f(z11);
            } else {
                this.O = byteBuffer;
                if (f5.d0.f6579a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = f5.d0.f6579a;
            if (i10 < 21) {
                long j11 = this.D;
                w wVar = this.f14125i;
                int a2 = wVar.f14229e - ((int) (j11 - (wVar.a() * wVar.d)));
                if (a2 > 0) {
                    write = this.f14137u.write(this.P, this.Q, Math.min(remaining2, a2));
                    if (write > 0) {
                        this.Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.Z) {
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                AudioTrack audioTrack = this.f14137u;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f14141z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f14141z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f14141z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.f14141z.putInt(4, remaining2);
                        this.f14141z.putLong(8, j10 * 1000);
                        this.f14141z.position(0);
                        this.A = remaining2;
                    }
                    int remaining3 = this.f14141z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.f14141z, remaining3, 1);
                        if (write < 0) {
                            this.A = 0;
                        } else if (write < remaining3) {
                            write = 0;
                        }
                    }
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write2 < 0) {
                        this.A = 0;
                    } else {
                        this.A -= write2;
                    }
                }
                write = write2;
            } else {
                byteBuffer2 = byteBuffer;
                write = this.f14137u.write(byteBuffer2, remaining2, 1);
            }
            this.f14117a0 = SystemClock.elapsedRealtime();
            f2.c cVar = this.f14131o;
            if (write < 0) {
                s sVar = new s(write, this.f14136t.f14084a, (((i10 < 24 || write != -6) && write != -32) || this.E <= 0) ? false : false);
                r rVar2 = this.f14134r;
                if (rVar2 != null) {
                    rVar2.v(sVar);
                }
                if (!sVar.f14175b) {
                    cVar.K(sVar);
                    return;
                }
                throw sVar;
            }
            cVar.f6283c = null;
            if (p(this.f14137u)) {
                if (this.E > 0) {
                    this.f14121c0 = false;
                }
                if (this.U && (rVar = this.f14134r) != null && write < remaining2 && !this.f14121c0) {
                    rVar.f();
                }
            }
            int i11 = this.f14136t.f14086c;
            if (i11 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer2 != this.M) {
                        z12 = false;
                    }
                    f5.a.i(z12);
                    this.E = (this.F * this.N) + this.E;
                }
                this.O = null;
            }
        }
    }

    public final void a(long j10) {
        x1 x1Var;
        boolean z10;
        boolean B = B();
        g0 g0Var = this.f14118b;
        if (B) {
            x1Var = i().f14102a;
            t0 t0Var = (t0) g0Var.d;
            float f9 = x1Var.f10848a;
            if (t0Var.f14197c != f9) {
                t0Var.f14197c = f9;
                t0Var.f14201i = true;
            }
            float f10 = x1Var.f10849b;
            if (t0Var.d != f10) {
                t0Var.d = f10;
                t0Var.f14201i = true;
            }
        } else {
            x1Var = x1.d;
        }
        x1 x1Var2 = x1Var;
        int i10 = 0;
        if (B()) {
            boolean z11 = i().f14103b;
            ((r0) g0Var.f14097c).f14166m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.f14126j.add(new h0(x1Var2, z10, Math.max(0L, j10), (k() * 1000000) / this.f14136t.f14087e));
        j[] jVarArr = this.f14136t.f14090i;
        ArrayList arrayList = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.isActive()) {
                arrayList.add(jVar);
            } else {
                jVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (j[]) arrayList.toArray(new j[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            j[] jVarArr2 = this.K;
            if (i10 >= jVarArr2.length) {
                break;
            }
            j jVar2 = jVarArr2[i10];
            jVar2.flush();
            this.L[i10] = jVar2.a();
            i10++;
        }
        r rVar = this.f14134r;
        if (rVar != null) {
            rVar.onSkipSilenceEnabledChanged(z10);
        }
    }

    public final void b(j3.t0 r24, int[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.b(j3.t0, int[]):void");
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.c():boolean");
    }

    public final void d() {
        boolean z10;
        if (f5.d0.f6579a >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        f5.a.i(this.V);
        if (!this.Z) {
            this.Z = true;
            e();
        }
    }

    public final void e() {
        if (o()) {
            w();
            AudioTrack audioTrack = this.f14125i.f14228c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f14137u.pause();
            }
            if (p(this.f14137u)) {
                j0 j0Var = this.f14129m;
                j0Var.getClass();
                j0Var.a(this.f14137u);
            }
            if (f5.d0.f6579a < 21 && !this.V) {
                this.W = 0;
            }
            f0 f0Var = this.f14135s;
            if (f0Var != null) {
                this.f14136t = f0Var;
                this.f14135s = null;
            }
            w wVar = this.f14125i;
            wVar.f14235l = 0L;
            wVar.f14245w = 0;
            wVar.v = 0;
            wVar.f14236m = 0L;
            wVar.C = 0L;
            wVar.F = 0L;
            wVar.f14234k = false;
            wVar.f14228c = null;
            wVar.f14230f = null;
            AudioTrack audioTrack2 = this.f14137u;
            f5.c cVar = this.h;
            cVar.b();
            synchronized (f14113d0) {
                try {
                    if (f14114e0 == null) {
                        f14114e0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f14115f0++;
                    f14114e0.execute(new w2(21, audioTrack2, cVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14137u = null;
        }
        this.f14131o.f6283c = null;
        this.f14130n.f6283c = null;
    }

    public final long g(boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.g(boolean):long");
    }

    public final int h(j3.t0 t0Var) {
        String str = t0Var.B;
        int i10 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            if (!f5.d0.D(i10)) {
                com.google.android.recaptcha.internal.a.s(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2 && (!this.f14120c || i10 != 4)) {
                return 1;
            }
        } else if ((this.f14119b0 || !C(t0Var, this.v)) && this.f14116a.b(t0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final h0 i() {
        h0 h0Var = this.f14138w;
        if (h0Var != null) {
            return h0Var;
        }
        ArrayDeque arrayDeque = this.f14126j;
        if (!arrayDeque.isEmpty()) {
            return (h0) arrayDeque.getLast();
        }
        return this.f14139x;
    }

    public final long j() {
        f0 f0Var = this.f14136t;
        if (f0Var.f14086c == 0) {
            return this.B / f0Var.f14085b;
        }
        return this.C;
    }

    public final long k() {
        f0 f0Var = this.f14136t;
        if (f0Var.f14086c == 0) {
            return this.D / f0Var.d;
        }
        return this.E;
    }

    public final boolean l(long r26, int r28, java.nio.ByteBuffer r29) {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.l(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean m() {
        if (o() && this.f14125i.b(k())) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: l3.k0.n():boolean");
    }

    public final boolean o() {
        if (this.f14137u != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.U = false;
        if (o()) {
            w wVar = this.f14125i;
            wVar.f14235l = 0L;
            wVar.f14245w = 0;
            wVar.v = 0;
            wVar.f14236m = 0L;
            wVar.C = 0L;
            wVar.F = 0L;
            wVar.f14234k = false;
            if (wVar.f14246x == -9223372036854775807L) {
                v vVar = wVar.f14230f;
                vVar.getClass();
                vVar.a();
                this.f14137u.pause();
            }
        }
    }

    public final void r() {
        this.U = true;
        if (o()) {
            v vVar = this.f14125i.f14230f;
            vVar.getClass();
            vVar.a();
            this.f14137u.play();
        }
    }

    public final void s() {
        if (!this.T) {
            this.T = true;
            long k9 = k();
            w wVar = this.f14125i;
            wVar.f14248z = wVar.a();
            wVar.f14246x = SystemClock.elapsedRealtime() * 1000;
            wVar.A = k9;
            this.f14137u.stop();
            this.A = 0;
        }
    }

    public final void t() {
        if (!this.S && o() && c()) {
            s();
            this.S = true;
        }
    }

    public final void u(long j10) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = j.f14106a;
                }
            }
            if (i10 == length) {
                D(byteBuffer, j10);
            } else {
                j jVar = this.K[i10];
                if (i10 > this.R) {
                    jVar.b(byteBuffer);
                }
                ByteBuffer a2 = jVar.a();
                this.L[i10] = a2;
                if (a2.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    public final void v() {
        e();
        for (j jVar : this.f14123f) {
            jVar.reset();
        }
        for (j jVar2 : this.f14124g) {
            jVar2.reset();
        }
        this.U = false;
        this.f14119b0 = false;
    }

    public final void w() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f14121c0 = false;
        this.F = 0;
        this.f14139x = new h0(i().f14102a, i().f14103b, 0L, 0L);
        this.I = 0L;
        this.f14138w = null;
        this.f14126j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f14141z = null;
        this.A = 0;
        this.f14122e.f14225o = 0L;
        while (true) {
            j[] jVarArr = this.K;
            if (i10 < jVarArr.length) {
                j jVar = jVarArr[i10];
                jVar.flush();
                this.L[i10] = jVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void x(x1 x1Var, boolean z10) {
        h0 i10 = i();
        if (x1Var.equals(i10.f14102a) && z10 == i10.f14103b) {
            return;
        }
        h0 h0Var = new h0(x1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.f14138w = h0Var;
        } else {
            this.f14139x = h0Var;
        }
    }

    public final void y(x1 x1Var) {
        if (o()) {
            try {
                this.f14137u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(x1Var.f10848a).setPitch(x1Var.f10849b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                f5.a.L("DefaultAudioSink", "Failed to set playback params", e10);
            }
            x1Var = new x1(this.f14137u.getPlaybackParams().getSpeed(), this.f14137u.getPlaybackParams().getPitch());
            float f9 = x1Var.f10848a;
            w wVar = this.f14125i;
            wVar.f14233j = f9;
            v vVar = wVar.f14230f;
            if (vVar != null) {
                vVar.a();
            }
        }
        this.f14140y = x1Var;
    }

    public final void z(x xVar) {
        if (this.X.equals(xVar)) {
            return;
        }
        xVar.getClass();
        if (this.f14137u != null) {
            this.X.getClass();
        }
        this.X = xVar;
    }
}
