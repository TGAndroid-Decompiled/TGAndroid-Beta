package ki;

import a8.r7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.e7;
import bi.p8;
import bi.v5;
import c8.ma;
import hi.f9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bh;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.hq0;
import org.telegram.ui.t51;
public final class t2 extends Dialog implements fs, org.telegram.ui.ActionBar.k3 {
    public static final HashSet f18917b1 = new HashSet();
    public static final ut0 f18918c1;
    public static int f18919d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public w0 D0;
    public final l2 E;
    public boolean E0;
    public final r2 F;
    public org.telegram.ui.ActionBar.f3 F0;
    public final i6 G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public int I;
    public float I0;
    public long J;
    public boolean J0;
    public long K;
    public boolean K0;
    public long L;
    public int L0;
    public int M;
    public t51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public y60 P0;
    public final Paint Q;
    public g0 Q0;
    public final Paint R;
    public boolean R0;
    public int S;
    public float S0;
    public int T;
    public ValueAnimator T0;
    public boolean U;
    public ValueAnimator U0;
    public final Paint V;
    public boolean V0;
    public boolean W;
    public ValueAnimator W0;
    public boolean X;
    public boolean X0;
    public final q2 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public org.telegram.ui.b3 Z0;
    public int f18920a;
    public final Drawable f18921a0;
    public boolean f18922a1;
    public int f18923b;
    public org.telegram.ui.ActionBar.r0 f18924b0;
    public float f18925c;
    public org.telegram.messenger.g2 f18926c0;
    public r1.g d;
    public boolean f18927d0;
    public Boolean f18928e;
    public boolean f18929e0;
    public final s2 f18930f;
    public boolean f18931f0;
    public boolean f18932g0;
    public final Rect h;
    public float f18933h0;
    public float f18934i0;
    public boolean f18935j0;
    public int f18936k0;
    public int f18937l0;
    public Activity m0;
    public final Rect f18938n;
    public final p2 f18939n0;
    public final org.telegram.messenger.h2 f18940o0;
    public gc f18941p0;
    public f0 f18942q0;
    public int f18943r;
    public final FrameLayout f18944r0;
    public final org.telegram.ui.ActionBar.g3 f18945s;
    public final FrameLayout.LayoutParams f18946s0;
    public boolean f18947t0;
    public final pc0 f18948u0;
    public final t1 f18949v0;
    public final r7 f18950w;
    public int f18951w0;
    public final k2 f18952x;
    public f4 f18953x0;
    public final FrameLayout.LayoutParams f18954y;
    public boolean f18955y0;
    public boolean f18956z0;

    static {
        ut0 ut0Var = new ut0(new f9(16), new f9(17));
        ut0Var.f40416c = 100.0f;
        f18918c1 = ut0Var;
        f18919d1 = 0;
    }

