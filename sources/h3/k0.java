package h3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import hh.y9;
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
import org.telegram.ui.Cells.pa;

public final class k0 extends b8.a implements s {
    public final d A;
    public final m2 B;
    public final w9.d C;
    public final xa.a D;
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
    public d5.a0 X;
    public final int Y;
    public j3.e Z;

    public float f7961a0;

    public final b5.z f7962b;

    public boolean f7963b0;

    public final y1 f7964c;

    public final boolean f7965c0;
    public final d5.c d;

    public boolean f7966d0;

    public final Context f7967e;

    public boolean f7968e0;

    public final c2 f7969f;

    public m f7970f0;

    public final e[] f7971g;

    public e5.x f7972g0;
    public final b5.v h;

    public h1 f7973h0;

    public final d5.d0 f7974i;

    public w1 f7975i0;

    public final w f7976j;

    public int f7977j0;

    public final q0 f7978k;

    public long f7979k0;

    public final d5.n f7980l;

    public DispatchQueue f7981l0;

    public final CopyOnWriteArraySet f7982m;
    public final ArrayList m0;

    public final p2 f7983n;

    public final ArrayList f7984o;

    public final boolean f7985p;

    public final j4.b0 f7986q;

    public final i3.f f7987r;

    public final Looper f7988s;

    public final com.google.android.exoplayer2.upstream.f f7989t;

    public final long f7990u;
    public final long v;

    public final d5.b0 f7991w;

    public final h0 f7992x;

    public final i0 f7993y;

    public final androidx.activity.n f7994z;

    static {
        r0.a("goog.exo.exoplayer");
    }

