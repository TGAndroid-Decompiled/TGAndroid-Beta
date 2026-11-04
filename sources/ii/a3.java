package ii;

import ai.q6;
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
import b8.ke;
import b8.mf;
import gi.f6;
import gi.i8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.sg;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i51;
import org.telegram.ui.wm;
import org.telegram.ui.xp0;
public final class a3 extends Dialog implements cs, org.telegram.ui.ActionBar.g3 {
    public static final HashSet f14789b1 = new HashSet();
    public static final kt0 f14790c1;
    public static int f14791d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public w0 D0;
    public final s2 E;
    public boolean E0;
    public final y2 F;
    public org.telegram.ui.ActionBar.a3 F0;
    public final e6 G;
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
    public i51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public f60 P0;
    public final Paint Q;
    public h0 Q0;
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
    public final x2 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public org.telegram.ui.c3 Z0;
    public int f14792a;
    public final Drawable f14793a0;
    public boolean f14794a1;
    public int f14795b;
    public org.telegram.ui.ActionBar.q0 f14796b0;
    public float f14797c;
    public org.telegram.messenger.g2 f14798c0;
    public q1.g d;
    public boolean f14799d0;
    public Boolean f14800e;
    public boolean f14801e0;
    public final z2 f14802f;
    public boolean f14803f0;
    public boolean f14804g0;
    public final Rect h;
    public float f14805h0;
    public float f14806i0;
    public boolean f14807j0;
    public int f14808k0;
    public int f14809l0;
    public Activity m0;
    public final Rect f14810n;
    public final w2 f14811n0;
    public final org.telegram.messenger.h2 f14812o0;
    public ac f14813p0;
    public g0 f14814q0;
    public int f14815r;
    public final FrameLayout f14816r0;
    public final org.telegram.ui.ActionBar.b3 f14817s;
    public final FrameLayout.LayoutParams f14818s0;
    public boolean f14819t0;
    public final zb0 f14820u0;
    public final x1 f14821v0;
    public final ke f14822w;
    public int f14823w0;
    public final r2 f14824x;
    public q4 f14825x0;
    public final FrameLayout.LayoutParams f14826y;
    public boolean f14827y0;
    public boolean f14828z0;

    static {
        kt0 kt0Var = new kt0(new i8(25), new i8(26));
        kt0Var.f35485c = 100.0f;
        f14790c1 = kt0Var;
        f14791d1 = 0;
    }

