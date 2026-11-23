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
import bi.a6;
import bi.j7;
import bi.u8;
import c8.na;
import hi.y7;
import hi.z9;
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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.hq0;
import org.telegram.ui.r51;
public final class t2 extends Dialog implements fs, org.telegram.ui.ActionBar.j3 {
    public static final HashSet f19012b1 = new HashSet();
    public static final wt0 f19013c1;
    public static int f19014d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public v0 D0;
    public final k2 E;
    public boolean E0;
    public final r2 F;
    public org.telegram.ui.ActionBar.e3 F0;
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
    public r51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public x60 P0;
    public final Paint Q;
    public f0 Q0;
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
    public int f19015a;
    public final Drawable f19016a0;
    public boolean f19017a1;
    public int f19018b;
    public org.telegram.ui.ActionBar.q0 f19019b0;
    public float f19020c;
    public org.telegram.messenger.g2 f19021c0;
    public r1.g d;
    public boolean f19022d0;
    public Boolean f19023e;
    public boolean f19024e0;
    public final s2 f19025f;
    public boolean f19026f0;
    public boolean f19027g0;
    public final Rect h;
    public float f19028h0;
    public float f19029i0;
    public boolean f19030j0;
    public int f19031k0;
    public int f19032l0;
    public Activity m0;
    public final Rect f19033n;
    public final p2 f19034n0;
    public final org.telegram.messenger.h2 f19035o0;
    public fc f19036p0;
    public e0 f19037q0;
    public int f19038r;
    public final FrameLayout f19039r0;
    public final org.telegram.ui.ActionBar.f3 f19040s;
    public final FrameLayout.LayoutParams f19041s0;
    public boolean f19042t0;
    public final oc0 f19043u0;
    public final s1 f19044v0;
    public final r7 f19045w;
    public int f19046w0;
    public final j2 f19047x;
    public f4 f19048x0;
    public final FrameLayout.LayoutParams f19049y;
    public boolean f19050y0;
    public boolean f19051z0;

    static {
        wt0 wt0Var = new wt0(new z9(16), new z9(17));
        wt0Var.f41732c = 100.0f;
        f19013c1 = wt0Var;
        f19014d1 = 0;
    }

