package fi;

import a8.sa;
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
import c8.ja;
import c8.zc;
import di.ub;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.LaunchActivity;
public final class i9 implements is, org.telegram.ui.ActionBar.a2 {
    public static boolean A1;
    public static boolean D1;
    public static boolean f11827x1;
    public static TL_stories.StoryItem f11829z1;
    public h9 A0;
    public e1 B0;
    public a9 C0;
    public SurfaceView D0;
    public hi.r3 E0;
    public boolean F;
    public Uri F0;
    public ValueAnimator G;
    public a4 G0;
    public ValueAnimator H;
    public boolean H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public final h2.f J0;
    public int K;
    public boolean K0;
    public float L;
    public boolean L0;
    public float M;
    public final ArrayList M0;
    public y6 N;
    public boolean N0;
    public float O;
    public k6 O0;
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
    public float f11831a0;
    public boolean f11832a1;
    public boolean f11834b0;
    public final g3 f11835b1;
    public float f11837c0;
    public boolean f11838c1;
    public boolean f11839d0;
    public r7 f11840d1;
    public float f11842e0;
    public final LongSparseIntArray f11843e1;
    public final org.telegram.ui.ActionBar.e2 f11844f;
    public float f11845f0;
    public boolean f11846f1;
    public boolean f11847g0;
    public boolean f11848g1;
    public int h;
    public boolean f11849h0;
    public boolean f11850h1;
    public boolean f11851i0;
    public boolean f11852i1;
    public GestureDetector f11853j0;
    public boolean f11854j1;
    public boolean f11855k0;
    public boolean f11856k1;
    public boolean f11857l0;
    public boolean l1;
    public boolean m0;
    public boolean f11858m1;
    public WindowManager f11859n;
    public boolean f11860n0;
    public c1 n1;
    public y8 f11861o0;
    public g3 f11862o1;
    public boolean f11864p1;
    public int f11865q0;
    public float f11866q1;
    public WindowManager.LayoutParams f11867r;
    public boolean f11868r0;
    public boolean f11869r1;
    public w8 f11870s;
    public float f11871s0;
    public boolean f11872s1;
    public final f9 f11873t0;
    public long f11874t1;
    public e9 f11875u0;
    public w6 f11876u1;
    public Dialog f11877v0;
    public ValueAnimator f11878v1;
    public x8 f11879w;
    public org.telegram.ui.ActionBar.a2 f11880w0;
    public boolean f11881w1;
    public k5 f11882x;
    public boolean f11883x0;
    public boolean f11884y;
    public final ArrayList f11885y0;
    public org.telegram.ui.j4 f11886z0;
    public static final ArrayList f11828y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f11830a = gz.f23933b0;
    public boolean f11833b = true;
    public boolean f11836c = false;
    public boolean d = false;
    public boolean f11841e = true;
    public final b E = new b();
    public final RectF U = new RectF();
    public final float[] f11863p0 = new float[2];

