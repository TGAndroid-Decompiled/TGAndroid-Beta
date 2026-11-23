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
import c8.dd;
import c8.ma;
import di.u9;
import di.xb;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
import org.telegram.ui.LaunchActivity;
public final class f9 implements gs, org.telegram.ui.ActionBar.c2 {
    public static boolean A1;
    public static boolean D1;
    public static boolean f11993x1;
    public static TL_stories.StoryItem f11995z1;
    public e9 A0;
    public c1 B0;
    public x8 C0;
    public SurfaceView D0;
    public hi.q3 E0;
    public boolean F;
    public Uri F0;
    public ValueAnimator G;
    public y3 G0;
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
    public v6 N;
    public boolean N0;
    public float O;
    public h6 O0;
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
    public float f11997a0;
    public boolean f11998a1;
    public boolean f12000b0;
    public final e3 f12001b1;
    public float f12003c0;
    public boolean f12004c1;
    public boolean f12005d0;
    public o7 f12006d1;
    public float f12008e0;
    public final LongSparseIntArray f12009e1;
    public final org.telegram.ui.ActionBar.g2 f12010f;
    public float f12011f0;
    public boolean f12012f1;
    public boolean f12013g0;
    public boolean f12014g1;
    public int h;
    public boolean f12015h0;
    public boolean f12016h1;
    public boolean f12017i0;
    public boolean f12018i1;
    public GestureDetector f12019j0;
    public boolean f12020j1;
    public boolean f12021k0;
    public boolean f12022k1;
    public boolean f12023l0;
    public boolean l1;
    public boolean m0;
    public boolean f12024m1;
    public WindowManager f12025n;
    public boolean f12026n0;
    public f2.a n1;
    public v8 f12027o0;
    public e3 f12028o1;
    public boolean f12030p1;
    public int f12031q0;
    public float f12032q1;
    public WindowManager.LayoutParams f12033r;
    public boolean f12034r0;
    public boolean f12035r1;
    public t8 f12036s;
    public float f12037s0;
    public boolean f12038s1;
    public final c9 f12039t0;
    public long f12040t1;
    public b9 f12041u0;
    public t6 f12042u1;
    public Dialog f12043v0;
    public ValueAnimator f12044v1;
    public u8 f12045w;
    public org.telegram.ui.ActionBar.c2 f12046w0;
    public boolean f12047w1;
    public j5 f12048x;
    public boolean f12049x0;
    public boolean f12050y;
    public final ArrayList f12051y0;
    public org.telegram.ui.j4 f12052z0;
    public static final ArrayList f11994y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f11996a = cz.f23394b0;
    public boolean f11999b = true;
    public boolean f12002c = false;
    public boolean d = false;
    public boolean f12007e = true;
    public final b E = new b();
    public final RectF U = new RectF();
    public final float[] f12029p0 = new float[2];