    public t2(Context context, i6 i6Var) {
        super(context, 2131755352);
        boolean z10;
        Object obj;
        org.telegram.ui.ActionBar.f3 f3Var;
        this.f19020c = 0.0f;
        this.h = new Rect();
        this.f19033n = new Rect();
        this.f19038r = 0;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.f19044v0 = new s1(this, 1);
        this.f19046w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.f19017a1 = false;
        this.G = i6Var;
        int x02 = n6.x0(null, n6.zj, false);
        this.f19018b = x02;
        this.f19015a = x02;
        j2 j2Var = new j2(0, context, this);
        this.f19047x = j2Var;
        j2Var.setAllowFullSizeSwipe(true);
        j2Var.setShouldWaitWebViewScroll(true);
        int i7 = n6.f29451d6;
        k2 k2Var = new k2(this, context, i6Var, n6.w0(i7, i6Var), 0);
        this.E = k2Var;
        k2Var.setOnVerifiedAge(this.M0);
        k2Var.setDelegate(new o2(this, context, i6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = n6.w0(i7, i6Var);
        int w02 = n6.w0(n6.f29394a7, i6Var);
        this.T = w02;
        org.telegram.messenger.g0.s3(this, w02, false, null);
        s2 s2Var = new s2(this, context);
        this.f19025f = s2Var;
        s2Var.setDelegate(new u1(this, 0));
        FrameLayout.LayoutParams e10 = na.e(-1, -1, 49);
        this.f19049y = e10;
        s2Var.addView(j2Var, e10);
        p2 p2Var = new p2(this, getContext(), i6Var);
        this.f19034n0 = p2Var;
        p2Var.setOnButtonClickListener(new v1(this, 0));
        p2Var.setOnResizeListener(new s1(this, 3));
        s2Var.addView(p2Var, na.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.f19035o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        if (!mp.u1(this.I).J6 && bz.o() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19027g0 = z10;
        if (z10) {
            obj = j2Var.getRenderNode();
        } else {
            obj = null;
        }
        h2Var.setParentRenderNode(obj);
        s2Var.addView(h2Var, na.e(-1, -1, 119));
        h2Var.setOnCloseClickListener(new s1(this, 4));
        h2Var.setOnCollapseClickListener(new s1(this, 5));
        h2Var.setOnMenuClickListener(new s1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19039r0 = frameLayout;
        FrameLayout.LayoutParams e11 = na.e(-1, 200, 55);
        this.f19041s0 = e11;
        s2Var.addView(frameLayout, e11);
        this.f19016a0 = getContext().getDrawable(2131231240).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        this.Y = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(2131231272);
        F();
        kVar.setActionBarMenuOnItemClick(new d2(this, 1));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = na.e(-1, -2, 49);
        this.Z = e12;
        s2Var.addView((View) kVar, e12);
        ?? o3Var = new o3(context, i6Var);
        this.F = o3Var;
        s2Var.addView((View) o3Var, na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        k2Var.setWebViewProgressListener(new u8(this, 4));
        j2Var.addView(k2Var, na.c(-1.0f, -1));
        j2Var.setScrollListener(new s1(this, 7));
        j2Var.setScrollEndListener(new s1(this, 8));
        j2Var.setDelegate(new t1(this));
        j2Var.setIsKeyboardVisible(new t1(this));
        oc0 oc0Var = new oc0(context);
        this.f19043u0 = oc0Var;
        s2Var.addView(oc0Var, na.c(-1.0f, -1));
        setContentView(s2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            f3Var = launchActivity.N();
        } else {
            f3Var = null;
        }
        this.f19040s = f3Var;
        if (f3Var != null) {
            kg.i0 i0Var = new kg.i0(s2Var, 13);
            s1 s1Var = new s1(this, 2);
            f3Var.J.add(i0Var);
            f3Var.K.add(s1Var);
            this.f19045w = new r7(f3Var);
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
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f56381a;
        i0.b f10 = i1Var.f(2);
        t2Var.h.set(f10.f15978a, f10.f15979b, f10.f15980c, f10.d);
        i0.b f11 = i1Var.f(647);
        Rect rect = t2Var.f19033n;
        rect.set(Math.max(f11.f15978a, windowInsets.getStableInsetLeft()), Math.max(f11.f15979b, windowInsets.getStableInsetTop()), Math.max(f11.f15980c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
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
            Typeface typeface = org.telegram.messenger.g0.f24198a;
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
            t2Var.f19038r = i12;
        } else {
            t2Var.f19038r = 0;
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
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(i7).f26700b.bots;
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
        String a02 = gd.a0(null, null, 2131752990, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String N0 = gd.N0(2131752989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(gd.N0(2131747637, null), new l1(i7, j3, tL_attachMenuBot, runnable));
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public static JSONObject u(i6 i6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = n6.w(-16777216, n6.w0(n6.f29524h5, i6Var));
            x10 x10Var = new x10() {
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
            jSONObject.put("bg_color", x10Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", x10Var.a(Integer.valueOf(n6.w0(n6.f29451d6, i6Var))));
            int i7 = n6.f29394a7;
            jSONObject.put("secondary_bg_color", x10Var.a(Integer.valueOf(n6.w0(i7, i6Var))));
            jSONObject.put("text_color", x10Var.a(Integer.valueOf(n6.w0(n6.G6, i6Var))));
            jSONObject.put("hint_color", x10Var.a(Integer.valueOf(n6.w0(n6.H6, i6Var))));
            jSONObject.put("link_color", x10Var.a(Integer.valueOf(n6.w0(n6.J6, i6Var))));
            jSONObject.put("button_color", x10Var.a(Integer.valueOf(n6.w0(n6.Fi, i6Var))));
            jSONObject.put("button_text_color", x10Var.a(Integer.valueOf(n6.w0(n6.Ji, i6Var))));
            jSONObject.put("header_bg_color", x10Var.a(Integer.valueOf(n6.w0(n6.f29731s8, i6Var))));
            jSONObject.put("accent_text_color", x10Var.a(Integer.valueOf(n6.w0(n6.f29691q6, i6Var))));
            jSONObject.put("section_header_text_color", x10Var.a(Integer.valueOf(n6.w0(n6.L6, i6Var))));
            jSONObject.put("subtitle_text_color", x10Var.a(Integer.valueOf(n6.w0(n6.f29862z6, i6Var))));
            jSONObject.put("destructive_text_color", x10Var.a(Integer.valueOf(n6.w0(n6.f29672p7, i6Var))));
            jSONObject.put("section_separator_color", x10Var.a(Integer.valueOf(n6.w0(n6.f29452d7, i6Var))));
            jSONObject.put("bottom_bar_bg_color", x10Var.a(Integer.valueOf(n6.w0(i7, i6Var))));
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
            duration.setInterpolator(kr.f36858f);
            this.U0.addUpdateListener(new q1(this, color, i7, 0));
            this.U0.addListener(new e2(this, i7, 0));
            this.U0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f19025f.invalidate();
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
            j2 j2Var = this.f19047x;
            if (j2Var != null) {
                j2Var.setFullSize(r());
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
        if (this.f19026f0 == z10) {
            return;
        }
        this.f19026f0 = z10;
        int i7 = 0;
        if (z12 && !mp.u1(this.I).J6 && bz.o() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f19027g0 = z13;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.f19035o0;
        j2 j2Var = this.f19047x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.f24460b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.h3(aVar, 2500L);
            }
            if (this.f19027g0) {
                obj = j2Var.getRenderNode();
            } else {
                obj = null;
            }
            h2Var.setParentRenderNode(obj);
        }
        this.f19031k0 = j2Var.getWidth();
        this.f19032l0 = j2Var.getHeight();
        this.V0 = false;
        p2 p2Var = this.f19034n0;
        k2 k2Var = this.E;
        q2 q2Var = this.Y;
        if (z11) {
            I();
            L();
            H();
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                int i10 = org.telegram.messenger.g0.f24226q.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f19033n.left;
            if (z10) {
                f12 = i11 + f11;
            } else {
                f12 = (-i11) - f11;
            }
            if (!z10) {
                f11 = -f11;
            }
            if (z10) {
                f13 = j2Var.getTranslationY();
            } else {
                f13 = -org.telegram.messenger.g0.L(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -org.telegram.messenger.g0.L(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
            r1.g gVar = j2Var.f18998w;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = j2Var.H;
            if (gVar2 != null) {
                gVar2.d();
            }
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            q2Var.setVisibility(0);
            if (z10) {
                j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                j2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
            }
            j2Var.c();
            j2Var.invalidate();
            this.f19029i0 = 0.0f;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f19028h0 = f14;
            q2Var.setAlpha(1.0f - f14);
            q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f19028h0);
            j2Var.setTranslationY(org.telegram.messenger.g0.T1(f13, f15, this.f19029i0));
            j2Var.setTranslationX(org.telegram.messenger.g0.T1(f12, 0.0f, this.f19029i0));
            p2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.f19029i0));
            h2Var.setAlpha(this.f19028h0);
            this.f19025f.invalidate();
            k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - f15);
            k2Var.n(false, false);
            this.f19030j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new f2(this, z10, f13, f15, f16, f11));
            this.W0.addListener(new g2(this, z10, currentActionBarHeight2, f16));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(kr.h);
            this.W0.start();
            return;
        }
        this.f19030j0 = false;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f19028h0 = f10;
        this.f19029i0 = 0.0f;
        I();
        L();
        if (z10) {
            i7 = 8;
        }
        q2Var.setVisibility(i7);
        q2Var.setAlpha(1.0f - this.f19028h0);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f19028h0);
        p2Var.setTranslationX(0.0f);
        h2Var.setAlpha(this.f19028h0);
        k2Var.setViewPortHeightOffset(0.0f);
        k2Var.n(true, true);
        H();
    }

    public final void D(int i7, boolean z10) {
        this.J0 = false;
        int i10 = this.T;
        p2 p2Var = this.f19034n0;
        Paint paint = p2Var.f19001a;
        p2Var.f19004e.f713b = i7;
        paint.setColor(i7);
        if (!z10) {
            p2Var.d.a(i7, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(kr.f36858f);
            duration.addUpdateListener(new q1(this, i10, i7, 1));
            duration.addListener(new h2(this, i10, i7, 0));
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
        ofFloat.addListener(new j7(16, this, z10));
        this.T0.addUpdateListener(new r1(this, 0));
        this.T0.setInterpolator(kr.h);
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
            q2Var.F(n6.w0(i7, i6Var), false);
            q2Var.E(n6.w0(n6.f29769u8, i6Var), false);
            q2Var.H(n6.w0(n6.G8, i6Var), false);
            q2Var.I(n6.w0(n6.E8, i6Var), false, false);
            q2Var.I(n6.w0(n6.F8, i6Var), true, false);
            q2Var.J(n6.w0(n6.I5, i6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        fc fcVar;
        boolean z10;
        g0 c10 = g0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c10.f18792e;
        f0 f0Var = c10.f18793f;
        boolean z11 = true;
        if (f0Var == null) {
            fc fcVar2 = this.f19036p0;
            if (fcVar2 != null) {
                fcVar2.b();
                this.f19036p0 = null;
            }
        } else if ((f0Var.c() && !f0Var.f18748l) || f0Var.f18747k) {
            if (this.Q0 != f0Var && (fcVar = this.f19036p0) != null) {
                fcVar.b();
                this.f19036p0 = null;
            }
            fc fcVar3 = this.f19036p0;
            if (fcVar3 == null || !fcVar3.f35093l) {
                this.Q0 = f0Var;
                e0 e0Var = new e0(getContext(), this.G);
                this.f19037q0 = e0Var;
                fc f10 = fc.f(this.f19039r0, e0Var, 5000);
                this.f19036p0 = f10;
                f10.k(true);
            }
            if (this.f19037q0.c(f0Var)) {
                this.f19036p0 = null;
            }
            f0Var.f18747k = false;
            f0Var.f18748l = true;
        } else {
            e0 e0Var2 = this.f19037q0;
            if (e0Var2 != null) {
                this.Q0 = f0Var;
                if (e0Var2.c(f0Var)) {
                    this.f19036p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) entry.getValue();
            f0 f0Var2 = (f0) entry.getKey();
            y0Var.setText(f0Var2.f18741c);
            if (!f0Var2.c()) {
                y0Var.setSubtext(org.telegram.messenger.g0.i0(f0Var2.f18744g, false, false));
            } else {
                Pair b10 = f0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (f0Var2.c()) {
                y0Var.setRightIcon(2131232101);
                y0Var.f30345b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (f0Var2.f18745i) {
                y0Var.setVisibility(8);
            } else {
                y0Var.setRightIcon(0);
                y0Var.f30345b.setPadding(0, 0, 0, 0);
            }
            y0Var.setOnClickListener(new ai.p2(27, this, f0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.f19021c0;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((f0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (g2Var.f24246e != z10) {
            g2Var.f24246e = z10;
            g2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (((f0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f19035o0.setDownloading(z11);
    }

    public final void H() {
        e0 e0Var = this.f19037q0;
        if (e0Var == null) {
            return;
        }
        if (this.f19026f0) {
            e0Var.setArrow(org.telegram.messenger.g0.W1(this.f19028h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.f19020c > 0.5f) {
            e0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            e0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.messenger.h2 h2Var = this.f19035o0;
        Rect rect = this.f19033n;
        h2Var.setInsets(rect);
        boolean z10 = this.f19026f0;
        k2 k2Var = this.E;
        s2 s2Var = this.f19025f;
        p2 p2Var = this.f19034n0;
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
            if (this.f19038r > i13 || (p2Var != null && p2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int L = org.telegram.messenger.g0.L(46.0f);
            k2Var.Q(rect2, false);
            k2Var.P(L, false);
            s2Var.setPadding(0, 0, 0, Math.max(this.f19038r, i13));
        } else {
            k2Var.Q(new Rect(0, 0, 0, 0), false);
            k2Var.P(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f19038r;
            org.telegram.ui.ActionBar.f3 f3Var = this.f19040s;
            if (f3Var != null) {
                i7 = f3Var.I;
            } else {
                i7 = 0;
            }
            s2Var.setPadding(i19, 0, i20, Math.max(i21, i7 + rect.bottom));
        }
        this.f19049y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z11 = this.f19026f0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f19041s0;
        layoutParams2.leftMargin = i11;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z12 = this.f19030j0;
        j2 j2Var = this.f19047x;
        if (!z12) {
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f19026f0) {
                j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                j2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(24.0f));
            }
            j2Var.setSwipeOffsetAnimationDisallowed(false);
            j2Var.c();
            j2Var.invalidate();
            j2Var.requestLayout();
        }
        if (j2Var != null) {
            j2Var.setFullSize(r());
        }
        p2Var.requestLayout();
        s2Var.requestLayout();
        if (!this.f19026f0) {
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
            z10 = (org.telegram.messenger.g0.Q1() || i0.a.h(n6.x0(null, n6.f29451d6, true)) < 0.7210000157356262d || this.f19020c < 0.85f) ? false : false;
        }
        Boolean bool = this.f19023e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f19023e = Boolean.valueOf(z10);
        s2 s2Var = this.f19025f;
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
        k2 k2Var = this.E;
        if (k2Var == null || (webView = k2Var.getWebView()) == null) {
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
            boolean z10 = this.f19026f0;
            if (z10) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            s2 s2Var = this.f19025f;
            if (z10 && (((p2Var = this.f19034n0) == null || p2Var.getTotalHeight() <= 0) && !s2Var.f18983h0)) {
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
    public final org.telegram.ui.ActionBar.e3 c() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3();
        e3Var.f28966q = this.S;
        e3Var.f28965p = this.f19046w0;
        e3Var.f28963n = this.W;
        e3Var.f28964o = this.X;
        e3Var.f28967r = this.R.getColor();
        e3Var.f28952a = this.f19048x0;
        boolean z13 = false;
        k2 k2Var = this.E;
        if (k2Var != null && k2Var.O) {
            z10 = true;
        } else {
            z10 = false;
        }
        e3Var.f28969t = z10;
        e3Var.D = n6.I.q();
        org.telegram.ui.web.s0 s0Var = null;
        if (k2Var != null) {
            str = k2Var.getUrlLoaded();
        } else {
            str = null;
        }
        e3Var.f28972x = str;
        if (k2Var != null && k2Var.f53602u0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e3Var.f28955e = z11;
        if (k2Var != null) {
            str2 = k2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        e3Var.f28956f = str2;
        j2 j2Var = this.f19047x;
        if ((j2Var == null || j2Var.getSwipeOffsetY() >= 0.0f) && !this.f19051z0 && !r() && !this.f19026f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        e3Var.f28959j = z12;
        e3Var.f28974z = this.f19026f0;
        e3Var.A = this.f19027g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        e3Var.B = booleanValue;
        if (j2Var != null) {
            f10 = j2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        e3Var.f28960k = f10;
        e3Var.C = this.C0;
        e3Var.f28970u = this.f19050y0;
        e3Var.f28973y = this.f19042t0;
        e3Var.v = this.f19022d0;
        if (j2Var == null || j2Var.N) {
            z13 = true;
        }
        e3Var.f28961l = z13;
        e3Var.f28971w = this.f19034n0.f19004e;
        e3Var.f28968s = this.T;
        v0 v0Var = this.D0;
        if (v0Var != null) {
            v0Var.b();
        }
        e3Var.K = this.D0;
        if (k2Var != null) {
            s0Var = k2Var.getWebView();
        }
        if (s0Var != null) {
            k2Var.M();
            e3Var.f28953b = s0Var;
            e3Var.d = k2Var.getBotProxy();
            e3Var.f28957g = s0Var.getWidth();
            e3Var.h = s0Var.getHeight();
            s0Var.onPause();
        }
        boolean z14 = this.X0;
        e3Var.G = z14;
        if (z14) {
            e3Var.H = this.Y0;
        }
        e3Var.L = this.E0;
        this.F0 = e3Var;
        return e3Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.k3 mo25d() {
        return this.f19025f;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25332z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i7 == ks.f25274q4) {
            this.f19025f.invalidate();
            this.E.f53592n.b(n6.w0(n6.f29451d6, this.G), 153);
            F();
            J();
        } else if (i7 == ks.M3) {
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
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
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
            launchActivity.G(true, true, true);
        }
        s2 s2Var = this.f19025f;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Z0 = b3Var;
            this.f19047x.addView(b3Var, na.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new x1(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.X3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        int i7;
        LaunchActivity launchActivity;
        if (this.f19024e0) {
            return;
        }
        int i10 = 0;
        if (this.M0 != null) {
            z10 = false;
        }
        this.f19024e0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.f19044v0);
        ks.f(this.I).n(this, ks.f25332z1);
        ks.f(this.I).n(this, ks.M3);
        ks.e().n(this, ks.f25274q4);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.f43230x0 == null)) {
            z10 = false;
        }
        if (z10) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.f56446m.f56454i = 0.0f;
                gVar.h();
            }
            LaunchActivity.H1.f43230x0.b(this);
        } else {
            p2 p2Var = this.f19034n0;
            if (p2Var != null) {
                p2Var.animate().translationY(p2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(kr.h).start();
            }
            this.E.h();
            j2 j2Var = this.f19047x;
            int height = j2Var.getHeight();
            if (p2Var != null) {
                i7 = p2Var.getTotalHeight();
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            Rect rect = this.f19033n;
            int Q = this.f19025f.Q() + i11 + rect.top + rect.bottom;
            if (r()) {
                i10 = org.telegram.messenger.g0.L(200.0f);
            }
            j2Var.f(Q + i10, true, new s1(this, 0));
        }
        f19012b1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, f19013c1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.f56446m = hVar;
            this.d = gVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f19043u0.getVisibility() == 0) {
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
        if (this.f19026f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        s2 s2Var = this.f19025f;
        s2Var.setFitsSystemWindows(true);
        s2Var.setSystemUiVisibility(1792);
        s2Var.setOnApplyWindowInsetsListener(new w1(this, 0));
        if (this.f19026f0 && ((p2Var = this.f19034n0) == null || p2Var.getTotalHeight() <= 0)) {
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
        ks.e().c(this, ks.f25274q4);
        ks.f(this.I).c(this, ks.M3);
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
            ((LaunchActivity) context).A0.add(this.f19043u0);
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
            ((LaunchActivity) context).A0.remove(this.f19043u0);
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
        f4 f4Var = this.f19048x0;
        if (f4Var != null && f4Var.f18772g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f19026f0) {
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
        if (this.f19048x0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f19048x0.f18782r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.B0 = null;
            TLObject tLObject = this.f19048x0.f18781q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.L = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.G0;
                if (!z11) {
                    C(tL_webViewResultUrl.fullscreen, !z11, this.f19027g0);
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
                long j3 = this.f19048x0.f18769c;
                TLRPC.User c22 = d02.getMessagesController().c2(Long.valueOf(j3));
                if (c22 != null && c22.bot) {
                    if (d02.getUserConfig().H != 0) {
                        i7 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - d02.getUserConfig().H);
                    } else {
                        i7 = 60;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= d02.f26725m1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) d02.f26725m1.get(i10);
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
                        d02.f26725m1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i7 / d02.getMessagesController().f25712c3) + tL_topPeer.rating;
                    Collections.sort(d02.f26725m1, new jg.w(20));
                    if (d02.f26725m1.size() > 20) {
                        a8.p0.z(1, d02.f26725m1);
                    }
                    d02.getMessagesStorage().f27149a.c(new bh(d02, j3, 2, tL_topPeer.rating));
                    d02.getNotificationCenter().k(ks.V0, new Object[0]);
                }
                this.E.t(this.I, str, z10);
            }
            org.telegram.messenger.g0.h3(this.f19044v0, max);
            j2 j2Var = this.f19047x;
            if (j2Var != null) {
                j2Var.setFullSize(r());
            }
        }
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        E(true);
        s2 s2Var = this.f19025f;
        s2Var.setAlpha(0.0f);
        s2Var.addOnLayoutChangeListener(new kg.m(this, 1));
        super.show();
        this.R0 = false;
        f19012b1.add(this);
    }

    public final void t(boolean z10) {
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (this.f19017a1) {
            if (z10) {
                f19014d1++;
            } else {
                f19014d1--;
            }
        }
        if (f19014d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f19042t0) {
            TLRPC.User c22 = mp.u1(this.I).c2(Long.valueOf(this.J));
            if (c22 != null) {
                str = i5.m(0, c22.first_name, c22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = str;
            t1Var.U = gd.N0(2131752905, null);
            alertDialog$Builder.k(gd.N0(2131752904, null), new t1(this));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            t1Var.show();
            ((TextView) t1Var.d(-1)).setTextColor(n6.w0(n6.f29692q7, this.G));
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
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = ri.d0(this.I).f26700b.bots;
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
        x60 x60Var = this.P0;
        if (x60Var != null) {
            x60Var.v();
        }
        if (this.f19026f0) {
            view = this.f19035o0;
        } else {
            view = this.f19019b0;
        }
        x60 H = x60.H(this.f19025f, this.G, view, true);
        this.P0 = H;
        ArrayList arrayList3 = g0.c(getContext(), this.I, this.J).f18792e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            x60 K = H.K();
            K.c(2131232062, gd.N0(2131753753, null), new hq0(H, 27), false);
            K.k();
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList3.get(i14);
                i14++;
                f0 f0Var = (f0) obj;
                String str = f0Var.f18741c;
                ai.k kVar = new ai.k(22);
                i6 i6Var = K.d;
                if (K.f41866e == null) {
                    arrayList = arrayList3;
                    i12 = size2;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, K.f41866e, K.d, false, false);
                    arrayList = arrayList3;
                    i12 = size2;
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    y0Var.setText(str);
                    y0Var.setSubtext("");
                    Integer num = K.m0;
                    if (num == null && K.f41883n0 == null) {
                        y0Var.c(n6.E8, n6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = n6.w0(n6.E8, i6Var);
                        }
                        Integer num2 = K.f41883n0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = n6.w0(n6.F8, i6Var);
                        }
                        y0Var.d(w02, w03);
                    }
                    Integer num3 = K.f41885o0;
                    if (num3 != null) {
                        y0Var.setSelectorColor(num3.intValue());
                    } else {
                        y0Var.h(0.12f, n6.E8);
                    }
                    y0Var.setOnClickListener(new org.telegram.ui.Components.n0(K, kVar));
                    int i15 = K.V;
                    if (i15 > 0) {
                        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
                        K.r(y0Var, na.o(K.V, -2));
                    } else {
                        K.r(y0Var, na.o(-1, -2));
                        hashMap.put(f0Var, K.z());
                        size2 = i12;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(f0Var, K.z());
                size2 = i12;
                arrayList3 = arrayList;
            }
            i7 = -1;
            G();
            K.V = org.telegram.messenger.g0.L(180.0f);
            H.c(2131231793, gd.N0(2131753091, null), new a6(H, K, 1), false);
            H.k();
        } else {
            i7 = -1;
        }
        if (this.M0 == null && !q10) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232077, gd.N0(2131752900, null), new s1(this, 9), z10);
        if (this.M0 == null && this.f19022d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        H.l(2131232365, gd.N0(2131752885, null), new s1(this, 10), z11);
        H.c(2131232347, gd.N0(2131752899, null), new ch.k(10, this, q10), false);
        if (this.M0 == null && c22 != null && c22.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        H.l(2131232188, gd.N0(2131754387, null), new s1(this, 11), z12);
        if (this.M0 == null && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        H.l(2131231839, gd.N0(2131752882, null), new s1(this, 12), z13);
        if (this.M0 == null && !q10) {
            z14 = true;
        } else {
            z14 = false;
        }
        H.l(2131232338, gd.N0(2131752898, null), new s1(this, 13), z14);
        if (this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        H.l(2131232113, gd.N0(2131752903, null), new s1(this, 14), z15);
        if (this.S != n6.x0(null, n6.f29451d6, false)) {
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
                if (x10 instanceof org.telegram.ui.ActionBar.y0) {
                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) x10;
                    y0Var2.d(i11, r12);
                    y0Var2.setSelectorColor(r13);
                }
            }
        }
        H.W(5);
        H.b0(-this.f19033n.right, 0.0f);
        H.X = true;
        H.f41894t = false;
        H.f41892s = 0;
        H.a0();
    }

    public final void x(org.telegram.ui.ActionBar.g2 g2Var, f4 f4Var) {
        boolean z10;
        TLRPC.User c22;
        CharSequence q10;
        TLRPC.UserFull d2;
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        boolean z11;
        TLRPC.InputPeer p12;
        TLRPC.InputPeer l1;
        boolean z12;
        boolean z13;
        TL_bots.botAppSettings botappsettings;
        String q11;
        boolean z14;
        this.f19048x0 = f4Var;
        int i7 = f4Var.f18767a;
        this.I = i7;
        this.K = f4Var.f18768b;
        this.J = f4Var.f18769c;
        this.M = f4Var.h;
        this.N = f4Var.f18773i;
        this.O = f4Var.f18770e;
        if (f4Var.f18772g == 6) {
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
            q10 = f4Var.f18770e;
        } else {
            q10 = n10.q(c22);
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
            this.N0 = getContext().getResources().getDrawable(2131232798).mutate();
            u6.x(q2Var.getTitleTextView(), this.N0, n6.Fi, i6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            q2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            q2Var.getTitleTextView().i(new hi.t3(this, 1));
        }
        org.telegram.messenger.h2 h2Var = this.f19035o0;
        if (h2Var != null) {
            if (z10) {
                q11 = f4Var.f18770e;
            } else {
                q11 = n10.q(c22);
            }
            if (c22 != null && c22.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            h2Var.U = new wy0(q11, 13.0f, org.telegram.messenger.g0.o());
            if (!z14) {
                h2Var.V = null;
                h2Var.W = null;
            } else {
                h2Var.V = h2Var.getContext().getResources().getDrawable(2131232796).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(2131232797).mutate();
            }
        }
        org.telegram.ui.ActionBar.y s5 = q2Var.s();
        s5.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(this.I).f26700b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                yVar = s5;
                userFull = d2;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
                s5 = yVar;
                d2 = userFull;
            } else {
                yVar = s5;
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
                mp.u1(this.I).c3(c22, 0, true, new v1(this, 1));
            }
            if (f4Var.f18780p) {
                C(z13, z12, this.f19027g0);
            }
        }
        if (this.M0 == null) {
            yVar2 = yVar;
            yVar2.a(2131296494, 2131230871);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var2 = new org.telegram.messenger.g2(getContext());
        this.f19021c0 = g2Var2;
        org.telegram.ui.ActionBar.q0 d = yVar2.d(0, g2Var2);
        this.f19019b0 = d;
        d.setOnClickListener(new x1(this, 1));
        q2Var.setActionBarMenuOnItemClick(new d2(this, 0));
        JSONObject u10 = u(i6Var, false);
        k2 k2Var = this.E;
        k2Var.setBotUser(c22);
        if (!z10) {
            k2Var.s(this.I, this.J);
            TLRPC.User user2 = f4Var.f18777m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ri.d0(this.I);
                if (!ri.C0(ri.f26694f2, this.J)) {
                    if (user2 == null) {
                        user2 = mp.u1(this.I).c2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            ri.d0(this.I).o1(org.telegram.messenger.fc.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (f4Var.f18781q != null) {
            s();
            return;
        }
        int i11 = f4Var.f18772g;
        int i12 = ks.f25332z1;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = mp.u1(this.I).l1(this.K);
                tL_messages_requestWebView.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = f4Var.f18779o;
                tL_messages_requestWebView.fullscreen = f4Var.f18780p;
                String str = f4Var.f18771f;
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
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new c2(this, 3));
                ks.f(this.I).c(this, i12);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((f4Var.f18778n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((f4Var.f18778n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = f4Var.f18779o;
                tL_messages_requestSimpleWebView.fullscreen = f4Var.f18780p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(f4Var.f18771f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = f4Var.f18771f;
                }
                if (!TextUtils.isEmpty(f4Var.f18776l)) {
                    tL_messages_requestSimpleWebView.start_param = f4Var.f18776l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new c2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = mp.u1(this.I).q1(this.J);
                tL_messages_requestWebView2.peer = mp.u1(this.I).l1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = f4Var.f18779o;
                tL_messages_requestWebView2.fullscreen = f4Var.f18780p;
                tL_messages_requestWebView2.url = f4Var.f18771f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new c2(this, 1));
                ks.f(this.I).c(this, i12);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = f4Var.f18774j;
                tL_inputBotAppID.f28550id = botApp.f28489id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = f4Var.f18775k;
                tL_messages_requestAppWebView.platform = "android";
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    if (bnVar.j() != null) {
                        p12 = mp.p1(bnVar.j());
                    } else {
                        p12 = mp.n1(bnVar.f46173e);
                    }
                } else {
                    p12 = mp.p1(f4Var.f18777m);
                }
                tL_messages_requestAppWebView.peer = p12;
                tL_messages_requestAppWebView.compact = f4Var.f18779o;
                tL_messages_requestAppWebView.fullscreen = f4Var.f18780p;
                if (!TextUtils.isEmpty(f4Var.f18776l)) {
                    tL_messages_requestAppWebView.start_param = f4Var.f18776l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new c2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = mp.u1(this.I).q1(f4Var.f18769c);
                tL_messages_requestMainWebView.platform = "android";
                if (g2Var instanceof bn) {
                    bn bnVar2 = (bn) g2Var;
                    if (bnVar2.j() != null) {
                        l1 = mp.p1(bnVar2.j());
                    } else {
                        l1 = mp.n1(bnVar2.f46173e);
                    }
                } else {
                    l1 = mp.u1(this.I).l1(f4Var.f18768b);
                }
                tL_messages_requestMainWebView.peer = l1;
                tL_messages_requestMainWebView.compact = f4Var.f18779o;
                tL_messages_requestMainWebView.fullscreen = f4Var.f18780p;
                if (!TextUtils.isEmpty(f4Var.f18776l)) {
                    tL_messages_requestMainWebView.start_param = f4Var.f18776l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new c2(this, 5), 66);
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
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new y7(this, 20), 66);
                return;
            case 6:
                if (!this.G0) {
                    k2Var.t(this.I, f4Var.f18771f, false);
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
        final p1 p1Var = new p1();
        int i12 = 0;
        if (this.W) {
            i10 = this.S;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = p1Var.f18926a;
        i6 i6Var = this.G;
        p1Var.c(sparseIntArray, i10, i6Var);
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
        p1Var.c(p1Var.f18927b, i12, i6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(kr.f36858f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i11, i7);
                    t2 t2Var = t2.this;
                    t2Var.S = f10;
                    t2Var.l();
                    s2 s2Var = t2Var.f19025f;
                    s2Var.invalidate();
                    q2 q2Var = t2Var.Y;
                    q2Var.setBackgroundColor(t2Var.S);
                    p1 p1Var2 = p1Var;
                    p1Var2.b(q2Var, floatValue);
                    t2Var.f19015a = p1Var2.a(n6.zj);
                    s2Var.invalidate();
                }
            });
            duration.addListener(new i2(this, i11, i7, p1Var));
            duration.start();
        } else {
            this.S = i7;
            l();
            s2 s2Var = this.f19025f;
            s2Var.invalidate();
            int i13 = this.S;
            q2 q2Var = this.Y;
            q2Var.setBackgroundColor(i13);
            p1Var.b(q2Var, 1.0f);
            this.f19015a = p1Var.a(n6.zj);
            s2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.f19017a1 == z10) {
            return;
        }
        this.f19017a1 = z10;
        if (z10) {
            if (this.E0) {
                f19014d1++;
            }
        } else if (this.E0) {
            f19014d1--;
        }
        if (f19014d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    @Override
    public final void b(boolean z10) {
    }
}
