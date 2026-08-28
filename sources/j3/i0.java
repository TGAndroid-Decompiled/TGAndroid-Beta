package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import h3.x1;
import ih.j7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class i0 implements s {
    public static final Object f13253d0 = new Object();
    public static ExecutorService f13254e0;
    public static int f13255f0;
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
    public w X;
    public d0 Y;
    public boolean Z;
    public final g f13256a;
    public long f13257a0;
    public final a5.m f13258b;
    public boolean f13259b0;
    public final boolean f13260c;
    public boolean f13261c0;
    public final y d;
    public final u0 f13262e;
    public final j[] f13263f;
    public final j[] f13264g;
    public final d5.c h;
    public final v f13265i;
    public final ArrayDeque f13266j;
    public final boolean f13267k;
    public final int f13268l;
    public h0 f13269m;
    public final f2.d f13270n;
    public final f2.d f13271o;
    public final j0 f13272p;
    public i3.l f13273q;
    public q f13274r;
    public e0 f13275s;
    public e0 f13276t;
    public AudioTrack f13277u;
    public e v;
    public f0 f13278w;
    public f0 f13279x;
    public x1 f13280y;
    public ByteBuffer f13281z;

    public i0(a5.m mVar) {
        this.f13256a = (g) mVar.f98b;
        a5.m mVar2 = (a5.m) mVar.f99c;
        this.f13258b = mVar2;
        int i9 = d5.f0.f4349a;
        this.f13260c = false;
        this.f13267k = false;
        this.f13268l = 0;
        this.f13272p = (j0) mVar.d;
        ?? obj = new Object();
        this.h = obj;
        obj.c();
        this.f13265i = new v(new fa.c(this, 23));
        ?? xVar = new x();
        this.d = xVar;
        ?? xVar2 = new x();
        xVar2.f13364m = d5.f0.f4353f;
        this.f13262e = xVar2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new x(), xVar, xVar2);
        Collections.addAll(arrayList, (j[]) mVar2.f98b);
        this.f13263f = (j[]) arrayList.toArray(new j[0]);
        this.f13264g = new j[]{new x()};
        this.J = 1.0f;
        this.v = e.h;
        this.W = 0;
        this.X = new Object();
        x1 x1Var = x1.d;
        this.f13279x = new f0(x1Var, false, 0L, 0L);
        this.f13280y = x1Var;
        this.R = -1;
        this.K = new j[0];
        this.L = new ByteBuffer[0];
        this.f13266j = new ArrayDeque();
        this.f13270n = new f2.d(4);
        this.f13271o = new f2.d(4);
    }

    public static AudioFormat f(int i9, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i9).setChannelMask(i10).setEncoding(i11).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        if (d5.f0.f4349a >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(x1 x1Var) {
        x1 x1Var2 = new x1(d5.f0.g(x1Var.f9811a, 0.1f, 8.0f), d5.f0.g(x1Var.f9812b, 0.1f, 8.0f));
        if (this.f13267k && d5.f0.f4349a >= 23) {
            y(x1Var2);
        } else {
            x(x1Var2, i().f13239b);
        }
    }

    public final boolean B() {
        if (!this.Z && "audio/raw".equals(this.f13276t.f13230a.B)) {
            int i9 = this.f13276t.f13230a.Q;
            if (this.f13260c) {
                int i10 = d5.f0.f4349a;
                if (i9 != 536870912 && i9 != 805306368 && i9 != 4) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean C(h3.t0 t0Var, e eVar) {
        int i9;
        int m10;
        int i10;
        boolean z10;
        boolean z11;
        int i11 = d5.f0.f4349a;
        if (i11 >= 29 && (i9 = this.f13268l) != 0) {
            String str = t0Var.B;
            str.getClass();
            int b10 = d5.q.b(str, t0Var.f9766r);
            if (b10 == 0 || (m10 = d5.f0.m(t0Var.O)) == 0) {
                return false;
            }
            AudioFormat f10 = f(t0Var.P, m10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) eVar.a().f281b;
            if (i11 >= 31) {
                i10 = AudioManager.getPlaybackOffloadSupport(f10, audioAttributes);
            } else if (!AudioManager.isOffloadedPlaybackSupported(f10, audioAttributes)) {
                i10 = 0;
            } else if (i11 == 30 && d5.f0.d.startsWith("Pixel")) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return true;
                    }
                    throw new IllegalStateException();
                }
                if (t0Var.R == 0 && t0Var.S == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i9 == 1) {
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
        q qVar;
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
                d5.a.f(z11);
            } else {
                this.O = byteBuffer;
                if (d5.f0.f4349a < 21) {
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
            int i9 = d5.f0.f4349a;
            if (i9 < 21) {
                long j11 = this.D;
                v vVar = this.f13265i;
                int a2 = vVar.f13370e - ((int) (j11 - (vVar.a() * vVar.d)));
                if (a2 > 0) {
                    write = this.f13277u.write(this.P, this.Q, Math.min(remaining2, a2));
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
                d5.a.i(z10);
                AudioTrack audioTrack = this.f13277u;
                if (i9 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f13281z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f13281z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f13281z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.f13281z.putInt(4, remaining2);
                        this.f13281z.putLong(8, j10 * 1000);
                        this.f13281z.position(0);
                        this.A = remaining2;
                    }
                    int remaining3 = this.f13281z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.f13281z, remaining3, 1);
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
                write = this.f13277u.write(byteBuffer2, remaining2, 1);
            }
            this.f13257a0 = SystemClock.elapsedRealtime();
            f2.d dVar = this.f13271o;
            if (write < 0) {
                r rVar = new r(write, this.f13276t.f13230a, (((i9 < 24 || write != -6) && write != -32) || this.E <= 0) ? false : false);
                q qVar2 = this.f13274r;
                if (qVar2 != null) {
                    qVar2.w(rVar);
                }
                if (!rVar.f13335b) {
                    dVar.N(rVar);
                    return;
                }
                throw rVar;
            }
            dVar.f5338c = null;
            if (p(this.f13277u)) {
                if (this.E > 0) {
                    this.f13261c0 = false;
                }
                if (this.U && (qVar = this.f13274r) != null && write < remaining2 && !this.f13261c0) {
                    qVar.g();
                }
            }
            int i10 = this.f13276t.f13232c;
            if (i10 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i10 != 0) {
                    if (byteBuffer2 != this.M) {
                        z12 = false;
                    }
                    d5.a.i(z12);
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
        a5.m mVar = this.f13258b;
        if (B) {
            x1Var = i().f13238a;
            s0 s0Var = (s0) mVar.d;
            float f10 = x1Var.f9811a;
            if (s0Var.f13338c != f10) {
                s0Var.f13338c = f10;
                s0Var.f13342i = true;
            }
            float f11 = x1Var.f9812b;
            if (s0Var.d != f11) {
                s0Var.d = f11;
                s0Var.f13342i = true;
            }
        } else {
            x1Var = x1.d;
        }
        x1 x1Var2 = x1Var;
        int i9 = 0;
        if (B()) {
            boolean z11 = i().f13239b;
            ((p0) mVar.f99c).f13307m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.f13266j.add(new f0(x1Var2, z10, Math.max(0L, j10), (k() * 1000000) / this.f13276t.f13233e));
        j[] jVarArr = this.f13276t.f13236i;
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
            if (i9 >= jVarArr2.length) {
                break;
            }
            j jVar2 = jVarArr2[i9];
            jVar2.flush();
            this.L[i9] = jVar2.a();
            i9++;
        }
        q qVar = this.f13274r;
        if (qVar != null) {
            qVar.onSkipSilenceEnabledChanged(z10);
        }
    }

    public final void b(h3.t0 r24, int[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.b(h3.t0, int[]):void");
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.c():boolean");
    }

    public final void d() {
        boolean z10;
        if (d5.f0.f4349a >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        d5.a.i(this.V);
        if (!this.Z) {
            this.Z = true;
            e();
        }
    }

    public final void e() {
        if (o()) {
            w();
            AudioTrack audioTrack = this.f13265i.f13369c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f13277u.pause();
            }
            if (p(this.f13277u)) {
                h0 h0Var = this.f13269m;
                h0Var.getClass();
                h0Var.a(this.f13277u);
            }
            if (d5.f0.f4349a < 21 && !this.V) {
                this.W = 0;
            }
            e0 e0Var = this.f13275s;
            if (e0Var != null) {
                this.f13276t = e0Var;
                this.f13275s = null;
            }
            v vVar = this.f13265i;
            vVar.f13376l = 0L;
            vVar.f13386w = 0;
            vVar.v = 0;
            vVar.f13377m = 0L;
            vVar.C = 0L;
            vVar.F = 0L;
            vVar.f13375k = false;
            vVar.f13369c = null;
            vVar.f13371f = null;
            AudioTrack audioTrack2 = this.f13277u;
            d5.c cVar = this.h;
            cVar.b();
            synchronized (f13253d0) {
                try {
                    if (f13254e0 == null) {
                        f13254e0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f13255f0++;
                    f13254e0.execute(new j7(7, audioTrack2, cVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f13277u = null;
        }
        this.f13271o.f5338c = null;
        this.f13270n.f5338c = null;
    }

    public final long g(boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.g(boolean):long");
    }

    public final int h(h3.t0 t0Var) {
        String str = t0Var.B;
        int i9 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            if (!d5.f0.D(i9)) {
                e2.c.t(i9, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i9 != 2 && (!this.f13260c || i9 != 4)) {
                return 1;
            }
        } else if ((this.f13259b0 || !C(t0Var, this.v)) && this.f13256a.b(t0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final f0 i() {
        f0 f0Var = this.f13278w;
        if (f0Var != null) {
            return f0Var;
        }
        ArrayDeque arrayDeque = this.f13266j;
        if (!arrayDeque.isEmpty()) {
            return (f0) arrayDeque.getLast();
        }
        return this.f13279x;
    }

    public final long j() {
        e0 e0Var = this.f13276t;
        if (e0Var.f13232c == 0) {
            return this.B / e0Var.f13231b;
        }
        return this.C;
    }

    public final long k() {
        e0 e0Var = this.f13276t;
        if (e0Var.f13232c == 0) {
            return this.D / e0Var.d;
        }
        return this.E;
    }

    public final boolean l(long r26, int r28, java.nio.ByteBuffer r29) {
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.l(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean m() {
        if (o() && this.f13265i.b(k())) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.n():boolean");
    }

    public final boolean o() {
        if (this.f13277u != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.U = false;
        if (o()) {
            v vVar = this.f13265i;
            vVar.f13376l = 0L;
            vVar.f13386w = 0;
            vVar.v = 0;
            vVar.f13377m = 0L;
            vVar.C = 0L;
            vVar.F = 0L;
            vVar.f13375k = false;
            if (vVar.f13387x == -9223372036854775807L) {
                u uVar = vVar.f13371f;
                uVar.getClass();
                uVar.a();
                this.f13277u.pause();
            }
        }
    }

    public final void r() {
        this.U = true;
        if (o()) {
            u uVar = this.f13265i.f13371f;
            uVar.getClass();
            uVar.a();
            this.f13277u.play();
        }
    }

    public final void s() {
        if (!this.T) {
            this.T = true;
            long k10 = k();
            v vVar = this.f13265i;
            vVar.f13389z = vVar.a();
            vVar.f13387x = SystemClock.elapsedRealtime() * 1000;
            vVar.A = k10;
            this.f13277u.stop();
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
        int i9 = length;
        while (i9 >= 0) {
            if (i9 > 0) {
                byteBuffer = this.L[i9 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = j.f13282a;
                }
            }
            if (i9 == length) {
                D(byteBuffer, j10);
            } else {
                j jVar = this.K[i9];
                if (i9 > this.R) {
                    jVar.b(byteBuffer);
                }
                ByteBuffer a2 = jVar.a();
                this.L[i9] = a2;
                if (a2.hasRemaining()) {
                    i9++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i9--;
            } else {
                return;
            }
        }
    }

    public final void v() {
        e();
        for (j jVar : this.f13263f) {
            jVar.reset();
        }
        for (j jVar2 : this.f13264g) {
            jVar2.reset();
        }
        this.U = false;
        this.f13259b0 = false;
    }

    public final void w() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i9 = 0;
        this.f13261c0 = false;
        this.F = 0;
        this.f13279x = new f0(i().f13238a, i().f13239b, 0L, 0L);
        this.I = 0L;
        this.f13278w = null;
        this.f13266j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f13281z = null;
        this.A = 0;
        this.f13262e.f13366o = 0L;
        while (true) {
            j[] jVarArr = this.K;
            if (i9 < jVarArr.length) {
                j jVar = jVarArr[i9];
                jVar.flush();
                this.L[i9] = jVar.a();
                i9++;
            } else {
                return;
            }
        }
    }

    public final void x(x1 x1Var, boolean z10) {
        f0 i9 = i();
        if (x1Var.equals(i9.f13238a) && z10 == i9.f13239b) {
            return;
        }
        f0 f0Var = new f0(x1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.f13278w = f0Var;
        } else {
            this.f13279x = f0Var;
        }
    }

    public final void y(x1 x1Var) {
        if (o()) {
            try {
                this.f13277u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(x1Var.f9811a).setPitch(x1Var.f9812b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                d5.a.L("DefaultAudioSink", "Failed to set playback params", e10);
            }
            x1Var = new x1(this.f13277u.getPlaybackParams().getSpeed(), this.f13277u.getPlaybackParams().getPitch());
            float f10 = x1Var.f9811a;
            v vVar = this.f13265i;
            vVar.f13374j = f10;
            u uVar = vVar.f13371f;
            if (uVar != null) {
                uVar.a();
            }
        }
        this.f13280y = x1Var;
    }

    public final void z(w wVar) {
        if (this.X.equals(wVar)) {
            return;
        }
        wVar.getClass();
        if (this.f13277u != null) {
            this.X.getClass();
        }
        this.X = wVar;
    }
}
