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
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.th;
public final class k0 extends ab.e implements s {
    public final d A;
    public final m2 B;
    public final ya.a C;
    public final ab.b D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public j2 L;
    public l4.h1 M;
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
    public f5.x X;
    public final int Y;
    public l3.e Z;
    public float f10568a0;
    public final d5.y f10569b;
    public boolean f10570b0;
    public final y1 f10571c;
    public final boolean f10572c0;
    public final f5.c d;
    public boolean f10573d0;
    public final Context f10574e;
    public boolean f10575e0;
    public final c2 f10576f;
    public m f10577f0;
    public final e[] f10578g;
    public g5.y f10579g0;
    public final d5.u h;
    public h1 f10580h0;
    public final f5.a0 f10581i;
    public w1 f10582i0;
    public final w f10583j;
    public int f10584j0;
    public final q0 f10585k;
    public long f10586k0;
    public final f5.m f10587l;
    public DispatchQueue f10588l0;
    public final CopyOnWriteArraySet f10589m;
    public final ArrayList m0;
    public final p2 f10590n;
    public final ArrayList f10591o;
    public final boolean f10592p;
    public final l4.b0 f10593q;
    public final k3.f f10594r;
    public final Looper f10595s;
    public final com.google.android.exoplayer2.upstream.f f10596t;
    public final long f10597u;
    public final long v;
    public final f5.y f10598w;
    public final h0 f10599x;
    public final i0 f10600y;
    public final androidx.activity.n f10601z;

    static {
        r0.a("goog.exo.exoplayer");
    }

