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
import di.t9;
import di.xb;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.LaunchActivity;
public final class f9 implements fs, org.telegram.ui.ActionBar.d2 {
    public static boolean A1;
    public static boolean D1;
    public static boolean f11949x1;
    public static TL_stories.StoryItem f11951z1;
    public e9 A0;
    public c1 B0;
    public x8 C0;
    public SurfaceView D0;
    public hi.r3 E0;
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
    public float f11953a0;
    public boolean f11954a1;
    public boolean f11956b0;
    public final e3 f11957b1;
    public float f11959c0;
    public boolean f11960c1;
    public boolean f11961d0;
    public o7 f11962d1;
    public float f11964e0;
    public final LongSparseIntArray f11965e1;
    public final org.telegram.ui.ActionBar.h2 f11966f;
    public float f11967f0;
    public boolean f11968f1;
    public boolean f11969g0;
    public boolean f11970g1;
    public int h;
    public boolean f11971h0;
    public boolean f11972h1;
    public boolean f11973i0;
    public boolean f11974i1;
    public GestureDetector f11975j0;
    public boolean f11976j1;
    public boolean f11977k0;
    public boolean f11978k1;
    public boolean f11979l0;
    public boolean l1;
    public boolean m0;
    public boolean f11980m1;
    public WindowManager f11981n;
    public boolean f11982n0;
    public f2.a n1;
    public v8 f11983o0;
    public e3 f11984o1;
    public boolean f11986p1;
    public int f11987q0;
    public float f11988q1;
    public WindowManager.LayoutParams f11989r;
    public boolean f11990r0;
    public boolean f11991r1;
    public t8 f11992s;
    public float f11993s0;
    public boolean f11994s1;
    public final c9 f11995t0;
    public long f11996t1;
    public b9 f11997u0;
    public t6 f11998u1;
    public Dialog f11999v0;
    public ValueAnimator f12000v1;
    public u8 f12001w;
    public org.telegram.ui.ActionBar.d2 f12002w0;
    public boolean f12003w1;
    public i5 f12004x;
    public boolean f12005x0;
    public boolean f12006y;
    public final ArrayList f12007y0;
    public org.telegram.ui.j4 f12008z0;
    public static final ArrayList f11950y1 = new ArrayList();
    public static float B1 = 1.0f;
    public static boolean C1 = true;
    public static final LongSparseArray E1 = new LongSparseArray();
    public boolean f11952a = bz.f23149b0;
    public boolean f11955b = true;
    public boolean f11958c = false;
    public boolean d = false;
    public boolean f11963e = true;
    public final b E = new b();
    public final RectF U = new RectF();
    public final float[] f11985p0 = new float[2];

    public f9(org.telegram.ui.ActionBar.h2 h2Var) {
        ?? obj = new Object();
        obj.f11824k = 1.0f;
        this.f11995t0 = obj;
        this.f12007y0 = new ArrayList();
        this.H0 = true;
        this.J0 = new h2.f((int[]) null);
        this.M0 = new ArrayList();
        this.Z0 = false;
        this.f11957b1 = new e3(this, 4);
        this.f11965e1 = new LongSparseIntArray();
        new Paint(1);
        this.f11966f = h2Var;
    }

