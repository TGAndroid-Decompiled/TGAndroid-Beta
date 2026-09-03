package j3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.ai;
public final class f0 extends cb.e implements q {
    public final h7.u A;
    public final z9.d B;
    public final long C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public h2 J;
    public o4.q0 K;
    public w1 L;
    public e1 M;
    public n0 N;
    public AudioTrack O;
    public Object P;
    public Surface Q;
    public SurfaceHolder R;
    public boolean S;
    public TextureView T;
    public final int U;
    public h5.x V;
    public final int W;
    public l3.d X;
    public float Y;
    public boolean Z;
    public final boolean f8521a0;
    public final f5.x f8522b;
    public boolean f8523b0;
    public final w1 f8524c;
    public boolean f8525c0;
    public final h5.c d;
    public i5.y f8526d0;
    public final Context e;
    public e1 f8527e0;
    public final a2 f8528f;
    public u1 f8529f0;
    public final e[] f8530g;
    public int f8531g0;
    public final f5.t h;
    public long f8532h0;
    public final h5.a0 f8533i;
    public Executor f8534i0;
    public final u f8535j;
    public final ArrayList f8536j0;
    public final k0 f8537k;
    public final h5.m f8538l;
    public final CopyOnWriteArraySet f8539m;
    public final m2 f8540n;
    public final ArrayList f8541o;
    public final boolean f8542p;
    public final k3.f f8543q;
    public final Looper f8544r;
    public final g5.f f8545s;
    public final long f8546t;
    public final long f8547u;
    public final h5.y v;
    public final c0 f8548w;
    public final d0 f8549x;
    public final androidx.activity.o f8550y;
    public final d f8551z;

    static {
        l0.a("goog.exo.exoplayer");
    }

