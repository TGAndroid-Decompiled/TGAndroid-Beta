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
public final class m8b implements gk7, zf0 {
    public static boolean A1;
    public static boolean D1;
    public static boolean x1;
    public static TL_stories.StoryItem z1;
    public l8b A0;
    public t76 B0;
    public e8b C0;
    public SurfaceView D0;
    public u76 E0;
    public boolean F;
    public Uri F0;
    public ValueAnimator G;
    public c30 G0;
    public ValueAnimator H;
    public boolean H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public final on J0;
    public int K;
    public boolean K0;
    public float L;
    public boolean L0;
    public float M;
    public final ArrayList M0;
    public m2b N;
    public boolean N0;
    public float O;
    public y1b O0;
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
    public final g28 b1;
    public float c0;
    public boolean c1;
    public boolean d0;
    public c3b d1;
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
    public kya n1;
    public c8b o0;
    public g28 o1;
    public boolean p1;
    public int q0;
    public float q1;
    public WindowManager.LayoutParams r;
    public boolean r0;
    public boolean r1;
    public a8b s;
    public float s0;
    public boolean s1;
    public final j8b t0;
    public long t1;
    public i8b u0;
    public k2b u1;
    public Dialog v0;
    public ValueAnimator v1;
    public b8b w;
    public zf0 w0;
    public boolean w1;
    public n0a x;
    public boolean x0;
    public boolean y;
    public final ArrayList y0;
    public ix z0;
    public static final ArrayList y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean a = gba.Y;
    public boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final f53 E = new f53();
    public final RectF U = new RectF();
    public final float[] p0 = new float[2];