    public k0(r rVar, k2 k2Var) {
        super(3);
        boolean z10;
        k0 k0Var;
        k3.k a2;
        this.m0 = new ArrayList();
        this.d = new Object();
        try {
            f5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.3] [" + f5.d0.f6582e + "]");
            Context context = rVar.f10706a;
            f5.y yVar = rVar.f10707b;
            this.f10574e = context.getApplicationContext();
            this.f10594r = new k3.f(yVar);
            this.Z = rVar.f10712i;
            this.W = rVar.f10713j;
            this.f10570b0 = false;
            this.E = rVar.f10720q;
            h0 h0Var = new h0(this);
            this.f10599x = h0Var;
            this.f10600y = new Object();
            Handler handler = new Handler(rVar.h);
            e[] b10 = ((l) rVar.f10708c.get()).b(handler, h0Var, h0Var, h0Var, h0Var);
            this.f10578g = b10;
            if (b10.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f5.a.i(z10);
            this.h = (d5.u) rVar.f10709e.get();
            this.f10593q = (l4.b0) rVar.d.get();
            this.f10596t = com.google.android.exoplayer2.upstream.u.b(rVar.f10711g.f10661b);
            this.f10592p = rVar.f10714k;
            this.L = rVar.f10715l;
            this.f10597u = rVar.f10716m;
            this.v = rVar.f10717n;
            Looper looper = rVar.h;
            this.f10595s = looper;
            this.f10598w = yVar;
            if (k2Var == 0) {
                k0Var = this;
            } else {
                k0Var = k2Var;
            }
            this.f10576f = k0Var;
            this.f10587l = new f5.m(looper, yVar, new w(this));
            this.f10589m = new CopyOnWriteArraySet();
            this.f10591o = new ArrayList();
            this.M = new l4.f1();
            this.f10569b = new d5.y(new i2[b10.length], new d5.r[b10.length], t2.f10810b, null);
            this.f10590n = new p2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                f5.a.i(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.h.getClass();
            f5.a.i(!false);
            sparseBooleanArray.append(29, true);
            f5.a.i(!false);
            f5.g gVar = new f5.g(sparseBooleanArray);
            this.f10571c = new y1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < gVar.f6596a.size(); i12++) {
                int a10 = gVar.a(i12);
                f5.a.i(!false);
                sparseBooleanArray2.append(a10, true);
            }
            f5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            f5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            f5.a.i(!false);
            this.N = new y1(new f5.g(sparseBooleanArray2));
            this.f10581i = this.f10598w.a(this.f10595s, null);
            w wVar = new w(this);
            this.f10583j = wVar;
            this.f10582i0 = w1.h(this.f10569b);
            this.f10594r.m(this.f10576f, this.f10595s);
            int i13 = f5.d0.f6579a;
            if (i13 < 31) {
                a2 = new k3.k();
            } else {
                a2 = b0.a(this.f10574e, this, rVar.f10721r);
            }
            this.f10585k = new q0(this.f10578g, this.h, this.f10569b, (j) rVar.f10710f.get(), this.f10596t, this.F, this.G, this.f10594r, this.L, rVar.f10718o, rVar.f10719p, this.f10595s, this.f10598w, wVar, a2);
            this.f10568a0 = 1.0f;
            this.F = 0;
            h1 h1Var = h1.U;
            this.O = h1Var;
            this.f10580h0 = h1Var;
            int i14 = -1;
            this.f10584j0 = -1;
            if (i13 < 21) {
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
                AudioManager audioManager = (AudioManager) this.f10574e.getSystemService("audio");
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
                this.Y = i14;
            }
            int i15 = t4.c.f48139b;
            this.f10572c0 = true;
            l(this.f10594r);
            com.google.android.exoplayer2.upstream.f fVar = this.f10596t;
            Handler handler2 = new Handler(this.f10595s);
            k3.f fVar2 = this.f10594r;
            com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) fVar;
            uVar.getClass();
            fVar2.getClass();
            ag.o1 o1Var = uVar.f3633b;
            o1Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) o1Var.f624b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
                if (eVar.f3560b == fVar2) {
                    eVar.f3561c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new com.google.android.exoplayer2.upstream.e(handler2, fVar2));
            this.f10589m.add(this.f10599x);
            h0 h0Var2 = this.f10599x;
            ?? obj = new Object();
            obj.f881b = context.getApplicationContext();
            obj.f882c = new b(obj, handler, h0Var2);
            this.f10601z = obj;
            obj.d();
            d dVar = new d(context, handler, this.f10599x);
            this.A = dVar;
            dVar.b(null);
            m2 m2Var = new m2(context, handler, this.f10599x);
            this.B = m2Var;
            m2Var.c(f5.d0.y(this.Z.f14079c));
            ya.a aVar = new ya.a(9);
            PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
            this.C = aVar;
            ab.b bVar = new ab.b(10);
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            this.D = bVar;
            this.f10577f0 = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f10633f));
            this.f10579g0 = g5.y.f7105e;
            this.X = f5.x.f6643c;
            this.h.b(this.Z);
            c0(1, 10, Integer.valueOf(this.Y));
            c0(2, 10, Integer.valueOf(this.Y));
            c0(1, 3, this.Z);
            c0(2, 4, Integer.valueOf(this.W));
            c0(2, 5, 0);
            c0(1, 9, Boolean.valueOf(this.f10570b0));
            c0(2, 7, this.f10600y);
            c0(6, 8, this.f10600y);
            this.d.c();
        } catch (Throwable th2) {
            this.d.c();
            throw th2;
        }
    }

    public static long W(w1 w1Var) {
        q2 q2Var = new q2();
        p2 p2Var = new p2();
        w1Var.f10826a.g(w1Var.f10827b.f14262a, p2Var);
        long j10 = w1Var.f10828c;
        if (j10 == -9223372036854775807L) {
            return w1Var.f10826a.m(p2Var.f10676c, q2Var, 0L).f10704x;
        }
        return p2Var.f10677e + j10;
    }

    public static boolean X(w1 w1Var) {
        if (w1Var.f10829e == 3 && w1Var.f10835l && w1Var.f10836m == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final r2 A() {
        q0();
        return this.f10582i0.f10826a;
    }

    @Override
    public final Looper B() {
        return this.f10595s;
    }

    @Override
    public final boolean C() {
        q0();
        return this.G;
    }

    @Override
    public final long D() {
        q0();
        return f5.d0.S(T(this.f10582i0));
    }

    @Override
    public final long E() {
        q0();
        return this.f10597u;
    }

    @Override
    public final void N() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.3] [");
        sb2.append(f5.d0.f6582e);
        sb2.append("] [");
        HashSet hashSet = r0.f10723a;
        synchronized (r0.class) {
            str = r0.f10724b;
        }
        sb2.append(str);
        sb2.append("]");
        f5.a.v("ExoPlayerImpl", sb2.toString());
        q0();
        if (f5.d0.f6579a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.f10601z.d();
        m2 m2Var = this.B;
        af.c cVar = m2Var.f10632e;
        if (cVar != null) {
            try {
                m2Var.f10629a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                f5.a.L("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            m2Var.f10632e = null;
        }
        this.C.getClass();
        this.D.getClass();
        d dVar = this.A;
        dVar.f10408c = null;
        dVar.a();
        if (!this.f10585k.z()) {
            this.f10587l.e(10, new eg.c(26));
        }
        this.f10587l.d();
        this.f10581i.f6568a.removeCallbacksAndMessages(null);
        com.google.android.exoplayer2.upstream.f fVar = this.f10596t;
        k3.f fVar2 = this.f10594r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((com.google.android.exoplayer2.upstream.u) fVar).f3633b.f624b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
            if (eVar.f3560b == fVar2) {
                eVar.f3561c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        w1 f9 = this.f10582i0.f(1);
        this.f10582i0 = f9;
        w1 a2 = f9.a(f9.f10827b);
        this.f10582i0 = a2;
        a2.f10839p = a2.f10841r;
        this.f10582i0.f10840q = 0L;
        k3.f fVar3 = this.f10594r;
        f5.a0 a0Var = fVar3.f13418n;
        f5.a.j(a0Var);
        a0Var.c(new jh.o(fVar3, 17));
        this.h.a();
        b0();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        int i10 = t4.c.f48139b;
        this.f10575e0 = true;
    }

    @Override
    public final void O(long j10, int i10, int i11, boolean z10) {
        boolean z11;
        q0();
        int i12 = 1;
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f5.a.f(z11);
        k3.f fVar = this.f10594r;
        if (!fVar.f13419r) {
            k3.a d = fVar.d();
            fVar.f13419r = true;
            fVar.l(d, -1, new k3.c(d, 0));
        }
        r2 r2Var = this.f10582i0.f10826a;
        if (!r2Var.p() && i10 >= r2Var.o()) {
            return;
        }
        this.H++;
        if (c()) {
            f5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            we.f fVar2 = new we.f(this.f10582i0);
            fVar2.a(1);
            k0 k0Var = this.f10583j.f10824a;
            k0Var.f10581i.c(new ef.c(23, k0Var, fVar2));
            return;
        }
        if (b() != 1) {
            i12 = 2;
        }
        int x4 = x();
        w1 Y = Y(this.f10582i0.f(i12), r2Var, Z(r2Var, i10, j10));
        this.f10585k.f10686n.a(3, new p0(r2Var, i10, f5.d0.H(j10))).b();
        o0(Y, 0, 1, true, true, 1, T(Y), x4, z10);
    }

    public final ArrayList Q(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r1 r1Var = new r1((l4.a) list.get(i11), this.f10592p);
            arrayList.add(r1Var);
            j0 j0Var = new j0(r1Var.f10726b, r1Var.f10725a.f14453o);
            this.f10591o.add(i11 + i10, j0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    public final h1 R() {
        r2 A = A();
        if (A.p()) {
            return this.f10580h0;
        }
        f1 f1Var = A.m(x(), (q2) this.f306a, 0L).f10697c;
        g1 a2 = this.f10580h0.a();
        h1 h1Var = f1Var.d;
        if (h1Var != null) {
            CharSequence charSequence = h1Var.f10503a;
            if (charSequence != null) {
                a2.f10448a = charSequence;
            }
            CharSequence charSequence2 = h1Var.f10504b;
            if (charSequence2 != null) {
                a2.f10449b = charSequence2;
            }
            CharSequence charSequence3 = h1Var.f10505c;
            if (charSequence3 != null) {
                a2.f10450c = charSequence3;
            }
            CharSequence charSequence4 = h1Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = h1Var.f10506e;
            if (charSequence5 != null) {
                a2.f10451e = charSequence5;
            }
            CharSequence charSequence6 = h1Var.f10507f;
            if (charSequence6 != null) {
                a2.f10452f = charSequence6;
            }
            CharSequence charSequence7 = h1Var.h;
            if (charSequence7 != null) {
                a2.f10453g = charSequence7;
            }
            g2 g2Var = h1Var.f10508n;
            if (g2Var != null) {
                a2.h = g2Var;
            }
            g2 g2Var2 = h1Var.f10509r;
            if (g2Var2 != null) {
                a2.f10454i = g2Var2;
            }
            byte[] bArr = h1Var.f10510s;
            if (bArr != null) {
                Integer num = h1Var.v;
                a2.f10455j = (byte[]) bArr.clone();
                a2.f10456k = num;
            }
            Uri uri = h1Var.f10511w;
            if (uri != null) {
                a2.f10457l = uri;
            }
            Integer num2 = h1Var.f10512x;
            if (num2 != null) {
                a2.f10458m = num2;
            }
            Integer num3 = h1Var.f10513y;
            if (num3 != null) {
                a2.f10459n = num3;
            }
            Integer num4 = h1Var.A;
            if (num4 != null) {
                a2.f10460o = num4;
            }
            Boolean bool = h1Var.B;
            if (bool != null) {
                a2.f10461p = bool;
            }
            Boolean bool2 = h1Var.C;
            if (bool2 != null) {
                a2.f10462q = bool2;
            }
            Integer num5 = h1Var.D;
            if (num5 != null) {
                a2.f10463r = num5;
            }
            Integer num6 = h1Var.E;
            if (num6 != null) {
                a2.f10463r = num6;
            }
            Integer num7 = h1Var.F;
            if (num7 != null) {
                a2.f10464s = num7;
            }
            Integer num8 = h1Var.G;
            if (num8 != null) {
                a2.f10465t = num8;
            }
            Integer num9 = h1Var.H;
            if (num9 != null) {
                a2.f10466u = num9;
            }
            Integer num10 = h1Var.I;
            if (num10 != null) {
                a2.v = num10;
            }
            Integer num11 = h1Var.J;
            if (num11 != null) {
                a2.f10467w = num11;
            }
            CharSequence charSequence8 = h1Var.K;
            if (charSequence8 != null) {
                a2.f10468x = charSequence8;
            }
            CharSequence charSequence9 = h1Var.L;
            if (charSequence9 != null) {
                a2.f10469y = charSequence9;
            }
            CharSequence charSequence10 = h1Var.M;
            if (charSequence10 != null) {
                a2.f10470z = charSequence10;
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
        int i10;
        int U = U();
        r2 r2Var = this.f10582i0.f10826a;
        if (U == -1) {
            i10 = 0;
        } else {
            i10 = U;
        }
        f5.y yVar = this.f10598w;
        q0 q0Var = this.f10585k;
        return new e2(q0Var, d2Var, r2Var, i10, yVar, q0Var.f10688s);
    }

    public final long T(w1 w1Var) {
        if (w1Var.f10826a.p()) {
            return f5.d0.H(this.f10586k0);
        }
        if (w1Var.f10827b.a()) {
            return w1Var.f10841r;
        }
        r2 r2Var = w1Var.f10826a;
        l4.c0 c0Var = w1Var.f10827b;
        long j10 = w1Var.f10841r;
        Object obj = c0Var.f14262a;
        p2 p2Var = this.f10590n;
        r2Var.g(obj, p2Var);
        return j10 + p2Var.f10677e;
    }

    public final int U() {
        if (this.f10582i0.f10826a.p()) {
            return this.f10584j0;
        }
        w1 w1Var = this.f10582i0;
        return w1Var.f10826a.g(w1Var.f10827b.f14262a, this.f10590n).f10676c;
    }

    public final Pair V(r2 r2Var, f2 f2Var) {
        boolean z10;
        long q6 = q();
        int i10 = -1;
        if (!r2Var.p() && !f2Var.p()) {
            Pair i11 = r2Var.i((q2) this.f306a, this.f10590n, x(), f5.d0.H(q6));
            Object obj = i11.first;
            if (f2Var.b(obj) != -1) {
                return i11;
            }
            Object I = q0.I((q2) this.f306a, this.f10590n, this.F, this.G, obj, r2Var, f2Var);
            if (I != null) {
                p2 p2Var = this.f10590n;
                f2Var.g(I, p2Var);
                int i12 = p2Var.f10676c;
                q2 q2Var = (q2) this.f306a;
                f2Var.m(i12, q2Var, 0L);
                return Z(f2Var, i12, f5.d0.S(q2Var.f10704x));
            }
            return Z(f2Var, -1, -9223372036854775807L);
        }
        if (!r2Var.p() && f2Var.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = U();
        }
        if (z10) {
            q6 = -9223372036854775807L;
        }
        return Z(f2Var, i10, q6);
    }

    public final w1 Y(w1 w1Var, r2 r2Var, Pair pair) {
        boolean z10;
        l4.c0 c0Var;
        l4.k1 k1Var;
        d5.y yVar;
        List list;
        int i10;
        long j10;
        if (!r2Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        f5.a.f(z10);
        r2 r2Var2 = w1Var.f10826a;
        w1 g10 = w1Var.g(r2Var);
        if (r2Var.p()) {
            l4.c0 c0Var2 = w1.f10825s;
            long H = f5.d0.H(this.f10586k0);
            w1 a2 = g10.b(c0Var2, H, H, H, 0L, l4.k1.d, this.f10569b, q8.l0.f46462e).a(c0Var2);
            a2.f10839p = a2.f10841r;
            return a2;
        }
        Object obj = g10.f10827b.f14262a;
        int i11 = f5.d0.f6579a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            c0Var = new l4.c0(pair.first);
        } else {
            c0Var = g10.f10827b;
        }
        long longValue = ((Long) pair.second).longValue();
        long H2 = f5.d0.H(q());
        if (!r2Var2.p()) {
            H2 -= r2Var2.g(obj, this.f10590n).f10677e;
        }
        if (!equals || longValue < H2) {
            l4.c0 c0Var3 = c0Var;
            f5.a.i(!c0Var3.a());
            if (!equals) {
                k1Var = l4.k1.d;
            } else {
                k1Var = g10.h;
            }
            l4.k1 k1Var2 = k1Var;
            if (!equals) {
                yVar = this.f10569b;
            } else {
                yVar = g10.f10832i;
            }
            d5.y yVar2 = yVar;
            if (!equals) {
                q8.x xVar = q8.z.f46511b;
                list = q8.l0.f46462e;
            } else {
                list = g10.f10833j;
            }
            w1 a10 = g10.b(c0Var3, longValue, longValue, longValue, 0L, k1Var2, yVar2, list).a(c0Var3);
            a10.f10839p = longValue;
            return a10;
        } else if (i10 == 0) {
            int b10 = r2Var.b(g10.f10834k.f14262a);
            if (b10 != -1 && r2Var.f(b10, this.f10590n, false).f10676c == r2Var.g(c0Var.f14262a, this.f10590n).f10676c) {
                return g10;
            }
            r2Var.g(c0Var.f14262a, this.f10590n);
            if (c0Var.a()) {
                j10 = this.f10590n.a(c0Var.f14263b, c0Var.f14264c);
            } else {
                j10 = this.f10590n.d;
            }
            l4.c0 c0Var4 = c0Var;
            w1 a11 = g10.b(c0Var4, g10.f10841r, g10.f10841r, g10.d, j10 - g10.f10841r, g10.h, g10.f10832i, g10.f10833j).a(c0Var4);
            a11.f10839p = j10;
            return a11;
        } else {
            l4.c0 c0Var5 = c0Var;
            f5.a.i(!c0Var5.a());
            long max = Math.max(0L, g10.f10840q - (longValue - H2));
            long j11 = g10.f10839p;
            if (g10.f10834k.equals(g10.f10827b)) {
                j11 = longValue + max;
            }
            w1 b11 = g10.b(c0Var5, longValue, longValue, longValue, max, g10.h, g10.f10832i, g10.f10833j);
            b11.f10839p = j11;
            return b11;
        }
    }

    public final Pair Z(r2 r2Var, int i10, long j10) {
        if (r2Var.p()) {
            this.f10584j0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f10586k0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= r2Var.o()) {
            i10 = r2Var.a(this.G);
            j10 = f5.d0.S(r2Var.m(i10, (q2) this.f306a, 0L).f10704x);
        }
        return r2Var.i((q2) this.f306a, this.f10590n, i10, f5.d0.H(j10));
    }

    @Override
    public final void a() {
        int i10;
        q0();
        boolean h = h();
        int i11 = 2;
        int d = this.A.d(2, h);
        if (h && d != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        n0(d, i10, h);
        w1 w1Var = this.f10582i0;
        if (w1Var.f10829e != 1) {
            return;
        }
        w1 d10 = w1Var.d(null);
        if (d10.f10826a.p()) {
            i11 = 4;
        }
        w1 f9 = d10.f(i11);
        this.H++;
        f5.a0 a0Var = this.f10585k.f10686n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.f6647a = a0Var.f6568a.obtainMessage(0);
        b10.b();
        o0(f9, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void a0(int i10, int i11) {
        f5.x xVar = this.X;
        if (i10 == xVar.f6644a && i11 == xVar.f6645b) {
            return;
        }
        this.X = new f5.x(i10, i11);
        DispatchQueue dispatchQueue = this.f10588l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new y(this, i10, i11, 0));
            return;
        }
        this.f10587l.e(24, new z(i10, i11, 0));
    }

    @Override
    public final int b() {
        q0();
        return this.f10582i0.f10829e;
    }

    public final void b0() {
        TextureView textureView = this.V;
        h0 h0Var = this.f10599x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != h0Var) {
                f5.a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
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
        return this.f10582i0.f10827b.a();
    }

    public final void c0(int i10, int i11, Object obj) {
        e[] eVarArr;
        for (e eVar : this.f10578g) {
            if (eVar.getTrackType() == i10) {
                e2 S = S(eVar);
                f5.a.i(!S.f10425g);
                S.d = i11;
                f5.a.i(!S.f10425g);
                S.f10423e = obj;
                S.c();
            }
        }
    }

    @Override
    public final long d() {
        q0();
        return f5.d0.S(this.f10582i0.f10840q);
    }

    public final void d0(l3.e eVar, boolean z10) {
        l3.e eVar2;
        q0();
        if (this.f10575e0) {
            return;
        }
        boolean a2 = f5.d0.a(this.Z, eVar);
        int i10 = 1;
        f5.m mVar = this.f10587l;
        if (!a2) {
            this.Z = eVar;
            c0(1, 3, eVar);
            this.B.c(f5.d0.y(eVar.f14079c));
            mVar.c(20, new eg.n(eVar, 11));
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
            i10 = 2;
        }
        n0(d, i10, h);
        mVar.b();
    }

    @Override
    public final void e(int i10) {
        q0();
        if (this.F != i10) {
            this.F = i10;
            f5.a0 a0Var = this.f10585k.f10686n;
            a0Var.getClass();
            f5.z b10 = f5.a0.b();
            b10.f6647a = a0Var.f6568a.obtainMessage(11, i10, 0);
            b10.b();
            x xVar = new x(i10, 0);
            f5.m mVar = this.f10587l;
            mVar.c(8, xVar);
            m0();
            mVar.b();
        }
    }

    public final void e0(l4.a aVar, boolean z10) {
        boolean z11;
        q0();
        List singletonList = Collections.singletonList(aVar);
        q0();
        int U = U();
        long D = D();
        this.H++;
        ArrayList arrayList = this.f10591o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Q = Q(0, singletonList);
        f2 f2Var = new f2(arrayList, this.M);
        boolean p10 = f2Var.p();
        int i11 = f2Var.f10441e;
        if (!p10 && -1 >= i11) {
            throw new IllegalStateException();
        }
        if (z10) {
            U = f2Var.a(this.G);
            D = -9223372036854775807L;
        }
        int i12 = U;
        w1 Y = Y(this.f10582i0, f2Var, Z(f2Var, i12, D));
        int i13 = Y.f10829e;
        if (i12 != -1 && i13 != 1) {
            i13 = (f2Var.p() || i12 >= i11) ? 4 : 2;
        }
        w1 f9 = Y.f(i13);
        this.f10585k.f10686n.a(17, new m0(Q, this.M, i12, f5.d0.H(D))).b();
        if (!this.f10582i0.f10827b.f14262a.equals(f9.f10827b.f14262a) && !this.f10582i0.f10826a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        o0(f9, 0, 1, false, z11, 4, T(f9), -1, false);
    }

    @Override
    public final y1 f() {
        q0();
        return this.N;
    }

    public final void f0(j2 j2Var) {
        q0();
        if (j2Var == null) {
            j2Var = j2.f10560e;
        }
        if (!this.L.equals(j2Var)) {
            this.L = j2Var;
            this.f10585k.f10686n.a(5, j2Var).b();
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
        for (e eVar : this.f10578g) {
            if (eVar.getTrackType() == 2) {
                e2 S = S(eVar);
                f5.a.i(!S.f10425g);
                S.d = 1;
                f5.a.i(true ^ S.f10425g);
                S.f10423e = surface;
                S.c();
                arrayList.add(S);
            }
        }
        Object obj = this.R;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
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
            w1 w1Var = this.f10582i0;
            l4.c0 c0Var = w1Var.f10827b;
            r2 r2Var = w1Var.f10826a;
            Object obj = c0Var.f14262a;
            p2 p2Var = this.f10590n;
            r2Var.g(obj, p2Var);
            return f5.d0.S(p2Var.a(c0Var.f14263b, c0Var.f14264c));
        }
        r2 A = A();
        if (A.p()) {
            return -9223372036854775807L;
        }
        return f5.d0.S(A.m(x(), (q2) this.f306a, 0L).f10705y);
    }

    @Override
    public final x1 getPlaybackParameters() {
        q0();
        return this.f10582i0.f10837n;
    }

    @Override
    public final boolean h() {
        q0();
        return this.f10582i0.f10835l;
    }

    public final void h0(Surface surface) {
        int i10;
        q0();
        b0();
        g0(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        a0(i10, i10);
    }

    @Override
    public final void i(boolean z10) {
        q0();
        if (this.G != z10) {
            this.G = z10;
            f5.a0 a0Var = this.f10585k.f10686n;
            a0Var.getClass();
            f5.z b10 = f5.a0.b();
            b10.f6647a = a0Var.f6568a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            t tVar = new t(0, z10);
            f5.m mVar = this.f10587l;
            mVar.c(9, tVar);
            m0();
            mVar.b();
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
        holder.addCallback(this.f10599x);
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
            f5.a.K("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f10599x);
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
    public final int k() {
        q0();
        if (this.f10582i0.f10826a.p()) {
            return 0;
        }
        w1 w1Var = this.f10582i0;
        return w1Var.f10826a.b(w1Var.f10827b.f14262a);
    }

    public final void k0(float f9) {
        q0();
        final float g10 = f5.d0.g(f9, 0.0f, 1.0f);
        if (this.f10568a0 == g10) {
            return;
        }
        this.f10568a0 = g10;
        c0(1, 2, Float.valueOf(this.A.f10411g * g10));
        this.f10587l.e(22, new f5.j() {
            @Override
            public final void invoke(Object obj) {
                ((a2) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override
    public final void l(a2 a2Var) {
        a2Var.getClass();
        this.f10587l.a(a2Var);
    }

    public final void l0(n nVar) {
        boolean z10;
        w1 w1Var = this.f10582i0;
        w1 a2 = w1Var.a(w1Var.f10827b);
        a2.f10839p = a2.f10841r;
        a2.f10840q = 0L;
        w1 f9 = a2.f(1);
        if (nVar != null) {
            f9 = f9.d(nVar);
        }
        w1 w1Var2 = f9;
        this.H++;
        f5.a0 a0Var = this.f10585k.f10686n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.f6647a = a0Var.f6568a.obtainMessage(6);
        b10.b();
        if (w1Var2.f10826a.p() && !this.f10582i0.f10826a.p()) {
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
            return this.f10582i0.f10827b.f14264c;
        }
        return -1;
    }

    public final void m0() {
        boolean z10;
        int k9;
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
        int i10 = f5.d0.f6579a;
        c2 c2Var = this.f10576f;
        boolean c3 = c2Var.c();
        ab.e eVar = (ab.e) c2Var;
        r2 A = eVar.A();
        boolean z19 = true;
        if (!A.p() && A.m(eVar.x(), (q2) eVar.f306a, 0L).f10700n) {
            z10 = true;
        } else {
            z10 = false;
        }
        r2 A2 = eVar.A();
        if (A2.p()) {
            k9 = -1;
        } else {
            int x4 = eVar.x();
            int g10 = eVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k9 = A2.k(x4, g10, eVar.C());
        }
        if (k9 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        r2 A3 = eVar.A();
        if (A3.p()) {
            e10 = -1;
        } else {
            int x10 = eVar.x();
            int g11 = eVar.g();
            if (g11 == 1) {
                g11 = 0;
            }
            e10 = A3.e(x10, g11, eVar.C());
        }
        if (e10 != -1) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean J = eVar.J();
        boolean I = eVar.I();
        boolean p10 = c2Var.A().p();
        ag.o1 o1Var = new ag.o1(17);
        c2.u uVar = (c2.u) o1Var.f624b;
        f5.g gVar = this.f10571c.f10863a;
        uVar.getClass();
        for (int i11 = 0; i11 < gVar.f6596a.size(); i11++) {
            uVar.b(gVar.a(i11));
        }
        boolean z20 = !c3;
        o1Var.a(4, z20);
        if (z10 && !c3) {
            z13 = true;
        } else {
            z13 = false;
        }
        o1Var.a(5, z13);
        if (z11 && !c3) {
            z14 = true;
        } else {
            z14 = false;
        }
        o1Var.a(6, z14);
        if (!p10 && ((z11 || !J || z10) && !c3)) {
            z15 = true;
        } else {
            z15 = false;
        }
        o1Var.a(7, z15);
        if (z12 && !c3) {
            z16 = true;
        } else {
            z16 = false;
        }
        o1Var.a(8, z16);
        if (!p10 && ((z12 || (J && I)) && !c3)) {
            z17 = true;
        } else {
            z17 = false;
        }
        o1Var.a(9, z17);
        o1Var.a(10, z20);
        if (z10 && !c3) {
            z18 = true;
        } else {
            z18 = false;
        }
        o1Var.a(11, z18);
        o1Var.a(12, (!z10 || c3) ? false : false);
        y1 y1Var2 = new y1(uVar.c());
        this.N = y1Var2;
        if (!y1Var2.equals(y1Var)) {
            this.f10587l.c(13, new w(this));
        }
    }

    @Override
    public final void n(int i10, int i11) {
        boolean z10;
        q0();
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        int size = this.f10591o.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            int x4 = x();
            r2 A = A();
            ArrayList arrayList = this.f10591o;
            int size2 = arrayList.size();
            this.H++;
            for (int i12 = min - 1; i12 >= i10; i12--) {
                arrayList.remove(i12);
            }
            this.M = this.M.a(i10, min);
            f2 f2Var = new f2(arrayList, this.M);
            w1 Y = Y(this.f10582i0, f2Var, V(A, f2Var));
            int i13 = Y.f10829e;
            if (i13 != 1 && i13 != 4 && i10 < min && min == size2 && x4 >= Y.f10826a.o()) {
                Y = Y.f(4);
            }
            l4.h1 h1Var = this.M;
            f5.a0 a0Var = this.f10585k.f10686n;
            a0Var.getClass();
            f5.z b10 = f5.a0.b();
            b10.f6647a = a0Var.f6568a.obtainMessage(20, i10, min, h1Var);
            b10.b();
            o0(Y, 0, 1, false, !Y.f10827b.f14262a.equals(this.f10582i0.f10827b.f14262a), 4, T(Y), -1, false);
        }
    }

    public final void n0(int i10, int i11, boolean z10) {
        ?? r42;
        int i12 = 0;
        if (z10 && i10 != -1) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        if (r42 != 0 && i10 != 1) {
            i12 = 1;
        }
        w1 w1Var = this.f10582i0;
        if (w1Var.f10835l == r42 && w1Var.f10836m == i12) {
            return;
        }
        this.H++;
        w1 c3 = w1Var.c(i12, r42);
        f5.a0 a0Var = this.f10585k.f10686n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.f6647a = a0Var.f6568a.obtainMessage(1, r42, i12);
        b10.b();
        o0(c3, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void o(boolean z10) {
        q0();
        int d = this.A.d(b(), z10);
        int i10 = 1;
        if (z10 && d != 1) {
            i10 = 2;
        }
        n0(d, i10, z10);
    }

    public final void o0(final w1 w1Var, final int i10, final int i11, boolean z10, boolean z11, int i12, long j10, int i13, boolean z12) {
        Pair pair;
        int i14;
        f1 f1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i15;
        Object obj;
        f1 f1Var2;
        Object obj2;
        int i16;
        long j11;
        long j12;
        long j13;
        long W;
        Object obj3;
        f1 f1Var3;
        Object obj4;
        int i17;
        long j14;
        w1 w1Var2 = this.f10582i0;
        this.f10582i0 = w1Var;
        boolean equals = w1Var2.f10826a.equals(w1Var.f10826a);
        q2 q2Var = (q2) this.f306a;
        p2 p2Var = this.f10590n;
        r2 r2Var = w1Var2.f10826a;
        l4.c0 c0Var = w1Var2.f10827b;
        r2 r2Var2 = w1Var.f10826a;
        l4.c0 c0Var2 = w1Var.f10827b;
        if (r2Var2.p() && r2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (r2Var2.p() != r2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!r2Var.m(r2Var.g(c0Var.f14262a, p2Var).f10676c, q2Var, 0L).f10695a.equals(r2Var2.m(r2Var2.g(c0Var2.f14262a, p2Var).f10676c, q2Var, 0L).f10695a)) {
            if (z11 && i12 == 0) {
                i14 = 1;
            } else if (z11 && i12 == 1) {
                i14 = 2;
            } else if (!equals) {
                i14 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        } else if (z11 && i12 == 0 && c0Var.d < c0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z11 && i12 == 1 && z12) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        h1 h1Var = this.O;
        if (booleanValue) {
            if (!w1Var.f10826a.p()) {
                f1Var = w1Var.f10826a.m(w1Var.f10826a.g(w1Var.f10827b.f14262a, this.f10590n).f10676c, (q2) this.f306a, 0L).f10697c;
            } else {
                f1Var = null;
            }
            this.f10580h0 = h1.U;
        } else {
            f1Var = null;
        }
        if (booleanValue || !w1Var2.f10833j.equals(w1Var.f10833j)) {
            g1 a2 = this.f10580h0.a();
            List list = w1Var.f10833j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                b4.c cVar = (b4.c) list.get(i18);
                int i19 = 0;
                while (true) {
                    b4.b[] bVarArr = cVar.f1919a;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].populateMediaMetadata(a2);
                        i19++;
                    }
                }
            }
            this.f10580h0 = new h1(a2);
            h1Var = R();
        }
        boolean equals2 = h1Var.equals(this.O);
        this.O = h1Var;
        if (w1Var2.f10835l != w1Var.f10835l) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (w1Var2.f10829e != w1Var.f10829e) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13) {
            p0();
        }
        if (w1Var2.f10831g != w1Var.f10831g) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!equals) {
            this.f10587l.c(0, new f5.j() {
                @Override
                public final void invoke(Object obj5) {
                    a2 a2Var = (a2) obj5;
                    switch (r3) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.f10826a, i10);
                            return;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.f10835l, i10);
                            return;
                    }
                }
            });
        }
        if (z11) {
            p2 p2Var2 = new p2();
            if (!w1Var2.f10826a.p()) {
                Object obj5 = w1Var2.f10827b.f14262a;
                w1Var2.f10826a.g(obj5, p2Var2);
                int i20 = p2Var2.f10676c;
                int b10 = w1Var2.f10826a.b(obj5);
                z16 = booleanValue;
                z17 = z13;
                z18 = equals2;
                obj = w1Var2.f10826a.m(i20, (q2) this.f306a, 0L).f10695a;
                f1Var2 = ((q2) this.f306a).f10697c;
                obj2 = obj5;
                i15 = i20;
                i16 = b10;
            } else {
                z16 = booleanValue;
                z17 = z13;
                z18 = equals2;
                i15 = i13;
                obj = null;
                f1Var2 = null;
                obj2 = null;
                i16 = -1;
            }
            if (i12 == 0) {
                if (w1Var2.f10827b.a()) {
                    l4.c0 c0Var3 = w1Var2.f10827b;
                    j13 = p2Var2.a(c0Var3.f14263b, c0Var3.f14264c);
                    W = W(w1Var2);
                } else if (w1Var2.f10827b.f14265e != -1) {
                    j13 = W(this.f10582i0);
                    W = j13;
                } else {
                    j11 = p2Var2.f10677e;
                    j12 = p2Var2.d;
                    j13 = j11 + j12;
                    W = j13;
                }
            } else if (w1Var2.f10827b.a()) {
                j13 = w1Var2.f10841r;
                W = W(w1Var2);
            } else {
                j11 = p2Var2.f10677e;
                j12 = w1Var2.f10841r;
                j13 = j11 + j12;
                W = j13;
            }
            long S = f5.d0.S(j13);
            long S2 = f5.d0.S(W);
            l4.c0 c0Var4 = w1Var2.f10827b;
            b2 b2Var = new b2(obj, i15, f1Var2, obj2, i16, S, S2, c0Var4.f14263b, c0Var4.f14264c);
            q2 q2Var2 = (q2) this.f306a;
            int x4 = x();
            if (!this.f10582i0.f10826a.p()) {
                w1 w1Var3 = this.f10582i0;
                Object obj6 = w1Var3.f10827b.f14262a;
                w1Var3.f10826a.g(obj6, this.f10590n);
                int b11 = this.f10582i0.f10826a.b(obj6);
                Object obj7 = this.f10582i0.f10826a.m(x4, q2Var2, 0L).f10695a;
                f1Var3 = q2Var2.f10697c;
                i17 = b11;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                f1Var3 = null;
                obj4 = null;
                i17 = -1;
            }
            long S3 = f5.d0.S(j10);
            if (this.f10582i0.f10827b.a()) {
                j14 = f5.d0.S(W(this.f10582i0));
            } else {
                j14 = S3;
            }
            l4.c0 c0Var5 = this.f10582i0.f10827b;
            this.f10587l.c(11, new e3.d(i12, b2Var, new b2(obj3, x4, f1Var3, obj4, i17, S3, j14, c0Var5.f14263b, c0Var5.f14264c), 1));
        } else {
            z16 = booleanValue;
            z17 = z13;
            z18 = equals2;
        }
        if (z16) {
            this.f10587l.c(1, new eg.n2(f1Var, intValue, 1));
        }
        if (w1Var2.f10830f != w1Var.f10830f) {
            this.f10587l.c(10, new f5.j() {
                @Override
                public final void invoke(Object obj8) {
                    a2 a2Var = (a2) obj8;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
            if (w1Var.f10830f != null) {
                this.f10587l.c(10, new f5.j() {
                    @Override
                    public final void invoke(Object obj8) {
                        a2 a2Var = (a2) obj8;
                        switch (r2) {
                            case 0:
                                a2Var.onPlayerErrorChanged(w1Var.f10830f);
                                return;
                            case 1:
                                a2Var.onPlayerError(w1Var.f10830f);
                                return;
                            case 2:
                                a2Var.onTracksChanged(w1Var.f10832i.d);
                                return;
                            case 3:
                                w1 w1Var4 = w1Var;
                                a2Var.onLoadingChanged(w1Var4.f10831g);
                                a2Var.onIsLoadingChanged(w1Var4.f10831g);
                                return;
                            case 4:
                                w1 w1Var5 = w1Var;
                                a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                                return;
                            case 5:
                                a2Var.onPlaybackStateChanged(w1Var.f10829e);
                                return;
                            case 6:
                                a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                                return;
                            case 7:
                                a2Var.onIsPlayingChanged(k0.X(w1Var));
                                return;
                            default:
                                a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                                return;
                        }
                    }
                });
            }
        }
        d5.y yVar = w1Var2.f10832i;
        d5.y yVar2 = w1Var.f10832i;
        if (yVar != yVar2) {
            d5.u uVar = this.h;
            Object obj8 = yVar2.f5420e;
            uVar.getClass();
            uVar.f5379c = (d5.t) obj8;
            this.f10587l.c(2, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (!z18) {
            this.f10587l.c(14, new eg.n(this.O, 10));
        }
        if (z15) {
            this.f10587l.c(3, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (z14 || z17) {
            this.f10587l.c(-1, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (z14) {
            this.f10587l.c(4, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f10587l.c(5, new f5.j() {
                @Override
                public final void invoke(Object obj52) {
                    a2 a2Var = (a2) obj52;
                    switch (r3) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.f10826a, i11);
                            return;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.f10835l, i11);
                            return;
                    }
                }
            });
        }
        if (w1Var2.f10836m != w1Var.f10836m) {
            this.f10587l.c(6, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (X(w1Var2) != X(w1Var)) {
            this.f10587l.c(7, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (!w1Var2.f10837n.equals(w1Var.f10837n)) {
            this.f10587l.c(12, new f5.j() {
                @Override
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (r2) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f10830f);
                            return;
                        case 1:
                            a2Var.onPlayerError(w1Var.f10830f);
                            return;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f10832i.d);
                            return;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f10831g);
                            a2Var.onIsLoadingChanged(w1Var4.f10831g);
                            return;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f10835l, w1Var5.f10829e);
                            return;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f10829e);
                            return;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f10836m);
                            return;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            return;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f10837n);
                            return;
                    }
                }
            });
        }
        if (z10) {
            this.f10587l.c(-1, new eg.c(27));
        }
        m0();
        this.f10587l.b();
        if (w1Var2.f10838o != w1Var.f10838o) {
            Iterator it = this.f10589m.iterator();
            while (it.hasNext()) {
                ((h0) it.next()).f10477a.p0();
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
        ab.b bVar = this.D;
        ya.a aVar = this.C;
        if (b10 != 1) {
            if (b10 != 2 && b10 != 3) {
                if (b10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                q0();
                boolean z10 = this.f10582i0.f10838o;
                h();
                aVar.getClass();
                h();
                bVar.getClass();
                return;
            }
        }
        aVar.getClass();
        bVar.getClass();
    }

    @Override
    public final long q() {
        q0();
        if (c()) {
            w1 w1Var = this.f10582i0;
            r2 r2Var = w1Var.f10826a;
            Object obj = w1Var.f10827b.f14262a;
            p2 p2Var = this.f10590n;
            r2Var.g(obj, p2Var);
            w1 w1Var2 = this.f10582i0;
            if (w1Var2.f10828c == -9223372036854775807L) {
                return f5.d0.S(w1Var2.f10826a.m(x(), (q2) this.f306a, 0L).f10704x);
            }
            return f5.d0.S(this.f10582i0.f10828c) + f5.d0.S(p2Var.f10677e);
        }
        return D();
    }

    public final void q0() {
        IllegalStateException illegalStateException;
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f10595s;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = f5.d0.f6579a;
            Locale locale = Locale.US;
            String j10 = th.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (!this.f10572c0) {
                if (this.f10573d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                f5.a.L("ExoPlayerImpl", j10, illegalStateException);
                this.f10573d0 = true;
                return;
            }
            throw new IllegalStateException(j10);
        }
    }

    @Override
    public final void r(int i10, List list) {
        boolean z10;
        q0();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.f10593q.a((f1) list.get(i11)));
        }
        q0();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        ArrayList arrayList2 = this.f10591o;
        int min = Math.min(i10, arrayList2.size());
        r2 A = A();
        this.H++;
        ArrayList Q = Q(min, arrayList);
        f2 f2Var = new f2(arrayList2, this.M);
        w1 Y = Y(this.f10582i0, f2Var, V(A, f2Var));
        l4.h1 h1Var = this.M;
        f5.a0 a0Var = this.f10585k.f10686n;
        m0 m0Var = new m0(Q, h1Var, -1, -9223372036854775807L);
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.f6647a = a0Var.f6568a.obtainMessage(18, min, 0, m0Var);
        b10.b();
        o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long s() {
        q0();
        if (c()) {
            w1 w1Var = this.f10582i0;
            if (w1Var.f10834k.equals(w1Var.f10827b)) {
                return f5.d0.S(this.f10582i0.f10839p);
            }
            return getDuration();
        }
        q0();
        if (this.f10582i0.f10826a.p()) {
            return this.f10586k0;
        }
        w1 w1Var2 = this.f10582i0;
        if (w1Var2.f10834k.d != w1Var2.f10827b.d) {
            return f5.d0.S(w1Var2.f10826a.m(x(), (q2) this.f306a, 0L).f10705y);
        }
        long j10 = w1Var2.f10839p;
        if (this.f10582i0.f10834k.a()) {
            w1 w1Var3 = this.f10582i0;
            p2 g10 = w1Var3.f10826a.g(w1Var3.f10834k.f14262a, this.f10590n);
            long d = g10.d(this.f10582i0.f10834k.f14263b);
            if (d == Long.MIN_VALUE) {
                j10 = g10.d;
            } else {
                j10 = d;
            }
        }
        w1 w1Var4 = this.f10582i0;
        r2 r2Var = w1Var4.f10826a;
        Object obj = w1Var4.f10834k.f14262a;
        p2 p2Var = this.f10590n;
        r2Var.g(obj, p2Var);
        return f5.d0.S(j10 + p2Var.f10677e);
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        q0();
        if (this.f10582i0.f10837n.equals(x1Var)) {
            return;
        }
        w1 e10 = this.f10582i0.e(x1Var);
        this.H++;
        this.f10585k.f10686n.a(4, x1Var).b();
        o0(e10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void stop() {
        q0();
        q0();
        this.A.d(1, h());
        l0(null);
        new t4.c(this.f10582i0.f10841r, q8.l0.f46462e);
    }

    @Override
    public final t2 t() {
        q0();
        return this.f10582i0.f10832i.d;
    }

    @Override
    public final void u(a2 a2Var) {
        q0();
        a2Var.getClass();
        f5.m mVar = this.f10587l;
        mVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = mVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            f5.l lVar = (f5.l) it.next();
            if (lVar.f6598a.equals(a2Var)) {
                f5.k kVar = mVar.f6603c;
                lVar.d = true;
                if (lVar.f6600c) {
                    lVar.f6600c = false;
                    kVar.e(lVar.f6598a, lVar.f6599b.c());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    @Override
    public final n v() {
        q0();
        return this.f10582i0.f10830f;
    }

    @Override
    public final int w() {
        q0();
        if (c()) {
            return this.f10582i0.f10827b.f14263b;
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
    public final void y(int i10, int i11, int i12) {
        boolean z10;
        q0();
        if (i10 >= 0 && i10 <= i11 && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        ArrayList arrayList = this.f10591o;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            r2 A = A();
            this.H++;
            f5.d0.G(i10, min, min2, arrayList);
            f2 f2Var = new f2(arrayList, this.M);
            w1 Y = Y(this.f10582i0, f2Var, V(A, f2Var));
            l4.h1 h1Var = this.M;
            q0 q0Var = this.f10585k;
            q0Var.getClass();
            q0Var.f10686n.a(19, new n0(i10, min, min2, h1Var)).b();
            o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override
    public final int z() {
        q0();
        return this.f10582i0.f10836m;
    }
}
