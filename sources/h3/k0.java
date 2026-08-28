package h3;

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
import bg.x2;
import fh.y5;
import gh.i3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.DispatchQueue;
public final class k0 extends a8.a implements s {
    public final d A;
    public final m2 B;
    public final ya.b C;
    public final za.a D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public j2 L;
    public j4.g1 M;
    public y1 N;
    public h1 O;
    public t0 P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public boolean U;
    public TextureView V;
    public final int W;
    public d5.z X;
    public final int Y;
    public j3.e Z;
    public float f9531a0;
    public final b5.a0 f9532b;
    public boolean f9533b0;
    public final y1 f9534c;
    public final boolean f9535c0;
    public final d5.c d;
    public boolean f9536d0;
    public final Context f9537e;
    public boolean f9538e0;
    public final c2 f9539f;
    public m f9540f0;
    public final e[] f9541g;
    public e5.z f9542g0;
    public final b5.w h;
    public h1 f9543h0;
    public final d5.c0 f9544i;
    public w1 f9545i0;
    public final w f9546j;
    public int f9547j0;
    public final q0 f9548k;
    public long f9549k0;
    public final d5.n f9550l;
    public DispatchQueue f9551l0;
    public final CopyOnWriteArraySet f9552m;
    public final ArrayList m0;
    public final p2 f9553n;
    public final ArrayList f9554o;
    public final boolean f9555p;
    public final j4.c0 f9556q;
    public final i3.f f9557r;
    public final Looper f9558s;
    public final com.google.android.exoplayer2.upstream.f f9559t;
    public final long f9560u;
    public final long v;
    public final d5.a0 f9561w;
    public final h0 f9562x;
    public final i0 f9563y;
    public final androidx.activity.o f9564z;

    static {
        r0.a("goog.exo.exoplayer");
    }

