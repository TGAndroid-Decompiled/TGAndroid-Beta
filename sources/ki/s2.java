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
import hi.e7;
import hi.f9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.ch;
import org.telegram.messenger.cz;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.iq0;
import org.telegram.ui.t51;
public final class s2 extends Dialog implements gs, org.telegram.ui.ActionBar.j3 {
    public static final HashSet f18893b1 = new HashSet();
    public static final xt0 f18894c1;
    public static int f18895d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public v0 D0;
    public final k2 E;
    public boolean E0;
    public final q2 F;
    public org.telegram.ui.ActionBar.e3 F0;
    public final h6 G;
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
    public a70 P0;
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
    public final p2 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public org.telegram.ui.b3 Z0;
    public int f18896a;
    public final Drawable f18897a0;
    public boolean f18898a1;
    public int f18899b;
    public org.telegram.ui.ActionBar.q0 f18900b0;
    public float f18901c;
    public org.telegram.messenger.g2 f18902c0;
    public r1.g d;
    public boolean f18903d0;
    public Boolean f18904e;
    public boolean f18905e0;
    public final r2 f18906f;
    public boolean f18907f0;
    public boolean f18908g0;
    public final Rect h;
    public float f18909h0;
    public float f18910i0;
    public boolean f18911j0;
    public int f18912k0;
    public int f18913l0;
    public Activity m0;
    public final Rect f18914n;
    public final o2 f18915n0;
    public final org.telegram.messenger.h2 f18916o0;
    public gc f18917p0;
    public e0 f18918q0;
    public int f18919r;
    public final FrameLayout f18920r0;
    public final org.telegram.ui.ActionBar.f3 f18921s;
    public final FrameLayout.LayoutParams f18922s0;
    public boolean f18923t0;
    public final qc0 f18924u0;
    public final s1 f18925v0;
    public final r7 f18926w;
    public int f18927w0;
    public final j2 f18928x;
    public e4 f18929x0;
    public final FrameLayout.LayoutParams f18930y;
    public boolean f18931y0;
    public boolean f18932z0;

    static {
        xt0 xt0Var = new xt0(new f9(16), new f9(17));
        xt0Var.f42195c = 100.0f;
        f18894c1 = xt0Var;
        f18895d1 = 0;
    }

