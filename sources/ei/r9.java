package ei;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import b8.cg;
import b8.mf;
import ci.ba;
import ci.ec;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
public final class r9 implements cs, org.telegram.ui.ActionBar.z1, wf.a {
    public static TL_stories.StoryItem A1;
    public static boolean B1;
    public static boolean E1;
    public static boolean f10906y1;
    public q9 A0;
    public g1 B0;
    public j9 C0;
    public SurfaceView D0;
    public gi.r3 E0;
    public boolean F;
    public gi.r3 F0;
    public ValueAnimator G;
    public Uri G0;
    public ValueAnimator H;
    public i4 H0;
    public ValueAnimator I;
    public boolean I0;
    public long J;
    public boolean J0;
    public int K;
    public final g2.g K0;
    public float L;
    public boolean L0;
    public float M;
    public boolean M0;
    public f7 N;
    public final ArrayList N0;
    public float O;
    public boolean O0;
    public float P;
    public r6 P0;
    public float Q;
    public int Q0;
    public float R;
    public TL_stories.PeerStories R0;
    public float S;
    public boolean S0;
    public float T;
    public boolean T0;
    public TL_stories.StoryItem U0;
    public float V;
    public int V0;
    public float W;
    public boolean W0;
    public float X;
    public int[] X0;
    public float Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public float f10909a0;
    public boolean f10910a1;
    public boolean f10912b0;
    public boolean f10913b1;
    public float f10915c0;
    public final o3 f10916c1;
    public boolean f10917d0;
    public boolean f10918d1;
    public float f10920e0;
    public y7 f10921e1;
    public final org.telegram.ui.ActionBar.d2 f10922f;
    public float f10923f0;
    public final LongSparseIntArray f10924f1;
    public boolean f10925g0;
    public boolean f10926g1;
    public int h;
    public boolean f10927h0;
    public boolean f10928h1;
    public boolean f10929i0;
    public boolean f10930i1;
    public GestureDetector f10931j0;
    public boolean f10932j1;
    public boolean f10933k0;
    public boolean k1;
    public boolean f10934l0;
    public boolean f10935l1;
    public boolean m0;
    public boolean m1;
    public WindowManager f10936n;
    public boolean f10937n0;
    public boolean f10938n1;
    public g9 f10939o0;
    public z5 f10940o1;
    public o3 f10942p1;
    public int f10943q0;
    public boolean f10944q1;
    public WindowManager.LayoutParams f10945r;
    public boolean f10946r0;
    public float f10947r1;
    public e9 f10948s;
    public float f10949s0;
    public boolean f10950s1;
    public final o9 f10951t0;
    public boolean f10952t1;
    public n9 f10953u0;
    public long f10954u1;
    public Dialog f10955v0;
    public d7 f10956v1;
    public f9 f10957w;
    public org.telegram.ui.ActionBar.z1 f10958w0;
    public ValueAnimator f10959w1;
    public s5 f10960x;
    public boolean f10961x0;
    public boolean f10962x1;
    public boolean f10963y;
    public final ArrayList f10964y0;
    public org.telegram.ui.l4 f10965z0;
    public static final ArrayList f10907z1 = new ArrayList();
    public static float C1 = 1.0f;
    public static boolean D1 = true;
    public static final LongSparseArray F1 = new LongSparseArray();
    public boolean f10908a = az.f21616b0;
    public boolean f10911b = true;
    public boolean f10914c = false;
    public boolean d = false;
    public boolean f10919e = true;
    public final b E = new b();
    public final RectF U = new RectF();
    public final float[] f10941p0 = new float[2];

    public r9(org.telegram.ui.ActionBar.d2 d2Var) {
        ?? obj = new Object();
        obj.f10734k = 1.0f;
        this.f10951t0 = obj;
        this.f10964y0 = new ArrayList();
        this.I0 = true;
        this.K0 = new g2.g((int[]) null);
        this.N0 = new ArrayList();
        this.f10910a1 = false;
        this.f10916c1 = new o3(this, 4);
        this.f10924f1 = new LongSparseIntArray();
        new Paint(1);
        this.f10922f = d2Var;
    }

