package di;

import a8.ra;
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
import bi.ab;
import bi.eb;
import bi.md;
import c8.ha;
import c8.zc;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
public final class p9 implements ls, org.telegram.ui.ActionBar.b2 {
    public static boolean C1;
    public static boolean f9525w1;
    public static TL_stories.StoryItem f9527y1;
    public static boolean f9528z1;
    public g1 A0;
    public h9 B0;
    public SurfaceView C0;
    public fi.s3 D0;
    public boolean E;
    public Uri E0;
    public ValueAnimator F;
    public h4 F0;
    public ValueAnimator G;
    public boolean G0;
    public ValueAnimator H;
    public boolean H0;
    public long I;
    public final h2.f I0;
    public int J;
    public boolean J0;
    public float K;
    public boolean K0;
    public float L;
    public final ArrayList L0;
    public e7 M;
    public boolean M0;
    public float N;
    public q6 N0;
    public float O;
    public int O0;
    public float P;
    public TL_stories.PeerStories P0;
    public float Q;
    public boolean Q0;
    public float R;
    public boolean R0;
    public float S;
    public TL_stories.StoryItem S0;
    public int T0;
    public float U;
    public boolean U0;
    public float V;
    public int[] V0;
    public float W;
    public boolean W0;
    public float X;
    public boolean X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean f9530a0;
    public final l3 f9531a1;
    public float f9533b0;
    public boolean f9534b1;
    public boolean f9536c0;
    public y7 f9537c1;
    public float f9538d0;
    public final LongSparseIntArray f9539d1;
    public float f9541e0;
    public boolean f9542e1;
    public final org.telegram.ui.ActionBar.f2 f9543f;
    public boolean f9544f0;
    public boolean f9545f1;
    public boolean f9546g0;
    public boolean f9547g1;
    public int h;
    public boolean f9548h0;
    public boolean f9549h1;
    public GestureDetector f9550i0;
    public boolean f9551i1;
    public boolean f9552j0;
    public boolean f9553j1;
    public boolean f9554k0;
    public boolean f9555k1;
    public boolean f9556l0;
    public boolean l1;
    public boolean m0;
    public s7 f9557m1;
    public WindowManager f9558n;
    public f9 f9559n0;
    public l3 n1;
    public boolean f9561o1;
    public int f9562p0;
    public float f9563p1;
    public boolean f9564q0;
    public boolean f9565q1;
    public WindowManager.LayoutParams f9566r;
    public float f9567r0;
    public boolean f9568r1;
    public d9 f9569s;
    public final m9 f9570s0;
    public long f9571s1;
    public l9 f9572t0;
    public c7 f9573t1;
    public Dialog f9574u0;
    public ValueAnimator f9575u1;
    public org.telegram.ui.ActionBar.b2 f9576v0;
    public boolean f9577v1;
    public e9 f9578w;
    public boolean f9579w0;
    public s5 f9580x;
    public final ArrayList f9581x0;
    public boolean f9582y;
    public org.telegram.ui.j4 f9583y0;
    public o9 f9584z0;
    public static final ArrayList f9526x1 = new ArrayList();
    public static float A1 = 1.0f;
    public static boolean B1 = true;
    public static final LongSparseArray D1 = new LongSparseArray();
    public boolean f9529a = iz.f23368b0;
    public boolean f9532b = true;
    public boolean f9535c = false;
    public boolean d = false;
    public boolean f9540e = true;
    public final b D = new b();
    public final RectF T = new RectF();
    public final float[] f9560o0 = new float[2];

