package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class oab implements jm7, ah0 {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public nab A0;
    public s96 B0;
    public gab C0;
    public SurfaceView D0;
    public t96 E0;
    public boolean F;
    public Uri F0;
    public ValueAnimator G;
    public c40 G0;
    public ValueAnimator H;
    public boolean H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public final po J0;
    public int K;
    public boolean K0;
    public float L;
    public boolean L0;
    public float M;
    public final ArrayList M0;
    public n4b N;
    public boolean N0;
    public float O;
    public z3b O0;
    public float P;
    public int P0;
    public float Q;
    public TL_stories.PeerStories Q0;
    public float R;
    public boolean R0;
    public float S;
    public boolean S0;
    public float T;
    public TL_stories.StoryItem T0;
    public int U0;
    public float V;
    public boolean V0;
    public float W;
    public int[] W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public float a0;
    public boolean a1;
    public boolean b0;
    public final j48 b1;
    public float c0;
    public boolean c1;
    public boolean d0;
    public d5b d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final d f;
    public float f0;
    public boolean f1;
    public boolean g0;
    public boolean g1;
    public int h;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public GestureDetector j0;
    public boolean j1;
    public boolean k0;
    public boolean k1;
    public boolean l0;
    public boolean l1;
    public boolean m0;
    public boolean m1;
    public WindowManager n;
    public boolean n0;
    public nsa n1;
    public eab o0;
    public j48 o1;
    public boolean p1;
    public int q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public boolean r0;
    public boolean r1;
    public cab s;
    public float s0;
    public boolean s1;
    public final lab t0;
    public long t1;
    public kab u0;
    public l4b u1;
    public Dialog v0;
    public ValueAnimator v1;
    public dab w;
    public ah0 w0;
    public boolean w1;
    public p2a x;
    public boolean x0;
    public boolean y;
    public final ArrayList y0;
    public jy z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = gda.Y;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final r63 E = new r63();
    public final RectF U = new RectF();
    public final float[] p0 = new float[2];

    public oab(d dVar) {
        ?? obj = new Object();
        obj.k = 1.0f;
        this.t0 = obj;
        this.y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new po(null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new j48(this, (byte) 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = dVar;
    }

    public static boolean B(k47 k47Var) {
        if (z1 != null) {
            if ((k47Var.D == 23 || k47Var.Y4()) && !A1 && z1.messageId == k47Var.e1() && z1.messageType != 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void N(long j, TL_stories.StoryItem storyItem, Editable editable) {
        if (j != 0 && storyItem != null) {
            E1.put(j + (j >> 16) + (storyItem.id << 16), editable);
        }
    }

    public static CharSequence x(long j, TL_stories.StoryItem storyItem) {
        if (j == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j + (j >> 16) + (storyItem.id << 16), "");
    }

    public final boolean A() {
        d dVar;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.r0 && !this.y && this.v0 == null && this.w0 == null && !this.H0 && !this.I0 && this.V == 1.0f && this.f0 == 0.0f && !this.i1) {
            if ((!this.l1 || !this.a) && !this.k1 && !this.j1 && !this.p1 && this.W == 0.0f && this.u1 == null) {
                if (!this.b || (dVar = this.f) == null || dVar.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oab.C():void");
    }

    public final void D(boolean z) {
        int i;
        Activity W = gm.W(this.f.getContext());
        if (W != null) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            try {
                W.setRequestedOrientation(i);
            } catch (Exception unused) {
            }
            if (z) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void E(int i, Context context, TL_stories.StoryItem storyItem, q4b q4bVar) {
        if (storyItem != null) {
            this.h = i;
            if (storyItem.dialogId <= 0 || oc7.r1(i).W1(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && oc7.r1(this.h).L0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                F(i, context, storyItem, arrayList, 0, null, null, q4bVar, false);
            }
        }
    }

    public final void F(int i, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i2, z3b z3bVar, TL_stories.PeerStories peerStories, kab kabVar, boolean z) {
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean C12 = gm.C1(context);
        ArrayList arrayList2 = this.y0;
        if (!C12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (this.n0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        nab nabVar = this.A0;
        if (nabVar != null) {
            nabVar.setSpeed(1.0f);
        }
        boolean z6 = false;
        if (!gm.O1() && !this.r1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if (gda.Y && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a = z3;
        if (storyItem == null) {
            i3 = 0;
        } else {
            i3 = storyItem.messageId;
        }
        this.U0 = i3;
        if (storyItem != null && z3bVar == null && peerStories == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N0 = z4;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            z1 = storyItem;
        }
        this.O0 = z3bVar;
        this.Q0 = peerStories;
        this.u0 = kabVar;
        this.R0 = z;
        this.h = i;
        this.X = 0.0f;
        this.Y = 0.0f;
        eab eabVar = this.o0;
        if (eabVar != null) {
            eabVar.setHorizontalProgressToDismiss(0.0f);
            this.o0.G0 = 0;
        }
        this.e0 = 0.0f;
        this.a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.n0 = true;
        this.a1 = false;
        this.Z0 = false;
        this.e1.clear();
        gm.r(this.b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        gm.m(layoutParams);
        this.r.flags = -2147417728;
        this.H0 = false;
        this.c1 = false;
        d Q = LaunchActivity.Q();
        if (this.s == null) {
            this.j0 = new GestureDetector(new y9b(this));
            this.s = new cab(this, context, Q);
        }
        if (this.w == null) {
            this.w = new dab(this, context);
            eab eabVar2 = new eab(this, this.h, context, this, this.E);
            this.o0 = eabVar2;
            eabVar2.setDelegate(new fab(this, z3bVar, arrayList, context));
            this.w.addView(this.o0, qoe.e(-1, -1, 1));
            this.z0 = new jy(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.z0.addView(this.D0);
            } else {
                gab gabVar = new gab(this, context);
                this.C0 = gabVar;
                this.z0.addView(gabVar);
            }
            t96 t96Var = new t96(context, this.h);
            this.E0 = t96Var;
            t96Var.setVisibility(8);
            this.z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.a = paint;
            view.c = new zka((Object) view, (byte) 6);
            view.d = new ln((View) view);
            view.e = new ln((View) view);
            paint.setColor(-1);
            this.d1 = view;
            this.w.addView((View) view, qoe.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        t96 t96Var2 = this.E0;
        if (t96Var2 != null) {
            t96Var2.setAccount(this.h);
        }
        gm.B2(this.z0);
        this.s.addView(this.z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        gm.B2(this.w);
        this.s.addView(this.w);
        this.s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        eab eabVar3 = this.o0;
        if (z3bVar != null) {
            eabVar3.D(this.h, z3bVar.d, z3bVar.h());
        } else {
            int i4 = this.h;
            eabVar3.B0 = arrayList;
            eabVar3.z0 = i4;
            eabVar3.setAdapter(null);
            eabVar3.setAdapter(eabVar3.A0);
            eabVar3.setCurrentItem(i2);
            eabVar3.D0 = true;
        }
        this.n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.b = false;
        }
        if (this.b && Q != null && Q.isSupportEdgeToEdge()) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.c = z5;
        dab dabVar = this.w;
        wta wtaVar = new wta(this, (byte) 12);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(dabVar, wtaVar);
        boolean z7 = this.b;
        cab cabVar = this.s;
        if (z7) {
            gm.B2(cabVar);
            this.s.setTag(2131296649, new Object());
            Q.getLayoutContainer().addView(this.s);
            if (!this.c) {
                gm.V2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            cabVar.setFocusable(false);
            this.w.setFocusable(false);
            this.w.setSystemUiVisibility(1792);
            gm.s3(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new up(this, (byte) 4));
            }
        }
        this.s.requestLayout();
        A1 = true;
        W();
        this.V = 0.0f;
        l();
        x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z6 = true;
            }
            D1 = z6;
        }
        if (this.b) {
            D(true);
        }
        if (!this.b) {
            y1.add(this);
        }
        if (Q != null) {
            gm.t1(Q.getFragmentView());
        }
    }

    public final void G(Context context, int i, z3b z3bVar, q4b q4bVar) {
        this.h = z8c.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(z3bVar.d));
        this.P0 = i;
        K(context, null, arrayList, 0, z3bVar, null, q4bVar, false);
    }

    public final void H(Context context, long j, kab kabVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        this.h = z8c.t0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(j));
        h4b N1 = oc7.r1(this.h).N1();
        int i = N1.a;
        TL_stories.PeerStories x = N1.x(j);
        if (x != null) {
            int i2 = 0;
            while (true) {
                int size = x.stories.size();
                arrayList = x.stories;
                if (i2 >= size) {
                    break;
                }
                if (y4b.w(i, arrayList.get(i2))) {
                    x.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (arrayList.isEmpty() && !N1.K(j)) {
                N1.g.remove(x);
                N1.h.remove(x);
                nm7.f(i).k(nm7.z5, new Object[0]);
            }
        }
        K(context, null, arrayList2, 0, null, null, kabVar, false);
    }

    public final void I(Context context, TL_stories.PeerStories peerStories, lj4 lj4Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = z8c.t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(pg3.n(peerStories.peer)));
            K(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, lj4Var, false);
            return;
        }
        this.y0.clear();
    }

    public final void J(Context context, TL_stories.StoryItem storyItem, q4b q4bVar) {
        E(z8c.t0, context, storyItem, q4bVar);
    }

    public final void K(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i, z3b z3bVar, TL_stories.PeerStories peerStories, kab kabVar, boolean z) {
        F(z8c.t0, context, storyItem, arrayList, i, z3bVar, peerStories, kabVar, z);
    }

    public final void L(d dVar) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.b) {
            Q.presentFragment(dVar);
            return;
        }
        Q.presentFragment(dVar);
        o(false);
    }

    public final void M() {
        ArrayList arrayList;
        this.F0 = null;
        O(false);
        c(true);
        nab nabVar = this.A0;
        if (nabVar != null) {
            nabVar.release(null);
            this.A0 = null;
        }
        t96 t96Var = this.E0;
        if (t96Var != null) {
            t96Var.e(0L, null);
        }
        s96 s96Var = this.B0;
        if (s96Var != null && !w96.a(s96Var)) {
            s96 s96Var2 = this.B0;
            if (s96Var2.n) {
                s96Var2.d();
            } else {
                s96Var2.h();
            }
        }
        this.B0 = null;
        w96 w96Var = w96.E;
        if (w96Var != null && w96Var.c == this) {
            w96Var.c = null;
            u96 u96Var = w96Var.w;
            LaunchActivity launchActivity = w96Var.x;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.a1.remove(u96Var);
                }
                w96Var.x = null;
            }
            ad8 ad8Var = w96Var.a;
            if (ad8Var != null && ad8Var.e()) {
                ad8 ad8Var2 = w96Var.a;
                if (ad8Var2.c == 0) {
                    w96Var.a = null;
                    w96Var.b(null);
                    ad8Var2.g();
                }
            }
        }
        int i = 0;
        while (true) {
            arrayList = this.M0;
            if (i >= arrayList.size()) {
                break;
            }
            ((nab) arrayList.get(i)).release(null);
            i++;
        }
        arrayList.clear();
        vh6 vh6Var = oc7.r1(this.h).N1().m;
        for (int i2 = 0; i2 < vh6Var.m(); i2++) {
            ((ihc) vh6Var.n(i2)).b(false);
        }
        if (this.b) {
            D(false);
        }
        d dVar = this.f;
        if (dVar != null) {
            dVar.removeSheet(this);
        }
        y1.remove(this);
        this.y0.clear();
        this.f0 = 0.0f;
        z1 = null;
    }

    public final void O(boolean z) {
        this.r0 = z;
        if (z) {
            zka zkaVar = this.d1.c;
            gm.r(zkaVar);
            zkaVar.run();
        }
        U();
    }

    public final void P(boolean z) {
        a58 currentPeerView;
        a58 currentPeerView2;
        z48 z48Var;
        nab nabVar;
        c40 c40Var;
        if (this.a1 != z) {
            this.a1 = z;
            if (z && !this.f1 && (currentPeerView2 = this.o0.getCurrentPeerView()) != null && (z48Var = currentPeerView2.E1) != null && !z48Var.f && z48Var.b == null) {
                if (!this.l0 && !this.k0 && (c40Var = this.G0) != null && ((nab) c40Var.c) != null) {
                    currentPeerView2.S0.invalidate();
                    xx0.IMPACT_LIGHT.a();
                }
                c40 c40Var2 = this.G0;
                if (c40Var2 != null && (nabVar = (nab) c40Var2.c) != null && !this.l0) {
                    nabVar.setSeeking(true);
                }
                this.l0 = true;
            }
            U();
            eab eabVar = this.o0;
            if (eabVar != null && (currentPeerView = eabVar.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.a1);
            }
        }
    }

    public final void Q(boolean z) {
        boolean z2;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (this.b && launchActivity != null) {
            if (z) {
                Window window = launchActivity.getWindow();
                Typeface typeface = gm.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z2 = iqd.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z2 = false;
                }
                this.x0 = z2;
            }
            if (this.x0) {
                gm.h3(launchActivity, !z);
            }
        }
    }

    public final void R() {
        wb wbVar;
        qu3 editField;
        a58 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.R1 != null && (((wbVar = currentPeerView.R2) == null || wbVar.getVisibility() != 0) && (editField = currentPeerView.R1.getEditField()) != null)) {
            editField.requestFocus();
            gm.E3(editField);
            gm.d3(new j48(this, (byte) 6), 200L);
            return;
        }
        i();
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oab.S():void");
    }

    public final void T() {
        boolean z = D1;
        D1 = !z;
        nab nabVar = this.A0;
        int i = 0;
        if (nabVar != null) {
            nabVar.setAudioEnabled(z, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i >= arrayList.size()) {
                break;
            }
            ((nab) arrayList.get(i)).setAudioEnabled(!D1, true);
            i++;
        }
        a58 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.n1.a(D1, true);
        }
        if (!D1) {
            this.d1.b();
        }
    }

    public final void U() {
        if (this.o0 == null) {
            return;
        }
        boolean A = A();
        boolean z = true;
        if (this.b) {
            d dVar = this.f;
            if (dVar.isPaused() || !dVar.isLastFragment()) {
                A = true;
            }
        }
        if (o.u().W) {
            A = true;
        }
        this.o0.setPaused(A);
        nab nabVar = this.A0;
        if (nabVar != null) {
            if (A) {
                nabVar.pause();
            } else {
                nabVar.play(B1);
            }
        }
        this.o0.E0 = (this.y || this.H0 || this.I0 || this.a1 || this.f1 || this.f0 != 0.0f || this.j1) ? false : false;
    }

    public final void V() {
        float l = Utilities.l(Math.abs(Math.max(this.Y, this.X) / gm.L(80.0f)));
        if (this.W != l) {
            this.W = l;
            l();
            a58 currentPeerView = this.o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.n2) {
                currentPeerView.invalidate();
            }
            s96 s96Var = this.B0;
            if (s96Var != null) {
                s96Var.F((1.0f - this.W) * this.V);
            }
        }
        cab cabVar = this.s;
        if (cabVar != null) {
            cabVar.invalidate();
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oab.W():void");
    }

    @Override
    public final void a(boolean z) {
        o(true);
    }

    public final void c(boolean z) {
        boolean z2;
        boolean z3 = e21.a;
        if (this.n0 && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.e != z2) {
            this.e = z2;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z2);
            }
            t96 t96Var = this.E0;
            if (t96Var != null) {
                t96Var.setSecure(!z2);
            }
            if (this.b) {
                d dVar = this.f;
                if (dVar.getParentActivity() != null) {
                    if (z2) {
                        dVar.getParentActivity().getWindow().clearFlags(8192);
                        gm.f2();
                        return;
                    }
                    dVar.getParentActivity().getWindow().addFlags(8192);
                    gm.f2();
                    return;
                }
                return;
            }
            WindowManager.LayoutParams layoutParams = this.r;
            if (z2) {
                layoutParams.flags &= -8193;
                gm.f2();
            } else {
                layoutParams.flags |= 8192;
                gm.f2();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final View d() {
        return this.s;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        int i3 = 0;
        if (i == nm7.B5) {
            if (this.O0 == ((z3b) objArr[0])) {
                w();
                eab eabVar = this.o0;
                z3b z3bVar = this.O0;
                eabVar.D(this.h, z3bVar.d, z3bVar.h());
                p2a p2aVar = this.x;
                if (p2aVar != null) {
                    TL_stories.StoryItem selectedStory = p2aVar.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (i3 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((k47) this.O0.i.get(i3)).l.id) {
                            i4 = i3;
                        }
                        arrayList2.add(((k47) this.O0.i.get(i3)).l);
                        i3++;
                    }
                    this.x.b(i4, this.O0.d, arrayList2);
                }
            }
        } else if (i == nm7.z5) {
            kab kabVar = this.u0;
            if (kabVar instanceof q4b) {
                q4b q4bVar = (q4b) kabVar;
                if (q4bVar.r && !q4bVar.n) {
                    h4b N1 = oc7.r1(this.h).N1();
                    if (q4bVar.f) {
                        arrayList = N1.h;
                    } else {
                        arrayList = N1.g;
                    }
                    ArrayList<Long> dialogIds = this.o0.getDialogIds();
                    boolean z = false;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i5)).peer);
                        if ((!q4bVar.h || N1.K(n)) && !dialogIds.contains(Long.valueOf(n))) {
                            dialogIds.add(Long.valueOf(n));
                            z = true;
                        }
                    }
                    if (z) {
                        this.o0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            p2a p2aVar2 = this.x;
            if (p2aVar2 != null) {
                ArrayList arrayList3 = p2aVar2.h.H;
                while (i3 < arrayList3.size()) {
                    ((o1a) arrayList3.get(i3)).b();
                    i3++;
                }
            }
        } else {
            int i6 = nm7.c1;
            if (i != i6 && i != nm7.d1) {
                if (i == nm7.A5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            U();
            if (i == i6) {
                nab nabVar = this.A0;
                if (nabVar != null) {
                    this.t1 = nabVar.currentPosition;
                    this.A0.release(null);
                    this.A0 = null;
                    return;
                }
                this.t1 = 0L;
            } else if (!this.s1 && w() != null) {
                w().c1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        o(true);
    }

    @Override
    public final int e(int i) {
        return on2.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i, -16777216);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g(int i) {
        if (this.q0 != i) {
            this.q0 = i;
            this.o0.setKeyboardHeight(i);
            this.o0.requestLayout();
            p2a p2aVar = this.x;
            if (p2aVar != null) {
                p2aVar.setKeyboardHeight(i);
            }
        }
    }

    @Override
    public final boolean h() {
        return this.K0;
    }

    public final void i() {
        if (this.I == null) {
            this.k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new w9b(this, (byte) 2));
            this.I.addListener(new x9b(this, (byte) 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(gb.w);
            this.I.start();
        }
    }

    @Override
    public final c41 j() {
        return null;
    }

    public final void k(boolean z) {
        if (this.v1 == null) {
            if (this.q0 != 0) {
                gm.t1(this.x);
                return;
            }
            float f = 0.0f;
            if (!this.d0 && this.f0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z) {
                float f2 = this.f0;
                p2a p2aVar = this.x;
                float f3 = p2aVar.c;
                if (f2 == f3) {
                    float f4 = f3 - 1.0f;
                    this.f0 = f4;
                    p2aVar.setOffset(f4);
                }
            }
            float f5 = this.f0;
            if (z) {
                f = this.x.c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new w9b(this, (byte) 3));
            this.v1.addListener(new sw9((byte) 7, this, z));
            ValueAnimator valueAnimator = this.v1;
            if (z) {
                valueAnimator.setDuration(350L);
                this.v1.setInterpolator(d53.h);
            } else {
                valueAnimator.setDuration(350L);
                this.v1.setInterpolator(d53.f);
            }
            this.v1.start();
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (this.b && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.H(true, true, true);
        }
    }

    public final void m() {
        if (this.x == null) {
            p2a p2aVar = new p2a(this, this.w.getContext());
            this.x = p2aVar;
            this.w.addView(p2aVar, 0);
        }
        a58 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.O0.i.size(); i++) {
                    arrayList.add(((k47) this.O0.i.get(i)).l);
                }
                this.x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void o(boolean z) {
        gm.t1(this.s);
        this.H0 = true;
        this.h1 = true;
        U();
        Q(false);
        W();
        this.J0.d();
        this.c0 = this.X;
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new w9b(this, (byte) 0));
        if (!z) {
            this.P = 0.0f;
            this.O = 0.0f;
            lab labVar = this.t0;
            ImageReceiver imageReceiver = labVar.b;
            if (imageReceiver != null) {
                imageReceiver.v0(true, true);
            }
            ImageReceiver imageReceiver2 = labVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.v0(true, true);
            }
            labVar.c = null;
            labVar.b = null;
        } else {
            C();
        }
        gm.d3(new j48(this, (byte) 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    @Override
    public final void p() {
        a58 currentPeerView;
        boolean z = false;
        if (this.f0 != 0.0f) {
            p2a p2aVar = this.x;
            if (p2aVar.y > 0) {
                gm.t1(p2aVar);
                return;
            }
            i2a currentPage = p2aVar.getCurrentPage();
            if (currentPage != null) {
                q1a q1aVar = currentPage.r;
                y1a y1aVar = currentPage.f;
                if (y1aVar != null && y1aVar.a) {
                    y1aVar.a();
                    return;
                } else if (Math.abs(currentPage.c.getTranslationY() - q1aVar.getPaddingTop()) > gm.L(2.0f)) {
                    q1aVar.dispatchTouchEvent(gm.R());
                    q1aVar.z0(0);
                    return;
                }
            }
            k(false);
            return;
        }
        eab eabVar = this.o0;
        if (eabVar != null && (currentPeerView = eabVar.getCurrentPeerView()) != null) {
            z = currentPeerView.i0();
        }
        if (z) {
            return;
        }
        o(true);
    }

    public final void q() {
        a58 a58Var;
        eab eabVar = this.o0;
        if (eabVar != null) {
            ArrayList arrayList = eabVar.Q0;
            for (int i = 0; i < eabVar.getChildCount(); i++) {
                View childAt = eabVar.getChildAt(i);
                if ((childAt instanceof b5b) && (a58Var = ((b5b) childAt).a) != null && !a58Var.K3) {
                    a58Var.K3 = true;
                    t38 t38Var = a58Var.R1;
                    if (t38Var != null) {
                        t38Var.d1();
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                a58 a58Var2 = (a58) arrayList.get(i2);
                if (!a58Var2.K3) {
                    a58Var2.K3 = true;
                    t38 t38Var2 = a58Var2.R1;
                    if (t38Var2 != null) {
                        t38Var2.d1();
                    }
                }
            }
        }
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            T();
            return;
        }
        a58 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            z48 z48Var = currentPeerView.E1;
            if (!z48Var.h() && z48Var.e) {
                currentPeerView.X0(true);
                return;
            }
        }
        this.d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    @Override
    public final boolean s() {
        return !this.H0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.v0 = dialog;
            dialog.setOnDismissListener(new qj8(this, (byte) 10));
            dialog.show();
            U();
            return true;
        } catch (Throwable th) {
            fc4.g(th, true);
            this.v0 = null;
            return false;
        }
    }

    public final void u(Runnable runnable) {
        if (runnable != null) {
            this.y0.add(runnable);
        }
    }

    public final boolean v(cab cabVar, float f, float f2, boolean z) {
        t38 t38Var;
        t38 t38Var2;
        if (cabVar != null) {
            if (!this.X0) {
                if (this.x == null || this.f0 == 0.0f) {
                    a58 currentPeerView = this.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.y0(currentPeerView, ((f - this.w.getX()) - this.o0.getX()) - currentPeerView.getX(), ((f2 - this.w.getY()) - this.o0.getY()) - currentPeerView.getY(), z)) {
                            if (currentPeerView.l2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z) {
                        return false;
                    }
                    if (currentPeerView != null && (t38Var2 = currentPeerView.R1) != null && t38Var2.getVisibility() == 0) {
                        if (f2 > currentPeerView.R1.getY() + currentPeerView.getY() + this.o0.getY() + this.w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (t38Var = currentPeerView.R1) != null && t38Var.U0()) || this.u1 != null) {
                        return true;
                    }
                    return gm.Y(cabVar, f, f2, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final a58 w() {
        eab eabVar = this.o0;
        if (eabVar == null) {
            return null;
        }
        return eabVar.getCurrentPeerView();
    }

    @Override
    public final boolean y() {
        if (this.b && this.s != null) {
            return true;
        }
        return false;
    }

    public final void z() {
        if (this.n0) {
            gm.t1(this.s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            U();
            this.P = 0.0f;
            this.O = 0.0f;
            lab labVar = this.t0;
            ImageReceiver imageReceiver = labVar.b;
            if (imageReceiver != null) {
                imageReceiver.v0(true, true);
            }
            ImageReceiver imageReceiver2 = labVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.v0(true, true);
            }
            labVar.c = null;
            labVar.b = null;
            dab dabVar = this.w;
            if (dabVar != null) {
                dabVar.a(true);
            }
            this.J0.e();
            c40 c40Var = this.G0;
            if (c40Var != null) {
                c40Var.m();
            }
            M();
            if (this.b) {
                gm.B2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            q();
            this.n0 = false;
            this.d = false;
            l();
            j48 j48Var = this.o1;
            if (j48Var != null) {
                j48Var.run();
                this.o1 = null;
            }
        }
    }

    @Override
    public final void b(boolean z) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