    public k0(r rVar, k2 k2Var) {
        super(3);
        boolean z10;
        k0 k0Var;
        i3.l a2;
        this.m0 = new ArrayList();
        this.d = new Object();
        try {
            d5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.3] [" + d5.f0.f4352e + "]");
            Context context = rVar.f9669a;
            d5.a0 a0Var = rVar.f9670b;
            this.f9537e = context.getApplicationContext();
            this.f9557r = new i3.f(a0Var);
            this.Z = rVar.f9675i;
            this.W = rVar.f9676j;
            this.f9533b0 = false;
            this.E = rVar.f9683q;
            h0 h0Var = new h0(this);
            this.f9562x = h0Var;
            this.f9563y = new Object();
            Handler handler = new Handler(rVar.h);
            e[] b10 = ((l) rVar.f9671c.get()).b(handler, h0Var, h0Var, h0Var, h0Var);
            this.f9541g = b10;
            if (b10.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5.a.i(z10);
            this.h = (b5.w) rVar.f9672e.get();
            this.f9556q = (j4.c0) rVar.d.get();
            this.f9559t = com.google.android.exoplayer2.upstream.u.b(rVar.f9674g.f9624b);
            this.f9555p = rVar.f9677k;
            this.L = rVar.f9678l;
            this.f9560u = rVar.f9679m;
            this.v = rVar.f9680n;
            Looper looper = rVar.h;
            this.f9558s = looper;
            this.f9561w = a0Var;
            if (k2Var == 0) {
                k0Var = this;
            } else {
                k0Var = k2Var;
            }
            this.f9539f = k0Var;
            this.f9550l = new d5.n(looper, a0Var, new w(this));
            this.f9552m = new CopyOnWriteArraySet();
            this.f9554o = new ArrayList();
            this.M = new j4.e1();
            this.f9532b = new b5.a0(new i2[b10.length], new b5.t[b10.length], t2.f9773b, null);
            this.f9553n = new p2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i9 = 0; i9 < 21; i9++) {
                int i10 = iArr[i9];
                d5.a.i(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.h.getClass();
            d5.a.i(!false);
            sparseBooleanArray.append(29, true);
            d5.a.i(!false);
            d5.g gVar = new d5.g(sparseBooleanArray);
            this.f9534c = new y1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < gVar.f4361a.size(); i11++) {
                int a3 = gVar.a(i11);
                d5.a.i(!false);
                sparseBooleanArray2.append(a3, true);
            }
            d5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            d5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            d5.a.i(!false);
            this.N = new y1(new d5.g(sparseBooleanArray2));
            this.f9544i = this.f9561w.a(this.f9558s, null);
            w wVar = new w(this);
            this.f9546j = wVar;
            this.f9545i0 = w1.h(this.f9532b);
            this.f9557r.m(this.f9539f, this.f9558s);
            int i12 = d5.f0.f4349a;
            if (i12 < 31) {
                a2 = new i3.l();
            } else {
                a2 = b0.a(this.f9537e, this, rVar.f9684r);
            }
            this.f9548k = new q0(this.f9541g, this.h, this.f9532b, (j) rVar.f9673f.get(), this.f9559t, this.F, this.G, this.f9557r, this.L, rVar.f9681o, rVar.f9682p, this.f9558s, this.f9561w, wVar, a2);
            this.f9531a0 = 1.0f;
            this.F = 0;
            h1 h1Var = h1.U;
            this.O = h1Var;
            this.f9543h0 = h1Var;
            int i13 = -1;
            this.f9547j0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.Y = this.Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f9537e.getSystemService("audio");
                if (audioManager != null) {
                    i13 = audioManager.generateAudioSessionId();
                }
                this.Y = i13;
            }
            int i14 = r4.c.f47056b;
            this.f9535c0 = true;
            k(this.f9557r);
            com.google.android.exoplayer2.upstream.f fVar = this.f9559t;
            Handler handler2 = new Handler(this.f9558s);
            i3.f fVar2 = this.f9557r;
            com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) fVar;
            uVar.getClass();
            fVar2.getClass();
            xa.c cVar = uVar.f2619b;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f49099b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
                if (eVar.f2546b == fVar2) {
                    eVar.f2547c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new com.google.android.exoplayer2.upstream.e(handler2, fVar2));
            this.f9552m.add(this.f9562x);
            h0 h0Var2 = this.f9562x;
            ?? obj = new Object();
            obj.f388b = context.getApplicationContext();
            obj.f389c = new b(obj, handler, h0Var2);
            this.f9564z = obj;
            obj.d();
            d dVar = new d(context, handler, this.f9562x);
            this.A = dVar;
            dVar.b(null);
            m2 m2Var = new m2(context, handler, this.f9562x);
            this.B = m2Var;
            m2Var.c(d5.f0.y(this.Z.f13227c));
            ya.b bVar = new ya.b(8);
            PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
            this.C = bVar;
            za.a aVar = new za.a(8);
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            this.D = aVar;
            this.f9540f0 = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f9596f));
            this.f9542g0 = e5.z.f4953e;
            this.X = d5.z.f4413c;
            this.h.b(this.Z);
            c0(1, 10, Integer.valueOf(this.Y));
            c0(2, 10, Integer.valueOf(this.Y));
            c0(1, 3, this.Z);
            c0(2, 4, Integer.valueOf(this.W));
            c0(2, 5, 0);
            c0(1, 9, Boolean.valueOf(this.f9533b0));
            c0(2, 7, this.f9563y);
            c0(6, 8, this.f9563y);
            this.d.c();
        } catch (Throwable th) {
            this.d.c();
            throw th;
        }
    }

    public static long W(w1 w1Var) {
        q2 q2Var = new q2();
        p2 p2Var = new p2();
        w1Var.f9789a.g(w1Var.f9790b.f13426a, p2Var);
        long j10 = w1Var.f9791c;
        if (j10 == -9223372036854775807L) {
            return w1Var.f9789a.m(p2Var.f9639c, q2Var, 0L).f9667x;
        }
        return p2Var.f9640e + j10;
    }

    public static boolean X(w1 w1Var) {
        if (w1Var.f9792e == 3 && w1Var.f9798l && w1Var.f9799m == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final r2 A() {
        q0();
        return this.f9545i0.f9789a;
    }

    @Override
    public final Looper B() {
        return this.f9558s;
    }

    @Override
    public final boolean C() {
        q0();
        return this.G;
    }

    @Override
    public final long D() {
        q0();
        return d5.f0.S(T(this.f9545i0));
    }

    @Override
    public final long E() {
        q0();
        return this.f9560u;
    }

    @Override
    public final void N() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.3] [");
        sb2.append(d5.f0.f4352e);
        sb2.append("] [");
        HashSet hashSet = r0.f9686a;
        synchronized (r0.class) {
            str = r0.f9687b;
        }
        sb2.append(str);
        sb2.append("]");
        d5.a.v("ExoPlayerImpl", sb2.toString());
        q0();
        if (d5.f0.f4349a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.f9564z.d();
        m2 m2Var = this.B;
        androidx.mediarouter.app.h hVar = m2Var.f9595e;
        if (hVar != null) {
            try {
                m2Var.f9592a.unregisterReceiver(hVar);
            } catch (RuntimeException e10) {
                d5.a.L("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            m2Var.f9595e = null;
        }
        this.C.getClass();
        this.D.getClass();
        d dVar = this.A;
        dVar.f9369c = null;
        dVar.a();
        if (!this.f9548k.z()) {
            this.f9550l.e(10, new y5(9));
        }
        this.f9550l.d();
        this.f9544i.f4337a.removeCallbacksAndMessages(null);
        com.google.android.exoplayer2.upstream.f fVar = this.f9559t;
        i3.f fVar2 = this.f9557r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((com.google.android.exoplayer2.upstream.u) fVar).f2619b.f49099b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
            if (eVar.f2546b == fVar2) {
                eVar.f2547c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        w1 f10 = this.f9545i0.f(1);
        this.f9545i0 = f10;
        w1 a2 = f10.a(f10.f9790b);
        this.f9545i0 = a2;
        a2.f9802p = a2.f9804r;
        this.f9545i0.f9803q = 0L;
        i3.f fVar3 = this.f9557r;
        d5.c0 c0Var = fVar3.f10894n;
        d5.a.j(c0Var);
        c0Var.c(new fh.o1(fVar3, 29));
        this.h.a();
        b0();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        int i9 = r4.c.f47056b;
        this.f9538e0 = true;
    }

    @Override
    public final void O(long j10, int i9, int i10, boolean z10) {
        boolean z11;
        q0();
        int i11 = 1;
        if (i9 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.f(z11);
        i3.f fVar = this.f9557r;
        if (!fVar.f10895r) {
            i3.a a2 = fVar.a();
            fVar.f10895r = true;
            fVar.l(a2, -1, new i3.c(a2, 0));
        }
        r2 r2Var = this.f9545i0.f9789a;
        if (!r2Var.p() && i9 >= r2Var.o()) {
            return;
        }
        this.H++;
        if (c()) {
            d5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            te.f fVar2 = new te.f(this.f9545i0);
            fVar2.a(1);
            k0 k0Var = this.f9546j.f9787a;
            k0Var.f9544i.c(new e5.u(29, k0Var, fVar2));
            return;
        }
        if (b() != 1) {
            i11 = 2;
        }
        int x10 = x();
        w1 Y = Y(this.f9545i0.f(i11), r2Var, Z(r2Var, i9, j10));
        this.f9548k.f9649n.a(3, new p0(r2Var, i9, d5.f0.H(j10))).b();
        o0(Y, 0, 1, true, true, 1, T(Y), x10, z10);
    }

    public final ArrayList Q(int i9, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            r1 r1Var = new r1((j4.a) list.get(i10), this.f9555p);
            arrayList.add(r1Var);
            j0 j0Var = new j0(r1Var.f9689b, r1Var.f9688a.f13601o);
            this.f9554o.add(i10 + i9, j0Var);
        }
        this.M = this.M.e(i9, arrayList.size());
        return arrayList;
    }

    public final h1 R() {
        r2 A = A();
        if (A.p()) {
            return this.f9543h0;
        }
        f1 f1Var = A.m(x(), (q2) this.f108a, 0L).f9660c;
        g1 a2 = this.f9543h0.a();
        h1 h1Var = f1Var.d;
        if (h1Var != null) {
            CharSequence charSequence = h1Var.f9466a;
            if (charSequence != null) {
                a2.f9411a = charSequence;
            }
            CharSequence charSequence2 = h1Var.f9467b;
            if (charSequence2 != null) {
                a2.f9412b = charSequence2;
            }
            CharSequence charSequence3 = h1Var.f9468c;
            if (charSequence3 != null) {
                a2.f9413c = charSequence3;
            }
            CharSequence charSequence4 = h1Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = h1Var.f9469e;
            if (charSequence5 != null) {
                a2.f9414e = charSequence5;
            }
            CharSequence charSequence6 = h1Var.f9470f;
            if (charSequence6 != null) {
                a2.f9415f = charSequence6;
            }
            CharSequence charSequence7 = h1Var.h;
            if (charSequence7 != null) {
                a2.f9416g = charSequence7;
            }
            g2 g2Var = h1Var.f9471n;
            if (g2Var != null) {
                a2.h = g2Var;
            }
            g2 g2Var2 = h1Var.f9472r;
            if (g2Var2 != null) {
                a2.f9417i = g2Var2;
            }
            byte[] bArr = h1Var.f9473s;
            if (bArr != null) {
                Integer num = h1Var.v;
                a2.f9418j = (byte[]) bArr.clone();
                a2.f9419k = num;
            }
            Uri uri = h1Var.f9474w;
            if (uri != null) {
                a2.f9420l = uri;
            }
            Integer num2 = h1Var.f9475x;
            if (num2 != null) {
                a2.f9421m = num2;
            }
            Integer num3 = h1Var.f9476y;
            if (num3 != null) {
                a2.f9422n = num3;
            }
            Integer num4 = h1Var.A;
            if (num4 != null) {
                a2.f9423o = num4;
            }
            Boolean bool = h1Var.B;
            if (bool != null) {
                a2.f9424p = bool;
            }
            Boolean bool2 = h1Var.C;
            if (bool2 != null) {
                a2.f9425q = bool2;
            }
            Integer num5 = h1Var.D;
            if (num5 != null) {
                a2.f9426r = num5;
            }
            Integer num6 = h1Var.E;
            if (num6 != null) {
                a2.f9426r = num6;
            }
            Integer num7 = h1Var.F;
            if (num7 != null) {
                a2.f9427s = num7;
            }
            Integer num8 = h1Var.G;
            if (num8 != null) {
                a2.f9428t = num8;
            }
            Integer num9 = h1Var.H;
            if (num9 != null) {
                a2.f9429u = num9;
            }
            Integer num10 = h1Var.I;
            if (num10 != null) {
                a2.v = num10;
            }
            Integer num11 = h1Var.J;
            if (num11 != null) {
                a2.f9430w = num11;
            }
            CharSequence charSequence8 = h1Var.K;
            if (charSequence8 != null) {
                a2.f9431x = charSequence8;
            }
            CharSequence charSequence9 = h1Var.L;
            if (charSequence9 != null) {
                a2.f9432y = charSequence9;
            }
            CharSequence charSequence10 = h1Var.M;
            if (charSequence10 != null) {
                a2.f9433z = charSequence10;
            }
            Integer num12 = h1Var.N;
            if (num12 != null) {
                a2.A = num12;
            }
            Integer num13 = h1Var.O;
            if (num13 != null) {
                a2.B = num13;
            }
            CharSequence charSequence11 = h1Var.P;
            if (charSequence11 != null) {
                a2.C = charSequence11;
            }
            CharSequence charSequence12 = h1Var.Q;
            if (charSequence12 != null) {
                a2.D = charSequence12;
            }
            CharSequence charSequence13 = h1Var.R;
            if (charSequence13 != null) {
                a2.E = charSequence13;
            }
            Integer num14 = h1Var.S;
            if (num14 != null) {
                a2.F = num14;
            }
            Bundle bundle = h1Var.T;
            if (bundle != null) {
                a2.G = bundle;
            }
        }
        return new h1(a2);
    }

    public final e2 S(d2 d2Var) {
        int i9;
        int U = U();
        r2 r2Var = this.f9545i0.f9789a;
        if (U == -1) {
            i9 = 0;
        } else {
            i9 = U;
        }
        d5.a0 a0Var = this.f9561w;
        q0 q0Var = this.f9548k;
        return new e2(q0Var, d2Var, r2Var, i9, a0Var, q0Var.f9651s);
    }

    public final long T(w1 w1Var) {
        if (w1Var.f9789a.p()) {
            return d5.f0.H(this.f9549k0);
        }
        if (w1Var.f9790b.a()) {
            return w1Var.f9804r;
        }
        r2 r2Var = w1Var.f9789a;
        j4.d0 d0Var = w1Var.f9790b;
        long j10 = w1Var.f9804r;
        Object obj = d0Var.f13426a;
        p2 p2Var = this.f9553n;
        r2Var.g(obj, p2Var);
        return j10 + p2Var.f9640e;
    }

    public final int U() {
        if (this.f9545i0.f9789a.p()) {
            return this.f9547j0;
        }
        w1 w1Var = this.f9545i0;
        return w1Var.f9789a.g(w1Var.f9790b.f13426a, this.f9553n).f9639c;
    }

    public final Pair V(r2 r2Var, f2 f2Var) {
        boolean z10;
        long q10 = q();
        int i9 = -1;
        if (!r2Var.p() && !f2Var.p()) {
            Pair i10 = r2Var.i((q2) this.f108a, this.f9553n, x(), d5.f0.H(q10));
            Object obj = i10.first;
            if (f2Var.b(obj) != -1) {
                return i10;
            }
            Object I = q0.I((q2) this.f108a, this.f9553n, this.F, this.G, obj, r2Var, f2Var);
            if (I != null) {
                p2 p2Var = this.f9553n;
                f2Var.g(I, p2Var);
                int i11 = p2Var.f9639c;
                q2 q2Var = (q2) this.f108a;
                f2Var.m(i11, q2Var, 0L);
                return Z(f2Var, i11, d5.f0.S(q2Var.f9667x));
            }
            return Z(f2Var, -1, -9223372036854775807L);
        }
        if (!r2Var.p() && f2Var.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i9 = U();
        }
        if (z10) {
            q10 = -9223372036854775807L;
        }
        return Z(f2Var, i9, q10);
    }

    public final w1 Y(w1 w1Var, r2 r2Var, Pair pair) {
        boolean z10;
        j4.d0 d0Var;
        j4.j1 j1Var;
        b5.a0 a0Var;
        List list;
        int i9;
        long j10;
        if (!r2Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        d5.a.f(z10);
        r2 r2Var2 = w1Var.f9789a;
        w1 g10 = w1Var.g(r2Var);
        if (r2Var.p()) {
            j4.d0 d0Var2 = w1.f9788s;
            long H = d5.f0.H(this.f9549k0);
            w1 a2 = g10.b(d0Var2, H, H, H, 0L, j4.j1.d, this.f9532b, o8.l0.f19056e).a(d0Var2);
            a2.f9802p = a2.f9804r;
            return a2;
        }
        Object obj = g10.f9790b.f13426a;
        int i10 = d5.f0.f4349a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            d0Var = new j4.d0(pair.first);
        } else {
            d0Var = g10.f9790b;
        }
        long longValue = ((Long) pair.second).longValue();
        long H2 = d5.f0.H(q());
        if (!r2Var2.p()) {
            H2 -= r2Var2.g(obj, this.f9553n).f9640e;
        }
        if (!equals || longValue < H2) {
            j4.d0 d0Var3 = d0Var;
            d5.a.i(!d0Var3.a());
            if (!equals) {
                j1Var = j4.j1.d;
            } else {
                j1Var = g10.h;
            }
            j4.j1 j1Var2 = j1Var;
            if (!equals) {
                a0Var = this.f9532b;
            } else {
                a0Var = g10.f9795i;
            }
            b5.a0 a0Var2 = a0Var;
            if (!equals) {
                o8.x xVar = o8.z.f19105b;
                list = o8.l0.f19056e;
            } else {
                list = g10.f9796j;
            }
            w1 a3 = g10.b(d0Var3, longValue, longValue, longValue, 0L, j1Var2, a0Var2, list).a(d0Var3);
            a3.f9802p = longValue;
            return a3;
        } else if (i9 == 0) {
            int b10 = r2Var.b(g10.f9797k.f13426a);
            if (b10 != -1 && r2Var.f(b10, this.f9553n, false).f9639c == r2Var.g(d0Var.f13426a, this.f9553n).f9639c) {
                return g10;
            }
            r2Var.g(d0Var.f13426a, this.f9553n);
            if (d0Var.a()) {
                j10 = this.f9553n.a(d0Var.f13427b, d0Var.f13428c);
            } else {
                j10 = this.f9553n.d;
            }
            j4.d0 d0Var4 = d0Var;
            w1 a10 = g10.b(d0Var4, g10.f9804r, g10.f9804r, g10.d, j10 - g10.f9804r, g10.h, g10.f9795i, g10.f9796j).a(d0Var4);
            a10.f9802p = j10;
            return a10;
        } else {
            j4.d0 d0Var5 = d0Var;
            d5.a.i(!d0Var5.a());
            long max = Math.max(0L, g10.f9803q - (longValue - H2));
            long j11 = g10.f9802p;
            if (g10.f9797k.equals(g10.f9790b)) {
                j11 = longValue + max;
            }
            w1 b11 = g10.b(d0Var5, longValue, longValue, longValue, max, g10.h, g10.f9795i, g10.f9796j);
            b11.f9802p = j11;
            return b11;
        }
    }

    public final Pair Z(r2 r2Var, int i9, long j10) {
        if (r2Var.p()) {
            this.f9547j0 = i9;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f9549k0 = j10;
            return null;
        }
        if (i9 == -1 || i9 >= r2Var.o()) {
            i9 = r2Var.a(this.G);
            j10 = d5.f0.S(r2Var.m(i9, (q2) this.f108a, 0L).f9667x);
        }
        return r2Var.i((q2) this.f108a, this.f9553n, i9, d5.f0.H(j10));
    }

    @Override
    public final void a() {
        int i9;
        q0();
        boolean h = h();
        int i10 = 2;
        int d = this.A.d(2, h);
        if (h && d != 1) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        n0(d, i9, h);
        w1 w1Var = this.f9545i0;
        if (w1Var.f9792e != 1) {
            return;
        }
        w1 d9 = w1Var.d(null);
        if (d9.f9789a.p()) {
            i10 = 4;
        }
        w1 f10 = d9.f(i10);
        this.H++;
        d5.c0 c0Var = this.f9548k.f9649n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.f4334a = c0Var.f4337a.obtainMessage(0);
        b10.b();
        o0(f10, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void a0(int i9, int i10) {
        d5.z zVar = this.X;
        if (i9 == zVar.f4414a && i10 == zVar.f4415b) {
            return;
        }
        this.X = new d5.z(i9, i10);
        DispatchQueue dispatchQueue = this.f9551l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new y(this, i9, i10, 0));
            return;
        }
        this.f9550l.e(24, new z(i9, i10, 0));
    }

    @Override
    public final int b() {
        q0();
        return this.f9545i0.f9792e;
    }

    public final void b0() {
        TextureView textureView = this.V;
        h0 h0Var = this.f9562x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != h0Var) {
                d5.a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(h0Var);
            this.T = null;
        }
    }

    @Override
    public final boolean c() {
        q0();
        return this.f9545i0.f9790b.a();
    }

    public final void c0(int i9, int i10, Object obj) {
        e[] eVarArr;
        for (e eVar : this.f9541g) {
            if (eVar.getTrackType() == i9) {
                e2 S = S(eVar);
                d5.a.i(!S.f9389g);
                S.d = i10;
                d5.a.i(!S.f9389g);
                S.f9387e = obj;
                S.c();
            }
        }
    }

    @Override
    public final long d() {
        q0();
        return d5.f0.S(this.f9545i0.f9803q);
    }

    public final void d0(j3.e eVar, boolean z10) {
        j3.e eVar2;
        q0();
        if (this.f9538e0) {
            return;
        }
        boolean a2 = d5.f0.a(this.Z, eVar);
        int i9 = 1;
        d5.n nVar = this.f9550l;
        if (!a2) {
            this.Z = eVar;
            c0(1, 3, eVar);
            this.B.c(d5.f0.y(eVar.f13227c));
            nVar.c(20, new i3(eVar, 9));
        }
        if (z10) {
            eVar2 = eVar;
        } else {
            eVar2 = null;
        }
        d dVar = this.A;
        dVar.b(eVar2);
        this.h.b(eVar);
        boolean h = h();
        int d = dVar.d(b(), h);
        if (h && d != 1) {
            i9 = 2;
        }
        n0(d, i9, h);
        nVar.b();
    }

    @Override
    public final void e(int i9) {
        q0();
        if (this.F != i9) {
            this.F = i9;
            d5.c0 c0Var = this.f9548k.f9649n;
            c0Var.getClass();
            d5.b0 b10 = d5.c0.b();
            b10.f4334a = c0Var.f4337a.obtainMessage(11, i9, 0);
            b10.b();
            x xVar = new x(i9, 0);
            d5.n nVar = this.f9550l;
            nVar.c(8, xVar);
            m0();
            nVar.b();
        }
    }

    public final void e0(j4.a aVar, boolean z10) {
        boolean z11;
        q0();
        List singletonList = Collections.singletonList(aVar);
        q0();
        int U = U();
        long D = D();
        this.H++;
        ArrayList arrayList = this.f9554o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = size - 1; i9 >= 0; i9--) {
                arrayList.remove(i9);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Q = Q(0, singletonList);
        f2 f2Var = new f2(arrayList, this.M);
        boolean p6 = f2Var.p();
        int i10 = f2Var.f9403e;
        if (!p6 && -1 >= i10) {
            throw new IllegalStateException();
        }
        if (z10) {
            U = f2Var.a(this.G);
            D = -9223372036854775807L;
        }
        int i11 = U;
        w1 Y = Y(this.f9545i0, f2Var, Z(f2Var, i11, D));
        int i12 = Y.f9792e;
        if (i11 != -1 && i12 != 1) {
            i12 = (f2Var.p() || i11 >= i10) ? 4 : 2;
        }
        w1 f10 = Y.f(i12);
        this.f9548k.f9649n.a(17, new m0(Q, this.M, i11, d5.f0.H(D))).b();
        if (!this.f9545i0.f9790b.f13426a.equals(f10.f9790b.f13426a) && !this.f9545i0.f9789a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        o0(f10, 0, 1, false, z11, 4, T(f10), -1, false);
    }

    @Override
    public final y1 f() {
        q0();
        return this.N;
    }

    public final void f0(j2 j2Var) {
        q0();
        if (j2Var == null) {
            j2Var = j2.f9523e;
        }
        if (!this.L.equals(j2Var)) {
            this.L = j2Var;
            this.f9548k.f9649n.a(5, j2Var).b();
        }
    }

    @Override
    public final int g() {
        q0();
        return this.F;
    }

    public final void g0(Surface surface) {
        e[] eVarArr;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (e eVar : this.f9541g) {
            if (eVar.getTrackType() == 2) {
                e2 S = S(eVar);
                d5.a.i(!S.f9389g);
                S.d = 1;
                d5.a.i(true ^ S.f9389g);
                S.f9387e = surface;
                S.c();
                arrayList.add(S);
            }
        }
        Object obj = this.R;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    ((e2) obj2).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.R;
            Surface surface2 = this.S;
            if (obj3 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused3) {
                }
                this.S = null;
            }
        }
        this.R = surface;
        if (z10) {
            l0(new n(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final long getDuration() {
        q0();
        if (c()) {
            w1 w1Var = this.f9545i0;
            j4.d0 d0Var = w1Var.f9790b;
            r2 r2Var = w1Var.f9789a;
            Object obj = d0Var.f13426a;
            p2 p2Var = this.f9553n;
            r2Var.g(obj, p2Var);
            return d5.f0.S(p2Var.a(d0Var.f13427b, d0Var.f13428c));
        }
        r2 A = A();
        if (A.p()) {
            return -9223372036854775807L;
        }
        return d5.f0.S(A.m(x(), (q2) this.f108a, 0L).f9668y);
    }

    @Override
    public final x1 getPlaybackParameters() {
        q0();
        return this.f9545i0.f9800n;
    }

    @Override
    public final boolean h() {
        q0();
        return this.f9545i0.f9798l;
    }

    public final void h0(Surface surface) {
        int i9;
        q0();
        b0();
        g0(surface);
        if (surface == null) {
            i9 = 0;
        } else {
            i9 = -1;
        }
        a0(i9, i9);
    }

    @Override
    public final void i(boolean z10) {
        q0();
        if (this.G != z10) {
            this.G = z10;
            d5.c0 c0Var = this.f9548k.f9649n;
            c0Var.getClass();
            d5.b0 b10 = d5.c0.b();
            b10.f4334a = c0Var.f4337a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            t tVar = new t(0, z10);
            d5.n nVar = this.f9550l;
            nVar.c(9, tVar);
            m0();
            nVar.b();
        }
    }

    public final void i0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        q0();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        q0();
        if (holder == null) {
            q0();
            b0();
            g0(null);
            a0(0, 0);
            return;
        }
        b0();
        this.U = true;
        this.T = holder;
        holder.addCallback(this.f9562x);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            g0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            a0(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        g0(null);
        a0(0, 0);
    }

    @Override
    public final void j() {
        q0();
    }

    public final void j0(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        q0();
        if (textureView == null) {
            q0();
            b0();
            g0(null);
            a0(0, 0);
            return;
        }
        b0();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d5.a.K("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f9562x);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            g0(null);
            a0(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        g0(surface);
        this.S = surface;
        a0(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public final void k(a2 a2Var) {
        a2Var.getClass();
        this.f9550l.a(a2Var);
    }

    public final void k0(float f10) {
        q0();
        final float g10 = d5.f0.g(f10, 0.0f, 1.0f);
        if (this.f9531a0 == g10) {
            return;
        }
        this.f9531a0 = g10;
        c0(1, 2, Float.valueOf(this.A.f9372g * g10));
        this.f9550l.e(22, new d5.k() {
            @Override
            public final void invoke(Object obj) {
                ((a2) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override
    public final int l() {
        q0();
        if (this.f9545i0.f9789a.p()) {
            return 0;
        }
        w1 w1Var = this.f9545i0;
        return w1Var.f9789a.b(w1Var.f9790b.f13426a);
    }

    public final void l0(n nVar) {
        boolean z10;
        w1 w1Var = this.f9545i0;
        w1 a2 = w1Var.a(w1Var.f9790b);
        a2.f9802p = a2.f9804r;
        a2.f9803q = 0L;
        w1 f10 = a2.f(1);
        if (nVar != null) {
            f10 = f10.d(nVar);
        }
        w1 w1Var2 = f10;
        this.H++;
        d5.c0 c0Var = this.f9548k.f9649n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.f4334a = c0Var.f4337a.obtainMessage(6);
        b10.b();
        if (w1Var2.f9789a.p() && !this.f9545i0.f9789a.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0(w1Var2, 0, 1, false, z10, 4, T(w1Var2), -1, false);
    }

    @Override
    public final int m() {
        q0();
        if (c()) {
            return this.f9545i0.f9790b.f13428c;
        }
        return -1;
    }

    public final void m0() {
        boolean z10;
        int k10;
        boolean z11;
        int e10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        y1 y1Var = this.N;
        int i9 = d5.f0.f4349a;
        c2 c2Var = this.f9539f;
        boolean c10 = c2Var.c();
        a8.a aVar = (a8.a) c2Var;
        r2 A = aVar.A();
        boolean z19 = true;
        if (!A.p() && A.m(aVar.x(), (q2) aVar.f108a, 0L).f9663n) {
            z10 = true;
        } else {
            z10 = false;
        }
        r2 A2 = aVar.A();
        if (A2.p()) {
            k10 = -1;
        } else {
            int x10 = aVar.x();
            int g10 = aVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k10 = A2.k(x10, g10, aVar.C());
        }
        if (k10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        r2 A3 = aVar.A();
        if (A3.p()) {
            e10 = -1;
        } else {
            int x11 = aVar.x();
            int g11 = aVar.g();
            if (g11 == 1) {
                g11 = 0;
            }
            e10 = A3.e(x11, g11, aVar.C());
        }
        if (e10 != -1) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean J = aVar.J();
        boolean I = aVar.I();
        boolean p6 = c2Var.A().p();
        k5.i iVar = new k5.i(16);
        c2.t tVar = (c2.t) iVar.f14659b;
        d5.g gVar = this.f9534c.f9826a;
        tVar.getClass();
        for (int i10 = 0; i10 < gVar.f4361a.size(); i10++) {
            tVar.b(gVar.a(i10));
        }
        boolean z20 = !c10;
        iVar.F(4, z20);
        if (z10 && !c10) {
            z13 = true;
        } else {
            z13 = false;
        }
        iVar.F(5, z13);
        if (z11 && !c10) {
            z14 = true;
        } else {
            z14 = false;
        }
        iVar.F(6, z14);
        if (!p6 && ((z11 || !J || z10) && !c10)) {
            z15 = true;
        } else {
            z15 = false;
        }
        iVar.F(7, z15);
        if (z12 && !c10) {
            z16 = true;
        } else {
            z16 = false;
        }
        iVar.F(8, z16);
        if (!p6 && ((z12 || (J && I)) && !c10)) {
            z17 = true;
        } else {
            z17 = false;
        }
        iVar.F(9, z17);
        iVar.F(10, z20);
        if (z10 && !c10) {
            z18 = true;
        } else {
            z18 = false;
        }
        iVar.F(11, z18);
        iVar.F(12, (!z10 || c10) ? false : false);
        y1 y1Var2 = new y1(tVar.c());
        this.N = y1Var2;
        if (!y1Var2.equals(y1Var)) {
            this.f9550l.c(13, new w(this));
        }
    }

    @Override
    public final void n(int i9, int i10) {
        boolean z10;
        q0();
        if (i9 >= 0 && i10 >= i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        int size = this.f9554o.size();
        int min = Math.min(i10, size);
        if (i9 < size && i9 != min) {
            int x10 = x();
            r2 A = A();
            ArrayList arrayList = this.f9554o;
            int size2 = arrayList.size();
            this.H++;
            for (int i11 = min - 1; i11 >= i9; i11--) {
                arrayList.remove(i11);
            }
            this.M = this.M.a(i9, min);
            f2 f2Var = new f2(arrayList, this.M);
            w1 Y = Y(this.f9545i0, f2Var, V(A, f2Var));
            int i12 = Y.f9792e;
            if (i12 != 1 && i12 != 4 && i9 < min && min == size2 && x10 >= Y.f9789a.o()) {
                Y = Y.f(4);
            }
            j4.g1 g1Var = this.M;
            d5.c0 c0Var = this.f9548k.f9649n;
            c0Var.getClass();
            d5.b0 b10 = d5.c0.b();
            b10.f4334a = c0Var.f4337a.obtainMessage(20, i9, min, g1Var);
            b10.b();
            o0(Y, 0, 1, false, !Y.f9790b.f13426a.equals(this.f9545i0.f9790b.f13426a), 4, T(Y), -1, false);
        }
    }

    public final void n0(int i9, int i10, boolean z10) {
        ?? r42;
        int i11 = 0;
        if (z10 && i9 != -1) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        if (r42 != 0 && i9 != 1) {
            i11 = 1;
        }
        w1 w1Var = this.f9545i0;
        if (w1Var.f9798l == r42 && w1Var.f9799m == i11) {
            return;
        }
        this.H++;
        w1 c10 = w1Var.c(i11, r42);
        d5.c0 c0Var = this.f9548k.f9649n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.f4334a = c0Var.f4337a.obtainMessage(1, r42, i11);
        b10.b();
        o0(c10, 0, i10, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void o(boolean z10) {
        q0();
        int d = this.A.d(b(), z10);
        int i9 = 1;
        if (z10 && d != 1) {
            i9 = 2;
        }
        n0(d, i9, z10);
    }

    public final void o0(final w1 w1Var, final int i9, final int i10, boolean z10, boolean z11, int i11, long j10, int i12, boolean z12) {
        Pair pair;
        int i13;
        f1 f1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i14;
        Object obj;
        f1 f1Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long j13;
        long W;
        Object obj3;
        f1 f1Var3;
        Object obj4;
        int i16;
        long j14;
        w1 w1Var2 = this.f9545i0;
        this.f9545i0 = w1Var;
        boolean equals = w1Var2.f9789a.equals(w1Var.f9789a);
        q2 q2Var = (q2) this.f108a;
        p2 p2Var = this.f9553n;
        r2 r2Var = w1Var2.f9789a;
        j4.d0 d0Var = w1Var2.f9790b;
        r2 r2Var2 = w1Var.f9789a;
        j4.d0 d0Var2 = w1Var.f9790b;
        if (r2Var2.p() && r2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (r2Var2.p() != r2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!r2Var.m(r2Var.g(d0Var.f13426a, p2Var).f9639c, q2Var, 0L).f9658a.equals(r2Var2.m(r2Var2.g(d0Var2.f13426a, p2Var).f9639c, q2Var, 0L).f9658a)) {
            if (z11 && i11 == 0) {
                i13 = 1;
            } else if (z11 && i11 == 1) {
                i13 = 2;
            } else if (!equals) {
                i13 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        } else if (z11 && i11 == 0 && d0Var.d < d0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z11 && i11 == 1 && z12) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        h1 h1Var = this.O;
        if (booleanValue) {
            if (!w1Var.f9789a.p()) {
                f1Var = w1Var.f9789a.m(w1Var.f9789a.g(w1Var.f9790b.f13426a, this.f9553n).f9639c, (q2) this.f108a, 0L).f9660c;
            } else {
                f1Var = null;
            }
            this.f9543h0 = h1.U;
        } else {
            f1Var = null;
        }
        if (booleanValue || !w1Var2.f9796j.equals(w1Var.f9796j)) {
            g1 a2 = this.f9543h0.a();
            List list = w1Var.f9796j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                z3.c cVar = (z3.c) list.get(i17);
                int i18 = 0;
                while (true) {
                    z3.b[] bVarArr = cVar.f50288a;
                    if (i18 < bVarArr.length) {
                        bVarArr[i18].populateMediaMetadata(a2);
                        i18++;
                    }
                }
            }
            this.f9543h0 = new h1(a2);
            h1Var = R();
        }
        boolean equals2 = h1Var.equals(this.O);
        this.O = h1Var;
        if (w1Var2.f9798l != w1Var.f9798l) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (w1Var2.f9792e != w1Var.f9792e) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13) {
            p0();
        }
        if (w1Var2.f9794g != w1Var.f9794g) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!equals) {
            this.f9550l.c(0, new d5.k() {
                @Override
                public final void invoke(Object obj5) {
                    a2 a2Var = (a2) obj5;
                    switch (r3) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.f9789a, i9);
                            return;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.f9798l, i9);
                            return;
                    }
                }
            });
        }
        if (z11) {
            p2 p2Var2 = new p2();
            if (!w1Var2.f9789a.p()) {
                Object obj5 = w1Var2.f9790b.f13426a;
                w1Var2.f9789a.g(obj5, p2Var2);
                int i19 = p2Var2.f9639c;
                int b10 = w1Var2.f9789a.b(obj5);
                z16 = booleanValue;
                z17 = z13;
                z18 = equals2;
                obj = w1Var2.f9789a.m(i19, (q2) this.f108a, 0L).f9658a;
                f1Var2 = ((q2) this.f108a).f9660c;
                obj2 = obj5;
                i14 = i19;
                i15 = b10;
            } else {
                z16 = booleanValue;
                z17 = z13;
                z18 = equals2;
                i14 = i12;
                obj = null;
                f1Var2 = null;
                obj2 = null;
                i15 = -1;
            }
            if (i11 == 0) {
                if (w1Var2.f9790b.a()) {
                    j4.d0 d0Var3 = w1Var2.f9790b;
                    j13 = p2Var2.a(d0Var3.f13427b, d0Var3.f13428c);
                    W = W(w1Var2);
                } else if (w1Var2.f9790b.f13429e != -1) {
                    j13 = W(this.f9545i0);
                    W = j13;
                } else {
                    j11 = p2Var2.f9640e;
                    j12 = p2Var2.d;
                    j13 = j11 + j12;
                    W = j13;
                }
            } else if (w1Var2.f9790b.a()) {
                j13 = w1Var2.f9804r;
                W = W(w1Var2);
            } else {
                j11 = p2Var2.f9640e;
                j12 = w1Var2.f9804r;
                j13 = j11 + j12;
                W = j13;
            }
            long S = d5.f0.S(j13);
            long S2 = d5.f0.S(W);
            j4.d0 d0Var4 = w1Var2.f9790b;
            b2 b2Var = new b2(obj, i14, f1Var2, obj2, i15, S, S2, d0Var4.f13427b, d0Var4.f13428c);
            q2 q2Var2 = (q2) this.f108a;
            int x10 = x();
            if (!this.f9545i0.f9789a.p()) {
                w1 w1Var3 = this.f9545i0;
                Object obj6 = w1Var3.f9790b.f13426a;
                w1Var3.f9789a.g(obj6, this.f9553n);
                int b11 = this.f9545i0.f9789a.b(obj6);
                Object obj7 = this.f9545i0.f9789a.m(x10, q2Var2, 0L).f9658a;
                f1Var3 = q2Var2.f9660c;
                i16 = b11;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                f1Var3 = null;
                obj4 = null;
                i16 = -1;
            }
            long S3 = d5.f0.S(j10);
            if (this.f9545i0.f9790b.a()) {
                j14 = d5.f0.S(W(this.f9545i0));
            } else {
                j14 = S3;
            }
            j4.d0 d0Var5 = this.f9545i0.f9790b;
            this.f9550l.c(11, new c3.e(i11, b2Var, new b2(obj3, x10, f1Var3, obj4, i16, S3, j14, d0Var5.f13427b, d0Var5.f13428c), 1));
        } else {
            z16 = booleanValue;
            z17 = z13;
            z18 = equals2;
        }
        if (z16) {
            this.f9550l.c(1, new x2(f1Var, intValue, 1));
        }
        if (w1Var2.f9793f != w1Var.f9793f) {
            this.f9550l.c(10, new d5.k() {
                @Override
                public final void invoke(Object obj8) {
                    a2 a2Var = (a2) obj8;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
            if (w1Var.f9793f != null) {
                this.f9550l.c(10, new d5.k() {
                    @Override
                    public final void invoke(Object obj8) {
                        a2 a2Var = (a2) obj8;
                        switch (r2) {
                            case 0:
                                a2Var.onPlayerErrorChanged(w1Var.f9793f);
                                return;
                            case 1:
                                a2Var.onPlayerError(w1Var.f9793f);
                                return;
                            case 2:
                                a2Var.onTracksChanged(w1Var.f9795i.d);
                                return;
                            case 3:
                                w1 w1Var4 = w1Var;
                                a2Var.onLoadingChanged(w1Var4.f9794g);
                                a2Var.onIsLoadingChanged(w1Var4.f9794g);
                                return;
                            case 4:
                                w1 w1Var5 = w1Var;
                                a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                                return;
                            case 5:
                                a2Var.onPlaybackStateChanged(w1Var.f9792e);
                                return;
                            case 6:
                                a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                                return;
                            case 7:
                                a2Var.onIsPlayingChanged(k0.X(w1Var));
                                return;
                            default:
                                a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                                return;
                        }
                    }
                });
            }
        }
        b5.a0 a0Var = w1Var2.f9795i;
        b5.a0 a0Var2 = w1Var.f9795i;
        if (a0Var != a0Var2) {
            b5.w wVar = this.h;
            Object obj8 = a0Var2.f1428e;
            wVar.getClass();
            wVar.f1505c = (b5.v) obj8;
            this.f9550l.c(2, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (!z18) {
            this.f9550l.c(14, new i3(this.O, 8));
        }
        if (z15) {
            this.f9550l.c(3, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (z14 || z17) {
            this.f9550l.c(-1, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (z14) {
            this.f9550l.c(4, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f9550l.c(5, new d5.k() {
                @Override
                public final void invoke(Object obj52) {
                    a2 a2Var = (a2) obj52;
                    switch (r3) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.f9789a, i10);
                            return;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.f9798l, i10);
                            return;
                    }
                }
            });
        }
        if (w1Var2.f9799m != w1Var.f9799m) {
            this.f9550l.c(6, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (X(w1Var2) != X(w1Var)) {
            this.f9550l.c(7, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (!w1Var2.f9800n.equals(w1Var.f9800n)) {
            this.f9550l.c(12, new d5.k() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f9793f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f9793f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f9795i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f9794g);
                            a2Var.onIsLoadingChanged(w1Var4.f9794g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f9798l, w1Var5.f9792e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f9792e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f9799m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f9800n);
                            return;
                    }
                }
            });
        }
        if (z10) {
            this.f9550l.c(-1, new y5(10));
        }
        m0();
        this.f9550l.b();
        if (w1Var2.f9801o != w1Var.f9801o) {
            Iterator it = this.f9552m.iterator();
            while (it.hasNext()) {
                ((h0) it.next()).f9440a.p0();
            }
        }
    }

    @Override
    public final long p() {
        q0();
        return this.v;
    }

    public final void p0() {
        int b10 = b();
        za.a aVar = this.D;
        ya.b bVar = this.C;
        if (b10 != 1) {
            if (b10 != 2 && b10 != 3) {
                if (b10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                q0();
                boolean z10 = this.f9545i0.f9801o;
                h();
                bVar.getClass();
                h();
                aVar.getClass();
                return;
            }
        }
        bVar.getClass();
        aVar.getClass();
    }

    @Override
    public final long q() {
        q0();
        if (c()) {
            w1 w1Var = this.f9545i0;
            r2 r2Var = w1Var.f9789a;
            Object obj = w1Var.f9790b.f13426a;
            p2 p2Var = this.f9553n;
            r2Var.g(obj, p2Var);
            w1 w1Var2 = this.f9545i0;
            if (w1Var2.f9791c == -9223372036854775807L) {
                return d5.f0.S(w1Var2.f9789a.m(x(), (q2) this.f108a, 0L).f9667x);
            }
            return d5.f0.S(this.f9545i0.f9791c) + d5.f0.S(p2Var.f9640e);
        }
        return D();
    }

    public final void q0() {
        IllegalStateException illegalStateException;
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f9558s;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i9 = d5.f0.f4349a;
            Locale locale = Locale.US;
            String h = org.telegram.ui.Cells.j2.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (!this.f9535c0) {
                if (this.f9536d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                d5.a.L("ExoPlayerImpl", h, illegalStateException);
                this.f9536d0 = true;
                return;
            }
            throw new IllegalStateException(h);
        }
    }

    @Override
    public final void r(a2 a2Var) {
        q0();
        a2Var.getClass();
        d5.n nVar = this.f9550l;
        nVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = nVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            d5.m mVar = (d5.m) it.next();
            if (mVar.f4366a.equals(a2Var)) {
                d5.l lVar = nVar.f4371c;
                mVar.d = true;
                if (mVar.f4368c) {
                    mVar.f4368c = false;
                    lVar.g(mVar.f4366a, mVar.f4367b.c());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
    }

    @Override
    public final void s(int i9, List list) {
        boolean z10;
        q0();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f9556q.a((f1) list.get(i10)));
        }
        q0();
        if (i9 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        ArrayList arrayList2 = this.f9554o;
        int min = Math.min(i9, arrayList2.size());
        r2 A = A();
        this.H++;
        ArrayList Q = Q(min, arrayList);
        f2 f2Var = new f2(arrayList2, this.M);
        w1 Y = Y(this.f9545i0, f2Var, V(A, f2Var));
        j4.g1 g1Var = this.M;
        d5.c0 c0Var = this.f9548k.f9649n;
        m0 m0Var = new m0(Q, g1Var, -1, -9223372036854775807L);
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.f4334a = c0Var.f4337a.obtainMessage(18, min, 0, m0Var);
        b10.b();
        o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        q0();
        if (this.f9545i0.f9800n.equals(x1Var)) {
            return;
        }
        w1 e10 = this.f9545i0.e(x1Var);
        this.H++;
        this.f9548k.f9649n.a(4, x1Var).b();
        o0(e10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void stop() {
        q0();
        q0();
        this.A.d(1, h());
        l0(null);
        new r4.c(this.f9545i0.f9804r, o8.l0.f19056e);
    }

    @Override
    public final long t() {
        q0();
        if (c()) {
            w1 w1Var = this.f9545i0;
            if (w1Var.f9797k.equals(w1Var.f9790b)) {
                return d5.f0.S(this.f9545i0.f9802p);
            }
            return getDuration();
        }
        q0();
        if (this.f9545i0.f9789a.p()) {
            return this.f9549k0;
        }
        w1 w1Var2 = this.f9545i0;
        if (w1Var2.f9797k.d != w1Var2.f9790b.d) {
            return d5.f0.S(w1Var2.f9789a.m(x(), (q2) this.f108a, 0L).f9668y);
        }
        long j10 = w1Var2.f9802p;
        if (this.f9545i0.f9797k.a()) {
            w1 w1Var3 = this.f9545i0;
            p2 g10 = w1Var3.f9789a.g(w1Var3.f9797k.f13426a, this.f9553n);
            long d = g10.d(this.f9545i0.f9797k.f13427b);
            if (d == Long.MIN_VALUE) {
                j10 = g10.d;
            } else {
                j10 = d;
            }
        }
        w1 w1Var4 = this.f9545i0;
        r2 r2Var = w1Var4.f9789a;
        Object obj = w1Var4.f9797k.f13426a;
        p2 p2Var = this.f9553n;
        r2Var.g(obj, p2Var);
        return d5.f0.S(j10 + p2Var.f9640e);
    }

    @Override
    public final t2 u() {
        q0();
        return this.f9545i0.f9795i.d;
    }

    @Override
    public final n v() {
        q0();
        return this.f9545i0.f9793f;
    }

    @Override
    public final int w() {
        q0();
        if (c()) {
            return this.f9545i0.f9790b.f13427b;
        }
        return -1;
    }

    @Override
    public final int x() {
        q0();
        int U = U();
        if (U == -1) {
            return 0;
        }
        return U;
    }

    @Override
    public final void y(int i9, int i10, int i11) {
        boolean z10;
        q0();
        if (i9 >= 0 && i9 <= i10 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        ArrayList arrayList = this.f9554o;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i9));
        if (i9 < size && i9 != min && i9 != min2) {
            r2 A = A();
            this.H++;
            d5.f0.G(i9, min, min2, arrayList);
            f2 f2Var = new f2(arrayList, this.M);
            w1 Y = Y(this.f9545i0, f2Var, V(A, f2Var));
            j4.g1 g1Var = this.M;
            q0 q0Var = this.f9548k;
            q0Var.getClass();
            q0Var.f9649n.a(19, new n0(i9, min, min2, g1Var)).b();
            o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override
    public final int z() {
        q0();
        return this.f9545i0.f9799m;
    }
}