    public f9(org.telegram.ui.ActionBar.g2 g2Var) {
        ?? obj = new Object();
        obj.f11867k = 1.0f;
        this.f12039t0 = obj;
        this.f12051y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new h2.f((int[]) null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f12001b1 = new e3(this, 4);
        this.f12009e1 = new LongSparseIntArray();
        new Paint(1);
        this.f12010f = g2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f28673id << 16), "");
    }

    public static boolean D(gj gjVar) {
        if (f11995z1 == null || ((gjVar.D != 23 && !gjVar.Z4()) || A1 || f11995z1.messageId != gjVar.e1() || f11995z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f28673id << 16), editable);
        }
    }

    public static boolean c(f9 f9Var, t8 t8Var, float f10, float f11, boolean z10) {
        i2 i2Var;
        i2 i2Var2;
        if (t8Var != null) {
            if (!f9Var.X0) {
                if (f9Var.f12048x == null || f9Var.f12011f0 == 0.0f) {
                    z3 currentPeerView = f9Var.f12027o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f10 - f9Var.f12045w.getX()) - f9Var.f12027o0.getX()) - currentPeerView.getX(), ((f11 - f9Var.f12045w.getY()) - f9Var.f12027o0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f12866f2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (i2Var2 = currentPeerView.L1) != null && i2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.L1.getY() + currentPeerView.getY() + f9Var.f12027o0.getY() + f9Var.f12045w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (i2Var = currentPeerView.L1) != null && i2Var.V0()) || f9Var.f12042u1 != null) {
                        return true;
                    }
                    return org.telegram.messenger.g0.Y(t8Var, f10, f11, currentPeerView);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static void g(f9 f9Var) {
        xb xbVar;
        ot editField;
        z3 currentPeerView = f9Var.f12027o0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.L1 != null && (((xbVar = currentPeerView.L2) == null || xbVar.getVisibility() != 0) && (editField = currentPeerView.L1.getEditField()) != null)) {
            editField.requestFocus();
            org.telegram.messenger.g0.I3(editField);
            org.telegram.messenger.g0.h3(new e3(f9Var, 6), 200L);
            return;
        }
        f9Var.m();
    }

    public static void i(f9 f9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(f9Var.Y, f9Var.X) / org.telegram.messenger.g0.L(80.0f)));
        if (f9Var.W != l10) {
            f9Var.W = l10;
            f9Var.q();
            z3 currentPeerView = f9Var.f12027o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f12874h2) {
                currentPeerView.invalidate();
            }
            c1 c1Var = f9Var.B0;
            if (c1Var != null) {
                c1Var.v((1.0f - f9Var.W) * f9Var.V);
            }
        }
        t8 t8Var = f9Var.f12036s;
        if (t8Var != null) {
            t8Var.invalidate();
        }
    }

    public final void B() {
        if (this.f12026n0) {
            org.telegram.messenger.g0.v1(this.f12036s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            V();
            this.P = 0.0f;
            this.O = 0.0f;
            c9 c9Var = this.f12039t0;
            ImageReceiver imageReceiver = c9Var.f11860b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = c9Var.f11861c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            c9Var.f11861c = null;
            c9Var.f11860b = null;
            u8 u8Var = this.f12045w;
            if (u8Var != null) {
                u8Var.a(true);
            }
            this.J0.e();
            y3 y3Var = this.G0;
            if (y3Var != null) {
                y3Var.b();
            }
            O();
            if (this.f11999b) {
                org.telegram.messenger.g0.E2(this.f12036s);
            } else {
                this.f12025n.removeView(this.f12036s);
            }
            this.f12036s = null;
            v();
            this.f12026n0 = false;
            this.d = false;
            q();
            e3 e3Var = this.f12028o1;
            if (e3Var != null) {
                e3Var.run();
                this.f12028o1 = null;
            }
        }
    }

    public final boolean C() {
        org.telegram.ui.ActionBar.g2 g2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f12034r0 && !this.f12050y && this.f12043v0 == null && this.f12046w0 == null && !this.H0 && !this.I0 && this.V == 1.0f && this.f12011f0 == 0.0f && !this.f12018i1) {
            if ((!this.l1 || !this.f11996a) && !this.f12022k1 && !this.f12020j1 && !this.f12030p1 && this.W == 0.0f && this.f12042u1 == null) {
                if (!this.f11999b || (g2Var = this.f12010f) == null || g2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void E() {
        throw new UnsupportedOperationException("Method not decompiled: fi.f9.E():void");
    }

    public final void F(boolean z10) {
        int i7;
        Activity W = org.telegram.messenger.g0.W(this.f12010f.getContext());
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

    public final void G(int i7, Context context, TL_stories.StoryItem storyItem, b9 b9Var) {
        if (storyItem != null) {
            this.h = i7;
            if (storyItem.dialogId <= 0 || np.u1(i7).c2(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && np.u1(this.h).O0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                H(i7, context, storyItem, arrayList, 0, null, null, b9Var, false);
            }
        }
    }

    public final void H(int i7, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, h6 h6Var, TL_stories.PeerStories peerStories, b9 b9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E12 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.f12051y0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (this.f12026n0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        e9 e9Var = this.A0;
        if (e9Var != null) {
            e9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!org.telegram.messenger.g0.Q1() && !this.f12035r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11999b = z11;
        if (cz.f23394b0 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f11996a = z12;
        if (storyItem == null) {
            i11 = 0;
        } else {
            i11 = storyItem.messageId;
        }
        this.U0 = i11;
        if (storyItem != null && h6Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N0 = z13;
        this.S0 = false;
        if (storyItem != null) {
            this.T0 = storyItem;
            f11995z1 = storyItem;
        }
        this.O0 = h6Var;
        this.Q0 = peerStories;
        this.f12041u0 = b9Var;
        this.R0 = z10;
        this.h = i7;
        this.X = 0.0f;
        this.Y = 0.0f;
        v8 v8Var = this.f12027o0;
        if (v8Var != null) {
            v8Var.setHorizontalProgressToDismiss(0.0f);
            this.f12027o0.G0 = 0;
        }
        this.f12008e0 = 0.0f;
        this.f11997a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.f12026n0 = true;
        this.f11998a1 = false;
        this.Z0 = false;
        this.f12009e1.clear();
        org.telegram.messenger.g0.r(this.f12001b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f12033r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.f12033r.flags = -2147417728;
        this.H0 = false;
        this.f12004c1 = false;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (this.f12036s == null) {
            this.f12019j0 = new GestureDetector(new p8(this));
            this.f12036s = new t8(this, context, Q);
        }
        if (this.f12045w == null) {
            this.f12045w = new u8(context, this);
            v8 v8Var2 = new v8(this, this.h, context, this, this.E);
            this.f12027o0 = v8Var2;
            v8Var2.setDelegate(new w8(this, h6Var, arrayList, context));
            this.f12045w.addView(this.f12027o0, ma.e(-1, -1, 1));
            this.f12052z0 = new org.telegram.ui.j4(context);
            if (this.f11996a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.f12052z0.addView(this.D0);
            } else {
                x8 x8Var = new x8(context, this);
                this.C0 = x8Var;
                this.f12052z0.addView(x8Var);
            }
            hi.q3 q3Var = new hi.q3(context, this.h);
            this.E0 = q3Var;
            q3Var.setVisibility(8);
            this.f12052z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f12384a = paint;
            view.f12386c = new sa(view, 26);
            view.d = new org.telegram.ui.Components.d6((View) view);
            view.f12387e = new org.telegram.ui.Components.d6((View) view);
            paint.setColor(-1);
            this.f12006d1 = view;
            this.f12045w.addView((View) view, ma.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        hi.q3 q3Var2 = this.E0;
        if (q3Var2 != null) {
            q3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.f12052z0);
        this.f12036s.addView(this.f12052z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.f12045w);
        this.f12036s.addView(this.f12045w);
        this.f12036s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        if (h6Var != null) {
            this.f12027o0.D(this.h, h6Var.d, h6Var.h());
        } else {
            v8 v8Var3 = this.f12027o0;
            int i12 = this.h;
            v8Var3.B0 = arrayList;
            v8Var3.f12352z0 = i12;
            v8Var3.setAdapter(null);
            v8Var3.setAdapter(v8Var3.A0);
            v8Var3.setCurrentItem(i10);
            v8Var3.D0 = true;
        }
        this.f12025n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f11999b = false;
        }
        if (this.f11999b && Q != null && Q.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f12002c = z14;
        u8 u8Var = this.f12045w;
        di.v6 v6Var = new di.v6(this, 12);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(u8Var, v6Var);
        if (this.f11999b) {
            org.telegram.messenger.g0.E2(this.f12036s);
            this.f12036s.setTag(2131296649, new Object());
            Q.getLayoutContainer().addView(this.f12036s);
            if (!this.f12002c) {
                org.telegram.messenger.g0.Z2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f12036s.setFocusable(false);
            this.f12045w.setFocusable(false);
            this.f12045w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.w3(this.f12025n, this.f12036s, this.f12033r);
            this.f12025n.addView(this.f12036s, this.f12033r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f12036s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f12036s.requestLayout();
        A1 = true;
        W();
        this.V = 0.0f;
        q();
        f11993x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f12036s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f11999b) {
            F(true);
        }
        if (!this.f11999b) {
            f11994y1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, h6 h6Var, y6 y6Var) {
        this.h = k10.f24968t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(h6Var.d));
        this.P0 = i7;
        M(context, null, arrayList, 0, h6Var, null, y6Var, false);
    }

    public final void J(Context context, long j3, b9 b9Var) {
        this.h = k10.f24968t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        p6 R1 = np.u1(this.h).R1();
        int i7 = R1.f12425a;
        TL_stories.PeerStories y10 = R1.y(j3);
        if (y10 != null) {
            int i10 = 0;
            while (i10 < y10.stories.size()) {
                if (i7.w(i7, y10.stories.get(i10))) {
                    y10.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y10.stories.isEmpty() && !R1.L(j3)) {
                R1.f12430g.remove(y10);
                R1.h.remove(y10);
                ls.f(i7).k(ls.f25424y5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, b9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, b9 b9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = k10.f24968t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.n5.o(peerStories.peer)));
            M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, b9Var, false);
            return;
        }
        this.f12051y0.clear();
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, y6 y6Var) {
        G(k10.f24968t0, context, storyItem, y6Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, h6 h6Var, TL_stories.PeerStories peerStories, b9 b9Var, boolean z10) {
        H(k10.f24968t0, context, storyItem, arrayList, i7, h6Var, peerStories, b9Var, z10);
    }

    public final void N(org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f11999b) {
            Q.presentFragment(g2Var);
            return;
        }
        Q.presentFragment(g2Var);
        u(false);
    }

    public final void O() {
        ArrayList arrayList;
        this.F0 = null;
        Q(false);
        l(true);
        e9 e9Var = this.A0;
        if (e9Var != null) {
            e9Var.release(null);
            this.A0 = null;
        }
        hi.q3 q3Var = this.E0;
        if (q3Var != null) {
            q3Var.b(0L, null);
        }
        c1 c1Var = this.B0;
        if (c1Var != null && !e1.a(c1Var)) {
            c1 c1Var2 = this.B0;
            if (c1Var2.f11841n) {
                c1Var2.s(null);
            } else {
                c1Var2.e();
            }
        }
        this.B0 = null;
        e1 e1Var = e1.f11912w;
        if (e1Var != null && e1Var.f11915c == this) {
            e1Var.f11915c = null;
            f2.a aVar = e1Var.f11918n;
            LaunchActivity launchActivity = e1Var.f11919r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.f43113a1.remove(aVar);
                }
                e1Var.f11919r = null;
            }
            wi.n nVar = e1Var.f11913a;
            if (nVar != null && nVar.d()) {
                wi.n nVar2 = e1Var.f11913a;
                if (nVar2.f60034c == 0) {
                    e1Var.f11913a = null;
                    e1Var.f11914b = null;
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
            ((e9) arrayList.get(i7)).release(null);
            i7++;
        }
        arrayList.clear();
        a0.h hVar = np.u1(this.h).R1().f12435m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((o9) hVar.n(i10)).b(false);
        }
        if (this.f11999b) {
            F(false);
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f12010f;
        if (g2Var != null) {
            g2Var.removeSheet(this);
        }
        f11994y1.remove(this);
        this.f12051y0.clear();
        this.f12011f0 = 0.0f;
        f11995z1 = null;
    }

    public final void Q(boolean z10) {
        this.f12034r0 = z10;
        if (z10) {
            sa saVar = this.f12006d1.f12386c;
            org.telegram.messenger.g0.r(saVar);
            saVar.run();
        }
        V();
    }

    public final void R(boolean z10) {
        z3 currentPeerView;
        z3 currentPeerView2;
        x3 x3Var;
        e9 e9Var;
        y3 y3Var;
        if (this.f11998a1 != z10) {
            this.f11998a1 = z10;
            if (z10 && !this.f12012f1 && (currentPeerView2 = this.f12027o0.getCurrentPeerView()) != null && (x3Var = currentPeerView2.f12937y1) != null && !x3Var.f12769f && x3Var.f12766b == null) {
                if (!this.f12023l0 && !this.f12021k0 && (y3Var = this.G0) != null && ((e9) y3Var.f12815c) != null) {
                    currentPeerView2.M0.invalidate();
                    org.telegram.messenger.q2.IMPACT_LIGHT.a();
                }
                y3 y3Var2 = this.G0;
                if (y3Var2 != null && (e9Var = (e9) y3Var2.f12815c) != null && !this.f12023l0) {
                    e9Var.setSeeking(true);
                }
                this.f12023l0 = true;
            }
            V();
            v8 v8Var = this.f12027o0;
            if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f11998a1);
            }
        }
    }

    public final void S(boolean z10) {
        boolean z11;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (this.f11999b && launchActivity != null) {
            if (z10) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.g0.f24018a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z11 = dd.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z11 = false;
                }
                this.f12049x0 = z11;
            }
            if (this.f12049x0) {
                org.telegram.messenger.g0.l3(launchActivity, !z10);
            }
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: fi.f9.T():void");
    }

    public final void U() {
        boolean z10 = D1;
        D1 = !z10;
        e9 e9Var = this.A0;
        int i7 = 0;
        if (e9Var != null) {
            e9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.M0;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((e9) arrayList.get(i7)).setAudioEnabled(!D1, true);
            i7++;
        }
        z3 currentPeerView = this.f12027o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f12873h1.a(D1, true);
        }
        if (!D1) {
            this.f12006d1.b();
        }
    }

    public final void V() {
        if (this.f12027o0 == null) {
            return;
        }
        boolean C = C();
        boolean z10 = true;
        if (this.f11999b) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f12010f;
            if (g2Var.isPaused() || !g2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().W) {
            C = true;
        }
        this.f12027o0.setPaused(C);
        e9 e9Var = this.A0;
        if (e9Var != null) {
            if (C) {
                e9Var.pause();
            } else {
                e9Var.play(B1);
            }
        }
        this.f12027o0.E0 = (this.f12050y || this.H0 || this.I0 || this.f11998a1 || this.f12012f1 || this.f12011f0 != 0.0f || this.f12020j1) ? false : false;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: fi.f9.W():void");
    }

    @Override
    public final void a(boolean z10) {
        u(true);
    }

    @Override
    public final View d() {
        return this.f12036s;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == ls.A5) {
            if (this.O0 == ((h6) objArr[0])) {
                z();
                v8 v8Var = this.f12027o0;
                h6 h6Var = this.O0;
                v8Var.D(this.h, h6Var.d, h6Var.h());
                j5 j5Var = this.f12048x;
                if (j5Var != null) {
                    TL_stories.StoryItem selectedStory = j5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.O0.f12089i.size()) {
                        if (selectedStory != null && selectedStory.f28673id == ((gj) this.O0.f12089i.get(i11)).f24218l.f28673id) {
                            i12 = i11;
                        }
                        arrayList2.add(((gj) this.O0.f12089i.get(i11)).f24218l);
                        i11++;
                    }
                    this.f12048x.b(i12, this.O0.d, arrayList2);
                }
            }
        } else if (i7 == ls.f25424y5) {
            b9 b9Var = this.f12041u0;
            if (b9Var instanceof y6) {
                y6 y6Var = (y6) b9Var;
                if (y6Var.f12831r && !y6Var.f12830n) {
                    p6 R1 = np.u1(this.h).R1();
                    if (y6Var.f12829f) {
                        arrayList = R1.h;
                    } else {
                        arrayList = R1.f12430g;
                    }
                    ArrayList<Long> dialogIds = this.f12027o0.getDialogIds();
                    boolean z10 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!y6Var.h || R1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                            dialogIds.add(Long.valueOf(o4));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f12027o0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            j5 j5Var2 = this.f12048x;
            if (j5Var2 != null) {
                ArrayList arrayList3 = j5Var2.h.H;
                while (i11 < arrayList3.size()) {
                    ((e4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = ls.f25288c1;
            if (i7 != i14 && i7 != ls.f25294d1) {
                if (i7 == ls.f25431z5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f28673id == intValue) {
                        this.S0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            V();
            if (i7 == i14) {
                e9 e9Var = this.A0;
                if (e9Var != null) {
                    this.f12040t1 = e9Var.currentPosition;
                    this.A0.release(null);
                    this.A0 = null;
                    return;
                }
                this.f12040t1 = 0L;
            } else if (!this.f12038s1 && z() != null) {
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
        if (this.f12031q0 != i7) {
            this.f12031q0 = i7;
            this.f12027o0.setKeyboardHeight(i7);
            this.f12027o0.requestLayout();
            j5 j5Var = this.f12048x;
            if (j5Var != null) {
                j5Var.setKeyboardHeight(i7);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.K0;
    }

    @Override
    public final lc k() {
        return null;
    }

    public final void l(boolean z10) {
        boolean z11;
        boolean z12 = org.telegram.messenger.s2.f26730a;
        if (this.f12026n0 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f12007e != z11) {
            this.f12007e = z11;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            hi.q3 q3Var = this.E0;
            if (q3Var != null) {
                q3Var.setSecure(!z11);
            }
            if (this.f11999b) {
                org.telegram.ui.ActionBar.g2 g2Var = this.f12010f;
                if (g2Var.getParentActivity() != null) {
                    if (z11) {
                        g2Var.getParentActivity().getWindow().clearFlags(8192);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                    g2Var.getParentActivity().getWindow().addFlags(8192);
                    org.telegram.messenger.g0.h2();
                    return;
                }
                return;
            }
            if (z11) {
                this.f12033r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.f12033r.flags |= 8192;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.f12025n.updateViewLayout(this.f12036s, this.f12033r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        if (this.I == null) {
            this.f12021k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11997a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new n8(this, 2));
            this.I.addListener(new o8(this, 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(org.telegram.ui.ActionBar.i1.f29005w);
            this.I.start();
        }
    }

    public final void o(boolean z10) {
        if (this.f12044v1 == null) {
            if (this.f12031q0 != 0) {
                org.telegram.messenger.g0.v1(this.f12048x);
                return;
            }
            float f10 = 0.0f;
            if (!this.f12005d0 && this.f12011f0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z10) {
                float f11 = this.f12011f0;
                j5 j5Var = this.f12048x;
                float f12 = j5Var.f12189c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f12011f0 = f13;
                    j5Var.setOffset(f13);
                }
            }
            float f14 = this.f12011f0;
            if (z10) {
                f10 = this.f12048x.f12189c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f12044v1 = ofFloat;
            ofFloat.addUpdateListener(new n8(this, 3));
            this.f12044v1.addListener(new bi.g7(4, this, z10));
            if (z10) {
                this.f12044v1.setDuration(350L);
                this.f12044v1.setInterpolator(nr.h);
            } else {
                this.f12044v1.setDuration(350L);
                this.f12044v1.setInterpolator(nr.f37960f);
            }
            this.f12044v1.start();
        }
    }

    @Override
    public final void p() {
        z3 currentPeerView;
        boolean z10 = false;
        if (this.f12011f0 != 0.0f) {
            j5 j5Var = this.f12048x;
            if (j5Var.f12197y > 0) {
                org.telegram.messenger.g0.v1(j5Var);
                return;
            }
            b5 currentPage = j5Var.getCurrentPage();
            if (currentPage != null) {
                h4 h4Var = currentPage.f11818r;
                q4 q4Var = currentPage.f11816f;
                if (q4Var != null && q4Var.f18089a) {
                    q4Var.a();
                    return;
                } else if (Math.abs(currentPage.f11814c.getTranslationY() - h4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                    h4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                    h4Var.y0(0);
                    return;
                }
            }
            o(false);
            return;
        }
        v8 v8Var = this.f12027o0;
        if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.q0();
        }
        if (z10) {
            return;
        }
        u(true);
    }

    public final void q() {
        LaunchActivity launchActivity;
        if (this.f11999b && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void r() {
        if (this.f12048x == null) {
            j5 j5Var = new j5(this.f12045w.getContext(), this);
            this.f12048x = j5Var;
            this.f12045w.addView(j5Var, 0);
        }
        z3 currentPeerView = this.f12027o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.O0.f12089i.size(); i7++) {
                    arrayList.add(((gj) this.O0.f12089i.get(i7)).f24218l);
                }
                this.f12048x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f12048x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    @Override
    public final boolean s() {
        return !this.H0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f12043v0 = dialog;
            dialog.setOnDismissListener(new u9(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.f12043v0 = null;
            return false;
        }
    }

    public final void u(boolean z10) {
        org.telegram.messenger.g0.v1(this.f12036s);
        this.H0 = true;
        this.f12016h1 = true;
        V();
        S(false);
        W();
        this.J0.d();
        this.f12003c0 = this.X;
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new n8(this, 0));
        if (!z10) {
            this.P = 0.0f;
            this.O = 0.0f;
            c9 c9Var = this.f12039t0;
            ImageReceiver imageReceiver = c9Var.f11860b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = c9Var.f11861c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            c9Var.f11861c = null;
            c9Var.f11860b = null;
        } else {
            E();
        }
        org.telegram.messenger.g0.h3(new e3(this, 2), 16L);
        if (this.f12004c1) {
            this.f12004c1 = false;
        }
    }

    public final void v() {
        z3 z3Var;
        v8 v8Var = this.f12027o0;
        if (v8Var != null) {
            ArrayList arrayList = v8Var.Q0;
            for (int i7 = 0; i7 < v8Var.getChildCount(); i7++) {
                View childAt = v8Var.getChildAt(i7);
                if ((childAt instanceof m7) && (z3Var = ((m7) childAt).f12315a) != null && !z3Var.F3) {
                    z3Var.F3 = true;
                    i2 i2Var = z3Var.L1;
                    if (i2Var != null) {
                        i2Var.c1();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                z3 z3Var2 = (z3) arrayList.get(i10);
                if (!z3Var2.F3) {
                    z3Var2.F3 = true;
                    i2 i2Var2 = z3Var2.L1;
                    if (i2Var2 != null) {
                        i2Var2.c1();
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
        z3 currentPeerView = this.f12027o0.getCurrentPeerView();
        if (currentPeerView != null) {
            x3 x3Var = currentPeerView.f12937y1;
            if (!x3Var.j() && x3Var.f12768e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f12006d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.f12051y0.add(runnable);
        }
    }

    @Override
    public final boolean y() {
        if (this.f11999b && this.f12036s != null) {
            return true;
        }
        return false;
    }

    public final z3 z() {
        v8 v8Var = this.f12027o0;
        if (v8Var == null) {
            return null;
        }
        return v8Var.getCurrentPeerView();
    }

    @Override
    public final void b(boolean z10) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