    public f0(p pVar, i2 i2Var) {
        super(3);
        boolean z4;
        f0 f0Var;
        k3.k a2;
        this.f8536j0 = new ArrayList();
        this.d = new Object();
        try {
            h5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + h5.d0.e + "]");
            Context context = pVar.f8749a;
            h5.y yVar = pVar.f8750b;
            this.e = context.getApplicationContext();
            this.f8543q = new k3.f(yVar);
            this.X = pVar.f8754i;
            this.U = pVar.f8755j;
            this.Z = false;
            this.C = pVar.f8762q;
            c0 c0Var = new c0(this);
            this.f8548w = c0Var;
            this.f8549x = new Object();
            Handler handler = new Handler(pVar.h);
            e[] b10 = ((l) pVar.f8751c.get()).b(handler, c0Var, c0Var, c0Var, c0Var);
            this.f8530g = b10;
            if (b10.length > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            this.h = (f5.t) pVar.e.get();
            pVar.d.get();
            this.f8545s = g5.s.b(pVar.f8753g.f8742b);
            this.f8542p = pVar.f8756k;
            this.J = pVar.f8757l;
            this.f8546t = pVar.f8758m;
            this.f8547u = pVar.f8759n;
            Looper looper = pVar.h;
            this.f8544r = looper;
            this.v = yVar;
            if (i2Var == 0) {
                f0Var = this;
            } else {
                f0Var = i2Var;
            }
            this.f8528f = f0Var;
            this.f8538l = new h5.m(looper, yVar, new u(this));
            this.f8539m = new CopyOnWriteArraySet();
            this.f8541o = new ArrayList();
            this.K = new o4.o0();
            this.f8522b = new f5.x(new g2[b10.length], new f5.c[b10.length], q2.f8784b, null);
            this.f8540n = new m2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 19; i10++) {
                int i11 = iArr[i10];
                h5.a.i(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.h.getClass();
            h5.a.i(!false);
            sparseBooleanArray.append(29, true);
            h5.a.i(!false);
            h5.g gVar = new h5.g(sparseBooleanArray);
            this.f8524c = new w1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < gVar.f6942a.size(); i12++) {
                int a10 = gVar.a(i12);
                h5.a.i(!false);
                sparseBooleanArray2.append(a10, true);
            }
            h5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            h5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            h5.a.i(!false);
            this.L = new w1(new h5.g(sparseBooleanArray2));
            this.f8533i = this.v.a(this.f8544r, null);
            u uVar = new u(this);
            this.f8535j = uVar;
            this.f8529f0 = u1.i(this.f8522b);
            this.f8543q.r(this.f8528f, this.f8544r);
            int i13 = h5.d0.f6924a;
            if (i13 < 31) {
                a2 = new k3.k();
            } else {
                a2 = y.a(this.e, this, pVar.f8763r);
            }
            this.f8537k = new k0(this.f8530g, this.h, this.f8522b, (j) pVar.f8752f.get(), this.f8545s, this.D, this.E, this.f8543q, this.J, pVar.f8760o, pVar.f8761p, this.f8544r, this.v, uVar, a2);
            this.Y = 1.0f;
            this.D = 0;
            e1 e1Var = e1.V;
            this.M = e1Var;
            this.f8527e0 = e1Var;
            int i14 = -1;
            this.f8531g0 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.O;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.O.release();
                    this.O = null;
                }
                if (this.O == null) {
                    this.O = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.W = this.O.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
                this.W = i14;
            }
            int i15 = v4.c.f45672b;
            this.f8521a0 = true;
            n(this.f8543q);
            g5.f fVar = this.f8545s;
            Handler handler2 = new Handler(this.f8544r);
            k3.f fVar2 = this.f8543q;
            g5.s sVar = (g5.s) fVar;
            sVar.getClass();
            fVar2.getClass();
            ja.c cVar = sVar.f6427b;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f9336b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                g5.e eVar = (g5.e) it.next();
                if (eVar.f6370b == fVar2) {
                    eVar.f6371c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new g5.e(handler2, fVar2));
            this.f8539m.add(this.f8548w);
            c0 c0Var2 = this.f8548w;
            ?? obj = new Object();
            obj.f333b = context.getApplicationContext();
            obj.f334c = new b(obj, handler, c0Var2);
            this.f8550y = obj;
            obj.d();
            d dVar = new d(context, handler, this.f8548w);
            this.f8551z = dVar;
            dVar.b(null);
            h7.u uVar2 = new h7.u(9);
            PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
            this.A = uVar2;
            z9.d dVar2 = new z9.d(9);
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            this.B = dVar2;
            e8.a aVar = new e8.a(0);
            aVar.f5163b = 0;
            aVar.f5164c = 0;
            aVar.a();
            this.f8526d0 = i5.y.e;
            this.V = h5.x.f6990c;
            this.h.b(this.X);
            V(1, 10, Integer.valueOf(this.W));
            V(2, 10, Integer.valueOf(this.W));
            V(1, 3, this.X);
            V(2, 4, Integer.valueOf(this.U));
            V(2, 5, 0);
            V(1, 9, Boolean.valueOf(this.Z));
            V(2, 7, this.f8549x);
            V(6, 8, this.f8549x);
            this.d.c();
        } catch (Throwable th2) {
            this.d.c();
            throw th2;
        }
    }

    public static long Q(u1 u1Var) {
        n2 n2Var = new n2();
        m2 m2Var = new m2();
        u1Var.f8814a.g(u1Var.f8815b.f16406a, m2Var);
        long j10 = u1Var.f8816c;
        if (j10 == -9223372036854775807L) {
            return u1Var.f8814a.m(m2Var.f8686c, n2Var, 0L).f8739x;
        }
        return m2Var.e + j10;
    }

    @Override
    public final Looper A() {
        return this.f8544r;
    }

    @Override
    public final boolean B() {
        j0();
        return this.E;
    }

    @Override
    public final long C() {
        j0();
        return h5.d0.S(O(this.f8529f0));
    }

    @Override
    public final long D() {
        j0();
        return this.f8546t;
    }

    @Override
    public final void J() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.19.1] [");
        sb.append(h5.d0.e);
        sb.append("] [");
        HashSet hashSet = l0.f8647a;
        synchronized (l0.class) {
            str = l0.f8648b;
        }
        sb.append(str);
        sb.append("]");
        h5.a.v("ExoPlayerImpl", sb.toString());
        j0();
        if (h5.d0.f6924a < 21 && (audioTrack = this.O) != null) {
            audioTrack.release();
            this.O = null;
        }
        this.f8550y.d();
        this.A.getClass();
        this.B.getClass();
        d dVar = this.f8551z;
        dVar.f8442c = null;
        dVar.a();
        if (!this.f8537k.w()) {
            this.f8538l.e(10, new f0.d(23));
        }
        this.f8538l.d();
        this.f8533i.f6913a.removeCallbacksAndMessages(null);
        g5.f fVar = this.f8545s;
        k3.f fVar2 = this.f8543q;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((g5.s) fVar).f6427b.f9336b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            g5.e eVar = (g5.e) it.next();
            if (eVar.f6370b == fVar2) {
                eVar.f6371c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        u1 u1Var = this.f8529f0;
        if (u1Var.f8825o) {
            this.f8529f0 = u1Var.a();
        }
        u1 g10 = this.f8529f0.g(1);
        this.f8529f0 = g10;
        u1 b10 = g10.b(g10.f8815b);
        this.f8529f0 = b10;
        b10.f8826p = b10.f8828r;
        this.f8529f0.f8827q = 0L;
        k3.f fVar3 = this.f8543q;
        h5.a0 a0Var = fVar3.f9691n;
        h5.a.j(a0Var);
        a0Var.c(new e3.h(fVar3, 20));
        this.h.a();
        U();
        Surface surface = this.Q;
        if (surface != null) {
            surface.release();
            this.Q = null;
        }
        int i10 = v4.c.f45672b;
        this.f8525c0 = true;
    }

    @Override
    public final void K(int i10, int i11, long j10) {
        boolean z4;
        j0();
        if (i10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        k3.f fVar = this.f8543q;
        if (!fVar.f9692r) {
            k3.a k10 = fVar.k();
            fVar.f9692r = true;
            fVar.q(k10, -1, new gg.f(k10, 15));
        }
        o2 o2Var = this.f8529f0.f8814a;
        if (!o2Var.p() && i10 >= o2Var.o()) {
            return;
        }
        this.F++;
        if (f()) {
            h5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            xe.g gVar = new xe.g(this.f8529f0);
            gVar.a(1);
            f0 f0Var = this.f8535j.f8811a;
            f0Var.f8533i.c(new ff.c(17, f0Var, gVar));
            return;
        }
        u1 u1Var = this.f8529f0;
        int i12 = u1Var.e;
        if (i12 == 3 || (i12 == 4 && !o2Var.p())) {
            u1Var = this.f8529f0.g(2);
        }
        int x10 = x();
        u1 R = R(u1Var, o2Var, S(o2Var, i10, j10));
        this.f8537k.f8633n.a(3, new j0(o2Var, i10, h5.d0.G(j10))).b();
        h0(R, 0, 1, true, 1, O(R), x10);
    }

    public final e1 L() {
        o2 z4 = z();
        if (z4.p()) {
            return this.f8527e0;
        }
        c1 c1Var = z4.m(x(), (n2) this.f2238a, 0L).f8733c;
        d1 a2 = this.f8527e0.a();
        e1 e1Var = c1Var.d;
        if (e1Var != null) {
            CharSequence charSequence = e1Var.f8507a;
            if (charSequence != null) {
                a2.f8447a = charSequence;
            }
            CharSequence charSequence2 = e1Var.f8508b;
            if (charSequence2 != null) {
                a2.f8448b = charSequence2;
            }
            CharSequence charSequence3 = e1Var.f8509c;
            if (charSequence3 != null) {
                a2.f8449c = charSequence3;
            }
            CharSequence charSequence4 = e1Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = e1Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = e1Var.f8510f;
            if (charSequence6 != null) {
                a2.f8450f = charSequence6;
            }
            CharSequence charSequence7 = e1Var.h;
            if (charSequence7 != null) {
                a2.f8451g = charSequence7;
            }
            f2 f2Var = e1Var.f8511n;
            if (f2Var != null) {
                a2.h = f2Var;
            }
            f2 f2Var2 = e1Var.f8512r;
            if (f2Var2 != null) {
                a2.f8452i = f2Var2;
            }
            byte[] bArr = e1Var.f8513s;
            if (bArr != null) {
                Integer num = e1Var.v;
                a2.f8453j = (byte[]) bArr.clone();
                a2.f8454k = num;
            }
            Uri uri = e1Var.f8514w;
            if (uri != null) {
                a2.f8455l = uri;
            }
            Integer num2 = e1Var.f8515x;
            if (num2 != null) {
                a2.f8456m = num2;
            }
            Integer num3 = e1Var.f8516y;
            if (num3 != null) {
                a2.f8457n = num3;
            }
            Integer num4 = e1Var.B;
            if (num4 != null) {
                a2.f8458o = num4;
            }
            Boolean bool = e1Var.C;
            if (bool != null) {
                a2.f8459p = bool;
            }
            Boolean bool2 = e1Var.D;
            if (bool2 != null) {
                a2.f8460q = bool2;
            }
            Integer num5 = e1Var.E;
            if (num5 != null) {
                a2.f8461r = num5;
            }
            Integer num6 = e1Var.F;
            if (num6 != null) {
                a2.f8461r = num6;
            }
            Integer num7 = e1Var.G;
            if (num7 != null) {
                a2.f8462s = num7;
            }
            Integer num8 = e1Var.H;
            if (num8 != null) {
                a2.f8463t = num8;
            }
            Integer num9 = e1Var.I;
            if (num9 != null) {
                a2.f8464u = num9;
            }
            Integer num10 = e1Var.J;
            if (num10 != null) {
                a2.v = num10;
            }
            Integer num11 = e1Var.K;
            if (num11 != null) {
                a2.f8465w = num11;
            }
            CharSequence charSequence8 = e1Var.L;
            if (charSequence8 != null) {
                a2.f8466x = charSequence8;
            }
            CharSequence charSequence9 = e1Var.M;
            if (charSequence9 != null) {
                a2.f8467y = charSequence9;
            }
            CharSequence charSequence10 = e1Var.N;
            if (charSequence10 != null) {
                a2.f8468z = charSequence10;
            }
            Integer num12 = e1Var.O;
            if (num12 != null) {
                a2.A = num12;
            }
            Integer num13 = e1Var.P;
            if (num13 != null) {
                a2.B = num13;
            }
            CharSequence charSequence11 = e1Var.Q;
            if (charSequence11 != null) {
                a2.C = charSequence11;
            }
            CharSequence charSequence12 = e1Var.R;
            if (charSequence12 != null) {
                a2.D = charSequence12;
            }
            CharSequence charSequence13 = e1Var.S;
            if (charSequence13 != null) {
                a2.E = charSequence13;
            }
            Integer num14 = e1Var.T;
            if (num14 != null) {
                a2.F = num14;
            }
            Bundle bundle = e1Var.U;
            if (bundle != null) {
                a2.G = bundle;
            }
        }
        return new e1(a2);
    }

    public final c2 M(b2 b2Var) {
        int i10;
        int P = P(this.f8529f0);
        o2 o2Var = this.f8529f0.f8814a;
        if (P == -1) {
            i10 = 0;
        } else {
            i10 = P;
        }
        h5.y yVar = this.v;
        k0 k0Var = this.f8537k;
        return new c2(k0Var, b2Var, o2Var, i10, yVar, k0Var.f8635s);
    }

    public final long N(u1 u1Var) {
        o4.v vVar = u1Var.f8815b;
        long j10 = u1Var.f8816c;
        o2 o2Var = u1Var.f8814a;
        if (vVar.a()) {
            Object obj = u1Var.f8815b.f16406a;
            m2 m2Var = this.f8540n;
            o2Var.g(obj, m2Var);
            if (j10 == -9223372036854775807L) {
                return h5.d0.S(o2Var.m(P(u1Var), (n2) this.f2238a, 0L).f8739x);
            }
            return h5.d0.S(j10) + h5.d0.S(m2Var.e);
        }
        return h5.d0.S(O(u1Var));
    }

    public final long O(u1 u1Var) {
        long j10;
        if (u1Var.f8814a.p()) {
            return h5.d0.G(this.f8532h0);
        }
        if (u1Var.f8825o) {
            j10 = u1Var.j();
        } else {
            j10 = u1Var.f8828r;
        }
        if (u1Var.f8815b.a()) {
            return j10;
        }
        o2 o2Var = u1Var.f8814a;
        Object obj = u1Var.f8815b.f16406a;
        m2 m2Var = this.f8540n;
        o2Var.g(obj, m2Var);
        return j10 + m2Var.e;
    }

    public final int P(u1 u1Var) {
        if (u1Var.f8814a.p()) {
            return this.f8531g0;
        }
        return u1Var.f8814a.g(u1Var.f8815b.f16406a, this.f8540n).f8686c;
    }

    public final u1 R(u1 u1Var, o2 o2Var, Pair pair) {
        boolean z4;
        o4.v vVar;
        o4.t0 t0Var;
        f5.x xVar;
        List list;
        int i10;
        long j10;
        if (!o2Var.p() && pair == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        o2 o2Var2 = u1Var.f8814a;
        long N = N(u1Var);
        u1 h = u1Var.h(o2Var);
        if (o2Var.p()) {
            o4.v vVar2 = u1.f8813t;
            long G = h5.d0.G(this.f8532h0);
            u1 b10 = h.c(vVar2, G, G, G, 0L, o4.t0.d, this.f8522b, s8.i0.e).b(vVar2);
            b10.f8826p = b10.f8828r;
            return b10;
        }
        Object obj = h.f8815b.f16406a;
        int i11 = h5.d0.f6924a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            vVar = new o4.u(pair.first);
        } else {
            vVar = h.f8815b;
        }
        long longValue = ((Long) pair.second).longValue();
        long G2 = h5.d0.G(N);
        if (!o2Var2.p()) {
            G2 -= o2Var2.g(obj, this.f8540n).e;
        }
        if (!equals || longValue < G2) {
            o4.v vVar3 = vVar;
            h5.a.i(!vVar3.a());
            if (!equals) {
                t0Var = o4.t0.d;
            } else {
                t0Var = h.h;
            }
            o4.t0 t0Var2 = t0Var;
            if (!equals) {
                xVar = this.f8522b;
            } else {
                xVar = h.f8819i;
            }
            f5.x xVar2 = xVar;
            if (!equals) {
                s8.t tVar = s8.v.f44222b;
                list = s8.i0.e;
            } else {
                list = h.f8820j;
            }
            u1 b11 = h.c(vVar3, longValue, longValue, longValue, 0L, t0Var2, xVar2, list).b(vVar3);
            b11.f8826p = longValue;
            return b11;
        } else if (i10 == 0) {
            int b12 = o2Var.b(h.f8821k.f16406a);
            if (b12 != -1 && o2Var.f(b12, this.f8540n, false).f8686c == o2Var.g(vVar.f16406a, this.f8540n).f8686c) {
                return h;
            }
            o2Var.g(vVar.f16406a, this.f8540n);
            if (vVar.a()) {
                j10 = this.f8540n.a(vVar.f16407b, vVar.f16408c);
            } else {
                j10 = this.f8540n.d;
            }
            o4.v vVar4 = vVar;
            u1 b13 = h.c(vVar4, h.f8828r, h.f8828r, h.d, j10 - h.f8828r, h.h, h.f8819i, h.f8820j).b(vVar4);
            b13.f8826p = j10;
            return b13;
        } else {
            o4.v vVar5 = vVar;
            h5.a.i(!vVar5.a());
            long max = Math.max(0L, h.f8827q - (longValue - G2));
            long j11 = h.f8826p;
            if (h.f8821k.equals(h.f8815b)) {
                j11 = longValue + max;
            }
            u1 c3 = h.c(vVar5, longValue, longValue, longValue, max, h.h, h.f8819i, h.f8820j);
            c3.f8826p = j11;
            return c3;
        }
    }

    public final Pair S(o2 o2Var, int i10, long j10) {
        if (o2Var.p()) {
            this.f8531g0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f8532h0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= o2Var.o()) {
            i10 = o2Var.a(this.E);
            j10 = h5.d0.S(o2Var.m(i10, (n2) this.f2238a, 0L).f8739x);
        }
        return o2Var.i((n2) this.f2238a, this.f8540n, i10, h5.d0.G(j10));
    }

    public final void T(int i10, int i11) {
        h5.x xVar = this.V;
        if (i10 == xVar.f6991a && i11 == xVar.f6992b) {
            return;
        }
        this.V = new h5.x(i10, i11);
        Executor executor = this.f8534i0;
        if (executor != null) {
            executor.execute(new v(this, i10, i11, 0));
            return;
        }
        this.f8538l.e(24, new w(i10, i11, 0));
        V(2, 14, new h5.x(i10, i11));
    }

    public final void U() {
        TextureView textureView = this.T;
        c0 c0Var = this.f8548w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                h5.a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.T.setSurfaceTextureListener(null);
            }
            this.T = null;
        }
        SurfaceHolder surfaceHolder = this.R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c0Var);
            this.R = null;
        }
    }

    public final void V(int i10, int i11, Object obj) {
        e[] eVarArr;
        for (e eVar : this.f8530g) {
            if (eVar.f8471b == i10) {
                c2 M = M(eVar);
                h5.a.i(!M.f8438g);
                M.d = i11;
                h5.a.i(!M.f8438g);
                M.e = obj;
                M.c();
            }
        }
    }

    public final void W(l3.d dVar, boolean z4) {
        l3.d dVar2;
        j0();
        if (this.f8525c0) {
            return;
        }
        boolean a2 = h5.d0.a(this.X, dVar);
        int i10 = 1;
        h5.m mVar = this.f8538l;
        if (!a2) {
            this.X = dVar;
            V(1, 3, dVar);
            mVar.c(20, new gg.f(dVar, 10));
        }
        if (z4) {
            dVar2 = dVar;
        } else {
            dVar2 = null;
        }
        d dVar3 = this.f8551z;
        dVar3.b(dVar2);
        this.h.b(dVar);
        boolean j10 = j();
        int d = dVar3.d(c(), j10);
        if (j10 && d != 1) {
            i10 = 2;
        }
        g0(d, i10, j10);
        mVar.b();
    }

    public final void X(o4.a aVar, boolean z4) {
        boolean z10;
        j0();
        List singletonList = Collections.singletonList(aVar);
        j0();
        int P = P(this.f8529f0);
        long C = C();
        this.F++;
        ArrayList arrayList = this.f8541o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            this.K = this.K.b(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            p1 p1Var = new p1((o4.a) singletonList.get(i11), this.f8542p);
            arrayList2.add(p1Var);
            arrayList.add(i11, new e0(p1Var.f8766b, p1Var.f8765a.f16379o));
        }
        this.K = this.K.e(arrayList2.size());
        e2 e2Var = new e2(arrayList, this.K);
        boolean p10 = e2Var.p();
        int i12 = e2Var.e;
        if (!p10 && -1 >= i12) {
            throw new IllegalStateException();
        }
        if (z4) {
            P = e2Var.a(this.E);
            C = -9223372036854775807L;
        }
        int i13 = P;
        u1 R = R(this.f8529f0, e2Var, S(e2Var, i13, C));
        int i14 = R.e;
        if (i13 != -1 && i14 != 1) {
            i14 = (e2Var.p() || i13 >= i12) ? 4 : 2;
        }
        u1 g10 = R.g(i14);
        this.f8537k.f8633n.a(17, new h0(arrayList2, this.K, i13, h5.d0.G(C))).b();
        if (!this.f8529f0.f8815b.f16406a.equals(g10.f8815b.f16406a) && !this.f8529f0.f8814a.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0(g10, 0, 1, z10, 4, O(g10), -1);
    }

    public final void Y(h2 h2Var) {
        j0();
        if (h2Var == null) {
            h2Var = h2.e;
        }
        if (!this.J.equals(h2Var)) {
            this.J = h2Var;
            this.f8537k.f8633n.a(5, h2Var).b();
        }
    }

    public final void Z(Surface surface) {
        e[] eVarArr;
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (e eVar : this.f8530g) {
            if (eVar.f8471b == 2) {
                c2 M = M(eVar);
                h5.a.i(!M.f8438g);
                M.d = 1;
                h5.a.i(true ^ M.f8438g);
                M.e = surface;
                M.c();
                arrayList.add(M);
            }
        }
        Object obj = this.P;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((c2) obj2).a(this.C);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            Object obj3 = this.P;
            Surface surface2 = this.Q;
            if (obj3 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused3) {
                }
                this.Q = null;
            }
        }
        this.P = surface;
        if (z4) {
            e0(new n(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final void a(v1 v1Var) {
        j0();
        if (this.f8529f0.f8824n.equals(v1Var)) {
            return;
        }
        u1 f10 = this.f8529f0.f(v1Var);
        this.F++;
        this.f8537k.f8633n.a(4, v1Var).b();
        h0(f10, 0, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void a0(Surface surface) {
        int i10;
        j0();
        U();
        Z(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        T(i10, i10);
    }

    @Override
    public final void b() {
        int i10;
        j0();
        boolean j10 = j();
        int i11 = 2;
        int d = this.f8551z.d(2, j10);
        if (j10 && d != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        g0(d, i10, j10);
        u1 u1Var = this.f8529f0;
        if (u1Var.e != 1) {
            return;
        }
        u1 e = u1Var.e(null);
        if (e.f8814a.p()) {
            i11 = 4;
        }
        u1 g10 = e.g(i11);
        this.F++;
        h5.a0 a0Var = this.f8537k.f8633n;
        a0Var.getClass();
        h5.z b10 = h5.a0.b();
        b10.f6994a = a0Var.f6913a.obtainMessage(0);
        b10.b();
        h0(g10, 1, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void b0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        j0();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        j0();
        if (holder == null) {
            j0();
            U();
            Z(null);
            T(0, 0);
            return;
        }
        U();
        this.S = true;
        this.R = holder;
        holder.addCallback(this.f8548w);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            Z(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            T(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        Z(null);
        T(0, 0);
    }

    @Override
    public final int c() {
        j0();
        return this.f8529f0.e;
    }

    public final void c0(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        j0();
        if (textureView == null) {
            j0();
            U();
            Z(null);
            T(0, 0);
            return;
        }
        U();
        this.T = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            h5.a.K("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f8548w);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            Z(null);
            T(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        Z(surface);
        this.Q = surface;
        T(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public final v1 d() {
        j0();
        return this.f8529f0.f8824n;
    }

    public final void d0(float f10) {
        j0();
        final float g10 = h5.d0.g(f10, 0.0f, 1.0f);
        if (this.Y == g10) {
            return;
        }
        this.Y = g10;
        V(1, 2, Float.valueOf(this.f8551z.f8444g * g10));
        this.f8538l.e(22, new h5.j() {
            @Override
            public final void invoke(Object obj) {
                ((y1) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override
    public final void e(int i10) {
        j0();
        if (this.D != i10) {
            this.D = i10;
            h5.a0 a0Var = this.f8537k.f8633n;
            a0Var.getClass();
            h5.z b10 = h5.a0.b();
            b10.f6994a = a0Var.f6913a.obtainMessage(11, i10, 0);
            b10.b();
            d4.b bVar = new d4.b(i10, 2);
            h5.m mVar = this.f8538l;
            mVar.c(8, bVar);
            f0();
            mVar.b();
        }
    }

    public final void e0(n nVar) {
        u1 u1Var = this.f8529f0;
        u1 b10 = u1Var.b(u1Var.f8815b);
        b10.f8826p = b10.f8828r;
        b10.f8827q = 0L;
        u1 g10 = b10.g(1);
        if (nVar != null) {
            g10 = g10.e(nVar);
        }
        u1 u1Var2 = g10;
        this.F++;
        h5.a0 a0Var = this.f8537k.f8633n;
        a0Var.getClass();
        h5.z b11 = h5.a0.b();
        b11.f6994a = a0Var.f6913a.obtainMessage(6);
        b11.b();
        h0(u1Var2, 0, 1, false, 5, -9223372036854775807L, -1);
    }

    @Override
    public final boolean f() {
        j0();
        return this.f8529f0.f8815b.a();
    }

    public final void f0() {
        boolean z4;
        int k10;
        boolean z10;
        int e;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        w1 w1Var = this.L;
        int i10 = h5.d0.f6924a;
        a2 a2Var = this.f8528f;
        boolean f10 = a2Var.f();
        cb.e eVar = (cb.e) a2Var;
        n2 n2Var = (n2) eVar.f2238a;
        o2 z21 = eVar.z();
        if (!z21.p() && z21.m(eVar.x(), n2Var, 0L).f8735n) {
            z4 = true;
        } else {
            z4 = false;
        }
        o2 z22 = eVar.z();
        if (z22.p()) {
            k10 = -1;
        } else {
            int x10 = eVar.x();
            int g10 = eVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k10 = z22.k(x10, g10, eVar.B());
        }
        if (k10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2 z23 = eVar.z();
        if (z23.p()) {
            e = -1;
        } else {
            int x11 = eVar.x();
            int g11 = eVar.g();
            if (g11 == 1) {
                g11 = 0;
            }
            e = z23.e(x11, g11, eVar.B());
        }
        if (e != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        o2 z24 = eVar.z();
        if (!z24.p() && z24.m(eVar.x(), n2Var, 0L).a()) {
            z12 = true;
        } else {
            z12 = false;
        }
        o2 z25 = eVar.z();
        if (!z25.p() && z25.m(eVar.x(), n2Var, 0L).f8736r) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean p10 = a2Var.z().p();
        ja.c cVar = new ja.c(14);
        c2.u uVar = (c2.u) cVar.f9336b;
        h5.g gVar = this.f8524c.f8854a;
        uVar.getClass();
        for (int i11 = 0; i11 < gVar.f6942a.size(); i11++) {
            uVar.b(gVar.a(i11));
        }
        boolean z26 = !f10;
        cVar.c(4, z26);
        if (z4 && !f10) {
            z14 = true;
        } else {
            z14 = false;
        }
        cVar.c(5, z14);
        if (z10 && !f10) {
            z15 = true;
        } else {
            z15 = false;
        }
        cVar.c(6, z15);
        if (!p10 && ((z10 || !z12 || z4) && !f10)) {
            z16 = true;
        } else {
            z16 = false;
        }
        cVar.c(7, z16);
        if (z11 && !f10) {
            z17 = true;
        } else {
            z17 = false;
        }
        cVar.c(8, z17);
        if (!p10 && ((z11 || (z12 && z13)) && !f10)) {
            z18 = true;
        } else {
            z18 = false;
        }
        cVar.c(9, z18);
        cVar.c(10, z26);
        if (z4 && !f10) {
            z19 = true;
        } else {
            z19 = false;
        }
        cVar.c(11, z19);
        if (z4 && !f10) {
            z20 = true;
        } else {
            z20 = false;
        }
        cVar.c(12, z20);
        w1 w1Var2 = new w1(uVar.c());
        this.L = w1Var2;
        if (!w1Var2.equals(w1Var)) {
            this.f8538l.c(13, new u(this));
        }
    }

    @Override
    public final int g() {
        j0();
        return this.D;
    }

    public final void g0(int i10, int i11, boolean z4) {
        ?? r14;
        int i12 = 0;
        if (z4 && i10 != -1) {
            r14 = 1;
        } else {
            r14 = 0;
        }
        if (r14 != 0 && i10 != 1) {
            i12 = 1;
        }
        u1 u1Var = this.f8529f0;
        if (u1Var.f8822l == r14 && u1Var.f8823m == i12) {
            return;
        }
        this.F++;
        boolean z10 = u1Var.f8825o;
        u1 u1Var2 = u1Var;
        if (z10) {
            u1Var2 = u1Var.a();
        }
        u1 d = u1Var2.d(i12, r14);
        h5.a0 a0Var = this.f8537k.f8633n;
        a0Var.getClass();
        h5.z b10 = h5.a0.b();
        b10.f6994a = a0Var.f6913a.obtainMessage(1, r14, i12);
        b10.b();
        h0(d, 0, i11, false, 5, -9223372036854775807L, -1);
    }

    @Override
    public final long getDuration() {
        j0();
        if (f()) {
            u1 u1Var = this.f8529f0;
            o4.v vVar = u1Var.f8815b;
            o2 o2Var = u1Var.f8814a;
            Object obj = vVar.f16406a;
            m2 m2Var = this.f8540n;
            o2Var.g(obj, m2Var);
            return h5.d0.S(m2Var.a(vVar.f16407b, vVar.f16408c));
        }
        o2 z4 = z();
        if (z4.p()) {
            return -9223372036854775807L;
        }
        return h5.d0.S(z4.m(x(), (n2) this.f2238a, 0L).f8740y);
    }

    @Override
    public final long h() {
        j0();
        return h5.d0.S(this.f8529f0.f8827q);
    }

    public final void h0(final u1 u1Var, final int i10, final int i11, boolean z4, int i12, long j10, int i13) {
        Pair pair;
        int i14;
        c1 c1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        Object obj;
        c1 c1Var2;
        Object obj2;
        int i16;
        long j11;
        long j12;
        long j13;
        long Q;
        Object obj3;
        c1 c1Var3;
        Object obj4;
        int i17;
        long j14;
        u1 u1Var2 = this.f8529f0;
        this.f8529f0 = u1Var;
        boolean equals = u1Var2.f8814a.equals(u1Var.f8814a);
        n2 n2Var = (n2) this.f2238a;
        m2 m2Var = this.f8540n;
        o2 o2Var = u1Var2.f8814a;
        o4.v vVar = u1Var2.f8815b;
        o2 o2Var2 = u1Var.f8814a;
        o4.v vVar2 = u1Var.f8815b;
        if (o2Var2.p() && o2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o2Var2.p() != o2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!o2Var.m(o2Var.g(vVar.f16406a, m2Var).f8686c, n2Var, 0L).f8731a.equals(o2Var2.m(o2Var2.g(vVar2.f16406a, m2Var).f8686c, n2Var, 0L).f8731a)) {
            if (z4 && i12 == 0) {
                i14 = 1;
            } else if (z4 && i12 == 1) {
                i14 = 2;
            } else if (!equals) {
                i14 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        } else if (z4 && i12 == 0 && vVar.d < vVar2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        e1 e1Var = this.M;
        if (booleanValue) {
            if (!u1Var.f8814a.p()) {
                c1Var = u1Var.f8814a.m(u1Var.f8814a.g(u1Var.f8815b.f16406a, this.f8540n).f8686c, (n2) this.f2238a, 0L).f8733c;
            } else {
                c1Var = null;
            }
            this.f8527e0 = e1.V;
        } else {
            c1Var = null;
        }
        if (booleanValue || !u1Var2.f8820j.equals(u1Var.f8820j)) {
            d1 a2 = this.f8527e0.a();
            List list = u1Var.f8820j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                e4.c cVar = (e4.c) list.get(i18);
                int i19 = 0;
                while (true) {
                    e4.b[] bVarArr = cVar.f5109a;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].c(a2);
                        i19++;
                    }
                }
            }
            this.f8527e0 = new e1(a2);
            e1Var = L();
        }
        boolean equals2 = e1Var.equals(this.M);
        this.M = e1Var;
        if (u1Var2.f8822l != u1Var.f8822l) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u1Var2.e != u1Var.e) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || z10) {
            i0();
        }
        if (u1Var2.f8818g != u1Var.f8818g) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!equals) {
            this.f8538l.c(0, new h5.j() {
                @Override
                public final void invoke(Object obj5) {
                    y1 y1Var = (y1) obj5;
                    switch (r3) {
                        case 0:
                            y1Var.onTimelineChanged(u1Var.f8814a, i10);
                            return;
                        default:
                            y1Var.onPlayWhenReadyChanged(u1Var.f8822l, i10);
                            return;
                    }
                }
            });
        }
        if (z4) {
            m2 m2Var2 = new m2();
            if (!u1Var2.f8814a.p()) {
                Object obj5 = u1Var2.f8815b.f16406a;
                u1Var2.f8814a.g(obj5, m2Var2);
                int i20 = m2Var2.f8686c;
                int b10 = u1Var2.f8814a.b(obj5);
                z13 = booleanValue;
                z14 = z10;
                z15 = equals2;
                obj = u1Var2.f8814a.m(i20, (n2) this.f2238a, 0L).f8731a;
                c1Var2 = ((n2) this.f2238a).f8733c;
                obj2 = obj5;
                i15 = i20;
                i16 = b10;
            } else {
                z13 = booleanValue;
                z14 = z10;
                z15 = equals2;
                i15 = i13;
                obj = null;
                c1Var2 = null;
                obj2 = null;
                i16 = -1;
            }
            if (i12 == 0) {
                if (u1Var2.f8815b.a()) {
                    o4.v vVar3 = u1Var2.f8815b;
                    j13 = m2Var2.a(vVar3.f16407b, vVar3.f16408c);
                    Q = Q(u1Var2);
                } else if (u1Var2.f8815b.e != -1) {
                    j13 = Q(this.f8529f0);
                    Q = j13;
                } else {
                    j11 = m2Var2.e;
                    j12 = m2Var2.d;
                    j13 = j11 + j12;
                    Q = j13;
                }
            } else if (u1Var2.f8815b.a()) {
                j13 = u1Var2.f8828r;
                Q = Q(u1Var2);
            } else {
                j11 = m2Var2.e;
                j12 = u1Var2.f8828r;
                j13 = j11 + j12;
                Q = j13;
            }
            long S = h5.d0.S(j13);
            long S2 = h5.d0.S(Q);
            o4.v vVar4 = u1Var2.f8815b;
            z1 z1Var = new z1(obj, i15, c1Var2, obj2, i16, S, S2, vVar4.f16407b, vVar4.f16408c);
            n2 n2Var2 = (n2) this.f2238a;
            int x10 = x();
            if (!this.f8529f0.f8814a.p()) {
                u1 u1Var3 = this.f8529f0;
                Object obj6 = u1Var3.f8815b.f16406a;
                u1Var3.f8814a.g(obj6, this.f8540n);
                int b11 = this.f8529f0.f8814a.b(obj6);
                Object obj7 = this.f8529f0.f8814a.m(x10, n2Var2, 0L).f8731a;
                c1Var3 = n2Var2.f8733c;
                i17 = b11;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                c1Var3 = null;
                obj4 = null;
                i17 = -1;
            }
            long S3 = h5.d0.S(j10);
            if (this.f8529f0.f8815b.a()) {
                j14 = h5.d0.S(Q(this.f8529f0));
            } else {
                j14 = S3;
            }
            o4.v vVar5 = this.f8529f0.f8815b;
            this.f8538l.c(11, new e3.d(i12, z1Var, new z1(obj3, x10, c1Var3, obj4, i17, S3, j14, vVar5.f16407b, vVar5.f16408c), 1));
        } else {
            z13 = booleanValue;
            z14 = z10;
            z15 = equals2;
        }
        if (z13) {
            this.f8538l.c(1, new gg.m2(c1Var, intValue, 1));
        }
        if (u1Var2.f8817f != u1Var.f8817f) {
            this.f8538l.c(10, new h5.j() {
                @Override
                public final void invoke(Object obj8) {
                    y1 y1Var = (y1) obj8;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
            if (u1Var.f8817f != null) {
                this.f8538l.c(10, new h5.j() {
                    @Override
                    public final void invoke(Object obj8) {
                        y1 y1Var = (y1) obj8;
                        switch (r2) {
                            case 0:
                                u1 u1Var4 = u1Var;
                                y1Var.onLoadingChanged(u1Var4.f8818g);
                                y1Var.onIsLoadingChanged(u1Var4.f8818g);
                                return;
                            case 1:
                                u1 u1Var5 = u1Var;
                                y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                                return;
                            case 2:
                                y1Var.onPlaybackStateChanged(u1Var.e);
                                return;
                            case 3:
                                y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                                return;
                            case 4:
                                y1Var.onIsPlayingChanged(u1Var.k());
                                return;
                            case 5:
                                y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                                return;
                            case 6:
                                y1Var.onPlayerErrorChanged(u1Var.f8817f);
                                return;
                            case 7:
                                y1Var.onPlayerError(u1Var.f8817f);
                                return;
                            default:
                                y1Var.onTracksChanged(u1Var.f8819i.d);
                                return;
                        }
                    }
                });
            }
        }
        f5.x xVar = u1Var2.f8819i;
        f5.x xVar2 = u1Var.f8819i;
        if (xVar != xVar2) {
            f5.t tVar = this.h;
            Object obj8 = xVar2.e;
            tVar.getClass();
            tVar.f5953c = (f5.s) obj8;
            this.f8538l.c(2, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        if (!z15) {
            this.f8538l.c(14, new gg.f(this.M, 9));
        }
        if (z12) {
            this.f8538l.c(3, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        if (z11 || z14) {
            this.f8538l.c(-1, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        if (z11) {
            this.f8538l.c(4, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        if (z14) {
            this.f8538l.c(5, new h5.j() {
                @Override
                public final void invoke(Object obj52) {
                    y1 y1Var = (y1) obj52;
                    switch (r3) {
                        case 0:
                            y1Var.onTimelineChanged(u1Var.f8814a, i11);
                            return;
                        default:
                            y1Var.onPlayWhenReadyChanged(u1Var.f8822l, i11);
                            return;
                    }
                }
            });
        }
        if (u1Var2.f8823m != u1Var.f8823m) {
            this.f8538l.c(6, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        if (u1Var2.k() != u1Var.k()) {
            this.f8538l.c(7, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        if (!u1Var2.f8824n.equals(u1Var.f8824n)) {
            this.f8538l.c(12, new h5.j() {
                @Override
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (r2) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.f8818g);
                            y1Var.onIsLoadingChanged(u1Var4.f8818g);
                            return;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.f8822l, u1Var5.e);
                            return;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            return;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.f8823m);
                            return;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            return;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.f8824n);
                            return;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f8817f);
                            return;
                        case 7:
                            y1Var.onPlayerError(u1Var.f8817f);
                            return;
                        default:
                            y1Var.onTracksChanged(u1Var.f8819i.d);
                            return;
                    }
                }
            });
        }
        f0();
        this.f8538l.b();
        if (u1Var2.f8825o != u1Var.f8825o) {
            Iterator it = this.f8539m.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f8423a.i0();
            }
        }
    }

    @Override
    public final w1 i() {
        j0();
        return this.L;
    }

    public final void i0() {
        int c3 = c();
        z9.d dVar = this.B;
        h7.u uVar = this.A;
        if (c3 != 1) {
            if (c3 != 2 && c3 != 3) {
                if (c3 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                j0();
                boolean z4 = this.f8529f0.f8825o;
                j();
                uVar.getClass();
                j();
                dVar.getClass();
                return;
            }
        }
        uVar.getClass();
        dVar.getClass();
    }

    @Override
    public final boolean j() {
        j0();
        return this.f8529f0.f8822l;
    }

    public final void j0() {
        IllegalStateException illegalStateException;
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f8544r;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = h5.d0.f6924a;
            Locale locale = Locale.US;
            String k10 = ai.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f8521a0) {
                if (this.f8523b0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                h5.a.L("ExoPlayerImpl", k10, illegalStateException);
                this.f8523b0 = true;
                return;
            }
            throw new IllegalStateException(k10);
        }
    }

    @Override
    public final void k(boolean z4) {
        j0();
        if (this.E != z4) {
            this.E = z4;
            h5.a0 a0Var = this.f8537k.f8633n;
            a0Var.getClass();
            h5.z b10 = h5.a0.b();
            b10.f6994a = a0Var.f6913a.obtainMessage(12, z4 ? 1 : 0, 0);
            b10.b();
            x xVar = new x(0, z4);
            h5.m mVar = this.f8538l;
            mVar.c(9, xVar);
            f0();
            mVar.b();
        }
    }

    @Override
    public final void l() {
        int i10;
        int i11;
        boolean z4;
        Pair S;
        j0();
        ArrayList arrayList = this.f8541o;
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size > 0 && min != 0) {
            u1 u1Var = this.f8529f0;
            int P = P(u1Var);
            long N = N(u1Var);
            o2 o2Var = u1Var.f8814a;
            int size2 = arrayList.size();
            this.F++;
            for (int i12 = min - 1; i12 >= 0; i12--) {
                arrayList.remove(i12);
            }
            this.K = this.K.b(min);
            e2 e2Var = new e2(arrayList, this.K);
            if (o2Var.p() || e2Var.p()) {
                i10 = 1;
                int i13 = -1;
                i11 = 0;
                if (!o2Var.p() && e2Var.p()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    i13 = P;
                }
                if (z4) {
                    N = -9223372036854775807L;
                }
                S = S(e2Var, i13, N);
            } else {
                Pair i14 = o2Var.i((n2) this.f2238a, this.f8540n, P, h5.d0.G(N));
                Object obj = i14.first;
                if (e2Var.b(obj) != -1) {
                    S = i14;
                    i10 = 1;
                } else {
                    i10 = 1;
                    Object G = k0.G((n2) this.f2238a, this.f8540n, this.D, this.E, obj, o2Var, e2Var);
                    if (G != null) {
                        m2 m2Var = this.f8540n;
                        e2Var.g(G, m2Var);
                        int i15 = m2Var.f8686c;
                        n2 n2Var = (n2) this.f2238a;
                        e2Var.m(i15, n2Var, 0L);
                        S = S(e2Var, i15, h5.d0.S(n2Var.f8739x));
                    } else {
                        S = S(e2Var, -1, -9223372036854775807L);
                    }
                }
                i11 = 0;
            }
            u1 R = R(u1Var, e2Var, S);
            int i16 = R.e;
            if (i16 != i10 && i16 != 4 && min > 0 && min == size2 && P >= R.f8814a.o()) {
                R = R.g(4);
            }
            o4.q0 q0Var = this.K;
            h5.a0 a0Var = this.f8537k.f8633n;
            a0Var.getClass();
            h5.z b10 = h5.a0.b();
            b10.f6994a = a0Var.f6913a.obtainMessage(20, i11, min, q0Var);
            b10.b();
            h0(R, 0, 1, !R.f8815b.f16406a.equals(this.f8529f0.f8815b.f16406a), 4, O(R), -1);
        }
    }

    @Override
    public final int m() {
        j0();
        if (this.f8529f0.f8814a.p()) {
            return 0;
        }
        u1 u1Var = this.f8529f0;
        return u1Var.f8814a.b(u1Var.f8815b.f16406a);
    }

    @Override
    public final void n(y1 y1Var) {
        y1Var.getClass();
        this.f8538l.a(y1Var);
    }

    @Override
    public final int o() {
        j0();
        if (f()) {
            return this.f8529f0.f8815b.f16408c;
        }
        return -1;
    }

    @Override
    public final void p(boolean z4) {
        j0();
        int d = this.f8551z.d(c(), z4);
        int i10 = 1;
        if (z4 && d != 1) {
            i10 = 2;
        }
        g0(d, i10, z4);
    }

    @Override
    public final long q() {
        j0();
        return this.f8547u;
    }

    @Override
    public final long r() {
        j0();
        return N(this.f8529f0);
    }

    @Override
    public final long s() {
        j0();
        if (f()) {
            u1 u1Var = this.f8529f0;
            if (u1Var.f8821k.equals(u1Var.f8815b)) {
                return h5.d0.S(this.f8529f0.f8826p);
            }
            return getDuration();
        }
        j0();
        if (this.f8529f0.f8814a.p()) {
            return this.f8532h0;
        }
        u1 u1Var2 = this.f8529f0;
        if (u1Var2.f8821k.d != u1Var2.f8815b.d) {
            return h5.d0.S(u1Var2.f8814a.m(x(), (n2) this.f2238a, 0L).f8740y);
        }
        long j10 = u1Var2.f8826p;
        if (this.f8529f0.f8821k.a()) {
            u1 u1Var3 = this.f8529f0;
            m2 g10 = u1Var3.f8814a.g(u1Var3.f8821k.f16406a, this.f8540n);
            long d = g10.d(this.f8529f0.f8821k.f16407b);
            if (d == Long.MIN_VALUE) {
                j10 = g10.d;
            } else {
                j10 = d;
            }
        }
        u1 u1Var4 = this.f8529f0;
        o2 o2Var = u1Var4.f8814a;
        Object obj = u1Var4.f8821k.f16406a;
        m2 m2Var = this.f8540n;
        o2Var.g(obj, m2Var);
        return h5.d0.S(j10 + m2Var.e);
    }

    @Override
    public final void stop() {
        j0();
        this.f8551z.d(1, j());
        e0(null);
        new v4.c(this.f8529f0.f8828r, s8.i0.e);
    }

    @Override
    public final q2 t() {
        j0();
        return this.f8529f0.f8819i.d;
    }

    @Override
    public final void u(y1 y1Var) {
        j0();
        y1Var.getClass();
        h5.m mVar = this.f8538l;
        mVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = mVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h5.l lVar = (h5.l) it.next();
            if (lVar.f6944a.equals(y1Var)) {
                h5.k kVar = mVar.f6949c;
                lVar.d = true;
                if (lVar.f6946c) {
                    lVar.f6946c = false;
                    kVar.d(lVar.f6944a, lVar.f6945b.c());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    @Override
    public final n v() {
        j0();
        return this.f8529f0.f8817f;
    }

    @Override
    public final int w() {
        j0();
        if (f()) {
            return this.f8529f0.f8815b.f16407b;
        }
        return -1;
    }

    @Override
    public final int x() {
        j0();
        int P = P(this.f8529f0);
        if (P == -1) {
            return 0;
        }
        return P;
    }

    @Override
    public final int y() {
        j0();
        return this.f8529f0.f8823m;
    }

    @Override
    public final o2 z() {
        j0();
        return this.f8529f0.f8814a;
    }
}