    public p9(org.telegram.ui.ActionBar.f2 f2Var) {
        ?? obj = new Object();
        obj.f9370k = 1.0f;
        this.f9570s0 = obj;
        this.f9581x0 = new ArrayList();
        this.G0 = true;
        this.I0 = new h2.f((int[]) null);
        this.L0 = new ArrayList();
        this.Y0 = false;
        this.f9531a1 = new l3(this, 4);
        this.f9539d1 = new LongSparseIntArray();
        new Paint(1);
        this.f9543f = f2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) D1.get(j3 + (j3 >> 16) + (storyItem.f27192id << 16), "");
    }

    public static boolean D(ij ijVar) {
        if (f9527y1 == null || ((ijVar.D != 23 && !ijVar.a5()) || f9528z1 || f9527y1.messageId != ijVar.f1() || f9527y1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            D1.put(j3 + (j3 >> 16) + (storyItem.f27192id << 16), editable);
        }
    }

    public static boolean c(p9 p9Var, d9 d9Var, float f10, float f11, boolean z9) {
        o2 o2Var;
        o2 o2Var2;
        if (d9Var != null) {
            if (!p9Var.W0) {
                if (p9Var.f9580x == null || p9Var.f9541e0 == 0.0f) {
                    i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f10 - p9Var.f9578w.getX()) - p9Var.f9559n0.getX()) - currentPeerView.getX(), ((f11 - p9Var.f9578w.getY()) - p9Var.f9559n0.getY()) - currentPeerView.getY(), z9)) {
                            if (currentPeerView.f9142e2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z9) {
                        return false;
                    }
                    if (currentPeerView != null && (o2Var2 = currentPeerView.K1) != null && o2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.K1.getY() + currentPeerView.getY() + p9Var.f9559n0.getY() + p9Var.f9578w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (o2Var = currentPeerView.K1) != null && o2Var.v0()) || p9Var.f9573t1 != null) {
                        return true;
                    }
                    return org.telegram.messenger.g0.Y(d9Var, f10, f11, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void g(p9 p9Var) {
        md mdVar;
        ys editField;
        i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.K1 != null && (((mdVar = currentPeerView.K2) == null || mdVar.getVisibility() != 0) && (editField = currentPeerView.K1.getEditField()) != null)) {
            editField.requestFocus();
            org.telegram.messenger.g0.K3(editField);
            org.telegram.messenger.g0.i3(new l3(p9Var, 6), 200L);
            return;
        }
        p9Var.m();
    }

    public static void i(p9 p9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(p9Var.X, p9Var.W) / org.telegram.messenger.g0.L(80.0f)));
        if (p9Var.V != l10) {
            p9Var.V = l10;
            p9Var.q();
            i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f9150g2) {
                currentPeerView.invalidate();
            }
            g1 g1Var = p9Var.A0;
            if (g1Var != null) {
                g1Var.v((1.0f - p9Var.V) * p9Var.U);
            }
        }
        d9 d9Var = p9Var.f9569s;
        if (d9Var != null) {
            d9Var.invalidate();
        }
    }

    public final void B() {
        if (this.m0) {
            org.telegram.messenger.g0.v1(this.f9569s);
            this.G0 = true;
            this.J0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            V();
            this.O = 0.0f;
            this.N = 0.0f;
            m9 m9Var = this.f9570s0;
            ImageReceiver imageReceiver = m9Var.f9363b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = m9Var.f9364c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            m9Var.f9364c = null;
            m9Var.f9363b = null;
            e9 e9Var = this.f9578w;
            if (e9Var != null) {
                e9Var.a(true);
            }
            this.I0.e();
            h4 h4Var = this.F0;
            if (h4Var != null) {
                h4Var.b();
            }
            O();
            if (this.f9532b) {
                org.telegram.messenger.g0.E2(this.f9569s);
            } else {
                this.f9558n.removeView(this.f9569s);
            }
            this.f9569s = null;
            v();
            this.m0 = false;
            this.d = false;
            q();
            l3 l3Var = this.n1;
            if (l3Var != null) {
                l3Var.run();
                this.n1 = null;
            }
        }
    }

    public final boolean C() {
        org.telegram.ui.ActionBar.f2 f2Var;
        if (!this.W0 && !this.Y0 && !this.X0 && !this.K0 && !this.f9564q0 && !this.f9582y && this.f9574u0 == null && this.f9576v0 == null && !this.G0 && !this.H0 && this.U == 1.0f && this.f9541e0 == 0.0f && !this.f9549h1) {
            if ((!this.f9555k1 || !this.f9529a) && !this.f9553j1 && !this.f9551i1 && !this.f9561o1 && this.V == 0.0f && this.f9573t1 == null) {
                if (!this.f9532b || (f2Var = this.f9543f) == null || f2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        throw new UnsupportedOperationException("Method not decompiled: di.p9.E():void");
    }

    public final void F(boolean z9) {
        int i7;
        Activity W = org.telegram.messenger.g0.W(this.f9543f.getContext());
        if (W != null) {
            if (z9) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            try {
                W.setRequestedOrientation(i7);
            } catch (Exception unused) {
            }
            if (z9) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, l9 l9Var) {
        if (storyItem != null) {
            this.h = i7;
            if (storyItem.dialogId <= 0 || qp.s1(i7).a2(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && qp.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, l9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, q6 q6Var, TL_stories.PeerStories peerStories, l9 l9Var, boolean z9) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E1 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.f9581x0;
        if (!E1) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (this.m0) {
            arrayList2.clear();
            return;
        }
        A1 = 1.0f;
        o9 o9Var = this.f9584z0;
        if (o9Var != null) {
            o9Var.setSpeed(1.0f);
        }
        boolean z14 = false;
        if (!org.telegram.messenger.g0.Q1() && !this.f9565q1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9532b = z10;
        if (iz.f23368b0 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9529a = z11;
        if (storyItem == null) {
            i11 = 0;
        } else {
            i11 = storyItem.messageId;
        }
        this.T0 = i11;
        if (storyItem != null && q6Var == null && peerStories == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.M0 = z12;
        this.R0 = false;
        if (storyItem != null) {
            this.S0 = storyItem;
            f9527y1 = storyItem;
        }
        this.N0 = q6Var;
        this.P0 = peerStories;
        this.f9572t0 = l9Var;
        this.Q0 = z9;
        this.h = i7;
        this.W = 0.0f;
        this.X = 0.0f;
        f9 f9Var = this.f9559n0;
        if (f9Var != null) {
            f9Var.setHorizontalProgressToDismiss(0.0f);
            this.f9559n0.F0 = 0;
        }
        this.f9538d0 = 0.0f;
        this.Z = 0.0f;
        this.f9556l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.Z0 = false;
        this.Y0 = false;
        this.f9539d1.clear();
        org.telegram.messenger.g0.r(this.f9531a1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9566r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.f9566r.flags = -2147417728;
        this.G0 = false;
        this.f9534b1 = false;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (this.f9569s == null) {
            this.f9550i0 = new GestureDetector(new z8(this));
            this.f9569s = new d9(this, context, Q);
        }
        if (this.f9578w == null) {
            this.f9578w = new e9(context, this);
            f9 f9Var2 = new f9(this, this.h, context, this, this.D);
            this.f9559n0 = f9Var2;
            f9Var2.setDelegate(new g9(this, q6Var, arrayList, context));
            this.f9578w.addView(this.f9559n0, ha.e(-1, -1, 1));
            this.f9583y0 = new org.telegram.ui.j4(context);
            if (this.f9529a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f9583y0.addView(this.C0);
            } else {
                h9 h9Var = new h9(context, this);
                this.B0 = h9Var;
                this.f9583y0.addView(h9Var);
            }
            fi.s3 s3Var = new fi.s3(context, this.h);
            this.D0 = s3Var;
            s3Var.setVisibility(8);
            this.f9583y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f9986a = paint;
            view.f9988c = new ra(view, 22);
            view.d = new org.telegram.ui.Components.w5((View) view);
            view.f9989e = new org.telegram.ui.Components.w5((View) view);
            paint.setColor(-1);
            this.f9537c1 = view;
            this.f9578w.addView((View) view, ha.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        fi.s3 s3Var2 = this.D0;
        if (s3Var2 != null) {
            s3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.f9583y0);
        this.f9569s.addView(this.f9583y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.f9578w);
        this.f9569s.addView(this.f9578w);
        this.f9569s.setClipChildren(false);
        if (this.M0) {
            W();
        }
        if (q6Var != null) {
            this.f9559n0.D(this.h, q6Var.d, q6Var.h());
        } else {
            f9 f9Var3 = this.f9559n0;
            int i12 = this.h;
            f9Var3.A0 = arrayList;
            f9Var3.f9941y0 = i12;
            f9Var3.setAdapter(null);
            f9Var3.setAdapter(f9Var3.f9942z0);
            f9Var3.setCurrentItem(i10);
            f9Var3.C0 = true;
        }
        this.f9558n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f9532b = false;
        }
        if (this.f9532b && Q != null && Q.isSupportEdgeToEdge()) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f9535c = z13;
        e9 e9Var = this.f9578w;
        q4 q4Var = new q4(this, 4);
        WeakHashMap weakHashMap = r0.i0.f54097a;
        r0.a0.i(e9Var, q4Var);
        if (this.f9532b) {
            org.telegram.messenger.g0.E2(this.f9569s);
            this.f9569s.setTag(2131296647, new Object());
            Q.getLayoutContainer().addView(this.f9569s);
            if (!this.f9535c) {
                org.telegram.messenger.g0.a3(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f9569s.setFocusable(false);
            this.f9578w.setFocusable(false);
            this.f9578w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.y3(this.f9558n, this.f9569s, this.f9566r);
            this.f9558n.addView(this.f9569s, this.f9566r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f9569s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f9569s.requestLayout();
        f9528z1 = true;
        W();
        this.U = 0.0f;
        q();
        f9525w1 = true;
        if (B1) {
            B1 = false;
            if (((AudioManager) this.f9569s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z14 = true;
            }
            C1 = z14;
        }
        if (this.f9532b) {
            F(true);
        }
        if (!this.f9532b) {
            f9526x1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, q6 q6Var, h7 h7Var) {
        this.h = p10.f24467s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(q6Var.d));
        this.O0 = i7;
        M(context, null, arrayList, 0, q6Var, null, h7Var, false);
    }

    public final void J(Context context, long j3, l9 l9Var) {
        this.h = p10.f24467s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        y6 P1 = qp.s1(this.h).P1();
        int i7 = P1.f9963a;
        TL_stories.PeerStories y10 = P1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (r7.w(i7, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !P1.L(j3)) {
                P1.f9968g.remove(y10);
                P1.h.remove(y10);
                qs.f(i7).k(qs.f25086v5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, l9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, l9 l9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = p10.f24467s0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
            M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, l9Var, false);
            return;
        }
        this.f9581x0.clear();
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, h7 h7Var) {
        G(p10.f24467s0, context, storyItem, h7Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, q6 q6Var, TL_stories.PeerStories peerStories, l9 l9Var, boolean z9) {
        H(p10.f24467s0, context, storyItem, arrayList, i7, q6Var, peerStories, l9Var, z9);
    }

    public final void N(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f9532b) {
            Q.presentFragment(f2Var);
            return;
        }
        Q.presentFragment(f2Var);
        u(false);
    }

    public final void O() {
        ArrayList arrayList;
        this.E0 = null;
        Q(false);
        l(true);
        o9 o9Var = this.f9584z0;
        if (o9Var != null) {
            o9Var.release(null);
            this.f9584z0 = null;
        }
        fi.s3 s3Var = this.D0;
        if (s3Var != null) {
            s3Var.b(0L, null);
        }
        g1 g1Var = this.A0;
        if (g1Var != null && !i1.a(g1Var)) {
            g1 g1Var2 = this.A0;
            if (g1Var2.f9027n) {
                g1Var2.s(null);
            } else {
                g1Var2.e();
            }
        }
        this.A0 = null;
        i1 i1Var = i1.f9120w;
        if (i1Var != null && i1Var.f9123c == this) {
            i1Var.f9123c = null;
            ab abVar = i1Var.f9126n;
            LaunchActivity launchActivity = i1Var.f9127r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.Z0.remove(abVar);
                }
                i1Var.f9127r = null;
            }
            ti.o oVar = i1Var.f9121a;
            if (oVar != null && oVar.d()) {
                ti.o oVar2 = i1Var.f9121a;
                if (oVar2.f56032c == 0) {
                    i1Var.f9121a = null;
                    i1Var.f9122b = null;
                    oVar2.f();
                }
            }
        }
        int i7 = 0;
        while (true) {
            arrayList = this.L0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((o9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = qp.s1(this.h).P1().f9973m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((y9) hVar.n(i10)).b(false);
        }
        if (this.f9532b) {
            F(false);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f9543f;
        if (f2Var != null) {
            f2Var.removeSheet(this);
        }
        f9526x1.remove(this);
        this.f9581x0.clear();
        this.f9541e0 = 0.0f;
        f9527y1 = null;
    }

    public final void Q(boolean z9) {
        this.f9564q0 = z9;
        if (z9) {
            ra raVar = this.f9537c1.f9988c;
            org.telegram.messenger.g0.r(raVar);
            raVar.run();
        }
        V();
    }

    public final void R(boolean z9) {
        i4 currentPeerView;
        i4 currentPeerView2;
        g4 g4Var;
        o9 o9Var;
        h4 h4Var;
        if (this.Z0 != z9) {
            this.Z0 = z9;
            if (z9 && !this.f9542e1 && (currentPeerView2 = this.f9559n0.getCurrentPeerView()) != null && (g4Var = currentPeerView2.f9213x1) != null && !g4Var.f9042f && g4Var.f9039b == null) {
                if (!this.f9554k0 && !this.f9552j0 && (h4Var = this.F0) != null && ((o9) h4Var.f9076c) != null) {
                    currentPeerView2.L0.invalidate();
                    org.telegram.messenger.p2.IMPACT_LIGHT.a();
                }
                h4 h4Var2 = this.F0;
                if (h4Var2 != null && (o9Var = (o9) h4Var2.f9076c) != null && !this.f9554k0) {
                    o9Var.setSeeking(true);
                }
                this.f9554k0 = true;
            }
            V();
            f9 f9Var = this.f9559n0;
            if (f9Var != null && (currentPeerView = f9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.Z0);
            }
        }
    }

    public final void S(boolean z9) {
        boolean z10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f9532b && launchActivity != null) {
            if (z9) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.g0.f22516a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z10 = zc.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z10 = false;
                }
                this.f9579w0 = z10;
            }
            if (this.f9579w0) {
                org.telegram.messenger.g0.m3(launchActivity, !z9);
            }
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: di.p9.T():void");
    }

    public final void U() {
        boolean z9 = C1;
        C1 = !z9;
        o9 o9Var = this.f9584z0;
        int i7 = 0;
        if (o9Var != null) {
            o9Var.setAudioEnabled(z9, false);
        }
        while (true) {
            ArrayList arrayList = this.L0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((o9) arrayList.get(i7)).setAudioEnabled(!C1, true);
            i7++;
        }
        i4 currentPeerView = this.f9559n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f9149g1.a(C1, true);
        }
        if (!C1) {
            this.f9537c1.b();
        }
    }

    public final void V() {
        if (this.f9559n0 == null) {
            return;
        }
        boolean C = C();
        boolean z9 = true;
        if (this.f9532b) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f9543f;
            if (f2Var.isPaused() || !f2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().V) {
            C = true;
        }
        this.f9559n0.setPaused(C);
        o9 o9Var = this.f9584z0;
        if (o9Var != null) {
            if (C) {
                o9Var.pause();
            } else {
                o9Var.play(A1);
            }
        }
        this.f9559n0.D0 = (this.f9582y || this.G0 || this.H0 || this.Z0 || this.f9542e1 || this.f9541e0 != 0.0f || this.f9551i1) ? false : false;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: di.p9.W():void");
    }

    @Override
    public final void a(boolean z9) {
        u(true);
    }

    @Override
    public final View d() {
        return this.f9569s;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == qs.f25100x5) {
            if (this.N0 == ((q6) objArr[0])) {
                z();
                f9 f9Var = this.f9559n0;
                q6 q6Var = this.N0;
                f9Var.D(this.h, q6Var.d, q6Var.h());
                s5 s5Var = this.f9580x;
                if (s5Var != null) {
                    TL_stories.StoryItem selectedStory = s5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.N0.f9643i.size()) {
                        if (selectedStory != null && selectedStory.f27192id == ((ij) this.N0.f9643i.get(i11)).f23248l.f27192id) {
                            i12 = i11;
                        }
                        arrayList2.add(((ij) this.N0.f9643i.get(i11)).f23248l);
                        i11++;
                    }
                    this.f9580x.b(i12, this.N0.d, arrayList2);
                }
            }
        } else if (i7 == qs.f25086v5) {
            l9 l9Var = this.f9572t0;
            if (l9Var instanceof h7) {
                h7 h7Var = (h7) l9Var;
                if (h7Var.f9092r && !h7Var.f9091n) {
                    y6 P1 = qp.s1(this.h).P1();
                    if (h7Var.f9090f) {
                        arrayList = P1.h;
                    } else {
                        arrayList = P1.f9968g;
                    }
                    ArrayList<Long> dialogIds = this.f9559n0.getDialogIds();
                    boolean z9 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!h7Var.h || P1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                            dialogIds.add(Long.valueOf(o4));
                            z9 = true;
                        }
                    }
                    if (z9) {
                        this.f9559n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            s5 s5Var2 = this.f9580x;
            if (s5Var2 != null) {
                ArrayList arrayList3 = s5Var2.h.G;
                while (i11 < arrayList3.size()) {
                    ((n4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = qs.f24971c1;
            if (i7 != i14 && i7 != qs.f24977d1) {
                if (i7 == qs.f25093w5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.S0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f27192id == intValue) {
                        this.R0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            V();
            if (i7 == i14) {
                o9 o9Var = this.f9584z0;
                if (o9Var != null) {
                    this.f9571s1 = o9Var.currentPosition;
                    this.f9584z0.release(null);
                    this.f9584z0 = null;
                    return;
                }
                this.f9571s1 = 0L;
            } else if (!this.f9568r1 && z() != null) {
                z().d1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        u(true);
    }

    @Override
    public final int e(int i7) {
        return i0.a.f((((1.0f - this.V) * 0.5f) + 0.5f) * this.U, i7, -16777216);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void h(int i7) {
        if (this.f9562p0 != i7) {
            this.f9562p0 = i7;
            this.f9559n0.setKeyboardHeight(i7);
            this.f9559n0.requestLayout();
            s5 s5Var = this.f9580x;
            if (s5Var != null) {
                s5Var.setKeyboardHeight(i7);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.J0;
    }

    @Override
    public final hc k() {
        return null;
    }

    public final void l(boolean z9) {
        boolean z10;
        boolean z11 = org.telegram.messenger.r2.f25199a;
        if (this.m0 && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f9540e != z10) {
            this.f9540e = z10;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z10);
            }
            fi.s3 s3Var = this.D0;
            if (s3Var != null) {
                s3Var.setSecure(!z10);
            }
            if (this.f9532b) {
                org.telegram.ui.ActionBar.f2 f2Var = this.f9543f;
                if (f2Var.getParentActivity() != null) {
                    if (z10) {
                        f2Var.getParentActivity().getWindow().clearFlags(8192);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                    f2Var.getParentActivity().getWindow().addFlags(8192);
                    org.telegram.messenger.g0.h2();
                    return;
                }
                return;
            }
            if (z10) {
                this.f9566r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.f9566r.flags |= 8192;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.f9558n.updateViewLayout(this.f9569s, this.f9566r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f9552j0 = false;
            this.f9556l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 2));
            this.H.addListener(new y8(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.i1.f27541w);
            this.H.start();
        }
    }

    public final void o(boolean z9) {
        if (this.f9575u1 == null) {
            if (this.f9562p0 != 0) {
                org.telegram.messenger.g0.v1(this.f9580x);
                return;
            }
            float f10 = 0.0f;
            if (!this.f9536c0 && this.f9541e0 == 0.0f) {
                return;
            }
            this.I0.d();
            if (!z9) {
                float f11 = this.f9541e0;
                s5 s5Var = this.f9580x;
                float f12 = s5Var.f9757c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f9541e0 = f13;
                    s5Var.setOffset(f13);
                }
            }
            float f14 = this.f9541e0;
            if (z9) {
                f10 = this.f9580x.f9757c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f9575u1 = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 3));
            this.f9575u1.addListener(new ch.y(3, this, z9));
            if (z9) {
                this.f9575u1.setDuration(350L);
                this.f9575u1.setInterpolator(xq.h);
            } else {
                this.f9575u1.setDuration(350L);
                this.f9575u1.setInterpolator(xq.f40345f);
            }
            this.f9575u1.start();
        }
    }

    @Override
    public final void p() {
        i4 currentPeerView;
        boolean z9 = false;
        if (this.f9541e0 != 0.0f) {
            s5 s5Var = this.f9580x;
            if (s5Var.f9765y > 0) {
                org.telegram.messenger.g0.v1(s5Var);
                return;
            }
            k5 currentPage = s5Var.getCurrentPage();
            if (currentPage != null) {
                r4 r4Var = currentPage.f9305r;
                z4 z4Var = currentPage.f9303f;
                if (z4Var != null && z4Var.f17102a) {
                    z4Var.a();
                    return;
                } else if (Math.abs(currentPage.f9301c.getTranslationY() - r4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                    r4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                    r4Var.y0(0);
                    return;
                }
            }
            o(false);
            return;
        }
        f9 f9Var = this.f9559n0;
        if (f9Var != null && (currentPeerView = f9Var.getCurrentPeerView()) != null) {
            z9 = currentPeerView.q0();
        }
        if (z9) {
            return;
        }
        u(true);
    }

    public final void q() {
        LaunchActivity launchActivity;
        if (this.f9532b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void r() {
        if (this.f9580x == null) {
            s5 s5Var = new s5(this.f9578w.getContext(), this);
            this.f9580x = s5Var;
            this.f9578w.addView(s5Var, 0);
        }
        i4 currentPeerView = this.f9559n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.N0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.N0.f9643i.size(); i7++) {
                    arrayList.add(((ij) this.N0.f9643i.get(i7)).f23248l);
                }
                this.f9580x.b(currentPeerView.getListPosition(), this.N0.d, arrayList);
                return;
            }
            this.f9580x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    @Override
    public final boolean s() {
        return !this.G0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f9574u0 = dialog;
            dialog.setOnDismissListener(new eb(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.f9574u0 = null;
            return false;
        }
    }

    public final void u(boolean z9) {
        org.telegram.messenger.g0.v1(this.f9569s);
        this.G0 = true;
        this.f9547g1 = true;
        V();
        S(false);
        W();
        this.I0.d();
        this.f9533b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x8(this, 0));
        if (!z9) {
            this.O = 0.0f;
            this.N = 0.0f;
            m9 m9Var = this.f9570s0;
            ImageReceiver imageReceiver = m9Var.f9363b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = m9Var.f9364c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            m9Var.f9364c = null;
            m9Var.f9363b = null;
        } else {
            E();
        }
        org.telegram.messenger.g0.i3(new l3(this, 2), 16L);
        if (this.f9534b1) {
            this.f9534b1 = false;
        }
    }

    public final void v() {
        i4 i4Var;
        f9 f9Var = this.f9559n0;
        if (f9Var != null) {
            ArrayList arrayList = f9Var.P0;
            for (int i7 = 0; i7 < f9Var.getChildCount(); i7++) {
                View childAt = f9Var.getChildAt(i7);
                if ((childAt instanceof w7) && (i4Var = ((w7) childAt).f9910a) != null && !i4Var.E3) {
                    i4Var.E3 = true;
                    o2 o2Var = i4Var.K1;
                    if (o2Var != null) {
                        o2Var.B0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                i4 i4Var2 = (i4) arrayList.get(i10);
                if (!i4Var2.E3) {
                    i4Var2.E3 = true;
                    o2 o2Var2 = i4Var2.K1;
                    if (o2Var2 != null) {
                        o2Var2.B0();
                    }
                }
            }
        }
    }

    public final void w(KeyEvent keyEvent) {
        if (C1) {
            U();
            return;
        }
        i4 currentPeerView = this.f9559n0.getCurrentPeerView();
        if (currentPeerView != null) {
            g4 g4Var = currentPeerView.f9213x1;
            if (!g4Var.j() && g4Var.f9041e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f9537c1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.f9581x0.add(runnable);
        }
    }

    @Override
    public final boolean y() {
        if (this.f9532b && this.f9569s != null) {
            return true;
        }
        return false;
    }

    public final i4 z() {
        f9 f9Var = this.f9559n0;
        if (f9Var == null) {
            return null;
        }
        return f9Var.getCurrentPeerView();
    }

    @Override
    public final void b(boolean z9) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