    public k0(r rVar, k2 k2Var) {
        super(2);
        this.m0 = new ArrayList();
        this.d = new d5.c();
        try {
            d5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.3] [" + d5.g0.f4798e + "]");
            Context context = rVar.f8089a;
            d5.b0 b0Var = rVar.f8090b;
            this.f7967e = context.getApplicationContext();
            this.f7987r = new i3.f(b0Var);
            this.Z = rVar.f8095i;
            this.W = rVar.f8096j;
            this.f7963b0 = false;
            this.E = rVar.f8103q;
            h0 h0Var = new h0(this);
            this.f7992x = h0Var;
            this.f7993y = new i0();
            Handler handler = new Handler(rVar.h);
            e[] eVarArrB = ((l) rVar.f8091c.get()).b(handler, h0Var, h0Var, h0Var, h0Var);
            this.f7971g = eVarArrB;
            d5.a.i(eVarArrB.length > 0);
            this.h = (b5.v) rVar.f8092e.get();
            this.f7986q = (j4.b0) rVar.d.get();
            this.f7989t = com.google.android.exoplayer2.upstream.u.b(rVar.f8094g.f8054b);
            this.f7985p = rVar.f8097k;
            this.L = rVar.f8098l;
            this.f7990u = rVar.f8099m;
            this.v = rVar.f8100n;
            Looper looper = rVar.h;
            this.f7988s = looper;
            this.f7991w = b0Var;
            this.f7969f = k2Var == null ? this : k2Var;
            this.f7980l = new d5.n(looper, b0Var, new w(this));
            this.f7982m = new CopyOnWriteArraySet();
            this.f7984o = new ArrayList();
            this.M = new j4.e1();
            this.f7962b = new b5.z(new i2[eVarArrB.length], new b5.s[eVarArrB.length], u2.f8210b, null);
            this.f7983n = new p2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                d5.a.i(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.h.getClass();
            d5.a.i(!false);
            sparseBooleanArray.append(29, true);
            d5.a.i(!false);
            d5.g gVar = new d5.g(sparseBooleanArray);
            this.f7964c = new y1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < gVar.f4794a.size(); i12++) {
                int iA = gVar.a(i12);
                d5.a.i(!false);
                sparseBooleanArray2.append(iA, true);
            }
            d5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            d5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            d5.a.i(!false);
            this.N = new y1(new d5.g(sparseBooleanArray2));
            this.f7974i = this.f7991w.a(this.f7988s, null);
            w wVar = new w(this);
            this.f7976j = wVar;
            this.f7975i0 = w1.h(this.f7962b);
            this.f7987r.m(this.f7969f, this.f7988s);
            int i13 = d5.g0.f4795a;
            this.f7978k = new q0(this.f7971g, this.h, this.f7962b, (j) rVar.f8093f.get(), this.f7989t, this.F, this.G, this.f7987r, this.L, rVar.f8101o, rVar.f8102p, this.f7988s, this.f7991w, wVar, i13 < 31 ? new i3.k() : c0.a(this.f7967e, this, rVar.f8104r));
            this.f7961a0 = 1.0f;
            this.F = 0;
            h1 h1Var = h1.U;
            this.O = h1Var;
            this.f7973h0 = h1Var;
            int iGenerateAudioSessionId = -1;
            this.f7977j0 = -1;
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
                AudioManager audioManager = (AudioManager) this.f7967e.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.Y = iGenerateAudioSessionId;
            }
            int i14 = r4.d.f46747b;
            this.f7965c0 = true;
            k(this.f7987r);
            com.google.android.exoplayer2.upstream.f fVar = this.f7989t;
            Handler handler2 = new Handler(this.f7988s);
            i3.f fVar2 = this.f7987r;
            com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) fVar;
            uVar.getClass();
            fVar2.getClass();
            k5.i iVar = uVar.f3056b;
            iVar.getClass();
            CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.e> copyOnWriteArrayList = (CopyOnWriteArrayList) iVar.f14480b;
            for (com.google.android.exoplayer2.upstream.e eVar : copyOnWriteArrayList) {
                if (eVar.f2983b == fVar2) {
                    eVar.f2984c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new com.google.android.exoplayer2.upstream.e(handler2, fVar2));
            this.f7982m.add(this.f7992x);
            h0 h0Var2 = this.f7992x;
            androidx.activity.n nVar = new androidx.activity.n();
            nVar.f894b = context.getApplicationContext();
            nVar.f895c = new b(nVar, handler, h0Var2);
            this.f7994z = nVar;
            nVar.d();
            d dVar = new d(context, handler, this.f7992x);
            this.A = dVar;
            dVar.b(null);
            m2 m2Var = new m2(context, handler, this.f7992x);
            this.B = m2Var;
            m2Var.c(d5.g0.y(this.Z.f12323c));
            int i15 = 8;
            w9.d dVar2 = new w9.d(i15);
            this.C = dVar2;
            xa.a aVar = new xa.a(i15);
            this.D = aVar;
            this.f7970f0 = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f8026f));
            this.f7972g0 = e5.x.f5307e;
            this.X = d5.a0.f4772c;
            this.h.b(this.Z);
            c0(1, 10, Integer.valueOf(this.Y));
            c0(2, 10, Integer.valueOf(this.Y));
            c0(1, 3, this.Z);
            c0(2, 4, Integer.valueOf(this.W));
            c0(2, 5, 0);
            c0(1, 9, Boolean.valueOf(this.f7963b0));
            c0(2, 7, this.f7993y);
            c0(6, 8, this.f7993y);
        } finally {
            this.d.c();
        }
    }

    public static long W(w1 w1Var) {
        r2 r2Var = new r2();
        p2 p2Var = new p2();
        w1Var.f8220a.g(w1Var.f8221b.f12503a, p2Var);
        long j10 = w1Var.f8222c;
        return j10 == -9223372036854775807L ? w1Var.f8220a.m(p2Var.f8069c, r2Var, 0L).f8121x : p2Var.f8070e + j10;
    }

    public static boolean X(w1 w1Var) {
        return w1Var.f8223e == 3 && w1Var.f8229l && w1Var.f8230m == 0;
    }

    @Override
    public final s2 A() {
        q0();
        return this.f7975i0.f8220a;
    }

    @Override
    public final Looper B() {
        return this.f7988s;
    }

    @Override
    public final boolean C() {
        q0();
        return this.G;
    }

    @Override
    public final long D() {
        q0();
        return d5.g0.S(T(this.f7975i0));
    }

    @Override
    public final long E() {
        q0();
        return this.f7990u;
    }

    @Override
    public final void N() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.3] [");
        sb2.append(d5.g0.f4798e);
        sb2.append("] [");
        HashSet hashSet = r0.f8106a;
        synchronized (r0.class) {
            str = r0.f8107b;
        }
        sb2.append(str);
        sb2.append("]");
        d5.a.v("ExoPlayerImpl", sb2.toString());
        q0();
        if (d5.g0.f4795a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.f7994z.d();
        m2 m2Var = this.B;
        androidx.mediarouter.app.f fVar = m2Var.f8025e;
        if (fVar != null) {
            try {
                m2Var.f8022a.unregisterReceiver(fVar);
            } catch (RuntimeException e9) {
                d5.a.L("StreamVolumeManager", "Error unregistering stream volume receiver", e9);
            }
            m2Var.f8025e = null;
        }
        this.C.getClass();
        this.D.getClass();
        d dVar = this.A;
        dVar.f7800c = null;
        dVar.a();
        if (!this.f7978k.y()) {
            this.f7980l.e(10, new f9.z(13));
        }
        this.f7980l.d();
        this.f7974i.f4782a.removeCallbacksAndMessages(null);
        com.google.android.exoplayer2.upstream.f fVar2 = this.f7989t;
        i3.f fVar3 = this.f7987r;
        CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.e> copyOnWriteArrayList = (CopyOnWriteArrayList) ((com.google.android.exoplayer2.upstream.u) fVar2).f3056b.f14480b;
        for (com.google.android.exoplayer2.upstream.e eVar : copyOnWriteArrayList) {
            if (eVar.f2983b == fVar3) {
                eVar.f2984c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        w1 w1VarF = this.f7975i0.f(1);
        this.f7975i0 = w1VarF;
        w1 w1VarA = w1VarF.a(w1VarF.f8221b);
        this.f7975i0 = w1VarA;
        w1VarA.f8233p = w1VarA.f8235r;
        this.f7975i0.f8234q = 0L;
        i3.f fVar4 = this.f7987r;
        d5.d0 d0Var = fVar4.f10535n;
        d5.a.j(d0Var);
        d0Var.c(new y9(fVar4, 3));
        this.h.a();
        b0();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        int i10 = r4.d.f46747b;
        this.f7968e0 = true;
    }

    @Override
    public final void O(long j10, int i10, int i11, boolean z10) {
        q0();
        d5.a.f(i10 >= 0);
        i3.f fVar = this.f7987r;
        if (!fVar.f10536r) {
            i3.a aVarA = fVar.a();
            fVar.f10536r = true;
            fVar.l(aVarA, -1, new i3.c(aVarA, 0));
        }
        s2 s2Var = this.f7975i0.f8220a;
        if (s2Var.p() || i10 < s2Var.o()) {
            this.H++;
            if (c()) {
                d5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ue.f fVar2 = new ue.f(this.f7975i0);
                fVar2.a(1);
                k0 k0Var = this.f7976j.f8218a;
                k0Var.f7974i.c(new d5.u(16, k0Var, fVar2));
                return;
            }
            int i12 = b() != 1 ? 2 : 1;
            int iX = x();
            w1 w1VarY = Y(this.f7975i0.f(i12), s2Var, Z(s2Var, i10, j10));
            this.f7978k.f8079n.a(3, new p0(s2Var, i10, d5.g0.H(j10))).b();
            o0(w1VarY, 0, 1, true, true, 1, T(w1VarY), iX, z10);
        }
    }

    public final ArrayList Q(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r1 r1Var = new r1((j4.a) list.get(i11), this.f7985p);
            arrayList.add(r1Var);
            j0 j0Var = new j0(r1Var.f8109b, r1Var.f8108a.f12698o);
            this.f7984o.add(i11 + i10, j0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    public final h1 R() {
        s2 s2VarA = A();
        if (s2VarA.p()) {
            return this.f7973h0;
        }
        f1 f1Var = s2VarA.m(x(), (r2) this.f2040a, 0L).f8114c;
        g1 g1VarA = this.f7973h0.a();
        h1 h1Var = f1Var.d;
        if (h1Var != null) {
            CharSequence charSequence = h1Var.f7896a;
            if (charSequence != null) {
                g1VarA.f7841a = charSequence;
            }
            CharSequence charSequence2 = h1Var.f7897b;
            if (charSequence2 != null) {
                g1VarA.f7842b = charSequence2;
            }
            CharSequence charSequence3 = h1Var.f7898c;
            if (charSequence3 != null) {
                g1VarA.f7843c = charSequence3;
            }
            CharSequence charSequence4 = h1Var.d;
            if (charSequence4 != null) {
                g1VarA.d = charSequence4;
            }
            CharSequence charSequence5 = h1Var.f7899e;
            if (charSequence5 != null) {
                g1VarA.f7844e = charSequence5;
            }
            CharSequence charSequence6 = h1Var.f7900f;
            if (charSequence6 != null) {
                g1VarA.f7845f = charSequence6;
            }
            CharSequence charSequence7 = h1Var.h;
            if (charSequence7 != null) {
                g1VarA.f7846g = charSequence7;
            }
            g2 g2Var = h1Var.f7901n;
            if (g2Var != null) {
                g1VarA.h = g2Var;
            }
            g2 g2Var2 = h1Var.f7902r;
            if (g2Var2 != null) {
                g1VarA.f7847i = g2Var2;
            }
            byte[] bArr = h1Var.f7903s;
            if (bArr != null) {
                Integer num = h1Var.v;
                g1VarA.f7848j = (byte[]) bArr.clone();
                g1VarA.f7849k = num;
            }
            Uri uri = h1Var.f7904w;
            if (uri != null) {
                g1VarA.f7850l = uri;
            }
            Integer num2 = h1Var.f7905x;
            if (num2 != null) {
                g1VarA.f7851m = num2;
            }
            Integer num3 = h1Var.f7906y;
            if (num3 != null) {
                g1VarA.f7852n = num3;
            }
            Integer num4 = h1Var.A;
            if (num4 != null) {
                g1VarA.f7853o = num4;
            }
            Boolean bool = h1Var.B;
            if (bool != null) {
                g1VarA.f7854p = bool;
            }
            Boolean bool2 = h1Var.C;
            if (bool2 != null) {
                g1VarA.f7855q = bool2;
            }
            Integer num5 = h1Var.D;
            if (num5 != null) {
                g1VarA.f7856r = num5;
            }
            Integer num6 = h1Var.E;
            if (num6 != null) {
                g1VarA.f7856r = num6;
            }
            Integer num7 = h1Var.F;
            if (num7 != null) {
                g1VarA.f7857s = num7;
            }
            Integer num8 = h1Var.G;
            if (num8 != null) {
                g1VarA.f7858t = num8;
            }
            Integer num9 = h1Var.H;
            if (num9 != null) {
                g1VarA.f7859u = num9;
            }
            Integer num10 = h1Var.I;
            if (num10 != null) {
                g1VarA.v = num10;
            }
            Integer num11 = h1Var.J;
            if (num11 != null) {
                g1VarA.f7860w = num11;
            }
            CharSequence charSequence8 = h1Var.K;
            if (charSequence8 != null) {
                g1VarA.f7861x = charSequence8;
            }
            CharSequence charSequence9 = h1Var.L;
            if (charSequence9 != null) {
                g1VarA.f7862y = charSequence9;
            }
            CharSequence charSequence10 = h1Var.M;
            if (charSequence10 != null) {
                g1VarA.f7863z = charSequence10;
            }
            Integer num12 = h1Var.N;
            if (num12 != null) {
                g1VarA.A = num12;
            }
            Integer num13 = h1Var.O;
            if (num13 != null) {
                g1VarA.B = num13;
            }
            CharSequence charSequence11 = h1Var.P;
            if (charSequence11 != null) {
                g1VarA.C = charSequence11;
            }
            CharSequence charSequence12 = h1Var.Q;
            if (charSequence12 != null) {
                g1VarA.D = charSequence12;
            }
            CharSequence charSequence13 = h1Var.R;
            if (charSequence13 != null) {
                g1VarA.E = charSequence13;
            }
            Integer num14 = h1Var.S;
            if (num14 != null) {
                g1VarA.F = num14;
            }
            Bundle bundle = h1Var.T;
            if (bundle != null) {
                g1VarA.G = bundle;
            }
        }
        return new h1(g1VarA);
    }

    public final e2 S(d2 d2Var) {
        int iU = U();
        s2 s2Var = this.f7975i0.f8220a;
        int i10 = iU == -1 ? 0 : iU;
        d5.b0 b0Var = this.f7991w;
        q0 q0Var = this.f7978k;
        return new e2(q0Var, d2Var, s2Var, i10, b0Var, q0Var.f8081s);
    }

    public final long T(w1 w1Var) {
        if (w1Var.f8220a.p()) {
            return d5.g0.H(this.f7979k0);
        }
        if (w1Var.f8221b.a()) {
            return w1Var.f8235r;
        }
        s2 s2Var = w1Var.f8220a;
        j4.c0 c0Var = w1Var.f8221b;
        long j10 = w1Var.f8235r;
        Object obj = c0Var.f12503a;
        p2 p2Var = this.f7983n;
        s2Var.g(obj, p2Var);
        return j10 + p2Var.f8070e;
    }

    public final int U() {
        if (this.f7975i0.f8220a.p()) {
            return this.f7977j0;
        }
        w1 w1Var = this.f7975i0;
        return w1Var.f8220a.g(w1Var.f8221b.f12503a, this.f7983n).f8069c;
    }

    public final Pair V(s2 s2Var, f2 f2Var) {
        long jQ = q();
        if (s2Var.p() || f2Var.p()) {
            boolean z10 = !s2Var.p() && f2Var.p();
            int iU = z10 ? -1 : U();
            if (z10) {
                jQ = -9223372036854775807L;
            }
            return Z(f2Var, iU, jQ);
        }
        Pair pairI = s2Var.i((r2) this.f2040a, this.f7983n, x(), d5.g0.H(jQ));
        Object obj = pairI.first;
        if (f2Var.b(obj) != -1) {
            return pairI;
        }
        Object objH = q0.H((r2) this.f2040a, this.f7983n, this.F, this.G, obj, s2Var, f2Var);
        if (objH == null) {
            return Z(f2Var, -1, -9223372036854775807L);
        }
        p2 p2Var = this.f7983n;
        f2Var.g(objH, p2Var);
        int i10 = p2Var.f8069c;
        r2 r2Var = (r2) this.f2040a;
        f2Var.m(i10, r2Var, 0L);
        return Z(f2Var, i10, d5.g0.S(r2Var.f8121x));
    }

    public final w1 Y(w1 w1Var, s2 s2Var, Pair pair) {
        List list;
        d5.a.f(s2Var.p() || pair != null);
        s2 s2Var2 = w1Var.f8220a;
        w1 w1VarG = w1Var.g(s2Var);
        if (s2Var.p()) {
            j4.c0 c0Var = w1.f8219s;
            long jH = d5.g0.H(this.f7979k0);
            w1 w1VarA = w1VarG.b(c0Var, jH, jH, jH, 0L, j4.j1.d, this.f7962b, p8.l0.f45555e).a(c0Var);
            w1VarA.f8233p = w1VarA.f8235r;
            return w1VarA;
        }
        Object obj = w1VarG.f8221b.f12503a;
        int i10 = d5.g0.f4795a;
        boolean zEquals = obj.equals(pair.first);
        j4.c0 c0Var2 = !zEquals ? new j4.c0(pair.first) : w1VarG.f8221b;
        long jLongValue = ((Long) pair.second).longValue();
        long jH2 = d5.g0.H(q());
        if (!s2Var2.p()) {
            jH2 -= s2Var2.g(obj, this.f7983n).f8070e;
        }
        if (!zEquals || jLongValue < jH2) {
            j4.c0 c0Var3 = c0Var2;
            d5.a.i(!c0Var3.a());
            j4.j1 j1Var = !zEquals ? j4.j1.d : w1VarG.h;
            b5.z zVar = !zEquals ? this.f7962b : w1VarG.f8226i;
            if (zEquals) {
                list = w1VarG.f8227j;
            } else {
                p8.x xVar = p8.z.f45604b;
                list = p8.l0.f45555e;
            }
            w1 w1VarA2 = w1VarG.b(c0Var3, jLongValue, jLongValue, jLongValue, 0L, j1Var, zVar, list).a(c0Var3);
            w1VarA2.f8233p = jLongValue;
            return w1VarA2;
        }
        if (jLongValue != jH2) {
            j4.c0 c0Var4 = c0Var2;
            d5.a.i(!c0Var4.a());
            long jMax = Math.max(0L, w1VarG.f8234q - (jLongValue - jH2));
            long j10 = w1VarG.f8233p;
            if (w1VarG.f8228k.equals(w1VarG.f8221b)) {
                j10 = jLongValue + jMax;
            }
            w1 w1VarB = w1VarG.b(c0Var4, jLongValue, jLongValue, jLongValue, jMax, w1VarG.h, w1VarG.f8226i, w1VarG.f8227j);
            w1VarB.f8233p = j10;
            return w1VarB;
        }
        int iB = s2Var.b(w1VarG.f8228k.f12503a);
        if (iB != -1 && s2Var.f(iB, this.f7983n, false).f8069c == s2Var.g(c0Var2.f12503a, this.f7983n).f8069c) {
            return w1VarG;
        }
        s2Var.g(c0Var2.f12503a, this.f7983n);
        long jA = c0Var2.a() ? this.f7983n.a(c0Var2.f12504b, c0Var2.f12505c) : this.f7983n.d;
        j4.c0 c0Var5 = c0Var2;
        w1 w1VarA3 = w1VarG.b(c0Var5, w1VarG.f8235r, w1VarG.f8235r, w1VarG.d, jA - w1VarG.f8235r, w1VarG.h, w1VarG.f8226i, w1VarG.f8227j).a(c0Var5);
        w1VarA3.f8233p = jA;
        return w1VarA3;
    }

    public final Pair Z(s2 s2Var, int i10, long j10) {
        if (s2Var.p()) {
            this.f7977j0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f7979k0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= s2Var.o()) {
            i10 = s2Var.a(this.G);
            j10 = d5.g0.S(s2Var.m(i10, (r2) this.f2040a, 0L).f8121x);
        }
        return s2Var.i((r2) this.f2040a, this.f7983n, i10, d5.g0.H(j10));
    }

    @Override
    public final void a() {
        q0();
        boolean zH = h();
        int iD = this.A.d(2, zH);
        n0(iD, (!zH || iD == 1) ? 1 : 2, zH);
        w1 w1Var = this.f7975i0;
        if (w1Var.f8223e != 1) {
            return;
        }
        w1 w1VarD = w1Var.d(null);
        w1 w1VarF = w1VarD.f(w1VarD.f8220a.p() ? 4 : 2);
        this.H++;
        d5.d0 d0Var = this.f7978k.f8079n;
        d0Var.getClass();
        d5.c0 c0VarB = d5.d0.b();
        c0VarB.f4780a = d0Var.f4782a.obtainMessage(0);
        c0VarB.b();
        o0(w1VarF, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void a0(int i10, int i11) {
        d5.a0 a0Var = this.X;
        if (i10 == a0Var.f4773a && i11 == a0Var.f4774b) {
            return;
        }
        this.X = new d5.a0(i10, i11);
        DispatchQueue dispatchQueue = this.f7981l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new z(this, i10, i11, 0));
        } else {
            this.f7980l.e(24, new a0(i10, i11, 0));
        }
    }

    @Override
    public final int b() {
        q0();
        return this.f7975i0.f8223e;
    }

    public final void b0() {
        TextureView textureView = this.V;
        h0 h0Var = this.f7992x;
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
        return this.f7975i0.f8221b.a();
    }

    public final void c0(int i10, int i11, Object obj) {
        for (e eVar : this.f7971g) {
            if (eVar.getTrackType() == i10) {
                e2 e2VarS = S(eVar);
                d5.a.i(!e2VarS.f7818g);
                e2VarS.d = i11;
                d5.a.i(!e2VarS.f7818g);
                e2VarS.f7816e = obj;
                e2VarS.c();
            }
        }
    }

    @Override
    public final long d() {
        q0();
        return d5.g0.S(this.f7975i0.f8234q);
    }

    public final void d0(j3.e eVar, boolean z10) {
        q0();
        if (this.f7968e0) {
            return;
        }
        boolean zA = d5.g0.a(this.Z, eVar);
        int i10 = 1;
        d5.n nVar = this.f7980l;
        if (!zA) {
            this.Z = eVar;
            c0(1, 3, eVar);
            this.B.c(d5.g0.y(eVar.f12323c));
            nVar.c(20, new x(eVar, 0));
        }
        j3.e eVar2 = z10 ? eVar : null;
        d dVar = this.A;
        dVar.b(eVar2);
        this.h.b(eVar);
        boolean zH = h();
        int iD = dVar.d(b(), zH);
        if (zH && iD != 1) {
            i10 = 2;
        }
        n0(iD, i10, zH);
        nVar.b();
    }

    @Override
    public final void e(int i10) {
        q0();
        if (this.F != i10) {
            this.F = i10;
            d5.d0 d0Var = this.f7978k.f8079n;
            d0Var.getClass();
            d5.c0 c0VarB = d5.d0.b();
            c0VarB.f4780a = d0Var.f4782a.obtainMessage(11, i10, 0);
            c0VarB.b();
            y yVar = new y(i10, 0);
            d5.n nVar = this.f7980l;
            nVar.c(8, yVar);
            m0();
            nVar.b();
        }
    }

    public final void e0(j4.a aVar, boolean z10) {
        q0();
        List listSingletonList = Collections.singletonList(aVar);
        q0();
        int iU = U();
        long jD = D();
        this.H++;
        ArrayList arrayList = this.f7984o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList arrayListQ = Q(0, listSingletonList);
        f2 f2Var = new f2(arrayList, this.M);
        boolean zP = f2Var.p();
        int i11 = f2Var.f7834e;
        if (!zP && -1 >= i11) {
            throw new w0();
        }
        if (z10) {
            iU = f2Var.a(this.G);
            jD = -9223372036854775807L;
        }
        int i12 = iU;
        w1 w1VarY = Y(this.f7975i0, f2Var, Z(f2Var, i12, jD));
        int i13 = w1VarY.f8223e;
        if (i12 != -1 && i13 != 1) {
            i13 = (f2Var.p() || i12 >= i11) ? 4 : 2;
        }
        w1 w1VarF = w1VarY.f(i13);
        this.f7978k.f8079n.a(17, new m0(arrayListQ, this.M, i12, d5.g0.H(jD))).b();
        o0(w1VarF, 0, 1, false, (this.f7975i0.f8221b.f12503a.equals(w1VarF.f8221b.f12503a) || this.f7975i0.f8220a.p()) ? false : true, 4, T(w1VarF), -1, false);
    }

    @Override
    public final y1 f() {
        q0();
        return this.N;
    }

    public final void f0(j2 j2Var) {
        q0();
        if (j2Var == null) {
            j2Var = j2.f7953e;
        }
        if (this.L.equals(j2Var)) {
            return;
        }
        this.L = j2Var;
        this.f7978k.f8079n.a(5, j2Var).b();
    }

    @Override
    public final int g() {
        q0();
        return this.F;
    }

    public final void g0(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (e eVar : this.f7971g) {
            if (eVar.getTrackType() == 2) {
                e2 e2VarS = S(eVar);
                d5.a.i(!e2VarS.f7818g);
                e2VarS.d = 1;
                d5.a.i(true ^ e2VarS.f7818g);
                e2VarS.f7816e = surface;
                e2VarS.c();
                arrayList.add(e2VarS);
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
            l0(new n(2, new a7.c("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final long getDuration() {
        q0();
        if (!c()) {
            s2 s2VarA = A();
            if (s2VarA.p()) {
                return -9223372036854775807L;
            }
            return d5.g0.S(s2VarA.m(x(), (r2) this.f2040a, 0L).f8122y);
        }
        w1 w1Var = this.f7975i0;
        j4.c0 c0Var = w1Var.f8221b;
        s2 s2Var = w1Var.f8220a;
        Object obj = c0Var.f12503a;
        p2 p2Var = this.f7983n;
        s2Var.g(obj, p2Var);
        return d5.g0.S(p2Var.a(c0Var.f12504b, c0Var.f12505c));
    }

    @Override
    public final x1 getPlaybackParameters() {
        q0();
        return this.f7975i0.f8231n;
    }

    @Override
    public final boolean h() {
        q0();
        return this.f7975i0.f8229l;
    }

    public final void h0(Surface surface) {
        q0();
        b0();
        g0(surface);
        int i10 = surface == null ? 0 : -1;
        a0(i10, i10);
    }

    @Override
    public final void i(boolean z10) {
        q0();
        if (this.G != z10) {
            this.G = z10;
            d5.d0 d0Var = this.f7978k.f8079n;
            d0Var.getClass();
            d5.c0 c0VarB = d5.d0.b();
            c0VarB.f4780a = d0Var.f4782a.obtainMessage(12, z10 ? 1 : 0, 0);
            c0VarB.b();
            t tVar = new t(0, z10);
            d5.n nVar = this.f7980l;
            nVar.c(9, tVar);
            m0();
            nVar.b();
        }
    }

    public final void i0(SurfaceView surfaceView) {
        q0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
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
        holder.addCallback(this.f7992x);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            g0(null);
            a0(0, 0);
        } else {
            g0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            a0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override
    public final void j() {
        q0();
    }

    public final void j0(TextureView textureView) {
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
        textureView.setSurfaceTextureListener(this.f7992x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            g0(null);
            a0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            g0(surface);
            this.S = surface;
            a0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override
    public final void k(a2 a2Var) {
        a2Var.getClass();
        this.f7980l.a(a2Var);
    }

    public final void k0(float f10) {
        q0();
        final float fG = d5.g0.g(f10, 0.0f, 1.0f);
        if (this.f7961a0 == fG) {
            return;
        }
        this.f7961a0 = fG;
        c0(1, 2, Float.valueOf(this.A.f7803g * fG));
        this.f7980l.e(22, new d5.k() {
            @Override
            public final void invoke(Object obj) {
                ((a2) obj).onVolumeChanged(fG);
            }
        });
    }

    @Override
    public final int l() {
        q0();
        if (this.f7975i0.f8220a.p()) {
            return 0;
        }
        w1 w1Var = this.f7975i0;
        return w1Var.f8220a.b(w1Var.f8221b.f12503a);
    }

    public final void l0(n nVar) {
        w1 w1Var = this.f7975i0;
        w1 w1VarA = w1Var.a(w1Var.f8221b);
        w1VarA.f8233p = w1VarA.f8235r;
        w1VarA.f8234q = 0L;
        w1 w1VarF = w1VarA.f(1);
        if (nVar != null) {
            w1VarF = w1VarF.d(nVar);
        }
        w1 w1Var2 = w1VarF;
        this.H++;
        d5.d0 d0Var = this.f7978k.f8079n;
        d0Var.getClass();
        d5.c0 c0VarB = d5.d0.b();
        c0VarB.f4780a = d0Var.f4782a.obtainMessage(6);
        c0VarB.b();
        o0(w1Var2, 0, 1, false, w1Var2.f8220a.p() && !this.f7975i0.f8220a.p(), 4, T(w1Var2), -1, false);
    }

    @Override
    public final int m() {
        q0();
        if (c()) {
            return this.f7975i0.f8221b.f12505c;
        }
        return -1;
    }

    public final void m0() {
        int iK;
        int iE;
        y1 y1Var = this.N;
        int i10 = d5.g0.f4795a;
        c2 c2Var = this.f7969f;
        boolean zC = c2Var.c();
        b8.a aVar = (b8.a) c2Var;
        s2 s2VarA = aVar.A();
        boolean z10 = !s2VarA.p() && s2VarA.m(aVar.x(), (r2) aVar.f2040a, 0L).f8117n;
        s2 s2VarA2 = aVar.A();
        if (s2VarA2.p()) {
            iK = -1;
        } else {
            int iX = aVar.x();
            int iG = aVar.g();
            if (iG == 1) {
                iG = 0;
            }
            iK = s2VarA2.k(iX, iG, aVar.C());
        }
        boolean z11 = iK != -1;
        s2 s2VarA3 = aVar.A();
        if (s2VarA3.p()) {
            iE = -1;
        } else {
            int iX2 = aVar.x();
            int iG2 = aVar.g();
            if (iG2 == 1) {
                iG2 = 0;
            }
            iE = s2VarA3.e(iX2, iG2, aVar.C());
        }
        boolean z12 = iE != -1;
        boolean zJ = aVar.J();
        boolean zI = aVar.I();
        boolean zP = c2Var.A().p();
        k5.i iVar = new k5.i(16);
        c2.t tVar = (c2.t) iVar.f14480b;
        d5.g gVar = this.f7964c.f8256a;
        tVar.getClass();
        for (int i11 = 0; i11 < gVar.f4794a.size(); i11++) {
            tVar.b(gVar.a(i11));
        }
        boolean z13 = !zC;
        iVar.z(4, z13);
        iVar.z(5, z10 && !zC);
        iVar.z(6, z11 && !zC);
        iVar.z(7, !zP && (z11 || !zJ || z10) && !zC);
        iVar.z(8, z12 && !zC);
        iVar.z(9, !zP && (z12 || (zJ && zI)) && !zC);
        iVar.z(10, z13);
        iVar.z(11, z10 && !zC);
        iVar.z(12, z10 && !zC);
        y1 y1Var2 = new y1(tVar.c());
        this.N = y1Var2;
        if (y1Var2.equals(y1Var)) {
            return;
        }
        this.f7980l.c(13, new w(this));
    }

    @Override
    public final void n(int i10, int i11) {
        q0();
        d5.a.f(i10 >= 0 && i11 >= i10);
        int size = this.f7984o.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        int iX = x();
        s2 s2VarA = A();
        ArrayList arrayList = this.f7984o;
        int size2 = arrayList.size();
        this.H++;
        for (int i12 = iMin - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, iMin);
        f2 f2Var = new f2(arrayList, this.M);
        w1 w1VarY = Y(this.f7975i0, f2Var, V(s2VarA, f2Var));
        int i13 = w1VarY.f8223e;
        if (i13 != 1 && i13 != 4 && i10 < iMin && iMin == size2 && iX >= w1VarY.f8220a.o()) {
            w1VarY = w1VarY.f(4);
        }
        j4.g1 g1Var = this.M;
        d5.d0 d0Var = this.f7978k.f8079n;
        d0Var.getClass();
        d5.c0 c0VarB = d5.d0.b();
        c0VarB.f4780a = d0Var.f4782a.obtainMessage(20, i10, iMin, g1Var);
        c0VarB.b();
        o0(w1VarY, 0, 1, false, !w1VarY.f8221b.f12503a.equals(this.f7975i0.f8221b.f12503a), 4, T(w1VarY), -1, false);
    }

    public final void n0(int i10, int i11, boolean z10) {
        int i12 = 0;
        ?? r10 = (!z10 || i10 == -1) ? 0 : 1;
        if (r10 != 0 && i10 != 1) {
            i12 = 1;
        }
        w1 w1Var = this.f7975i0;
        if (w1Var.f8229l == r10 && w1Var.f8230m == i12) {
            return;
        }
        this.H++;
        w1 w1VarC = w1Var.c(i12, r10);
        d5.d0 d0Var = this.f7978k.f8079n;
        d0Var.getClass();
        d5.c0 c0VarB = d5.d0.b();
        c0VarB.f4780a = d0Var.f4782a.obtainMessage(1, r10, i12);
        c0VarB.b();
        o0(w1VarC, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void o(boolean z10) {
        q0();
        int iD = this.A.d(b(), z10);
        int i10 = 1;
        if (z10 && iD != 1) {
            i10 = 2;
        }
        n0(iD, i10, z10);
    }

    public final void o0(final w1 w1Var, final int i10, final int i11, boolean z10, boolean z11, int i12, long j10, int i13, boolean z12) {
        Pair pair;
        int i14;
        f1 f1Var;
        int i15;
        Object obj;
        f1 f1Var2;
        Object obj2;
        int i16;
        long j11;
        long j12;
        long jW;
        long jW2;
        Object obj3;
        f1 f1Var3;
        Object obj4;
        int i17;
        w1 w1Var2 = this.f7975i0;
        this.f7975i0 = w1Var;
        boolean zEquals = w1Var2.f8220a.equals(w1Var.f8220a);
        r2 r2Var = (r2) this.f2040a;
        p2 p2Var = this.f7983n;
        s2 s2Var = w1Var2.f8220a;
        j4.c0 c0Var = w1Var2.f8221b;
        s2 s2Var2 = w1Var.f8220a;
        j4.c0 c0Var2 = w1Var.f8221b;
        if (s2Var2.p() && s2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (s2Var2.p() != s2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!s2Var.m(s2Var.g(c0Var.f12503a, p2Var).f8069c, r2Var, 0L).f8112a.equals(s2Var2.m(s2Var2.g(c0Var2.f12503a, p2Var).f8069c, r2Var, 0L).f8112a)) {
            if (z11 && i12 == 0) {
                i14 = 1;
            } else if (z11 && i12 == 1) {
                i14 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i14 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        } else if (z11 && i12 == 0 && c0Var.d < c0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z11 && i12 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        h1 h1VarR = this.O;
        if (zBooleanValue) {
            f1Var = w1Var.f8220a.p() ? null : w1Var.f8220a.m(w1Var.f8220a.g(w1Var.f8221b.f12503a, this.f7983n).f8069c, (r2) this.f2040a, 0L).f8114c;
            this.f7973h0 = h1.U;
        } else {
            f1Var = null;
        }
        if (zBooleanValue || !w1Var2.f8227j.equals(w1Var.f8227j)) {
            g1 g1VarA = this.f7973h0.a();
            List list = w1Var.f8227j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                z3.c cVar = (z3.c) list.get(i18);
                int i19 = 0;
                while (true) {
                    z3.b[] bVarArr = cVar.f50188a;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].populateMediaMetadata(g1VarA);
                        i19++;
                    }
                }
            }
            this.f7973h0 = new h1(g1VarA);
            h1VarR = R();
        }
        boolean zEquals2 = h1VarR.equals(this.O);
        this.O = h1VarR;
        boolean z13 = w1Var2.f8229l != w1Var.f8229l;
        boolean z14 = w1Var2.f8223e != w1Var.f8223e;
        if (z14 || z13) {
            p0();
        }
        boolean z15 = w1Var2.f8225g != w1Var.f8225g;
        if (!zEquals) {
            final int i20 = 0;
            this.f7980l.c(0, new d5.k() {
                @Override
                public final void invoke(Object obj5) {
                    a2 a2Var = (a2) obj5;
                    switch (i20) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.f8220a, i10);
                            break;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.f8229l, i10);
                            break;
                    }
                }
            });
        }
        if (z11) {
            p2 p2Var2 = new p2();
            if (w1Var2.f8220a.p()) {
                i15 = i13;
                obj = null;
                f1Var2 = null;
                obj2 = null;
                i16 = -1;
            } else {
                Object obj5 = w1Var2.f8221b.f12503a;
                w1Var2.f8220a.g(obj5, p2Var2);
                int i21 = p2Var2.f8069c;
                int iB = w1Var2.f8220a.b(obj5);
                obj = w1Var2.f8220a.m(i21, (r2) this.f2040a, 0L).f8112a;
                f1Var2 = ((r2) this.f2040a).f8114c;
                obj2 = obj5;
                i15 = i21;
                i16 = iB;
            }
            if (i12 == 0) {
                if (w1Var2.f8221b.a()) {
                    j4.c0 c0Var3 = w1Var2.f8221b;
                    jW = p2Var2.a(c0Var3.f12504b, c0Var3.f12505c);
                    jW2 = W(w1Var2);
                } else {
                    if (w1Var2.f8221b.f12506e != -1) {
                        jW = W(this.f7975i0);
                    } else {
                        j11 = p2Var2.f8070e;
                        j12 = p2Var2.d;
                        jW = j11 + j12;
                    }
                    jW2 = jW;
                }
            } else if (w1Var2.f8221b.a()) {
                jW = w1Var2.f8235r;
                jW2 = W(w1Var2);
            } else {
                j11 = p2Var2.f8070e;
                j12 = w1Var2.f8235r;
                jW = j11 + j12;
                jW2 = jW;
            }
            long jS = d5.g0.S(jW);
            long jS2 = d5.g0.S(jW2);
            j4.c0 c0Var4 = w1Var2.f8221b;
            b2 b2Var = new b2(obj, i15, f1Var2, obj2, i16, jS, jS2, c0Var4.f12504b, c0Var4.f12505c);
            r2 r2Var2 = (r2) this.f2040a;
            int iX = x();
            if (this.f7975i0.f8220a.p()) {
                obj3 = null;
                f1Var3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                w1 w1Var3 = this.f7975i0;
                Object obj6 = w1Var3.f8221b.f12503a;
                w1Var3.f8220a.g(obj6, this.f7983n);
                int iB2 = this.f7975i0.f8220a.b(obj6);
                Object obj7 = this.f7975i0.f8220a.m(iX, r2Var2, 0L).f8112a;
                f1Var3 = r2Var2.f8114c;
                i17 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jS3 = d5.g0.S(j10);
            long jS4 = this.f7975i0.f8221b.a() ? d5.g0.S(W(this.f7975i0)) : jS3;
            j4.c0 c0Var5 = this.f7975i0.f8221b;
            this.f7980l.c(11, new c3.d(i12, b2Var, new b2(obj3, iX, f1Var3, obj4, i17, jS3, jS4, c0Var5.f12504b, c0Var5.f12505c), 1));
        } else {
            zBooleanValue = zBooleanValue;
            z13 = z13;
            zEquals2 = zEquals2;
        }
        if (zBooleanValue) {
            this.f7980l.c(1, new cg.p2(f1Var, iIntValue, 1));
        }
        if (w1Var2.f8224f != w1Var.f8224f) {
            final int i22 = 0;
            this.f7980l.c(10, new d5.k() {
                @Override
                public final void invoke(Object obj8) {
                    a2 a2Var = (a2) obj8;
                    switch (i22) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
            if (w1Var.f8224f != null) {
                final int i23 = 1;
                this.f7980l.c(10, new d5.k() {
                    @Override
                    public final void invoke(Object obj8) {
                        a2 a2Var = (a2) obj8;
                        switch (i23) {
                            case 0:
                                a2Var.onPlayerErrorChanged(w1Var.f8224f);
                                break;
                            case 1:
                                a2Var.onPlayerError(w1Var.f8224f);
                                break;
                            case 2:
                                a2Var.onTracksChanged(w1Var.f8226i.d);
                                break;
                            case 3:
                                w1 w1Var4 = w1Var;
                                a2Var.onLoadingChanged(w1Var4.f8225g);
                                a2Var.onIsLoadingChanged(w1Var4.f8225g);
                                break;
                            case 4:
                                w1 w1Var5 = w1Var;
                                a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                                break;
                            case 5:
                                a2Var.onPlaybackStateChanged(w1Var.f8223e);
                                break;
                            case 6:
                                a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                                break;
                            case 7:
                                a2Var.onIsPlayingChanged(k0.X(w1Var));
                                break;
                            default:
                                a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                                break;
                        }
                    }
                });
            }
        }
        b5.z zVar = w1Var2.f8226i;
        b5.z zVar2 = w1Var.f8226i;
        if (zVar != zVar2) {
            b5.v vVar = this.h;
            Object obj8 = zVar2.f2031e;
            vVar.getClass();
            vVar.f1990c = (b5.u) obj8;
            final int i24 = 2;
            this.f7980l.c(2, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i24) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f7980l.c(14, new a1.c(this.O, 29));
        }
        if (z15) {
            final int i25 = 3;
            this.f7980l.c(3, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i25) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (z14 || z13) {
            final int i26 = 4;
            this.f7980l.c(-1, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i26) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i27 = 5;
            this.f7980l.c(4, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i27) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (z13) {
            final int i28 = 1;
            this.f7980l.c(5, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i28) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.f8220a, i11);
                            break;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.f8229l, i11);
                            break;
                    }
                }
            });
        }
        if (w1Var2.f8230m != w1Var.f8230m) {
            final int i29 = 6;
            this.f7980l.c(6, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i29) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (X(w1Var2) != X(w1Var)) {
            final int i30 = 7;
            this.f7980l.c(7, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i30) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (!w1Var2.f8231n.equals(w1Var.f8231n)) {
            final int i31 = 8;
            this.f7980l.c(12, new d5.k() {
                @Override
                public final void invoke(Object obj9) {
                    a2 a2Var = (a2) obj9;
                    switch (i31) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f8224f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f8224f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.f8226i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.f8225g);
                            a2Var.onIsLoadingChanged(w1Var4.f8225g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.f8229l, w1Var5.f8223e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.f8223e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.f8230m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.f8231n);
                            break;
                    }
                }
            });
        }
        if (z10) {
            this.f7980l.c(-1, new f9.z(14));
        }
        m0();
        this.f7980l.b();
        if (w1Var2.f8232o != w1Var.f8232o) {
            Iterator it = this.f7982m.iterator();
            while (it.hasNext()) {
                ((h0) it.next()).f7870a.p0();
            }
        }
    }

    @Override
    public final long p() {
        q0();
        return this.v;
    }

    public final void p0() {
        int iB = b();
        xa.a aVar = this.D;
        w9.d dVar = this.C;
        if (iB != 1) {
            if (iB == 2 || iB == 3) {
                q0();
                boolean z10 = this.f7975i0.f8232o;
                h();
                dVar.getClass();
                h();
                aVar.getClass();
                return;
            }
            if (iB != 4) {
                throw new IllegalStateException();
            }
        }
        dVar.getClass();
        aVar.getClass();
    }

    @Override
    public final long q() {
        q0();
        if (!c()) {
            return D();
        }
        w1 w1Var = this.f7975i0;
        s2 s2Var = w1Var.f8220a;
        Object obj = w1Var.f8221b.f12503a;
        p2 p2Var = this.f7983n;
        s2Var.g(obj, p2Var);
        w1 w1Var2 = this.f7975i0;
        if (w1Var2.f8222c == -9223372036854775807L) {
            return d5.g0.S(w1Var2.f8220a.m(x(), (r2) this.f2040a, 0L).f8121x);
        }
        return d5.g0.S(this.f7975i0.f8222c) + d5.g0.S(p2Var.f8070e);
    }

    public final void q0() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7988s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = d5.g0.f4795a;
            Locale locale = Locale.US;
            String strJ = pa.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f7965c0) {
                throw new IllegalStateException(strJ);
            }
            d5.a.L("ExoPlayerImpl", strJ, this.f7966d0 ? null : new IllegalStateException());
            this.f7966d0 = true;
        }
    }

    @Override
    public final void r(a2 a2Var) {
        q0();
        a2Var.getClass();
        d5.n nVar = this.f7980l;
        nVar.f();
        CopyOnWriteArraySet<d5.m> copyOnWriteArraySet = nVar.d;
        for (d5.m mVar : copyOnWriteArraySet) {
            if (mVar.f4811a.equals(a2Var)) {
                d5.l lVar = nVar.f4816c;
                mVar.d = true;
                if (mVar.f4813c) {
                    mVar.f4813c = false;
                    lVar.e(mVar.f4811a, mVar.f4812b.c());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
    }

    @Override
    public final void s(int i10, List list) {
        q0();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.f7986q.a((f1) list.get(i11)));
        }
        q0();
        d5.a.f(i10 >= 0);
        ArrayList arrayList2 = this.f7984o;
        int iMin = Math.min(i10, arrayList2.size());
        s2 s2VarA = A();
        this.H++;
        ArrayList arrayListQ = Q(iMin, arrayList);
        f2 f2Var = new f2(arrayList2, this.M);
        w1 w1VarY = Y(this.f7975i0, f2Var, V(s2VarA, f2Var));
        j4.g1 g1Var = this.M;
        d5.d0 d0Var = this.f7978k.f8079n;
        m0 m0Var = new m0(arrayListQ, g1Var, -1, -9223372036854775807L);
        d0Var.getClass();
        d5.c0 c0VarB = d5.d0.b();
        c0VarB.f4780a = d0Var.f4782a.obtainMessage(18, iMin, 0, m0Var);
        c0VarB.b();
        o0(w1VarY, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        q0();
        if (this.f7975i0.f8231n.equals(x1Var)) {
            return;
        }
        w1 w1VarE = this.f7975i0.e(x1Var);
        this.H++;
        this.f7978k.f8079n.a(4, x1Var).b();
        o0(w1VarE, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void stop() {
        q0();
        q0();
        this.A.d(1, h());
        l0(null);
        new r4.d(this.f7975i0.f8235r, p8.l0.f45555e);
    }

    @Override
    public final long t() {
        q0();
        if (c()) {
            w1 w1Var = this.f7975i0;
            return w1Var.f8228k.equals(w1Var.f8221b) ? d5.g0.S(this.f7975i0.f8233p) : getDuration();
        }
        q0();
        if (this.f7975i0.f8220a.p()) {
            return this.f7979k0;
        }
        w1 w1Var2 = this.f7975i0;
        if (w1Var2.f8228k.d != w1Var2.f8221b.d) {
            return d5.g0.S(w1Var2.f8220a.m(x(), (r2) this.f2040a, 0L).f8122y);
        }
        long j10 = w1Var2.f8233p;
        if (this.f7975i0.f8228k.a()) {
            w1 w1Var3 = this.f7975i0;
            p2 p2VarG = w1Var3.f8220a.g(w1Var3.f8228k.f12503a, this.f7983n);
            long jD = p2VarG.d(this.f7975i0.f8228k.f12504b);
            j10 = jD == Long.MIN_VALUE ? p2VarG.d : jD;
        }
        w1 w1Var4 = this.f7975i0;
        s2 s2Var = w1Var4.f8220a;
        Object obj = w1Var4.f8228k.f12503a;
        p2 p2Var = this.f7983n;
        s2Var.g(obj, p2Var);
        return d5.g0.S(j10 + p2Var.f8070e);
    }

    @Override
    public final u2 u() {
        q0();
        return this.f7975i0.f8226i.d;
    }

    @Override
    public final n v() {
        q0();
        return this.f7975i0.f8224f;
    }

    @Override
    public final int w() {
        q0();
        if (c()) {
            return this.f7975i0.f8221b.f12504b;
        }
        return -1;
    }

    @Override
    public final int x() {
        q0();
        int iU = U();
        if (iU == -1) {
            return 0;
        }
        return iU;
    }

    @Override
    public final void y(int i10, int i11, int i12) {
        q0();
        d5.a.f(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.f7984o;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        s2 s2VarA = A();
        this.H++;
        d5.g0.G(i10, iMin, iMin2, arrayList);
        f2 f2Var = new f2(arrayList, this.M);
        w1 w1VarY = Y(this.f7975i0, f2Var, V(s2VarA, f2Var));
        j4.g1 g1Var = this.M;
        q0 q0Var = this.f7978k;
        q0Var.getClass();
        q0Var.f8079n.a(19, new n0(i10, iMin, iMin2, g1Var)).b();
        o0(w1VarY, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int z() {
        q0();
        return this.f7975i0.f8230m;
    }
}
