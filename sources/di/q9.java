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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
public final class q9 implements ls, org.telegram.ui.ActionBar.b2 {
    public static boolean C1;
    public static boolean f9595w1;
    public static TL_stories.StoryItem f9597y1;
    public static boolean f9598z1;
    public g1 A0;
    public i9 B0;
    public SurfaceView C0;
    public fi.s3 D0;
    public boolean E;
    public Uri E0;
    public ValueAnimator F;
    public i4 F0;
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
    public f7 M;
    public boolean M0;
    public float N;
    public r6 N0;
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
    public boolean f9600a0;
    public final l3 f9601a1;
    public float f9603b0;
    public boolean f9604b1;
    public boolean f9606c0;
    public y7 f9607c1;
    public float f9608d0;
    public final LongSparseIntArray f9609d1;
    public float f9611e0;
    public boolean f9612e1;
    public final org.telegram.ui.ActionBar.f2 f9613f;
    public boolean f9614f0;
    public boolean f9615f1;
    public boolean f9616g0;
    public boolean f9617g1;
    public int h;
    public boolean f9618h0;
    public boolean f9619h1;
    public GestureDetector f9620i0;
    public boolean f9621i1;
    public boolean f9622j0;
    public boolean f9623j1;
    public boolean f9624k0;
    public boolean f9625k1;
    public boolean f9626l0;
    public boolean l1;
    public boolean m0;
    public f8 f9627m1;
    public WindowManager f9628n;
    public g9 f9629n0;
    public l3 n1;
    public boolean f9631o1;
    public int f9632p0;
    public float f9633p1;
    public boolean f9634q0;
    public boolean f9635q1;
    public WindowManager.LayoutParams f9636r;
    public float f9637r0;
    public boolean f9638r1;
    public e9 f9639s;
    public final n9 f9640s0;
    public long f9641s1;
    public m9 f9642t0;
    public d7 f9643t1;
    public Dialog f9644u0;
    public ValueAnimator f9645u1;
    public org.telegram.ui.ActionBar.b2 f9646v0;
    public boolean f9647v1;
    public f9 f9648w;
    public boolean f9649w0;
    public t5 f9650x;
    public final ArrayList f9651x0;
    public boolean f9652y;
    public org.telegram.ui.j4 f9653y0;
    public p9 f9654z0;
    public static final ArrayList f9596x1 = new ArrayList();
    public static float A1 = 1.0f;
    public static boolean B1 = true;
    public static final LongSparseArray D1 = new LongSparseArray();
    public boolean f9599a = iz.f23393b0;
    public boolean f9602b = true;
    public boolean f9605c = false;
    public boolean d = false;
    public boolean f9610e = true;
    public final b D = new b();
    public final RectF T = new RectF();
    public final float[] f9630o0 = new float[2];