    public s2(Context context, h6 h6Var) {
        super(context, 2131755352);
        boolean z10;
        Object obj;
        org.telegram.ui.ActionBar.f3 f3Var;
        this.f18901c = 0.0f;
        this.h = new Rect();
        this.f18914n = new Rect();
        this.f18919r = 0;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.f18925v0 = new s1(this, 1);
        this.f18927w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.f18898a1 = false;
        this.G = h6Var;
        int x02 = m6.x0(null, m6.zj, false);
        this.f18899b = x02;
        this.f18896a = x02;
        j2 j2Var = new j2(0, context, this);
        this.f18928x = j2Var;
        j2Var.setAllowFullSizeSwipe(true);
        j2Var.setShouldWaitWebViewScroll(true);
        int i7 = m6.f29347d6;
        k2 k2Var = new k2(this, context, h6Var, m6.w0(i7, h6Var), 0);
        this.E = k2Var;
        k2Var.setOnVerifiedAge(this.M0);
        k2Var.setDelegate(new n2(this, context, h6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = m6.w0(i7, h6Var);
        int w02 = m6.w0(m6.f29290a7, h6Var);
        this.T = w02;
        org.telegram.messenger.g0.s3(this, w02, false, null);
        r2 r2Var = new r2(this, context);
        this.f18906f = r2Var;
        r2Var.setDelegate(new u1(this, 0));
        FrameLayout.LayoutParams e10 = na.e(-1, -1, 49);
        this.f18930y = e10;
        r2Var.addView(j2Var, e10);
        o2 o2Var = new o2(this, getContext(), h6Var);
        this.f18915n0 = o2Var;
        o2Var.setOnButtonClickListener(new v1(this, 0));
        o2Var.setOnResizeListener(new s1(this, 3));
        r2Var.addView(o2Var, na.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.f18916o0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        if (!np.u1(this.I).J6 && cz.o() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18908g0 = z10;
        if (z10) {
            obj = j2Var.getRenderNode();
        } else {
            obj = null;
        }
        h2Var.setParentRenderNode(obj);
        r2Var.addView(h2Var, na.e(-1, -1, 119));
        h2Var.setOnCloseClickListener(new s1(this, 4));
        h2Var.setOnCollapseClickListener(new s1(this, 5));
        h2Var.setOnMenuClickListener(new s1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18920r0 = frameLayout;
        FrameLayout.LayoutParams e11 = na.e(-1, 200, 55);
        this.f18922s0 = e11;
        r2Var.addView(frameLayout, e11);
        this.f18897a0 = getContext().getDrawable(2131231237).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        this.Y = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(2131231269);
        F();
        kVar.setActionBarMenuOnItemClick(new d2(this, 1));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = na.e(-1, -2, 49);
        this.Z = e12;
        r2Var.addView((View) kVar, e12);
        ?? n3Var = new n3(context, h6Var);
        this.F = n3Var;
        r2Var.addView((View) n3Var, na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        k2Var.setWebViewProgressListener(new u8(this, 4));
        j2Var.addView(k2Var, na.c(-1.0f, -1));
        j2Var.setScrollListener(new s1(this, 7));
        j2Var.setScrollEndListener(new s1(this, 8));
        j2Var.setDelegate(new t1(this));
        j2Var.setIsKeyboardVisible(new t1(this));
        qc0 qc0Var = new qc0(context);
        this.f18924u0 = qc0Var;
        r2Var.addView(qc0Var, na.c(-1.0f, -1));
        setContentView(r2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            f3Var = launchActivity.N();
        } else {
            f3Var = null;
        }
        this.f18921s = f3Var;
        if (f3Var != null) {
            kg.s0 s0Var = new kg.s0(r2Var, 12);
            s1 s1Var = new s1(this, 2);
            f3Var.J.add(s0Var);
            f3Var.K.add(s1Var);
            this.f18926w = new r7(f3Var);
        }
    }

    public static void f(s2 s2Var) {
        if (!s2Var.R0) {
            super.dismiss();
            s2Var.R0 = true;
        }
    }

    public static WindowInsets h(s2 s2Var, View view, WindowInsets windowInsets) {
        int i7;
        WindowInsets windowInsets2;
        r0.i1 i1Var = r0.l1.h(view, windowInsets).f56268a;
        i0.b f10 = i1Var.f(2);
        s2Var.h.set(f10.f15883a, f10.f15884b, f10.f15885c, f10.d);
        i0.b f11 = i1Var.f(647);
        Rect rect = s2Var.f18914n;
        rect.set(Math.max(f11.f15883a, windowInsets.getStableInsetLeft()), Math.max(f11.f15884b, windowInsets.getStableInsetTop()), Math.max(f11.f15885c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Activity W = org.telegram.messenger.g0.W(s2Var.getContext());
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
            Context context = s2Var.getContext();
            Typeface typeface = org.telegram.messenger.g0.f23982a;
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
            s2Var.f18919r = i12;
        } else {
            s2Var.f18919r = 0;
        }
        s2Var.I();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(s2 s2Var) {
        super.dismiss();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.d0(i7).f26777b.bots;
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
        String a02 = hd.a0(null, null, 2131752990, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String N0 = hd.N0(2131752989, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(a02);
        alertDialog$Builder.k(hd.N0(2131747637, null), new l1(i7, j3, tL_attachMenuBot, runnable));
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public static JSONObject u(h6 h6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = m6.w(-16777216, m6.w0(m6.f29420h5, h6Var));
            z10 z10Var = new z10() {
                @Override
                public final Object a(Object obj) {
                    int w11 = m6.w(w10, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(w11);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", z10Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", z10Var.a(Integer.valueOf(m6.w0(m6.f29347d6, h6Var))));
            int i7 = m6.f29290a7;
            jSONObject.put("secondary_bg_color", z10Var.a(Integer.valueOf(m6.w0(i7, h6Var))));
            jSONObject.put("text_color", z10Var.a(Integer.valueOf(m6.w0(m6.G6, h6Var))));
            jSONObject.put("hint_color", z10Var.a(Integer.valueOf(m6.w0(m6.H6, h6Var))));
            jSONObject.put("link_color", z10Var.a(Integer.valueOf(m6.w0(m6.J6, h6Var))));
            jSONObject.put("button_color", z10Var.a(Integer.valueOf(m6.w0(m6.Fi, h6Var))));
            jSONObject.put("button_text_color", z10Var.a(Integer.valueOf(m6.w0(m6.Ji, h6Var))));
            jSONObject.put("header_bg_color", z10Var.a(Integer.valueOf(m6.w0(m6.f29627s8, h6Var))));
            jSONObject.put("accent_text_color", z10Var.a(Integer.valueOf(m6.w0(m6.f29587q6, h6Var))));
            jSONObject.put("section_header_text_color", z10Var.a(Integer.valueOf(m6.w0(m6.L6, h6Var))));
            jSONObject.put("subtitle_text_color", z10Var.a(Integer.valueOf(m6.w0(m6.f29758z6, h6Var))));
            jSONObject.put("destructive_text_color", z10Var.a(Integer.valueOf(m6.w0(m6.f29568p7, h6Var))));
            jSONObject.put("section_separator_color", z10Var.a(Integer.valueOf(m6.w0(m6.f29348d7, h6Var))));
            jSONObject.put("bottom_bar_bg_color", z10Var.a(Integer.valueOf(m6.w0(i7, h6Var))));
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
            duration.setInterpolator(nr.f37917f);
            this.U0.addUpdateListener(new q1(this, color, i7, 0));
            this.U0.addListener(new e2(this, i7, 0));
            this.U0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f18906f.invalidate();
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
            j2 j2Var = this.f18928x;
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
        if (this.f18907f0 == z10) {
            return;
        }
        this.f18907f0 = z10;
        int i7 = 0;
        if (z12 && !np.u1(this.I).J6 && cz.o() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f18908g0 = z13;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.f18916o0;
        j2 j2Var = this.f18928x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.f24331b0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.N = z10;
            if (!z11) {
                h2Var.O.f(z10, true);
            }
            h2Var.invalidate();
            if (z10) {
                org.telegram.messenger.g0.h3(aVar, 2500L);
            }
            if (this.f18908g0) {
                obj = j2Var.getRenderNode();
            } else {
                obj = null;
            }
            h2Var.setParentRenderNode(obj);
        }
        this.f18912k0 = j2Var.getWidth();
        this.f18913l0 = j2Var.getHeight();
        this.V0 = false;
        o2 o2Var = this.f18915n0;
        k2 k2Var = this.E;
        p2 p2Var = this.Y;
        if (z11) {
            I();
            L();
            H();
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                int i10 = org.telegram.messenger.g0.f24010q.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f18914n.left;
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
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m;
            r1.g gVar = j2Var.f18878w;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = j2Var.H;
            if (gVar2 != null) {
                gVar2.d();
            }
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            p2Var.setVisibility(0);
            if (z10) {
                j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                j2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
            }
            j2Var.c();
            j2Var.invalidate();
            this.f18910i0 = 0.0f;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f18909h0 = f14;
            p2Var.setAlpha(1.0f - f14);
            p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18909h0);
            j2Var.setTranslationY(org.telegram.messenger.g0.T1(f13, f15, this.f18910i0));
            j2Var.setTranslationX(org.telegram.messenger.g0.T1(f12, 0.0f, this.f18910i0));
            o2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.f18910i0));
            h2Var.setAlpha(this.f18909h0);
            this.f18906f.invalidate();
            k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - f15);
            k2Var.n(false, false);
            this.f18911j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new f2(this, z10, f13, f15, f16, f11));
            this.W0.addListener(new g2(this, z10, currentActionBarHeight2, f16));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(nr.h);
            this.W0.start();
            return;
        }
        this.f18911j0 = false;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f18909h0 = f10;
        this.f18910i0 = 0.0f;
        I();
        L();
        if (z10) {
            i7 = 8;
        }
        p2Var.setVisibility(i7);
        p2Var.setAlpha(1.0f - this.f18909h0);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f18909h0);
        o2Var.setTranslationX(0.0f);
        h2Var.setAlpha(this.f18909h0);
        k2Var.setViewPortHeightOffset(0.0f);
        k2Var.n(true, true);
        H();
    }

    public final void D(int i7, boolean z10) {
        this.J0 = false;
        int i10 = this.T;
        o2 o2Var = this.f18915n0;
        Paint paint = o2Var.f18940a;
        o2Var.f18943e.f713b = i7;
        paint.setColor(i7);
        if (!z10) {
            o2Var.d.a(i7, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(nr.f37917f);
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
        this.T0.setInterpolator(nr.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i7 = m6.G6;
            h6 h6Var = this.G;
            int w02 = m6.w0(i7, h6Var);
            p2 p2Var = this.Y;
            p2Var.setTitleColor(w02);
            p2Var.G(m6.w0(i7, h6Var), false);
            p2Var.F(m6.w0(m6.f29665u8, h6Var), false);
            p2Var.I(m6.w0(m6.G8, h6Var), false);
            p2Var.J(m6.w0(m6.E8, h6Var), false, false);
            p2Var.J(m6.w0(m6.F8, h6Var), true, false);
            p2Var.K(m6.w0(m6.I5, h6Var), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        gc gcVar;
        boolean z10;
        g0 c10 = g0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c10.f18688e;
        f0 f0Var = c10.f18689f;
        boolean z11 = true;
        if (f0Var == null) {
            gc gcVar2 = this.f18917p0;
            if (gcVar2 != null) {
                gcVar2.b();
                this.f18917p0 = null;
            }
        } else if ((f0Var.c() && !f0Var.f18667l) || f0Var.f18666k) {
            if (this.Q0 != f0Var && (gcVar = this.f18917p0) != null) {
                gcVar.b();
                this.f18917p0 = null;
            }
            gc gcVar3 = this.f18917p0;
            if (gcVar3 == null || !gcVar3.f35491l) {
                this.Q0 = f0Var;
                e0 e0Var = new e0(getContext(), this.G);
                this.f18918q0 = e0Var;
                gc f10 = gc.f(this.f18920r0, e0Var, 5000);
                this.f18917p0 = f10;
                f10.k(true);
            }
            if (this.f18918q0.c(f0Var)) {
                this.f18917p0 = null;
            }
            f0Var.f18666k = false;
            f0Var.f18667l = true;
        } else {
            e0 e0Var2 = this.f18918q0;
            if (e0Var2 != null) {
                this.Q0 = f0Var;
                if (e0Var2.c(f0Var)) {
                    this.f18917p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) entry.getValue();
            f0 f0Var2 = (f0) entry.getKey();
            y0Var.setText(f0Var2.f18660c);
            if (!f0Var2.c()) {
                y0Var.setSubtext(org.telegram.messenger.g0.i0(f0Var2.f18663g, false, false));
            } else {
                Pair b10 = f0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    y0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (f0Var2.c()) {
                y0Var.setRightIcon(2131232098);
                y0Var.f30254b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (f0Var2.f18664i) {
                y0Var.setVisibility(8);
            } else {
                y0Var.setRightIcon(0);
                y0Var.f30254b.setPadding(0, 0, 0, 0);
            }
            y0Var.setOnClickListener(new ai.o2(27, this, f0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.f18902c0;
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
        if (g2Var.f24034e != z10) {
            g2Var.f24034e = z10;
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
        this.f18916o0.setDownloading(z11);
    }

    public final void H() {
        e0 e0Var = this.f18918q0;
        if (e0Var == null) {
            return;
        }
        if (this.f18907f0) {
            e0Var.setArrow(org.telegram.messenger.g0.W1(this.f18909h0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.f18901c > 0.5f) {
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
        org.telegram.messenger.h2 h2Var = this.f18916o0;
        Rect rect = this.f18914n;
        h2Var.setInsets(rect);
        boolean z10 = this.f18907f0;
        k2 k2Var = this.E;
        r2 r2Var = this.f18906f;
        o2 o2Var = this.f18915n0;
        int i15 = 0;
        if (z10) {
            if (o2Var != null && o2Var.getTotalHeight() > 0) {
                i13 = rect.bottom;
            } else {
                i13 = 0;
            }
            int i16 = rect.left;
            int i17 = rect.top;
            int i18 = rect.right;
            if (this.f18919r > i13 || (o2Var != null && o2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int L = org.telegram.messenger.g0.L(46.0f);
            k2Var.Q(rect2, false);
            k2Var.P(L, false);
            r2Var.setPadding(0, 0, 0, Math.max(this.f18919r, i13));
        } else {
            k2Var.Q(new Rect(0, 0, 0, 0), false);
            k2Var.P(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f18919r;
            org.telegram.ui.ActionBar.f3 f3Var = this.f18921s;
            if (f3Var != null) {
                i7 = f3Var.I;
            } else {
                i7 = 0;
            }
            r2Var.setPadding(i19, 0, i20, Math.max(i21, i7 + rect.bottom));
        }
        this.f18930y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z11 = this.f18907f0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f18922s0;
        layoutParams2.leftMargin = i11;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z12 = this.f18911j0;
        j2 j2Var = this.f18928x;
        if (!z12) {
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f18907f0) {
                j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                j2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(24.0f));
            }
            j2Var.setSwipeOffsetAnimationDisallowed(false);
            j2Var.c();
            j2Var.invalidate();
            j2Var.requestLayout();
        }
        if (j2Var != null) {
            j2Var.setFullSize(r());
        }
        o2Var.requestLayout();
        r2Var.requestLayout();
        if (!this.f18907f0) {
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
            z10 = (org.telegram.messenger.g0.Q1() || i0.a.h(m6.x0(null, m6.f29347d6, true)) < 0.7210000157356262d || this.f18901c < 0.85f) ? false : false;
        }
        Boolean bool = this.f18904e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f18904e = Boolean.valueOf(z10);
        r2 r2Var = this.f18906f;
        int systemUiVisibility = r2Var.getSystemUiVisibility();
        if (z10) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        r2Var.setSystemUiVisibility(i7);
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
        o2 o2Var;
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
            boolean z10 = this.f18907f0;
            if (z10) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            r2 r2Var = this.f18906f;
            if (z10 && (((o2Var = this.f18915n0) == null || o2Var.getTotalHeight() <= 0) && !r2Var.f18863h0)) {
                r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() | 2);
            } else {
                r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() & (-3));
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
        e3Var.f28889q = this.S;
        e3Var.f28888p = this.f18927w0;
        e3Var.f28886n = this.W;
        e3Var.f28887o = this.X;
        e3Var.f28890r = this.R.getColor();
        e3Var.f28875a = this.f18929x0;
        boolean z13 = false;
        k2 k2Var = this.E;
        if (k2Var != null && k2Var.O) {
            z10 = true;
        } else {
            z10 = false;
        }
        e3Var.f28892t = z10;
        e3Var.D = m6.I.q();
        org.telegram.ui.web.s0 s0Var = null;
        if (k2Var != null) {
            str = k2Var.getUrlLoaded();
        } else {
            str = null;
        }
        e3Var.f28895x = str;
        if (k2Var != null && k2Var.f53332u0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e3Var.f28878e = z11;
        if (k2Var != null) {
            str2 = k2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        e3Var.f28879f = str2;
        j2 j2Var = this.f18928x;
        if ((j2Var == null || j2Var.getSwipeOffsetY() >= 0.0f) && !this.f18932z0 && !r() && !this.f18907f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        e3Var.f28882j = z12;
        e3Var.f28897z = this.f18907f0;
        e3Var.A = this.f18908g0;
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
        e3Var.f28883k = f10;
        e3Var.C = this.C0;
        e3Var.f28893u = this.f18931y0;
        e3Var.f28896y = this.f18923t0;
        e3Var.v = this.f18903d0;
        if (j2Var == null || j2Var.N) {
            z13 = true;
        }
        e3Var.f28884l = z13;
        e3Var.f28894w = this.f18915n0.f18943e;
        e3Var.f28891s = this.T;
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
            e3Var.f28876b = s0Var;
            e3Var.d = k2Var.getBotProxy();
            e3Var.f28880g = s0Var.getWidth();
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
        return this.f18906f;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25391z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i7 == ls.f25333q4) {
            this.f18906f.invalidate();
            this.E.f53322n.b(m6.w0(m6.f29347d6, this.G), 153);
            F();
            J();
        } else if (i7 == ls.M3) {
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
            boolean q10 = m6.I.q();
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
        r2 r2Var = this.f18906f;
        if (r2Var != null) {
            r2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Z0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Z0 = b3Var;
            this.f18928x.addView(b3Var, na.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new x1(this, 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            org.telegram.messenger.g0.X3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        int i7;
        LaunchActivity launchActivity;
        if (this.f18905e0) {
            return;
        }
        int i10 = 0;
        if (this.M0 != null) {
            z10 = false;
        }
        this.f18905e0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.f18925v0);
        ls.f(this.I).n(this, ls.f25391z1);
        ls.f(this.I).n(this, ls.M3);
        ls.e().n(this, ls.f25333q4);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.f43120x0 == null)) {
            z10 = false;
        }
        if (z10) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.f56333m.f56341i = 0.0f;
                gVar.h();
            }
            LaunchActivity.H1.f43120x0.b(this);
        } else {
            o2 o2Var = this.f18915n0;
            if (o2Var != null) {
                o2Var.animate().translationY(o2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(nr.h).start();
            }
            this.E.h();
            j2 j2Var = this.f18928x;
            int height = j2Var.getHeight();
            if (o2Var != null) {
                i7 = o2Var.getTotalHeight();
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            Rect rect = this.f18914n;
            int Q = this.f18906f.Q() + i11 + rect.top + rect.bottom;
            if (r()) {
                i10 = org.telegram.messenger.g0.L(200.0f);
            }
            j2Var.f(Q + i10, true, new s1(this, 0));
        }
        f18893b1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, f18894c1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.f56333m = hVar;
            this.d = gVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f18924u0.getVisibility() == 0) {
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
        o2 o2Var;
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
        if (this.f18907f0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        r2 r2Var = this.f18906f;
        r2Var.setFitsSystemWindows(true);
        r2Var.setSystemUiVisibility(1792);
        r2Var.setOnApplyWindowInsetsListener(new w1(this, 0));
        if (this.f18907f0 && ((o2Var = this.f18915n0) == null || o2Var.getTotalHeight() <= 0)) {
            r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() | 2);
        } else {
            r2Var.setSystemUiVisibility(r2Var.getSystemUiVisibility() & (-3));
        }
        if (i7 >= 26) {
            if (i0.a.h(this.T) < 0.7210000157356262d) {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        }
        ls.e().c(this, ls.f25333q4);
        ls.f(this.I).c(this, ls.M3);
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
            ((LaunchActivity) context).A0.add(this.f18924u0);
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
            ((LaunchActivity) context).A0.remove(this.f18924u0);
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
        e4 e4Var = this.f18929x0;
        if (e4Var != null && e4Var.f18647g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f18907f0) {
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
        if (this.f18929x0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f18929x0.f18657r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.B0 = null;
            TLObject tLObject = this.f18929x0.f18656q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.L = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.G0;
                if (!z11) {
                    C(tL_webViewResultUrl.fullscreen, !z11, this.f18908g0);
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
                si d02 = si.d0(this.I);
                long j3 = this.f18929x0.f18644c;
                TLRPC.User c22 = d02.getMessagesController().c2(Long.valueOf(j3));
                if (c22 != null && c22.bot) {
                    if (d02.getUserConfig().H != 0) {
                        i7 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - d02.getUserConfig().H);
                    } else {
                        i7 = 60;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= d02.f26802m1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) d02.f26802m1.get(i10);
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
                        d02.f26802m1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i7 / d02.getMessagesController().f25780c3) + tL_topPeer.rating;
                    Collections.sort(d02.f26802m1, new jg.w(20));
                    if (d02.f26802m1.size() > 20) {
                        a8.p0.z(1, d02.f26802m1);
                    }
                    d02.getMessagesStorage().f27214a.c(new ch(d02, j3, 2, tL_topPeer.rating));
                    d02.getNotificationCenter().k(ls.V0, new Object[0]);
                }
                this.E.t(this.I, str, z10);
            }
            org.telegram.messenger.g0.h3(this.f18925v0, max);
            j2 j2Var = this.f18928x;
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
        r2 r2Var = this.f18906f;
        r2Var.setAlpha(0.0f);
        r2Var.addOnLayoutChangeListener(new kg.m(this, 1));
        super.show();
        this.R0 = false;
        f18893b1.add(this);
    }

    public final void t(boolean z10) {
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (this.f18898a1) {
            if (z10) {
                f18895d1++;
            } else {
                f18895d1--;
            }
        }
        if (f18895d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f18923t0) {
            TLRPC.User c22 = np.u1(this.I).c2(Long.valueOf(this.J));
            if (c22 != null) {
                str = i5.m(0, c22.first_name, c22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = str;
            t1Var.U = hd.N0(2131752905, null);
            alertDialog$Builder.k(hd.N0(2131752904, null), new t1(this));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            t1Var.show();
            ((TextView) t1Var.d(-1)).setTextColor(m6.w0(m6.f29588q7, this.G));
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
        TLRPC.User c22 = np.u1(this.I).c2(Long.valueOf(this.J));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = si.d0(this.I).f26777b.bots;
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
        a70 a70Var = this.P0;
        if (a70Var != null) {
            a70Var.v();
        }
        if (this.f18907f0) {
            view = this.f18916o0;
        } else {
            view = this.f18900b0;
        }
        a70 H = a70.H(this.f18906f, this.G, view, true);
        this.P0 = H;
        ArrayList arrayList3 = g0.c(getContext(), this.I, this.J).f18688e;
        HashMap hashMap = this.O0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            a70 K = H.K();
            K.c(2131232059, hd.N0(2131753753, null), new iq0(H, 27), false);
            K.k();
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList3.get(i14);
                i14++;
                f0 f0Var = (f0) obj;
                String str = f0Var.f18660c;
                ai.i iVar = new ai.i(22);
                h6 h6Var = K.d;
                if (K.f33337e == null) {
                    arrayList = arrayList3;
                    i12 = size2;
                } else {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, K.f33337e, K.d, false, false);
                    arrayList = arrayList3;
                    i12 = size2;
                    y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    y0Var.setText(str);
                    y0Var.setSubtext("");
                    Integer num = K.m0;
                    if (num == null && K.f33354n0 == null) {
                        y0Var.c(m6.E8, m6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = m6.w0(m6.E8, h6Var);
                        }
                        Integer num2 = K.f33354n0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = m6.w0(m6.F8, h6Var);
                        }
                        y0Var.d(w02, w03);
                    }
                    Integer num3 = K.f33356o0;
                    if (num3 != null) {
                        y0Var.setSelectorColor(num3.intValue());
                    } else {
                        y0Var.h(0.12f, m6.E8);
                    }
                    y0Var.setOnClickListener(new org.telegram.ui.Components.o0(K, iVar));
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
            H.c(2131231790, hd.N0(2131753091, null), new a6(H, K, 1), false);
            H.k();
        } else {
            i7 = -1;
        }
        if (this.M0 == null && !q10) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(2131232074, hd.N0(2131752900, null), new s1(this, 9), z10);
        if (this.M0 == null && this.f18903d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        H.l(2131232362, hd.N0(2131752885, null), new s1(this, 10), z11);
        H.c(2131232344, hd.N0(2131752899, null), new ch.k(10, this, q10), false);
        if (this.M0 == null && c22 != null && c22.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        H.l(2131232185, hd.N0(2131754387, null), new s1(this, 11), z12);
        if (this.M0 == null && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        H.l(2131231836, hd.N0(2131752882, null), new s1(this, 12), z13);
        if (this.M0 == null && !q10) {
            z14 = true;
        } else {
            z14 = false;
        }
        H.l(2131232335, hd.N0(2131752898, null), new s1(this, 13), z14);
        if (this.M0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        H.l(2131232110, hd.N0(2131752903, null), new s1(this, 14), z15);
        if (this.S != m6.x0(null, m6.f29347d6, false)) {
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
            int r12 = m6.r1(0.85f, i11);
            int r13 = m6.r1(0.1f, i11);
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
        H.b0(-this.f18914n.right, 0.0f);
        H.X = true;
        H.f33365t = false;
        H.f33363s = 0;
        H.a0();
    }

    public final void x(org.telegram.ui.ActionBar.g2 g2Var, e4 e4Var) {
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
        this.f18929x0 = e4Var;
        int i7 = e4Var.f18642a;
        this.I = i7;
        this.K = e4Var.f18643b;
        this.J = e4Var.f18644c;
        this.M = e4Var.h;
        this.N = e4Var.f18648i;
        this.O = e4Var.f18645e;
        if (e4Var.f18647g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c22 = null;
        } else {
            c22 = np.u1(i7).c2(Long.valueOf(this.J));
        }
        if (z10) {
            q10 = e4Var.f18645e;
        } else {
            q10 = p10.q(c22);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        p2 p2Var = this.Y;
        p2Var.setTitle(q10);
        if (z10) {
            d2 = null;
        } else {
            d2 = np.u1(this.I).d2(this.J);
        }
        h6 h6Var = this.G;
        if ((c22 != null && c22.verified) || (d2 != null && (user = d2.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232795).mutate();
            t6.x(p2Var.getTitleTextView(), this.N0, m6.Fi, h6Var, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            p2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            p2Var.getTitleTextView().i(new hi.k3(this, 1));
        }
        org.telegram.messenger.h2 h2Var = this.f18916o0;
        if (h2Var != null) {
            if (z10) {
                q11 = e4Var.f18645e;
            } else {
                q11 = p10.q(c22);
            }
            if (c22 != null && c22.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            h2Var.U = new xy0(q11, 13.0f, org.telegram.messenger.g0.o());
            if (!z14) {
                h2Var.V = null;
                h2Var.W = null;
            } else {
                h2Var.V = h2Var.getContext().getResources().getDrawable(2131232793).mutate();
                h2Var.W = h2Var.getContext().getResources().getDrawable(2131232794).mutate();
            }
        }
        org.telegram.ui.ActionBar.y s5 = p2Var.s();
        s5.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.d0(this.I).f26777b.bots;
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
                np.u1(this.I).c3(c22, 0, true, new v1(this, 1));
            }
            if (e4Var.f18655p) {
                C(z13, z12, this.f18908g0);
            }
        }
        if (this.M0 == null) {
            yVar2 = yVar;
            yVar2.a(2131296494, 2131230871);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var2 = new org.telegram.messenger.g2(getContext());
        this.f18902c0 = g2Var2;
        org.telegram.ui.ActionBar.q0 d = yVar2.d(0, g2Var2);
        this.f18900b0 = d;
        d.setOnClickListener(new x1(this, 1));
        p2Var.setActionBarMenuOnItemClick(new d2(this, 0));
        JSONObject u10 = u(h6Var, false);
        k2 k2Var = this.E;
        k2Var.setBotUser(c22);
        if (!z10) {
            k2Var.s(this.I, this.J);
            TLRPC.User user2 = e4Var.f18652m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                si.d0(this.I);
                if (!si.C0(si.f26771f2, this.J)) {
                    if (user2 == null) {
                        user2 = np.u1(this.I).c2(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.I);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            si.d0(this.I).o1(org.telegram.messenger.gc.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (e4Var.f18656q != null) {
            s();
            return;
        }
        int i11 = e4Var.f18647g;
        int i12 = ls.f25391z1;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = np.u1(this.I).l1(this.K);
                tL_messages_requestWebView.bot = np.u1(this.I).q1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = e4Var.f18654o;
                tL_messages_requestWebView.fullscreen = e4Var.f18655p;
                String str = e4Var.f18646f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    az.C(this.I);
                    int i13 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i13;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = np.u1(this.I).l1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = np.u1(this.I).l1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new c2(this, 3));
                ls.f(this.I).c(this, i12);
                return;
            case 1:
                boolean z15 = false;
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((e4Var.f18653n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = np.u1(this.I).q1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((e4Var.f18653n & 2) != 0) {
                    z15 = true;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z15;
                tL_messages_requestSimpleWebView.compact = e4Var.f18654o;
                tL_messages_requestSimpleWebView.fullscreen = e4Var.f18655p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(e4Var.f18646f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = e4Var.f18646f;
                }
                if (!TextUtils.isEmpty(e4Var.f18651l)) {
                    tL_messages_requestSimpleWebView.start_param = e4Var.f18651l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new c2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = np.u1(this.I).q1(this.J);
                tL_messages_requestWebView2.peer = np.u1(this.I).l1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = e4Var.f18654o;
                tL_messages_requestWebView2.fullscreen = e4Var.f18655p;
                tL_messages_requestWebView2.url = e4Var.f18646f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new c2(this, 1));
                ls.f(this.I).c(this, i12);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = e4Var.f18649j;
                tL_inputBotAppID.f28456id = botApp.f28395id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = e4Var.f18650k;
                tL_messages_requestAppWebView.platform = "android";
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    if (bnVar.j() != null) {
                        p12 = np.p1(bnVar.j());
                    } else {
                        p12 = np.n1(bnVar.f45958e);
                    }
                } else {
                    p12 = np.p1(e4Var.f18652m);
                }
                tL_messages_requestAppWebView.peer = p12;
                tL_messages_requestAppWebView.compact = e4Var.f18654o;
                tL_messages_requestAppWebView.fullscreen = e4Var.f18655p;
                if (!TextUtils.isEmpty(e4Var.f18651l)) {
                    tL_messages_requestAppWebView.start_param = e4Var.f18651l;
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
                tL_messages_requestMainWebView.bot = np.u1(this.I).q1(e4Var.f18644c);
                tL_messages_requestMainWebView.platform = "android";
                if (g2Var instanceof bn) {
                    bn bnVar2 = (bn) g2Var;
                    if (bnVar2.j() != null) {
                        l1 = np.p1(bnVar2.j());
                    } else {
                        l1 = np.n1(bnVar2.f45958e);
                    }
                } else {
                    l1 = np.u1(this.I).l1(e4Var.f18643b);
                }
                tL_messages_requestMainWebView.peer = l1;
                tL_messages_requestMainWebView.compact = e4Var.f18654o;
                tL_messages_requestMainWebView.fullscreen = e4Var.f18655p;
                if (!TextUtils.isEmpty(e4Var.f18651l)) {
                    tL_messages_requestMainWebView.start_param = e4Var.f18651l;
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
                tL_messages_requestChatJoinWebView.query_id = e4Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new e7(this, 20), 66);
                return;
            case 6:
                if (!this.G0) {
                    k2Var.t(this.I, e4Var.f18646f, false);
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
        m6.b(0.35f, -0.1f, i7);
        final p1 p1Var = new p1();
        int i12 = 0;
        if (this.W) {
            i10 = this.S;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = p1Var.f18823a;
        h6 h6Var = this.G;
        p1Var.c(sparseIntArray, i10, h6Var);
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
        p1Var.c(p1Var.f18824b, i12, h6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(nr.f37917f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i11, i7);
                    s2 s2Var = s2.this;
                    s2Var.S = f10;
                    s2Var.l();
                    r2 r2Var = s2Var.f18906f;
                    r2Var.invalidate();
                    p2 p2Var = s2Var.Y;
                    p2Var.setBackgroundColor(s2Var.S);
                    p1 p1Var2 = p1Var;
                    p1Var2.b(p2Var, floatValue);
                    s2Var.f18896a = p1Var2.a(m6.zj);
                    r2Var.invalidate();
                }
            });
            duration.addListener(new i2(this, i11, i7, p1Var));
            duration.start();
        } else {
            this.S = i7;
            l();
            r2 r2Var = this.f18906f;
            r2Var.invalidate();
            int i13 = this.S;
            p2 p2Var = this.Y;
            p2Var.setBackgroundColor(i13);
            p1Var.b(p2Var, 1.0f);
            this.f18896a = p1Var.a(m6.zj);
            r2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.f18898a1 == z10) {
            return;
        }
        this.f18898a1 = z10;
        if (z10) {
            if (this.E0) {
                f18895d1++;
            }
        } else if (this.E0) {
            f18895d1--;
        }
        if (f18895d1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.O3(p());
        }
    }

    @Override
    public final void b(boolean z10) {
    }
}