    public static CharSequence A(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) E1.get(j3 + (j3 >> 16) + (storyItem.f28642id << 16), "");
    }

    public static boolean D(fj fjVar) {
        if (f11951z1 == null || ((fjVar.D != 23 && !fjVar.Z4()) || A1 || f11951z1.messageId != fjVar.e1() || f11951z1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void P(long j3, TL_stories.StoryItem storyItem, Editable editable) {
        if (j3 != 0 && storyItem != null) {
            E1.put(j3 + (j3 >> 16) + (storyItem.f28642id << 16), editable);
        }
    }

    public static boolean c(f9 f9Var, t8 t8Var, float f10, float f11, boolean z10) {
        i2 i2Var;
        i2 i2Var2;
        if (t8Var != null) {
            if (!f9Var.X0) {
                if (f9Var.f12004x == null || f9Var.f11967f0 == 0.0f) {
                    z3 currentPeerView = f9Var.f11983o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f10 - f9Var.f12001w.getX()) - f9Var.f11983o0.getX()) - currentPeerView.getX(), ((f11 - f9Var.f12001w.getY()) - f9Var.f11983o0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f12822f2) {
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
                        if (f11 > currentPeerView.L1.getY() + currentPeerView.getY() + f9Var.f11983o0.getY() + f9Var.f12001w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (i2Var = currentPeerView.L1) != null && i2Var.R0()) || f9Var.f11998u1 != null) {
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
        mt editField;
        z3 currentPeerView = f9Var.f11983o0.getCurrentPeerView();
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
            z3 currentPeerView = f9Var.f11983o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f12830h2) {
                currentPeerView.invalidate();
            }
            c1 c1Var = f9Var.B0;
            if (c1Var != null) {
                c1Var.v((1.0f - f9Var.W) * f9Var.V);
            }
        }
        t8 t8Var = f9Var.f11992s;
        if (t8Var != null) {
            t8Var.invalidate();
        }
    }

    public final void B() {
        if (this.f11982n0) {
            org.telegram.messenger.g0.v1(this.f11992s);
            this.H0 = true;
            this.K0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            V();
            this.P = 0.0f;
            this.O = 0.0f;
            c9 c9Var = this.f11995t0;
            ImageReceiver imageReceiver = c9Var.f11817b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = c9Var.f11818c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            c9Var.f11818c = null;
            c9Var.f11817b = null;
            u8 u8Var = this.f12001w;
            if (u8Var != null) {
                u8Var.a(true);
            }
            this.J0.e();
            y3 y3Var = this.G0;
            if (y3Var != null) {
                y3Var.b();
            }
            O();
            if (this.f11955b) {
                org.telegram.messenger.g0.E2(this.f11992s);
            } else {
                this.f11981n.removeView(this.f11992s);
            }
            this.f11992s = null;
            v();
            this.f11982n0 = false;
            this.d = false;
            q();
            e3 e3Var = this.f11984o1;
            if (e3Var != null) {
                e3Var.run();
                this.f11984o1 = null;
            }
        }
    }

    public final boolean C() {
        org.telegram.ui.ActionBar.h2 h2Var;
        if (!this.X0 && !this.Z0 && !this.Y0 && !this.L0 && !this.f11990r0 && !this.f12006y && this.f11999v0 == null && this.f12002w0 == null && !this.H0 && !this.I0 && this.V == 1.0f && this.f11967f0 == 0.0f && !this.f11974i1) {
            if ((!this.l1 || !this.f11952a) && !this.f11978k1 && !this.f11976j1 && !this.f11986p1 && this.W == 0.0f && this.f11998u1 == null) {
                if (!this.f11955b || (h2Var = this.f11966f) == null || h2Var.getLastStoryViewer() == this) {
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
        Activity W = org.telegram.messenger.g0.W(this.f11966f.getContext());
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
            if (storyItem.dialogId <= 0 || mp.u1(i7).c2(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && mp.u1(this.h).O0(Long.valueOf(-storyItem.dialogId)) == null) {
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
        ArrayList arrayList2 = this.f12007y0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (this.f11982n0) {
            arrayList2.clear();
            return;
        }
        B1 = 1.0f;
        e9 e9Var = this.A0;
        if (e9Var != null) {
            e9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!org.telegram.messenger.g0.Q1() && !this.f11991r1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11955b = z11;
        if (bz.f23149b0 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f11952a = z12;
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
            f11951z1 = storyItem;
        }
        this.O0 = h6Var;
        this.Q0 = peerStories;
        this.f11997u0 = b9Var;
        this.R0 = z10;
        this.h = i7;
        this.X = 0.0f;
        this.Y = 0.0f;
        v8 v8Var = this.f11983o0;
        if (v8Var != null) {
            v8Var.setHorizontalProgressToDismiss(0.0f);
            this.f11983o0.G0 = 0;
        }
        this.f11964e0 = 0.0f;
        this.f11953a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.f11982n0 = true;
        this.f11954a1 = false;
        this.Z0 = false;
        this.f11965e1.clear();
        org.telegram.messenger.g0.r(this.f11957b1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f11989r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.f11989r.flags = -2147417728;
        this.H0 = false;
        this.f11960c1 = false;
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (this.f11992s == null) {
            this.f11975j0 = new GestureDetector(new p8(this));
            this.f11992s = new t8(this, context, Q);
        }
        if (this.f12001w == null) {
            this.f12001w = new u8(context, this);
            v8 v8Var2 = new v8(this, this.h, context, this, this.E);
            this.f11983o0 = v8Var2;
            v8Var2.setDelegate(new w8(this, h6Var, arrayList, context));
            this.f12001w.addView(this.f11983o0, ma.e(-1, -1, 1));
            this.f12008z0 = new org.telegram.ui.j4(context);
            if (this.f11952a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.f12008z0.addView(this.D0);
            } else {
                x8 x8Var = new x8(context, this);
                this.C0 = x8Var;
                this.f12008z0.addView(x8Var);
            }
            hi.r3 r3Var = new hi.r3(context, this.h);
            this.E0 = r3Var;
            r3Var.setVisibility(8);
            this.f12008z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f12339a = paint;
            view.f12341c = new sa(view, 26);
            view.d = new org.telegram.ui.Components.c6((View) view);
            view.f12342e = new org.telegram.ui.Components.c6((View) view);
            paint.setColor(-1);
            this.f11962d1 = view;
            this.f12001w.addView((View) view, ma.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        hi.r3 r3Var2 = this.E0;
        if (r3Var2 != null) {
            r3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.f12008z0);
        this.f11992s.addView(this.f12008z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.f12001w);
        this.f11992s.addView(this.f12001w);
        this.f11992s.setClipChildren(false);
        if (this.N0) {
            W();
        }
        if (h6Var != null) {
            this.f11983o0.D(this.h, h6Var.d, h6Var.h());
        } else {
            v8 v8Var3 = this.f11983o0;
            int i12 = this.h;
            v8Var3.B0 = arrayList;
            v8Var3.f12307z0 = i12;
            v8Var3.setAdapter(null);
            v8Var3.setAdapter(v8Var3.A0);
            v8Var3.setCurrentItem(i10);
            v8Var3.D0 = true;
        }
        this.f11981n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f11955b = false;
        }
        if (this.f11955b && Q != null && Q.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f11958c = z14;
        u8 u8Var = this.f12001w;
        di.c7 c7Var = new di.c7(this, 11);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(u8Var, c7Var);
        if (this.f11955b) {
            org.telegram.messenger.g0.E2(this.f11992s);
            this.f11992s.setTag(2131296647, new Object());
            Q.getLayoutContainer().addView(this.f11992s);
            if (!this.f11958c) {
                org.telegram.messenger.g0.Z2(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f11992s.setFocusable(false);
            this.f12001w.setFocusable(false);
            this.f12001w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.w3(this.f11981n, this.f11992s, this.f11989r);
            this.f11981n.addView(this.f11992s, this.f11989r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f11992s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f11992s.requestLayout();
        A1 = true;
        W();
        this.V = 0.0f;
        q();
        f11949x1 = true;
        if (C1) {
            C1 = false;
            if (((AudioManager) this.f11992s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            D1 = z15;
        }
        if (this.f11955b) {
            F(true);
        }
        if (!this.f11955b) {
            f11950y1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void I(Context context, int i7, h6 h6Var, y6 y6Var) {
        this.h = j10.f24770t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(h6Var.d));
        this.P0 = i7;
        M(context, null, arrayList, 0, h6Var, null, y6Var, false);
    }

    public final void J(Context context, long j3, b9 b9Var) {
        this.h = j10.f24770t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        p6 R1 = mp.u1(this.h).R1();
        int i7 = R1.f12382a;
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
                R1.f12387g.remove(y10);
                R1.h.remove(y10);
                ks.f(i7).k(ks.f25230y5, new Object[0]);
            }
        }
        M(context, null, arrayList, 0, null, null, b9Var, false);
    }

    public final void K(Context context, TL_stories.PeerStories peerStories, b9 b9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = j10.f24770t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.n5.o(peerStories.peer)));
            M(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, b9Var, false);
            return;
        }
        this.f12007y0.clear();
    }

    public final void L(Context context, TL_stories.StoryItem storyItem, y6 y6Var) {
        G(j10.f24770t0, context, storyItem, y6Var);
    }

    public final void M(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i7, h6 h6Var, TL_stories.PeerStories peerStories, b9 b9Var, boolean z10) {
        H(j10.f24770t0, context, storyItem, arrayList, i7, h6Var, peerStories, b9Var, z10);
    }

    public final void N(org.telegram.ui.ActionBar.h2 h2Var) {
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f11955b) {
            Q.presentFragment(h2Var);
            return;
        }
        Q.presentFragment(h2Var);
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
        hi.r3 r3Var = this.E0;
        if (r3Var != null) {
            r3Var.b(0L, null);
        }
        c1 c1Var = this.B0;
        if (c1Var != null && !e1.a(c1Var)) {
            c1 c1Var2 = this.B0;
            if (c1Var2.f11795n) {
                c1Var2.s(null);
            } else {
                c1Var2.e();
            }
        }
        this.B0 = null;
        e1 e1Var = e1.f11868w;
        if (e1Var != null && e1Var.f11871c == this) {
            e1Var.f11871c = null;
            f2.a aVar = e1Var.f11874n;
            LaunchActivity launchActivity = e1Var.f11875r;
            if (launchActivity != null) {
                if (launchActivity != null) {
                    launchActivity.f43068a1.remove(aVar);
                }
                e1Var.f11875r = null;
            }
            wi.n nVar = e1Var.f11869a;
            if (nVar != null && nVar.d()) {
                wi.n nVar2 = e1Var.f11869a;
                if (nVar2.f59989c == 0) {
                    e1Var.f11869a = null;
                    e1Var.f11870b = null;
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
        a0.h hVar = mp.u1(this.h).R1().f12392m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((o9) hVar.n(i10)).b(false);
        }
        if (this.f11955b) {
            F(false);
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.f11966f;
        if (h2Var != null) {
            h2Var.removeSheet(this);
        }
        f11950y1.remove(this);
        this.f12007y0.clear();
        this.f11967f0 = 0.0f;
        f11951z1 = null;
    }

    public final void Q(boolean z10) {
        this.f11990r0 = z10;
        if (z10) {
            sa saVar = this.f11962d1.f12341c;
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
        if (this.f11954a1 != z10) {
            this.f11954a1 = z10;
            if (z10 && !this.f11968f1 && (currentPeerView2 = this.f11983o0.getCurrentPeerView()) != null && (x3Var = currentPeerView2.f12893y1) != null && !x3Var.f12724f && x3Var.f12721b == null) {
                if (!this.f11979l0 && !this.f11977k0 && (y3Var = this.G0) != null && ((e9) y3Var.f12772c) != null) {
                    currentPeerView2.M0.invalidate();
                    org.telegram.messenger.q2.IMPACT_LIGHT.a();
                }
                y3 y3Var2 = this.G0;
                if (y3Var2 != null && (e9Var = (e9) y3Var2.f12772c) != null && !this.f11979l0) {
                    e9Var.setSeeking(true);
                }
                this.f11979l0 = true;
            }
            V();
            v8 v8Var = this.f11983o0;
            if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f11954a1);
            }
        }
    }

    public final void S(boolean z10) {
        boolean z11;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (this.f11955b && launchActivity != null) {
            if (z10) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.g0.f24090a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z11 = dd.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z11 = false;
                }
                this.f12005x0 = z11;
            }
            if (this.f12005x0) {
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
        z3 currentPeerView = this.f11983o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f12829h1.a(D1, true);
        }
        if (!D1) {
            this.f11962d1.b();
        }
    }

    public final void V() {
        if (this.f11983o0 == null) {
            return;
        }
        boolean C = C();
        boolean z10 = true;
        if (this.f11955b) {
            org.telegram.ui.ActionBar.h2 h2Var = this.f11966f;
            if (h2Var.isPaused() || !h2Var.isLastFragment()) {
                C = true;
            }
        }
        if (org.telegram.ui.g4.v().W) {
            C = true;
        }
        this.f11983o0.setPaused(C);
        e9 e9Var = this.A0;
        if (e9Var != null) {
            if (C) {
                e9Var.pause();
            } else {
                e9Var.play(B1);
            }
        }
        this.f11983o0.E0 = (this.f12006y || this.H0 || this.I0 || this.f11954a1 || this.f11968f1 || this.f11967f0 != 0.0f || this.f11976j1) ? false : false;
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
        return this.f11992s;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == ks.A5) {
            if (this.O0 == ((h6) objArr[0])) {
                z();
                v8 v8Var = this.f11983o0;
                h6 h6Var = this.O0;
                v8Var.D(this.h, h6Var.d, h6Var.h());
                i5 i5Var = this.f12004x;
                if (i5Var != null) {
                    TL_stories.StoryItem selectedStory = i5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.O0.f12045i.size()) {
                        if (selectedStory != null && selectedStory.f28642id == ((fj) this.O0.f12045i.get(i11)).f23970l.f28642id) {
                            i12 = i11;
                        }
                        arrayList2.add(((fj) this.O0.f12045i.get(i11)).f23970l);
                        i11++;
                    }
                    this.f12004x.b(i12, this.O0.d, arrayList2);
                }
            }
        } else if (i7 == ks.f25230y5) {
            b9 b9Var = this.f11997u0;
            if (b9Var instanceof y6) {
                y6 y6Var = (y6) b9Var;
                if (y6Var.f12787r && !y6Var.f12786n) {
                    p6 R1 = mp.u1(this.h).R1();
                    if (y6Var.f12785f) {
                        arrayList = R1.h;
                    } else {
                        arrayList = R1.f12387g;
                    }
                    ArrayList<Long> dialogIds = this.f11983o0.getDialogIds();
                    boolean z10 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!y6Var.h || R1.L(o4)) && !dialogIds.contains(Long.valueOf(o4))) {
                            dialogIds.add(Long.valueOf(o4));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f11983o0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            i5 i5Var2 = this.f12004x;
            if (i5Var2 != null) {
                ArrayList arrayList3 = i5Var2.h.H;
                while (i11 < arrayList3.size()) {
                    ((e4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = ks.f25094c1;
            if (i7 != i14 && i7 != ks.f25100d1) {
                if (i7 == ks.f25237z5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.T0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f28642id == intValue) {
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
                    this.f11996t1 = e9Var.currentPosition;
                    this.A0.release(null);
                    this.A0 = null;
                    return;
                }
                this.f11996t1 = 0L;
            } else if (!this.f11994s1 && z() != null) {
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
        if (this.f11987q0 != i7) {
            this.f11987q0 = i7;
            this.f11983o0.setKeyboardHeight(i7);
            this.f11983o0.requestLayout();
            i5 i5Var = this.f12004x;
            if (i5Var != null) {
                i5Var.setKeyboardHeight(i7);
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
        boolean z12 = org.telegram.messenger.s2.f26721a;
        if (this.f11982n0 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f11963e != z11) {
            this.f11963e = z11;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            hi.r3 r3Var = this.E0;
            if (r3Var != null) {
                r3Var.setSecure(!z11);
            }
            if (this.f11955b) {
                org.telegram.ui.ActionBar.h2 h2Var = this.f11966f;
                if (h2Var.getParentActivity() != null) {
                    if (z11) {
                        h2Var.getParentActivity().getWindow().clearFlags(8192);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                    h2Var.getParentActivity().getWindow().addFlags(8192);
                    org.telegram.messenger.g0.h2();
                    return;
                }
                return;
            }
            if (z11) {
                this.f11989r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.f11989r.flags |= 8192;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.f11981n.updateViewLayout(this.f11992s, this.f11989r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        if (this.I == null) {
            this.f11977k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11953a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new n8(this, 2));
            this.I.addListener(new o8(this, 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(org.telegram.ui.ActionBar.j1.f29017w);
            this.I.start();
        }
    }

    public final void o(boolean z10) {
        if (this.f12000v1 == null) {
            if (this.f11987q0 != 0) {
                org.telegram.messenger.g0.v1(this.f12004x);
                return;
            }
            float f10 = 0.0f;
            if (!this.f11961d0 && this.f11967f0 == 0.0f) {
                return;
            }
            this.J0.d();
            if (!z10) {
                float f11 = this.f11967f0;
                i5 i5Var = this.f12004x;
                float f12 = i5Var.f12100c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f11967f0 = f13;
                    i5Var.setOffset(f13);
                }
            }
            float f14 = this.f11967f0;
            if (z10) {
                f10 = this.f12004x.f12100c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f12000v1 = ofFloat;
            ofFloat.addUpdateListener(new n8(this, 3));
            this.f12000v1.addListener(new bi.d7(4, this, z10));
            if (z10) {
                this.f12000v1.setDuration(350L);
                this.f12000v1.setInterpolator(lr.h);
            } else {
                this.f12000v1.setDuration(350L);
                this.f12000v1.setInterpolator(lr.f37208f);
            }
            this.f12000v1.start();
        }
    }

    @Override
    public final void p() {
        z3 currentPeerView;
        boolean z10 = false;
        if (this.f11967f0 != 0.0f) {
            i5 i5Var = this.f12004x;
            if (i5Var.f12108y > 0) {
                org.telegram.messenger.g0.v1(i5Var);
                return;
            }
            a5 currentPage = i5Var.getCurrentPage();
            if (currentPage != null) {
                h4 h4Var = currentPage.f11731r;
                p4 p4Var = currentPage.f11729f;
                if (p4Var != null && p4Var.f18055a) {
                    p4Var.a();
                    return;
                } else if (Math.abs(currentPage.f11727c.getTranslationY() - h4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                    h4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                    h4Var.y0(0);
                    return;
                }
            }
            o(false);
            return;
        }
        v8 v8Var = this.f11983o0;
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
        if (this.f11955b && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void r() {
        if (this.f12004x == null) {
            i5 i5Var = new i5(this.f12001w.getContext(), this);
            this.f12004x = i5Var;
            this.f12001w.addView(i5Var, 0);
        }
        z3 currentPeerView = this.f11983o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.O0.f12045i.size(); i7++) {
                    arrayList.add(((fj) this.O0.f12045i.get(i7)).f23970l);
                }
                this.f12004x.b(currentPeerView.getListPosition(), this.O0.d, arrayList);
                return;
            }
            this.f12004x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    @Override
    public final boolean s() {
        return !this.H0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f11999v0 = dialog;
            dialog.setOnDismissListener(new t9(this, 4));
            dialog.show();
            V();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.f11999v0 = null;
            return false;
        }
    }

    public final void u(boolean z10) {
        org.telegram.messenger.g0.v1(this.f11992s);
        this.H0 = true;
        this.f11972h1 = true;
        V();
        S(false);
        W();
        this.J0.d();
        this.f11959c0 = this.X;
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new n8(this, 0));
        if (!z10) {
            this.P = 0.0f;
            this.O = 0.0f;
            c9 c9Var = this.f11995t0;
            ImageReceiver imageReceiver = c9Var.f11817b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = c9Var.f11818c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            c9Var.f11818c = null;
            c9Var.f11817b = null;
        } else {
            E();
        }
        org.telegram.messenger.g0.h3(new e3(this, 2), 16L);
        if (this.f11960c1) {
            this.f11960c1 = false;
        }
    }

    public final void v() {
        z3 z3Var;
        v8 v8Var = this.f11983o0;
        if (v8Var != null) {
            ArrayList arrayList = v8Var.Q0;
            for (int i7 = 0; i7 < v8Var.getChildCount(); i7++) {
                View childAt = v8Var.getChildAt(i7);
                if ((childAt instanceof m7) && (z3Var = ((m7) childAt).f12274a) != null && !z3Var.F3) {
                    z3Var.F3 = true;
                    i2 i2Var = z3Var.L1;
                    if (i2Var != null) {
                        i2Var.Y0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                z3 z3Var2 = (z3) arrayList.get(i10);
                if (!z3Var2.F3) {
                    z3Var2.F3 = true;
                    i2 i2Var2 = z3Var2.L1;
                    if (i2Var2 != null) {
                        i2Var2.Y0();
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
        z3 currentPeerView = this.f11983o0.getCurrentPeerView();
        if (currentPeerView != null) {
            x3 x3Var = currentPeerView.f12893y1;
            if (!x3Var.j() && x3Var.f12723e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f11962d1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void x(Runnable runnable) {
        if (runnable != null) {
            this.f12007y0.add(runnable);
        }
    }

    @Override
    public final boolean y() {
        if (this.f11955b && this.f11992s != null) {
            return true;
        }
        return false;
    }

    public final z3 z() {
        v8 v8Var = this.f11983o0;
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
