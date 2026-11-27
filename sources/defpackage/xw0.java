package defpackage;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class xw0 extends Dialog implements fn7, dy0 {
    public static final HashSet b1 = new HashSet();
    public static final bma c1;
    public static int d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public wr0 D0;
    public final pw0 E;
    public boolean E0;
    public final vw0 F;
    public xx0 F0;
    public final vnb G;
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
    public hob M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public fu5 P0;
    public final Paint Q;
    public lp0 Q0;
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
    public final uw0 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public dw Z0;
    public int a;
    public final Drawable a0;
    public boolean a1;
    public int b;
    public s7 b0;
    public float c;
    public xp0 c0;
    public vpa d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final ww0 f;
    public boolean f0;
    public boolean g0;
    public final Rect h;
    public float h0;
    public float i0;
    public boolean j0;
    public int k0;
    public int l0;
    public Activity m0;
    public final Rect n;
    public final tw0 n0;
    public final yp0 o0;
    public v21 p0;
    public kp0 q0;
    public int r;
    public final FrameLayout r0;
    public final yx0 s;
    public final FrameLayout.LayoutParams s0;
    public boolean t0;
    public final fz7 u0;
    public final wv0 v0;
    public final am2 w;
    public int w0;
    public final ow0 x;
    public gzc x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        bma bmaVar = new bma(new rm0((byte) 8), new rm0((byte) 9));
        bmaVar.c = 100.0f;
        c1 = bmaVar;
        d1 = 0;
    }

    public xw0(Context context, vnb vnbVar) {
        super(context, 2131755352);
        boolean z;
        Object obj;
        yx0 yx0Var;
        this.c = 0.0f;
        this.h = new Rect();
        this.n = new Rect();
        this.r = 0;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint();
        this.Q = paint2;
        this.R = new Paint(1);
        this.V = new Paint(1);
        this.v0 = new wv0(this, (byte) 1);
        this.w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.a1 = false;
        this.G = vnbVar;
        int w0 = aob.w0(null, aob.zj, false);
        this.b = w0;
        this.a = w0;
        ow0 ow0Var = new ow0((byte) 0, context, this);
        this.x = ow0Var;
        ow0Var.setAllowFullSizeSwipe(true);
        ow0Var.setShouldWaitWebViewScroll(true);
        int i = aob.d6;
        pw0 pw0Var = new pw0(this, context, vnbVar, aob.v0(i, vnbVar), (byte) 0);
        this.E = pw0Var;
        pw0Var.setOnVerifiedAge(this.M0);
        pw0Var.setDelegate(new sw0(this, context, vnbVar));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(hl.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = aob.v0(i, vnbVar);
        int v0 = aob.v0(aob.a7, vnbVar);
        this.T = v0;
        hl.o3(this, v0, false, null);
        ww0 ww0Var = new ww0(this, context);
        this.f = ww0Var;
        ww0Var.setDelegate(new yv0(this, (byte) 0));
        FrameLayout.LayoutParams e = tre.e(-1, -1, 49);
        this.y = e;
        ww0Var.addView(ow0Var, e);
        tw0 tw0Var = new tw0(this, getContext(), vnbVar);
        this.n0 = tw0Var;
        tw0Var.setOnButtonClickListener(new zv0(this, (byte) 0));
        tw0Var.setOnResizeListener(new wv0(this, (byte) 3));
        ww0Var.addView(tw0Var, tre.e(-1, -2, 81));
        yp0 yp0Var = new yp0(getContext());
        this.o0 = yp0Var;
        yp0Var.setAlpha(0.0f);
        yp0Var.setVisibility(8);
        if (!uc7.s1(this.I).k4.N1.f && xea.o() >= 2) {
            z = true;
        } else {
            z = false;
        }
        this.g0 = z;
        if (z) {
            obj = ow0Var.getRenderNode();
        } else {
            obj = null;
        }
        yp0Var.setParentRenderNode(obj);
        ww0Var.addView(yp0Var, tre.e(-1, -1, 119));
        yp0Var.setOnCloseClickListener(new wv0(this, (byte) 4));
        yp0Var.setOnCollapseClickListener(new wv0(this, (byte) 5));
        yp0Var.setOnMenuClickListener(new wv0(this, (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        FrameLayout.LayoutParams e2 = tre.e(-1, 200, 55);
        this.s0 = e2;
        ww0Var.addView(frameLayout, e2);
        this.a0 = getContext().getDrawable(2131231240).mutate();
        ?? aVar = new a(context, vnbVar);
        this.Y = aVar;
        aVar.setBackgroundColor(0);
        aVar.setBackButtonImage(2131231272);
        F();
        aVar.setActionBarMenuOnItemClick(new hw0(this, (byte) 1));
        aVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e3 = tre.e(-1, -2, 49);
        this.Z = e3;
        ww0Var.addView((View) aVar, e3);
        ?? d22Var = new d22(context, vnbVar);
        this.F = d22Var;
        ww0Var.addView((View) d22Var, tre.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        pw0Var.setWebViewProgressListener(new hw(this, (byte) 1));
        ow0Var.addView(pw0Var, tre.c(-1.0f, -1));
        ow0Var.setScrollListener(new wv0(this, (byte) 7));
        ow0Var.setScrollEndListener(new wv0(this, (byte) 8));
        ow0Var.setDelegate(new xv0(this));
        ow0Var.setIsKeyboardVisible(new xv0(this));
        fz7 fz7Var = new fz7(context);
        this.u0 = fz7Var;
        ww0Var.addView(fz7Var, tre.c(-1.0f, -1));
        setContentView(ww0Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            yx0Var = launchActivity.O();
        } else {
            yx0Var = null;
        }
        this.s = yx0Var;
        if (yx0Var != null) {
            fv0 fv0Var = new fv0(ww0Var, (byte) 2);
            wv0 wv0Var = new wv0(this, (byte) 2);
            yx0Var.J.add(fv0Var);
            yx0Var.K.add(wv0Var);
            this.w = new am2(yx0Var);
        }
    }

    public static void f(xw0 xw0Var) {
        super.dismiss();
    }

    public static void l(int i, long j, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(i).b.bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                i2++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == j) {
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
        String a0 = ob6.a0(null, null, 2131752983, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = ob6.M0(2131752982, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(a0);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new ff(i, j, tL_attachMenuBot, runnable));
        ik8.y(null, 2131752570, alertDialog$Builder, null);
    }

    public static JSONObject u(vnb vnbVar, final boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = aob.v(-16777216, aob.v0(aob.h5, vnbVar));
            qcc qccVar = new qcc() {
                @Override
                public final Object a(Object obj) {
                    int v2 = aob.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v2);
                    if (z) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v2)), Integer.valueOf(Color.green(v2)), Integer.valueOf(Color.blue(v2)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", qccVar.a(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", qccVar.a(Integer.valueOf(aob.v0(aob.d6, vnbVar))));
            int i = aob.a7;
            jSONObject.put("secondary_bg_color", qccVar.a(Integer.valueOf(aob.v0(i, vnbVar))));
            jSONObject.put("text_color", qccVar.a(Integer.valueOf(aob.v0(aob.G6, vnbVar))));
            jSONObject.put("hint_color", qccVar.a(Integer.valueOf(aob.v0(aob.H6, vnbVar))));
            jSONObject.put("link_color", qccVar.a(Integer.valueOf(aob.v0(aob.J6, vnbVar))));
            jSONObject.put("button_color", qccVar.a(Integer.valueOf(aob.v0(aob.Fi, vnbVar))));
            jSONObject.put("button_text_color", qccVar.a(Integer.valueOf(aob.v0(aob.Ji, vnbVar))));
            jSONObject.put("header_bg_color", qccVar.a(Integer.valueOf(aob.v0(aob.s8, vnbVar))));
            jSONObject.put("accent_text_color", qccVar.a(Integer.valueOf(aob.v0(aob.q6, vnbVar))));
            jSONObject.put("section_header_text_color", qccVar.a(Integer.valueOf(aob.v0(aob.L6, vnbVar))));
            jSONObject.put("subtitle_text_color", qccVar.a(Integer.valueOf(aob.v0(aob.z6, vnbVar))));
            jSONObject.put("destructive_text_color", qccVar.a(Integer.valueOf(aob.v0(aob.p7, vnbVar))));
            jSONObject.put("section_separator_color", qccVar.a(Integer.valueOf(aob.v0(aob.d7, vnbVar))));
            jSONObject.put("bottom_bar_bg_color", qccVar.a(Integer.valueOf(aob.v0(i, vnbVar))));
            return jSONObject;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void A(int i, boolean z) {
        Paint paint = this.R;
        int color = paint.getColor();
        boolean z2 = true;
        this.X = true;
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.U0 = duration;
            duration.setInterpolator(k43.f);
            this.U0.addUpdateListener(new uv0(this, color, i, (byte) 0));
            this.U0.addListener(new dn(this, i, (byte) 1));
            this.U0.start();
            return;
        }
        paint.setColor(i);
        F();
        this.f.invalidate();
        dw dwVar = this.Z0;
        if (dwVar != null) {
            if (hl.B(paint.getColor()) > 0.721f) {
                z2 = false;
            }
            dwVar.b(z2, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            ow0 ow0Var = this.x;
            if (ow0Var != null) {
                ow0Var.setFullSize(p());
            }
        }
    }

    public final void C(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        int currentActionBarHeight;
        float f5;
        Point point;
        Object obj;
        if (this.f0 == z) {
            return;
        }
        this.f0 = z;
        int i = 0;
        if (z3 && !uc7.s1(this.I).k4.N1.f && xea.o() >= 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.g0 = z4;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yp0 yp0Var = this.o0;
        if (yp0Var != null) {
            pz pzVar = yp0Var.b0;
            hl.r(pzVar);
            yp0Var.N = z;
            if (!z2) {
                yp0Var.O.f(z, true);
            }
            yp0Var.invalidate();
            if (z) {
                hl.d3(pzVar, 2500L);
            }
            yp0 yp0Var2 = this.o0;
            if (this.g0) {
                obj = this.x.getRenderNode();
            } else {
                obj = null;
            }
            yp0Var2.setParentRenderNode(obj);
        }
        this.k0 = this.x.getWidth();
        this.l0 = this.x.getHeight();
        this.V0 = false;
        if (z2) {
            I();
            L();
            H();
            if (hl.O1() && !hl.E && !hl.N1()) {
                int i2 = hl.q.x;
                f2 = (i2 - ((int) (Math.min(i2, point.y) * 0.8f))) / 2.0f;
            } else {
                f2 = 0.0f;
            }
            int i3 = this.n.left;
            if (z) {
                f3 = i3 + f2;
                f4 = this.x.getTranslationY();
                currentActionBarHeight = -hl.L(24.0f);
            } else {
                f3 = (-i3) - f2;
                f2 = -f2;
                f4 = -hl.L(24.0f);
                currentActionBarHeight = (a.getCurrentActionBarHeight() + hl.m) - hl.L(24.0f);
            }
            float f6 = currentActionBarHeight;
            float currentActionBarHeight2 = a.getCurrentActionBarHeight() + hl.m;
            ow0 ow0Var = this.x;
            vpa vpaVar = ow0Var.w;
            if (vpaVar != null) {
                vpaVar.d();
            }
            vpa vpaVar2 = ow0Var.H;
            if (vpaVar2 != null) {
                vpaVar2.d();
            }
            this.x.setSwipeOffsetAnimationDisallowed(true);
            this.Y.setVisibility(0);
            ow0 ow0Var2 = this.x;
            if (z) {
                ow0Var2.setTopActionBarOffsetY(-hl.L(24.0f));
            } else {
                ow0Var2.setTopActionBarOffsetY(currentActionBarHeight2 - hl.L(24.0f));
            }
            this.x.c();
            this.x.invalidate();
            this.i0 = 0.0f;
            if (z) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            this.h0 = f5;
            this.Y.setAlpha(1.0f - f5);
            this.Y.setTranslationY((-a.getCurrentActionBarHeight()) * this.h0);
            this.x.setTranslationY(hl.R1(f4, f6, this.i0));
            this.x.setTranslationX(hl.R1(f3, 0.0f, this.i0));
            this.n0.setTranslationX(hl.R1(f2, 0.0f, this.i0));
            this.o0.setAlpha(this.h0);
            this.f.invalidate();
            this.E.setViewPortHeightOffset(this.x.getTranslationY() - f6);
            this.E.l(false, false);
            this.j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f7 = f3;
            ofFloat.addUpdateListener(new kw0(this, z, f4, f6, f7, f2));
            this.W0.addListener(new lw0(this, z, currentActionBarHeight2, f7));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(k43.h);
            this.W0.start();
            return;
        }
        this.j0 = false;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.h0 = f;
        this.i0 = 0.0f;
        I();
        L();
        uw0 uw0Var = this.Y;
        if (z) {
            i = 8;
        }
        uw0Var.setVisibility(i);
        this.Y.setAlpha(1.0f - this.h0);
        this.Y.setTranslationY((-a.getCurrentActionBarHeight()) * this.h0);
        this.n0.setTranslationX(0.0f);
        this.o0.setAlpha(this.h0);
        this.E.setViewPortHeightOffset(0.0f);
        this.E.l(true, true);
        H();
    }

    public final void D(int i, boolean z) {
        this.J0 = false;
        int i2 = this.T;
        tw0 tw0Var = this.n0;
        Paint paint = tw0Var.a;
        tw0Var.e.b = i;
        paint.setColor(i);
        if (!z) {
            tw0Var.d.a(i, true);
            this.T = i;
            h();
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(k43.f);
            duration.addUpdateListener(new uv0(this, i2, i, (byte) 1));
            duration.addListener(new mw0(this, i2, i, (byte) 0));
            duration.start();
        }
        hl.o3(this, this.T, false, null);
    }

    public final void E(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.S0;
        float f3 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (Math.abs(f2 - f) < 0.01f) {
            return;
        }
        float f4 = this.S0;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f3);
        this.T0 = ofFloat;
        ofFloat.addListener(new z7((byte) 8, this, z));
        this.T0.addUpdateListener(new vv0(this, (byte) 0));
        this.T0.setInterpolator(k43.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i = aob.G6;
            vnb vnbVar = this.G;
            int v0 = aob.v0(i, vnbVar);
            uw0 uw0Var = this.Y;
            uw0Var.setTitleColor(v0);
            uw0Var.H(aob.v0(i, vnbVar), false);
            uw0Var.G(aob.v0(aob.u8, vnbVar), false);
            uw0Var.I(aob.v0(aob.G8, vnbVar), false);
            uw0Var.J(aob.v0(aob.E8, vnbVar), false, false);
            uw0Var.J(aob.v0(aob.F8, vnbVar), true, false);
            uw0Var.K(aob.v0(aob.I5, vnbVar), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        v21 v21Var;
        boolean z;
        mp0 c = mp0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c.e;
        lp0 lp0Var = c.f;
        boolean z2 = true;
        if (lp0Var == null) {
            v21 v21Var2 = this.p0;
            if (v21Var2 != null) {
                v21Var2.b();
                this.p0 = null;
            }
        } else if ((lp0Var.c() && !lp0Var.l) || lp0Var.k) {
            if (this.Q0 != lp0Var && (v21Var = this.p0) != null) {
                v21Var.b();
                this.p0 = null;
            }
            v21 v21Var3 = this.p0;
            if (v21Var3 == null || !v21Var3.m) {
                this.Q0 = lp0Var;
                kp0 kp0Var = new kp0(getContext(), this.G);
                this.q0 = kp0Var;
                v21 f = v21.f(this.r0, kp0Var, 5000);
                this.p0 = f;
                f.k(true);
            }
            if (this.q0.g(lp0Var)) {
                this.p0 = null;
            }
            lp0Var.k = false;
            lp0Var.l = true;
        } else {
            kp0 kp0Var2 = this.q0;
            if (kp0Var2 != null) {
                this.Q0 = lp0Var;
                if (kp0Var2.g(lp0Var)) {
                    this.p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            b8 b8Var = (b8) entry.getValue();
            lp0 lp0Var2 = (lp0) entry.getKey();
            b8Var.setText(lp0Var2.c);
            if (!lp0Var2.c()) {
                b8Var.setSubtext(hl.i0(lp0Var2.g, false, false));
            } else {
                Pair b = lp0Var2.b();
                int i = (((Long) b.second).longValue() > 0L ? 1 : (((Long) b.second).longValue() == 0L ? 0 : -1));
                Object obj = b.first;
                if (i > 0) {
                    b8Var.setSubtext(hl.i0(((Long) obj).longValue(), false, false) + " / " + hl.i0(((Long) b.second).longValue(), false, false));
                } else {
                    b8Var.setSubtext(hl.i0(((Long) obj).longValue(), false, false));
                }
            }
            if (lp0Var2.c()) {
                b8Var.setRightIcon(2131232101);
                b8Var.b.setPadding(0, 0, hl.L(32.0f), 0);
            } else if (lp0Var2.i) {
                b8Var.setVisibility(8);
            } else {
                b8Var.setRightIcon(0);
                b8Var.b.setPadding(0, 0, 0, 0);
            }
            b8Var.setOnClickListener(new t(this, lp0Var2, (byte) 25));
        }
        xp0 xp0Var = this.c0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((lp0) obj2).c()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (xp0Var.e != z) {
            xp0Var.e = z;
            xp0Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                if (((lp0) obj3).c()) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        this.o0.setDownloading(z2);
    }

    public final void H() {
        kp0 kp0Var = this.q0;
        if (kp0Var == null) {
            return;
        }
        if (this.f0) {
            kp0Var.setArrow(hl.U1(this.h0, hl.L(24.0f), hl.L(26.0f)));
        } else if (this.c > 0.5f) {
            kp0Var.setArrow(hl.L(24.0f));
        } else {
            kp0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        yp0 yp0Var = this.o0;
        Rect rect = this.n;
        yp0Var.setInsets(rect);
        boolean z = this.f0;
        pw0 pw0Var = this.E;
        ww0 ww0Var = this.f;
        tw0 tw0Var = this.n0;
        int i7 = 0;
        if (z) {
            if (tw0Var != null && tw0Var.getTotalHeight() > 0) {
                i5 = rect.bottom;
            } else {
                i5 = 0;
            }
            int i8 = rect.left;
            int i9 = rect.top;
            int i10 = rect.right;
            if (this.r > i5 || (tw0Var != null && tw0Var.getTotalHeight() > 0)) {
                i6 = 0;
            } else {
                i6 = rect.bottom;
            }
            Rect rect2 = new Rect(i8, i9, i10, i6);
            int L = hl.L(46.0f);
            pw0Var.N(rect2, false);
            pw0Var.M(L, false);
            ww0Var.setPadding(0, 0, 0, Math.max(this.r, i5));
        } else {
            pw0Var.N(new Rect(0, 0, 0, 0), false);
            pw0Var.M(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.r;
            yx0 yx0Var = this.s;
            if (yx0Var != null) {
                i = yx0Var.I;
            } else {
                i = 0;
            }
            ww0Var.setPadding(i11, 0, i12, Math.max(i13, i + rect.bottom));
        }
        this.y.topMargin = hl.L(24.0f);
        boolean z2 = this.f0;
        if (!z2) {
            i2 = 0;
        } else {
            i2 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.Z;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = 0;
        if (!z2) {
            i3 = 0;
        } else {
            i3 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.s0;
        layoutParams2.leftMargin = i3;
        if (!z2) {
            i4 = 0;
        } else {
            i4 = rect.right;
        }
        layoutParams2.rightMargin = i4;
        boolean z3 = this.j0;
        ow0 ow0Var = this.x;
        if (!z3) {
            ow0Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f0) {
                ow0Var.setTopActionBarOffsetY(-hl.L(24.0f));
            } else {
                ow0Var.setTopActionBarOffsetY((a.getCurrentActionBarHeight() + hl.m) - hl.L(24.0f));
            }
            ow0Var.setSwipeOffsetAnimationDisallowed(false);
            ow0Var.c();
            ow0Var.invalidate();
            ow0Var.requestLayout();
        }
        if (ow0Var != null) {
            ow0Var.setFullSize(p());
        }
        tw0Var.requestLayout();
        ww0Var.requestLayout();
        if (!this.f0) {
            i7 = 8;
        }
        yp0Var.setVisibility(i7);
    }

    public final void J() {
        boolean z;
        int i;
        boolean z2 = true;
        if (this.W) {
            z = !this.U;
        } else {
            z = (hl.O1() || vm2.h(aob.w0(null, aob.d6, true)) < 0.7210000157356262d || this.c < 0.85f) ? false : false;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.e = Boolean.valueOf(z);
        ww0 ww0Var = this.f;
        int systemUiVisibility = ww0Var.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        ww0Var.setSystemUiVisibility(i);
    }

    public final void K() {
        nv0 webView;
        pw0 pw0Var = this.E;
        if (pw0Var == null || (webView = pw0Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.R.getColor());
    }

    public final void L() {
        int i;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT <= 28) {
                i = 1024;
            } else {
                i = 512;
            }
            boolean z = this.f0;
            ww0 ww0Var = this.f;
            if (z) {
                attributes.flags |= i;
                tw0 tw0Var = this.n0;
                if ((tw0Var == null || tw0Var.getTotalHeight() <= 0) && !ww0Var.h0) {
                    ww0Var.setSystemUiVisibility(ww0Var.getSystemUiVisibility() | 2);
                    window.setAttributes(attributes);
                }
            } else {
                attributes.flags &= ~i;
            }
            ww0Var.setSystemUiVisibility(ww0Var.getSystemUiVisibility() & (-3));
            window.setAttributes(attributes);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void a(boolean z) {
        m(false);
    }

    @Override
    public final xx0 c() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean booleanValue;
        float f;
        xx0 xx0Var = new xx0();
        xx0Var.q = this.S;
        xx0Var.p = this.w0;
        xx0Var.n = this.W;
        xx0Var.o = this.X;
        xx0Var.r = this.R.getColor();
        xx0Var.a = this.x0;
        boolean z4 = false;
        pw0 pw0Var = this.E;
        if (pw0Var != null && pw0Var.O) {
            z = true;
        } else {
            z = false;
        }
        xx0Var.t = z;
        xx0Var.D = aob.I.o();
        nv0 nv0Var = null;
        if (pw0Var != null) {
            str = pw0Var.getUrlLoaded();
        } else {
            str = null;
        }
        xx0Var.x = str;
        if (pw0Var != null && pw0Var.u0) {
            z2 = true;
        } else {
            z2 = false;
        }
        xx0Var.e = z2;
        if (pw0Var != null) {
            str2 = pw0Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        xx0Var.f = str2;
        ow0 ow0Var = this.x;
        if ((ow0Var == null || ow0Var.getSwipeOffsetY() >= 0.0f) && !this.z0 && !p() && !this.f0) {
            z3 = false;
        } else {
            z3 = true;
        }
        xx0Var.j = z3;
        xx0Var.z = this.f0;
        xx0Var.A = this.g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        xx0Var.B = booleanValue;
        if (ow0Var != null) {
            f = ow0Var.getOffsetY();
        } else {
            f = Float.MAX_VALUE;
        }
        xx0Var.k = f;
        xx0Var.C = this.C0;
        xx0Var.u = this.y0;
        xx0Var.y = this.t0;
        xx0Var.v = this.d0;
        if (ow0Var == null || ow0Var.N) {
            z4 = true;
        }
        xx0Var.l = z4;
        xx0Var.w = this.n0.e;
        xx0Var.s = this.T;
        wr0 wr0Var = this.D0;
        if (wr0Var != null) {
            wr0Var.b();
        }
        xx0Var.K = this.D0;
        if (pw0Var != null) {
            nv0Var = pw0Var.getWebView();
        }
        if (nv0Var != null) {
            pw0Var.J();
            xx0Var.b = nv0Var;
            xx0Var.d = pw0Var.getBotProxy();
            xx0Var.g = nv0Var.getWidth();
            xx0Var.h = nv0Var.getHeight();
            nv0Var.onPause();
        }
        boolean z5 = this.X0;
        xx0Var.G = z5;
        if (z5) {
            xx0Var.H = this.Y0;
        }
        xx0Var.L = this.E0;
        this.F0 = xx0Var;
        return xx0Var;
    }

    @Override
    public final ey0 mo23d() {
        return this.f;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                m(false);
            }
        } else if (i == jn7.q4) {
            this.f.invalidate();
            this.E.n.b(aob.v0(aob.d6, this.G), 153);
            F();
            J();
        } else if (i == jn7.M3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        m(false);
    }

    @Override
    public final int e(int i) {
        return vm2.f(this.S0, i, this.T);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        if (botappsettings != null) {
            boolean o = aob.I.o();
            int i6 = botappsettings.flags;
            if (o) {
                i = 4;
            } else {
                i = 2;
            }
            if ((i & i6) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (o) {
                i2 = 16;
            } else {
                i2 = 8;
            }
            if ((i6 & i2) != 0) {
                if (o) {
                    i5 = botappsettings.header_dark_color;
                } else {
                    i5 = botappsettings.header_color;
                }
                y(i5 | (-16777216), true, z);
            }
            if (z2) {
                if (o) {
                    i3 = botappsettings.background_dark_color;
                } else {
                    i3 = botappsettings.background_color;
                }
                A(i3 | (-16777216), z);
                if (o) {
                    i4 = botappsettings.background_dark_color;
                } else {
                    i4 = botappsettings.background_color;
                }
                D(i4 | (-16777216), z);
            }
        }
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.R0 && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.H(true, true, true);
        }
        ww0 ww0Var = this.f;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final void j() {
        if (this.Z0 == null) {
            dw dwVar = new dw(getContext());
            this.Z0 = dwVar;
            this.x.addView(dwVar, tre.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new bw0(this, (byte) 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            hl.T3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    @Override
    public final boolean k(tx0 tx0Var) {
        return false;
    }

    public final void m(boolean z) {
        int i;
        int i2;
        LaunchActivity launchActivity;
        if (this.e0) {
            return;
        }
        if (this.M0 != null) {
            z = false;
        }
        this.e0 = true;
        E(false);
        hl.r(this.v0);
        jn7.f(this.I).n(this, jn7.z1);
        jn7.f(this.I).n(this, jn7.M3);
        jn7.e().n(this, jn7.q4);
        if (z && ((launchActivity = LaunchActivity.H1) == null || launchActivity.x0 == null)) {
            z = false;
        }
        if (z) {
            vpa vpaVar = this.d;
            if (vpaVar != null) {
                vpaVar.m.i = 0.0d;
                vpaVar.h();
            }
            LaunchActivity.H1.x0.b(this);
        } else {
            tw0 tw0Var = this.n0;
            if (tw0Var != null) {
                tw0Var.animate().translationY(tw0Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(k43.h).start();
            }
            this.E.f();
            ow0 ow0Var = this.x;
            int height = ow0Var.getHeight();
            if (tw0Var != null) {
                i = tw0Var.getTotalHeight();
            } else {
                i = 0;
            }
            int i3 = height + i;
            Rect rect = this.n;
            int Q = this.f.Q() + i3 + rect.top + rect.bottom;
            if (p()) {
                i2 = hl.L(200.0f);
            } else {
                i2 = 0;
            }
            ow0Var.e(Q + i2, true, new wv0(this, (byte) 0));
        }
        b1.remove(this);
    }

    public final Activity n() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        if (ownerActivity == null) {
            return hl.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean o() {
        gzc gzcVar = this.x0;
        if (gzcVar != null && gzcVar.g == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            vpa vpaVar = new vpa(this, c1);
            wpa wpaVar = new wpa();
            wpaVar.b(1200.0f);
            wpaVar.a(1.0f);
            vpaVar.m = wpaVar;
            this.d = vpaVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.u0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.E.A()) {
        } else {
            m(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        tw0 tw0Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i2 = attributes.flags;
        int i3 = i2 & (-3);
        attributes.flags = i3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z = true;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f0) {
            attributes.flags = i3 | 512;
        } else {
            attributes.flags = i2 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        ww0 ww0Var = this.f;
        ww0Var.setFitsSystemWindows(true);
        ww0Var.setSystemUiVisibility(1792);
        ww0Var.setOnApplyWindowInsetsListener(new ew0(this, (byte) 0));
        if (this.f0 && ((tw0Var = this.n0) == null || tw0Var.getTotalHeight() <= 0)) {
            ww0Var.setSystemUiVisibility(ww0Var.getSystemUiVisibility() | 2);
        } else {
            ww0Var.setSystemUiVisibility(ww0Var.getSystemUiVisibility() & (-3));
        }
        if (i >= 26) {
            if (vm2.h(this.T) < 0.7210000157356262d) {
                z = false;
            }
            hl.i3(this, z);
        }
        jn7.e().b(this, jn7.q4);
        jn7.f(this.I).b(this, jn7.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        vpa vpaVar = this.d;
        if (vpaVar != null) {
            vpaVar.d();
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
            ((LaunchActivity) context).A0.add(this.u0);
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
            ((LaunchActivity) context).A0.remove(this.u0);
        }
    }

    public final boolean p() {
        if (!this.f0) {
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

    public final void q() {
        if (!this.R0) {
            super.dismiss();
            this.R0 = true;
        }
    }

    public final WindowInsets r(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i;
        WindowInsets windowInsets3;
        i2d i2dVar = l2d.h(view, windowInsets).a;
        mq5 f = i2dVar.f(2);
        this.h.set(f.a, f.b, f.c, f.d);
        mq5 f2 = i2dVar.f(647);
        int max = Math.max(f2.a, windowInsets.getStableInsetLeft());
        int max2 = Math.max(f2.b, windowInsets.getStableInsetTop());
        int max3 = Math.max(f2.c, windowInsets.getStableInsetRight());
        int max4 = Math.max(f2.d, windowInsets.getStableInsetBottom());
        Rect rect = this.n;
        rect.set(max, max2, max3, max4);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            Activity W = hl.W(getContext());
            if (W != null && W.getWindow() != null) {
                windowInsets3 = W.getWindow().getDecorView().getRootWindowInsets();
            } else {
                windowInsets3 = null;
            }
            if (windowInsets3 != null) {
                rect.set(Math.max(rect.left, windowInsets3.getStableInsetLeft()), Math.max(rect.top, windowInsets3.getStableInsetTop()), Math.max(rect.right, windowInsets3.getStableInsetRight()), Math.max(rect.bottom, windowInsets3.getStableInsetBottom()));
            }
        }
        if (i2 <= 29) {
            int i3 = rect.top;
            Context context = getContext();
            Typeface typeface = hl.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            rect.top = Math.max(i3, i);
        }
        int i4 = i2dVar.f(8).d;
        if (i4 > rect.bottom && i4 > hl.L(20.0f)) {
            this.r = i4;
        } else {
            this.r = 0;
        }
        I();
        if (i2 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override
    public final void release() {
        if (this.R0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        E(false);
    }

    public final void s() {
        String str;
        boolean z;
        int i;
        if (this.x0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.x0.r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.B0 = null;
            TLObject tLObject = this.x0.q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.L = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z = tL_webViewResultUrl.same_origin;
                this.B0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z2 = this.G0;
                if (!z2) {
                    C(tL_webViewResultUrl.fullscreen, !z2, this.g0);
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
                z = false;
            }
            if (str != null && !this.G0) {
                ls6 d0 = ls6.d0(this.I);
                long j = this.x0.c;
                TLRPC.User X1 = d0.getMessagesController().X1(Long.valueOf(j));
                if (X1 != null && X1.bot) {
                    if (d0.getUserConfig().H != 0) {
                        i = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - d0.getUserConfig().H);
                    } else {
                        i = 60;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= d0.m1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) d0.m1.get(i2);
                        if (tL_topPeer2.peer.user_id == j) {
                            tL_topPeer = tL_topPeer2;
                            break;
                        }
                        i2++;
                    }
                    if (tL_topPeer == null) {
                        tL_topPeer = new TLRPC.TL_topPeer();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = j;
                        d0.m1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i / d0.getMessagesController().S2) + tL_topPeer.rating;
                    Collections.sort(d0.m1, new vk6((byte) 4));
                    if (d0.m1.size() > 20) {
                        qd4.v(1, d0.m1);
                    }
                    d0.getMessagesStorage().a.c(new dr6(d0, j, 2, tL_topPeer.rating));
                    d0.getNotificationCenter().k(jn7.V0, new Object[0]);
                }
                this.E.q(this.I, str, z);
            }
            hl.d3(this.v0, max);
            ow0 ow0Var = this.x;
            if (ow0Var != null) {
                ow0Var.setFullSize(p());
            }
        }
    }

    @Override
    public final void show() {
        if (!hl.K1(getContext())) {
            return;
        }
        E(true);
        ww0 ww0Var = this.f;
        ww0Var.setAlpha(0.0f);
        ww0Var.addOnLayoutChangeListener(new jw0(this, (byte) 0));
        super.show();
        this.R0 = false;
        b1.add(this);
    }

    public final void t(boolean z) {
        if (this.E0 == z) {
            return;
        }
        this.E0 = z;
        if (this.a1) {
            int i = d1;
            if (z) {
                d1 = i + 1;
            } else {
                d1 = i - 1;
            }
        }
        if (d1 > 0) {
            hl.d2(n());
        } else {
            hl.K3(n());
        }
    }

    public final boolean v() {
        String str;
        if (this.t0) {
            TLRPC.User X1 = uc7.s1(this.I).X1(Long.valueOf(this.J));
            if (X1 != null) {
                str = lv2.m(0, X1.first_name, X1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            id idVar = alertDialog$Builder.a;
            idVar.S = str;
            idVar.U = ob6.M0(2131752898, null);
            alertDialog$Builder.j(ob6.M0(2131752897, null), new xv0(this));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.show();
            ((TextView) idVar.c(-1)).setTextColor(aob.v0(aob.q7, this.G));
            return false;
        }
        m(false);
        return true;
    }

    public final void w() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw0.w():void");
    }

    public final void x(e eVar, gzc gzcVar) {
        boolean z;
        TLRPC.User X1;
        CharSequence charSequence;
        TLRPC.UserFull Y1;
        TLRPC.User user;
        s6 s6Var;
        uw0 uw0Var;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        s6 s6Var2;
        boolean z2;
        boolean z3;
        TLRPC.InputPeer n1;
        TLRPC.InputPeer j1;
        boolean z4;
        boolean z5;
        TL_bots.botAppSettings botappsettings;
        String r;
        boolean z6;
        this.x0 = gzcVar;
        int i = gzcVar.a;
        this.I = i;
        this.K = gzcVar.b;
        this.J = gzcVar.c;
        this.M = gzcVar.h;
        this.N = gzcVar.i;
        String str = gzcVar.e;
        this.O = str;
        if (gzcVar.g == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            X1 = null;
            charSequence = str;
        } else {
            X1 = uc7.s1(i).X1(Long.valueOf(this.J));
            charSequence = lbc.r(X1);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(hl.L(20.0f));
            charSequence = pv3.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        uw0 uw0Var2 = this.Y;
        uw0Var2.setTitle(charSequence);
        if (z) {
            Y1 = null;
        } else {
            Y1 = uc7.s1(this.I).Y1(this.J);
        }
        vnb vnbVar = this.G;
        if ((X1 != null && X1.verified) || (Y1 != null && (user = Y1.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232817).mutate();
            yob.x(uw0Var2.getTitleTextView(), this.N0, aob.Fi, vnbVar, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            uw0Var2.getTitleTextView().setDrawablePadding(hl.L(2.0f));
            uw0Var2.getTitleTextView().i(new g6(this, (byte) 1));
        }
        yp0 yp0Var = this.o0;
        if (yp0Var != null) {
            if (z) {
                r = gzcVar.e;
            } else {
                r = lbc.r(X1);
            }
            if (X1 != null && X1.verified) {
                z6 = true;
            } else {
                z6 = false;
            }
            yp0Var.U = new pkb(r, 13.0f, hl.o());
            if (!z6) {
                yp0Var.V = null;
                yp0Var.W = null;
            } else {
                yp0Var.V = yp0Var.getContext().getResources().getDrawable(2131232815).mutate();
                yp0Var.W = yp0Var.getContext().getResources().getDrawable(2131232816).mutate();
            }
        }
        s6 u = uw0Var2.u();
        u.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(this.I).b.bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                i2++;
                tL_attachMenuBot = tL_attachMenuBot2;
                s6Var = u;
                uw0Var = uw0Var2;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
                u = s6Var;
                uw0Var2 = uw0Var;
            } else {
                s6Var = u;
                uw0Var = uw0Var2;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.G0 && !z) {
            if (Y1 != null) {
                TL_bots.BotInfo botInfo = Y1.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    z4 = false;
                    g(botappsettings, false);
                } else {
                    z4 = false;
                }
                z5 = true;
            } else {
                z4 = false;
                z5 = true;
                uc7.s1(this.I).f3(X1, 0, true, new zv0(this, (byte) 1));
            }
            if (gzcVar.p) {
                C(z5, z4, this.g0);
            }
        }
        if (this.M0 == null) {
            s6Var2 = s6Var;
            s6Var2.a(2131296494, 2131230871);
        } else {
            s6Var2 = s6Var;
        }
        xp0 xp0Var = new xp0(getContext());
        this.c0 = xp0Var;
        s7 d = s6Var2.d(0, xp0Var);
        this.b0 = d;
        d.setOnClickListener(new bw0(this, (byte) 1));
        uw0Var.setActionBarMenuOnItemClick(new hw0(this, (byte) 0));
        JSONObject u2 = u(vnbVar, false);
        pw0 pw0Var = this.E;
        pw0Var.setBotUser(X1);
        if (!z) {
            pw0Var.p(this.I, this.J);
            TLRPC.User user2 = gzcVar.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ls6.d0(this.I);
                if (!ls6.B0(ls6.f2 ? 1 : 0, this.J)) {
                    if (user2 == null) {
                        user2 = uc7.s1(this.I).X1(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        xb4.G(this.I);
                        if (!xb4.J(user2.photo.photo_small, null, true, true).exists()) {
                            ls6.d0(this.I).m1(jn5.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (gzcVar.q != null) {
            s();
            return;
        }
        int i3 = gzcVar.g;
        int i4 = jn7.z1;
        switch (i3) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = uc7.s1(this.I).j1(this.K);
                tL_messages_requestWebView.bot = uc7.s1(this.I).o1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = gzcVar.o;
                tL_messages_requestWebView.fullscreen = gzcVar.p;
                String str2 = gzcVar.f;
                if (str2 != null) {
                    tL_messages_requestWebView.url = str2;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    r7a.B(this.I);
                    int i5 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i5;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = uc7.s1(this.I).j1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = uc7.s1(this.I).j1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u2.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new tv0(this, (byte) 4));
                jn7.f(this.I).b(this, i4);
                return;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((gzcVar.n & 1) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z2;
                tL_messages_requestSimpleWebView.bot = uc7.s1(this.I).o1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((gzcVar.n & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z3;
                tL_messages_requestSimpleWebView.compact = gzcVar.o;
                tL_messages_requestSimpleWebView.fullscreen = gzcVar.p;
                if (u2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u2.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(gzcVar.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = gzcVar.f;
                }
                if (!TextUtils.isEmpty(gzcVar.l)) {
                    tL_messages_requestSimpleWebView.start_param = gzcVar.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new tv0(this, (byte) 3));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = uc7.s1(this.I).o1(this.J);
                tL_messages_requestWebView2.peer = uc7.s1(this.I).j1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = gzcVar.o;
                tL_messages_requestWebView2.fullscreen = gzcVar.p;
                tL_messages_requestWebView2.url = gzcVar.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u2.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new tv0(this, (byte) 2));
                jn7.f(this.I).b(this, i4);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = gzcVar.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = gzcVar.k;
                tL_messages_requestAppWebView.platform = "android";
                if (eVar instanceof zu1) {
                    zu1 zu1Var = (zu1) eVar;
                    if (zu1Var.h() != null) {
                        n1 = uc7.n1(zu1Var.h());
                    } else {
                        n1 = uc7.l1(zu1Var.e);
                    }
                } else {
                    n1 = uc7.n1(gzcVar.m);
                }
                tL_messages_requestAppWebView.peer = n1;
                tL_messages_requestAppWebView.compact = gzcVar.o;
                tL_messages_requestAppWebView.fullscreen = gzcVar.p;
                if (!TextUtils.isEmpty(gzcVar.l)) {
                    tL_messages_requestAppWebView.start_param = gzcVar.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u2.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new tv0(this, (byte) 5), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = uc7.s1(this.I).o1(gzcVar.c);
                tL_messages_requestMainWebView.platform = "android";
                if (eVar instanceof zu1) {
                    zu1 zu1Var2 = (zu1) eVar;
                    if (zu1Var2.h() != null) {
                        j1 = uc7.n1(zu1Var2.h());
                    } else {
                        j1 = uc7.l1(zu1Var2.e);
                    }
                } else {
                    j1 = uc7.s1(this.I).j1(gzcVar.b);
                }
                tL_messages_requestMainWebView.peer = j1;
                tL_messages_requestMainWebView.compact = gzcVar.o;
                tL_messages_requestMainWebView.fullscreen = gzcVar.p;
                if (!TextUtils.isEmpty(gzcVar.l)) {
                    tL_messages_requestMainWebView.start_param = gzcVar.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u2.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new tv0(this, (byte) 0), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = gzcVar.d;
                if (u2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u2.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new ic((byte) 0), new c(this, (byte) 19), 66);
                return;
            case 6:
                if (!this.G0) {
                    pw0Var.q(this.I, gzcVar.f, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void y(final int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        final int i3 = this.S;
        aob.a(0.35f, -0.1f, i);
        final sv0 sv0Var = new sv0();
        int i4 = 0;
        if (this.W) {
            i2 = this.S;
        } else {
            i2 = 0;
        }
        SparseIntArray sparseIntArray = sv0Var.a;
        vnb vnbVar = this.G;
        sv0Var.c(sparseIntArray, i2, vnbVar);
        this.W = z;
        if (vm2.h(i) < 0.7210000157356262d) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.U = z3;
        if (this.W) {
            i4 = i;
        }
        sv0Var.c(sv0Var.b, i4, vnbVar);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(k43.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f = vm2.f(floatValue, i3, i);
                    xw0 xw0Var = xw0.this;
                    xw0Var.S = f;
                    xw0Var.h();
                    ww0 ww0Var = xw0Var.f;
                    ww0Var.invalidate();
                    uw0 uw0Var = xw0Var.Y;
                    uw0Var.setBackgroundColor(xw0Var.S);
                    sv0 sv0Var2 = sv0Var;
                    sv0Var2.b(uw0Var, floatValue);
                    xw0Var.a = sv0Var2.a(aob.zj);
                    ww0Var.invalidate();
                }
            });
            duration.addListener(new nw0(this, i3, i, sv0Var));
            duration.start();
        } else {
            this.S = i;
            h();
            ww0 ww0Var = this.f;
            ww0Var.invalidate();
            int i5 = this.S;
            uw0 uw0Var = this.Y;
            uw0Var.setBackgroundColor(i5);
            sv0Var.b(uw0Var, 1.0f);
            this.a = sv0Var.a(aob.zj);
            ww0Var.invalidate();
        }
        J();
    }

    public final void z(boolean z) {
        if (this.a1 == z) {
            return;
        }
        this.a1 = z;
        boolean z2 = this.E0;
        if (z) {
            if (z2) {
                d1++;
            }
        } else if (z2) {
            d1--;
        }
        if (d1 > 0) {
            hl.d2(n());
        } else {
            hl.K3(n());
        }
    }

    @Override
    public final void b(boolean z) {
    }
}