    public q9(org.telegram.ui.ActionBar.f2 f2Var) {
        ?? obj = new Object();
        obj.f9416k = 1.0f;
        this.f9640s0 = obj;
        this.f9651x0 = new ArrayList();
        this.G0 = true;
        this.I0 = new h2.f((int[]) null);
        this.L0 = new ArrayList();
        this.Y0 = false;
        this.f9601a1 = new l3(this, 4);
        this.f9609d1 = new LongSparseIntArray();
        new Paint(1);
        this.f9613f = f2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) D1.get(j3 + (j3 >> 16) + (storyItem.f27199id << 16), "");
    }

    public static boolean D(ij ijVar) {
        if (f9597y1 == null || ((ijVar.D != 23 && !ijVar.Z4()) || f9598z1 || f9597y1.messageId != ijVar.e1() || f9597y1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            D1.put(j3 + (j3 >> 16) + (storyItem.f27199id << 16), editable);
        }
    }

    public static boolean c(q9 q9Var, e9 e9Var, float f10, float f11, boolean z9) {
        o2 o2Var;
        o2 o2Var2;
        if (e9Var != null) {
            if (!q9Var.W0) {
                if (q9Var.f9650x == null || q9Var.f9611e0 == 0.0f) {
                    j4 currentPeerView = q9Var.f9629n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f10 - q9Var.f9648w.getX()) - q9Var.f9629n0.getX()) - currentPeerView.getX(), ((f11 - q9Var.f9648w.getY()) - q9Var.f9629n0.getY()) - currentPeerView.getY(), z9)) {
                            if (currentPeerView.f9179e2) {
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
                        if (f11 > currentPeerView.K1.getY() + currentPeerView.getY() + q9Var.f9629n0.getY() + q9Var.f9648w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (o2Var = currentPeerView.K1) != null && o2Var.v0()) || q9Var.f9643t1 != null) {
                        return true;
                    }
                    return org.telegram.messenger.g0.Y(e9Var, f10, f11, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void g(q9 q9Var) {
        md mdVar;
        ys editField;
        j4 currentPeerView = q9Var.f9629n0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.K1 != null && (((mdVar = currentPeerView.K2) == null || mdVar.getVisibility() != 0) && (editField = currentPeerView.K1.getEditField()) != null)) {
            editField.requestFocus();
            org.telegram.messenger.g0.K3(editField);
            org.telegram.messenger.g0.i3(new l3(q9Var, 6), 200L);
            return;
        }
        q9Var.m();
    }

    public static void i(q9 q9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(q9Var.X, q9Var.W) / org.telegram.messenger.g0.L(80.0f)));
        if (q9Var.V != l10) {
            q9Var.V = l10;
            q9Var.q();
            j4 currentPeerView = q9Var.f9629n0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f9187g2) {
                currentPeerView.invalidate();
            }
            g1 g1Var = q9Var.A0;
            if (g1Var != null) {
                g1Var.v((1.0f - q9Var.V) * q9Var.U);
            }
        }
        e9 e9Var = q9Var.f9639s;
        if (e9Var != null) {
            e9Var.invalidate();
        }
    }

    public final void B() {
        if (this.m0) {
            org.telegram.messenger.g0.v1(this.f9639s);
            this.G0 = true;
            this.J0 = false;
            this.U = 0.0f;
            this.V = 0.0f;
            V();
            this.O = 0.0f;
            this.N = 0.0f;
            n9 n9Var = this.f9640s0;
            ImageReceiver imageReceiver = n9Var.f9409b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = n9Var.f9410c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            n9Var.f9410c = null;
            n9Var.f9409b = null;
            f9 f9Var = this.f9648w;
            if (f9Var != null) {
                f9Var.a(true);
            }
            this.I0.e();
            i4 i4Var = this.F0;
            if (i4Var != null) {
                i4Var.b();
            }
            O();
            if (this.f9602b) {
                org.telegram.messenger.g0.E2(this.f9639s);
            } else {
                this.f9628n.removeView(this.f9639s);
            }
            this.f9639s = null;
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
        if (!this.W0 && !this.Y0 && !this.X0 && !this.K0 && !this.f9634q0 && !this.f9652y && this.f9644u0 == null && this.f9646v0 == null && !this.G0 && !this.H0 && this.U == 1.0f && this.f9611e0 == 0.0f && !this.f9619h1) {
            if ((!this.f9625k1 || !this.f9599a) && !this.f9623j1 && !this.f9621i1 && !this.f9631o1 && this.V == 0.0f && this.f9643t1 == null) {
                if (!this.f9602b || (f2Var = this.f9613f) == null || f2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        throw new UnsupportedOperationException("Method not decompiled: di.q9.E():void");
    }

    public final void F(boolean z9) {
        int i7;
        Activity W = org.telegram.messenger.g0.W(this.f9613f.getContext());
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

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, m9 m9Var) {
        if (storyItem != null) {
            this.h = i7;
            if (storyItem.dialogId <= 0 || qp.s1(i7).a2(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && qp.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, m9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, r6 r6Var, TL_stories.PeerStories peerStories, m9 m9Var, boolean z9) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E1 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.f9651x0;
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
        p9 p9Var = this.f9654z0;
        if (p9Var != null) {
            p9Var.setSpeed(1.0f);
        }
        boolean z14 = false;
        if (!org.telegram.messenger.g0.Q1() && !this.f9635q1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9602b = z10;
        if (iz.f23393b0 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9599a = z11;
        if (storyItem == null) {
            i11 = 0;
        } else {
            i11 = storyItem.messageId;
        }
        this.T0 = i11;
        if (storyItem != null && r6Var == null && peerStories == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.M0 = z12;
        this.R0 = false;
        if (storyItem != null) {
            this.S0 = storyItem;
            f9597y1 = storyItem;
        }
        this.N0 = r6Var;
        this.P0 = peerStories;
        this.f9642t0 = m9Var;
        this.Q0 = z9;
        this.h = i7;
        this.W = 0.0f;
        this.X = 0.0f;
        g9 g9Var = this.f9629n0;
        if (g9Var != null) {
            g9Var.setHorizontalProgressToDismiss(0.0f);
            this.f9629n0.F0 = 0;
        }
        this.f9608d0 = 0.0f;
        this.Z = 0.0f;
        this.f9626l0 = false;
        this.V = 0.0f;
        this.m0 = true;
        this.Z0 = false;
        this.Y0 = false;
        this.f9609d1.clear();
        org.telegram.messenger.g0.r(this.f9601a1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9636r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.f9636r.flags = -2147417728;
        this.G0 = false;
        this.f9604b1 = false;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (this.f9639s == null) {
            this.f9620i0 = new GestureDetector(new a9(this));
            this.f9639s = new e9(this, context, Q);
        }
        if (this.f9648w == null) {
            this.f9648w = new f9(context, this);
            g9 g9Var2 = new g9(this, this.h, context, this, this.D);
            this.f9629n0 = g9Var2;
            g9Var2.setDelegate(new h9(this, r6Var, arrayList, context));
            this.f9648w.addView(this.f9629n0, ha.e(-1, -1, 1));
            this.f9653y0 = new org.telegram.ui.j4(context);
            if (this.f9599a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.C0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.C0.setZOrderOnTop(false);
                this.f9653y0.addView(this.C0);
            } else {
                i9 i9Var = new i9(context, this);
                this.B0 = i9Var;
                this.f9653y0.addView(i9Var);
            }
            fi.s3 s3Var = new fi.s3(context, this.h);
            this.D0 = s3Var;
            s3Var.setVisibility(8);
            this.f9653y0.addView(this.D0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f9974a = paint;
            view.f9976c = new ra(view, 22);
            view.d = new org.telegram.ui.Components.v5((View) view);
            view.f9977e = new org.telegram.ui.Components.v5((View) view);
            paint.setColor(-1);
            this.f9607c1 = view;
            this.f9648w.addView((View) view, ha.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        fi.s3 s3Var2 = this.D0;
        if (s3Var2 != null) {
            s3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.f9653y0);
        this.f9639s.addView(this.f9653y0);
        SurfaceView surfaceView2 = this.C0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.f9648w);
        this.f9639s.addView(this.f9648w);
        this.f9639s.setClipChildren(false);
        if (this.M0) {
            W();
        }
        if (r6Var != null) {
            this.f9629n0.D(this.h, r6Var.d, r6Var.h());
        } else {
            g9 g9Var3 = this.f9629n0;
            int i12 = this.h;
            g9Var3.A0 = arrayList;
            g9Var3.f9942y0 = i12;
            g9Var3.setAdapter(null);
            g9Var3.setAdapter(g9Var3.f9943z0);
            g9Var3.setCurrentItem(i10);
            g9Var3.C0 = true;
        }
        this.f9628n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f9602b = false;
        }
        if (this.f9602b && Q != null && Q.isSupportEdgeToEdge()) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f9605c = z13;
        f9 f9Var = this.f9648w;
        r4 r4Var = new r4(this, 4);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(f9Var, r4Var);
        if (this.f9602b) {
            org.telegram.messenger.g0.E2(this.f9639s);
            this.f9639s.setTag(2131296647, new Object());
            Q.getLayoutContainer().addView(this.f9639s);
            if (!this.f9605c) {
                org.telegram.messenger.g0.a3(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f9639s.setFocusable(false);
            this.f9648w.setFocusable(false);
            this.f9648w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.y3(this.f9628n, this.f9639s, this.f9636r);
            this.f9628n.addView(this.f9639s, this.f9636r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f9639s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f9639s.requestLayout();
        f9598z1 = true;
        W();
        this.U = 0.0f;
        q();
        f9595w1 = true;
        if (B1) {
            B1 = false;
            if (((AudioManager) this.f9639s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z14 = true;
            }
            C1 = z14;
        }
        if (this.f9602b) {
            F(true);
        }
        if (!this.f9602b) {
            f9596x1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, r6 r6Var, i7 i7Var) {
        this.h = p10.f24474s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(r6Var.d));
        this.O0 = i7;
        M(context, null, arrayList, 0, r6Var, null, i7Var, false);
    }

    public final void J(Context context, long j3, m9 m9Var) {
        this.h = p10.f24474s0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        z6 P1 = qp.s1(this.h).P1();
        int i7 = P1.f9997a;
        TL_stories.PeerStories y10 = P1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (s7.w(i7, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !P1.L(j3)) {
                P1.f10002g.remove(y10);
                P1.h.remove(y10);
                qs.f(i7).k(qs.f25099v5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, m9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, m9 m9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = p10.f24474s0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
            M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, m9Var, false);
            return;
        }
        this.f9651x0.clear();
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, i7 i7Var) {
        G(p10.f24474s0, context, storyItem, i7Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, r6 r6Var, TL_stories.PeerStories peerStories, m9 m9Var, boolean z9) {
        H(p10.f24474s0, context, storyItem, arrayList, i7, r6Var, peerStories, m9Var, z9);
    }

    public final void N(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f9602b) {
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
        p9 p9Var = this.f9654z0;
        if (p9Var != null) {
            p9Var.release(null);
            this.f9654z0 = null;
        }
        fi.s3 s3Var = this.D0;
        if (s3Var != null) {
            s3Var.b(0L, null);
        }
        g1 g1Var = this.A0;
        if (g1Var != null && !i1.a(g1Var)) {
            g1 g1Var2 = this.A0;
            if (g1Var2.f9007n) {
                g1Var2.s(null);
            } else {
                g1Var2.e();
            }
        }
        this.A0 = null;
        i1 i1Var = i1.f9099w;
        if (i1Var != null && i1Var.f9102c == this) {
            i1Var.f9102c = null;
            ab abVar = i1Var.f9105n;
            LaunchActivity launchActivity = i1Var.f9106r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.Z0.remove(abVar);
                }
                i1Var.f9106r = null;
            }
            ti.o oVar = i1Var.f9100a;
            if (oVar != null && oVar.d()) {
                ti.o oVar2 = i1Var.f9100a;
                if (oVar2.f56136c == 0) {
                    i1Var.f9100a = null;
                    i1Var.f9101b = null;
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
            ((p9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = qp.s1(this.h).P1().f10007m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((z9) hVar.n(i10)).b(false);
        }
        if (this.f9602b) {
            F(false);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f9613f;
        if (f2Var != null) {
            f2Var.removeSheet(this);
        }
        f9596x1.remove(this);
        this.f9651x0.clear();
        this.f9611e0 = 0.0f;
        f9597y1 = null;
    }

    public final void Q(boolean z9) {
        this.f9634q0 = z9;
        if (z9) {
            ra raVar = this.f9607c1.f9976c;
            org.telegram.messenger.g0.r(raVar);
            raVar.run();
        }
        V();
    }

    public final void R(boolean z9) {
        j4 currentPeerView;
        j4 currentPeerView2;
        h4 h4Var;
        p9 p9Var;
        i4 i4Var;
        if (this.Z0 != z9) {
            this.Z0 = z9;
            if (z9 && !this.f9612e1 && (currentPeerView2 = this.f9629n0.getCurrentPeerView()) != null && (h4Var = currentPeerView2.f9250x1) != null && !h4Var.f9073f && h4Var.f9070b == null) {
                if (!this.f9624k0 && !this.f9622j0 && (i4Var = this.F0) != null && ((p9) i4Var.f9111c) != null) {
                    currentPeerView2.L0.invalidate();
                    org.telegram.messenger.p2.IMPACT_LIGHT.a();
                }
                i4 i4Var2 = this.F0;
                if (i4Var2 != null && (p9Var = (p9) i4Var2.f9111c) != null && !this.f9624k0) {
                    p9Var.setSeeking(true);
                }
                this.f9624k0 = true;
            }
            V();
            g9 g9Var = this.f9629n0;
            if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.Z0);
            }
        }
    }

    public final void S(boolean z9) {
        boolean z10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (this.f9602b && launchActivity != null) {
            if (z9) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.g0.f22539a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z10 = zc.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z10 = false;
                }
                this.f9649w0 = z10;
            }
            if (this.f9649w0) {
                org.telegram.messenger.g0.m3(launchActivity, !z9);
            }
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: di.q9.T():void");
    }

    public final void U() {
        boolean z9 = C1;
        C1 = !z9;
        p9 p9Var = this.f9654z0;
        int i7 = 0;
        if (p9Var != null) {
            p9Var.setAudioEnabled(z9, false);
        }
        while (true) {
            ArrayList arrayList = this.L0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((p9) arrayList.get(i7)).setAudioEnabled(!C1, true);
            i7++;
        }
        j4 currentPeerView = this.f9629n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f9186g1.a(C1, true);
        }
        if (!C1) {
            this.f9607c1.b();
        }
    }

    public final void V() {
        if (this.f9629n0 == null) {
            return;
        }
        boolean C = C();
        boolean z9 = true;
        if (this.f9602b) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f9613f;
            if (f2Var.isPaused() || !f2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().V) {
            C = true;
        }
        this.f9629n0.setPaused(C);
        p9 p9Var = this.f9654z0;
        if (p9Var != null) {
            if (C) {
                p9Var.pause();
            } else {
                p9Var.play(A1);
            }
        }
        this.f9629n0.D0 = (this.f9652y || this.G0 || this.H0 || this.Z0 || this.f9612e1 || this.f9611e0 != 0.0f || this.f9621i1) ? false : false;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: di.q9.W():void");
    }

    @Override
    public final void a(boolean z9) {
        u(true);
    }

    @Override
    public final View d() {
        return this.f9639s;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == qs.f25113x5) {
            if (this.N0 == ((r6) objArr[0])) {
                z();
                g9 g9Var = this.f9629n0;
                r6 r6Var = this.N0;
                g9Var.D(this.h, r6Var.d, r6Var.h());
                t5 t5Var = this.f9650x;
                if (t5Var != null) {
                    TL_stories.StoryItem selectedStory = t5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.N0.f9699i.size()) {
                        if (selectedStory != null && selectedStory.f27199id == ((ij) this.N0.f9699i.get(i11)).f23270l.f27199id) {
                            i12 = i11;
                        }
                        arrayList2.add(((ij) this.N0.f9699i.get(i11)).f23270l);
                        i11++;
                    }
                    this.f9650x.b(i12, this.N0.d, arrayList2);
                }
            }
        } else if (i7 == qs.f25099v5) {
            m9 m9Var = this.f9642t0;
            if (m9Var instanceof i7) {
                i7 i7Var = (i7) m9Var;
                if (i7Var.f9127r && !i7Var.f9126n) {
                    z6 P1 = qp.s1(this.h).P1();
                    if (i7Var.f9125f) {
                        arrayList = P1.h;
                    } else {
                        arrayList = P1.f10002g;
                    }
                    ArrayList<Long> dialogIds = this.f9629n0.getDialogIds();
                    boolean z9 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!i7Var.h || P1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                            dialogIds.add(Long.valueOf(o4));
                            z9 = true;
                        }
                    }
                    if (z9) {
                        this.f9629n0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            t5 t5Var2 = this.f9650x;
            if (t5Var2 != null) {
                ArrayList arrayList3 = t5Var2.h.G;
                while (i11 < arrayList3.size()) {
                    ((o4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = qs.f24984c1;
            if (i7 != i14 && i7 != qs.f24990d1) {
                if (i7 == qs.f25106w5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.S0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f27199id == intValue) {
                        this.R0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            V();
            if (i7 == i14) {
                p9 p9Var = this.f9654z0;
                if (p9Var != null) {
                    this.f9641s1 = p9Var.currentPosition;
                    this.f9654z0.release(null);
                    this.f9654z0 = null;
                    return;
                }
                this.f9641s1 = 0L;
            } else if (!this.f9638r1 && z() != null) {
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
        if (this.f9632p0 != i7) {
            this.f9632p0 = i7;
            this.f9629n0.setKeyboardHeight(i7);
            this.f9629n0.requestLayout();
            t5 t5Var = this.f9650x;
            if (t5Var != null) {
                t5Var.setKeyboardHeight(i7);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.J0;
    }

    @Override
    public final gc k() {
        return null;
    }

    public final void l(boolean z9) {
        boolean z10;
        boolean z11 = org.telegram.messenger.r2.f25216a;
        if (this.m0 && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f9610e != z10) {
            this.f9610e = z10;
            SurfaceView surfaceView = this.C0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z10);
            }
            fi.s3 s3Var = this.D0;
            if (s3Var != null) {
                s3Var.setSecure(!z10);
            }
            if (this.f9602b) {
                org.telegram.ui.ActionBar.f2 f2Var = this.f9613f;
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
                this.f9636r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.f9636r.flags |= 8192;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.f9628n.updateViewLayout(this.f9639s, this.f9636r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        if (this.H == null) {
            this.f9622j0 = false;
            this.f9626l0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z, 0.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new y8(this, 2));
            this.H.addListener(new z8(this, 1));
            this.H.setDuration(250L);
            this.H.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
            this.H.start();
        }
    }

    public final void o(boolean z9) {
        if (this.f9645u1 == null) {
            if (this.f9632p0 != 0) {
                org.telegram.messenger.g0.v1(this.f9650x);
                return;
            }
            float f10 = 0.0f;
            if (!this.f9606c0 && this.f9611e0 == 0.0f) {
                return;
            }
            this.I0.d();
            if (!z9) {
                float f11 = this.f9611e0;
                t5 t5Var = this.f9650x;
                float f12 = t5Var.f9791c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f9611e0 = f13;
                    t5Var.setOffset(f13);
                }
            }
            float f14 = this.f9611e0;
            if (z9) {
                f10 = this.f9650x.f9791c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f9645u1 = ofFloat;
            ofFloat.addUpdateListener(new y8(this, 3));
            this.f9645u1.addListener(new ch.y(3, this, z9));
            if (z9) {
                this.f9645u1.setDuration(350L);
                this.f9645u1.setInterpolator(wq.h);
            } else {
                this.f9645u1.setDuration(350L);
                this.f9645u1.setInterpolator(wq.f40046f);
            }
            this.f9645u1.start();
        }
    }

    @Override
    public final void p() {
        j4 currentPeerView;
        boolean z9 = false;
        if (this.f9611e0 != 0.0f) {
            t5 t5Var = this.f9650x;
            if (t5Var.f9799y > 0) {
                org.telegram.messenger.g0.v1(t5Var);
                return;
            }
            l5 currentPage = t5Var.getCurrentPage();
            if (currentPage != null) {
                s4 s4Var = currentPage.f9334r;
                a5 a5Var = currentPage.f9332f;
                if (a5Var != null && a5Var.f17105a) {
                    a5Var.a();
                    return;
                } else if (Math.abs(currentPage.f9330c.getTranslationY() - s4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                    s4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                    s4Var.y0(0);
                    return;
                }
            }
            o(false);
            return;
        }
        g9 g9Var = this.f9629n0;
        if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
            z9 = currentPeerView.q0();
        }
        if (z9) {
            return;
        }
        u(true);
    }

    public final void q() {
        LaunchActivity launchActivity;
        if (this.f9602b && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void r() {
        if (this.f9650x == null) {
            t5 t5Var = new t5(this.f9648w.getContext(), this);
            this.f9650x = t5Var;
            this.f9648w.addView(t5Var, 0);
        }
        j4 currentPeerView = this.f9629n0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.N0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.N0.f9699i.size(); i7++) {
                    arrayList.add(((ij) this.N0.f9699i.get(i7)).f23270l);
                }
                this.f9650x.b(currentPeerView.getListPosition(), this.N0.d, arrayList);
                return;
            }
            this.f9650x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    @Override
    public final boolean s() {
        return !this.G0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f9644u0 = dialog;
            dialog.setOnDismissListener(new eb(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.f9644u0 = null;
            return false;
        }
    }

    public final void u(boolean z9) {
        org.telegram.messenger.g0.v1(this.f9639s);
        this.G0 = true;
        this.f9617g1 = true;
        V();
        S(false);
        W();
        this.I0.d();
        this.f9603b0 = this.W;
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new y8(this, 0));
        if (!z9) {
            this.O = 0.0f;
            this.N = 0.0f;
            n9 n9Var = this.f9640s0;
            ImageReceiver imageReceiver = n9Var.f9409b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = n9Var.f9410c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            n9Var.f9410c = null;
            n9Var.f9409b = null;
        } else {
            E();
        }
        org.telegram.messenger.g0.i3(new l3(this, 2), 16L);
        if (this.f9604b1) {
            this.f9604b1 = false;
        }
    }

    public final void v() {
        j4 j4Var;
        g9 g9Var = this.f9629n0;
        if (g9Var != null) {
            ArrayList arrayList = g9Var.P0;
            for (int i7 = 0; i7 < g9Var.getChildCount(); i7++) {
                View childAt = g9Var.getChildAt(i7);
                if ((childAt instanceof w7) && (j4Var = ((w7) childAt).f9906a) != null && !j4Var.E3) {
                    j4Var.E3 = true;
                    o2 o2Var = j4Var.K1;
                    if (o2Var != null) {
                        o2Var.B0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j4 j4Var2 = (j4) arrayList.get(i10);
                if (!j4Var2.E3) {
                    j4Var2.E3 = true;
                    o2 o2Var2 = j4Var2.K1;
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
        j4 currentPeerView = this.f9629n0.getCurrentPeerView();
        if (currentPeerView != null) {
            h4 h4Var = currentPeerView.f9250x1;
            if (!h4Var.j() && h4Var.f9072e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f9607c1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.f9651x0.add(runnable);
        }
    }

    @Override
    public final boolean y() {
        if (this.f9602b && this.f9639s != null) {
            return true;
        }
        return false;
    }

    public final j4 z() {
        g9 g9Var = this.f9629n0;
        if (g9Var == null) {
            return null;
        }
        return g9Var.getCurrentPeerView();
    }

    @Override
    public final void b(boolean z9) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