    public i9(org.telegram.ui.ActionBar.e2 e2Var) {
        ?? obj = new Object();
        obj.f11718k = 1.0f;
        this.f11873t0 = obj;
        this.f11885y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new h2.f((int[]) null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f11835b1 = new g3(this, 4);
        this.f11843e1 = new LongSparseIntArray();
        new Paint(1);
        this.f11844f = e2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f28290id << 16), "");
    }

    public static boolean D(gj gjVar) {
        if (f11829z1 == null || ((gjVar.D != 23 && !gjVar.Z4()) || A1 || f11829z1.messageId != gjVar.e1() || f11829z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f28290id << 16), editable);
        }
    }

    public static boolean c(i9 i9Var, w8 w8Var, float f10, float f11, boolean z10) {
        k2 k2Var;
        k2 k2Var2;
        if (w8Var != null) {
            if (!i9Var.X0) {
                if (i9Var.f11882x == null || i9Var.f11845f0 == 0.0f) {
                    b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f10 - i9Var.f11879w.getX()) - i9Var.f11861o0.getX()) - currentPeerView.getX(), ((f11 - i9Var.f11879w.getY()) - i9Var.f11861o0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f11472f2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (k2Var2 = currentPeerView.L1) != null && k2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.L1.getY() + currentPeerView.getY() + i9Var.f11861o0.getY() + i9Var.f11879w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (k2Var = currentPeerView.L1) != null && k2Var.J0()) || i9Var.f11876u1 != null) {
                        return true;
                    }
                    return org.telegram.messenger.g0.Y(w8Var, f10, f11, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void g(i9 i9Var) {
        ub ubVar;
        ft editField;
        b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.L1 != null && (((ubVar = currentPeerView.L2) == null || ubVar.getVisibility() != 0) && (editField = currentPeerView.L1.getEditField()) != null)) {
            editField.requestFocus();
            org.telegram.messenger.g0.J3(editField);
            org.telegram.messenger.g0.i3(new g3(i9Var, 6), 200L);
            return;
        }
        i9Var.m();
    }

    public static void i(i9 i9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(i9Var.Y, i9Var.X) / org.telegram.messenger.g0.L(80.0f)));
        if (i9Var.W != l10) {
            i9Var.W = l10;
            i9Var.q();
            b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f11480h2) {
                currentPeerView.invalidate();
            }
            e1 e1Var = i9Var.B0;
            if (e1Var != null) {
                e1Var.v((1.0f - i9Var.W) * i9Var.V);
            }
        }
        w8 w8Var = i9Var.f11870s;
        if (w8Var != null) {
            w8Var.invalidate();
        }
    }

    public final void B() {
        if (this.f11860n0) {
            org.telegram.messenger.g0.v1(this.f11870s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            V();
            this.P = 0.0f;
            this.O = 0.0f;
            f9 f9Var = this.f11873t0;
            ImageReceiver imageReceiver = f9Var.f11711b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f11712c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            f9Var.f11712c = null;
            f9Var.f11711b = null;
            x8 x8Var = this.f11879w;
            if (x8Var != null) {
                x8Var.a(true);
            }
            this.J0.e();
            a4 a4Var = this.G0;
            if (a4Var != null) {
                a4Var.b();
            }
            O();
            if (this.f11833b) {
                org.telegram.messenger.g0.E2(this.f11870s);
            } else {
                this.f11859n.removeView(this.f11870s);
            }
            this.f11870s = null;
            v();
            this.f11860n0 = false;
            this.d = false;
            q();
            g3 g3Var = this.f11862o1;
            if (g3Var != null) {
                g3Var.run();
                this.f11862o1 = null;
            }
        }
    }

    public final boolean C() {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f11868r0 && !this.f11884y && this.f11877v0 == null && this.f11880w0 == null && !this.H0 && !this.I0 && this.V == 1.0f && this.f11845f0 == 0.0f && !this.f11852i1) {
            if ((!this.l1 || !this.f11830a) && !this.f11856k1 && !this.f11854j1 && !this.f11864p1 && this.W == 0.0f && this.f11876u1 == null) {
                if (!this.f11833b || (e2Var = this.f11844f) == null || e2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        throw new UnsupportedOperationException("Method not decompiled: fi.i9.E():void");
    }

    public final void F(boolean z10) {
        int i7;
        Activity W = org.telegram.messenger.g0.W(this.f11844f.getContext());
        if (W != null) {
            if (z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            try {
                W.setRequestedOrientation(i7);
            } catch (Exception unused) {
            }
            if (z10) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, e9 e9Var) {
        if (storyItem != null) {
            this.h = i7;
            if (storyItem.dialogId <= 0 || np.s1(i7).a2(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && np.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, e9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E12 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.f11885y0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (this.f11860n0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        h9 h9Var = this.A0;
        if (h9Var != null) {
            h9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!org.telegram.messenger.g0.Q1() && !this.f11869r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11833b = z11;
        if (gz.f23933b0 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f11830a = z12;
        if (storyItem == null) {
            i11 = 0;
        } else {
            i11 = storyItem.messageId;
        }
        this.U0 = i11;
        if (storyItem != null && k6Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f11829z1 = storyItem;
        }
        this.O0 = k6Var;
        this.Q0 = peerStories;
        this.f11875u0 = e9Var;
        this.R0 = z10;
        this.h = i7;
        this.X = 0.0f;
        this.Y = 0.0f;
        y8 y8Var = this.f11861o0;
        if (y8Var != null) {
            y8Var.setHorizontalProgressToDismiss(0.0f);
            this.f11861o0.G0 = 0;
        }
        this.f11842e0 = 0.0f;
        this.f11831a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.f11860n0 = true;
        this.f11832a1 = false;
        this.Z0 = false;
        this.f11843e1.clear();
        org.telegram.messenger.g0.r(this.f11835b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f11867r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.f11867r.flags = -2147417728;
        this.H0 = false;
        this.f11838c1 = false;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (this.f11870s == null) {
            this.f11853j0 = new GestureDetector(new s8(this));
            this.f11870s = new w8(this, context, Q);
        }
        if (this.f11879w == null) {
            this.f11879w = new x8(context, this);
            y8 y8Var2 = new y8(this, this.h, context, this, this.E);
            this.f11861o0 = y8Var2;
            y8Var2.setDelegate(new z8(this, k6Var, arrayList, context));
            this.f11879w.addView(this.f11861o0, ja.e(-1, -1, 1));
            this.f11886z0 = new org.telegram.ui.j4(context);
            if (this.f11830a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.f11886z0.addView(this.D0);
            } else {
                a9 a9Var = new a9(context, this);
                this.C0 = a9Var;
                this.f11886z0.addView(a9Var);
            }
            hi.r3 r3Var = new hi.r3(context, this.h);
            this.E0 = r3Var;
            r3Var.setVisibility(8);
            this.f11886z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f12283a = paint;
            view.f12285c = new sa(view, 26);
            view.d = new org.telegram.ui.Components.u5((View) view);
            view.f12286e = new org.telegram.ui.Components.u5((View) view);
            paint.setColor(-1);
            this.f11840d1 = view;
            this.f11879w.addView((View) view, ja.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        hi.r3 r3Var2 = this.E0;
        if (r3Var2 != null) {
            r3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.f11886z0);
        this.f11870s.addView(this.f11886z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.f11879w);
        this.f11870s.addView(this.f11879w);
        this.f11870s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        if (k6Var != null) {
            this.f11861o0.D(this.h, k6Var.d, k6Var.h());
        } else {
            y8 y8Var3 = this.f11861o0;
            int i12 = this.h;
            y8Var3.B0 = arrayList;
            y8Var3.f12234z0 = i12;
            y8Var3.setAdapter(null);
            y8Var3.setAdapter(y8Var3.A0);
            y8Var3.setCurrentItem(i10);
            y8Var3.D0 = true;
        }
        this.f11859n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f11833b = false;
        }
        if (this.f11833b && Q != null && Q.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f11836c = z14;
        x8 x8Var = this.f11879w;
        di.z6 z6Var = new di.z6(this, 11);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(x8Var, z6Var);
        if (this.f11833b) {
            org.telegram.messenger.g0.E2(this.f11870s);
            this.f11870s.setTag(2131296647, new Object());
            Q.getLayoutContainer().addView(this.f11870s);
            if (!this.f11836c) {
                org.telegram.messenger.g0.a3(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f11870s.setFocusable(false);
            this.f11879w.setFocusable(false);
            this.f11879w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.x3(this.f11859n, this.f11870s, this.f11867r);
            this.f11859n.addView(this.f11870s, this.f11867r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f11870s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f11870s.requestLayout();
        A1 = true;
        W();
        this.V = 0.0f;
        q();
        f11827x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f11870s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f11833b) {
            F(true);
        }
        if (!this.f11833b) {
            f11828y1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, k6 k6Var, b7 b7Var) {
        this.h = m10.f24934t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(k6Var.d));
        this.P0 = i7;
        M(context, null, arrayList, 0, k6Var, null, b7Var, false);
    }

    public final void J(Context context, long j3, e9 e9Var) {
        this.h = m10.f24934t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        s6 P1 = np.s1(this.h).P1();
        int i7 = P1.f12319a;
        TL_stories.PeerStories y10 = P1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (l7.w(i7, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !P1.L(j3)) {
                P1.f12324g.remove(y10);
                P1.h.remove(y10);
                ns.f(i7).k(ns.f25591v5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, e9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, e9 e9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = m10.f24934t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
            M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, e9Var, false);
            return;
        }
        this.f11885y0.clear();
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, b7 b7Var) {
        G(m10.f24934t0, context, storyItem, b7Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, k6 k6Var, TL_stories.PeerStories peerStories, e9 e9Var, boolean z10) {
        H(m10.f24934t0, context, storyItem, arrayList, i7, k6Var, peerStories, e9Var, z10);
    }

    public final void N(org.telegram.ui.ActionBar.e2 e2Var) {
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f11833b) {
            Q.presentFragment(e2Var);
            return;
        }
        Q.presentFragment(e2Var);
        u(false);
    }

    public final void O() {
        ArrayList arrayList;
        this.F0 = null;
        Q(false);
        l(true);
        h9 h9Var = this.A0;
        if (h9Var != null) {
            h9Var.release(null);
            this.A0 = null;
        }
        hi.r3 r3Var = this.E0;
        if (r3Var != null) {
            r3Var.b(0L, null);
        }
        e1 e1Var = this.B0;
        if (e1Var != null && !g1.e(e1Var)) {
            e1 e1Var2 = this.B0;
            if (e1Var2.f11658n) {
                e1Var2.s(null);
            } else {
                e1Var2.e();
            }
        }
        this.B0 = null;
        g1 g1Var = g1.f11723w;
        if (g1Var != null && g1Var.f11726c == this) {
            g1Var.f11726c = null;
            c1 c1Var = g1Var.f11729n;
            LaunchActivity launchActivity = g1Var.f11730r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.f42623a1.remove(c1Var);
                }
                g1Var.f11730r = null;
            }
            wi.n nVar = g1Var.f11724a;
            if (nVar != null && nVar.d()) {
                wi.n nVar2 = g1Var.f11724a;
                if (nVar2.f59424c == 0) {
                    g1Var.f11724a = null;
                    g1Var.f11725b = null;
                    nVar2.f();
                }
            }
        }
        int i7 = 0;
        while (true) {
            arrayList = this.M0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = np.s1(this.h).P1().f12329m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((r9) hVar.n(i10)).b(false);
        }
        if (this.f11833b) {
            F(false);
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f11844f;
        if (e2Var != null) {
            e2Var.removeSheet(this);
        }
        f11828y1.remove(this);
        this.f11885y0.clear();
        this.f11845f0 = 0.0f;
        f11829z1 = null;
    }

    public final void Q(boolean z10) {
        this.f11868r0 = z10;
        if (z10) {
            sa saVar = this.f11840d1.f12285c;
            org.telegram.messenger.g0.r(saVar);
            saVar.run();
        }
        V();
    }

    public final void R(boolean z10) {
        b4 currentPeerView;
        b4 currentPeerView2;
        z3 z3Var;
        h9 h9Var;
        a4 a4Var;
        if (this.f11832a1 != z10) {
            this.f11832a1 = z10;
            if (z10 && !this.f11846f1 && (currentPeerView2 = this.f11861o0.getCurrentPeerView()) != null && (z3Var = currentPeerView2.f11543y1) != null && !z3Var.f12583f && z3Var.f12580b == null) {
                if (!this.f11857l0 && !this.f11855k0 && (a4Var = this.G0) != null && ((h9) a4Var.f11407c) != null) {
                    currentPeerView2.M0.invalidate();
                    org.telegram.messenger.p2.IMPACT_LIGHT.a();
                }
                a4 a4Var2 = this.G0;
                if (a4Var2 != null && (h9Var = (h9) a4Var2.f11407c) != null && !this.f11857l0) {
                    h9Var.setSeeking(true);
                }
                this.f11857l0 = true;
            }
            V();
            y8 y8Var = this.f11861o0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f11832a1);
            }
        }
    }

    public final void S(boolean z10) {
        boolean z11;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (this.f11833b && launchActivity != null) {
            if (z10) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.g0.f23581a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z11 = zc.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z11 = false;
                }
                this.f11883x0 = z11;
            }
            if (this.f11883x0) {
                org.telegram.messenger.g0.m3(launchActivity, !z10);
            }
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: fi.i9.T():void");
    }

    public final void U() {
        boolean z10 = D1;
        D1 = !z10;
        h9 h9Var = this.A0;
        int i7 = 0;
        if (h9Var != null) {
            h9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((h9) arrayList.get(i7)).setAudioEnabled(!D1, true);
            i7++;
        }
        b4 currentPeerView = this.f11861o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f11479h1.a(D1, true);
        }
        if (!D1) {
            this.f11840d1.b();
        }
    }

    public final void V() {
        if (this.f11861o0 == null) {
            return;
        }
        boolean C = C();
        boolean z10 = true;
        if (this.f11833b) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f11844f;
            if (e2Var.isPaused() || !e2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().W) {
            C = true;
        }
        this.f11861o0.setPaused(C);
        h9 h9Var = this.A0;
        if (h9Var != null) {
            if (C) {
                h9Var.pause();
            } else {
                h9Var.play(B1);
            }
        }
        this.f11861o0.E0 = (this.f11884y || this.H0 || this.I0 || this.f11832a1 || this.f11846f1 || this.f11845f0 != 0.0f || this.f11854j1) ? false : false;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: fi.i9.W():void");
    }

    @Override
    public final void a(boolean z10) {
        u(true);
    }

    @Override
    public final View d() {
        return this.f11870s;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == ns.f25605x5) {
            if (this.O0 == ((k6) objArr[0])) {
                z();
                y8 y8Var = this.f11861o0;
                k6 k6Var = this.O0;
                y8Var.D(this.h, k6Var.d, k6Var.h());
                k5 k5Var = this.f11882x;
                if (k5Var != null) {
                    TL_stories.StoryItem selectedStory = k5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.O0.f11944i.size()) {
                        if (selectedStory != null && selectedStory.f28290id == ((gj) this.O0.f11944i.get(i11)).f23822l.f28290id) {
                            i12 = i11;
                        }
                        arrayList2.add(((gj) this.O0.f11944i.get(i11)).f23822l);
                        i11++;
                    }
                    this.f11882x.b(i12, this.O0.d, arrayList2);
                }
            }
        } else if (i7 == ns.f25591v5) {
            e9 e9Var = this.f11875u0;
            if (e9Var instanceof b7) {
                b7 b7Var = (b7) e9Var;
                if (b7Var.f11574r && !b7Var.f11573n) {
                    s6 P1 = np.s1(this.h).P1();
                    if (b7Var.f11572f) {
                        arrayList = P1.h;
                    } else {
                        arrayList = P1.f12324g;
                    }
                    ArrayList<Long> dialogIds = this.f11861o0.getDialogIds();
                    boolean z10 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!b7Var.h || P1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                            dialogIds.add(Long.valueOf(o4));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f11861o0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            k5 k5Var2 = this.f11882x;
            if (k5Var2 != null) {
                ArrayList arrayList3 = k5Var2.h.H;
                while (i11 < arrayList3.size()) {
                    ((g4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = ns.f25476c1;
            if (i7 != i14 && i7 != ns.f25482d1) {
                if (i7 == ns.f25598w5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f28290id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            V();
            if (i7 == i14) {
                h9 h9Var = this.A0;
                if (h9Var != null) {
                    this.f11874t1 = h9Var.currentPosition;
                    this.A0.release(null);
                    this.A0 = null;
                    return;
                }
                this.f11874t1 = 0L;
            } else if (!this.f11872s1 && z() != null) {
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
        return i0.a.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i7, -16777216);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void h(int i7) {
        if (this.f11865q0 != i7) {
            this.f11865q0 = i7;
            this.f11861o0.setKeyboardHeight(i7);
            this.f11861o0.requestLayout();
            k5 k5Var = this.f11882x;
            if (k5Var != null) {
                k5Var.setKeyboardHeight(i7);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.K0;
    }

    @Override
    public final cc k() {
        return null;
    }

    public final void l(boolean z10) {
        boolean z11;
        boolean z12 = org.telegram.messenger.r2.f26198a;
        if (this.f11860n0 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f11841e != z11) {
            this.f11841e = z11;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            hi.r3 r3Var = this.E0;
            if (r3Var != null) {
                r3Var.setSecure(!z11);
            }
            if (this.f11833b) {
                org.telegram.ui.ActionBar.e2 e2Var = this.f11844f;
                if (e2Var.getParentActivity() != null) {
                    if (z11) {
                        e2Var.getParentActivity().getWindow().clearFlags(8192);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                    e2Var.getParentActivity().getWindow().addFlags(8192);
                    org.telegram.messenger.g0.h2();
                    return;
                }
                return;
            }
            if (z11) {
                this.f11867r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.f11867r.flags |= 8192;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.f11859n.updateViewLayout(this.f11870s, this.f11867r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        if (this.I == null) {
            this.f11855k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11831a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 2));
            this.I.addListener(new r8(this, 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
            this.I.start();
        }
    }

    public final void o(boolean z10) {
        if (this.f11878v1 == null) {
            if (this.f11865q0 != 0) {
                org.telegram.messenger.g0.v1(this.f11882x);
                return;
            }
            float f10 = 0.0f;
            if (!this.f11839d0 && this.f11845f0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z10) {
                float f11 = this.f11845f0;
                k5 k5Var = this.f11882x;
                float f12 = k5Var.f11929c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f11845f0 = f13;
                    k5Var.setOffset(f13);
                }
            }
            float f14 = this.f11845f0;
            if (z10) {
                f10 = this.f11882x.f11929c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f11878v1 = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 3));
            this.f11878v1.addListener(new bi.v4(4, this, z10));
            if (z10) {
                this.f11878v1.setDuration(350L);
                this.f11878v1.setInterpolator(er.h);
            } else {
                this.f11878v1.setDuration(350L);
                this.f11878v1.setInterpolator(er.f34420f);
            }
            this.f11878v1.start();
        }
    }

    @Override
    public final void p() {
        b4 currentPeerView;
        boolean z10 = false;
        if (this.f11845f0 != 0.0f) {
            k5 k5Var = this.f11882x;
            if (k5Var.f11937y > 0) {
                org.telegram.messenger.g0.v1(k5Var);
                return;
            }
            c5 currentPage = k5Var.getCurrentPage();
            if (currentPage != null) {
                j4 j4Var = currentPage.f11603r;
                r4 r4Var = currentPage.f11601f;
                if (r4Var != null && r4Var.f17663a) {
                    r4Var.a();
                    return;
                } else if (Math.abs(currentPage.f11599c.getTranslationY() - j4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                    j4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                    j4Var.y0(0);
                    return;
                }
            }
            o(false);
            return;
        }
        y8 y8Var = this.f11861o0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.q0();
        }
        if (z10) {
            return;
        }
        u(true);
    }

    public final void q() {
        LaunchActivity launchActivity;
        if (this.f11833b && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void r() {
        if (this.f11882x == null) {
            k5 k5Var = new k5(this.f11879w.getContext(), this);
            this.f11882x = k5Var;
            this.f11879w.addView(k5Var, 0);
        }
        b4 currentPeerView = this.f11861o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.O0.f11944i.size(); i7++) {
                    arrayList.add(((gj) this.O0.f11944i.get(i7)).f23822l);
                }
                this.f11882x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f11882x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    @Override
    public final boolean s() {
        return !this.H0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f11877v0 = dialog;
            dialog.setOnDismissListener(new di.r9(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.f11877v0 = null;
            return false;
        }
    }

    public final void u(boolean z10) {
        org.telegram.messenger.g0.v1(this.f11870s);
        this.H0 = true;
        this.f11850h1 = true;
        V();
        S(false);
        W();
        this.J0.d();
        this.f11837c0 = this.X;
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new q8(this, 0));
        if (!z10) {
            this.P = 0.0f;
            this.O = 0.0f;
            f9 f9Var = this.f11873t0;
            ImageReceiver imageReceiver = f9Var.f11711b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = f9Var.f11712c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            f9Var.f11712c = null;
            f9Var.f11711b = null;
        } else {
            E();
        }
        org.telegram.messenger.g0.i3(new g3(this, 2), 16L);
        if (this.f11838c1) {
            this.f11838c1 = false;
        }
    }

    public final void v() {
        b4 b4Var;
        y8 y8Var = this.f11861o0;
        if (y8Var != null) {
            ArrayList arrayList = y8Var.Q0;
            for (int i7 = 0; i7 < y8Var.getChildCount(); i7++) {
                View childAt = y8Var.getChildAt(i7);
                if ((childAt instanceof p7) && (b4Var = ((p7) childAt).f12179a) != null && !b4Var.F3) {
                    b4Var.F3 = true;
                    k2 k2Var = b4Var.L1;
                    if (k2Var != null) {
                        k2Var.Q0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                b4 b4Var2 = (b4) arrayList.get(i10);
                if (!b4Var2.F3) {
                    b4Var2.F3 = true;
                    k2 k2Var2 = b4Var2.L1;
                    if (k2Var2 != null) {
                        k2Var2.Q0();
                    }
                }
            }
        }
    }

    public final void w(KeyEvent keyEvent) {
        if (D1) {
            U();
            return;
        }
        b4 currentPeerView = this.f11861o0.getCurrentPeerView();
        if (currentPeerView != null) {
            z3 z3Var = currentPeerView.f11543y1;
            if (!z3Var.j() && z3Var.f12582e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f11840d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.f11885y0.add(runnable);
        }
    }

    @Override
    public final boolean y() {
        if (this.f11833b && this.f11870s != null) {
            return true;
        }
        return false;
    }

    public final b4 z() {
        y8 y8Var = this.f11861o0;
        if (y8Var == null) {
            return null;
        }
        return y8Var.getCurrentPeerView();
    }

    @Override
    public final void b(boolean z10) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
