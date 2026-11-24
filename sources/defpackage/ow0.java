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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ow0 extends Dialog implements gk7, vx0 {
    public static final HashSet b1 = new HashSet();
    public static final gia c1;
    public static int d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public or0 D0;
    public final gw0 E;
    public boolean E0;
    public final mw0 F;
    public px0 F0;
    public final wjb G;
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
    public ikb M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public cs5 P0;
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
    public final lw0 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public cw Z0;
    public int a;
    public final Drawable a0;
    public boolean a1;
    public int b;
    public r7 b0;
    public float c;
    public xp0 c0;
    public yla d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final nw0 f;
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
    public final kw0 n0;
    public final yp0 o0;
    public m21 p0;
    public kp0 q0;
    public int r;
    public final FrameLayout r0;
    public final qx0 s;
    public final FrameLayout.LayoutParams s0;
    public boolean t0;
    public final yv7 u0;
    public final lv0 v0;
    public final gl2 w;
    public int w0;
    public final fw0 x;
    public quc x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        gia giaVar = new gia(new qm0((byte) 7), new qm0((byte) 8));
        giaVar.c = 100.0f;
        c1 = giaVar;
        d1 = 0;
    }

    public ow0(Context context, wjb wjbVar) {
        super(context, 2131755352);
        boolean z;
        Object obj;
        qx0 qx0Var;
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
        this.v0 = new lv0(this, (byte) 1);
        this.w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.a1 = false;
        this.G = wjbVar;
        int w0 = bkb.w0(null, bkb.yj, false);
        this.b = w0;
        this.a = w0;
        fw0 fw0Var = new fw0((byte) 0, context, this);
        this.x = fw0Var;
        fw0Var.setAllowFullSizeSwipe(true);
        fw0Var.setShouldWaitWebViewScroll(true);
        int i = bkb.c6;
        gw0 gw0Var = new gw0(this, context, wjbVar, bkb.v0(i, wjbVar), (byte) 0);
        this.E = gw0Var;
        gw0Var.setOnVerifiedAge(this.M0);
        gw0Var.setDelegate(new jw0(this, context, wjbVar));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gl.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = bkb.v0(i, wjbVar);
        int v0 = bkb.v0(bkb.Z6, wjbVar);
        this.T = v0;
        gl.p3(this, v0, false, null);
        nw0 nw0Var = new nw0(this, context);
        this.f = nw0Var;
        nw0Var.setDelegate(new ov0(this, (byte) 0));
        FrameLayout.LayoutParams e = nme.e(-1, -1, 49);
        this.y = e;
        nw0Var.addView(fw0Var, e);
        kw0 kw0Var = new kw0(this, getContext(), wjbVar);
        this.n0 = kw0Var;
        kw0Var.setOnButtonClickListener(new pv0(this, (byte) 0));
        kw0Var.setOnResizeListener(new lv0(this, (byte) 3));
        nw0Var.addView(kw0Var, nme.e(-1, -2, 81));
        yp0 yp0Var = new yp0(getContext());
        this.o0 = yp0Var;
        yp0Var.setAlpha(0.0f);
        yp0Var.setVisibility(8);
        if (!na7.q1(this.I).k4.F1.f && gba.o() >= 2) {
            z = true;
        } else {
            z = false;
        }
        this.g0 = z;
        if (z) {
            obj = fw0Var.getRenderNode();
        } else {
            obj = null;
        }
        yp0Var.setParentRenderNode(obj);
        nw0Var.addView(yp0Var, nme.e(-1, -1, 119));
        yp0Var.setOnCloseClickListener(new lv0(this, (byte) 4));
        yp0Var.setOnCollapseClickListener(new lv0(this, (byte) 5));
        yp0Var.setOnMenuClickListener(new lv0(this, (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        FrameLayout.LayoutParams e2 = nme.e(-1, 200, 55);
        this.s0 = e2;
        nw0Var.addView(frameLayout, e2);
        this.a0 = getContext().getDrawable(2131231240).mutate();
        ?? aVar = new a(context, wjbVar);
        this.Y = aVar;
        aVar.setBackgroundColor(0);
        aVar.setBackButtonImage(2131231272);
        F();
        aVar.setActionBarMenuOnItemClick(new yv0(this, (byte) 1));
        aVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e3 = nme.e(-1, -2, 49);
        this.Z = e3;
        nw0Var.addView((View) aVar, e3);
        ?? m12Var = new m12(context, wjbVar);
        this.F = m12Var;
        nw0Var.addView((View) m12Var, nme.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        gw0Var.setWebViewProgressListener(new gw(this, (byte) 1));
        fw0Var.addView(gw0Var, nme.c(-1.0f, -1));
        fw0Var.setScrollListener(new lv0(this, (byte) 7));
        fw0Var.setScrollEndListener(new lv0(this, (byte) 8));
        fw0Var.setDelegate(new mv0(this));
        fw0Var.setIsKeyboardVisible(new mv0(this));
        yv7 yv7Var = new yv7(context);
        this.u0 = yv7Var;
        nw0Var.addView(yv7Var, nme.c(-1.0f, -1));
        setContentView(nw0Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            qx0Var = launchActivity.O();
        } else {
            qx0Var = null;
        }
        this.s = qx0Var;
        if (qx0Var != null) {
            nv0 nv0Var = new nv0(nw0Var, (byte) 0);
            lv0 lv0Var = new lv0(this, (byte) 2);
            qx0Var.J.add(nv0Var);
            qx0Var.K.add(lv0Var);
            this.w = new gl2(qx0Var);
        }
    }

    public static void f(ow0 ow0Var) {
        super.dismiss();
    }

    public static void l(int i, long j, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(i).b.bots;
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
        String a0 = k96.a0(null, null, 2131752990, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = k96.M0(2131752989, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.T2(a0);
        alertDialog$Builder.j(k96.M0(2131747638, null), new bf(i, j, tL_attachMenuBot, runnable));
        ug8.y(null, 2131752577, alertDialog$Builder, null);
    }

    public static JSONObject u(wjb wjbVar, final boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = bkb.v(-16777216, bkb.v0(bkb.g5, wjbVar));
            q8c q8cVar = new q8c() {
                @Override
                public final Object a(Object obj) {
                    int v2 = bkb.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v2);
                    if (z) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v2)), Integer.valueOf(Color.green(v2)), Integer.valueOf(Color.blue(v2)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", q8cVar.a(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.c6, wjbVar))));
            int i = bkb.Z6;
            jSONObject.put("secondary_bg_color", q8cVar.a(Integer.valueOf(bkb.v0(i, wjbVar))));
            jSONObject.put("text_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.F6, wjbVar))));
            jSONObject.put("hint_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.G6, wjbVar))));
            jSONObject.put("link_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.I6, wjbVar))));
            jSONObject.put("button_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.Ei, wjbVar))));
            jSONObject.put("button_text_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.Ii, wjbVar))));
            jSONObject.put("header_bg_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.r8, wjbVar))));
            jSONObject.put("accent_text_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.p6, wjbVar))));
            jSONObject.put("section_header_text_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.K6, wjbVar))));
            jSONObject.put("subtitle_text_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.y6, wjbVar))));
            jSONObject.put("destructive_text_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.o7, wjbVar))));
            jSONObject.put("section_separator_color", q8cVar.a(Integer.valueOf(bkb.v0(bkb.c7, wjbVar))));
            jSONObject.put("bottom_bar_bg_color", q8cVar.a(Integer.valueOf(bkb.v0(i, wjbVar))));
            return jSONObject;
        } catch (Exception e) {
            fa4.g(e, true);
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
            duration.setInterpolator(s33.f);
            this.U0.addUpdateListener(new jv0(this, color, i, (byte) 0));
            this.U0.addListener(new cn(this, i, (byte) 1));
            this.U0.start();
            return;
        }
        paint.setColor(i);
        F();
        this.f.invalidate();
        cw cwVar = this.Z0;
        if (cwVar != null) {
            if (gl.B(paint.getColor()) > 0.721f) {
                z2 = false;
            }
            cwVar.b(z2, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            fw0 fw0Var = this.x;
            if (fw0Var != null) {
                fw0Var.setFullSize(p());
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
        if (z3 && !na7.q1(this.I).k4.F1.f && gba.o() >= 2) {
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
            oz ozVar = yp0Var.b0;
            gl.r(ozVar);
            yp0Var.N = z;
            if (!z2) {
                yp0Var.O.f(z, true);
            }
            yp0Var.invalidate();
            if (z) {
                gl.e3(ozVar, 2500L);
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
            if (gl.O1() && !gl.E && !gl.N1()) {
                int i2 = gl.q.x;
                f2 = (i2 - ((int) (Math.min(i2, point.y) * 0.8f))) / 2.0f;
            } else {
                f2 = 0.0f;
            }
            int i3 = this.n.left;
            if (z) {
                f3 = i3 + f2;
                f4 = this.x.getTranslationY();
                currentActionBarHeight = -gl.L(24.0f);
            } else {
                f3 = (-i3) - f2;
                f2 = -f2;
                f4 = -gl.L(24.0f);
                currentActionBarHeight = (a.getCurrentActionBarHeight() + gl.m) - gl.L(24.0f);
            }
            float f6 = currentActionBarHeight;
            float currentActionBarHeight2 = a.getCurrentActionBarHeight() + gl.m;
            fw0 fw0Var = this.x;
            yla ylaVar = fw0Var.w;
            if (ylaVar != null) {
                ylaVar.d();
            }
            yla ylaVar2 = fw0Var.H;
            if (ylaVar2 != null) {
                ylaVar2.d();
            }
            this.x.setSwipeOffsetAnimationDisallowed(true);
            this.Y.setVisibility(0);
            fw0 fw0Var2 = this.x;
            if (z) {
                fw0Var2.setTopActionBarOffsetY(-gl.L(24.0f));
            } else {
                fw0Var2.setTopActionBarOffsetY(currentActionBarHeight2 - gl.L(24.0f));
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
            this.x.setTranslationY(gl.R1(f4, f6, this.i0));
            this.x.setTranslationX(gl.R1(f3, 0.0f, this.i0));
            this.n0.setTranslationX(gl.R1(f2, 0.0f, this.i0));
            this.o0.setAlpha(this.h0);
            this.f.invalidate();
            this.E.setViewPortHeightOffset(this.x.getTranslationY() - f6);
            this.E.l(false, false);
            this.j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f7 = f3;
            ofFloat.addUpdateListener(new bw0(this, z, f4, f6, f7, f2));
            this.W0.addListener(new cw0(this, z, currentActionBarHeight2, f7));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(s33.h);
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
        lw0 lw0Var = this.Y;
        if (z) {
            i = 8;
        }
        lw0Var.setVisibility(i);
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
        kw0 kw0Var = this.n0;
        Paint paint = kw0Var.a;
        kw0Var.e.b = i;
        paint.setColor(i);
        if (!z) {
            kw0Var.d.a(i, true);
            this.T = i;
            h();
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(s33.f);
            duration.addUpdateListener(new jv0(this, i2, i, (byte) 1));
            duration.addListener(new dw0(this, i2, i, (byte) 0));
            duration.start();
        }
        gl.p3(this, this.T, false, null);
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
        ofFloat.addListener(new y7((byte) 8, this, z));
        this.T0.addUpdateListener(new kv0(this, (byte) 0));
        this.T0.setInterpolator(s33.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i = bkb.F6;
            wjb wjbVar = this.G;
            int v0 = bkb.v0(i, wjbVar);
            lw0 lw0Var = this.Y;
            lw0Var.setTitleColor(v0);
            lw0Var.H(bkb.v0(i, wjbVar), false);
            lw0Var.G(bkb.v0(bkb.t8, wjbVar), false);
            lw0Var.I(bkb.v0(bkb.F8, wjbVar), false);
            lw0Var.J(bkb.v0(bkb.D8, wjbVar), false, false);
            lw0Var.J(bkb.v0(bkb.E8, wjbVar), true, false);
            lw0Var.K(bkb.v0(bkb.H5, wjbVar), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        m21 m21Var;
        boolean z;
        mp0 c = mp0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c.e;
        lp0 lp0Var = c.f;
        boolean z2 = true;
        if (lp0Var == null) {
            m21 m21Var2 = this.p0;
            if (m21Var2 != null) {
                m21Var2.b();
                this.p0 = null;
            }
        } else if ((lp0Var.c() && !lp0Var.l) || lp0Var.k) {
            if (this.Q0 != lp0Var && (m21Var = this.p0) != null) {
                m21Var.b();
                this.p0 = null;
            }
            m21 m21Var3 = this.p0;
            if (m21Var3 == null || !m21Var3.l) {
                this.Q0 = lp0Var;
                kp0 kp0Var = new kp0(getContext(), this.G);
                this.q0 = kp0Var;
                m21 f = m21.f(this.r0, kp0Var, 5000);
                this.p0 = f;
                f.k(true);
            }
            if (this.q0.c(lp0Var)) {
                this.p0 = null;
            }
            lp0Var.k = false;
            lp0Var.l = true;
        } else {
            kp0 kp0Var2 = this.q0;
            if (kp0Var2 != null) {
                this.Q0 = lp0Var;
                if (kp0Var2.c(lp0Var)) {
                    this.p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            a8 a8Var = (a8) entry.getValue();
            lp0 lp0Var2 = (lp0) entry.getKey();
            a8Var.setText(lp0Var2.c);
            if (!lp0Var2.c()) {
                a8Var.setSubtext(gl.i0(lp0Var2.g, false, false));
            } else {
                Pair b = lp0Var2.b();
                int i = (((Long) b.second).longValue() > 0L ? 1 : (((Long) b.second).longValue() == 0L ? 0 : -1));
                Object obj = b.first;
                if (i > 0) {
                    a8Var.setSubtext(gl.i0(((Long) obj).longValue(), false, false) + " / " + gl.i0(((Long) b.second).longValue(), false, false));
                } else {
                    a8Var.setSubtext(gl.i0(((Long) obj).longValue(), false, false));
                }
            }
            if (lp0Var2.c()) {
                a8Var.setRightIcon(2131232101);
                a8Var.b.setPadding(0, 0, gl.L(32.0f), 0);
            } else if (lp0Var2.i) {
                a8Var.setVisibility(8);
            } else {
                a8Var.setRightIcon(0);
                a8Var.b.setPadding(0, 0, 0, 0);
            }
            a8Var.setOnClickListener(new t(this, lp0Var2, (byte) 25));
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
            kp0Var.setArrow(gl.U1(this.h0, gl.L(24.0f), gl.L(26.0f)));
        } else if (this.c > 0.5f) {
            kp0Var.setArrow(gl.L(24.0f));
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
        gw0 gw0Var = this.E;
        nw0 nw0Var = this.f;
        kw0 kw0Var = this.n0;
        int i7 = 0;
        if (z) {
            if (kw0Var != null && kw0Var.getTotalHeight() > 0) {
                i5 = rect.bottom;
            } else {
                i5 = 0;
            }
            int i8 = rect.left;
            int i9 = rect.top;
            int i10 = rect.right;
            if (this.r > i5 || (kw0Var != null && kw0Var.getTotalHeight() > 0)) {
                i6 = 0;
            } else {
                i6 = rect.bottom;
            }
            Rect rect2 = new Rect(i8, i9, i10, i6);
            int L = gl.L(46.0f);
            gw0Var.N(rect2, false);
            gw0Var.M(L, false);
            nw0Var.setPadding(0, 0, 0, Math.max(this.r, i5));
        } else {
            gw0Var.N(new Rect(0, 0, 0, 0), false);
            gw0Var.M(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.r;
            qx0 qx0Var = this.s;
            if (qx0Var != null) {
                i = qx0Var.I;
            } else {
                i = 0;
            }
            nw0Var.setPadding(i11, 0, i12, Math.max(i13, i + rect.bottom));
        }
        this.y.topMargin = gl.L(24.0f);
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
        fw0 fw0Var = this.x;
        if (!z3) {
            fw0Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f0) {
                fw0Var.setTopActionBarOffsetY(-gl.L(24.0f));
            } else {
                fw0Var.setTopActionBarOffsetY((a.getCurrentActionBarHeight() + gl.m) - gl.L(24.0f));
            }
            fw0Var.setSwipeOffsetAnimationDisallowed(false);
            fw0Var.c();
            fw0Var.invalidate();
            fw0Var.requestLayout();
        }
        if (fw0Var != null) {
            fw0Var.setFullSize(p());
        }
        kw0Var.requestLayout();
        nw0Var.requestLayout();
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
            z = (gl.O1() || bm2.h(bkb.w0(null, bkb.c6, true)) < 0.7210000157356262d || this.c < 0.85f) ? false : false;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.e = Boolean.valueOf(z);
        nw0 nw0Var = this.f;
        int systemUiVisibility = nw0Var.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        nw0Var.setSystemUiVisibility(i);
    }

    public final void K() {
        cv0 webView;
        gw0 gw0Var = this.E;
        if (gw0Var == null || (webView = gw0Var.getWebView()) == null) {
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
            nw0 nw0Var = this.f;
            if (z) {
                attributes.flags |= i;
                kw0 kw0Var = this.n0;
                if ((kw0Var == null || kw0Var.getTotalHeight() <= 0) && !nw0Var.n0) {
                    nw0Var.setSystemUiVisibility(nw0Var.getSystemUiVisibility() | 2);
                    window.setAttributes(attributes);
                }
            } else {
                attributes.flags &= ~i;
            }
            nw0Var.setSystemUiVisibility(nw0Var.getSystemUiVisibility() & (-3));
            window.setAttributes(attributes);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void a(boolean z) {
        m(false);
    }

    @Override
    public final px0 c() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean booleanValue;
        float f;
        px0 px0Var = new px0();
        px0Var.q = this.S;
        px0Var.p = this.w0;
        px0Var.n = this.W;
        px0Var.o = this.X;
        px0Var.r = this.R.getColor();
        px0Var.a = this.x0;
        boolean z4 = false;
        gw0 gw0Var = this.E;
        if (gw0Var != null && gw0Var.O) {
            z = true;
        } else {
            z = false;
        }
        px0Var.t = z;
        px0Var.D = bkb.I.o();
        cv0 cv0Var = null;
        if (gw0Var != null) {
            str = gw0Var.getUrlLoaded();
        } else {
            str = null;
        }
        px0Var.x = str;
        if (gw0Var != null && gw0Var.u0) {
            z2 = true;
        } else {
            z2 = false;
        }
        px0Var.e = z2;
        if (gw0Var != null) {
            str2 = gw0Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        px0Var.f = str2;
        fw0 fw0Var = this.x;
        if ((fw0Var == null || fw0Var.getSwipeOffsetY() >= 0.0f) && !this.z0 && !p() && !this.f0) {
            z3 = false;
        } else {
            z3 = true;
        }
        px0Var.j = z3;
        px0Var.z = this.f0;
        px0Var.A = this.g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        px0Var.B = booleanValue;
        if (fw0Var != null) {
            f = fw0Var.getOffsetY();
        } else {
            f = Float.MAX_VALUE;
        }
        px0Var.k = f;
        px0Var.C = this.C0;
        px0Var.u = this.y0;
        px0Var.y = this.t0;
        px0Var.v = this.d0;
        if (fw0Var == null || fw0Var.N) {
            z4 = true;
        }
        px0Var.l = z4;
        px0Var.w = this.n0.e;
        px0Var.s = this.T;
        or0 or0Var = this.D0;
        if (or0Var != null) {
            or0Var.b();
        }
        px0Var.K = this.D0;
        if (gw0Var != null) {
            cv0Var = gw0Var.getWebView();
        }
        if (cv0Var != null) {
            gw0Var.J();
            px0Var.b = cv0Var;
            px0Var.d = gw0Var.getBotProxy();
            px0Var.g = cv0Var.getWidth();
            px0Var.h = cv0Var.getHeight();
            cv0Var.onPause();
        }
        boolean z5 = this.X0;
        px0Var.G = z5;
        if (z5) {
            px0Var.H = this.Y0;
        }
        px0Var.L = this.E0;
        this.F0 = px0Var;
        return px0Var;
    }

    @Override
    public final wx0 mo23d() {
        return this.f;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.y1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                m(false);
            }
        } else if (i == kk7.p4) {
            this.f.invalidate();
            this.E.n.b(bkb.v0(bkb.c6, this.G), 153);
            F();
            J();
        } else if (i == kk7.L3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        m(false);
    }

    @Override
    public final int e(int i) {
        return bm2.f(this.S0, i, this.T);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        if (botappsettings != null) {
            boolean o = bkb.I.o();
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
        nw0 nw0Var = this.f;
        if (nw0Var != null) {
            nw0Var.invalidate();
        }
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final void j() {
        if (this.Z0 == null) {
            cw cwVar = new cw(getContext());
            this.Z0 = cwVar;
            this.x.addView(cwVar, nme.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new rv0(this, (byte) 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            gl.U3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    @Override
    public final boolean k(lx0 lx0Var) {
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
        gl.r(this.v0);
        kk7.f(this.I).n(this, kk7.y1);
        kk7.f(this.I).n(this, kk7.L3);
        kk7.e().n(this, kk7.p4);
        if (z && ((launchActivity = LaunchActivity.H1) == null || launchActivity.x0 == null)) {
            z = false;
        }
        if (z) {
            yla ylaVar = this.d;
            if (ylaVar != null) {
                ylaVar.m.i = 0.0d;
                ylaVar.h();
            }
            LaunchActivity.H1.x0.b(this);
        } else {
            kw0 kw0Var = this.n0;
            if (kw0Var != null) {
                kw0Var.animate().translationY(kw0Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(s33.h).start();
            }
            this.E.f();
            fw0 fw0Var = this.x;
            int height = fw0Var.getHeight();
            if (kw0Var != null) {
                i = kw0Var.getTotalHeight();
            } else {
                i = 0;
            }
            int i3 = height + i;
            Rect rect = this.n;
            int Q = this.f.Q() + i3 + rect.top + rect.bottom;
            if (p()) {
                i2 = gl.L(200.0f);
            } else {
                i2 = 0;
            }
            fw0Var.e(Q + i2, true, new lv0(this, (byte) 0));
        }
        b1.remove(this);
    }

    public final Activity n() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        if (ownerActivity == null) {
            return gl.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean o() {
        quc qucVar = this.x0;
        if (qucVar != null && qucVar.g == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            yla ylaVar = new yla(this, c1);
            zla zlaVar = new zla();
            zlaVar.b(1200.0f);
            zlaVar.a(1.0f);
            ylaVar.m = zlaVar;
            this.d = ylaVar;
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
        kw0 kw0Var;
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
        nw0 nw0Var = this.f;
        nw0Var.setFitsSystemWindows(true);
        nw0Var.setSystemUiVisibility(1792);
        nw0Var.setOnApplyWindowInsetsListener(new qv0(this, (byte) 0));
        if (this.f0 && ((kw0Var = this.n0) == null || kw0Var.getTotalHeight() <= 0)) {
            nw0Var.setSystemUiVisibility(nw0Var.getSystemUiVisibility() | 2);
        } else {
            nw0Var.setSystemUiVisibility(nw0Var.getSystemUiVisibility() & (-3));
        }
        if (i >= 26) {
            if (bm2.h(this.T) < 0.7210000157356262d) {
                z = false;
            }
            gl.j3(this, z);
        }
        kk7.e().b(this, kk7.p4);
        kk7.f(this.I).b(this, kk7.L3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        yla ylaVar = this.d;
        if (ylaVar != null) {
            ylaVar.d();
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
        sxc sxcVar = vxc.h(view, windowInsets).a;
        io5 f = sxcVar.f(2);
        this.h.set(f.a, f.b, f.c, f.d);
        io5 f2 = sxcVar.f(647);
        int max = Math.max(f2.a, windowInsets.getStableInsetLeft());
        int max2 = Math.max(f2.b, windowInsets.getStableInsetTop());
        int max3 = Math.max(f2.c, windowInsets.getStableInsetRight());
        int max4 = Math.max(f2.d, windowInsets.getStableInsetBottom());
        Rect rect = this.n;
        rect.set(max, max2, max3, max4);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            Activity W = gl.W(getContext());
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
            Typeface typeface = gl.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            rect.top = Math.max(i3, i);
        }
        int i4 = sxcVar.f(8).d;
        if (i4 > rect.bottom && i4 > gl.L(20.0f)) {
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
            fa4.g(e, true);
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
                hq6 d0 = hq6.d0(this.I);
                long j = this.x0.c;
                TLRPC.User V1 = d0.getMessagesController().V1(Long.valueOf(j));
                if (V1 != null && V1.bot) {
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
                    Collections.sort(d0.m1, new el6((byte) 4));
                    if (d0.m1.size() > 20) {
                        tb4.v(1, d0.m1);
                    }
                    d0.getMessagesStorage().a.c(new po6(d0, j, 2, tL_topPeer.rating));
                    d0.getNotificationCenter().k(kk7.U0, new Object[0]);
                }
                this.E.q(this.I, str, z);
            }
            gl.e3(this.v0, max);
            fw0 fw0Var = this.x;
            if (fw0Var != null) {
                fw0Var.setFullSize(p());
            }
        }
    }

    @Override
    public final void show() {
        if (!gl.K1(getContext())) {
            return;
        }
        E(true);
        nw0 nw0Var = this.f;
        nw0Var.setAlpha(0.0f);
        nw0Var.addOnLayoutChangeListener(new aw0(this, (byte) 0));
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
            gl.d2(n());
        } else {
            gl.L3(n());
        }
    }

    public final boolean v() {
        String str;
        if (this.t0) {
            TLRPC.User V1 = na7.q1(this.I).V1(Long.valueOf(this.J));
            if (V1 != null) {
                str = qu2.m(0, V1.first_name, V1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = str;
            hdVar.U = k96.M0(2131752905, null);
            alertDialog$Builder.j(k96.M0(2131752904, null), new mv0(this));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.show();
            ((TextView) hdVar.c(-1)).setTextColor(bkb.v0(bkb.p7, this.G));
            return false;
        }
        m(false);
        return true;
    }

    public final void w() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow0.w():void");
    }

    public final void x(d dVar, quc qucVar) {
        TLRPC.User V1;
        CharSequence charSequence;
        TLRPC.User user;
        r6 r6Var;
        lw0 lw0Var;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        r6 r6Var2;
        TLRPC.InputPeer l1;
        TLRPC.InputPeer h1;
        boolean z;
        boolean z2;
        TL_bots.botAppSettings botappsettings;
        this.x0 = qucVar;
        int i = qucVar.a;
        this.I = i;
        this.K = qucVar.b;
        this.J = qucVar.c;
        this.M = qucVar.h;
        this.N = qucVar.i;
        String str = qucVar.e;
        this.O = str;
        boolean z3 = qucVar.g == 6;
        if (z3) {
            V1 = null;
            charSequence = str;
        } else {
            V1 = na7.q1(i).V1(Long.valueOf(this.J));
            charSequence = l7c.q(V1);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gl.L(20.0f));
            charSequence = vu3.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        lw0 lw0Var2 = this.Y;
        lw0Var2.setTitle(charSequence);
        TLRPC.UserFull W1 = z3 ? null : na7.q1(this.I).W1(this.J);
        wjb wjbVar = this.G;
        if ((V1 != null && V1.verified) || (W1 != null && (user = W1.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232798).mutate();
            zkb.x(lw0Var2.getTitleTextView(), this.N0, bkb.Ei, wjbVar, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            lw0Var2.getTitleTextView().setDrawablePadding(gl.L(2.0f));
            lw0Var2.getTitleTextView().i(new f6(this, (byte) 1));
        }
        yp0 yp0Var = this.o0;
        if (yp0Var != null) {
            String q = z3 ? qucVar.e : l7c.q(V1);
            boolean z4 = V1 != null && V1.verified;
            yp0Var.U = new tgb(q, 13.0f, gl.o());
            if (!z4) {
                yp0Var.V = null;
                yp0Var.W = null;
            } else {
                yp0Var.V = yp0Var.getContext().getResources().getDrawable(2131232796).mutate();
                yp0Var.W = yp0Var.getContext().getResources().getDrawable(2131232797).mutate();
            }
        }
        r6 t = lw0Var2.t();
        t.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.I).b.bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                r6Var = t;
                lw0Var = lw0Var2;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
            i2++;
            tL_attachMenuBot = tL_attachMenuBot2;
            r6Var = t;
            lw0Var = lw0Var2;
            if (tL_attachMenuBot.bot_id == this.J) {
                break;
            }
            t = r6Var;
            lw0Var2 = lw0Var;
        }
        if (!this.G0 && !z3) {
            if (W1 != null) {
                TL_bots.BotInfo botInfo = W1.bot_info;
                if (botInfo == null || (botappsettings = botInfo.app_settings) == null) {
                    z = false;
                } else {
                    z = false;
                    g(botappsettings, false);
                }
                z2 = true;
            } else {
                z = false;
                z2 = true;
                na7.q1(this.I).Y2(V1, 0, true, new pv0(this, (byte) 1));
            }
            if (qucVar.p) {
                C(z2, z, this.g0);
            }
        }
        if (this.M0 == null) {
            r6Var2 = r6Var;
            r6Var2.a(2131296494, 2131230871);
        } else {
            r6Var2 = r6Var;
        }
        xp0 xp0Var = new xp0(getContext());
        this.c0 = xp0Var;
        r7 d = r6Var2.d(0, xp0Var);
        this.b0 = d;
        d.setOnClickListener(new rv0(this, (byte) 1));
        lw0Var.setActionBarMenuOnItemClick(new yv0(this, (byte) 0));
        JSONObject u = u(wjbVar, false);
        gw0 gw0Var = this.E;
        gw0Var.setBotUser(V1);
        if (!z3) {
            gw0Var.p(this.I, this.J);
            TLRPC.User user2 = qucVar.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                hq6.d0(this.I);
                if (!hq6.B0(hq6.f2 ? 1 : 0, this.J)) {
                    if (user2 == null) {
                        user2 = na7.q1(this.I).V1(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        ba4.G(this.I);
                        if (!ba4.J(user2.photo.photo_small, null, true, true).exists()) {
                            hq6.d0(this.I).m1(gl5.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (qucVar.q != null) {
            s();
            return;
        }
        int i3 = qucVar.g;
        int i4 = kk7.y1;
        switch (i3) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = na7.q1(this.I).h1(this.K);
                tL_messages_requestWebView.bot = na7.q1(this.I).m1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = qucVar.o;
                tL_messages_requestWebView.fullscreen = qucVar.p;
                String str2 = qucVar.f;
                if (str2 != null) {
                    tL_messages_requestWebView.url = str2;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    z3a.B(this.I);
                    int i5 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i5;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = na7.q1(this.I).h1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = na7.q1(this.I).h1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new wv0(this, (byte) 3));
                kk7.f(this.I).b(this, i4);
                return;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (qucVar.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = na7.q1(this.I).m1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                tL_messages_requestSimpleWebView.from_side_menu = (qucVar.n & 2) != 0;
                tL_messages_requestSimpleWebView.compact = qucVar.o;
                tL_messages_requestSimpleWebView.fullscreen = qucVar.p;
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(qucVar.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = qucVar.f;
                }
                if (!TextUtils.isEmpty(qucVar.l)) {
                    tL_messages_requestSimpleWebView.start_param = qucVar.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new wv0(this, (byte) 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = na7.q1(this.I).m1(this.J);
                tL_messages_requestWebView2.peer = na7.q1(this.I).h1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = qucVar.o;
                tL_messages_requestWebView2.fullscreen = qucVar.p;
                tL_messages_requestWebView2.url = qucVar.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new wv0(this, (byte) 1));
                kk7.f(this.I).b(this, i4);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = qucVar.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = qucVar.k;
                tL_messages_requestAppWebView.platform = "android";
                if (dVar instanceof mu1) {
                    mu1 mu1Var = (mu1) dVar;
                    l1 = mu1Var.h() != null ? na7.l1(mu1Var.h()) : na7.j1(mu1Var.e);
                } else {
                    l1 = na7.l1(qucVar.m);
                }
                tL_messages_requestAppWebView.peer = l1;
                tL_messages_requestAppWebView.compact = qucVar.o;
                tL_messages_requestAppWebView.fullscreen = qucVar.p;
                if (!TextUtils.isEmpty(qucVar.l)) {
                    tL_messages_requestAppWebView.start_param = qucVar.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new wv0(this, (byte) 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = na7.q1(this.I).m1(qucVar.c);
                tL_messages_requestMainWebView.platform = "android";
                if (dVar instanceof mu1) {
                    mu1 mu1Var2 = (mu1) dVar;
                    h1 = mu1Var2.h() != null ? na7.l1(mu1Var2.h()) : na7.j1(mu1Var2.e);
                } else {
                    h1 = na7.q1(this.I).h1(qucVar.b);
                }
                tL_messages_requestMainWebView.peer = h1;
                tL_messages_requestMainWebView.compact = qucVar.o;
                tL_messages_requestMainWebView.fullscreen = qucVar.p;
                if (!TextUtils.isEmpty(qucVar.l)) {
                    tL_messages_requestMainWebView.start_param = qucVar.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new wv0(this, (byte) 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = qucVar.d;
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new hc((byte) 0), new f(this, (byte) 19), 66);
                return;
            case 6:
                if (this.G0) {
                    return;
                }
                gw0Var.q(this.I, qucVar.f, false);
                return;
            default:
                return;
        }
    }

    public final void y(final int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        final int i3 = this.S;
        bkb.a(0.35f, -0.1f, i);
        final iv0 iv0Var = new iv0();
        int i4 = 0;
        if (this.W) {
            i2 = this.S;
        } else {
            i2 = 0;
        }
        SparseIntArray sparseIntArray = iv0Var.a;
        wjb wjbVar = this.G;
        iv0Var.c(sparseIntArray, i2, wjbVar);
        this.W = z;
        if (bm2.h(i) < 0.7210000157356262d) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.U = z3;
        if (this.W) {
            i4 = i;
        }
        iv0Var.c(iv0Var.b, i4, wjbVar);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(s33.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f = bm2.f(floatValue, i3, i);
                    ow0 ow0Var = ow0.this;
                    ow0Var.S = f;
                    ow0Var.h();
                    nw0 nw0Var = ow0Var.f;
                    nw0Var.invalidate();
                    lw0 lw0Var = ow0Var.Y;
                    lw0Var.setBackgroundColor(ow0Var.S);
                    iv0 iv0Var2 = iv0Var;
                    iv0Var2.b(lw0Var, floatValue);
                    ow0Var.a = iv0Var2.a(bkb.yj);
                    nw0Var.invalidate();
                }
            });
            duration.addListener(new ew0(this, i3, i, iv0Var));
            duration.start();
        } else {
            this.S = i;
            h();
            nw0 nw0Var = this.f;
            nw0Var.invalidate();
            int i5 = this.S;
            lw0 lw0Var = this.Y;
            lw0Var.setBackgroundColor(i5);
            iv0Var.b(lw0Var, 1.0f);
            this.a = iv0Var.a(bkb.yj);
            nw0Var.invalidate();
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
            gl.d2(n());
        } else {
            gl.L3(n());
        }
    }

    @Override
    public final void b(boolean z) {
    }
}