    public static CharSequence I(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return "";
        }
        return (CharSequence) F1.get(j10 + (j10 >> 16) + (storyItem.f27240id << 16), "");
    }

    public static boolean L(zi ziVar) {
        if (A1 == null || ((ziVar.D != 23 && !ziVar.a5()) || B1 || A1.messageId != ziVar.f1() || A1.messageType == 3)) {
            return false;
        }
        return true;
    }

    public static void X(long j10, TL_stories.StoryItem storyItem, Editable editable) {
        if (j10 != 0 && storyItem != null) {
            F1.put(j10 + (j10 >> 16) + (storyItem.f27240id << 16), editable);
        }
    }

    public static boolean u(r9 r9Var, e9 e9Var, float f10, float f11, boolean z10) {
        s2 s2Var;
        s2 s2Var2;
        if (e9Var != null) {
            if (!r9Var.Y0) {
                if (r9Var.f10960x == null || r9Var.f10923f0 == 0.0f) {
                    j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                        if (!currentPeerView.E0(currentPeerView, ((f10 - r9Var.f10957w.getX()) - r9Var.f10939o0.getX()) - currentPeerView.getX(), ((f11 - r9Var.f10957w.getY()) - r9Var.f10939o0.getY()) - currentPeerView.getY(), z10)) {
                            if (currentPeerView.f10456f2) {
                                return false;
                            }
                        } else {
                            return true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                    if (currentPeerView != null && (s2Var2 = currentPeerView.L1) != null && s2Var2.getVisibility() == 0) {
                        if (f11 > currentPeerView.L1.getY() + currentPeerView.getY() + r9Var.f10939o0.getY() + r9Var.f10957w.getY()) {
                            return true;
                        }
                    }
                    if ((currentPeerView != null && (s2Var = currentPeerView.L1) != null && s2Var.u0()) || r9Var.f10956v1 != null) {
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

    public static void v(r9 r9Var) {
        ec ecVar;
        xs editField;
        j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.L1 != null && (((ecVar = currentPeerView.L2) == null || ecVar.getVisibility() != 0) && (editField = currentPeerView.L1.getEditField()) != null)) {
            editField.requestFocus();
            org.telegram.messenger.g0.K3(editField);
            org.telegram.messenger.g0.i3(new o3(r9Var, 6), 200L);
            return;
        }
        r9Var.z();
    }

    public static void w(r9 r9Var) {
        float l10 = Utilities.l(Math.abs(Math.max(r9Var.Y, r9Var.X) / org.telegram.messenger.g0.L(80.0f)));
        if (r9Var.W != l10) {
            r9Var.W = l10;
            r9Var.B();
            j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.f10464h2) {
                currentPeerView.invalidate();
            }
            g1 g1Var = r9Var.B0;
            if (g1Var != null) {
                g1Var.v((1.0f - r9Var.W) * r9Var.V);
            }
        }
        e9 e9Var = r9Var.f10948s;
        if (e9Var != null) {
            e9Var.invalidate();
        }
    }

    public final void A(boolean z10) {
        if (this.f10959w1 == null) {
            if (this.f10943q0 != 0) {
                org.telegram.messenger.g0.v1(this.f10960x);
                return;
            }
            float f10 = 0.0f;
            if (!this.f10917d0 && this.f10923f0 == 0.0f) {
                return;
            }
            this.K0.d();
            if (!z10) {
                float f11 = this.f10923f0;
                s5 s5Var = this.f10960x;
                float f12 = s5Var.f10999c;
                if (f11 == f12) {
                    float f13 = f12 - 1.0f;
                    this.f10923f0 = f13;
                    s5Var.setOffset(f13);
                }
            }
            float f14 = this.f10923f0;
            if (z10) {
                f10 = this.f10960x.f10999c;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
            this.f10959w1 = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 3));
            this.f10959w1.addListener(new dh.x(4, this, z10));
            if (z10) {
                this.f10959w1.setDuration(350L);
                this.f10959w1.setInterpolator(xq.h);
            } else {
                this.f10959w1.setDuration(350L);
                this.f10959w1.setInterpolator(xq.f40452f);
            }
            this.f10959w1.start();
        }
    }

    public final void B() {
        LaunchActivity launchActivity;
        if (this.f10911b && (launchActivity = LaunchActivity.K1) != null) {
            launchActivity.F(true, true, true);
        }
    }

    public final void C() {
        if (this.f10960x == null) {
            s5 s5Var = new s5(this.f10957w.getContext(), this);
            this.f10960x = s5Var;
            this.f10957w.addView(s5Var, 0);
        }
        j4 currentPeerView = this.f10939o0.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.P0 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.P0.f10876i.size(); i3++) {
                    arrayList.add(((zi) this.P0.f10876i.get(i3)).f26871l);
                }
                this.f10960x.b(currentPeerView.getListPosition(), this.P0.d, arrayList);
                return;
            }
            this.f10960x.b(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
        }
    }

    public final void D(boolean z10) {
        org.telegram.messenger.g0.v1(this.f10948s);
        this.I0 = true;
        this.f10930i1 = true;
        d0();
        a0(false);
        e0();
        this.K0.d();
        this.f10915c0 = this.X;
        this.F = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new x8(this, 0));
        if (!z10) {
            this.P = 0.0f;
            this.O = 0.0f;
            o9 o9Var = this.f10951t0;
            ImageReceiver imageReceiver = o9Var.f10727b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = o9Var.f10728c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            o9Var.f10728c = null;
            o9Var.f10727b = null;
        } else {
            M();
        }
        org.telegram.messenger.g0.i3(new o3(this, 2), 16L);
        if (this.f10918d1) {
            this.f10918d1 = false;
        }
    }

    public final void E() {
        j4 j4Var;
        g9 g9Var = this.f10939o0;
        if (g9Var != null) {
            ArrayList arrayList = g9Var.Q0;
            for (int i3 = 0; i3 < g9Var.getChildCount(); i3++) {
                View childAt = g9Var.getChildAt(i3);
                if ((childAt instanceof w7) && (j4Var = ((w7) childAt).f11189a) != null && !j4Var.F3) {
                    j4Var.F3 = true;
                    s2 s2Var = j4Var.L1;
                    if (s2Var != null) {
                        s2Var.A0();
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j4 j4Var2 = (j4) arrayList.get(i10);
                if (!j4Var2.F3) {
                    j4Var2.F3 = true;
                    s2 s2Var2 = j4Var2.L1;
                    if (s2Var2 != null) {
                        s2Var2.A0();
                    }
                }
            }
        }
    }

    public final void F(KeyEvent keyEvent) {
        if (E1) {
            c0();
            return;
        }
        j4 currentPeerView = this.f10939o0.getCurrentPeerView();
        if (currentPeerView != null) {
            h4 h4Var = currentPeerView.f10527y1;
            if (!h4Var.j() && h4Var.f10361e) {
                currentPeerView.a1(true);
                return;
            }
        }
        this.f10921e1.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    public final void G(Runnable runnable) {
        if (runnable != null) {
            this.f10964y0.add(runnable);
        }
    }

    public final j4 H() {
        g9 g9Var = this.f10939o0;
        if (g9Var == null) {
            return null;
        }
        return g9Var.getCurrentPeerView();
    }

    public final void J() {
        if (this.f10937n0) {
            org.telegram.messenger.g0.v1(this.f10948s);
            this.I0 = true;
            this.L0 = false;
            this.V = 0.0f;
            this.W = 0.0f;
            d0();
            this.P = 0.0f;
            this.O = 0.0f;
            o9 o9Var = this.f10951t0;
            ImageReceiver imageReceiver = o9Var.f10727b;
            if (imageReceiver != null) {
                imageReceiver.O0(true, true);
            }
            ImageReceiver imageReceiver2 = o9Var.f10728c;
            if (imageReceiver2 != null) {
                imageReceiver2.O0(true, true);
            }
            o9Var.f10728c = null;
            o9Var.f10727b = null;
            f9 f9Var = this.f10957w;
            if (f9Var != null) {
                f9Var.a(true);
            }
            this.K0.e();
            i4 i4Var = this.H0;
            if (i4Var != null) {
                i4Var.b();
            }
            W();
            if (this.f10911b) {
                org.telegram.messenger.g0.E2(this.f10948s);
            } else {
                this.f10936n.removeView(this.f10948s);
            }
            this.f10948s = null;
            E();
            this.f10937n0 = false;
            this.d = false;
            B();
            o3 o3Var = this.f10942p1;
            if (o3Var != null) {
                o3Var.run();
                this.f10942p1 = null;
            }
        }
    }

    public final boolean K() {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (!this.Y0 && !this.f10910a1 && !this.Z0 && !this.M0 && !this.f10946r0 && !this.f10963y && this.f10955v0 == null && this.f10958w0 == null && !this.I0 && !this.J0 && this.V == 1.0f && this.f10923f0 == 0.0f && !this.f10932j1) {
            if ((!this.m1 || !this.f10908a) && !this.f10935l1 && !this.k1 && !this.f10944q1 && this.W == 0.0f && this.f10956v1 == null) {
                if (!this.f10911b || (d2Var = this.f10922f) == null || d2Var.getLastStoryViewer() == this) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: ei.r9.M():void");
    }

    public final void N(boolean z10) {
        int i3;
        Activity W = org.telegram.messenger.g0.W(this.f10922f.getContext());
        if (W != null) {
            if (z10) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            try {
                W.setRequestedOrientation(i3);
            } catch (Exception unused) {
            }
            if (z10) {
                W.getWindow().addFlags(128);
            } else {
                W.getWindow().clearFlags(128);
            }
        }
    }

    public final void O(int i3, Context context, TL_stories.StoryItem storyItem, n9 n9Var) {
        if (storyItem != null) {
            this.h = i3;
            if (storyItem.dialogId <= 0 || hp.s1(i3).a2(Long.valueOf(storyItem.dialogId)) != null) {
                if (storyItem.dialogId < 0 && hp.s1(this.h).M0(Long.valueOf(-storyItem.dialogId)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                P(i3, context, storyItem, arrayList, 0, null, null, n9Var, false);
            }
        }
    }

    public final void P(int i3, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i10, r6 r6Var, TL_stories.PeerStories peerStories, n9 n9Var, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        boolean E12 = org.telegram.messenger.g0.E1(context);
        ArrayList arrayList2 = this.f10964y0;
        if (!E12) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (this.f10937n0) {
            arrayList2.clear();
            return;
        }
        C1 = 1.0f;
        q9 q9Var = this.A0;
        if (q9Var != null) {
            q9Var.setSpeed(1.0f);
        }
        boolean z15 = false;
        if (!org.telegram.messenger.g0.Q1() && !this.f10950s1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f10911b = z11;
        if (az.f21616b0 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f10908a = z12;
        if (storyItem == null) {
            i11 = 0;
        } else {
            i11 = storyItem.messageId;
        }
        this.V0 = i11;
        if (storyItem != null && r6Var == null && peerStories == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.O0 = z13;
        this.T0 = false;
        if (storyItem != null) {
            this.U0 = storyItem;
            A1 = storyItem;
        }
        this.P0 = r6Var;
        this.R0 = peerStories;
        this.f10953u0 = n9Var;
        this.S0 = z10;
        this.h = i3;
        this.X = 0.0f;
        this.Y = 0.0f;
        g9 g9Var = this.f10939o0;
        if (g9Var != null) {
            g9Var.setHorizontalProgressToDismiss(0.0f);
            this.f10939o0.G0 = 0;
        }
        this.f10920e0 = 0.0f;
        this.f10909a0 = 0.0f;
        this.m0 = false;
        this.W = 0.0f;
        this.f10937n0 = true;
        this.f10913b1 = false;
        this.f10910a1 = false;
        this.f10924f1.clear();
        org.telegram.messenger.g0.r(this.f10916c1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f10945r = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        org.telegram.messenger.g0.m(layoutParams);
        this.f10945r.flags = -2147417728;
        this.I0 = false;
        this.f10918d1 = false;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (this.f10948s == null) {
            this.f10931j0 = new GestureDetector(new a9(this));
            this.f10948s = new e9(this, context, Q);
        }
        if (this.f10957w == null) {
            this.f10957w = new f9(context, this);
            g9 g9Var2 = new g9(this, this.h, context, this, this.E);
            this.f10939o0 = g9Var2;
            g9Var2.setDelegate(new i9(this, r6Var, arrayList, context));
            this.f10957w.addView(this.f10939o0, mf.e(-1, -1, 1));
            this.f10965z0 = new org.telegram.ui.l4(context);
            if (this.f10908a) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.D0 = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.D0.setZOrderOnTop(false);
                this.f10965z0.addView(this.D0);
            } else {
                j9 j9Var = new j9(context, this);
                this.C0 = j9Var;
                this.f10965z0.addView(j9Var);
            }
            gi.r3 r3Var = new gi.r3(context, this.h);
            this.E0 = r3Var;
            r3Var.setVisibility(8);
            this.f10965z0.addView(this.E0);
            ?? view = new View(context);
            Paint paint = new Paint(1);
            view.f11245a = paint;
            view.f11247c = new a3.o(view, 22);
            view.d = new org.telegram.ui.Components.u5((View) view);
            view.f11248e = new org.telegram.ui.Components.u5((View) view);
            paint.setColor(-1);
            this.f10921e1 = view;
            this.f10957w.addView((View) view, mf.d(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        gi.r3 r3Var2 = this.E0;
        if (r3Var2 != null) {
            r3Var2.setAccount(this.h);
        }
        org.telegram.messenger.g0.E2(this.f10965z0);
        this.f10948s.addView(this.f10965z0);
        SurfaceView surfaceView2 = this.D0;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        org.telegram.messenger.g0.E2(this.f10957w);
        this.f10948s.addView(this.f10957w);
        this.f10948s.setClipChildren(false);
        if (this.O0) {
            e0();
        }
        if (r6Var != null) {
            this.f10939o0.D(this.h, r6Var.d, r6Var.h());
        } else {
            g9 g9Var3 = this.f10939o0;
            int i12 = this.h;
            g9Var3.B0 = arrayList;
            g9Var3.f11212z0 = i12;
            g9Var3.setAdapter(null);
            g9Var3.setAdapter(g9Var3.A0);
            g9Var3.setCurrentItem(i10);
            g9Var3.D0 = true;
        }
        this.f10936n = (WindowManager) context.getSystemService("window");
        if (Q == null || Q.getLayoutContainer() == null || Q.isSupportEdgeToEdge()) {
            this.f10911b = false;
        }
        if (this.f10911b && Q != null && Q.isSupportEdgeToEdge()) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f10914c = z14;
        f9 f9Var = this.f10957w;
        y8 y8Var = new y8(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(f9Var, y8Var);
        if (this.f10911b) {
            org.telegram.messenger.g0.E2(this.f10948s);
            this.f10948s.setTag(2131296647, new Object());
            Q.getLayoutContainer().addView(this.f10948s);
            if (!this.f10914c) {
                org.telegram.messenger.g0.a3(Q.getParentActivity(), Q.getClassGuid());
            }
        } else {
            this.f10948s.setFocusable(false);
            this.f10957w.setFocusable(false);
            this.f10957w.setSystemUiVisibility(1792);
            org.telegram.messenger.g0.y3(this.f10936n, this.f10948s, this.f10945r);
            this.f10936n.addView(this.f10948s, this.f10945r);
            if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.f10948s.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 1));
            }
        }
        this.f10948s.requestLayout();
        B1 = true;
        e0();
        this.V = 0.0f;
        B();
        f10906y1 = true;
        if (D1) {
            D1 = false;
            if (((AudioManager) this.f10948s.getContext().getSystemService("audio")).getRingerMode() != 2) {
                z15 = true;
            }
            E1 = z15;
        }
        if (this.f10911b) {
            N(true);
        }
        if (!this.f10911b) {
            f10907z1.add(this);
        }
        if (Q != null) {
            org.telegram.messenger.g0.v1(Q.getFragmentView());
        }
    }

    public final void Q(Context context, int i3, r6 r6Var, i7 i7Var) {
        this.h = h10.f22829t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(r6Var.d));
        this.Q0 = i3;
        U(context, null, arrayList, 0, r6Var, null, i7Var, false);
    }

    public final void R(Context context, long j10, n9 n9Var) {
        this.h = h10.f22829t0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        z6 P1 = hp.s1(this.h).P1();
        int i3 = P1.f11274a;
        TL_stories.PeerStories y9 = P1.y(j10);
        if (y9 != null) {
            int i10 = 0;
            while (i10 < y9.stories.size()) {
                if (s7.w(i3, y9.stories.get(i10))) {
                    y9.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (y9.stories.isEmpty() && !P1.L(j10)) {
                P1.f11279g.remove(y9);
                P1.h.remove(y9);
                hs.f(i3).k(hs.f23324v5, new Object[0]);
            }
        }
        U(context, null, arrayList, 0, null, null, n9Var, false);
    }

    public final void S(Context context, TL_stories.PeerStories peerStories, n9 n9Var) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.h = h10.f22829t0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(org.telegram.messenger.m5.o(peerStories.peer)));
            U(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, n9Var, false);
            return;
        }
        this.f10964y0.clear();
    }

    public final void T(Context context, TL_stories.StoryItem storyItem, i7 i7Var) {
        O(h10.f22829t0, context, storyItem, i7Var);
    }

    public final void U(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i3, r6 r6Var, TL_stories.PeerStories peerStories, n9 n9Var, boolean z10) {
        P(h10.f22829t0, context, storyItem, arrayList, i3, r6Var, peerStories, n9Var, z10);
    }

    public final void V(org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (this.f10911b) {
            Q.presentFragment(d2Var);
            return;
        }
        Q.presentFragment(d2Var);
        D(false);
    }

    public final void W() {
        ArrayList arrayList;
        this.G0 = null;
        Y(false);
        x(true);
        q9 q9Var = this.A0;
        if (q9Var != null) {
            q9Var.release(null);
            this.A0 = null;
        }
        gi.r3 r3Var = this.E0;
        if (r3Var != null) {
            r3Var.d(0L, null);
        }
        g1 g1Var = this.B0;
        if (g1Var != null) {
            n1 n1Var = n1.f10647a0;
            if (!n1Var.T || n1Var.f10656w != g1Var) {
                if (g1Var.f10301n) {
                    g1Var.s(null);
                } else {
                    g1Var.e();
                }
            }
        }
        this.B0 = null;
        int i3 = 0;
        while (true) {
            arrayList = this.N0;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((q9) arrayList.get(i3)).release(null);
            i3++;
        }
        arrayList.clear();
        a0.h hVar = hp.s1(this.h).P1().f11284m;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            ((aa) hVar.n(i10)).b(false);
        }
        if (this.f10911b) {
            N(false);
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f10922f;
        if (d2Var != null) {
            d2Var.removeSheet(this);
        }
        f10907z1.remove(this);
        this.f10964y0.clear();
        this.f10923f0 = 0.0f;
        A1 = null;
    }

    public final void Y(boolean z10) {
        this.f10946r0 = z10;
        if (z10) {
            a3.o oVar = this.f10921e1.f11247c;
            org.telegram.messenger.g0.r(oVar);
            oVar.run();
        }
        d0();
    }

    public final void Z(boolean z10) {
        j4 currentPeerView;
        j4 currentPeerView2;
        h4 h4Var;
        q9 q9Var;
        i4 i4Var;
        if (this.f10913b1 != z10) {
            this.f10913b1 = z10;
            if (z10 && !this.f10926g1 && (currentPeerView2 = this.f10939o0.getCurrentPeerView()) != null && (h4Var = currentPeerView2.f10527y1) != null && !h4Var.f10362f && h4Var.f10359b == null) {
                if (!this.f10934l0 && !this.f10933k0 && (i4Var = this.H0) != null && ((q9) i4Var.f10404c) != null) {
                    currentPeerView2.M0.invalidate();
                    org.telegram.messenger.p2.IMPACT_LIGHT.a();
                }
                i4 i4Var2 = this.H0;
                if (i4Var2 != null && (q9Var = (q9) i4Var2.f10404c) != null && !this.f10934l0) {
                    q9Var.setSeeking(true);
                }
                this.f10934l0 = true;
            }
            d0();
            g9 g9Var = this.f10939o0;
            if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
                currentPeerView.setLongpressed(this.f10913b1);
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        D(true);
    }

    public final void a0(boolean z10) {
        boolean z11;
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (this.f10911b && launchActivity != null) {
            if (z10) {
                Window window = launchActivity.getWindow();
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                if (Build.VERSION.SDK_INT >= 26) {
                    z11 = x7.u.a(window.getDecorView().getSystemUiVisibility(), 16);
                } else {
                    z11 = false;
                }
                this.f10961x0 = z11;
            }
            if (this.f10961x0) {
                org.telegram.messenger.g0.m3(launchActivity, !z10);
            }
        }
    }

    public final void b0() {
        org.telegram.ui.ActionBar.d2 d2Var;
        Context context;
        if (this.B0 != null && (d2Var = this.f10922f) != null && this.E0 != null) {
            Activity W = org.telegram.messenger.g0.W(d2Var.getContext());
            if (xf.b.a(W) > 0) {
                g1 g1Var = this.B0;
                n1 n1Var = n1.f10647a0;
                if (g1Var != null && !n1Var.T) {
                    n1Var.T = true;
                    n1Var.f10656w = g1Var;
                    int i3 = g1Var.f10299e;
                    n1Var.f10657x = i3;
                    hs.f(i3).b(n1Var, hs.G2);
                    n1Var.K = n1Var.h();
                    n1Var.L = n1Var.f();
                    n1Var.N = 1.0f;
                    n1Var.I = false;
                    q1.g gVar = new q1.g(n1Var, n1.Y);
                    q1.h hVar = new q1.h();
                    hVar.a(0.75f);
                    hVar.b(650.0f);
                    gVar.f53653m = hVar;
                    n1Var.Q = gVar;
                    q1.g gVar2 = new q1.g(n1Var, n1.Z);
                    q1.h hVar2 = new q1.h();
                    hVar2.a(0.75f);
                    hVar2.b(650.0f);
                    gVar2.f53653m = hVar2;
                    n1Var.R = gVar2;
                    if (W != null) {
                        context = W;
                    } else {
                        context = org.telegram.messenger.t0.f25457b;
                    }
                    int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new Object());
                    n1Var.f10658y = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    n1Var.f10658y.setStylusScaleEnabled(false);
                    n1Var.E = new y00(context, new j1(scaledTouchSlop));
                    k1 k1Var = new k1(context, 0);
                    k1Var.f10561b = new Path();
                    n1Var.f10651e = k1Var;
                    ?? viewGroup = new ViewGroup(context);
                    n1Var.d = viewGroup;
                    viewGroup.addView(n1Var.f10651e, mf.c(-1.0f, -1));
                    n1Var.f10651e.setOutlineProvider(new cg.p0(2));
                    n1Var.f10651e.setClipToOutline(true);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Ug, n1Var.f10651e, null);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                    n1Var.f10653n = k9Var;
                    n1Var.f10651e.addView(k9Var, mf.c(-1.0f, -1));
                    gi.r3 r3Var = new gi.r3(context, n1Var.f10657x);
                    n1Var.f10652f = r3Var;
                    r3Var.setAlpha(0.0f);
                    n1Var.f10651e.addView(n1Var.f10652f, mf.c(-1.0f, -1));
                    sm smVar = new sm(context, 1);
                    n1Var.f10654r = smVar;
                    n1Var.f10651e.addView(smVar, mf.c(-1.0f, -1));
                    FrameLayout frameLayout = new FrameLayout(context);
                    n1Var.h = frameLayout;
                    frameLayout.setAlpha(0.0f);
                    View view = new View(context);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{1140850688, 0});
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                    view.setBackground(gradientDrawable);
                    n1Var.h.addView(view, mf.c(-1.0f, -1));
                    int L = org.telegram.messenger.g0.L(8.0f);
                    ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232545);
                    int i10 = org.telegram.ui.ActionBar.k6.Vg;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    org.telegram.ui.ActionBar.r6.t(e10, i10, null, mode);
                    int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
                    e10.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1));
                    e10.setPadding(L, L, L, L);
                    e10.setOnClickListener(new ai.t(5));
                    float f10 = 38;
                    float f11 = 4;
                    n1Var.h.addView(e10, mf.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131232546);
                    org.telegram.ui.ActionBar.r6.t(imageView, i10, null, mode);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1));
                    imageView.setPadding(L, L, L, L);
                    imageView.setOnClickListener(new ai.d(15, g1Var, context));
                    n1Var.h.addView(imageView, mf.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
                    n1Var.f10651e.addView(n1Var.h, mf.c(-1.0f, -1));
                    n1Var.f10649b = (WindowManager) context.getSystemService("window");
                    WindowManager.LayoutParams b10 = xf.b.b(context, false);
                    n1Var.f10650c = b10;
                    int i12 = n1Var.K;
                    b10.width = i12;
                    b10.height = n1Var.L;
                    Point point = org.telegram.messenger.g0.f22608q;
                    float L2 = (point.x - i12) - org.telegram.messenger.g0.L(16.0f);
                    n1Var.O = L2;
                    b10.x = (int) L2;
                    WindowManager.LayoutParams layoutParams = n1Var.f10650c;
                    float L3 = (point.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f);
                    n1Var.P = L3;
                    layoutParams.y = (int) L3;
                    WindowManager.LayoutParams layoutParams2 = n1Var.f10650c;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.flags = 520;
                    n1Var.d.setAlpha(0.0f);
                    n1Var.d.setScaleX(0.1f);
                    n1Var.d.setScaleY(0.1f);
                    org.telegram.messenger.g0.y3(n1Var.f10649b, n1Var.d, n1Var.f10650c);
                    n1Var.f10649b.addView(n1Var.d, n1Var.f10650c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(xq.f40452f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(n1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(n1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(n1Var.d, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new m1(0));
                    animatorSet.start();
                    n1Var.a();
                    hs.e().k(hs.F2, new Object[0]);
                    uf.d dVar = n1Var.M;
                    if (dVar != null) {
                        dVar.c();
                        n1Var.M = null;
                    }
                    if (W != null && xf.b.a(W) == 1) {
                        uf.c cVar = new uf.c(W, n1Var);
                        cVar.f55840c = "pip-live-story";
                        cVar.f55841e = 1;
                        cVar.d = org.telegram.messenger.g0.L(10.0f);
                        cVar.f55845j = n1Var.d;
                        cVar.f55846k = n1Var.f10652f.getPlaceholderView();
                        n1Var.M = cVar.a();
                    }
                }
                D(true);
            }
        }
    }

    @Override
    public final void c(cg cgVar) {
        gi.r3 r3Var = this.F0;
        if (r3Var != null) {
            r3Var.setOnFirstFrameCallback(cgVar);
            this.B0.s(this.F0.getSink());
        }
        if (this.f10911b) {
            org.telegram.messenger.g0.E2(this.f10948s);
        } else {
            this.f10936n.removeView(this.f10948s);
        }
        this.f10948s.invalidate();
    }

    public final void c0() {
        boolean z10 = E1;
        E1 = !z10;
        q9 q9Var = this.A0;
        int i3 = 0;
        if (q9Var != null) {
            q9Var.setAudioEnabled(z10, false);
        }
        while (true) {
            ArrayList arrayList = this.N0;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((q9) arrayList.get(i3)).setAudioEnabled(!E1, true);
            i3++;
        }
        j4 currentPeerView = this.f10939o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.f10463h1.a(E1, true);
        }
        if (!E1) {
            this.f10921e1.b();
        }
    }

    @Override
    public final View d() {
        return this.f10948s;
    }

    public final void d0() {
        if (this.f10939o0 == null) {
            return;
        }
        boolean K = K();
        boolean z10 = true;
        if (this.f10911b) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f10922f;
            if (d2Var.isPaused() || !d2Var.isLastFragment()) {
                K = true;
            }
        }
        if (org.telegram.ui.i4.v().W) {
            K = true;
        }
        this.f10939o0.setPaused(K);
        q9 q9Var = this.A0;
        if (q9Var != null) {
            if (K) {
                q9Var.pause();
            } else {
                q9Var.play(C1);
            }
        }
        this.f10939o0.E0 = (this.f10963y || this.I0 || this.J0 || this.f10913b1 || this.f10926g1 || this.f10923f0 != 0.0f || this.k1) ? false : false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i3 == hs.f23338x5) {
            if (this.P0 == ((r6) objArr[0])) {
                H();
                g9 g9Var = this.f10939o0;
                r6 r6Var = this.P0;
                g9Var.D(this.h, r6Var.d, r6Var.h());
                s5 s5Var = this.f10960x;
                if (s5Var != null) {
                    TL_stories.StoryItem selectedStory = s5Var.getSelectedStory();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i11 < this.P0.f10876i.size()) {
                        if (selectedStory != null && selectedStory.f27240id == ((zi) this.P0.f10876i.get(i11)).f26871l.f27240id) {
                            i12 = i11;
                        }
                        arrayList2.add(((zi) this.P0.f10876i.get(i11)).f26871l);
                        i11++;
                    }
                    this.f10960x.b(i12, this.P0.d, arrayList2);
                }
            }
        } else if (i3 == hs.f23324v5) {
            n9 n9Var = this.f10953u0;
            if (n9Var instanceof i7) {
                i7 i7Var = (i7) n9Var;
                if (i7Var.f10421r && !i7Var.f10420n) {
                    z6 P1 = hp.s1(this.h).P1();
                    if (i7Var.f10419f) {
                        arrayList = P1.h;
                    } else {
                        arrayList = P1.f11279g;
                    }
                    ArrayList<Long> dialogIds = this.f10939o0.getDialogIds();
                    boolean z10 = false;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i13)).peer);
                        if ((!i7Var.h || P1.L(o10)) && !dialogIds.contains(Long.valueOf(o10))) {
                            dialogIds.add(Long.valueOf(o10));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.f10939o0.getAdapter().g();
                    }
                } else {
                    return;
                }
            }
            s5 s5Var2 = this.f10960x;
            if (s5Var2 != null) {
                ArrayList arrayList3 = s5Var2.h.H;
                while (i11 < arrayList3.size()) {
                    ((o4) arrayList3.get(i11)).b();
                    i11++;
                }
            }
        } else {
            int i14 = hs.f23209c1;
            if (i3 != i14 && i3 != hs.f23214d1) {
                if (i3 == hs.f23331w5) {
                    long longValue = ((Long) objArr[0]).longValue();
                    int intValue = ((Integer) objArr[1]).intValue();
                    TL_stories.StoryItem storyItem = this.U0;
                    if (storyItem != null && storyItem.dialogId == longValue && storyItem.f27240id == intValue) {
                        this.T0 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            d0();
            if (i3 == i14) {
                q9 q9Var = this.A0;
                if (q9Var != null) {
                    this.f10954u1 = q9Var.currentPosition;
                    this.A0.release(null);
                    this.A0 = null;
                    return;
                }
                this.f10954u1 = 0L;
            } else if (!this.f10952t1 && H() != null) {
                H().d1(false);
            }
        }
    }

    @Override
    public final void dismiss() {
        D(true);
    }

    @Override
    public final int e(int i3) {
        return i0.a.f((((1.0f - this.W) * 0.5f) + 0.5f) * this.V, i3, -16777216);
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: ei.r9.e0():void");
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final Bitmap g() {
        gi.r3 r3Var = this.F0;
        if (r3Var != null && r3Var.a()) {
            return this.F0.getBitmap();
        }
        return null;
    }

    @Override
    public final void h(int i3) {
        if (this.f10943q0 != i3) {
            this.f10943q0 = i3;
            this.f10939o0.setKeyboardHeight(i3);
            this.f10939o0.requestLayout();
            s5 s5Var = this.f10960x;
            if (s5Var != null) {
                s5Var.setKeyboardHeight(i3);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.L0;
    }

    @Override
    public final fc k() {
        return null;
    }

    @Override
    public final Bitmap l() {
        gi.r3 r3Var = this.E0;
        if (r3Var != null && r3Var.a()) {
            return this.E0.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean o() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f10922f;
        if (d2Var != null && H() != null && org.telegram.messenger.g0.W(d2Var.getContext()) != null && this.B0 != null && this.E0 != null && !this.I0) {
            return true;
        }
        return false;
    }

    @Override
    public final void p() {
        j4 currentPeerView;
        boolean z10 = false;
        if (this.f10923f0 != 0.0f) {
            s5 s5Var = this.f10960x;
            if (s5Var.f11007y > 0) {
                org.telegram.messenger.g0.v1(s5Var);
                return;
            }
            k5 currentPage = s5Var.getCurrentPage();
            if (currentPage != null) {
                r4 r4Var = currentPage.f10577r;
                z4 z4Var = currentPage.f10575f;
                if (z4Var != null && z4Var.f16384a) {
                    z4Var.a();
                    return;
                } else if (Math.abs(currentPage.f10573c.getTranslationY() - r4Var.getPaddingTop()) > org.telegram.messenger.g0.L(2.0f)) {
                    r4Var.dispatchTouchEvent(org.telegram.messenger.g0.R());
                    r4Var.y0(0);
                    return;
                }
            }
            A(false);
            return;
        }
        g9 g9Var = this.f10939o0;
        if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
            z10 = currentPeerView.q0();
        }
        if (z10) {
            return;
        }
        D(true);
    }

    @Override
    public final View q() {
        gi.r3 r3Var = new gi.r3(this.E0.getContext(), this.h);
        this.F0 = r3Var;
        return r3Var;
    }

    @Override
    public final void r(cg cgVar) {
        gi.r3 r3Var = this.F0;
        if (r3Var != null) {
            r3Var.setOnFirstFrameCallback(cgVar);
        }
        if (this.f10911b) {
            org.telegram.messenger.g0.E2(this.f10948s);
            this.f10922f.getLayoutContainer().addView(this.f10948s);
        } else {
            this.f10936n.addView(this.f10948s, this.f10945r);
        }
        gi.r3 r3Var2 = this.F0;
        if (r3Var2 != null) {
            r3Var2.b();
            this.F0 = null;
        }
        this.f10948s.invalidate();
        this.B0.s(this.E0.getSink());
    }

    @Override
    public final boolean s() {
        return !this.I0;
    }

    @Override
    public final boolean t(Dialog dialog) {
        try {
            this.f10955v0 = dialog;
            dialog.setOnDismissListener(new ba(this, 4));
            dialog.show();
            d0();
            return true;
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            this.f10955v0 = null;
            return false;
        }
    }

    public final void x(boolean z10) {
        boolean z11;
        boolean z12 = org.telegram.messenger.r2.f25040a;
        if (this.f10937n0 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f10919e != z11) {
            this.f10919e = z11;
            SurfaceView surfaceView = this.D0;
            if (surfaceView != null) {
                surfaceView.setSecure(!z11);
            }
            gi.r3 r3Var = this.E0;
            if (r3Var != null) {
                r3Var.setSecure(!z11);
            }
            if (this.f10911b) {
                org.telegram.ui.ActionBar.d2 d2Var = this.f10922f;
                if (d2Var.getParentActivity() != null) {
                    if (z11) {
                        d2Var.getParentActivity().getWindow().clearFlags(8192);
                        org.telegram.messenger.g0.h2();
                        return;
                    }
                    d2Var.getParentActivity().getWindow().addFlags(8192);
                    org.telegram.messenger.g0.h2();
                    return;
                }
                return;
            }
            if (z11) {
                this.f10945r.flags &= -8193;
                org.telegram.messenger.g0.h2();
            } else {
                this.f10945r.flags |= 8192;
                org.telegram.messenger.g0.h2();
            }
            try {
                this.f10936n.updateViewLayout(this.f10948s, this.f10945r);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final boolean y() {
        if (this.f10911b && this.f10948s != null) {
            return true;
        }
        return false;
    }

    public final void z() {
        if (this.I == null) {
            this.f10933k0 = false;
            this.m0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f10909a0, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new x8(this, 2));
            this.I.addListener(new z8(this, 1));
            this.I.setDuration(250L);
            this.I.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
            this.I.start();
        }
    }

    @Override
    public final void b(boolean z10) {
    }

    @Override
    public final void i(Canvas canvas) {
    }

    @Override
    public final void m(Canvas canvas) {
    }

    @Override
    public final void n(Runnable runnable) {
    }
}