    public t2(Context context, i6 i6Var) {
        super(context, 2131755352);
        boolean z10;
        Object obj;
        org.telegram.ui.ActionBar.g3 g3Var;
        this.f18925c = 0.0f;
        this.h = new Rect();
        this.f18938n = new Rect();
        this.f18943r = 0;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.f18949v0 = new t1(this, 1);
        this.f18951w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.f18922a1 = false;
        this.G = i6Var;
        int x02 = n6.x0(null, n6.zj, false);
        this.f18923b = x02;
        this.f18920a = x02;
        k2 k2Var = new k2(0, context, this);
        this.f18952x = k2Var;
        k2Var.setAllowFullSizeSwipe(true);
        k2Var.setShouldWaitWebViewScroll(true);
        int i7 = n6.f29396d6;
        l2 l2Var = new l2(this, context, i6Var, n6.w0(i7, i6Var), 0);
        this.E = l2Var;
        l2Var.setOnVerifiedAge(this.M0);
        l2Var.setDelegate(new o2(this, context, i6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = n6.w0(i7, i6Var);
        int w02 = n6.w0(n6.f29339a7, i6Var);
        this.T = w02;
        org.telegram.messenger.g0.s3(this, w02, false, null);
        s2 s2Var = new s2(this, context);
        this.f18930f = s2Var;
        s2Var.setDelegate(new v1(this, 0));
        FrameLayout.LayoutParams e10 = ma.e(-1, -1, 49);
        this.f18954y = e10;
        s2Var.addView(k2Var, e10);
        p2 p2Var = new p2(this, getContext(), i6Var);
        this.f18939n0 = p2Var;
        p2Var.setOnButtonClickListener(new w1(this, 0));
        p2Var.setOnResizeListener(new t1(this, 3));
        s2Var.addView(p2Var, ma.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.f18940o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        if (!mp.u1(this.I).J6 && bz.o() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18932g0 = z10;
        if (z10) {
            obj = k2Var.getRenderNode();
        } else {
            obj = null;
        }
        h2Var.setParentRenderNode(obj);
        s2Var.addView(h2Var, ma.e(-1, -1, 119));
        h2Var.setOnCloseClickListener(new t1(this, 4));
        h2Var.setOnCollapseClickListener(new t1(this, 5));
        h2Var.setOnMenuClickListener(new t1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18944r0 = frameLayout;
        FrameLayout.LayoutParams e11 = ma.e(-1, 200, 55);
        this.f18946s0 = e11;
        s2Var.addView(frameLayout, e11);
        this.f18921a0 = getContext().getDrawable(2131231237).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        this.Y = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(2131231269);
        F();
        kVar.setActionBarMenuOnItemClick(new e2(this, 1));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = ma.e(-1, -2, 49);
        this.Z = e12;
        s2Var.addView((View) kVar, e12);
        ?? o3Var = new o3(context, i6Var);
        this.F = o3Var;
        s2Var.addView((View) o3Var, ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        l2Var.setWebViewProgressListener(new p8(this, 4));
        k2Var.addView(l2Var, ma.c(-1.0f, -1));
        k2Var.setScrollListener(new t1(this, 7));
        k2Var.setScrollEndListener(new t1(this, 8));
        k2Var.setDelegate(new u1(this));
        k2Var.setIsKeyboardVisible(new u1(this));
        pc0 pc0Var = new pc0(context);
        this.f18948u0 = pc0Var;
        s2Var.addView(pc0Var, ma.c(-1.0f, -1));
        setContentView(s2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            g3Var = launchActivity.N();
        } else {
            g3Var = null;
        }
        this.f18945s = g3Var;
        if (g3Var != null) {
            kg.j0 j0Var = new kg.j0(s2Var, 13);
            t1 t1Var = new t1(this, 2);
            g3Var.J.add(j0Var);
            g3Var.K.add(t1Var);
            this.f18950w = new r7(g3Var);
        }
    }

    public static void f(t2 t2Var) {
        if (!t2Var.R0) {
            super.dismiss();
            t2Var.R0 = true;
        }
    }

    public static WindowInsets h(t2 t2Var, View view, WindowInsets windowInsets) {
        int i7;
        WindowInsets windowInsets2;
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f56258a;
        i0.b f10 = i1Var.f(2);
        t2Var.h.set(f10.f15892a, f10.f15893b, f10.f15894c, f10.d);
        i0.b f11 = i1Var.f(647);
        Rect rect = t2Var.f18938n;
        rect.set(Math.max(f11.f15892a, windowInsets.getStableInsetLeft()), Math.max(f11.f15893b, windowInsets.getStableInsetTop()), Math.max(f11.f15894c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Activity W = org.telegram.messenger.g0.W(t2Var.getContext());
            if (W != null && W.getWindow() != null) {
                windowInsets2 = W.getWindow().getDecorView().getRootWindowInsets();
            } else {
                windowInsets2 = null;
            }
            if (windowInsets2 != null) {
                rect.set(Math.max(rect.left, windowInsets2.getStableInsetLeft()), Math.max(rect.top, windowInsets2.getStableInsetTop()), Math.max(rect.right, windowInsets2.getStableInsetRight()), Math.max(rect.bottom, windowInsets2.getStableInsetBottom()));
            }
        }
        if (i10 <= 29) {
            int i11 = rect.top;
            Context context = t2Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.f24093a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i7 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i7 = 0;
            }
            rect.top = Math.max(i11, i7);
        }
        int i12 = i1Var.f(8).d;
        if (i12 > rect.bottom && i12 > org.telegram.messenger.g0.L(20.0f)) {
            t2Var.f18943r = i12;
        } else {
            t2Var.f18943r = 0;
        }
        t2Var.I();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(t2 t2Var) {
        super.dismiss();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(i7).f26601b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == j3) {
                    tL_attachMenuBot = tL_attachMenuBot3;
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String a02 = gd.a0(null, null, 2131752991, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = gd.M0(2131752990, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(gd.M0(2131747638, null), new m1(i7, j3, tL_attachMenuBot, runnable));
        i5.c.y(null, 2131752578, alertDialog$Builder, null);
    }

    public static JSONObject u(i6 i6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = n6.w(-16777216, n6.w0(n6.f29469h5, i6Var));
            y10 y10Var = new y10() {
                @Override
                public final Object a(Object obj) {
                    int w11 = n6.w(w10, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(w11);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", y10Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", y10Var.a(Integer.valueOf(n6.w0(n6.f29396d6, i6Var))));
            int i7 = n6.f29339a7;
            jSONObject.put("secondary_bg_color", y10Var.a(Integer.valueOf(n6.w0(i7, i6Var))));
            jSONObject.put("text_color", y10Var.a(Integer.valueOf(n6.w0(n6.G6, i6Var))));
            jSONObject.put("hint_color", y10Var.a(Integer.valueOf(n6.w0(n6.H6, i6Var))));
            jSONObject.put("link_color", y10Var.a(Integer.valueOf(n6.w0(n6.J6, i6Var))));
            jSONObject.put("button_color", y10Var.a(Integer.valueOf(n6.w0(n6.Fi, i6Var))));
            jSONObject.put("button_text_color", y10Var.a(Integer.valueOf(n6.w0(n6.Ji, i6Var))));
            jSONObject.put("header_bg_color", y10Var.a(Integer.valueOf(n6.w0(n6.f29676s8, i6Var))));
            jSONObject.put("accent_text_color", y10Var.a(Integer.valueOf(n6.w0(n6.f29636q6, i6Var))));
            jSONObject.put("section_header_text_color", y10Var.a(Integer.valueOf(n6.w0(n6.L6, i6Var))));
            jSONObject.put("subtitle_text_color", y10Var.a(Integer.valueOf(n6.w0(n6.f29807z6, i6Var))));
            jSONObject.put("destructive_text_color", y10Var.a(Integer.valueOf(n6.w0(n6.f29617p7, i6Var))));
            jSONObject.put("section_separator_color", y10Var.a(Integer.valueOf(n6.w0(n6.f29397d7, i6Var))));
            jSONObject.put("bottom_bar_bg_color", y10Var.a(Integer.valueOf(n6.w0(i7, i6Var))));
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void A(int i7, boolean z10) {
        Paint paint = this.R;
        int color = paint.getColor();
        boolean z11 = true;
        this.X = true;
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.U0 = duration;
            duration.setInterpolator(lr.f37208f);
            this.U0.addUpdateListener(new r1(this, color, i7, 0));
            this.U0.addListener(new f2(this, i7, 0));
            this.U0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f18930f.invalidate();
        org.telegram.ui.b3 b3Var = this.Z0;
        if (b3Var != null) {
            if (org.telegram.messenger.g0.B(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            b3Var.b(z11, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            k2 k2Var = this.f18952x;
            if (k2Var != null) {
                k2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f10;
        float f11;
        float f12;
        float f13;
        int currentActionBarHeight;
        float f14;
        Point point;
        Object obj;
        if (this.f18931f0 == z10) {
            return;
        }
        this.f18931f0 = z10;
        int i7 = 0;
        if (z12 && !mp.u1(this.I).J6 && bz.o() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f18932g0 = z13;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.f18940o0;
        k2 k2Var = this.f18952x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.f24359b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.h3(aVar, 2500L);
            }
            if (this.f18932g0) {
                obj = k2Var.getRenderNode();
            } else {
                obj = null;
            }
            h2Var.setParentRenderNode(obj);
        }
        this.f18936k0 = k2Var.getWidth();
        this.f18937l0 = k2Var.getHeight();
        this.V0 = false;
        p2 p2Var = this.f18939n0;
        l2 l2Var = this.E;
        q2 q2Var = this.Y;
        if (z11) {
            I();
            L();
            H();
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                int i10 = org.telegram.messenger.g0.f24121q.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f18938n.left;
            if (z10) {
                f12 = i11 + f11;
            } else {
                f12 = (-i11) - f11;
            }
            if (!z10) {
                f11 = -f11;
            }
            if (z10) {
                f13 = k2Var.getTranslationY();
            } else {
                f13 = -org.telegram.messenger.g0.L(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -org.telegram.messenger.g0.L(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.L(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m;
            r1.g gVar = k2Var.f18902w;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = k2Var.H;
            if (gVar2 != null) {
                gVar2.d();
            }
            k2Var.setSwipeOffsetAnimationDisallowed(true);
            q2Var.setVisibility(0);
            if (z10) {
                k2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                k2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
            }
            k2Var.c();
            k2Var.invalidate();
            this.f18934i0 = 0.0f;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f18933h0 = f14;
            q2Var.setAlpha(1.0f - f14);
            q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18933h0);
            k2Var.setTranslationY(org.telegram.messenger.g0.T1(f13, f15, this.f18934i0));
            k2Var.setTranslationX(org.telegram.messenger.g0.T1(f12, 0.0f, this.f18934i0));
            p2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.f18934i0));
            h2Var.setAlpha(this.f18933h0);
            this.f18930f.invalidate();
            l2Var.setViewPortHeightOffset(k2Var.getTranslationY() - f15);
            l2Var.n(false, false);
            this.f18935j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new g2(this, z10, f13, f15, f16, f11));
            this.W0.addListener(new h2(this, z10, currentActionBarHeight2, f16));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(lr.h);
            this.W0.start();
            return;
        }
        this.f18935j0 = false;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f18933h0 = f10;
        this.f18934i0 = 0.0f;
        I();
        L();
        if (z10) {
            i7 = 8;
        }
        q2Var.setVisibility(i7);
        q2Var.setAlpha(1.0f - this.f18933h0);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18933h0);
        p2Var.setTranslationX(0.0f);
        h2Var.setAlpha(this.f18933h0);
        l2Var.setViewPortHeightOffset(0.0f);
        l2Var.n(true, true);
        H();
    }

    public final void D(int i7, boolean z10) {
        this.J0 = false;
        int i10 = this.T;
        p2 p2Var = this.f18939n0;
        Paint paint = p2Var.f18964a;
        p2Var.f18967e.f713b = i7;
        paint.setColor(i7);
        if (!z10) {
            p2Var.d.a(i7, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(lr.f37208f);
            duration.addUpdateListener(new r1(this, i10, i7, 1));
            duration.addListener(new i2(this, i10, i7, 0));
            duration.start();
        } else {
            this.T = i7;
            l();
        }
        org.telegram.messenger.g0.s3(this, this.T, false, null);
    }

    public final void E(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.S0;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        float f13 = this.S0;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.T0 = ofFloat;
        ofFloat.addListener(new e7(16, this, z10));
        this.T0.addUpdateListener(new s1(this, 0));
        this.T0.setInterpolator(lr.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i7 = n6.G6;
            i6 i6Var = this.G;
            int w02 = n6.w0(i7, i6Var);
            q2 q2Var = this.Y;
            q2Var.setTitleColor(w02);
            q2Var.I(n6.w0(i7, i6Var), false);
            q2Var.G(n6.w0(n6.f29714u8, i6Var), false);
            q2Var.J(n6.w0(n6.G8, i6Var), false);
            q2Var.K(n6.w0(n6.E8, i6Var), false, false);
            q2Var.K(n6.w0(n6.F8, i6Var), true, false);
            q2Var.L(n6.w0(n6.I5, i6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        gc gcVar;
        boolean z10;
        h0 c10 = h0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c10.f18712e;
        g0 g0Var = c10.f18713f;
        boolean z11 = true;
        if (g0Var == null) {
            gc gcVar2 = this.f18941p0;
            if (gcVar2 != null) {
                gcVar2.b();
                this.f18941p0 = null;
            }
        } else if ((g0Var.c() && !g0Var.f18691l) || g0Var.f18690k) {
            if (this.Q0 != g0Var && (gcVar = this.f18941p0) != null) {
                gcVar.b();
                this.f18941p0 = null;
            }
            gc gcVar3 = this.f18941p0;
            if (gcVar3 == null || !gcVar3.f35463l) {
                this.Q0 = g0Var;
                f0 f0Var = new f0(getContext(), this.G);
                this.f18942q0 = f0Var;
                gc f10 = gc.f(this.f18944r0, f0Var, 5000);
                this.f18941p0 = f10;
                f10.k(true);
            }
            if (this.f18942q0.c(g0Var)) {
                this.f18941p0 = null;
            }
            g0Var.f18690k = false;
            g0Var.f18691l = true;
        } else {
            f0 f0Var2 = this.f18942q0;
            if (f0Var2 != null) {
                this.Q0 = g0Var;
                if (f0Var2.c(g0Var)) {
                    this.f18941p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) entry.getValue();
            g0 g0Var2 = (g0) entry.getKey();
            z0Var.setText(g0Var2.f18684c);
            if (!g0Var2.c()) {
                z0Var.setSubtext(org.telegram.messenger.g0.i0(g0Var2.f18687g, false, false));
            } else {
                Pair b10 = g0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (g0Var2.c()) {
                z0Var.setRightIcon(2131232098);
                z0Var.f30304b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (g0Var2.f18688i) {
                z0Var.setVisibility(8);
            } else {
                z0Var.setRightIcon(0);
                z0Var.f30304b.setPadding(0, 0, 0, 0);
            }
            z0Var.setOnClickListener(new ai.v2(28, this, g0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.f18926c0;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((g0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (g2Var.f24147e != z10) {
            g2Var.f24147e = z10;
            g2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (((g0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f18940o0.setDownloading(z11);
    }

    public final void H() {
        f0 f0Var = this.f18942q0;
        if (f0Var == null) {
            return;
        }
        if (this.f18931f0) {
            f0Var.setArrow(org.telegram.messenger.g0.W1(this.f18933h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.f18925c > 0.5f) {
            f0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            f0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.messenger.h2 h2Var = this.f18940o0;
        Rect rect = this.f18938n;
        h2Var.setInsets(rect);
        boolean z10 = this.f18931f0;
        l2 l2Var = this.E;
        s2 s2Var = this.f18930f;
        p2 p2Var = this.f18939n0;
        int i15 = 0;
        if (z10) {
            if (p2Var != null && p2Var.getTotalHeight() > 0) {
                i13 = rect.bottom;
            } else {
                i13 = 0;
            }
            int i16 = rect.left;
            int i17 = rect.top;
            int i18 = rect.right;
            if (this.f18943r > i13 || (p2Var != null && p2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int L = org.telegram.messenger.g0.L(46.0f);
            l2Var.Q(rect2, false);
            l2Var.P(L, false);
            s2Var.setPadding(0, 0, 0, Math.max(this.f18943r, i13));
        } else {
            l2Var.Q(new Rect(0, 0, 0, 0), false);
            l2Var.P(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f18943r;
            org.telegram.ui.ActionBar.g3 g3Var = this.f18945s;
            if (g3Var != null) {
                i7 = g3Var.I;
            } else {
                i7 = 0;
            }
            s2Var.setPadding(i19, 0, i20, Math.max(i21, i7 + rect.bottom));
        }
        this.f18954y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z11 = this.f18931f0;
        if (!z11) {
            i10 = 0;
        } else {
            i10 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.Z;
        layoutParams.leftMargin = i10;
        layoutParams.rightMargin = 0;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.f18946s0;
        layoutParams2.leftMargin = i11;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z12 = this.f18935j0;
        k2 k2Var = this.f18952x;
        if (!z12) {
            k2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f18931f0) {
                k2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                k2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.L(24.0f));
            }
            k2Var.setSwipeOffsetAnimationDisallowed(false);
            k2Var.c();
            k2Var.invalidate();
            k2Var.requestLayout();
        }
        if (k2Var != null) {
            k2Var.setFullSize(r());
        }
        p2Var.requestLayout();
        s2Var.requestLayout();
        if (!this.f18931f0) {
            i15 = 8;
        }
        h2Var.setVisibility(i15);
    }

    public final void J() {
        boolean z10;
        int i7;
        boolean z11 = true;
        if (this.W) {
            z10 = !this.U;
        } else {
            z10 = (org.telegram.messenger.g0.Q1() || i0.a.h(n6.x0(null, n6.f29396d6, true)) < 0.7210000157356262d || this.f18925c < 0.85f) ? false : false;
        }
        Boolean bool = this.f18928e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f18928e = Boolean.valueOf(z10);
        s2 s2Var = this.f18930f;
        int systemUiVisibility = s2Var.getSystemUiVisibility();
        if (z10) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        s2Var.setSystemUiVisibility(i7);
    }

    public final void K() {
        org.telegram.ui.web.s0 webView;
        l2 l2Var = this.E;
        if (l2Var == null || (webView = l2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        int i7;
        p2 p2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT <= 28) {
                i7 = 1024;
            } else {
                i7 = 512;
            }
            boolean z10 = this.f18931f0;
            if (z10) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            s2 s2Var = this.f18930f;
            if (z10 && (((p2Var = this.f18939n0) == null || p2Var.getTotalHeight() <= 0) && !s2Var.f18887h0)) {
                s2Var.setSystemUiVisibility(s2Var.getSystemUiVisibility() | 2);
            } else {
                s2Var.setSystemUiVisibility(s2Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void a(boolean z10) {
        o(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.f3 c() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3();
        f3Var.f28941q = this.S;
        f3Var.f28940p = this.f18951w0;
        f3Var.f28938n = this.W;
        f3Var.f28939o = this.X;
        f3Var.f28942r = this.R.getColor();
        f3Var.f28927a = this.f18953x0;
        boolean z13 = false;
        l2 l2Var = this.E;
        if (l2Var != null && l2Var.O) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3Var.f28944t = z10;
        f3Var.D = n6.I.q();
        org.telegram.ui.web.s0 s0Var = null;
        if (l2Var != null) {
            str = l2Var.getUrlLoaded();
        } else {
            str = null;
        }
        f3Var.f28947x = str;
        if (l2Var != null && l2Var.f53370u0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f3Var.f28930e = z11;
        if (l2Var != null) {
            str2 = l2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        f3Var.f28931f = str2;
        k2 k2Var = this.f18952x;
        if ((k2Var == null || k2Var.getSwipeOffsetY() >= 0.0f) && !this.f18956z0 && !r() && !this.f18931f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        f3Var.f28934j = z12;
        f3Var.f28949z = this.f18931f0;
        f3Var.A = this.f18932g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        f3Var.B = booleanValue;
        if (k2Var != null) {
            f10 = k2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        f3Var.f28935k = f10;
        f3Var.C = this.C0;
        f3Var.f28945u = this.f18955y0;
        f3Var.f28948y = this.f18947t0;
        f3Var.v = this.f18927d0;
        if (k2Var == null || k2Var.N) {
            z13 = true;
        }
        f3Var.f28936l = z13;
        f3Var.f28946w = this.f18939n0.f18967e;
        f3Var.f28943s = this.T;
        w0 w0Var = this.D0;
        if (w0Var != null) {
            w0Var.b();
        }
        f3Var.K = this.D0;
        if (l2Var != null) {
            s0Var = l2Var.getWebView();
        }
        if (s0Var != null) {
            l2Var.M();
            f3Var.f28928b = s0Var;
            f3Var.d = l2Var.getBotProxy();
            f3Var.f28932g = s0Var.getWidth();
            f3Var.h = s0Var.getHeight();
            s0Var.onPause();
        }
        boolean z14 = this.X0;
        f3Var.G = z14;
        if (z14) {
            f3Var.H = this.Y0;
        }
        f3Var.L = this.E0;
        this.F0 = f3Var;
        return f3Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 mo25d() {
        return this.f18930f;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25235z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i7 == ks.f25171p4) {
            this.f18930f.invalidate();
            this.E.f53360n.b(n6.w0(n6.f29396d6, this.G), 153);
            F();
            J();
        } else if (i7 == ks.L3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        o(false);
    }

    @Override
    public final int e(int i7) {
        return i0.a.f(this.S0, i7, this.T);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.b3 b3Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        int i7;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        if (botappsettings != null) {
            boolean q10 = n6.I.q();
            int i14 = botappsettings.flags;
            if (q10) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            if ((i7 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (q10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            if ((i14 & i10) != 0) {
                if (q10) {
                    i13 = botappsettings.header_dark_color;
                } else {
                    i13 = botappsettings.header_color;
                }
                y(i13 | (-16777216), true, z10);
            }
            if (z11) {
                if (q10) {
                    i11 = botappsettings.background_dark_color;
                } else {
                    i11 = botappsettings.background_color;
                }
                A(i11 | (-16777216), z10);
                if (q10) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                D(i12 | (-16777216), z10);
            }
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.R0 && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.F(true, true, true);
        }
        s2 s2Var = this.f18930f;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Z0 = b3Var;
            this.f18952x.addView(b3Var, ma.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new y1(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.X3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        int i7;
        LaunchActivity launchActivity;
        if (this.f18929e0) {
            return;
        }
        int i10 = 0;
        if (this.M0 != null) {
            z10 = false;
        }
        this.f18929e0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.f18949v0);
        ks.f(this.I).n(this, ks.f25235z1);
        ks.f(this.I).n(this, ks.L3);
        ks.e().n(this, ks.f25171p4);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.f43110x0 == null)) {
            z10 = false;
        }
        if (z10) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.f56323m.f56331i = 0.0f;
                gVar.h();
            }
            LaunchActivity.H1.f43110x0.b(this);
        } else {
            p2 p2Var = this.f18939n0;
            if (p2Var != null) {
                p2Var.animate().translationY(p2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(lr.h).start();
            }
            this.E.h();
            k2 k2Var = this.f18952x;
            int height = k2Var.getHeight();
            if (p2Var != null) {
                i7 = p2Var.getTotalHeight();
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            Rect rect = this.f18938n;
            int Q = this.f18930f.Q() + i11 + rect.top + rect.bottom;
            if (r()) {
                i10 = org.telegram.messenger.g0.L(200.0f);
            }
            k2Var.f(Q + i10, true, new t1(this, 0));
        }
        f18917b1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, f18918c1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.f56323m = hVar;
            this.d = gVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f18948u0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.E.D()) {
        } else {
            o(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        p2 p2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags;
        int i11 = i10 & (-3);
        attributes.flags = i11;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z10 = true;
        if (i7 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f18931f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        s2 s2Var = this.f18930f;
        s2Var.setFitsSystemWindows(true);
        s2Var.setSystemUiVisibility(1792);
        s2Var.setOnApplyWindowInsetsListener(new x1(this, 0));
        if (this.f18931f0 && ((p2Var = this.f18939n0) == null || p2Var.getTotalHeight() <= 0)) {
            s2Var.setSystemUiVisibility(s2Var.getSystemUiVisibility() | 2);
        } else {
            s2Var.setSystemUiVisibility(s2Var.getSystemUiVisibility() & (-3));
        }
        if (i7 >= 26) {
            if (i0.a.h(this.T) < 0.7210000157356262d) {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        }
        ks.e().c(this, ks.f25171p4);
        ks.f(this.I).c(this, ks.L3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        r1.g gVar = this.d;
        if (gVar != null) {
            gVar.d();
            this.d = null;
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.f18948u0);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.f18948u0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        if (ownerActivity == null) {
            return org.telegram.messenger.g0.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean q() {
        f4 f4Var = this.f18953x0;
        if (f4Var != null && f4Var.f18671g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f18931f0) {
            Boolean bool = this.B0;
            if (bool == null) {
                if (!this.A0) {
                    return false;
                }
                return true;
            } else if (!bool.booleanValue()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void release() {
        if (this.R0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        E(false);
    }

    public final void s() {
        String str;
        boolean z10;
        int i7;
        if (this.f18953x0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f18953x0.f18681r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.B0 = null;
            TLObject tLObject = this.f18953x0.f18680q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.L = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.G0;
                if (!z11) {
                    C(tL_webViewResultUrl.fullscreen, !z11, this.f18932g0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.L = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.L = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                } else {
                    str = null;
                }
                z10 = false;
            }
            if (str != null && !this.G0) {
                ri d02 = ri.d0(this.I);
                long j3 = this.f18953x0.f18668c;
                TLRPC.User c22 = d02.getMessagesController().c2(Long.valueOf(j3));
                if (c22 != null && c22.bot) {
                    if (d02.getUserConfig().H != 0) {
                        i7 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - d02.getUserConfig().H);
                    } else {
                        i7 = 60;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= d02.f26626m1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) d02.f26626m1.get(i10);
                        if (tL_topPeer2.peer.user_id == j3) {
                            tL_topPeer = tL_topPeer2;
                            break;
                        }
                        i10++;
                    }
                    if (tL_topPeer == null) {
                        tL_topPeer = new TLRPC.TL_topPeer();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = j3;
                        d02.f26626m1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i7 / d02.getMessagesController().f25619c3) + tL_topPeer.rating;
                    Collections.sort(d02.f26626m1, new jg.w(20));
                    if (d02.f26626m1.size() > 20) {
                        a8.p0.z(1, d02.f26626m1);
                    }
                    d02.getMessagesStorage().f27054a.c(new bh(d02, j3, 2, tL_topPeer.rating));
                    d02.getNotificationCenter().k(ks.V0, new Object[0]);
                }
                this.E.t(this.I, str, z10);
            }
            org.telegram.messenger.g0.h3(this.f18949v0, max);
            k2 k2Var = this.f18952x;
            if (k2Var != null) {
                k2Var.setFullSize(r());
            }
        }
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        E(true);
        s2 s2Var = this.f18930f;
        s2Var.setAlpha(0.0f);
        s2Var.addOnLayoutChangeListener(new kg.m(this, 1));
        super.show();
        this.R0 = false;
        f18917b1.add(this);
    }

    public final void t(boolean z10) {
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (this.f18922a1) {
            if (z10) {
                f18919d1++;
            } else {
                f18919d1--;
            }
        }
        if (f18919d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f18947t0) {
            TLRPC.User c22 = mp.u1(this.I).c2(Long.valueOf(this.J));
            if (c22 != null) {
                str = i5.m(0, c22.first_name, c22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = str;
            u1Var.U = gd.M0(2131752906, null);
            alertDialog$Builder.k(gd.M0(2131752905, null), new u1(this));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            u1Var.show();
            ((TextView) u1Var.d(-1)).setTextColor(n6.w0(n6.f29637q7, this.G));
            return false;
        }
        o(false);
        return true;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int w02;
        int w03;
        boolean q10 = q();
        TLRPC.User c22 = mp.u1(this.I).c2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = ri.d0(this.I).f26601b.bots;
        int size = arrayList2.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i13);
                i13++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        y60 y60Var = this.P0;
        if (y60Var != null) {
            y60Var.v();
        }
        if (this.f18931f0) {
            view = this.f18940o0;
        } else {
            view = this.f18924b0;
        }
        y60 H = y60.H(this.f18930f, this.G, view, true);
        this.P0 = H;
        ArrayList arrayList3 = h0.c(getContext(), this.I, this.J).f18712e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            y60 K = H.K();
            K.c(2131232059, gd.M0(2131753754, null), new hq0(H, 27), false);
            K.k();
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList3.get(i14);
                i14++;
                g0 g0Var = (g0) obj;
                String str = g0Var.f18684c;
                ai.o oVar = new ai.o(22);
                i6 i6Var = K.d;
                if (K.f42349e == null) {
                    arrayList = arrayList3;
                    i12 = size2;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, K.f42349e, K.d, false, false);
                    arrayList = arrayList3;
                    i12 = size2;
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    z0Var.setText(str);
                    z0Var.setSubtext("");
                    Integer num = K.m0;
                    if (num == null && K.f42366n0 == null) {
                        z0Var.c(n6.E8, n6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = n6.w0(n6.E8, i6Var);
                        }
                        Integer num2 = K.f42366n0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = n6.w0(n6.F8, i6Var);
                        }
                        z0Var.d(w02, w03);
                    }
                    Integer num3 = K.f42368o0;
                    if (num3 != null) {
                        z0Var.setSelectorColor(num3.intValue());
                    } else {
                        z0Var.h(0.12f, n6.E8);
                    }
                    z0Var.setOnClickListener(new org.telegram.ui.Components.n0(K, oVar));
                    int i15 = K.V;
                    if (i15 > 0) {
                        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
                        K.r(z0Var, ma.o(K.V, -2));
                    } else {
                        K.r(z0Var, ma.o(-1, -2));
                        hashMap.put(g0Var, K.z());
                        size2 = i12;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(g0Var, K.z());
                size2 = i12;
                arrayList3 = arrayList;
            }
            i7 = -1;
            G();
            K.V = org.telegram.messenger.g0.L(180.0f);
            H.c(2131231790, gd.M0(2131753092, null), new v5(H, K, 1), false);
            H.k();
        } else {
            i7 = -1;
        }
        if (this.M0 == null && !q10) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232074, gd.M0(2131752901, null), new t1(this, 9), z10);
        if (this.M0 == null && this.f18927d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        H.l(2131232362, gd.M0(2131752886, null), new t1(this, 10), z11);
        H.c(2131232344, gd.M0(2131752900, null), new ch.k(10, this, q10), false);
        if (this.M0 == null && c22 != null && c22.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        H.l(2131232185, gd.M0(2131754388, null), new t1(this, 11), z12);
        if (this.M0 == null && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        H.l(2131231836, gd.M0(2131752883, null), new t1(this, 12), z13);
        if (this.M0 == null && !q10) {
            z14 = true;
        } else {
            z14 = false;
        }
        H.l(2131232335, gd.M0(2131752899, null), new t1(this, 13), z14);
        if (this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        H.l(2131232110, gd.M0(2131752904, null), new t1(this, 14), z15);
        if (this.S != n6.x0(null, n6.f29396d6, false)) {
            if (org.telegram.messenger.g0.B(this.S) >= 0.721f) {
                i10 = i7;
            } else {
                i10 = -15198183;
            }
            if (org.telegram.messenger.g0.B(i10) >= 0.721f) {
                i11 = -16777216;
            } else {
                i11 = i7;
            }
            int r12 = n6.r1(0.85f, i11);
            int r13 = n6.r1(0.1f, i11);
            H.Q(i10);
            for (int i16 = 0; i16 < H.y(); i16++) {
                View x10 = H.x(i16);
                if (x10 instanceof org.telegram.ui.ActionBar.z0) {
                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) x10;
                    z0Var2.d(i11, r12);
                    z0Var2.setSelectorColor(r13);
                }
            }
        }
        H.W(5);
        H.b0(-this.f18938n.right, 0.0f);
        H.X = true;
        H.f42377t = false;
        H.f42375s = 0;
        H.a0();
    }

    public final void x(org.telegram.ui.ActionBar.h2 h2Var, f4 f4Var) {
        boolean z10;
        TLRPC.User c22;
        CharSequence q10;
        TLRPC.UserFull d2;
        TLRPC.User user;
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.z zVar2;
        boolean z11;
        TLRPC.InputPeer p12;
        TLRPC.InputPeer l1;
        boolean z12;
        boolean z13;
        TL_bots.botAppSettings botappsettings;
        String q11;
        boolean z14;
        this.f18953x0 = f4Var;
        int i7 = f4Var.f18666a;
        this.I = i7;
        this.K = f4Var.f18667b;
        this.J = f4Var.f18668c;
        this.M = f4Var.h;
        this.N = f4Var.f18672i;
        this.O = f4Var.f18669e;
        if (f4Var.f18671g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c22 = null;
        } else {
            c22 = mp.u1(i7).c2(Long.valueOf(this.J));
        }
        if (z10) {
            q10 = f4Var.f18669e;
        } else {
            q10 = o10.q(c22);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        q2 q2Var = this.Y;
        q2Var.setTitle(q10);
        if (z10) {
            d2 = null;
        } else {
            d2 = mp.u1(this.I).d2(this.J);
        }
        i6 i6Var = this.G;
        if ((c22 != null && c22.verified) || (d2 != null && (user = d2.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232795).mutate();
            u6.x(q2Var.getTitleTextView(), this.N0, n6.Fi, i6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            q2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            q2Var.getTitleTextView().i(new hi.l3(this, 1));
        }
        org.telegram.messenger.h2 h2Var2 = this.f18940o0;
        if (h2Var2 != null) {
            if (z10) {
                q11 = f4Var.f18669e;
            } else {
                q11 = o10.q(c22);
            }
            if (c22 != null && c22.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            h2Var2.U = new vy0(q11, 13.0f, org.telegram.messenger.g0.o());
            if (!z14) {
                h2Var2.V = null;
                h2Var2.W = null;
            } else {
                h2Var2.V = h2Var2.getContext().getResources().getDrawable(2131232793).mutate();
                h2Var2.W = h2Var2.getContext().getResources().getDrawable(2131232794).mutate();
            }
        }
        org.telegram.ui.ActionBar.z t6 = q2Var.t();
        t6.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(this.I).f26601b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                zVar = t6;
                userFull = d2;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
                t6 = zVar;
                d2 = userFull;
            } else {
                zVar = t6;
                userFull = d2;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.G0 && !z10) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    z12 = false;
                    k(botappsettings, false);
                } else {
                    z12 = false;
                }
                z13 = true;
            } else {
                z12 = false;
                z13 = true;
                mp.u1(this.I).c3(c22, 0, true, new w1(this, 1));
            }
            if (f4Var.f18679p) {
                C(z13, z12, this.f18932g0);
            }
        }
        if (this.M0 == null) {
            zVar2 = zVar;
            zVar2.a(2131296492, 2131230871);
        } else {
            zVar2 = zVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.f18926c0 = g2Var;
        org.telegram.ui.ActionBar.r0 d = zVar2.d(0, g2Var);
        this.f18924b0 = d;
        d.setOnClickListener(new y1(this, 1));
        q2Var.setActionBarMenuOnItemClick(new e2(this, 0));
        JSONObject u10 = u(i6Var, false);
        l2 l2Var = this.E;
        l2Var.setBotUser(c22);
        if (!z10) {
            l2Var.s(this.I, this.J);
            TLRPC.User user2 = f4Var.f18676m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ri.d0(this.I);
                if (!ri.C0(ri.f26595f2, this.J)) {
                    if (user2 == null) {
                        user2 = mp.u1(this.I).c2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            ri.d0(this.I).o1(fc.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (f4Var.f18680q != null) {
            s();
            return;
        }
        int i11 = f4Var.f18671g;
        int i12 = ks.f25235z1;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = mp.u1(this.I).l1(this.K);
                tL_messages_requestWebView.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = f4Var.f18678o;
                tL_messages_requestWebView.fullscreen = f4Var.f18679p;
                String str = f4Var.f18670f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    zy.C(this.I);
                    int i13 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i13;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = mp.u1(this.I).l1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = mp.u1(this.I).l1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new d2(this, 3));
                ks.f(this.I).c(this, i12);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((f4Var.f18677n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((f4Var.f18677n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = f4Var.f18678o;
                tL_messages_requestSimpleWebView.fullscreen = f4Var.f18679p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(f4Var.f18670f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = f4Var.f18670f;
                }
                if (!TextUtils.isEmpty(f4Var.f18675l)) {
                    tL_messages_requestSimpleWebView.start_param = f4Var.f18675l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new d2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestWebView2.peer = mp.u1(this.I).l1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = f4Var.f18678o;
                tL_messages_requestWebView2.fullscreen = f4Var.f18679p;
                tL_messages_requestWebView2.url = f4Var.f18670f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new d2(this, 1));
                ks.f(this.I).c(this, i12);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = f4Var.f18673j;
                tL_inputBotAppID.f28463id = botApp.f28402id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = f4Var.f18674k;
                tL_messages_requestAppWebView.platform = "android";
                if (h2Var instanceof bn) {
                    bn bnVar = (bn) h2Var;
                    if (bnVar.j() != null) {
                        p12 = mp.p1(bnVar.j());
                    } else {
                        p12 = mp.n1(bnVar.f45987e);
                    }
                } else {
                    p12 = mp.p1(f4Var.f18676m);
                }
                tL_messages_requestAppWebView.peer = p12;
                tL_messages_requestAppWebView.compact = f4Var.f18678o;
                tL_messages_requestAppWebView.fullscreen = f4Var.f18679p;
                if (!TextUtils.isEmpty(f4Var.f18675l)) {
                    tL_messages_requestAppWebView.start_param = f4Var.f18675l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new d2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = mp.u1(this.I).q1(f4Var.f18668c);
                tL_messages_requestMainWebView.platform = "android";
                if (h2Var instanceof bn) {
                    bn bnVar2 = (bn) h2Var;
                    if (bnVar2.j() != null) {
                        l1 = mp.p1(bnVar2.j());
                    } else {
                        l1 = mp.n1(bnVar2.f45987e);
                    }
                } else {
                    l1 = mp.u1(this.I).l1(f4Var.f18667b);
                }
                tL_messages_requestMainWebView.peer = l1;
                tL_messages_requestMainWebView.compact = f4Var.f18678o;
                tL_messages_requestMainWebView.fullscreen = f4Var.f18679p;
                if (!TextUtils.isEmpty(f4Var.f18675l)) {
                    tL_messages_requestMainWebView.start_param = f4Var.f18675l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new d2(this, 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = f4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new hi.e7(this, 20), 66);
                return;
            case 6:
                if (!this.G0) {
                    l2Var.t(this.I, f4Var.f18670f, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void y(final int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        final int i11 = this.S;
        n6.b(0.35f, -0.1f, i7);
        final q1 q1Var = new q1();
        int i12 = 0;
        if (this.W) {
            i10 = this.S;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = q1Var.f18847a;
        i6 i6Var = this.G;
        q1Var.c(sparseIntArray, i10, i6Var);
        this.W = z10;
        if (i0.a.h(i7) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.U = z12;
        if (this.W) {
            i12 = i7;
        }
        q1Var.c(q1Var.f18848b, i12, i6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(lr.f37208f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i11, i7);
                    t2 t2Var = t2.this;
                    t2Var.S = f10;
                    t2Var.l();
                    s2 s2Var = t2Var.f18930f;
                    s2Var.invalidate();
                    q2 q2Var = t2Var.Y;
                    q2Var.setBackgroundColor(t2Var.S);
                    q1 q1Var2 = q1Var;
                    q1Var2.b(q2Var, floatValue);
                    t2Var.f18920a = q1Var2.a(n6.zj);
                    s2Var.invalidate();
                }
            });
            duration.addListener(new j2(this, i11, i7, q1Var));
            duration.start();
        } else {
            this.S = i7;
            l();
            s2 s2Var = this.f18930f;
            s2Var.invalidate();
            int i13 = this.S;
            q2 q2Var = this.Y;
            q2Var.setBackgroundColor(i13);
            q1Var.b(q2Var, 1.0f);
            this.f18920a = q1Var.a(n6.zj);
            s2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.f18922a1 == z10) {
            return;
        }
        this.f18922a1 = z10;
        if (z10) {
            if (this.E0) {
                f18919d1++;
            }
        } else if (this.E0) {
            f18919d1--;
        }
        if (f18919d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    @Override
    public final void b(boolean z10) {
    }
}
