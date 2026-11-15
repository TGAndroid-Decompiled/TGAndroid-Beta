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
import bi.i6;
import bi.v4;
import c8.ja;
import hi.q4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.ez;
import org.telegram.messenger.g5;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.zg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.fq0;
import org.telegram.ui.p51;
public final class x2 extends Dialog implements is, org.telegram.ui.ActionBar.g3 {
    public static final HashSet f18648b1 = new HashSet();
    public static final mt0 f18649c1;
    public static int f18650d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public w0 D0;
    public final p2 E;
    public boolean E0;
    public final v2 F;
    public org.telegram.ui.ActionBar.b3 F0;
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
    public p51 M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public m60 P0;
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
    public final u2 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public org.telegram.ui.b3 Z0;
    public int f18651a;
    public final Drawable f18652a0;
    public boolean f18653a1;
    public int f18654b;
    public org.telegram.ui.ActionBar.q0 f18655b0;
    public float f18656c;
    public org.telegram.messenger.g2 f18657c0;
    public r1.g d;
    public boolean f18658d0;
    public Boolean f18659e;
    public boolean f18660e0;
    public final w2 f18661f;
    public boolean f18662f0;
    public boolean f18663g0;
    public final Rect h;
    public float f18664h0;
    public float f18665i0;
    public boolean f18666j0;
    public int f18667k0;
    public int f18668l0;
    public Activity m0;
    public final Rect f18669n;
    public final t2 f18670n0;
    public final org.telegram.messenger.h2 f18671o0;
    public xb f18672p0;
    public g0 f18673q0;
    public int f18674r;
    public final FrameLayout f18675r0;
    public final org.telegram.ui.ActionBar.c3 f18676s;
    public final FrameLayout.LayoutParams f18677s0;
    public boolean f18678t0;
    public final fc0 f18679u0;
    public final x1 f18680v0;
    public final r7 f18681w;
    public int f18682w0;
    public final o2 f18683x;
    public k4 f18684x0;
    public final FrameLayout.LayoutParams f18685y;
    public boolean f18686y0;
    public boolean f18687z0;

    static {
        mt0 mt0Var = new mt0(new i0.b(15), new i0.b(16));
        mt0Var.f37378c = 100.0f;
        f18649c1 = mt0Var;
        f18650d1 = 0;
    }

