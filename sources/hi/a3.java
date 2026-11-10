package hi;

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
import bi.q9;
import c8.ha;
import fi.v9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ah;
import org.telegram.messenger.d20;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.jq0;
import org.telegram.ui.u51;
public final class a3 extends Dialog implements ls, org.telegram.ui.ActionBar.i3 {
    public static final HashSet f14509a1 = new HashSet();
    public static final mt0 f14510b1;
    public static int f14511c1;
    public Boolean A0;
    public boolean B0;
    public v0 C0;
    public final s2 D;
    public boolean D0;
    public final y2 E;
    public org.telegram.ui.ActionBar.d3 E0;
    public final h6 F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public float H0;
    public long I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public int K0;
    public int L;
    public u51 L0;
    public long M;
    public Drawable M0;
    public String N;
    public final HashMap N0;
    public final Paint O;
    public k60 O0;
    public final Paint P;
    public f0 P0;
    public final Paint Q;
    public boolean Q0;
    public int R;
    public float R0;
    public int S;
    public ValueAnimator S0;
    public boolean T;
    public ValueAnimator T0;
    public final Paint U;
    public boolean U0;
    public boolean V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final x2 X;
    public String X0;
    public final FrameLayout.LayoutParams Y;
    public org.telegram.ui.b3 Y0;
    public final Drawable Z;
    public boolean Z0;
    public int f14512a;
    public org.telegram.ui.ActionBar.r0 f14513a0;
    public int f14514b;
    public org.telegram.messenger.g2 f14515b0;
    public float f14516c;
    public boolean f14517c0;
    public r1.g d;
    public boolean f14518d0;
    public Boolean f14519e;
    public boolean f14520e0;
    public final z2 f14521f;
    public boolean f14522f0;
    public float f14523g0;
    public final Rect h;
    public float f14524h0;
    public boolean f14525i0;
    public int f14526j0;
    public int f14527k0;
    public Activity f14528l0;
    public final w2 m0;
    public final Rect f14529n;
    public final org.telegram.messenger.h2 f14530n0;
    public bc f14531o0;
    public e0 f14532p0;
    public final FrameLayout f14533q0;
    public int f14534r;
    public final FrameLayout.LayoutParams f14535r0;
    public final org.telegram.ui.ActionBar.e3 f14536s;
    public boolean f14537s0;
    public final ec0 f14538t0;
    public final x1 f14539u0;
    public int f14540v0;
    public final r7 f14541w;
    public q4 f14542w0;
    public final r2 f14543x;
    public boolean f14544x0;
    public final FrameLayout.LayoutParams f14545y;
    public boolean f14546y0;
    public boolean f14547z0;

    static {
        mt0 mt0Var = new mt0(new g2.c(25), new g2.c(26));
        mt0Var.f36092c = 100.0f;
        f14510b1 = mt0Var;
        f14511c1 = 0;
    }

