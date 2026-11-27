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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class lcb implements fn7, ag0 {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public kcb A0;
    public w96 B0;
    public dcb C0;
    public SurfaceView D0;
    public x96 E0;
    public boolean F;
    public Uri F0;
    public ValueAnimator G;
    public d30 G0;
    public ValueAnimator H;
    public boolean H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public final pn J0;
    public int K;
    public boolean K0;
    public float L;
    public boolean L0;
    public float M;
    public final ArrayList M0;
    public i6b N;
    public boolean N0;
    public float O;
    public u5b O0;
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
    public final x58 b1;
    public float c0;
    public boolean c1;
    public boolean d0;
    public y6b d1;
    public float e0;
    public final LongSparseIntArray e1;
    public final e f;
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
    public s8b n1;
    public acb o0;
    public x58 o1;
    public boolean p1;
    public int q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public boolean r0;
    public boolean r1;
    public ybb s;
    public float s0;
    public boolean s1;
    public final icb t0;
    public long t1;
    public hcb u0;
    public g6b u1;
    public Dialog v0;
    public ValueAnimator v1;
    public zbb w;
    public ag0 w0;
    public boolean w1;
    public g4a x;
    public boolean x0;
    public boolean y;
    public final ArrayList y0;
    public jx z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = xea.Y;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final x53 E = new x53();
    public final RectF U = new RectF();
    public final float[] p0 = new float[2];

    public lcb(e eVar) {
        ?? obj = new Object();
        obj.k = 1.0f;
        this.t0 = obj;
        this.y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new pn(null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new x58(this, (byte) 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = eVar;
    }

    public static boolean B(r47 r47Var) {
        if (z1 != null) {
            if ((r47Var.D == 23 || r47Var.Y4()) && !A1 && z1.messageId == r47Var.e1() && z1.messageType != 3) {
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
        e eVar;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.r0 && !this.y && this.v0 == null && this.w0 == null && !this.H0 && !this.I0 && this.V == 1.0f && this.f0 == 0.0f && !this.i1) {
            if ((!this.l1 || !this.a) && !this.k1 && !this.j1 && !this.p1 && this.W == 0.0f && this.u1 == null) {
                if (!this.b || (eVar = this.f) == null || eVar.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.C():void");
    }

    public final void D(boolean z) {
        int i;
        Activity W = hl.W(this.f.getContext());
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

    public final void E(int i, Context context, TL_stories.StoryItem storyItem, l6b l6bVar) {
        if (storyItem != null) {
            this.h = i;
            if (storyItem.dialogId <= 0 || uc7.s1(i).X1(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && uc7.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                F(i, context, storyItem, arrayList, 0, null, null, l6bVar, false);
            }
        }
    }

    public final void F(int i, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i2, u5b u5bVar, TL_stories.PeerStories peerStories, hcb hcbVar, boolean z) {
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean C12 = hl.C1(context);
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
        kcb kcbVar = this.A0;
        if (kcbVar != null) {
            kcbVar.setSpeed(1.0f);
        }
        boolean z6 = false;
        if (!hl.O1() && !this.r1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if (xea.Y && z2) {
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
        if (storyItem != null && u5bVar == null && peerStories == null) {
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
        this.O0 = u5bVar;
        this.Q0 = peerStories;
        this.u0 = hcbVar;
        this.R0 = z;
        this.h = i;
        this.X = 0.0f;
        this.Y = 0.0f;
        acb acbVar = this.o0;
        if (acbVar != null) {
            acbVar.setHorizontalProgressToDismiss(0.0f);
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
        hl.r(this.b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        hl.m(layoutParams);
        this.r.flags = -2147417728;
        this.H0 = false;
        this.c1 = false;
        e Q = LaunchActivity.Q();
        if (this.s == null) {
            this.j0 = new GestureDetector(new ubb(this));
            this.s = new ybb(this, context, Q);
        }
        if (this.w == null) {
            this.w = new zbb(this, context);
            acb acbVar2 = new acb(this, this.h, context, this, this.E);
            this.o0 = acbVar2;
            acbVar2.setDelegate(new ccb(this, u5bVar, arrayList, context));
            this.w.addView(this.o0, tre.e(-1, -1, 1));
            this.z0 = new jx(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.z0.addView(this.D0);
            } else {
                dcb dcbVar = new dcb(this, context);
                this.C0 = dcbVar;
                this.z0.addView(dcbVar);
            }
            x96 x96Var = new x96(context, this.h);
            this.E0 = x96Var;
            x96Var.setVisibility(8);
            this.z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.a = paint;
            view.c = new bva((Object) view, (byte) 5);
            view.d = new mm((View) view);
            view.e = new mm((View) view);
            paint.setColor(-1);
            this.d1 = view;
            this.w.addView((View) view, tre.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        x96 x96Var2 = this.E0;
        if (x96Var2 != null) {
            x96Var2.setAccount(this.h);
        }
        hl.B2(this.z0);
        this.s.addView(this.z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        hl.B2(this.w);
        this.s.addView(this.w);
        this.s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        acb acbVar3 = this.o0;
        if (u5bVar != null) {
            acbVar3.D(this.h, u5bVar.d, u5bVar.h());
        } else {
            int i4 = this.h;
            acbVar3.B0 = arrayList;
            acbVar3.z0 = i4;
            acbVar3.setAdapter(null);
            acbVar3.setAdapter(acbVar3.A0);
            acbVar3.setCurrentItem(i2);
            acbVar3.D0 = true;
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
        zbb zbbVar = this.w;
        hja hjaVar = new hja(this, (byte) 21);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(zbbVar, hjaVar);
        boolean z7 = this.b;
        ybb ybbVar = this.s;
        if (z7) {
            hl.B2(ybbVar);
            this.s.setTag(2131296649, new Object());
            Q.getLayoutContainer().addView(this.s);
            if (!this.c) {
                hl.V2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            ybbVar.setFocusable(false);
            this.w.setFocusable(false);
            this.w.setSystemUiVisibility(1792);
            hl.s3(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new vo(this, (byte) 4));
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
            hl.t1(Q.getFragmentView());
        }
    }

    public final void G(Context context, int i, u5b u5bVar, l6b l6bVar) {
        this.h = yac.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(u5bVar.d));
        this.P0 = i;
        K(context, null, arrayList, 0, u5bVar, null, l6bVar, false);
    }

    public final void H(Context context, long j, hcb hcbVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        this.h = yac.t0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(j));
        c6b O1 = uc7.s1(this.h).O1();
        int i = O1.a;
        TL_stories.PeerStories x = O1.x(j);
        if (x != null) {
            int i2 = 0;
            while (true) {
                int size = x.stories.size();
                arrayList = x.stories;
                if (i2 >= size) {
                    break;
                }
                if (t6b.w(i, arrayList.get(i2))) {
                    x.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (arrayList.isEmpty() && !O1.K(j)) {
                O1.g.remove(x);
                O1.h.remove(x);
                jn7.f(i).k(jn7.y5, new Object[0]);
            }
        }
        K(context, null, arrayList2, 0, null, null, hcbVar, false);
    }

    public final void I(Context context, TL_stories.PeerStories peerStories, xh4 xh4Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = yac.t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(wf3.n(peerStories.peer)));
            K(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, xh4Var, false);
            return;
        }
        this.y0.clear();
    }

    public final void J(Context context, TL_stories.StoryItem storyItem, l6b l6bVar) {
        E(yac.t0, context, storyItem, l6bVar);
    }

    public final void K(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i, u5b u5bVar, TL_stories.PeerStories peerStories, hcb hcbVar, boolean z) {
        F(yac.t0, context, storyItem, arrayList, i, u5bVar, peerStories, hcbVar, z);
    }

    public final void L(e eVar) {
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.b) {
            Q.presentFragment(eVar);
            return;
        }
        Q.presentFragment(eVar);
        o(false);
    }

    public final void M() {
        ArrayList arrayList;
        this.F0 = null;
        O(false);
        c(true);
        kcb kcbVar = this.A0;
        if (kcbVar != null) {
            kcbVar.release(null);
            this.A0 = null;
        }
        x96 x96Var = this.E0;
        if (x96Var != null) {
            x96Var.e(0L, null);
        }
        w96 w96Var = this.B0;
        if (w96Var != null && !ba6.a(w96Var)) {
            w96 w96Var2 = this.B0;
            if (w96Var2.n) {
                w96Var2.d();
            } else {
                w96Var2.h();
            }
        }
        this.B0 = null;
        ba6 ba6Var = ba6.E;
        if (ba6Var != null && ba6Var.c == this) {
            ba6Var.c = null;
            y96 y96Var = ba6Var.w;
            LaunchActivity launchActivity = ba6Var.x;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.a1.remove(y96Var);
                }
                ba6Var.x = null;
            }
            me8 me8Var = ba6Var.a;
            if (me8Var != null && me8Var.f()) {
                me8 me8Var2 = ba6Var.a;
                if (me8Var2.c == 0) {
                    ba6Var.a = null;
                    ba6Var.c(null);
                    me8Var2.h();
                }
            }
        }
        int i = 0;
        while (true) {
            arrayList = this.M0;
            if (i >= arrayList.size()) {
                break;
            }
            ((kcb) arrayList.get(i)).release(null);
            i++;
        }
        arrayList.clear();
        zh6 zh6Var = uc7.s1(this.h).O1().m;
        for (int i2 = 0; i2 < zh6Var.m(); i2++) {
            ((hjc) zh6Var.n(i2)).b(false);
        }
        if (this.b) {
            D(false);
        }
        e eVar = this.f;
        if (eVar != null) {
            eVar.removeSheet(this);
        }
        y1.remove(this);
        this.y0.clear();
        this.f0 = 0.0f;
        z1 = null;
    }

    public final void O(boolean z) {
        this.r0 = z;
        if (z) {
            bva bvaVar = this.d1.c;
            hl.r(bvaVar);
            bvaVar.run();
        }
        U();
    }

    public final void P(boolean z) {
        o68 currentPeerView;
        o68 currentPeerView2;
        n68 n68Var;
        kcb kcbVar;
        d30 d30Var;
        if (this.a1 != z) {
            this.a1 = z;
            if (z && !this.f1 && (currentPeerView2 = this.o0.getCurrentPeerView()) != null && (n68Var = currentPeerView2.y1) != null && !n68Var.f && n68Var.b == null) {
                if (!this.l0 && !this.k0 && (d30Var = this.G0) != null && ((kcb) d30Var.c) != null) {
                    currentPeerView2.M0.invalidate();
                    yw0.IMPACT_LIGHT.a();
                }
                d30 d30Var2 = this.G0;
                if (d30Var2 != null && (kcbVar = (kcb) d30Var2.c) != null && !this.l0) {
                    kcbVar.setSeeking(true);
                }
                this.l0 = true;
            }
            U();
            acb acbVar = this.o0;
            if (acbVar != null && (currentPeerView = acbVar.getCurrentPeerView()) != null) {
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
                Typeface typeface = hl.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z2 = vsd.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z2 = false;
                }
                this.x0 = z2;
            }
            if (this.x0) {
                hl.h3(launchActivity, !z);
            }
        }
    }

    public final void R() {
        xb xbVar;
        xt3 editField;
        o68 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.L1 != null && (((xbVar = currentPeerView.L2) == null || xbVar.getVisibility() != 0) && (editField = currentPeerView.L1.getEditField()) != null)) {
            editField.requestFocus();
            hl.E3(editField);
            hl.d3(new x58(this, (byte) 6), 200L);
            return;
        }
        i();
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.S():void");
    }

    public final void T() {
        boolean z = D1;
        D1 = !z;
        kcb kcbVar = this.A0;
        int i = 0;
        if (kcbVar != null) {
            kcbVar.setAudioEnabled(z, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i >= arrayList.size()) {
                break;
            }
            ((kcb) arrayList.get(i)).setAudioEnabled(!D1, true);
            i++;
        }
        o68 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.h1.a(D1, true);
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
            e eVar = this.f;
            if (eVar.isPaused() || !eVar.isLastFragment()) {
                A = true;
            }
        }
        if (o.u().W) {
            A = true;
        }
        this.o0.setPaused(A);
        kcb kcbVar = this.A0;
        if (kcbVar != null) {
            if (A) {
                kcbVar.pause();
            } else {
                kcbVar.play(B1);
            }
        }
        this.o0.E0 = (this.y || this.H0 || this.I0 || this.a1 || this.f1 || this.f0 != 0.0f || this.j1) ? false : false;
    }

    public final void V() {
        float l = Utilities.l(Math.abs(Math.max(this.Y, this.X) / hl.L(80.0f)));
        if (this.W != l) {
            this.W = l;
            l();
            o68 currentPeerView = this.o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.h2) {
                currentPeerView.invalidate();
            }
            w96 w96Var = this.B0;
            if (w96Var != null) {
                w96Var.F((1.0f - this.W) * this.V);
            }
        }
        ybb ybbVar = this.s;
        if (ybbVar != null) {
            ybbVar.invalidate();
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.W():void");
    }

    @Override
    public final void a(boolean z) {
        o(true);
    }

    public final void c(boolean z) {
        boolean z2;
        boolean z3 = f11.a;
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
            x96 x96Var = this.E0;
            if (x96Var != null) {
                x96Var.setSecure(!z2);
            }
            if (this.b) {
                e eVar = this.f;
                if (eVar.getParentActivity() != null) {
                    if (z2) {
                        eVar.getParentActivity().getWindow().clearFlags(8192);
                        hl.f2();
                        return;
                    }
                    eVar.getParentActivity().getWindow().addFlags(8192);
                    hl.f2();
                    return;
                }
                return;
            }
            WindowManager.LayoutParams layoutParams = this.r;
            if (z2) {
                layoutParams.flags &= -8193;
                hl.f2();
            } else {
                layoutParams.flags |= 8192;
                hl.f2();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e) {
                cc4.g(e, true);
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
        if (i == jn7.A5) {
            if (this.O0 == ((u5b) objArr[0])) {
                w();
                acb acbVar = this.o0;
                u5b u5bVar = this.O0;
                acbVar.D(this.h, u5bVar.d, u5bVar.h());
                g4a g4aVar = this.x;
                if (g4aVar != null) {
                    TL_stories.StoryItem selectedStory = g4aVar.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (i3 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((r47) this.O0.i.get(i3)).l.id) {
                            i4 = i3;
                        }
                        arrayList2.add(((r47) this.O0.i.get(i3)).l);
                        i3++;
                    }
                    this.x.b(i4, this.O0.d, arrayList2);
                }
            }
        } else if (i == jn7.y5) {
            hcb hcbVar = this.u0;
            if (hcbVar instanceof l6b) {
                l6b l6bVar = (l6b) hcbVar;
                if (l6bVar.r && !l6bVar.n) {
                    c6b O1 = uc7.s1(this.h).O1();
                    if (l6bVar.f) {
                        arrayList = O1.h;
                    } else {
                        arrayList = O1.g;
                    }
                    ArrayList<Long> dialogIds = this.o0.getDialogIds();
                    boolean z = false;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i5)).peer);
                        if ((!l6bVar.h || O1.K(n)) && !dialogIds.contains(Long.valueOf(n))) {
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
            g4a g4aVar2 = this.x;
            if (g4aVar2 != null) {
                ArrayList arrayList3 = g4aVar2.h.H;
                while (i3 < arrayList3.size()) {
                    ((g3a) arrayList3.get(i3)).b();
                    i3++;
                }
            }
        } else {
            int i6 = jn7.c1;
            if (i != i6 && i != jn7.d1) {
                if (i == jn7.z5) {
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
                kcb kcbVar = this.A0;
                if (kcbVar != null) {
                    this.t1 = kcbVar.currentPosition;
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
        return vm2.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i, -16777216);
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
            g4a g4aVar = this.x;
            if (g4aVar != null) {
                g4aVar.setKeyboardHeight(i);
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
            ofFloat.addUpdateListener(new sbb(this, (byte) 2));
            this.I.addListener(new tbb(this, (byte) 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(hb.w);
            this.I.start();
        }
    }

    @Override
    public final d31 j() {
        return null;
    }

    public final void k(boolean z) {
        if (this.v1 == null) {
            if (this.q0 != 0) {
                hl.t1(this.x);
                return;
            }
            float f = 0.0f;
            if (!this.d0 && this.f0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z) {
                float f2 = this.f0;
                g4a g4aVar = this.x;
                float f3 = g4aVar.c;
                if (f2 == f3) {
                    float f4 = f3 - 1.0f;
                    this.f0 = f4;
                    g4aVar.setOffset(f4);
                }
            }
            float f5 = this.f0;
            if (z) {
                f = this.x.c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new sbb(this, (byte) 3));
            this.v1.addListener(new i1a((byte) 6, this, z));
            ValueAnimator valueAnimator = this.v1;
            if (z) {
                valueAnimator.setDuration(350L);
                this.v1.setInterpolator(k43.h);
            } else {
                valueAnimator.setDuration(350L);
                this.v1.setInterpolator(k43.f);
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
            g4a g4aVar = new g4a(this, this.w.getContext());
            this.x = g4aVar;
            this.w.addView(g4aVar, 0);
        }
        o68 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.O0.i.size(); i++) {
                    arrayList.add(((r47) this.O0.i.get(i)).l);
                }
                this.x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void o(boolean z) {
        hl.t1(this.s);
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
        ofFloat.addUpdateListener(new sbb(this, (byte) 0));
        if (!z) {
            this.P = 0.0f;
            this.O = 0.0f;
            icb icbVar = this.t0;
            ImageReceiver imageReceiver = icbVar.b;
            if (imageReceiver != null) {
                imageReceiver.v0(true, true);
            }
            ImageReceiver imageReceiver2 = icbVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.v0(true, true);
            }
            icbVar.c = null;
            icbVar.b = null;
        } else {
            C();
        }
        hl.d3(new x58(this, (byte) 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    @Override
    public final void p() {
        o68 currentPeerView;
        boolean z = false;
        if (this.f0 != 0.0f) {
            g4a g4aVar = this.x;
            if (g4aVar.y > 0) {
                hl.t1(g4aVar);
                return;
            }
            z3a currentPage = g4aVar.getCurrentPage();
            if (currentPage != null) {
                i3a i3aVar = currentPage.r;
                q3a q3aVar = currentPage.f;
                if (q3aVar != null && q3aVar.a) {
                    q3aVar.a();
                    return;
                } else if (Math.abs(currentPage.c.getTranslationY() - i3aVar.getPaddingTop()) > hl.L(2.0f)) {
                    i3aVar.dispatchTouchEvent(hl.R());
                    i3aVar.A0(0);
                    return;
                }
            }
            k(false);
            return;
        }
        acb acbVar = this.o0;
        if (acbVar != null && (currentPeerView = acbVar.getCurrentPeerView()) != null) {
            z = currentPeerView.i0();
        }
        if (z) {
            return;
        }
        o(true);
    }

    public final void q() {
        o68 o68Var;
        acb acbVar = this.o0;
        if (acbVar != null) {
            ArrayList arrayList = acbVar.Q0;
            for (int i = 0; i < acbVar.getChildCount(); i++) {
                View childAt = acbVar.getChildAt(i);
                if ((childAt instanceof w6b) && (o68Var = ((w6b) childAt).a) != null && !o68Var.E3) {
                    o68Var.E3 = true;
                    g58 g58Var = o68Var.L1;
                    if (g58Var != null) {
                        g58Var.g1();
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o68 o68Var2 = (o68) arrayList.get(i2);
                if (!o68Var2.E3) {
                    o68Var2.E3 = true;
                    g58 g58Var2 = o68Var2.L1;
                    if (g58Var2 != null) {
                        g58Var2.g1();
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
        o68 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            n68 n68Var = currentPeerView.y1;
            if (!n68Var.h() && n68Var.e) {
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

    public final void t(Runnable runnable) {
        if (runnable != null) {
            this.y0.add(runnable);
        }
    }

    @Override
    public final boolean u(Dialog dialog) {
        try {
            this.v0 = dialog;
            dialog.setOnDismissListener(new dl8(this, (byte) 10));
            dialog.show();
            U();
            return true;
        } catch (Throwable th) {
            cc4.g(th, true);
            this.v0 = null;
            return false;
        }
    }

    public final boolean v(ybb ybbVar, float f, float f2, boolean z) {
        g58 g58Var;
        g58 g58Var2;
        if (ybbVar != null) {
            if (!this.X0) {
                if (this.x == null || this.f0 == 0.0f) {
                    o68 currentPeerView = this.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.y0(currentPeerView, ((f - this.w.getX()) - this.o0.getX()) - currentPeerView.getX(), ((f2 - this.w.getY()) - this.o0.getY()) - currentPeerView.getY(), z)) {
                            if (currentPeerView.f2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z) {
                        return false;
                    }
                    if (currentPeerView != null && (g58Var2 = currentPeerView.L1) != null && g58Var2.getVisibility() == 0) {
                        if (f2 > currentPeerView.L1.getY() + currentPeerView.getY() + this.o0.getY() + this.w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (g58Var = currentPeerView.L1) != null && g58Var.X0()) || this.u1 != null) {
                        return true;
                    }
                    return hl.Y(ybbVar, f, f2, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final o68 w() {
        acb acbVar = this.o0;
        if (acbVar == null) {
            return null;
        }
        return acbVar.getCurrentPeerView();
    }

    public final void y() {
        if (this.n0) {
            hl.t1(this.s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            U();
            this.P = 0.0f;
            this.O = 0.0f;
            icb icbVar = this.t0;
            ImageReceiver imageReceiver = icbVar.b;
            if (imageReceiver != null) {
                imageReceiver.v0(true, true);
            }
            ImageReceiver imageReceiver2 = icbVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.v0(true, true);
            }
            icbVar.c = null;
            icbVar.b = null;
            zbb zbbVar = this.w;
            if (zbbVar != null) {
                zbbVar.a(true);
            }
            this.J0.e();
            d30 d30Var = this.G0;
            if (d30Var != null) {
                d30Var.m();
            }
            M();
            if (this.b) {
                hl.B2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            q();
            this.n0 = false;
            this.d = false;
            l();
            x58 x58Var = this.o1;
            if (x58Var != null) {
                x58Var.run();
                this.o1 = null;
            }
        }
    }

    @Override
    public final boolean z() {
        if (this.b && this.s != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(boolean z) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