    public x2(Context context, e6 e6Var) {
        super(context, 2131755352);
        boolean z10;
        Object obj;
        org.telegram.ui.ActionBar.c3 c3Var;
        this.f18656c = 0.0f;
        this.h = new Rect();
        this.f18669n = new Rect();
        this.f18674r = 0;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.f18680v0 = new x1(this, 1);
        this.f18682w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.f18653a1 = false;
        this.G = e6Var;
        int x02 = j6.x0(null, j6.zj, false);
        this.f18654b = x02;
        this.f18651a = x02;
        o2 o2Var = new o2(0, context, this);
        this.f18683x = o2Var;
        o2Var.setAllowFullSizeSwipe(true);
        o2Var.setShouldWaitWebViewScroll(true);
        int i7 = j6.f28849d6;
        p2 p2Var = new p2(this, context, e6Var, j6.w0(i7, e6Var), 0);
        this.E = p2Var;
        p2Var.setOnVerifiedAge(this.M0);
        p2Var.setDelegate(new s2(this, context, e6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = j6.w0(i7, e6Var);
        int w02 = j6.w0(j6.f28792a7, e6Var);
        this.T = w02;
        org.telegram.messenger.g0.t3(this, w02, false, null);
        w2 w2Var = new w2(this, context);
        this.f18661f = w2Var;
        w2Var.setDelegate(new z1(this, 0));
        FrameLayout.LayoutParams e10 = ja.e(-1, -1, 49);
        this.f18685y = e10;
        w2Var.addView(o2Var, e10);
        t2 t2Var = new t2(this, getContext(), e6Var);
        this.f18670n0 = t2Var;
        t2Var.setOnButtonClickListener(new a2(this, 0));
        t2Var.setOnResizeListener(new x1(this, 3));
        w2Var.addView(t2Var, ja.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.f18671o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        if (!np.s1(this.I).H6 && gz.o() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18663g0 = z10;
        if (z10) {
            obj = o2Var.getRenderNode();
        } else {
            obj = null;
        }
        h2Var.setParentRenderNode(obj);
        w2Var.addView(h2Var, ja.e(-1, -1, 119));
        h2Var.setOnCloseClickListener(new x1(this, 4));
        h2Var.setOnCollapseClickListener(new x1(this, 5));
        h2Var.setOnMenuClickListener(new x1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18675r0 = frameLayout;
        FrameLayout.LayoutParams e11 = ja.e(-1, 200, 55);
        this.f18677s0 = e11;
        w2Var.addView(frameLayout, e11);
        this.f18652a0 = getContext().getDrawable(2131231237).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        this.Y = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(2131231269);
        F();
        kVar.setActionBarMenuOnItemClick(new i2(this, 1));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = ja.e(-1, -2, 49);
        this.Z = e12;
        w2Var.addView((View) kVar, e12);
        ?? t3Var = new t3(context, e6Var);
        this.F = t3Var;
        w2Var.addView((View) t3Var, ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        p2Var.setWebViewProgressListener(new i6(this, 4));
        o2Var.addView(p2Var, ja.c(-1.0f, -1));
        o2Var.setScrollListener(new x1(this, 7));
        o2Var.setScrollEndListener(new x1(this, 8));
        o2Var.setDelegate(new y1(this));
        o2Var.setIsKeyboardVisible(new y1(this));
        fc0 fc0Var = new fc0(context);
        this.f18679u0 = fc0Var;
        w2Var.addView(fc0Var, ja.c(-1.0f, -1));
        setContentView(w2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            c3Var = launchActivity.N();
        } else {
            c3Var = null;
        }
        this.f18676s = c3Var;
        if (c3Var != null) {
            kg.j1 j1Var = new kg.j1(w2Var, 9);
            x1 x1Var = new x1(this, 2);
            c3Var.J.add(j1Var);
            c3Var.K.add(x1Var);
            this.f18681w = new r7(c3Var);
        }
    }

    public static void f(x2 x2Var) {
        if (!x2Var.R0) {
            super.dismiss();
            x2Var.R0 = true;
        }
    }

    public static WindowInsets h(x2 x2Var, View view, WindowInsets windowInsets) {
        int i7;
        WindowInsets windowInsets2;
        r0.h1 h1Var = r0.k1.h(view, windowInsets).f55682a;
        i0.c f10 = h1Var.f(2);
        x2Var.h.set(f10.f15574a, f10.f15575b, f10.f15576c, f10.d);
        i0.c f11 = h1Var.f(647);
        Rect rect = x2Var.f18669n;
        rect.set(Math.max(f11.f15574a, windowInsets.getStableInsetLeft()), Math.max(f11.f15575b, windowInsets.getStableInsetTop()), Math.max(f11.f15576c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Activity W = org.telegram.messenger.g0.W(x2Var.getContext());
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
            Context context = x2Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.f23581a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i7 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i7 = 0;
            }
            rect.top = Math.max(i11, i7);
        }
        int i12 = h1Var.f(8).d;
        if (i12 > rect.bottom && i12 > org.telegram.messenger.g0.L(20.0f)) {
            x2Var.f18674r = i12;
        } else {
            x2Var.f18674r = 0;
        }
        x2Var.I();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(x2 x2Var) {
        super.dismiss();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(i7).f26461b.bots;
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
        String a02 = hd.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = hd.M0(2131753001, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(hd.M0(2131747831, null), new o1(i7, j3, tL_attachMenuBot, runnable));
        i5.c.x(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(e6 e6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = j6.w(-16777216, j6.w0(j6.f28922h5, e6Var));
            a20 a20Var = new a20() {
                @Override
                public final Object a(Object obj) {
                    int w11 = j6.w(w10, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(w11);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", a20Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", a20Var.a(Integer.valueOf(j6.w0(j6.f28849d6, e6Var))));
            int i7 = j6.f28792a7;
            jSONObject.put("secondary_bg_color", a20Var.a(Integer.valueOf(j6.w0(i7, e6Var))));
            jSONObject.put("text_color", a20Var.a(Integer.valueOf(j6.w0(j6.G6, e6Var))));
            jSONObject.put("hint_color", a20Var.a(Integer.valueOf(j6.w0(j6.H6, e6Var))));
            jSONObject.put("link_color", a20Var.a(Integer.valueOf(j6.w0(j6.J6, e6Var))));
            jSONObject.put("button_color", a20Var.a(Integer.valueOf(j6.w0(j6.Fi, e6Var))));
            jSONObject.put("button_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.Ji, e6Var))));
            jSONObject.put("header_bg_color", a20Var.a(Integer.valueOf(j6.w0(j6.f29129s8, e6Var))));
            jSONObject.put("accent_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.f29089q6, e6Var))));
            jSONObject.put("section_header_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.L6, e6Var))));
            jSONObject.put("subtitle_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.f29260z6, e6Var))));
            jSONObject.put("destructive_text_color", a20Var.a(Integer.valueOf(j6.w0(j6.f29070p7, e6Var))));
            jSONObject.put("section_separator_color", a20Var.a(Integer.valueOf(j6.w0(j6.f28850d7, e6Var))));
            jSONObject.put("bottom_bar_bg_color", a20Var.a(Integer.valueOf(j6.w0(i7, e6Var))));
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
            duration.setInterpolator(er.f34420f);
            this.U0.addUpdateListener(new v1(this, color, i7, 0));
            this.U0.addListener(new j2(this, i7, 0));
            this.U0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f18661f.invalidate();
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
            o2 o2Var = this.f18683x;
            if (o2Var != null) {
                o2Var.setFullSize(r());
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
        if (this.f18662f0 == z10) {
            return;
        }
        this.f18662f0 = z10;
        int i7 = 0;
        if (z12 && !np.s1(this.I).H6 && gz.o() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f18663g0 = z13;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.f18671o0;
        o2 o2Var = this.f18683x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.f24031b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.i3(aVar, 2500L);
            }
            if (this.f18663g0) {
                obj = o2Var.getRenderNode();
            } else {
                obj = null;
            }
            h2Var.setParentRenderNode(obj);
        }
        this.f18667k0 = o2Var.getWidth();
        this.f18668l0 = o2Var.getHeight();
        this.V0 = false;
        t2 t2Var = this.f18670n0;
        p2 p2Var = this.E;
        u2 u2Var = this.Y;
        if (z11) {
            I();
            L();
            H();
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                int i10 = org.telegram.messenger.g0.f23609q.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f18669n.left;
            if (z10) {
                f12 = i11 + f11;
            } else {
                f12 = (-i11) - f11;
            }
            if (!z10) {
                f11 = -f11;
            }
            if (z10) {
                f13 = o2Var.getTranslationY();
            } else {
                f13 = -org.telegram.messenger.g0.L(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -org.telegram.messenger.g0.L(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m;
            r1.g gVar = o2Var.f18699w;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = o2Var.H;
            if (gVar2 != null) {
                gVar2.d();
            }
            o2Var.setSwipeOffsetAnimationDisallowed(true);
            u2Var.setVisibility(0);
            if (z10) {
                o2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                o2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
            }
            o2Var.c();
            o2Var.invalidate();
            this.f18665i0 = 0.0f;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f18664h0 = f14;
            u2Var.setAlpha(1.0f - f14);
            u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18664h0);
            o2Var.setTranslationY(org.telegram.messenger.g0.T1(f13, f15, this.f18665i0));
            o2Var.setTranslationX(org.telegram.messenger.g0.T1(f12, 0.0f, this.f18665i0));
            t2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.f18665i0));
            h2Var.setAlpha(this.f18664h0);
            this.f18661f.invalidate();
            p2Var.setViewPortHeightOffset(o2Var.getTranslationY() - f15);
            p2Var.n(false, false);
            this.f18666j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new k2(this, z10, f13, f15, f16, f11));
            this.W0.addListener(new l2(this, z10, currentActionBarHeight2, f16));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(er.h);
            this.W0.start();
            return;
        }
        this.f18666j0 = false;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f18664h0 = f10;
        this.f18665i0 = 0.0f;
        I();
        L();
        if (z10) {
            i7 = 8;
        }
        u2Var.setVisibility(i7);
        u2Var.setAlpha(1.0f - this.f18664h0);
        u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18664h0);
        t2Var.setTranslationX(0.0f);
        h2Var.setAlpha(this.f18664h0);
        p2Var.setViewPortHeightOffset(0.0f);
        p2Var.n(true, true);
        H();
    }

    public final void D(int i7, boolean z10) {
        this.J0 = false;
        int i10 = this.T;
        t2 t2Var = this.f18670n0;
        Paint paint = t2Var.f18590a;
        t2Var.f18593e.f713b = i7;
        paint.setColor(i7);
        if (!z10) {
            t2Var.d.a(i7, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(er.f34420f);
            duration.addUpdateListener(new v1(this, i10, i7, 1));
            duration.addListener(new m2(this, i10, i7, 0));
            duration.start();
        } else {
            this.T = i7;
            l();
        }
        org.telegram.messenger.g0.t3(this, this.T, false, null);
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
        ofFloat.addListener(new v4(16, this, z10));
        this.T0.addUpdateListener(new w1(this, 0));
        this.T0.setInterpolator(er.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i7 = j6.G6;
            e6 e6Var = this.G;
            int w02 = j6.w0(i7, e6Var);
            u2 u2Var = this.Y;
            u2Var.setTitleColor(w02);
            u2Var.H(j6.w0(i7, e6Var), false);
            u2Var.F(j6.w0(j6.f29167u8, e6Var), false);
            u2Var.I(j6.w0(j6.G8, e6Var), false);
            u2Var.J(j6.w0(j6.E8, e6Var), false, false);
            u2Var.J(j6.w0(j6.F8, e6Var), true, false);
            u2Var.K(j6.w0(j6.I5, e6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        xb xbVar;
        boolean z10;
        i0 c10 = i0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c10.f18358e;
        h0 h0Var = c10.f18359f;
        boolean z11 = true;
        if (h0Var == null) {
            xb xbVar2 = this.f18672p0;
            if (xbVar2 != null) {
                xbVar2.b();
                this.f18672p0 = null;
            }
        } else if ((h0Var.c() && !h0Var.f18335l) || h0Var.f18334k) {
            if (this.Q0 != h0Var && (xbVar = this.f18672p0) != null) {
                xbVar.b();
                this.f18672p0 = null;
            }
            xb xbVar3 = this.f18672p0;
            if (xbVar3 == null || !xbVar3.f41645l) {
                this.Q0 = h0Var;
                g0 g0Var = new g0(getContext(), this.G);
                this.f18673q0 = g0Var;
                xb f10 = xb.f(this.f18675r0, g0Var, 5000);
                this.f18672p0 = f10;
                f10.k(true);
            }
            if (this.f18673q0.c(h0Var)) {
                this.f18672p0 = null;
            }
            h0Var.f18334k = false;
            h0Var.f18335l = true;
        } else {
            g0 g0Var2 = this.f18673q0;
            if (g0Var2 != null) {
                this.Q0 = h0Var;
                if (g0Var2.c(h0Var)) {
                    this.f18672p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) entry.getValue();
            h0 h0Var2 = (h0) entry.getKey();
            z0Var.setText(h0Var2.f18328c);
            if (!h0Var2.c()) {
                z0Var.setSubtext(org.telegram.messenger.g0.i0(h0Var2.f18331g, false, false));
            } else {
                Pair b10 = h0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (h0Var2.c()) {
                z0Var.setRightIcon(2131232097);
                z0Var.f29900b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (h0Var2.f18332i) {
                z0Var.setVisibility(8);
            } else {
                z0Var.setRightIcon(0);
                z0Var.f29900b.setPadding(0, 0, 0, 0);
            }
            z0Var.setOnClickListener(new ai.t2(26, this, h0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.f18657c0;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((h0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (g2Var.f23630e != z10) {
            g2Var.f23630e = z10;
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
        this.f18671o0.setDownloading(z11);
    }

    public final void H() {
        g0 g0Var = this.f18673q0;
        if (g0Var == null) {
            return;
        }
        if (this.f18662f0) {
            g0Var.setArrow(org.telegram.messenger.g0.W1(this.f18664h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.f18656c > 0.5f) {
            g0Var.setArrow(org.telegram.messenger.g0.L(24.0f));
        } else {
            g0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.messenger.h2 h2Var = this.f18671o0;
        Rect rect = this.f18669n;
        h2Var.setInsets(rect);
        boolean z10 = this.f18662f0;
        p2 p2Var = this.E;
        w2 w2Var = this.f18661f;
        t2 t2Var = this.f18670n0;
        int i15 = 0;
        if (z10) {
            if (t2Var != null && t2Var.getTotalHeight() > 0) {
                i13 = rect.bottom;
            } else {
                i13 = 0;
            }
            int i16 = rect.left;
            int i17 = rect.top;
            int i18 = rect.right;
            if (this.f18674r > i13 || (t2Var != null && t2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int L = org.telegram.messenger.g0.L(46.0f);
            p2Var.Q(rect2, false);
            p2Var.P(L, false);
            w2Var.setPadding(0, 0, 0, Math.max(this.f18674r, i13));
        } else {
            p2Var.Q(new Rect(0, 0, 0, 0), false);
            p2Var.P(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f18674r;
            org.telegram.ui.ActionBar.c3 c3Var = this.f18676s;
            if (c3Var != null) {
                i7 = c3Var.I;
            } else {
                i7 = 0;
            }
            w2Var.setPadding(i19, 0, i20, Math.max(i21, i7 + rect.bottom));
        }
        this.f18685y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z11 = this.f18662f0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f18677s0;
        layoutParams2.leftMargin = i11;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z12 = this.f18666j0;
        o2 o2Var = this.f18683x;
        if (!z12) {
            o2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f18662f0) {
                o2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                o2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(24.0f));
            }
            o2Var.setSwipeOffsetAnimationDisallowed(false);
            o2Var.c();
            o2Var.invalidate();
            o2Var.requestLayout();
        }
        if (o2Var != null) {
            o2Var.setFullSize(r());
        }
        t2Var.requestLayout();
        w2Var.requestLayout();
        if (!this.f18662f0) {
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
            z10 = (org.telegram.messenger.g0.Q1() || i0.a.h(j6.x0(null, j6.f28849d6, true)) < 0.7210000157356262d || this.f18656c < 0.85f) ? false : false;
        }
        Boolean bool = this.f18659e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f18659e = Boolean.valueOf(z10);
        w2 w2Var = this.f18661f;
        int systemUiVisibility = w2Var.getSystemUiVisibility();
        if (z10) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        w2Var.setSystemUiVisibility(i7);
    }

    public final void K() {
        org.telegram.ui.web.s0 webView;
        p2 p2Var = this.E;
        if (p2Var == null || (webView = p2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        int i7;
        t2 t2Var;
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
            boolean z10 = this.f18662f0;
            if (z10) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            w2 w2Var = this.f18661f;
            if (z10 && (((t2Var = this.f18670n0) == null || t2Var.getTotalHeight() <= 0) && !w2Var.f18635h0)) {
                w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() | 2);
            } else {
                w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() & (-3));
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
    public final org.telegram.ui.ActionBar.b3 c() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3();
        b3Var.f28438q = this.S;
        b3Var.f28437p = this.f18682w0;
        b3Var.f28435n = this.W;
        b3Var.f28436o = this.X;
        b3Var.f28439r = this.R.getColor();
        b3Var.f28424a = this.f18684x0;
        boolean z13 = false;
        p2 p2Var = this.E;
        if (p2Var != null && p2Var.O) {
            z10 = true;
        } else {
            z10 = false;
        }
        b3Var.f28441t = z10;
        b3Var.D = j6.I.q();
        org.telegram.ui.web.s0 s0Var = null;
        if (p2Var != null) {
            str = p2Var.getUrlLoaded();
        } else {
            str = null;
        }
        b3Var.f28444x = str;
        if (p2Var != null && p2Var.f52838u0) {
            z11 = true;
        } else {
            z11 = false;
        }
        b3Var.f28427e = z11;
        if (p2Var != null) {
            str2 = p2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        b3Var.f28428f = str2;
        o2 o2Var = this.f18683x;
        if ((o2Var == null || o2Var.getSwipeOffsetY() >= 0.0f) && !this.f18687z0 && !r() && !this.f18662f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        b3Var.f28431j = z12;
        b3Var.f28446z = this.f18662f0;
        b3Var.A = this.f18663g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        b3Var.B = booleanValue;
        if (o2Var != null) {
            f10 = o2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        b3Var.f28432k = f10;
        b3Var.C = this.C0;
        b3Var.f28442u = this.f18686y0;
        b3Var.f28445y = this.f18678t0;
        b3Var.v = this.f18658d0;
        if (o2Var == null || o2Var.N) {
            z13 = true;
        }
        b3Var.f28433l = z13;
        b3Var.f28443w = this.f18670n0.f18593e;
        b3Var.f28440s = this.T;
        w0 w0Var = this.D0;
        if (w0Var != null) {
            w0Var.b();
        }
        b3Var.K = this.D0;
        if (p2Var != null) {
            s0Var = p2Var.getWebView();
        }
        if (s0Var != null) {
            p2Var.M();
            b3Var.f28425b = s0Var;
            b3Var.d = p2Var.getBotProxy();
            b3Var.f28429g = s0Var.getWidth();
            b3Var.h = s0Var.getHeight();
            s0Var.onPause();
        }
        boolean z14 = this.X0;
        b3Var.G = z14;
        if (z14) {
            b3Var.H = this.Y0;
        }
        b3Var.L = this.E0;
        this.F0 = b3Var;
        return b3Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.h3 mo25d() {
        return this.f18661f;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25615z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i7 == ns.f25540n4) {
            this.f18661f.invalidate();
            this.E.f52828n.b(j6.w0(j6.f28849d6, this.G), 153);
            F();
            J();
        } else if (i7 == ns.J3) {
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
    public final boolean i(org.telegram.ui.ActionBar.y2 y2Var) {
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
            boolean q10 = j6.I.q();
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
        w2 w2Var = this.f18661f;
        if (w2Var != null) {
            w2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Z0 = b3Var;
            this.f18683x.addView(b3Var, ja.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new c2(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.Y3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        int i7;
        LaunchActivity launchActivity;
        if (this.f18660e0) {
            return;
        }
        int i10 = 0;
        if (this.M0 != null) {
            z10 = false;
        }
        this.f18660e0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.f18680v0);
        ns.f(this.I).n(this, ns.f25615z1);
        ns.f(this.I).n(this, ns.J3);
        ns.e().n(this, ns.f25540n4);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.f42665x0 == null)) {
            z10 = false;
        }
        if (z10) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.f55748m.f55756i = 0.0f;
                gVar.h();
            }
            LaunchActivity.H1.f42665x0.b(this);
        } else {
            t2 t2Var = this.f18670n0;
            if (t2Var != null) {
                t2Var.animate().translationY(t2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(er.h).start();
            }
            this.E.h();
            o2 o2Var = this.f18683x;
            int height = o2Var.getHeight();
            if (t2Var != null) {
                i7 = t2Var.getTotalHeight();
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            Rect rect = this.f18669n;
            int Q = this.f18661f.Q() + i11 + rect.top + rect.bottom;
            if (r()) {
                i10 = org.telegram.messenger.g0.L(200.0f);
            }
            o2Var.f(Q + i10, true, new x1(this, 0));
        }
        f18648b1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, f18649c1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.f55748m = hVar;
            this.d = gVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f18679u0.getVisibility() == 0) {
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
        t2 t2Var;
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
        if (this.f18662f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        w2 w2Var = this.f18661f;
        w2Var.setFitsSystemWindows(true);
        w2Var.setSystemUiVisibility(1792);
        w2Var.setOnApplyWindowInsetsListener(new b2(this, 0));
        if (this.f18662f0 && ((t2Var = this.f18670n0) == null || t2Var.getTotalHeight() <= 0)) {
            w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() | 2);
        } else {
            w2Var.setSystemUiVisibility(w2Var.getSystemUiVisibility() & (-3));
        }
        if (i7 >= 26) {
            if (i0.a.h(this.T) < 0.7210000157356262d) {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        }
        ns.e().c(this, ns.f25540n4);
        ns.f(this.I).c(this, ns.J3);
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
            ((LaunchActivity) context).A0.add(this.f18679u0);
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
            ((LaunchActivity) context).A0.remove(this.f18679u0);
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
        k4 k4Var = this.f18684x0;
        if (k4Var != null && k4Var.f18409g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f18662f0) {
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
        if (this.f18684x0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f18684x0.f18419r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.B0 = null;
            TLObject tLObject = this.f18684x0.f18418q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.L = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.G0;
                if (!z11) {
                    C(tL_webViewResultUrl.fullscreen, !z11, this.f18663g0);
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
                si b02 = si.b0(this.I);
                long j3 = this.f18684x0.f18406c;
                TLRPC.User a22 = b02.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null && a22.bot) {
                    if (b02.getUserConfig().H != 0) {
                        i7 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().H);
                    } else {
                        i7 = 60;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= b02.f26486m1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.f26486m1.get(i10);
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
                        b02.f26486m1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i7 / b02.getMessagesController().f25228a3) + tL_topPeer.rating;
                    Collections.sort(b02.f26486m1, new jg.w(20));
                    if (b02.f26486m1.size() > 20) {
                        a8.p0.z(1, b02.f26486m1);
                    }
                    b02.getMessagesStorage().f27220a.c(new zg(b02, j3, 2, tL_topPeer.rating));
                    b02.getNotificationCenter().k(ns.V0, new Object[0]);
                }
                this.E.t(this.I, str, z10);
            }
            org.telegram.messenger.g0.i3(this.f18680v0, max);
            o2 o2Var = this.f18683x;
            if (o2Var != null) {
                o2Var.setFullSize(r());
            }
        }
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        E(true);
        w2 w2Var = this.f18661f;
        w2Var.setAlpha(0.0f);
        w2Var.addOnLayoutChangeListener(new kg.m(this, 1));
        super.show();
        this.R0 = false;
        f18648b1.add(this);
    }

    public final void t(boolean z10) {
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (this.f18653a1) {
            if (z10) {
                f18650d1++;
            } else {
                f18650d1--;
            }
        }
        if (f18650d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.P3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f18678t0) {
            TLRPC.User a22 = np.s1(this.I).a2(Long.valueOf(this.J));
            if (a22 != null) {
                str = g5.m(0, a22.first_name, a22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = str;
            t1Var.U = hd.M0(2131752917, null);
            alertDialog$Builder.k(hd.M0(2131752916, null), new y1(this));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            t1Var.show();
            ((TextView) t1Var.d(-1)).setTextColor(j6.w0(j6.f29090q7, this.G));
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
        TLRPC.User a22 = np.s1(this.I).a2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = si.b0(this.I).f26461b.bots;
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
        m60 m60Var = this.P0;
        if (m60Var != null) {
            m60Var.u();
        }
        if (this.f18662f0) {
            view = this.f18671o0;
        } else {
            view = this.f18655b0;
        }
        m60 G = m60.G(this.f18661f, this.G, view, true);
        this.P0 = G;
        ArrayList arrayList3 = i0.c(getContext(), this.I, this.J).f18358e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            m60 J = G.J();
            J.c(2131232058, hd.M0(2131753756, null), new fq0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList3.get(i14);
                i14++;
                h0 h0Var = (h0) obj;
                String str = h0Var.f18328c;
                ai.o oVar = new ai.o(20);
                e6 e6Var = J.d;
                if (J.f37086e == null) {
                    arrayList = arrayList3;
                    i12 = size2;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, J.f37086e, J.d, false, false);
                    arrayList = arrayList3;
                    i12 = size2;
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    z0Var.setText(str);
                    z0Var.setSubtext("");
                    Integer num = J.f37096j0;
                    if (num == null && J.f37098k0 == null) {
                        z0Var.c(j6.E8, j6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = j6.w0(j6.E8, e6Var);
                        }
                        Integer num2 = J.f37098k0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = j6.w0(j6.F8, e6Var);
                        }
                        z0Var.d(w02, w03);
                    }
                    Integer num3 = J.f37100l0;
                    if (num3 != null) {
                        z0Var.setSelectorColor(num3.intValue());
                    } else {
                        z0Var.h(0.12f, j6.E8);
                    }
                    z0Var.setOnClickListener(new org.telegram.ui.Components.e0(J, oVar));
                    int i15 = J.S;
                    if (i15 > 0) {
                        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
                        J.r(z0Var, ja.o(J.S, -2));
                    } else {
                        J.r(z0Var, ja.o(-1, -2));
                        hashMap.put(h0Var, J.y());
                        size2 = i12;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(h0Var, J.y());
                size2 = i12;
                arrayList3 = arrayList;
            }
            i7 = -1;
            G();
            J.S = org.telegram.messenger.g0.L(180.0f);
            G.c(2131231789, hd.M0(2131753094, null), new bi.n3(G, J, 1), false);
            G.k();
        } else {
            i7 = -1;
        }
        if (this.M0 == null && !q10) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(2131232073, hd.M0(2131752912, null), new x1(this, 9), z10);
        if (this.M0 == null && this.f18658d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(2131232361, hd.M0(2131752897, null), new x1(this, 10), z11);
        G.c(2131232343, hd.M0(2131752911, null), new ai.q(11, this, q10), false);
        if (this.M0 == null && a22 != null && a22.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(2131232184, hd.M0(2131754390, null), new x1(this, 11), z12);
        if (this.M0 == null && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(2131231835, hd.M0(2131752894, null), new x1(this, 12), z13);
        if (this.M0 == null && !q10) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(2131232334, hd.M0(2131752910, null), new x1(this, 13), z14);
        if (this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(2131232109, hd.M0(2131752915, null), new x1(this, 14), z15);
        if (this.S != j6.x0(null, j6.f28849d6, false)) {
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
            int r12 = j6.r1(0.85f, i11);
            int r13 = j6.r1(0.1f, i11);
            G.P(i10);
            for (int i16 = 0; i16 < G.x(); i16++) {
                View w10 = G.w(i16);
                if (w10 instanceof org.telegram.ui.ActionBar.z0) {
                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) w10;
                    z0Var2.d(i11, r12);
                    z0Var2.setSelectorColor(r13);
                }
            }
        }
        G.V(5);
        G.a0(-this.f18669n.right, 0.0f);
        G.U = true;
        G.f37112t = false;
        G.f37111s = 0;
        G.Z();
    }

    public final void x(org.telegram.ui.ActionBar.e2 e2Var, k4 k4Var) {
        boolean z10;
        TLRPC.User a22;
        CharSequence p10;
        TLRPC.UserFull b22;
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        boolean z11;
        TLRPC.InputPeer n1;
        TLRPC.InputPeer j12;
        boolean z12;
        boolean z13;
        TL_bots.botAppSettings botappsettings;
        String p11;
        boolean z14;
        this.f18684x0 = k4Var;
        int i7 = k4Var.f18404a;
        this.I = i7;
        this.K = k4Var.f18405b;
        this.J = k4Var.f18406c;
        this.M = k4Var.h;
        this.N = k4Var.f18410i;
        this.O = k4Var.f18407e;
        if (k4Var.f18409g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a22 = null;
        } else {
            a22 = np.s1(i7).a2(Long.valueOf(this.J));
        }
        if (z10) {
            p10 = k4Var.f18407e;
        } else {
            p10 = q10.p(a22);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = org.telegram.messenger.j6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        u2 u2Var = this.Y;
        u2Var.setTitle(p10);
        if (z10) {
            b22 = null;
        } else {
            b22 = np.s1(this.I).b2(this.J);
        }
        e6 e6Var = this.G;
        if ((a22 != null && a22.verified) || (b22 != null && (user = b22.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232794).mutate();
            q6.x(u2Var.getTitleTextView(), this.N0, j6.Fi, e6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            u2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            u2Var.getTitleTextView().i(new hi.k3(this, 1));
        }
        org.telegram.messenger.h2 h2Var = this.f18671o0;
        if (h2Var != null) {
            if (z10) {
                p11 = k4Var.f18407e;
            } else {
                p11 = q10.p(a22);
            }
            if (a22 != null && a22.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            h2Var.U = new oy0(p11, 13.0f, org.telegram.messenger.g0.o());
            if (!z14) {
                h2Var.V = null;
                h2Var.W = null;
            } else {
                h2Var.V = h2Var.getContext().getResources().getDrawable(2131232792).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(2131232793).mutate();
            }
        }
        org.telegram.ui.ActionBar.y s5 = u2Var.s();
        s5.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(this.I).f26461b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                yVar = s5;
                userFull = b22;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
                s5 = yVar;
                b22 = userFull;
            } else {
                yVar = s5;
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
                np.s1(this.I).W2(a22, 0, true, new a2(this, 1));
            }
            if (k4Var.f18417p) {
                C(z13, z12, this.f18663g0);
            }
        }
        if (this.M0 == null) {
            yVar2 = yVar;
            yVar2.a(2131296492, 2131230871);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.f18657c0 = g2Var;
        org.telegram.ui.ActionBar.q0 d = yVar2.d(0, g2Var);
        this.f18655b0 = d;
        d.setOnClickListener(new c2(this, 1));
        u2Var.setActionBarMenuOnItemClick(new i2(this, 0));
        JSONObject u10 = u(e6Var, false);
        p2 p2Var = this.E;
        p2Var.setBotUser(a22);
        if (!z10) {
            p2Var.s(this.I, this.J);
            TLRPC.User user2 = k4Var.f18414m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                si.b0(this.I);
                if (!si.z0(si.d2, this.J)) {
                    if (user2 == null) {
                        user2 = np.s1(this.I).a2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            si.b0(this.I).l1(gc.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (k4Var.f18418q != null) {
            s();
            return;
        }
        int i11 = k4Var.f18409g;
        int i12 = ns.f25615z1;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = np.s1(this.I).j1(this.K);
                tL_messages_requestWebView.bot = np.s1(this.I).o1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = k4Var.f18416o;
                tL_messages_requestWebView.fullscreen = k4Var.f18417p;
                String str = k4Var.f18408f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    ez.C(this.I);
                    int i13 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i13;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = np.s1(this.I).j1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = np.s1(this.I).j1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new h2(this, 3));
                ns.f(this.I).c(this, i12);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((k4Var.f18415n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = np.s1(this.I).o1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((k4Var.f18415n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = k4Var.f18416o;
                tL_messages_requestSimpleWebView.fullscreen = k4Var.f18417p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(k4Var.f18408f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = k4Var.f18408f;
                }
                if (!TextUtils.isEmpty(k4Var.f18413l)) {
                    tL_messages_requestSimpleWebView.start_param = k4Var.f18413l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new h2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = np.s1(this.I).o1(this.J);
                tL_messages_requestWebView2.peer = np.s1(this.I).j1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = k4Var.f18416o;
                tL_messages_requestWebView2.fullscreen = k4Var.f18417p;
                tL_messages_requestWebView2.url = k4Var.f18408f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new h2(this, 1));
                ns.f(this.I).c(this, i12);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = k4Var.f18411j;
                tL_inputBotAppID.f28109id = botApp.f28048id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = k4Var.f18412k;
                tL_messages_requestAppWebView.platform = "android";
                if (e2Var instanceof an) {
                    an anVar = (an) e2Var;
                    if (anVar.j() != null) {
                        n1 = np.n1(anVar.j());
                    } else {
                        n1 = np.l1(anVar.f45173e);
                    }
                } else {
                    n1 = np.n1(k4Var.f18414m);
                }
                tL_messages_requestAppWebView.peer = n1;
                tL_messages_requestAppWebView.compact = k4Var.f18416o;
                tL_messages_requestAppWebView.fullscreen = k4Var.f18417p;
                if (!TextUtils.isEmpty(k4Var.f18413l)) {
                    tL_messages_requestAppWebView.start_param = k4Var.f18413l;
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
                tL_messages_requestMainWebView.bot = np.s1(this.I).o1(k4Var.f18406c);
                tL_messages_requestMainWebView.platform = "android";
                if (e2Var instanceof an) {
                    an anVar2 = (an) e2Var;
                    if (anVar2.j() != null) {
                        j12 = np.n1(anVar2.j());
                    } else {
                        j12 = np.l1(anVar2.f45173e);
                    }
                } else {
                    j12 = np.s1(this.I).j1(k4Var.f18405b);
                }
                tL_messages_requestMainWebView.peer = j12;
                tL_messages_requestMainWebView.compact = k4Var.f18416o;
                tL_messages_requestMainWebView.fullscreen = k4Var.f18417p;
                if (!TextUtils.isEmpty(k4Var.f18413l)) {
                    tL_messages_requestMainWebView.start_param = k4Var.f18413l;
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
                tL_messages_requestChatJoinWebView.query_id = k4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new q4(this, 20), 66);
                return;
            case 6:
                if (!this.G0) {
                    p2Var.t(this.I, k4Var.f18408f, false);
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
        j6.b(0.35f, -0.1f, i7);
        final u1 u1Var = new u1();
        int i12 = 0;
        if (this.W) {
            i10 = this.S;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = u1Var.f18583a;
        e6 e6Var = this.G;
        u1Var.c(sparseIntArray, i10, e6Var);
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
        u1Var.c(u1Var.f18584b, i12, e6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(er.f34420f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i11, i7);
                    x2 x2Var = x2.this;
                    x2Var.S = f10;
                    x2Var.l();
                    w2 w2Var = x2Var.f18661f;
                    w2Var.invalidate();
                    u2 u2Var = x2Var.Y;
                    u2Var.setBackgroundColor(x2Var.S);
                    u1 u1Var2 = u1Var;
                    u1Var2.b(u2Var, floatValue);
                    x2Var.f18651a = u1Var2.a(j6.zj);
                    w2Var.invalidate();
                }
            });
            duration.addListener(new n2(this, i11, i7, u1Var));
            duration.start();
        } else {
            this.S = i7;
            l();
            w2 w2Var = this.f18661f;
            w2Var.invalidate();
            int i13 = this.S;
            u2 u2Var = this.Y;
            u2Var.setBackgroundColor(i13);
            u1Var.b(u2Var, 1.0f);
            this.f18651a = u1Var.a(j6.zj);
            w2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.f18653a1 == z10) {
            return;
        }
        this.f18653a1 = z10;
        if (z10) {
            if (this.E0) {
                f18650d1++;
            }
        } else if (this.E0) {
            f18650d1--;
        }
        if (f18650d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.P3(p());
        }
    }

    @Override
    public final void b(boolean z10) {
    }
}