    public a3(Context context, h6 h6Var) {
        super(context, 2131755352);
        boolean z9;
        Object obj;
        org.telegram.ui.ActionBar.e3 e3Var;
        this.f14516c = 0.0f;
        this.h = new Rect();
        this.f14529n = new Rect();
        this.f14534r = 0;
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint();
        this.P = paint2;
        this.Q = new Paint(1);
        this.U = new Paint(1);
        this.f14539u0 = new x1(this, 1);
        this.f14540v0 = -1;
        this.f14547z0 = false;
        this.A0 = null;
        this.I0 = true;
        this.N0 = new HashMap();
        this.Q0 = false;
        this.U0 = true;
        this.Z0 = false;
        this.F = h6Var;
        int x02 = m6.x0(null, m6.wj, false);
        this.f14514b = x02;
        this.f14512a = x02;
        r2 r2Var = new r2(0, context, this);
        this.f14543x = r2Var;
        r2Var.setAllowFullSizeSwipe(true);
        r2Var.setShouldWaitWebViewScroll(true);
        int i7 = m6.f27890d6;
        s2 s2Var = new s2(this, context, h6Var, m6.w0(i7, h6Var), 0);
        this.D = s2Var;
        s2Var.setOnVerifiedAge(this.L0);
        s2Var.setDelegate(new v2(this, context, h6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.R = m6.w0(i7, h6Var);
        int w02 = m6.w0(m6.f27834a7, h6Var);
        this.S = w02;
        org.telegram.messenger.g0.u3(this, w02, false, null);
        z2 z2Var = new z2(this, context);
        this.f14521f = z2Var;
        z2Var.setDelegate(new z1(this, 0));
        FrameLayout.LayoutParams e10 = ha.e(-1, -1, 49);
        this.f14545y = e10;
        z2Var.addView(r2Var, e10);
        w2 w2Var = new w2(this, getContext(), h6Var);
        this.m0 = w2Var;
        w2Var.setOnButtonClickListener(new a2(this, 0));
        w2Var.setOnResizeListener(new x1(this, 3));
        z2Var.addView(w2Var, ha.e(-1, -2, 81));
        org.telegram.messenger.h2 h2Var = new org.telegram.messenger.h2(getContext());
        this.f14530n0 = h2Var;
        h2Var.setAlpha(0.0f);
        h2Var.setVisibility(8);
        if (!qp.s1(this.H).G6 && iz.o() >= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f14522f0 = z9;
        if (z9) {
            obj = r2Var.getRenderNode();
        } else {
            obj = null;
        }
        h2Var.setParentRenderNode(obj);
        z2Var.addView(h2Var, ha.e(-1, -1, 119));
        h2Var.setOnCloseClickListener(new x1(this, 4));
        h2Var.setOnCollapseClickListener(new x1(this, 5));
        h2Var.setOnMenuClickListener(new x1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14533q0 = frameLayout;
        FrameLayout.LayoutParams e11 = ha.e(-1, 200, 55);
        this.f14535r0 = e11;
        z2Var.addView(frameLayout, e11);
        this.Z = getContext().getDrawable(2131231237).mutate();
        ?? lVar = new org.telegram.ui.ActionBar.l(context, h6Var);
        this.X = lVar;
        lVar.setBackgroundColor(0);
        lVar.setBackButtonImage(2131231269);
        F();
        lVar.setActionBarMenuOnItemClick(new k2(this, 1));
        lVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = ha.e(-1, -2, 49);
        this.Y = e12;
        z2Var.addView((View) lVar, e12);
        ?? v3Var = new v3(context, h6Var);
        this.E = v3Var;
        z2Var.addView((View) v3Var, ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        s2Var.setWebViewProgressListener(new q9(this, 2));
        r2Var.addView(s2Var, ha.c(-1.0f, -1));
        r2Var.setScrollListener(new x1(this, 7));
        r2Var.setScrollEndListener(new x1(this, 8));
        r2Var.setDelegate(new y1(this));
        r2Var.setIsKeyboardVisible(new y1(this));
        ec0 ec0Var = new ec0(context);
        this.f14538t0 = ec0Var;
        z2Var.addView(ec0Var, ha.c(-1.0f, -1));
        setContentView(z2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            e3Var = launchActivity.O();
        } else {
            e3Var = null;
        }
        this.f14536s = e3Var;
        if (e3Var != null) {
            v9 v9Var = new v9(z2Var, 17);
            x1 x1Var = new x1(this, 2);
            e3Var.I.add(v9Var);
            e3Var.J.add(x1Var);
            this.f14541w = new r7(e3Var);
        }
    }

    public static void f(a3 a3Var) {
        if (!a3Var.Q0) {
            super.dismiss();
            a3Var.Q0 = true;
        }
    }

    public static WindowInsets h(a3 a3Var, View view, WindowInsets windowInsets) {
        int i7;
        WindowInsets windowInsets2;
        r0.h1 h1Var = r0.k1.h(view, windowInsets).f54213a;
        i0.b f10 = h1Var.f(2);
        a3Var.h.set(f10.f15122a, f10.f15123b, f10.f15124c, f10.d);
        i0.b f11 = h1Var.f(647);
        Rect rect = a3Var.f14529n;
        rect.set(Math.max(f11.f15122a, windowInsets.getStableInsetLeft()), Math.max(f11.f15123b, windowInsets.getStableInsetTop()), Math.max(f11.f15124c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
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
            Typeface typeface = org.telegram.messenger.g0.f22539a;
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
            a3Var.f14534r = i12;
        } else {
            a3Var.f14534r = 0;
        }
        a3Var.I();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(a3 a3Var) {
        super.dismiss();
    }

    public static void n(int i7, long j3, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i7).f25806b.bots;
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
        String a02 = id.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = id.M0(2131753001, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(id.M0(2131747831, null), new n1(i7, j3, tL_attachMenuBot, runnable));
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(h6 h6Var, final boolean z9) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w10 = m6.w(-16777216, m6.w0(m6.f27963h5, h6Var));
            d20 d20Var = new d20() {
                @Override
                public final Object a(Object obj) {
                    int w11 = m6.w(w10, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(w11);
                    if (z9) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w11)), Integer.valueOf(Color.green(w11)), Integer.valueOf(Color.blue(w11)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", d20Var.a(Integer.valueOf(w10)));
            jSONObject.put("section_bg_color", d20Var.a(Integer.valueOf(m6.w0(m6.f27890d6, h6Var))));
            int i7 = m6.f27834a7;
            jSONObject.put("secondary_bg_color", d20Var.a(Integer.valueOf(m6.w0(i7, h6Var))));
            jSONObject.put("text_color", d20Var.a(Integer.valueOf(m6.w0(m6.G6, h6Var))));
            jSONObject.put("hint_color", d20Var.a(Integer.valueOf(m6.w0(m6.H6, h6Var))));
            jSONObject.put("link_color", d20Var.a(Integer.valueOf(m6.w0(m6.J6, h6Var))));
            jSONObject.put("button_color", d20Var.a(Integer.valueOf(m6.w0(m6.Ci, h6Var))));
            jSONObject.put("button_text_color", d20Var.a(Integer.valueOf(m6.w0(m6.Gi, h6Var))));
            jSONObject.put("header_bg_color", d20Var.a(Integer.valueOf(m6.w0(m6.f28170s8, h6Var))));
            jSONObject.put("accent_text_color", d20Var.a(Integer.valueOf(m6.w0(m6.f28130q6, h6Var))));
            jSONObject.put("section_header_text_color", d20Var.a(Integer.valueOf(m6.w0(m6.L6, h6Var))));
            jSONObject.put("subtitle_text_color", d20Var.a(Integer.valueOf(m6.w0(m6.f28300z6, h6Var))));
            jSONObject.put("destructive_text_color", d20Var.a(Integer.valueOf(m6.w0(m6.f28111p7, h6Var))));
            jSONObject.put("section_separator_color", d20Var.a(Integer.valueOf(m6.w0(m6.f27891d7, h6Var))));
            jSONObject.put("bottom_bar_bg_color", d20Var.a(Integer.valueOf(m6.w0(i7, h6Var))));
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void A(int i7, boolean z9) {
        Paint paint = this.Q;
        int color = paint.getColor();
        boolean z10 = true;
        this.W = true;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z9) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.T0 = duration;
            duration.setInterpolator(wq.f40046f);
            this.T0.addUpdateListener(new v1(this, color, i7, 0));
            this.T0.addListener(new m2(this, i7, 0));
            this.T0.start();
            return;
        }
        paint.setColor(i7);
        F();
        this.f14521f.invalidate();
        org.telegram.ui.b3 b3Var = this.Y0;
        if (b3Var != null) {
            if (org.telegram.messenger.g0.B(paint.getColor()) > 0.721f) {
                z10 = false;
            }
            b3Var.b(z10, false);
            this.Y0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z9) {
        if (this.f14547z0 != z9) {
            this.f14547z0 = z9;
            r2 r2Var = this.f14543x;
            if (r2Var != null) {
                r2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        int currentActionBarHeight;
        float f14;
        Point point;
        Object obj;
        if (this.f14520e0 == z9) {
            return;
        }
        this.f14520e0 = z9;
        int i7 = 0;
        if (z11 && !qp.s1(this.H).G6 && iz.o() >= 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f14522f0 = z12;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.h2 h2Var = this.f14530n0;
        r2 r2Var = this.f14543x;
        if (h2Var != null) {
            org.telegram.messenger.a aVar = h2Var.f22800a0;
            org.telegram.messenger.g0.r(aVar);
            h2Var.M = z9;
            if (!z10) {
                h2Var.N.f(z9, true);
            }
            h2Var.invalidate();
            if (z9) {
                org.telegram.messenger.g0.i3(aVar, 2500L);
            }
            if (this.f14522f0) {
                obj = r2Var.getRenderNode();
            } else {
                obj = null;
            }
            h2Var.setParentRenderNode(obj);
        }
        this.f14526j0 = r2Var.getWidth();
        this.f14527k0 = r2Var.getHeight();
        this.U0 = false;
        w2 w2Var = this.m0;
        s2 s2Var = this.D;
        x2 x2Var = this.X;
        if (z10) {
            I();
            L();
            H();
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                int i10 = org.telegram.messenger.g0.f22567q.x;
                f11 = (i10 - ((int) (Math.min(i10, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f14529n.left;
            if (z9) {
                f12 = i11 + f11;
            } else {
                f12 = (-i11) - f11;
            }
            if (!z9) {
                f11 = -f11;
            }
            if (z9) {
                f13 = r2Var.getTranslationY();
            } else {
                f13 = -org.telegram.messenger.g0.L(24.0f);
            }
            if (z9) {
                currentActionBarHeight = -org.telegram.messenger.g0.L(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
            r1.g gVar = r2Var.f14571w;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = r2Var.G;
            if (gVar2 != null) {
                gVar2.d();
            }
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            x2Var.setVisibility(0);
            if (z9) {
                r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                r2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.g0.L(24.0f));
            }
            r2Var.c();
            r2Var.invalidate();
            this.f14524h0 = 0.0f;
            if (z9) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f14523g0 = f14;
            x2Var.setAlpha(1.0f - f14);
            x2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f14523g0);
            r2Var.setTranslationY(org.telegram.messenger.g0.T1(f13, f15, this.f14524h0));
            r2Var.setTranslationX(org.telegram.messenger.g0.T1(f12, 0.0f, this.f14524h0));
            w2Var.setTranslationX(org.telegram.messenger.g0.T1(f11, 0.0f, this.f14524h0));
            h2Var.setAlpha(this.f14523g0);
            this.f14521f.invalidate();
            s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - f15);
            s2Var.n(false, false);
            this.f14525i0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new n2(this, z9, f13, f15, f16, f11));
            this.V0.addListener(new o2(this, z9, currentActionBarHeight2, f16));
            this.V0.setDuration(280L);
            this.V0.setInterpolator(wq.h);
            this.V0.start();
            return;
        }
        this.f14525i0 = false;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f14523g0 = f10;
        this.f14524h0 = 0.0f;
        I();
        L();
        if (z9) {
            i7 = 8;
        }
        x2Var.setVisibility(i7);
        x2Var.setAlpha(1.0f - this.f14523g0);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f14523g0);
        w2Var.setTranslationX(0.0f);
        h2Var.setAlpha(this.f14523g0);
        s2Var.setViewPortHeightOffset(0.0f);
        s2Var.n(true, true);
        H();
    }

    public final void D(int i7, boolean z9) {
        this.I0 = false;
        int i10 = this.S;
        w2 w2Var = this.m0;
        Paint paint = w2Var.f14950a;
        w2Var.f14953e.f700b = i7;
        paint.setColor(i7);
        if (!z9) {
            w2Var.d.a(i7, true);
        }
        if (z9) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(wq.f40046f);
            duration.addUpdateListener(new v1(this, i10, i7, 1));
            duration.addListener(new p2(this, i10, i7, 0));
            duration.start();
        } else {
            this.S = i7;
            l();
        }
        org.telegram.messenger.g0.u3(this, this.S, false, null);
    }

    public final void E(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.R0;
        float f12 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        float f13 = this.R0;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.S0 = ofFloat;
        ofFloat.addListener(new ch.y(14, this, z9));
        this.S0.addUpdateListener(new w1(this, 0));
        this.S0.setInterpolator(wq.h);
        this.S0.setDuration(220L);
        this.S0.start();
    }

    public final void F() {
        if (!this.V) {
            int i7 = m6.G6;
            h6 h6Var = this.F;
            int w02 = m6.w0(i7, h6Var);
            x2 x2Var = this.X;
            x2Var.setTitleColor(w02);
            x2Var.G(m6.w0(i7, h6Var), false);
            x2Var.E(m6.w0(m6.f28208u8, h6Var), false);
            x2Var.H(m6.w0(m6.G8, h6Var), false);
            x2Var.I(m6.w0(m6.E8, h6Var), false, false);
            x2Var.I(m6.w0(m6.F8, h6Var), true, false);
            x2Var.J(m6.w0(m6.I5, h6Var), false);
        }
        this.D.setFlickerViewColor(this.Q.getColor());
    }

    public final void G() {
        bc bcVar;
        boolean z9;
        g0 c10 = g0.c(getContext(), this.H, this.I);
        ArrayList arrayList = c10.f14672e;
        f0 f0Var = c10.f14673f;
        boolean z10 = true;
        if (f0Var == null) {
            bc bcVar2 = this.f14531o0;
            if (bcVar2 != null) {
                bcVar2.b();
                this.f14531o0 = null;
            }
        } else if ((f0Var.c() && !f0Var.f14649l) || f0Var.f14648k) {
            if (this.P0 != f0Var && (bcVar = this.f14531o0) != null) {
                bcVar.b();
                this.f14531o0 = null;
            }
            bc bcVar3 = this.f14531o0;
            if (bcVar3 == null || !bcVar3.f32205l) {
                this.P0 = f0Var;
                e0 e0Var = new e0(getContext(), this.F);
                this.f14532p0 = e0Var;
                bc f10 = bc.f(this.f14533q0, e0Var, 5000);
                this.f14531o0 = f10;
                f10.k(true);
            }
            if (this.f14532p0.c(f0Var)) {
                this.f14531o0 = null;
            }
            f0Var.f14648k = false;
            f0Var.f14649l = true;
        } else {
            e0 e0Var2 = this.f14532p0;
            if (e0Var2 != null) {
                this.P0 = f0Var;
                if (e0Var2.c(f0Var)) {
                    this.f14531o0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.N0.entrySet()) {
            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) entry.getValue();
            f0 f0Var2 = (f0) entry.getKey();
            z0Var.setText(f0Var2.f14642c);
            if (!f0Var2.c()) {
                z0Var.setSubtext(org.telegram.messenger.g0.i0(f0Var2.f14645g, false, false));
            } else {
                Pair b10 = f0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    z0Var.setSubtext(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (f0Var2.c()) {
                z0Var.setRightIcon(2131232096);
                z0Var.f28803b.setPadding(0, 0, org.telegram.messenger.g0.L(32.0f), 0);
            } else if (f0Var2.f14646i) {
                z0Var.setVisibility(8);
            } else {
                z0Var.setRightIcon(0);
                z0Var.f28803b.setPadding(0, 0, 0, 0);
            }
            z0Var.setOnClickListener(new bi.r(17, this, f0Var2));
        }
        org.telegram.messenger.g2 g2Var = this.f14515b0;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((f0) obj).c()) {
                    z9 = true;
                    break;
                }
            } else {
                z9 = false;
                break;
            }
        }
        if (g2Var.f22587e != z9) {
            g2Var.f22587e = z9;
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
                z10 = false;
                break;
            }
        }
        this.f14530n0.setDownloading(z10);
    }

    public final void H() {
        e0 e0Var = this.f14532p0;
        if (e0Var == null) {
            return;
        }
        if (this.f14520e0) {
            e0Var.setArrow(org.telegram.messenger.g0.W1(this.f14523g0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(26.0f)));
        } else if (this.f14516c > 0.5f) {
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
        org.telegram.messenger.h2 h2Var = this.f14530n0;
        Rect rect = this.f14529n;
        h2Var.setInsets(rect);
        boolean z9 = this.f14520e0;
        s2 s2Var = this.D;
        z2 z2Var = this.f14521f;
        w2 w2Var = this.m0;
        int i15 = 0;
        if (z9) {
            if (w2Var != null && w2Var.getTotalHeight() > 0) {
                i13 = rect.bottom;
            } else {
                i13 = 0;
            }
            int i16 = rect.left;
            int i17 = rect.top;
            int i18 = rect.right;
            if (this.f14534r > i13 || (w2Var != null && w2Var.getTotalHeight() > 0)) {
                i14 = 0;
            } else {
                i14 = rect.bottom;
            }
            Rect rect2 = new Rect(i16, i17, i18, i14);
            int L = org.telegram.messenger.g0.L(46.0f);
            s2Var.Q(rect2, false);
            s2Var.P(L, false);
            z2Var.setPadding(0, 0, 0, Math.max(this.f14534r, i13));
        } else {
            s2Var.Q(new Rect(0, 0, 0, 0), false);
            s2Var.P(0, false);
            int i19 = rect.left;
            int i20 = rect.right;
            int i21 = this.f14534r;
            org.telegram.ui.ActionBar.e3 e3Var = this.f14536s;
            if (e3Var != null) {
                i7 = e3Var.H;
            } else {
                i7 = 0;
            }
            z2Var.setPadding(i19, 0, i20, Math.max(i21, i7 + rect.bottom));
        }
        this.f14545y.topMargin = org.telegram.messenger.g0.L(24.0f);
        boolean z10 = this.f14520e0;
        if (!z10) {
            i10 = 0;
        } else {
            i10 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.Y;
        layoutParams.leftMargin = i10;
        layoutParams.rightMargin = 0;
        if (!z10) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.f14535r0;
        layoutParams2.leftMargin = i11;
        if (!z10) {
            i12 = 0;
        } else {
            i12 = rect.right;
        }
        layoutParams2.rightMargin = i12;
        boolean z11 = this.f14525i0;
        r2 r2Var = this.f14543x;
        if (!z11) {
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f14520e0) {
                r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            } else {
                r2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(24.0f));
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
        if (!this.f14520e0) {
            i15 = 8;
        }
        h2Var.setVisibility(i15);
    }

    public final void J() {
        boolean z9;
        int i7;
        boolean z10 = true;
        if (this.V) {
            z9 = !this.T;
        } else {
            z9 = (org.telegram.messenger.g0.Q1() || i0.a.h(m6.x0(null, m6.f27890d6, true)) < 0.7210000157356262d || this.f14516c < 0.85f) ? false : false;
        }
        Boolean bool = this.f14519e;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        this.f14519e = Boolean.valueOf(z9);
        z2 z2Var = this.f14521f;
        int systemUiVisibility = z2Var.getSystemUiVisibility();
        if (z9) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        z2Var.setSystemUiVisibility(i7);
    }

    public final void K() {
        org.telegram.ui.web.u0 webView;
        s2 s2Var = this.D;
        if (s2Var == null || (webView = s2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.Q.getColor());
    }

    public final void L() {
        int i7;
        w2 w2Var;
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
            boolean z9 = this.f14520e0;
            if (z9) {
                attributes.flags = i7 | attributes.flags;
            } else {
                attributes.flags = (~i7) & attributes.flags;
            }
            z2 z2Var = this.f14521f;
            if (z9 && (((w2Var = this.m0) == null || w2Var.getTotalHeight() <= 0) && !z2Var.f15072g0)) {
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
    public final void a(boolean z9) {
        o(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.d3 c() {
        boolean z9;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.d3 d3Var = new org.telegram.ui.ActionBar.d3();
        d3Var.f27406q = this.R;
        d3Var.f27405p = this.f14540v0;
        d3Var.f27403n = this.V;
        d3Var.f27404o = this.W;
        d3Var.f27407r = this.Q.getColor();
        d3Var.f27392a = this.f14542w0;
        boolean z12 = false;
        s2 s2Var = this.D;
        if (s2Var != null && s2Var.N) {
            z9 = true;
        } else {
            z9 = false;
        }
        d3Var.f27409t = z9;
        d3Var.D = m6.I.q();
        org.telegram.ui.web.u0 u0Var = null;
        if (s2Var != null) {
            str = s2Var.getUrlLoaded();
        } else {
            str = null;
        }
        d3Var.f27412x = str;
        if (s2Var != null && s2Var.f51321t0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d3Var.f27395e = z10;
        if (s2Var != null) {
            str2 = s2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        d3Var.f27396f = str2;
        r2 r2Var = this.f14543x;
        if ((r2Var == null || r2Var.getSwipeOffsetY() >= 0.0f) && !this.f14546y0 && !r() && !this.f14520e0) {
            z11 = false;
        } else {
            z11 = true;
        }
        d3Var.f27399j = z11;
        d3Var.f27414z = this.f14520e0;
        d3Var.A = this.f14522f0;
        Boolean bool = this.A0;
        if (bool == null) {
            booleanValue = this.f14547z0;
        } else {
            booleanValue = bool.booleanValue();
        }
        d3Var.B = booleanValue;
        if (r2Var != null) {
            f10 = r2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        d3Var.f27400k = f10;
        d3Var.C = this.B0;
        d3Var.f27410u = this.f14544x0;
        d3Var.f27413y = this.f14537s0;
        d3Var.v = this.f14517c0;
        if (r2Var == null || r2Var.M) {
            z12 = true;
        }
        d3Var.f27401l = z12;
        d3Var.f27411w = this.m0.f14953e;
        d3Var.f27408s = this.S;
        v0 v0Var = this.C0;
        if (v0Var != null) {
            v0Var.b();
        }
        d3Var.K = this.C0;
        if (s2Var != null) {
            u0Var = s2Var.getWebView();
        }
        if (u0Var != null) {
            s2Var.M();
            d3Var.f27393b = u0Var;
            d3Var.d = s2Var.getBotProxy();
            d3Var.f27397g = u0Var.getWidth();
            d3Var.h = u0Var.getHeight();
            u0Var.onPause();
        }
        boolean z13 = this.W0;
        d3Var.G = z13;
        if (z13) {
            d3Var.H = this.X0;
        }
        d3Var.L = this.D0;
        this.E0 = d3Var;
        return d3Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.j3 mo25d() {
        return this.f14521f;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25123z1) {
            if (this.K == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i7 == qs.f25048n4) {
            this.f14521f.invalidate();
            this.D.f51312n.b(m6.w0(m6.f27890d6, this.F), 153);
            F();
            J();
        } else if (i7 == qs.J3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        o(false);
    }

    @Override
    public final int e(int i7) {
        return i0.a.f(this.R0, i7, this.S);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z9) {
        int i7;
        boolean z10;
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
                z10 = true;
            } else {
                z10 = false;
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
                y(i13 | (-16777216), true, z9);
            }
            if (z10) {
                if (q10) {
                    i11 = botappsettings.background_dark_color;
                } else {
                    i11 = botappsettings.background_color;
                }
                A(i11 | (-16777216), z9);
                if (q10) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                D(i12 | (-16777216), z9);
            }
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.Q0 && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.F(true, true, true);
        }
        z2 z2Var = this.f14521f;
        if (z2Var != null) {
            z2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Y0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Y0 = b3Var;
            this.f14543x.addView(b3Var, ha.c(-1.0f, -1));
            this.Y0.setTranslationY(-1.0f);
            this.Y0.h.setOnClickListener(new c2(this, 0));
            this.Y0.setBackgroundColor(this.Q.getColor());
            org.telegram.messenger.g0.Z3(this.Y0, this.W0, 1.0f, true, false);
        }
    }

    public final void o(boolean z9) {
        int i7;
        LaunchActivity launchActivity;
        if (this.f14518d0) {
            return;
        }
        int i10 = 0;
        if (this.L0 != null) {
            z9 = false;
        }
        this.f14518d0 = true;
        E(false);
        org.telegram.messenger.g0.r(this.f14539u0);
        qs.f(this.H).n(this, qs.f25123z1);
        qs.f(this.H).n(this, qs.J3);
        qs.e().n(this, qs.f25048n4);
        if (z9 && ((launchActivity = LaunchActivity.G1) == null || launchActivity.f41293w0 == null)) {
            z9 = false;
        }
        if (z9) {
            r1.g gVar = this.d;
            if (gVar != null) {
                gVar.f54279m.f54287i = 0.0f;
                gVar.h();
            }
            LaunchActivity.G1.f41293w0.b(this);
        } else {
            w2 w2Var = this.m0;
            if (w2Var != null) {
                w2Var.animate().translationY(w2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(wq.h).start();
            }
            this.D.h();
            r2 r2Var = this.f14543x;
            int height = r2Var.getHeight();
            if (w2Var != null) {
                i7 = w2Var.getTotalHeight();
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            Rect rect = this.f14529n;
            int Q = this.f14521f.Q() + i11 + rect.top + rect.bottom;
            if (r()) {
                i10 = org.telegram.messenger.g0.L(200.0f);
            }
            r2Var.f(Q + i10, true, new x1(this, 0));
        }
        f14509a1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            r1.g gVar = new r1.g(this, f14510b1);
            r1.h hVar = new r1.h();
            hVar.b(1200.0f);
            hVar.a(1.0f);
            gVar.f54279m = hVar;
            this.d = gVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f14538t0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.D.D()) {
        } else {
            o(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        w2 w2Var;
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
        boolean z9 = true;
        if (i7 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f14520e0) {
            attributes.flags = i11 | 512;
        } else {
            attributes.flags = i10 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        z2 z2Var = this.f14521f;
        z2Var.setFitsSystemWindows(true);
        z2Var.setSystemUiVisibility(1792);
        z2Var.setOnApplyWindowInsetsListener(new b2(this, 0));
        if (this.f14520e0 && ((w2Var = this.m0) == null || w2Var.getTotalHeight() <= 0)) {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() | 2);
        } else {
            z2Var.setSystemUiVisibility(z2Var.getSystemUiVisibility() & (-3));
        }
        if (i7 >= 26) {
            if (i0.a.h(this.S) < 0.7210000157356262d) {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        }
        qs.e().c(this, qs.f25048n4);
        qs.f(this.H).c(this, qs.J3);
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
            ((LaunchActivity) context).f41299z0.add(this.f14538t0);
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
            ((LaunchActivity) context).f41299z0.remove(this.f14538t0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.G1;
        }
        if (ownerActivity == null) {
            return org.telegram.messenger.g0.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean q() {
        q4 q4Var = this.f14542w0;
        if (q4Var != null && q4Var.f14896g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f14520e0) {
            Boolean bool = this.A0;
            if (bool == null) {
                if (!this.f14547z0) {
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
        if (this.Q0) {
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
        boolean z9;
        int i7;
        if (this.f14542w0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f14542w0.f14906r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.A0 = null;
            TLObject tLObject = this.f14542w0.f14905q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.K = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z9 = tL_webViewResultUrl.same_origin;
                this.A0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z10 = this.F0;
                if (!z10) {
                    C(tL_webViewResultUrl.fullscreen, !z10, this.f14522f0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.K = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.K = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                } else {
                    str = null;
                }
                z9 = false;
            }
            if (str != null && !this.F0) {
                ui b02 = ui.b0(this.H);
                long j3 = this.f14542w0.f14893c;
                TLRPC.User a22 = b02.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null && a22.bot) {
                    if (b02.getUserConfig().G != 0) {
                        i7 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().G);
                    } else {
                        i7 = 60;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= b02.l1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.l1.get(i10);
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
                        b02.l1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i7 / b02.getMessagesController().Z2) + tL_topPeer.rating;
                    Collections.sort(b02.l1, new jg.x(21));
                    if (b02.l1.size() > 20) {
                        a8.p0.z(1, b02.l1);
                    }
                    b02.getMessagesStorage().f26723a.c(new ah(b02, j3, 2, tL_topPeer.rating));
                    b02.getNotificationCenter().k(qs.V0, new Object[0]);
                }
                this.D.t(this.H, str, z9);
            }
            org.telegram.messenger.g0.i3(this.f14539u0, max);
            r2 r2Var = this.f14543x;
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
        z2 z2Var = this.f14521f;
        z2Var.setAlpha(0.0f);
        z2Var.addOnLayoutChangeListener(new l2(this, 0));
        super.show();
        this.Q0 = false;
        f14509a1.add(this);
    }

    public final void t(boolean z9) {
        if (this.D0 == z9) {
            return;
        }
        this.D0 = z9;
        if (this.Z0) {
            if (z9) {
                f14511c1++;
            } else {
                f14511c1--;
            }
        }
        if (f14511c1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.Q3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f14537s0) {
            TLRPC.User a22 = qp.s1(this.H).a2(Long.valueOf(this.I));
            if (a22 != null) {
                str = g5.m(0, a22.first_name, a22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = str;
            u1Var.T = id.M0(2131752917, null);
            alertDialog$Builder.k(id.M0(2131752916, null), new y1(this));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            u1Var.show();
            ((TextView) u1Var.d(-1)).setTextColor(m6.w0(m6.f28131q7, this.F));
            return false;
        }
        o(false);
        return true;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        int i7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int w02;
        int w03;
        boolean q10 = q();
        TLRPC.User a22 = qp.s1(this.H).a2(Long.valueOf(this.I));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = ui.b0(this.H).f25806b.bots;
        int size = arrayList2.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i13);
                i13++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.I) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        k60 k60Var = this.O0;
        if (k60Var != null) {
            k60Var.u();
        }
        if (this.f14520e0) {
            view = this.f14530n0;
        } else {
            view = this.f14513a0;
        }
        k60 G = k60.G(this.f14521f, this.F, view, true);
        this.O0 = G;
        ArrayList arrayList3 = g0.c(getContext(), this.H, this.I).f14672e;
        HashMap hashMap = this.N0;
        hashMap.clear();
        int i14 = 14;
        if (!arrayList3.isEmpty()) {
            k60 J = G.J();
            J.c(2131232057, id.M0(2131753756, null), new jq0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList3.get(i15);
                i15++;
                f0 f0Var = (f0) obj;
                String str = f0Var.f14642c;
                ai.m0 m0Var = new ai.m0(i14);
                h6 h6Var = J.d;
                if (J.f35194e == null) {
                    arrayList = arrayList3;
                    i12 = size2;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, J.f35194e, J.d, false, false);
                    arrayList = arrayList3;
                    i12 = size2;
                    z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    z0Var.setText(str);
                    z0Var.setSubtext("");
                    Integer num = J.f35204j0;
                    if (num == null && J.f35206k0 == null) {
                        z0Var.c(m6.E8, m6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = m6.w0(m6.E8, h6Var);
                        }
                        Integer num2 = J.f35206k0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = m6.w0(m6.F8, h6Var);
                        }
                        z0Var.d(w02, w03);
                    }
                    Integer num3 = J.f35208l0;
                    if (num3 != null) {
                        z0Var.setSelectorColor(num3.intValue());
                    } else {
                        z0Var.h(0.12f, m6.E8);
                    }
                    z0Var.setOnClickListener(new org.telegram.ui.Components.g0(J, m0Var));
                    int i16 = J.S;
                    if (i16 > 0) {
                        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
                        J.r(z0Var, ha.o(J.S, -2));
                    } else {
                        J.r(z0Var, ha.o(-1, -2));
                        hashMap.put(f0Var, J.y());
                        size2 = i12;
                        arrayList3 = arrayList;
                        i14 = 14;
                    }
                }
                hashMap.put(f0Var, J.y());
                size2 = i12;
                arrayList3 = arrayList;
                i14 = 14;
            }
            i7 = -1;
            G();
            J.S = org.telegram.messenger.g0.L(180.0f);
            G.c(2131231789, id.M0(2131753094, null), new h2(G, J, 0), false);
            G.k();
        } else {
            i7 = -1;
        }
        if (this.L0 == null && !q10) {
            z9 = true;
        } else {
            z9 = false;
        }
        G.l(2131232072, id.M0(2131752912, null), new x1(this, 9), z9);
        if (this.L0 == null && this.f14517c0) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(2131232360, id.M0(2131752897, null), new x1(this, 10), z10);
        G.c(2131232342, id.M0(2131752911, null), new bi.k1(10, this, q10), false);
        if (this.L0 == null && a22 != null && a22.bot_has_main_app) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(2131232183, id.M0(2131754390, null), new x1(this, 11), z11);
        if (this.L0 == null && !q10) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(2131231835, id.M0(2131752894, null), new x1(this, 12), z12);
        if (this.L0 == null && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(2131232333, id.M0(2131752910, null), new x1(this, 13), z13);
        if (this.L0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(2131232108, id.M0(2131752915, null), new x1(this, 14), z14);
        if (this.R != m6.x0(null, m6.f27890d6, false)) {
            if (org.telegram.messenger.g0.B(this.R) >= 0.721f) {
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
            G.P(i10);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w10 = G.w(i17);
                if (w10 instanceof org.telegram.ui.ActionBar.z0) {
                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) w10;
                    z0Var2.d(i11, r12);
                    z0Var2.setSelectorColor(r13);
                }
            }
        }
        G.V(5);
        G.a0(-this.f14529n.right, 0.0f);
        G.U = true;
        G.f35220t = false;
        G.f35219s = 0;
        G.Z();
    }

    public final void x(org.telegram.ui.ActionBar.f2 f2Var, q4 q4Var) {
        boolean z9;
        TLRPC.User a22;
        CharSequence p10;
        TLRPC.UserFull b22;
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        boolean z10;
        boolean z11;
        TLRPC.InputPeer n1;
        TLRPC.InputPeer j12;
        boolean z12;
        boolean z13;
        TL_bots.botAppSettings botappsettings;
        String p11;
        boolean z14;
        this.f14542w0 = q4Var;
        int i7 = q4Var.f14891a;
        this.H = i7;
        this.J = q4Var.f14892b;
        this.I = q4Var.f14893c;
        this.L = q4Var.h;
        this.M = q4Var.f14897i;
        this.N = q4Var.f14894e;
        if (q4Var.f14896g == 6) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            a22 = null;
        } else {
            a22 = qp.s1(i7).a2(Long.valueOf(this.I));
        }
        if (z9) {
            p10 = q4Var.f14894e;
        } else {
            p10 = t10.p(a22);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        x2 x2Var = this.X;
        x2Var.setTitle(p10);
        if (z9) {
            b22 = null;
        } else {
            b22 = qp.s1(this.H).b2(this.I);
        }
        h6 h6Var = this.F;
        if ((a22 != null && a22.verified) || (b22 != null && (user = b22.user) != null && user.verified)) {
            this.M0 = getContext().getResources().getDrawable(2131232793).mutate();
            t6.x(x2Var.getTitleTextView(), this.M0, m6.Ci, h6Var, PorterDuff.Mode.SRC_IN);
            this.M0.setAlpha(255);
            x2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
            x2Var.getTitleTextView().i(new fi.l3(this, 1));
        }
        org.telegram.messenger.h2 h2Var = this.f14530n0;
        if (h2Var != null) {
            if (z9) {
                p11 = q4Var.f14894e;
            } else {
                p11 = t10.p(a22);
            }
            if (a22 != null && a22.verified) {
                z14 = true;
            } else {
                z14 = false;
            }
            h2Var.T = new my0(p11, 13.0f, org.telegram.messenger.g0.o());
            if (!z14) {
                h2Var.U = null;
                h2Var.V = null;
            } else {
                h2Var.U = h2Var.getContext().getResources().getDrawable(2131232791).mutate();
                h2Var.V = h2Var.getContext().getResources().getDrawable(2131232792).mutate();
            }
        }
        org.telegram.ui.ActionBar.y s5 = x2Var.s();
        s5.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.H).f25806b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                yVar = s5;
                userFull = b22;
                if (tL_attachMenuBot.bot_id == this.I) {
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
        if (!this.F0 && !z9) {
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
                qp.s1(this.H).W2(a22, 0, true, new a2(this, 1));
            }
            if (q4Var.f14904p) {
                C(z13, z12, this.f14522f0);
            }
        }
        if (this.L0 == null) {
            yVar2 = yVar;
            yVar2.a(2131296492, 2131230871);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.g2 g2Var = new org.telegram.messenger.g2(getContext());
        this.f14515b0 = g2Var;
        org.telegram.ui.ActionBar.r0 d = yVar2.d(0, g2Var);
        this.f14513a0 = d;
        d.setOnClickListener(new c2(this, 1));
        x2Var.setActionBarMenuOnItemClick(new k2(this, 0));
        JSONObject u10 = u(h6Var, false);
        s2 s2Var = this.D;
        s2Var.setBotUser(a22);
        if (!z9) {
            s2Var.s(this.H, this.I);
            TLRPC.User user2 = q4Var.f14901m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ui.b0(this.H);
                if (!ui.z0(ui.f25801c2, this.I)) {
                    if (user2 == null) {
                        user2 = qp.s1(this.H).a2(Long.valueOf(this.I));
                    }
                    if (user2 != null && user2.photo != null) {
                        w7.G(this.H);
                        if (!w7.J(user2.photo.photo_small, null, true, true).exists()) {
                            ui.b0(this.H).l1(hc.l(this.H, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (q4Var.f14905q != null) {
            s();
            return;
        }
        int i11 = q4Var.f14896g;
        int i12 = qs.f25123z1;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = qp.s1(this.H).j1(this.J);
                tL_messages_requestWebView.bot = qp.s1(this.H).o1(this.I);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = q4Var.f14903o;
                tL_messages_requestWebView.fullscreen = q4Var.f14904p;
                String str = q4Var.f14895f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.L != 0) {
                    gz.C(this.H);
                    int i13 = this.L;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i13;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.M != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = qp.s1(this.H).j1(this.M);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.M != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = qp.s1(this.H).j1(this.M);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView, new i2(this, 3));
                qs.f(this.H).c(this, i12);
                return;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((q4Var.f14902n & 1) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z10;
                tL_messages_requestSimpleWebView.bot = qp.s1(this.H).o1(this.I);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((q4Var.f14902n & 2) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z11;
                tL_messages_requestSimpleWebView.compact = q4Var.f14903o;
                tL_messages_requestSimpleWebView.fullscreen = q4Var.f14904p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(q4Var.f14895f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = q4Var.f14895f;
                }
                if (!TextUtils.isEmpty(q4Var.f14900l)) {
                    tL_messages_requestSimpleWebView.start_param = q4Var.f14900l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestSimpleWebView, new i2(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = qp.s1(this.H).o1(this.I);
                tL_messages_requestWebView2.peer = qp.s1(this.H).j1(this.I);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = q4Var.f14903o;
                tL_messages_requestWebView2.fullscreen = q4Var.f14904p;
                tL_messages_requestWebView2.url = q4Var.f14895f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView2, new i2(this, 1));
                qs.f(this.H).c(this, i12);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = q4Var.f14898j;
                tL_inputBotAppID.f27018id = botApp.f26957id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = q4Var.f14899k;
                tL_messages_requestAppWebView.platform = "android";
                if (f2Var instanceof cn) {
                    cn cnVar = (cn) f2Var;
                    if (cnVar.j() != null) {
                        n1 = qp.n1(cnVar.j());
                    } else {
                        n1 = qp.l1(cnVar.f44473e);
                    }
                } else {
                    n1 = qp.n1(q4Var.f14901m);
                }
                tL_messages_requestAppWebView.peer = n1;
                tL_messages_requestAppWebView.compact = q4Var.f14903o;
                tL_messages_requestAppWebView.fullscreen = q4Var.f14904p;
                if (!TextUtils.isEmpty(q4Var.f14900l)) {
                    tL_messages_requestAppWebView.start_param = q4Var.f14900l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestAppWebView, new i2(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = qp.s1(this.H).o1(q4Var.f14893c);
                tL_messages_requestMainWebView.platform = "android";
                if (f2Var instanceof cn) {
                    cn cnVar2 = (cn) f2Var;
                    if (cnVar2.j() != null) {
                        j12 = qp.n1(cnVar2.j());
                    } else {
                        j12 = qp.l1(cnVar2.f44473e);
                    }
                } else {
                    j12 = qp.s1(this.H).j1(q4Var.f14892b);
                }
                tL_messages_requestMainWebView.peer = j12;
                tL_messages_requestMainWebView.compact = q4Var.f14903o;
                tL_messages_requestMainWebView.fullscreen = q4Var.f14904p;
                if (!TextUtils.isEmpty(q4Var.f14900l)) {
                    tL_messages_requestMainWebView.start_param = q4Var.f14900l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestMainWebView, new i2(this, 5), 66);
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
                ConnectionsManager.getInstance(this.H).sendRequestTyped(tL_messages_requestChatJoinWebView, new d3.b(1), new u1(this, 0), 66);
                return;
            case 6:
                if (!this.F0) {
                    s2Var.t(this.H, q4Var.f14895f, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void y(final int i7, boolean z9, boolean z10) {
        int i10;
        boolean z11;
        final int i11 = this.R;
        m6.b(0.35f, -0.1f, i7);
        final t1 t1Var = new t1();
        int i12 = 0;
        if (this.V) {
            i10 = this.R;
        } else {
            i10 = 0;
        }
        SparseIntArray sparseIntArray = t1Var.f14960a;
        h6 h6Var = this.F;
        t1Var.c(sparseIntArray, i10, h6Var);
        this.V = z9;
        if (i0.a.h(i7) < 0.7210000157356262d) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.T = z11;
        if (this.V) {
            i12 = i7;
        }
        t1Var.c(t1Var.f14961b, i12, h6Var);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(wq.f40046f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f10 = i0.a.f(floatValue, i11, i7);
                    a3 a3Var = a3.this;
                    a3Var.R = f10;
                    a3Var.l();
                    z2 z2Var = a3Var.f14521f;
                    z2Var.invalidate();
                    x2 x2Var = a3Var.X;
                    x2Var.setBackgroundColor(a3Var.R);
                    t1 t1Var2 = t1Var;
                    t1Var2.b(x2Var, floatValue);
                    a3Var.f14512a = t1Var2.a(m6.wj);
                    z2Var.invalidate();
                }
            });
            duration.addListener(new q2(this, i11, i7, t1Var));
            duration.start();
        } else {
            this.R = i7;
            l();
            z2 z2Var = this.f14521f;
            z2Var.invalidate();
            int i13 = this.R;
            x2 x2Var = this.X;
            x2Var.setBackgroundColor(i13);
            t1Var.b(x2Var, 1.0f);
            this.f14512a = t1Var.a(m6.wj);
            z2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z9) {
        if (this.Z0 == z9) {
            return;
        }
        this.Z0 = z9;
        if (z9) {
            if (this.D0) {
                f14511c1++;
            }
        } else if (this.D0) {
            f14511c1--;
        }
        if (f14511c1 > 0) {
            org.telegram.messenger.g0.f2(p());
        } else {
            org.telegram.messenger.g0.Q3(p());
        }
    }

    @Override
    public final void b(boolean z9) {
    }
}