    public a3(Context context, e6 e6Var) {
        super(context, 2131755352);
        boolean z10;
        Object obj;
        org.telegram.ui.ActionBar.b3 b3Var;
        this.f14797c = 0.0f;
        this.h = new Rect();
        this.f14810n = new Rect();
        this.f14815r = 0;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.f14821v0 = new x1(this, 1);
        this.f14823w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.f14794a1 = false;
        this.G = e6Var;
        int x02 = k6.x0(null, k6.wj, false);
        this.f14795b = x02;
        this.f14792a = x02;
        r2 r2Var = new r2(0, context, this);
        this.f14824x = r2Var;
        r2Var.setAllowFullSizeSwipe(true);
        r2Var.setShouldWaitWebViewScroll(true);
        int i3 = k6.f27878d6;
        s2 s2Var = new s2(this, context, e6Var, k6.w0(i3, e6Var), 0);
        this.E = s2Var;
        s2Var.setOnVerifiedAge(this.M0);
        s2Var.setDelegate(new v2(this, context, e6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = k6.w0(i3, e6Var);
        int w02 = k6.w0(k6.f27824a7, e6Var);
        this.T = w02;
        org.telegram.messenger.g0.u3(this, w02, false, null);
        z2 z2Var = new z2(this, context);
        this.f14802f = z2Var;
        z2Var.setDelegate(new z1(this, 0));
        FrameLayout.LayoutParams e10 = mf.e(-1, -1, 49);
        this.f14826y = e10;
        z2Var.addView(r2Var, e10);
        w2 w2Var = new w2(this, getContext(), e6Var);
        this.f14811n0 = w2Var;
        w2Var.setOnButtonClickListener(new a2(this, 0));
        w2Var.setOnResizeListener(new x1(this, 3));
        z2Var.addView(w2Var, mf.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.f14812o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        if (!hp.s1(this.I).G6 && az.o() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14804g0 = z10;
        if (z10) {
            obj = r2Var.getRenderNode();
        } else {
            obj = null;
        }
        h2Var.setParentRenderNode(obj);
        z2Var.addView(h2Var, mf.e(-1, -1, 119));
        h2Var.setOnCloseClickListener(new x1(this, 4));
        h2Var.setOnCollapseClickListener(new x1(this, 5));
        h2Var.setOnMenuClickListener(new x1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14816r0 = frameLayout;
        FrameLayout.LayoutParams e11 = mf.e(-1, 200, 55);
        this.f14818s0 = e11;
        z2Var.addView(frameLayout, e11);
        this.f14793a0 = getContext().getDrawable(2131231237).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        this.Y = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(2131231269);
        F();
        kVar.setActionBarMenuOnItemClick(new j2(this, 1));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = mf.e(-1, -2, 49);
        this.Z = e12;
        z2Var.addView((View) kVar, e12);
        ?? w3Var = new w3(context, e6Var);
        this.F = w3Var;
        z2Var.addView((View) w3Var, mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        s2Var.setWebViewProgressListener(new q6(this, 3));
        r2Var.addView(s2Var, mf.c(-1.0f, -1));
        r2Var.setScrollListener(new x1(this, 7));
        r2Var.setScrollEndListener(new x1(this, 8));
        r2Var.setDelegate(new y1(this));
        r2Var.setIsKeyboardVisible(new y1(this));
        zb0 zb0Var = new zb0(context);
        this.f14820u0 = zb0Var;
        z2Var.addView(zb0Var, mf.c(-1.0f, -1));
        setContentView(z2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            b3Var = launchActivity.O();
        } else {
            b3Var = null;
        }
        this.f14817s = b3Var;
        if (b3Var != null) {
            f6 f6Var = new f6(z2Var, 21);
            x1 x1Var = new x1(this, 2);
            b3Var.J.add(f6Var);
            b3Var.K.add(x1Var);
            this.f14822w = new ke(b3Var);
        }
    }

    public static void f(a3 a3Var) {
        if (!a3Var.R0) {
            super.dismiss();
            a3Var.R0 = true;
        }
    }

    public static WindowInsets h(a3 a3Var, View view, WindowInsets windowInsets) {
        int i3;
        WindowInsets windowInsets2;
        r0.h1 h1Var = r0.k1.h(view, windowInsets).f54026a;
        i0.b f10 = h1Var.f(2);
        a3Var.h.set(f10.f14495a, f10.f14496b, f10.f14497c, f10.d);
        i0.b f11 = h1Var.f(647);
        Rect rect = a3Var.f14810n;
        rect.set(Math.max(f11.f14495a, windowInsets.getStableInsetLeft()), Math.max(f11.f14496b, windowInsets.getStableInsetTop()), Math.max(f11.f14497c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Activity W = org.telegram.messenger.g0.W(a3Var.getContext());
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
            Context context = a3Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.f22580a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i3 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i3 = 0;
            }
            rect.top = Math.max(i11, i3);
        }
        int i12 = h1Var.f(8).d;
        if (i12 > rect.bottom && i12 > org.telegram.messenger.g0.L(20.0f)) {
            a3Var.f14815r = i12;
        } else {
            a3Var.f14815r = 0;
        }
        a3Var.I();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void n(int i3, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(i3).f24011b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == j10) {
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
        String a02 = bd.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = bd.M0(2131753001, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(bd.M0(2131747839, null), new o1(i3, j10, tL_attachMenuBot, runnable));
        k2.p1.v(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(e6 e6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = k6.w(-16777216, k6.w0(k6.f27954h5, e6Var));
            v10 v10Var = new v10() {
                @Override
                public final Object a(Object obj) {
                    int w11 = k6.w(w10, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(w11);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", v10Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", v10Var.a(Integer.valueOf(k6.w0(k6.f27878d6, e6Var))));
            int i3 = k6.f27824a7;
            jSONObject.put("secondary_bg_color", v10Var.a(Integer.valueOf(k6.w0(i3, e6Var))));
            jSONObject.put("text_color", v10Var.a(Integer.valueOf(k6.w0(k6.G6, e6Var))));
            jSONObject.put("hint_color", v10Var.a(Integer.valueOf(k6.w0(k6.H6, e6Var))));
            jSONObject.put("link_color", v10Var.a(Integer.valueOf(k6.w0(k6.J6, e6Var))));
            jSONObject.put("button_color", v10Var.a(Integer.valueOf(k6.w0(k6.Ci, e6Var))));
            jSONObject.put("button_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.Gi, e6Var))));
            jSONObject.put("header_bg_color", v10Var.a(Integer.valueOf(k6.w0(k6.f28160s8, e6Var))));
            jSONObject.put("accent_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.f28121q6, e6Var))));
            jSONObject.put("section_header_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.L6, e6Var))));
            jSONObject.put("subtitle_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.f28290z6, e6Var))));
            jSONObject.put("destructive_text_color", v10Var.a(Integer.valueOf(k6.w0(k6.f28102p7, e6Var))));
            jSONObject.put("section_separator_color", v10Var.a(Integer.valueOf(k6.w0(k6.f27879d7, e6Var))));
            jSONObject.put("bottom_bar_bg_color", v10Var.a(Integer.valueOf(k6.w0(i3, e6Var))));
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void A(int i3, boolean z10) {
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
            duration.setInterpolator(xq.f40452f);
            this.U0.addUpdateListener(new v1(this, color, i3, 0));
            this.U0.addListener(new m2(this, i3, 0));
            this.U0.start();
            return;
        }
        paint.setColor(i3);
        F();
        this.f14802f.invalidate();
        org.telegram.ui.c3 c3Var = this.Z0;
        if (c3Var != null) {
            if (org.telegram.messenger.g0.B(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            c3Var.b(z11, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            r2 r2Var = this.f14824x;
            if (r2Var != null) {
                r2Var.setFullSize(r());
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
        if (this.f14803f0 == z10) {
            return;
        }
        this.f14803f0 = z10;
        int i3 = 0;
        if (z12 && !hp.s1(this.I).G6 && az.o() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f14804g0 = z13;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.f14812o0;
        r2 r2Var = this.f14824x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.f22863b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.i3(aVar, 2500L);
            }
            if (this.f14804g0) {
                obj = r2Var.getRenderNode();
            } else {
                obj = null;
            }
            h2Var.setParentRenderNode(obj);
        }
        this.f14808k0 = r2Var.getWidth();
        this.f14809l0 = r2Var.getHeight();
        this.V0 = false;
        w2 w2Var = this.f14811n0;
        s2 s2Var = this.E;
        x2 x2Var = this.Y;
        if (z11) {
            I();
            L();
            H();
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                int i10 = org.telegram.messenger.g0.f22608q.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f14810n.left;
            if (z10) {
                f12 = i11 + f11;
            } else {
                f12 = (-i11) - f11;
            }
            if (!z10) {
                f11 = -f11;
            }
            if (z10) {
                f13 = r2Var.getTranslationY();
            } else {
                f13 = -org.telegram.messenger.g0.L(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -org.telegram.messenger.g0.L(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
            q1.g gVar = r2Var.f14882w;
            if (gVar != null) {
                gVar.d();
            }
            q1.g gVar2 = r2Var.H;
            if (gVar2 != null) {
                gVar2.d();
            }
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            x2Var.setVisibility(0);
            if (z10) {
                r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                r2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
            }
            r2Var.c();
            r2Var.invalidate();
            this.f14806i0 = 0.0f;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f14805h0 = f14;
            x2Var.setAlpha(1.0f - f14);
            x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f14805h0);
            r2Var.setTranslationY(org.telegram.messenger.g0.T1(f13, f15, this.f14806i0));
            r2Var.setTranslationX(org.telegram.messenger.g0.T1(f12, 0.0f, this.f14806i0));
            w2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.f14806i0));
            h2Var.setAlpha(this.f14805h0);
            this.f14802f.invalidate();
            s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - f15);
            s2Var.n(false, false);
            this.f14807j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new n2(this, z10, f13, f15, f16, f11));
            this.W0.addListener(new o2(this, z10, currentActionBarHeight2, f16));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(xq.h);
            this.W0.start();
            return;
        }
        this.f14807j0 = false;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f14805h0 = f10;
        this.f14806i0 = 0.0f;
        I();
        L();
        if (z10) {
            i3 = 8;
        }
        x2Var.setVisibility(i3);
        x2Var.setAlpha(1.0f - this.f14805h0);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f14805h0);
        w2Var.setTranslationX(0.0f);
        h2Var.setAlpha(this.f14805h0);
        s2Var.setViewPortHeightOffset(0.0f);
        s2Var.n(true, true);
        H();
    }

    public final void D(int i3, boolean z10) {
        this.J0 = false;
        int i10 = this.T;
        w2 w2Var = this.f14811n0;
        Paint paint = w2Var.f15258a;
        w2Var.f15261e.f2722b = i3;
        paint.setColor(i3);
        if (!z10) {
            w2Var.d.a(i3, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(xq.f40452f);
            duration.addUpdateListener(new v1(this, i10, i3, 1));
            duration.addListener(new p2(this, i10, i3, 0));
            duration.start();
        } else {
            this.T = i3;
            l();
        }
        org.telegram.messenger.g0.u3(this, this.T, false, null);
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
        ofFloat.addListener(new dh.x(15, this, z10));
        this.T0.addUpdateListener(new w1(this, 0));
        this.T0.setInterpolator(xq.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i3 = k6.G6;
            e6 e6Var = this.G;
            int w02 = k6.w0(i3, e6Var);
            x2 x2Var = this.Y;
            x2Var.setTitleColor(w02);
            x2Var.D(k6.w0(i3, e6Var), false);
            x2Var.C(k6.w0(k6.f28198u8, e6Var), false);
            x2Var.E(k6.w0(k6.G8, e6Var), false);
            x2Var.G(k6.w0(k6.E8, e6Var), false, false);
            x2Var.G(k6.w0(k6.F8, e6Var), true, false);
            x2Var.H(k6.w0(k6.I5, e6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        ac acVar;
        boolean z10;
        i0 c2 = i0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c2.f15003e;
        h0 h0Var = c2.f15004f;
        boolean z11 = true;
        if (h0Var == null) {
            ac acVar2 = this.f14813p0;
            if (acVar2 != null) {
                acVar2.b();
                this.f14813p0 = null;
            }
        } else if ((h0Var.c() && !h0Var.f14983l) || h0Var.f14982k) {
            if (this.Q0 != h0Var && (acVar = this.f14813p0) != null) {
                acVar.b();
                this.f14813p0 = null;
            }
            ac acVar3 = this.f14813p0;
            if (acVar3 == null || !acVar3.f31794l) {
                this.Q0 = h0Var;
                g0 g0Var = new g0(getContext(), this.G);
                this.f14814q0 = g0Var;
                ac f10 = ac.f(this.f14816r0, g0Var, 5000);
                this.f14813p0 = f10;
                f10.k(true);
            }
            if (this.f14814q0.c(h0Var)) {
                this.f14813p0 = null;
            }
            h0Var.f14982k = false;
            h0Var.f14983l = true;
        } else {
            g0 g0Var2 = this.f14814q0;
            if (g0Var2 != null) {
                this.Q0 = h0Var;
                if (g0Var2.c(h0Var)) {
                    this.f14813p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) entry.getValue();
            h0 h0Var2 = (h0) entry.getKey();
            y0Var.setText(h0Var2.f14976c);
            if (!h0Var2.c()) {
                y0Var.setSubtext(org.telegram.messenger.g0.i0(h0Var2.f14979g, false, false));
            } else {
                Pair b10 = h0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (h0Var2.c()) {
                y0Var.setRightIcon(2131232096);
                y0Var.f28813b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (h0Var2.f14980i) {
                y0Var.setVisibility(8);
            } else {
                y0Var.setRightIcon(0);
                y0Var.f28813b.setPadding(0, 0, 0, 0);
            }
            y0Var.setOnClickListener(new ai.d(23, this, h0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.f14798c0;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (((h0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (g2Var.f22629e != z10) {
            g2Var.f22629e = z10;
            g2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (((h0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f14812o0.setDownloading(z11);
    }

    public final void H() {
        g0 g0Var = this.f14814q0;
        if (g0Var == null) {
            return;
        }
        if (this.f14803f0) {
            g0Var.setArrow(org.telegram.messenger.g0.W1(this.f14805h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.f14797c > 0.5f) {
            g0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            g0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.messenger.h2 h2Var = this.f14812o0;
        Rect rect = this.f14810n;
        h2Var.setInsets(rect);
        boolean z10 = this.f14803f0;
        s2 s2Var = this.E;
        z2 z2Var = this.f14802f;
        w2 w2Var = this.f14811n0;
        int i15 = 0;
        if (z10) {
            if (w2Var != null && w2Var.getTotalHeight() > 0) {
                i13 = rect.bottom;
            } else {
                i13 = 0;
            }
            int i16 = rect.left;
            int i17 = rect.top;
            int i18 = rect.right;
            if (this.f14815r > i13 || (w2Var != null && w2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int L = org.telegram.messenger.g0.L(46.0f);
            s2Var.P(rect2, false);
            s2Var.O(L, false);
            z2Var.setPadding(0, 0, 0, Math.max(this.f14815r, i13));
        } else {
            s2Var.P(new Rect(0, 0, 0, 0), false);
            s2Var.O(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f14815r;
            org.telegram.ui.ActionBar.b3 b3Var = this.f14817s;
            if (b3Var != null) {
                i3 = b3Var.I;
            } else {
                i3 = 0;
            }
            z2Var.setPadding(i19, 0, i20, Math.max(i21, i3 + rect.bottom));
        }
        this.f14826y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z11 = this.f14803f0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f14818s0;
        layoutParams2.leftMargin = i11;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z12 = this.f14807j0;
        r2 r2Var = this.f14824x;
        if (!z12) {
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f14803f0) {
                r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                r2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(24.0f));
            }
            r2Var.setSwipeOffsetAnimationDisallowed(false);
            r2Var.c();
            r2Var.invalidate();
            r2Var.requestLayout();
        }
        if (r2Var != null) {
            r2Var.setFullSize(r());
        }
        w2Var.requestLayout();
        z2Var.requestLayout();
        if (!this.f14803f0) {
            i15 = 8;
        }
        h2Var.setVisibility(i15);
    }

    public final void J() {
        boolean z10;
        int i3;
        boolean z11 = true;
        if (this.W) {
            z10 = !this.U;
        } else {
            z10 = (org.telegram.messenger.g0.Q1() || i0.a.h(k6.x0(null, k6.f27878d6, true)) < 0.7210000157356262d || this.f14797c < 0.85f) ? false : false;
        }
        Boolean bool = this.f14800e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f14800e = Boolean.valueOf(z10);
        z2 z2Var = this.f14802f;
        int systemUiVisibility = z2Var.getSystemUiVisibility();
        if (z10) {
            i3 = systemUiVisibility | 8192;
        } else {
            i3 = systemUiVisibility & (-8193);
        }
        z2Var.setSystemUiVisibility(i3);
    }

    public final void K() {
        org.telegram.ui.web.t0 webView;
        s2 s2Var = this.E;
        if (s2Var == null || (webView = s2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        int i3;
        w2 w2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT <= 28) {
                i3 = 1024;
            } else {
                i3 = 512;
            }
            boolean z10 = this.f14803f0;
            if (z10) {
                attributes.flags = i3 | attributes.flags;
            } else {
                attributes.flags = (~i3) & attributes.flags;
            }
            z2 z2Var = this.f14802f;
            if (z10 && (((w2Var = this.f14811n0) == null || w2Var.getTotalHeight() <= 0) && !z2Var.f15344h0)) {
                z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
            } else {
                z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
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
    public final org.telegram.ui.ActionBar.a3 c() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3();
        a3Var.f27365q = this.S;
        a3Var.f27364p = this.f14823w0;
        a3Var.f27362n = this.W;
        a3Var.f27363o = this.X;
        a3Var.f27366r = this.R.getColor();
        a3Var.f27351a = this.f14825x0;
        boolean z13 = false;
        s2 s2Var = this.E;
        if (s2Var != null && s2Var.O) {
            z10 = true;
        } else {
            z10 = false;
        }
        a3Var.f27368t = z10;
        a3Var.D = k6.I.q();
        org.telegram.ui.web.t0 t0Var = null;
        if (s2Var != null) {
            str = s2Var.getUrlLoaded();
        } else {
            str = null;
        }
        a3Var.f27371x = str;
        if (s2Var != null && s2Var.f51087u0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a3Var.f27354e = z11;
        if (s2Var != null) {
            str2 = s2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        a3Var.f27355f = str2;
        r2 r2Var = this.f14824x;
        if ((r2Var == null || r2Var.getSwipeOffsetY() >= 0.0f) && !this.f14828z0 && !r() && !this.f14803f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        a3Var.f27358j = z12;
        a3Var.f27373z = this.f14803f0;
        a3Var.A = this.f14804g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        a3Var.B = booleanValue;
        if (r2Var != null) {
            f10 = r2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        a3Var.f27359k = f10;
        a3Var.C = this.C0;
        a3Var.f27369u = this.f14827y0;
        a3Var.f27372y = this.f14819t0;
        a3Var.v = this.f14799d0;
        if (r2Var == null || r2Var.N) {
            z13 = true;
        }
        a3Var.f27360l = z13;
        a3Var.f27370w = this.f14811n0.f15261e;
        a3Var.f27367s = this.T;
        w0 w0Var = this.D0;
        if (w0Var != null) {
            w0Var.b();
        }
        a3Var.K = this.D0;
        if (s2Var != null) {
            t0Var = s2Var.getWebView();
        }
        if (t0Var != null) {
            s2Var.L();
            a3Var.f27352b = t0Var;
            a3Var.d = s2Var.getBotProxy();
            a3Var.f27356g = t0Var.getWidth();
            a3Var.h = t0Var.getHeight();
            t0Var.onPause();
        }
        boolean z14 = this.X0;
        a3Var.G = z14;
        if (z14) {
            a3Var.H = this.Y0;
        }
        a3Var.L = this.E0;
        this.F0 = a3Var;
        return a3Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.h3 mo25d() {
        return this.f14802f;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23348z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i3 == hs.n4) {
            this.f14802f.invalidate();
            this.E.f51077n.b(k6.w0(k6.f27878d6, this.G), 153);
            F();
            J();
        } else if (i3 == hs.J3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        o(false);
    }

    @Override
    public final int e(int i3) {
        return i0.a.f(this.S0, i3, this.T);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.x2 x2Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        int i3;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        if (botappsettings != null) {
            boolean q10 = k6.I.q();
            int i14 = botappsettings.flags;
            if (q10) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            if ((i3 & i14) != 0) {
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
        if (!this.R0 && (launchActivity = LaunchActivity.K1) != null) {
            launchActivity.F(true, true, true);
        }
        z2 z2Var = this.f14802f;
        if (z2Var != null) {
            z2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.c3 c3Var = new org.telegram.ui.c3(getContext());
            this.Z0 = c3Var;
            this.f14824x.addView(c3Var, mf.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new c2(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.Z3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        int i3;
        LaunchActivity launchActivity;
        if (this.f14801e0) {
            return;
        }
        int i10 = 0;
        if (this.M0 != null) {
            z10 = false;
        }
        this.f14801e0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.f14821v0);
        hs.f(this.I).n(this, hs.f23348z1);
        hs.f(this.I).n(this, hs.J3);
        hs.e().n(this, hs.n4);
        if (z10 && ((launchActivity = LaunchActivity.K1) == null || launchActivity.f41330z0 == null)) {
            z10 = false;
        }
        if (z10) {
            q1.g gVar = this.d;
            if (gVar != null) {
                gVar.f53653m.f53661i = 0.0f;
                gVar.h();
            }
            LaunchActivity.K1.f41330z0.b(this);
        } else {
            w2 w2Var = this.f14811n0;
            if (w2Var != null) {
                w2Var.animate().translationY(w2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(xq.h).start();
            }
            this.E.h();
            r2 r2Var = this.f14824x;
            int height = r2Var.getHeight();
            if (w2Var != null) {
                i3 = w2Var.getTotalHeight();
            } else {
                i3 = 0;
            }
            int i11 = height + i3;
            Rect rect = this.f14810n;
            int Q = this.f14802f.Q() + i11 + rect.top + rect.bottom;
            if (r()) {
                i10 = org.telegram.messenger.g0.L(200.0f);
            }
            r2Var.f(Q + i10, true, new x1(this, 0));
        }
        f14789b1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            q1.g gVar = new q1.g(this, f14790c1);
            q1.h hVar = new q1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.f53653m = hVar;
            this.d = gVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f14820u0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.E.C()) {
        } else {
            o(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        w2 w2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
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
        if (i3 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f14803f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        z2 z2Var = this.f14802f;
        z2Var.setFitsSystemWindows(true);
        z2Var.setSystemUiVisibility(1792);
        z2Var.setOnApplyWindowInsetsListener(new b2(this, 0));
        if (this.f14803f0 && ((w2Var = this.f14811n0) == null || w2Var.getTotalHeight() <= 0)) {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
        } else {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
        }
        if (i3 >= 26) {
            if (i0.a.h(this.T) < 0.7210000157356262d) {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        }
        hs.e().c(this, hs.n4);
        hs.f(this.I).c(this, hs.J3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        q1.g gVar = this.d;
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
            ((LaunchActivity) context).C0.add(this.f14820u0);
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
            ((LaunchActivity) context).C0.remove(this.f14820u0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.K1;
        }
        if (ownerActivity == null) {
            return org.telegram.messenger.g0.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean q() {
        q4 q4Var = this.f14825x0;
        if (q4Var != null && q4Var.f15169g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f14803f0) {
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
        int i3;
        if (this.f14825x0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f14825x0.f15179r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.B0 = null;
            TLObject tLObject = this.f14825x0.f15178q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.L = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.G0;
                if (!z11) {
                    C(tL_webViewResultUrl.fullscreen, !z11, this.f14804g0);
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
                li b02 = li.b0(this.I);
                long j10 = this.f14825x0.f15166c;
                TLRPC.User a22 = b02.getMessagesController().a2(Long.valueOf(j10));
                if (a22 != null && a22.bot) {
                    if (b02.getUserConfig().H != 0) {
                        i3 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().H);
                    } else {
                        i3 = 60;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= b02.m1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.m1.get(i10);
                        if (tL_topPeer2.peer.user_id == j10) {
                            tL_topPeer = tL_topPeer2;
                            break;
                        }
                        i10++;
                    }
                    if (tL_topPeer == null) {
                        tL_topPeer = new TLRPC.TL_topPeer();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = j10;
                        b02.m1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i3 / b02.getMessagesController().f22957a3) + tL_topPeer.rating;
                    Collections.sort(b02.m1, new o0.a(11));
                    if (b02.m1.size() > 20) {
                        a1.g.y(1, b02.m1);
                    }
                    b02.getMessagesStorage().f24934a.c(new sg(b02, j10, 2, tL_topPeer.rating));
                    b02.getNotificationCenter().k(hs.V0, new Object[0]);
                }
                this.E.t(this.I, str, z10);
            }
            org.telegram.messenger.g0.i3(this.f14821v0, max);
            r2 r2Var = this.f14824x;
            if (r2Var != null) {
                r2Var.setFullSize(r());
            }
        }
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        E(true);
        z2 z2Var = this.f14802f;
        z2Var.setAlpha(0.0f);
        z2Var.addOnLayoutChangeListener(new l2(this, 0));
        super.show();
        this.R0 = false;
        f14789b1.add(this);
    }

    public final void t(boolean z10) {
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (this.f14794a1) {
            if (z10) {
                f14791d1++;
            } else {
                f14791d1--;
            }
        }
        if (f14791d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.Q3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f14819t0) {
            TLRPC.User a22 = hp.s1(this.I).a2(Long.valueOf(this.J));
            if (a22 != null) {
                str = g5.m(0, a22.first_name, a22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = str;
            s1Var.U = bd.M0(2131752917, null);
            alertDialog$Builder.k(bd.M0(2131752916, null), new y1(this));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            s1Var.show();
            ((TextView) s1Var.d(-1)).setTextColor(k6.w0(k6.f28122q7, this.G));
            return false;
        }
        o(false);
        return true;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        int i3;
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
        TLRPC.User a22 = hp.s1(this.I).a2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = li.b0(this.I).f24011b.bots;
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
        f60 f60Var = this.P0;
        if (f60Var != null) {
            f60Var.u();
        }
        if (this.f14803f0) {
            view = this.f14812o0;
        } else {
            view = this.f14796b0;
        }
        f60 G = f60.G(this.f14802f, this.G, view, true);
        this.P0 = G;
        ArrayList arrayList3 = i0.c(getContext(), this.I, this.J).f15003e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            f60 J = G.J();
            J.c(2131232057, bd.M0(2131753756, null), new xp0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList3.get(i14);
                i14++;
                h0 h0Var = (h0) obj;
                String str = h0Var.f14976c;
                ai.y1 y1Var = new ai.y1(18);
                e6 e6Var = J.d;
                if (J.f33722e == null) {
                    arrayList = arrayList3;
                    i12 = size2;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, J.f33722e, J.d, false, false);
                    arrayList = arrayList3;
                    i12 = size2;
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    y0Var.setText(str);
                    y0Var.setSubtext("");
                    Integer num = J.f33732j0;
                    if (num == null && J.f33734k0 == null) {
                        y0Var.c(k6.E8, k6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = k6.w0(k6.E8, e6Var);
                        }
                        Integer num2 = J.f33734k0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = k6.w0(k6.F8, e6Var);
                        }
                        y0Var.d(w02, w03);
                    }
                    Integer num3 = J.f33736l0;
                    if (num3 != null) {
                        y0Var.setSelectorColor(num3.intValue());
                    } else {
                        y0Var.h(0.12f, k6.E8);
                    }
                    y0Var.setOnClickListener(new org.telegram.ui.Components.f0(J, y1Var));
                    int i15 = J.S;
                    if (i15 > 0) {
                        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
                        J.r(y0Var, mf.o(J.S, -2));
                    } else {
                        J.r(y0Var, mf.o(-1, -2));
                        hashMap.put(h0Var, J.y());
                        size2 = i12;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(h0Var, J.y());
                size2 = i12;
                arrayList3 = arrayList;
            }
            i3 = -1;
            G();
            J.S = org.telegram.messenger.g0.L(180.0f);
            G.c(2131231789, bd.M0(2131753094, null), new ai.y3(G, J, 1), false);
            G.k();
        } else {
            i3 = -1;
        }
        if (this.M0 == null && !q10) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(2131232072, bd.M0(2131752912, null), new x1(this, 9), z10);
        if (this.M0 == null && this.f14799d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(2131232360, bd.M0(2131752897, null), new x1(this, 10), z11);
        G.c(2131232342, bd.M0(2131752911, null), new ci.e1(10, this, q10), false);
        if (this.M0 == null && a22 != null && a22.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(2131232183, bd.M0(2131754390, null), new x1(this, 11), z12);
        if (this.M0 == null && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(2131231835, bd.M0(2131752894, null), new x1(this, 12), z13);
        if (this.M0 == null && !q10) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(2131232333, bd.M0(2131752910, null), new x1(this, 13), z14);
        if (this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(2131232108, bd.M0(2131752915, null), new x1(this, 14), z15);
        if (this.S != k6.x0(null, k6.f27878d6, false)) {
            if (org.telegram.messenger.g0.B(this.S) >= 0.721f) {
                i10 = i3;
            } else {
                i10 = -15198183;
            }
            if (org.telegram.messenger.g0.B(i10) >= 0.721f) {
                i11 = -16777216;
            } else {
                i11 = i3;
            }
            int r12 = k6.r1(0.85f, i11);
            int r13 = k6.r1(0.1f, i11);
            G.P(i10);
            for (int i16 = 0; i16 < G.x(); i16++) {
                View w10 = G.w(i16);
                if (w10 instanceof org.telegram.ui.ActionBar.y0) {
                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) w10;
                    y0Var2.d(i11, r12);
                    y0Var2.setSelectorColor(r13);
                }
            }
        }
        G.V(5);
        G.a0(-this.f14810n.right, 0.0f);
        G.U = true;
        G.f33748t = false;
        G.f33747s = 0;
        G.Z();
    }

    public final void x(org.telegram.ui.ActionBar.d2 d2Var, q4 q4Var) {
        boolean z10;
        TLRPC.User a22;
        CharSequence p10;
        TLRPC.UserFull b22;
        TLRPC.User user;
        org.telegram.ui.ActionBar.x xVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.x xVar2;
        boolean z11;
        TLRPC.InputPeer n12;
        TLRPC.InputPeer j12;
        boolean z12;
        boolean z13;
        TL_bots.botAppSettings botappsettings;
        String p11;
        boolean z14;
        this.f14825x0 = q4Var;
        int i3 = q4Var.f15164a;
        this.I = i3;
        this.K = q4Var.f15165b;
        this.J = q4Var.f15166c;
        this.M = q4Var.h;
        this.N = q4Var.f15170i;
        this.O = q4Var.f15167e;
        if (q4Var.f15169g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a22 = null;
        } else {
            a22 = hp.s1(i3).a2(Long.valueOf(this.J));
        }
        if (z10) {
            p10 = q4Var.f15167e;
        } else {
            p10 = l10.p(a22);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        x2 x2Var = this.Y;
        x2Var.setTitle(p10);
        if (z10) {
            b22 = null;
        } else {
            b22 = hp.s1(this.I).b2(this.J);
        }
        e6 e6Var = this.G;
        if ((a22 != null && a22.verified) || (b22 != null && (user = b22.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232791).mutate();
            r6.y(x2Var.getTitleTextView(), this.N0, k6.Ci, e6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            x2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            x2Var.getTitleTextView().i(new gi.k3(this, 1));
        }
        org.telegram.messenger.h2 h2Var = this.f14812o0;
        if (h2Var != null) {
            if (z10) {
                p11 = q4Var.f15167e;
            } else {
                p11 = l10.p(a22);
            }
            if (a22 != null && a22.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            h2Var.U = new ly0(p11, 13.0f, org.telegram.messenger.g0.o());
            if (!z14) {
                h2Var.V = null;
                h2Var.W = null;
            } else {
                h2Var.V = h2Var.getContext().getResources().getDrawable(2131232789).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(2131232790).mutate();
            }
        }
        org.telegram.ui.ActionBar.x q10 = x2Var.q();
        q10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(this.I).f24011b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                xVar = q10;
                userFull = b22;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
                q10 = xVar;
                b22 = userFull;
            } else {
                xVar = q10;
                userFull = b22;
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
                hp.s1(this.I).W2(a22, 0, true, new a2(this, 1));
            }
            if (q4Var.f15177p) {
                C(z13, z12, this.f14804g0);
            }
        }
        if (this.M0 == null) {
            xVar2 = xVar;
            xVar2.a(2131296492, 2131230871);
        } else {
            xVar2 = xVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.f14798c0 = g2Var;
        org.telegram.ui.ActionBar.q0 d = xVar2.d(0, g2Var);
        this.f14796b0 = d;
        d.setOnClickListener(new c2(this, 1));
        x2Var.setActionBarMenuOnItemClick(new j2(this, 0));
        JSONObject u10 = u(e6Var, false);
        s2 s2Var = this.E;
        s2Var.setBotUser(a22);
        if (!z10) {
            s2Var.s(this.I, this.J);
            TLRPC.User user2 = q4Var.f15174m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                li.b0(this.I);
                if (!li.z0(li.f24005d2, this.J)) {
                    if (user2 == null) {
                        user2 = hp.s1(this.I).a2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.K(user2.photo.photo_small, null, true, true).exists()) {
                            li.b0(this.I).l1(org.telegram.messenger.ac.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (q4Var.f15178q != null) {
            s();
            return;
        }
        int i11 = q4Var.f15169g;
        int i12 = hs.f23348z1;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = hp.s1(this.I).j1(this.K);
                tL_messages_requestWebView.bot = hp.s1(this.I).o1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = q4Var.f15176o;
                tL_messages_requestWebView.fullscreen = q4Var.f15177p;
                String str = q4Var.f15168f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    yy.C(this.I);
                    int i13 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i13;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = hp.s1(this.I).j1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = hp.s1(this.I).j1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new h2(this, 3));
                hs.f(this.I).c(this, i12);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((q4Var.f15175n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = hp.s1(this.I).o1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((q4Var.f15175n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = q4Var.f15176o;
                tL_messages_requestSimpleWebView.fullscreen = q4Var.f15177p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(q4Var.f15168f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = q4Var.f15168f;
                }
                if (!TextUtils.isEmpty(q4Var.f15173l)) {
                    tL_messages_requestSimpleWebView.start_param = q4Var.f15173l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new h2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = hp.s1(this.I).o1(this.J);
                tL_messages_requestWebView2.peer = hp.s1(this.I).j1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = q4Var.f15176o;
                tL_messages_requestWebView2.fullscreen = q4Var.f15177p;
                tL_messages_requestWebView2.url = q4Var.f15168f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new h2(this, 1));
                hs.f(this.I).c(this, i12);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = q4Var.f15171j;
                tL_inputBotAppID.f27059id = botApp.f26998id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = q4Var.f15172k;
                tL_messages_requestAppWebView.platform = "android";
                if (d2Var instanceof wm) {
                    wm wmVar = (wm) d2Var;
                    if (wmVar.j() != null) {
                        n12 = hp.n1(wmVar.j());
                    } else {
                        n12 = hp.l1(wmVar.f51292e);
                    }
                } else {
                    n12 = hp.n1(q4Var.f15174m);
                }
                tL_messages_requestAppWebView.peer = n12;
                tL_messages_requestAppWebView.compact = q4Var.f15176o;
                tL_messages_requestAppWebView.fullscreen = q4Var.f15177p;
                if (!TextUtils.isEmpty(q4Var.f15173l)) {
                    tL_messages_requestAppWebView.start_param = q4Var.f15173l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new h2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = hp.s1(this.I).o1(q4Var.f15166c);
                tL_messages_requestMainWebView.platform = "android";
                if (d2Var instanceof wm) {
                    wm wmVar2 = (wm) d2Var;
                    if (wmVar2.j() != null) {
                        j12 = hp.n1(wmVar2.j());
                    } else {
                        j12 = hp.l1(wmVar2.f51292e);
                    }
                } else {
                    j12 = hp.s1(this.I).j1(q4Var.f15165b);
                }
                tL_messages_requestMainWebView.peer = j12;
                tL_messages_requestMainWebView.compact = q4Var.f15176o;
                tL_messages_requestMainWebView.fullscreen = q4Var.f15177p;
                if (!TextUtils.isEmpty(q4Var.f15173l)) {
                    tL_messages_requestMainWebView.start_param = q4Var.f15173l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new h2(this, 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = q4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new c3.b(1), new gi.q4(this, 10), 66);
                return;
            case 6:
                if (!this.G0) {
                    s2Var.t(this.I, q4Var.f15168f, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void y(final int i3, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        final int i11 = this.S;
        k6.b(0.35f, -0.1f, i3);
        final u1 u1Var = new u1();
        int i12 = 0;
        if (this.W) {
            i10 = this.S;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = u1Var.f15252a;
        e6 e6Var = this.G;
        u1Var.c(sparseIntArray, i10, e6Var);
        this.W = z10;
        if (i0.a.h(i3) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.U = z12;
        if (this.W) {
            i12 = i3;
        }
        u1Var.c(u1Var.f15253b, i12, e6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(xq.f40452f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i11, i3);
                    a3 a3Var = a3.this;
                    a3Var.S = f10;
                    a3Var.l();
                    z2 z2Var = a3Var.f14802f;
                    z2Var.invalidate();
                    x2 x2Var = a3Var.Y;
                    x2Var.setBackgroundColor(a3Var.S);
                    u1 u1Var2 = u1Var;
                    u1Var2.b(x2Var, floatValue);
                    a3Var.f14792a = u1Var2.a(k6.wj);
                    z2Var.invalidate();
                }
            });
            duration.addListener(new q2(this, i11, i3, u1Var));
            duration.start();
        } else {
            this.S = i3;
            l();
            z2 z2Var = this.f14802f;
            z2Var.invalidate();
            int i13 = this.S;
            x2 x2Var = this.Y;
            x2Var.setBackgroundColor(i13);
            u1Var.b(x2Var, 1.0f);
            this.f14792a = u1Var.a(k6.wj);
            z2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.f14794a1 == z10) {
            return;
        }
        this.f14794a1 = z10;
        if (z10) {
            if (this.E0) {
                f14791d1++;
            }
        } else if (this.E0) {
            f14791d1--;
        }
        if (f14791d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.Q3(p());
        }
    }

    @Override
    public final void b(boolean z10) {
    }
}