    public m8b(d dVar) {
        ?? obj = new Object();
        obj.k = 1.0f;
        this.t0 = obj;
        this.y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new on(null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.b1 = new g28(this, (byte) 4);
        this.e1 = new LongSparseIntArray();
        new Paint(1);
        this.f = dVar;
    }

    public static boolean B(k27 k27Var) {
        if (z1 != null) {
            if ((k27Var.D == 23 || k27Var.Y4()) && !A1 && z1.messageId == k27Var.e1() && z1.messageType != 3) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8b.C():void");
    }

    public final void D(boolean z) {
        int i;
        Activity W = gl.W(this.f.getContext());
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

    public final void E(int i, Context context, TL_stories.StoryItem storyItem, p2b p2bVar) {
        if (storyItem != null) {
            this.h = i;
            if (storyItem.dialogId <= 0 || na7.q1(i).V1(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && na7.q1(this.h).K0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                F(i, context, storyItem, arrayList, 0, null, null, p2bVar, false);
            }
        }
    }

    public final void F(int i, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i2, y1b y1bVar, TL_stories.PeerStories peerStories, i8b i8bVar, boolean z) {
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean C12 = gl.C1(context);
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
        l8b l8bVar = this.A0;
        if (l8bVar != null) {
            l8bVar.setSpeed(1.0f);
        }
        boolean z6 = false;
        if (!gl.O1() && !this.r1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if (gba.Y && z2) {
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
        if (storyItem != null && y1bVar == null && peerStories == null) {
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
        this.O0 = y1bVar;
        this.Q0 = peerStories;
        this.u0 = i8bVar;
        this.R0 = z;
        this.h = i;
        this.X = 0.0f;
        this.Y = 0.0f;
        c8b c8bVar = this.o0;
        if (c8bVar != null) {
            c8bVar.setHorizontalProgressToDismiss(0.0f);
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
        gl.r(this.b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        gl.m(layoutParams);
        this.r.flags = -2147417728;
        this.H0 = false;
        this.c1 = false;
        d Q = LaunchActivity.Q();
        if (this.s == null) {
            this.j0 = new GestureDetector(new w7b(this));
            this.s = new a8b(this, context, Q);
        }
        if (this.w == null) {
            this.w = new b8b(this, context);
            c8b c8bVar2 = new c8b(this, this.h, context, this, this.E);
            this.o0 = c8bVar2;
            c8bVar2.setDelegate(new d8b(this, y1bVar, arrayList, context));
            this.w.addView(this.o0, nme.e(-1, -1, 1));
            this.z0 = new ix(context);
            if (this.a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.z0.addView(this.D0);
            } else {
                e8b e8bVar = new e8b(this, context);
                this.C0 = e8bVar;
                this.z0.addView(e8bVar);
            }
            u76 u76Var = new u76(context, this.h);
            this.E0 = u76Var;
            u76Var.setVisibility(8);
            this.z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.a = paint;
            view.c = new xia((Object) view, (byte) 6);
            view.d = new lm((View) view);
            view.e = new lm((View) view);
            paint.setColor(-1);
            this.d1 = view;
            this.w.addView((View) view, nme.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        u76 u76Var2 = this.E0;
        if (u76Var2 != null) {
            u76Var2.setAccount(this.h);
        }
        gl.B2(this.z0);
        this.s.addView(this.z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        gl.B2(this.w);
        this.s.addView(this.w);
        this.s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        c8b c8bVar3 = this.o0;
        if (y1bVar != null) {
            c8bVar3.D(this.h, y1bVar.d, y1bVar.h());
        } else {
            int i4 = this.h;
            c8bVar3.B0 = arrayList;
            c8bVar3.z0 = i4;
            c8bVar3.setAdapter(null);
            c8bVar3.setAdapter(c8bVar3.A0);
            c8bVar3.setCurrentItem(i2);
            c8bVar3.D0 = true;
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
        b8b b8bVar = this.w;
        hza hzaVar = new hza(this, (byte) 8);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(b8bVar, hzaVar);
        boolean z7 = this.b;
        a8b a8bVar = this.s;
        if (z7) {
            gl.B2(a8bVar);
            this.s.setTag(2131296649, new Object());
            Q.getLayoutContainer().addView(this.s);
            if (!this.c) {
                gl.W2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            a8bVar.setFocusable(false);
            this.w.setFocusable(false);
            this.w.setSystemUiVisibility(1792);
            gl.t3(this.n, this.s, this.r);
            this.n.addView(this.s, this.r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new uo(this, (byte) 4));
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
            gl.t1(Q.getFragmentView());
        }
    }

    public final void G(Context context, int i, y1b y1bVar, p2b p2bVar) {
        this.h = y6c.t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(y1bVar.d));
        this.P0 = i;
        K(context, null, arrayList, 0, y1bVar, null, p2bVar, false);
    }

    public final void H(Context context, long j, i8b i8bVar) {
        ArrayList<TL_stories.StoryItem> arrayList;
        this.h = y6c.t0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(j));
        g2b M1 = na7.q1(this.h).M1();
        int i = M1.a;
        TL_stories.PeerStories x = M1.x(j);
        if (x != null) {
            int i2 = 0;
            while (true) {
                int size = x.stories.size();
                arrayList = x.stories;
                if (i2 >= size) {
                    break;
                }
                if (x2b.w(i, arrayList.get(i2))) {
                    x.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (arrayList.isEmpty() && !M1.K(j)) {
                M1.g.remove(x);
                M1.h.remove(x);
                kk7.f(i).k(kk7.x5, new Object[0]);
            }
        }
        K(context, null, arrayList2, 0, null, null, i8bVar, false);
    }

    public final void I(Context context, TL_stories.PeerStories peerStories, pj4 pj4Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = y6c.t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(cf3.n(peerStories.peer)));
            K(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, pj4Var, false);
            return;
        }
        this.y0.clear();
    }

    public final void J(Context context, TL_stories.StoryItem storyItem, p2b p2bVar) {
        E(y6c.t0, context, storyItem, p2bVar);
    }

    public final void K(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i, y1b y1bVar, TL_stories.PeerStories peerStories, i8b i8bVar, boolean z) {
        F(y6c.t0, context, storyItem, arrayList, i, y1bVar, peerStories, i8bVar, z);
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
        l8b l8bVar = this.A0;
        if (l8bVar != null) {
            l8bVar.release(null);
            this.A0 = null;
        }
        u76 u76Var = this.E0;
        if (u76Var != null) {
            u76Var.e(0L, null);
        }
        t76 t76Var = this.B0;
        if (t76Var != null && !x76.a(t76Var)) {
            t76 t76Var2 = this.B0;
            if (t76Var2.n) {
                t76Var2.d();
            } else {
                t76Var2.h();
            }
        }
        this.B0 = null;
        x76 x76Var = x76.E;
        if (x76Var != null && x76Var.c == this) {
            x76Var.c = null;
            v76 v76Var = x76Var.w;
            LaunchActivity launchActivity = x76Var.x;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.a1.remove(v76Var);
                }
                x76Var.x = null;
            }
            xa8 xa8Var = x76Var.a;
            if (xa8Var != null && xa8Var.d()) {
                xa8 xa8Var2 = x76Var.a;
                if (xa8Var2.c == 0) {
                    x76Var.a = null;
                    x76Var.b(null);
                    xa8Var2.f();
                }
            }
        }
        int i = 0;
        while (true) {
            arrayList = this.M0;
            if (i >= arrayList.size()) {
                break;
            }
            ((l8b) arrayList.get(i)).release(null);
            i++;
        }
        arrayList.clear();
        vf6 vf6Var = na7.q1(this.h).M1().m;
        for (int i2 = 0; i2 < vf6Var.m(); i2++) {
            ((ifc) vf6Var.n(i2)).b(false);
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
            xia xiaVar = this.d1.c;
            gl.r(xiaVar);
            xiaVar.run();
        }
        U();
    }

    public final void P(boolean z) {
        y28 currentPeerView;
        y28 currentPeerView2;
        x28 x28Var;
        l8b l8bVar;
        c30 c30Var;
        if (this.a1 != z) {
            this.a1 = z;
            if (z && !this.f1 && (currentPeerView2 = this.o0.getCurrentPeerView()) != null && (x28Var = currentPeerView2.E1) != null && !x28Var.f && x28Var.b == null) {
                if (!this.l0 && !this.k0 && (c30Var = this.G0) != null && ((l8b) c30Var.c) != null) {
                    currentPeerView2.S0.invalidate();
                    pw0.IMPACT_LIGHT.a();
                }
                c30 c30Var2 = this.G0;
                if (c30Var2 != null && (l8bVar = (l8b) c30Var2.c) != null && !this.l0) {
                    l8bVar.setSeeking(true);
                }
                this.l0 = true;
            }
            U();
            c8b c8bVar = this.o0;
            if (c8bVar != null && (currentPeerView = c8bVar.getCurrentPeerView()) != null) {
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
                Typeface typeface = gl.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z2 = fod.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z2 = false;
                }
                this.x0 = z2;
            }
            if (this.x0) {
                gl.i3(launchActivity, !z);
            }
        }
    }

    public final void R() {
        wb wbVar;
        gt3 editField;
        y28 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.R1 != null && (((wbVar = currentPeerView.R2) == null || wbVar.getVisibility() != 0) && (editField = currentPeerView.R1.getEditField()) != null)) {
            editField.requestFocus();
            gl.F3(editField);
            gl.e3(new g28(this, (byte) 6), 200L);
            return;
        }
        i();
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8b.S():void");
    }

    public final void T() {
        boolean z = D1;
        D1 = !z;
        l8b l8bVar = this.A0;
        int i = 0;
        if (l8bVar != null) {
            l8bVar.setAudioEnabled(z, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i >= arrayList.size()) {
                break;
            }
            ((l8b) arrayList.get(i)).setAudioEnabled(!D1, true);
            i++;
        }
        y28 currentPeerView = this.o0.getCurrentPeerView();
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
        l8b l8bVar = this.A0;
        if (l8bVar != null) {
            if (A) {
                l8bVar.pause();
            } else {
                l8bVar.play(B1);
            }
        }
        this.o0.E0 = (this.y || this.H0 || this.I0 || this.a1 || this.f1 || this.f0 != 0.0f || this.j1) ? false : false;
    }

    public final void V() {
        float l = Utilities.l(Math.abs(Math.max(this.Y, this.X) / gl.L(80.0f)));
        if (this.W != l) {
            this.W = l;
            l();
            y28 currentPeerView = this.o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.n2) {
                currentPeerView.invalidate();
            }
            t76 t76Var = this.B0;
            if (t76Var != null) {
                t76Var.F((1.0f - this.W) * this.V);
            }
        }
        a8b a8bVar = this.s;
        if (a8bVar != null) {
            a8bVar.invalidate();
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8b.W():void");
    }

    @Override
    public final void a(boolean z) {
        o(true);
    }

    public final void c(boolean z) {
        boolean z2;
        boolean z3 = w01.a;
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
            u76 u76Var = this.E0;
            if (u76Var != null) {
                u76Var.setSecure(!z2);
            }
            if (this.b) {
                d dVar = this.f;
                if (dVar.getParentActivity() != null) {
                    if (z2) {
                        dVar.getParentActivity().getWindow().clearFlags(8192);
                        gl.f2();
                        return;
                    }
                    dVar.getParentActivity().getWindow().addFlags(8192);
                    gl.f2();
                    return;
                }
                return;
            }
            WindowManager.LayoutParams layoutParams = this.r;
            if (z2) {
                layoutParams.flags &= -8193;
                gl.f2();
            } else {
                layoutParams.flags |= 8192;
                gl.f2();
            }
            try {
                this.n.updateViewLayout(this.s, this.r);
            } catch (Exception e) {
                fa4.g(e, true);
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
        if (i == kk7.z5) {
            if (this.O0 == ((y1b) objArr[0])) {
                w();
                c8b c8bVar = this.o0;
                y1b y1bVar = this.O0;
                c8bVar.D(this.h, y1bVar.d, y1bVar.h());
                n0a n0aVar = this.x;
                if (n0aVar != null) {
                    TL_stories.StoryItem selectedStory = n0aVar.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (i3 < this.O0.i.size()) {
                        if (selectedStory != null && selectedStory.id == ((k27) this.O0.i.get(i3)).l.id) {
                            i4 = i3;
                        }
                        arrayList2.add(((k27) this.O0.i.get(i3)).l);
                        i3++;
                    }
                    this.x.b(i4, this.O0.d, arrayList2);
                }
            }
        } else if (i == kk7.x5) {
            i8b i8bVar = this.u0;
            if (i8bVar instanceof p2b) {
                p2b p2bVar = (p2b) i8bVar;
                if (p2bVar.r && !p2bVar.n) {
                    g2b M1 = na7.q1(this.h).M1();
                    if (p2bVar.f) {
                        arrayList = M1.h;
                    } else {
                        arrayList = M1.g;
                    }
                    ArrayList<Long> dialogIds = this.o0.getDialogIds();
                    boolean z = false;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i5)).peer);
                        if ((!p2bVar.h || M1.K(n)) && !dialogIds.contains(Long.valueOf(n))) {
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
            n0a n0aVar2 = this.x;
            if (n0aVar2 != null) {
                ArrayList arrayList3 = n0aVar2.h.H;
                while (i3 < arrayList3.size()) {
                    ((mz9) arrayList3.get(i3)).b();
                    i3++;
                }
            }
        } else {
            int i6 = kk7.b1;
            if (i != i6 && i != kk7.c1) {
                if (i == kk7.y5) {
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
                l8b l8bVar = this.A0;
                if (l8bVar != null) {
                    this.t1 = l8bVar.currentPosition;
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
        return bm2.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i, -16777216);
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
            n0a n0aVar = this.x;
            if (n0aVar != null) {
                n0aVar.setKeyboardHeight(i);
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
            ofFloat.addUpdateListener(new u7b(this, (byte) 2));
            this.I.addListener(new v7b(this, (byte) 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(gb.w);
            this.I.start();
        }
    }

    @Override
    public final u21 j() {
        return null;
    }

    public final void k(boolean z) {
        if (this.v1 == null) {
            if (this.q0 != 0) {
                gl.t1(this.x);
                return;
            }
            float f = 0.0f;
            if (!this.d0 && this.f0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z) {
                float f2 = this.f0;
                n0a n0aVar = this.x;
                float f3 = n0aVar.c;
                if (f2 == f3) {
                    float f4 = f3 - 1.0f;
                    this.f0 = f4;
                    n0aVar.setOffset(f4);
                }
            }
            float f5 = this.f0;
            if (z) {
                f = this.x.c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new u7b(this, (byte) 3));
            this.v1.addListener(new pu9((byte) 7, this, z));
            ValueAnimator valueAnimator = this.v1;
            if (z) {
                valueAnimator.setDuration(350L);
                this.v1.setInterpolator(s33.h);
            } else {
                valueAnimator.setDuration(350L);
                this.v1.setInterpolator(s33.f);
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
            n0a n0aVar = new n0a(this, this.w.getContext());
            this.x = n0aVar;
            this.w.addView(n0aVar, 0);
        }
        y28 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.O0.i.size(); i++) {
                    arrayList.add(((k27) this.O0.i.get(i)).l);
                }
                this.x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void o(boolean z) {
        gl.t1(this.s);
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
        ofFloat.addUpdateListener(new u7b(this, (byte) 0));
        if (!z) {
            this.P = 0.0f;
            this.O = 0.0f;
            j8b j8bVar = this.t0;
            ImageReceiver imageReceiver = j8bVar.b;
            if (imageReceiver != null) {
                imageReceiver.v0(true, true);
            }
            ImageReceiver imageReceiver2 = j8bVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.v0(true, true);
            }
            j8bVar.c = null;
            j8bVar.b = null;
        } else {
            C();
        }
        gl.e3(new g28(this, (byte) 2), 16L);
        if (this.c1) {
            this.c1 = false;
        }
    }

    public final void p() {
        y28 y28Var;
        c8b c8bVar = this.o0;
        if (c8bVar != null) {
            ArrayList arrayList = c8bVar.Q0;
            for (int i = 0; i < c8bVar.getChildCount(); i++) {
                View childAt = c8bVar.getChildAt(i);
                if ((childAt instanceof a3b) && (y28Var = ((a3b) childAt).a) != null && !y28Var.K3) {
                    y28Var.K3 = true;
                    q18 q18Var = y28Var.R1;
                    if (q18Var != null) {
                        q18Var.b1();
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                y28 y28Var2 = (y28) arrayList.get(i2);
                if (!y28Var2.K3) {
                    y28Var2.K3 = true;
                    q18 q18Var2 = y28Var2.R1;
                    if (q18Var2 != null) {
                        q18Var2.b1();
                    }
                }
            }
        }
    }

    @Override
    public final void q() {
        y28 currentPeerView;
        boolean z = false;
        if (this.f0 != 0.0f) {
            n0a n0aVar = this.x;
            if (n0aVar.y > 0) {
                gl.t1(n0aVar);
                return;
            }
            g0a currentPage = n0aVar.getCurrentPage();
            if (currentPage != null) {
                oz9 oz9Var = currentPage.r;
                wz9 wz9Var = currentPage.f;
                if (wz9Var != null && wz9Var.a) {
                    wz9Var.a();
                    return;
                } else if (Math.abs(currentPage.c.getTranslationY() - oz9Var.getPaddingTop()) > gl.L(2.0f)) {
                    oz9Var.dispatchTouchEvent(gl.R());
                    oz9Var.z0(0);
                    return;
                }
            }
            k(false);
            return;
        }
        c8b c8bVar = this.o0;
        if (c8bVar != null && (currentPeerView = c8bVar.getCurrentPeerView()) != null) {
            z = currentPeerView.i0();
        }
        if (z) {
            return;
        }
        o(true);
    }

    public final void r(KeyEvent keyEvent) {
        if (D1) {
            T();
            return;
        }
        y28 currentPeerView = this.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            x28 x28Var = currentPeerView.E1;
            if (!x28Var.h() && x28Var.e) {
                currentPeerView.X0(true);
                return;
            }
        }
        this.d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void s(Runnable runnable) {
        if (runnable != null) {
            this.y0.add(runnable);
        }
    }

    @Override
    public final boolean t() {
        return !this.H0;
    }

    @Override
    public final boolean u(Dialog dialog) {
        try {
            this.v0 = dialog;
            dialog.setOnDismissListener(new ph8(this, (byte) 10));
            dialog.show();
            U();
            return true;
        } catch (Throwable th) {
            fa4.g(th, true);
            this.v0 = null;
            return false;
        }
    }

    public final boolean v(a8b a8bVar, float f, float f2, boolean z) {
        q18 q18Var;
        q18 q18Var2;
        if (a8bVar != null) {
            if (!this.X0) {
                if (this.x == null || this.f0 == 0.0f) {
                    y28 currentPeerView = this.o0.getCurrentPeerView();
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
                    if (currentPeerView != null && (q18Var2 = currentPeerView.R1) != null && q18Var2.getVisibility() == 0) {
                        if (f2 > currentPeerView.R1.getY() + currentPeerView.getY() + this.o0.getY() + this.w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (q18Var = currentPeerView.R1) != null && q18Var.T0()) || this.u1 != null) {
                        return true;
                    }
                    return gl.Y(a8bVar, f, f2, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final y28 w() {
        c8b c8bVar = this.o0;
        if (c8bVar == null) {
            return null;
        }
        return c8bVar.getCurrentPeerView();
    }

    public final void y() {
        if (this.n0) {
            gl.t1(this.s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            U();
            this.P = 0.0f;
            this.O = 0.0f;
            j8b j8bVar = this.t0;
            ImageReceiver imageReceiver = j8bVar.b;
            if (imageReceiver != null) {
                imageReceiver.v0(true, true);
            }
            ImageReceiver imageReceiver2 = j8bVar.c;
            if (imageReceiver2 != null) {
                imageReceiver2.v0(true, true);
            }
            j8bVar.c = null;
            j8bVar.b = null;
            b8b b8bVar = this.w;
            if (b8bVar != null) {
                b8bVar.a(true);
            }
            this.J0.e();
            c30 c30Var = this.G0;
            if (c30Var != null) {
                c30Var.m();
            }
            M();
            if (this.b) {
                gl.B2(this.s);
            } else {
                this.n.removeView(this.s);
            }
            this.s = null;
            p();
            this.n0 = false;
            this.d = false;
            l();
            g28 g28Var = this.o1;
            if (g28Var != null) {
                g28Var.run();
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
