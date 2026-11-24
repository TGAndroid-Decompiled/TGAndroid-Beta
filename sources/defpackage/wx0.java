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
public final class wx0 extends Dialog implements jm7, cz0 {
    public static final HashSet b1 = new HashSet();
    public static final ika c1;
    public static int d1;
    public boolean A0;
    public Boolean B0;
    public boolean C0;
    public ws0 D0;
    public final ox0 E;
    public boolean E0;
    public final ux0 F;
    public wy0 F0;
    public final ylb G;
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
    public jmb M0;
    public long N;
    public Drawable N0;
    public String O;
    public final HashMap O0;
    public final Paint P;
    public bu5 P0;
    public final Paint Q;
    public lq0 Q0;
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
    public final tx0 Y;
    public String Y0;
    public final FrameLayout.LayoutParams Z;
    public cx Z0;
    public int a;
    public final Drawable a0;
    public boolean a1;
    public int b;
    public r7 b0;
    public float c;
    public xq0 c0;
    public zna d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final vx0 f;
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
    public final sx0 n0;
    public final yq0 o0;
    public u31 p0;
    public kq0 q0;
    public int r;
    public final FrameLayout r0;
    public final xy0 s;
    public final FrameLayout.LayoutParams s0;
    public boolean t0;
    public final by7 u0;
    public final vw0 v0;
    public final sm2 w;
    public int w0;
    public final nx0 x;
    public rwc x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        ika ikaVar = new ika(new qn0((byte) 7), new qn0((byte) 8));
        ikaVar.c = 100.0f;
        c1 = ikaVar;
        d1 = 0;
    }

    public wx0(Context context, ylb ylbVar) {
        super(context, 2131755352);
        boolean z;
        Object obj;
        xy0 xy0Var;
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
        this.v0 = new vw0(this, (byte) 1);
        this.w0 = -1;
        this.A0 = false;
        this.B0 = null;
        this.J0 = true;
        this.O0 = new HashMap();
        this.R0 = false;
        this.V0 = true;
        this.a1 = false;
        this.G = ylbVar;
        int w0 = cmb.w0(null, cmb.yj, false);
        this.b = w0;
        this.a = w0;
        nx0 nx0Var = new nx0((byte) 0, context, this);
        this.x = nx0Var;
        nx0Var.setAllowFullSizeSwipe(true);
        nx0Var.setShouldWaitWebViewScroll(true);
        int i = cmb.c6;
        ox0 ox0Var = new ox0(this, context, ylbVar, cmb.v0(i, ylbVar), (byte) 0);
        this.E = ox0Var;
        ox0Var.setOnVerifiedAge(this.M0);
        ox0Var.setDelegate(new rx0(this, context, ylbVar));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gm.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.S = cmb.v0(i, ylbVar);
        int v0 = cmb.v0(cmb.Z6, ylbVar);
        this.T = v0;
        gm.o3(this, v0, false, null);
        vx0 vx0Var = new vx0(this, context);
        this.f = vx0Var;
        vx0Var.setDelegate(new xw0(this, (byte) 0));
        FrameLayout.LayoutParams e = qoe.e(-1, -1, 49);
        this.y = e;
        vx0Var.addView(nx0Var, e);
        sx0 sx0Var = new sx0(this, getContext(), ylbVar);
        this.n0 = sx0Var;
        sx0Var.setOnButtonClickListener(new yw0(this, (byte) 0));
        sx0Var.setOnResizeListener(new vw0(this, (byte) 3));
        vx0Var.addView(sx0Var, qoe.e(-1, -2, 81));
        yq0 yq0Var = new yq0(getContext());
        this.o0 = yq0Var;
        yq0Var.setAlpha(0.0f);
        yq0Var.setVisibility(8);
        if (!oc7.r1(this.I).l4.F1.f && gda.o() >= 2) {
            z = true;
        } else {
            z = false;
        }
        this.g0 = z;
        if (z) {
            obj = nx0Var.getRenderNode();
        } else {
            obj = null;
        }
        yq0Var.setParentRenderNode(obj);
        vx0Var.addView(yq0Var, qoe.e(-1, -1, 119));
        yq0Var.setOnCloseClickListener(new vw0(this, (byte) 4));
        yq0Var.setOnCollapseClickListener(new vw0(this, (byte) 5));
        yq0Var.setOnMenuClickListener(new vw0(this, (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        FrameLayout.LayoutParams e2 = qoe.e(-1, 200, 55);
        this.s0 = e2;
        vx0Var.addView(frameLayout, e2);
        this.a0 = getContext().getDrawable(2131231241).mutate();
        ?? aVar = new a(context, ylbVar);
        this.Y = aVar;
        aVar.setBackgroundColor(0);
        aVar.setBackButtonImage(2131231273);
        F();
        aVar.setActionBarMenuOnItemClick(new gx0(this, (byte) 1));
        aVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e3 = qoe.e(-1, -2, 49);
        this.Z = e3;
        vx0Var.addView((View) aVar, e3);
        ?? x22Var = new x22(context, ylbVar);
        this.F = x22Var;
        vx0Var.addView((View) x22Var, qoe.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ox0Var.setWebViewProgressListener(new gx(this, (byte) 1));
        nx0Var.addView(ox0Var, qoe.c(-1.0f, -1));
        nx0Var.setScrollListener(new vw0(this, (byte) 7));
        nx0Var.setScrollEndListener(new vw0(this, (byte) 8));
        nx0Var.setDelegate(new ww0(this));
        nx0Var.setIsKeyboardVisible(new ww0(this));
        by7 by7Var = new by7(context);
        this.u0 = by7Var;
        vx0Var.addView(by7Var, qoe.c(-1.0f, -1));
        setContentView(vx0Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            xy0Var = launchActivity.O();
        } else {
            xy0Var = null;
        }
        this.s = xy0Var;
        if (xy0Var != null) {
            yt0 yt0Var = new yt0(vx0Var, (byte) 3);
            vw0 vw0Var = new vw0(this, (byte) 2);
            xy0Var.J.add(yt0Var);
            xy0Var.K.add(vw0Var);
            this.w = new sm2(xy0Var);
        }
    }

    public static void f(wx0 wx0Var) {
        super.dismiss();
    }

    public static void l(int i, long j, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(i).b.bots;
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
        String a0 = jb6.a0(null, null, 2131752955, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String M0 = jb6.M0(2131752954, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(a0);
        alertDialog$Builder.j(jb6.M0(2131747564, null), new cg(i, j, tL_attachMenuBot, runnable));
        wi8.y(null, 2131752542, alertDialog$Builder, null);
    }

    public static JSONObject u(ylb ylbVar, final boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = cmb.v(-16777216, cmb.v0(cmb.g5, ylbVar));
            rac racVar = new rac() {
                @Override
                public final Object a(Object obj) {
                    int v2 = cmb.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v2);
                    if (z) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v2)), Integer.valueOf(Color.green(v2)), Integer.valueOf(Color.blue(v2)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", racVar.a(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", racVar.a(Integer.valueOf(cmb.v0(cmb.c6, ylbVar))));
            int i = cmb.Z6;
            jSONObject.put("secondary_bg_color", racVar.a(Integer.valueOf(cmb.v0(i, ylbVar))));
            jSONObject.put("text_color", racVar.a(Integer.valueOf(cmb.v0(cmb.F6, ylbVar))));
            jSONObject.put("hint_color", racVar.a(Integer.valueOf(cmb.v0(cmb.G6, ylbVar))));
            jSONObject.put("link_color", racVar.a(Integer.valueOf(cmb.v0(cmb.I6, ylbVar))));
            jSONObject.put("button_color", racVar.a(Integer.valueOf(cmb.v0(cmb.Ei, ylbVar))));
            jSONObject.put("button_text_color", racVar.a(Integer.valueOf(cmb.v0(cmb.Ii, ylbVar))));
            jSONObject.put("header_bg_color", racVar.a(Integer.valueOf(cmb.v0(cmb.r8, ylbVar))));
            jSONObject.put("accent_text_color", racVar.a(Integer.valueOf(cmb.v0(cmb.p6, ylbVar))));
            jSONObject.put("section_header_text_color", racVar.a(Integer.valueOf(cmb.v0(cmb.K6, ylbVar))));
            jSONObject.put("subtitle_text_color", racVar.a(Integer.valueOf(cmb.v0(cmb.y6, ylbVar))));
            jSONObject.put("destructive_text_color", racVar.a(Integer.valueOf(cmb.v0(cmb.o7, ylbVar))));
            jSONObject.put("section_separator_color", racVar.a(Integer.valueOf(cmb.v0(cmb.c7, ylbVar))));
            jSONObject.put("bottom_bar_bg_color", racVar.a(Integer.valueOf(cmb.v0(i, ylbVar))));
            return jSONObject;
        } catch (Exception e) {
            fc4.g(e, true);
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
            duration.setInterpolator(d53.f);
            this.U0.addUpdateListener(new tw0(this, color, i, (byte) 0));
            this.U0.addListener(new co(this, i, (byte) 1));
            this.U0.start();
            return;
        }
        paint.setColor(i);
        F();
        this.f.invalidate();
        cx cxVar = this.Z0;
        if (cxVar != null) {
            if (gm.B(paint.getColor()) > 0.721f) {
                z2 = false;
            }
            cxVar.b(z2, false);
            this.Z0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            nx0 nx0Var = this.x;
            if (nx0Var != null) {
                nx0Var.setFullSize(p());
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
        if (z3 && !oc7.r1(this.I).l4.F1.f && gda.o() >= 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.g0 = z4;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yq0 yq0Var = this.o0;
        if (yq0Var != null) {
            f00 f00Var = yq0Var.b0;
            gm.r(f00Var);
            yq0Var.N = z;
            if (!z2) {
                yq0Var.O.f(z, true);
            }
            yq0Var.invalidate();
            if (z) {
                gm.d3(f00Var, 2500L);
            }
            yq0 yq0Var2 = this.o0;
            if (this.g0) {
                obj = this.x.getRenderNode();
            } else {
                obj = null;
            }
            yq0Var2.setParentRenderNode(obj);
        }
        this.k0 = this.x.getWidth();
        this.l0 = this.x.getHeight();
        this.V0 = false;
        if (z2) {
            I();
            L();
            H();
            if (gm.O1() && !gm.E && !gm.N1()) {
                int i2 = gm.q.x;
                f2 = (i2 - ((int) (Math.min(i2, point.y) * 0.8f))) / 2.0f;
            } else {
                f2 = 0.0f;
            }
            int i3 = this.n.left;
            if (z) {
                f3 = i3 + f2;
                f4 = this.x.getTranslationY();
                currentActionBarHeight = -gm.L(24.0f);
            } else {
                f3 = (-i3) - f2;
                f2 = -f2;
                f4 = -gm.L(24.0f);
                currentActionBarHeight = (a.getCurrentActionBarHeight() + gm.m) - gm.L(24.0f);
            }
            float f6 = currentActionBarHeight;
            float currentActionBarHeight2 = a.getCurrentActionBarHeight() + gm.m;
            nx0 nx0Var = this.x;
            zna znaVar = nx0Var.w;
            if (znaVar != null) {
                znaVar.d();
            }
            zna znaVar2 = nx0Var.H;
            if (znaVar2 != null) {
                znaVar2.d();
            }
            this.x.setSwipeOffsetAnimationDisallowed(true);
            this.Y.setVisibility(0);
            nx0 nx0Var2 = this.x;
            if (z) {
                nx0Var2.setTopActionBarOffsetY(-gm.L(24.0f));
            } else {
                nx0Var2.setTopActionBarOffsetY(currentActionBarHeight2 - gm.L(24.0f));
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
            this.x.setTranslationY(gm.R1(f4, f6, this.i0));
            this.x.setTranslationX(gm.R1(f3, 0.0f, this.i0));
            this.n0.setTranslationX(gm.R1(f2, 0.0f, this.i0));
            this.o0.setAlpha(this.h0);
            this.f.invalidate();
            this.E.setViewPortHeightOffset(this.x.getTranslationY() - f6);
            this.E.l(false, false);
            this.j0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W0 = ofFloat;
            float f7 = f3;
            ofFloat.addUpdateListener(new jx0(this, z, f4, f6, f7, f2));
            this.W0.addListener(new kx0(this, z, currentActionBarHeight2, f7));
            this.W0.setDuration(280L);
            this.W0.setInterpolator(d53.h);
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
        tx0 tx0Var = this.Y;
        if (z) {
            i = 8;
        }
        tx0Var.setVisibility(i);
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
        sx0 sx0Var = this.n0;
        Paint paint = sx0Var.a;
        sx0Var.e.b = i;
        paint.setColor(i);
        if (!z) {
            sx0Var.d.a(i, true);
            this.T = i;
            h();
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(d53.f);
            duration.addUpdateListener(new tw0(this, i2, i, (byte) 1));
            duration.addListener(new lx0(this, i2, i, (byte) 0));
            duration.start();
        }
        gm.o3(this, this.T, false, null);
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
        this.T0.addUpdateListener(new uw0(this, (byte) 0));
        this.T0.setInterpolator(d53.h);
        this.T0.setDuration(220L);
        this.T0.start();
    }

    public final void F() {
        if (!this.W) {
            int i = cmb.F6;
            ylb ylbVar = this.G;
            int v0 = cmb.v0(i, ylbVar);
            tx0 tx0Var = this.Y;
            tx0Var.setTitleColor(v0);
            tx0Var.H(cmb.v0(i, ylbVar), false);
            tx0Var.G(cmb.v0(cmb.t8, ylbVar), false);
            tx0Var.I(cmb.v0(cmb.F8, ylbVar), false);
            tx0Var.J(cmb.v0(cmb.D8, ylbVar), false, false);
            tx0Var.J(cmb.v0(cmb.E8, ylbVar), true, false);
            tx0Var.K(cmb.v0(cmb.H5, ylbVar), false);
        }
        this.E.setFlickerViewColor(this.R.getColor());
    }

    public final void G() {
        u31 u31Var;
        boolean z;
        mq0 c = mq0.c(getContext(), this.I, this.J);
        ArrayList arrayList = c.e;
        lq0 lq0Var = c.f;
        boolean z2 = true;
        if (lq0Var == null) {
            u31 u31Var2 = this.p0;
            if (u31Var2 != null) {
                u31Var2.b();
                this.p0 = null;
            }
        } else if ((lq0Var.c() && !lq0Var.l) || lq0Var.k) {
            if (this.Q0 != lq0Var && (u31Var = this.p0) != null) {
                u31Var.b();
                this.p0 = null;
            }
            u31 u31Var3 = this.p0;
            if (u31Var3 == null || !u31Var3.m) {
                this.Q0 = lq0Var;
                kq0 kq0Var = new kq0(getContext(), this.G);
                this.q0 = kq0Var;
                u31 f = u31.f(this.r0, kq0Var, 5000);
                this.p0 = f;
                f.k(true);
            }
            if (this.q0.c(lq0Var)) {
                this.p0 = null;
            }
            lq0Var.k = false;
            lq0Var.l = true;
        } else {
            kq0 kq0Var2 = this.q0;
            if (kq0Var2 != null) {
                this.Q0 = lq0Var;
                if (kq0Var2.c(lq0Var)) {
                    this.p0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.O0.entrySet()) {
            a8 a8Var = (a8) entry.getValue();
            lq0 lq0Var2 = (lq0) entry.getKey();
            a8Var.setText(lq0Var2.c);
            if (!lq0Var2.c()) {
                a8Var.setSubtext(gm.i0(lq0Var2.g, false, false));
            } else {
                Pair b = lq0Var2.b();
                int i = (((Long) b.second).longValue() > 0L ? 1 : (((Long) b.second).longValue() == 0L ? 0 : -1));
                Object obj = b.first;
                if (i > 0) {
                    a8Var.setSubtext(gm.i0(((Long) obj).longValue(), false, false) + " / " + gm.i0(((Long) b.second).longValue(), false, false));
                } else {
                    a8Var.setSubtext(gm.i0(((Long) obj).longValue(), false, false));
                }
            }
            if (lq0Var2.c()) {
                a8Var.setRightIcon(2131232102);
                a8Var.b.setPadding(0, 0, gm.L(32.0f), 0);
            } else if (lq0Var2.i) {
                a8Var.setVisibility(8);
            } else {
                a8Var.setRightIcon(0);
                a8Var.b.setPadding(0, 0, 0, 0);
            }
            a8Var.setOnClickListener(new t(this, lq0Var2, (byte) 25));
        }
        xq0 xq0Var = this.c0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((lq0) obj2).c()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (xq0Var.e != z) {
            xq0Var.e = z;
            xq0Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                if (((lq0) obj3).c()) {
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
        kq0 kq0Var = this.q0;
        if (kq0Var == null) {
            return;
        }
        if (this.f0) {
            kq0Var.setArrow(gm.U1(this.h0, gm.L(24.0f), gm.L(26.0f)));
        } else if (this.c > 0.5f) {
            kq0Var.setArrow(gm.L(24.0f));
        } else {
            kq0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        yq0 yq0Var = this.o0;
        Rect rect = this.n;
        yq0Var.setInsets(rect);
        boolean z = this.f0;
        ox0 ox0Var = this.E;
        vx0 vx0Var = this.f;
        sx0 sx0Var = this.n0;
        int i7 = 0;
        if (z) {
            if (sx0Var != null && sx0Var.getTotalHeight() > 0) {
                i5 = rect.bottom;
            } else {
                i5 = 0;
            }
            int i8 = rect.left;
            int i9 = rect.top;
            int i10 = rect.right;
            if (this.r > i5 || (sx0Var != null && sx0Var.getTotalHeight() > 0)) {
                i6 = 0;
            } else {
                i6 = rect.bottom;
            }
            Rect rect2 = new Rect(i8, i9, i10, i6);
            int L = gm.L(46.0f);
            ox0Var.N(rect2, false);
            ox0Var.M(L, false);
            vx0Var.setPadding(0, 0, 0, Math.max(this.r, i5));
        } else {
            ox0Var.N(new Rect(0, 0, 0, 0), false);
            ox0Var.M(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.r;
            xy0 xy0Var = this.s;
            if (xy0Var != null) {
                i = xy0Var.I;
            } else {
                i = 0;
            }
            vx0Var.setPadding(i11, 0, i12, Math.max(i13, i + rect.bottom));
        }
        this.y.topMargin = gm.L(24.0f);
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
        nx0 nx0Var = this.x;
        if (!z3) {
            nx0Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f0) {
                nx0Var.setTopActionBarOffsetY(-gm.L(24.0f));
            } else {
                nx0Var.setTopActionBarOffsetY((a.getCurrentActionBarHeight() + gm.m) - gm.L(24.0f));
            }
            nx0Var.setSwipeOffsetAnimationDisallowed(false);
            nx0Var.c();
            nx0Var.invalidate();
            nx0Var.requestLayout();
        }
        if (nx0Var != null) {
            nx0Var.setFullSize(p());
        }
        sx0Var.requestLayout();
        vx0Var.requestLayout();
        if (!this.f0) {
            i7 = 8;
        }
        yq0Var.setVisibility(i7);
    }

    public final void J() {
        boolean z;
        int i;
        boolean z2 = true;
        if (this.W) {
            z = !this.U;
        } else {
            z = (gm.O1() || on2.h(cmb.w0(null, cmb.c6, true)) < 0.7210000157356262d || this.c < 0.85f) ? false : false;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.e = Boolean.valueOf(z);
        vx0 vx0Var = this.f;
        int systemUiVisibility = vx0Var.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        vx0Var.setSystemUiVisibility(i);
    }

    public final void K() {
        mw0 webView;
        ox0 ox0Var = this.E;
        if (ox0Var == null || (webView = ox0Var.getWebView()) == null) {
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
            vx0 vx0Var = this.f;
            if (z) {
                attributes.flags |= i;
                sx0 sx0Var = this.n0;
                if ((sx0Var == null || sx0Var.getTotalHeight() <= 0) && !vx0Var.n0) {
                    vx0Var.setSystemUiVisibility(vx0Var.getSystemUiVisibility() | 2);
                    window.setAttributes(attributes);
                }
            } else {
                attributes.flags &= ~i;
            }
            vx0Var.setSystemUiVisibility(vx0Var.getSystemUiVisibility() & (-3));
            window.setAttributes(attributes);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void a(boolean z) {
        m(false);
    }

    @Override
    public final wy0 c() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean booleanValue;
        float f;
        wy0 wy0Var = new wy0();
        wy0Var.q = this.S;
        wy0Var.p = this.w0;
        wy0Var.n = this.W;
        wy0Var.o = this.X;
        wy0Var.r = this.R.getColor();
        wy0Var.a = this.x0;
        boolean z4 = false;
        ox0 ox0Var = this.E;
        if (ox0Var != null && ox0Var.O) {
            z = true;
        } else {
            z = false;
        }
        wy0Var.t = z;
        wy0Var.D = cmb.I.o();
        mw0 mw0Var = null;
        if (ox0Var != null) {
            str = ox0Var.getUrlLoaded();
        } else {
            str = null;
        }
        wy0Var.x = str;
        if (ox0Var != null && ox0Var.u0) {
            z2 = true;
        } else {
            z2 = false;
        }
        wy0Var.e = z2;
        if (ox0Var != null) {
            str2 = ox0Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        wy0Var.f = str2;
        nx0 nx0Var = this.x;
        if ((nx0Var == null || nx0Var.getSwipeOffsetY() >= 0.0f) && !this.z0 && !p() && !this.f0) {
            z3 = false;
        } else {
            z3 = true;
        }
        wy0Var.j = z3;
        wy0Var.z = this.f0;
        wy0Var.A = this.g0;
        Boolean bool = this.B0;
        if (bool == null) {
            booleanValue = this.A0;
        } else {
            booleanValue = bool.booleanValue();
        }
        wy0Var.B = booleanValue;
        if (nx0Var != null) {
            f = nx0Var.getOffsetY();
        } else {
            f = Float.MAX_VALUE;
        }
        wy0Var.k = f;
        wy0Var.C = this.C0;
        wy0Var.u = this.y0;
        wy0Var.y = this.t0;
        wy0Var.v = this.d0;
        if (nx0Var == null || nx0Var.N) {
            z4 = true;
        }
        wy0Var.l = z4;
        wy0Var.w = this.n0.e;
        wy0Var.s = this.T;
        ws0 ws0Var = this.D0;
        if (ws0Var != null) {
            ws0Var.b();
        }
        wy0Var.K = this.D0;
        if (ox0Var != null) {
            mw0Var = ox0Var.getWebView();
        }
        if (mw0Var != null) {
            ox0Var.J();
            wy0Var.b = mw0Var;
            wy0Var.d = ox0Var.getBotProxy();
            wy0Var.g = mw0Var.getWidth();
            wy0Var.h = mw0Var.getHeight();
            mw0Var.onPause();
        }
        boolean z5 = this.X0;
        wy0Var.G = z5;
        if (z5) {
            wy0Var.H = this.Y0;
        }
        wy0Var.L = this.E0;
        this.F0 = wy0Var;
        return wy0Var;
    }

    @Override
    public final dz0 mo21d() {
        return this.f;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.z1) {
            if (this.L == ((Long) objArr[0]).longValue()) {
                m(false);
            }
        } else if (i == nm7.r4) {
            this.f.invalidate();
            this.E.n.b(cmb.v0(cmb.c6, this.G), 153);
            F();
            J();
        } else if (i == nm7.M3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        m(false);
    }

    @Override
    public final int e(int i) {
        return on2.f(this.S0, i, this.T);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        if (botappsettings != null) {
            boolean o = cmb.I.o();
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
        vx0 vx0Var = this.f;
        if (vx0Var != null) {
            vx0Var.invalidate();
        }
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final void j() {
        if (this.Z0 == null) {
            cx cxVar = new cx(getContext());
            this.Z0 = cxVar;
            this.x.addView(cxVar, qoe.c(-1.0f, -1));
            this.Z0.setTranslationY(-1.0f);
            this.Z0.h.setOnClickListener(new ax0(this, (byte) 0));
            this.Z0.setBackgroundColor(this.R.getColor());
            gm.T3(this.Z0, this.X0, 1.0f, true, false);
        }
    }

    @Override
    public final boolean k(sy0 sy0Var) {
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
        gm.r(this.v0);
        nm7.f(this.I).n(this, nm7.z1);
        nm7.f(this.I).n(this, nm7.M3);
        nm7.e().n(this, nm7.r4);
        if (z && ((launchActivity = LaunchActivity.H1) == null || launchActivity.x0 == null)) {
            z = false;
        }
        if (z) {
            zna znaVar = this.d;
            if (znaVar != null) {
                znaVar.m.i = 0.0d;
                znaVar.h();
            }
            LaunchActivity.H1.x0.b(this);
        } else {
            sx0 sx0Var = this.n0;
            if (sx0Var != null) {
                sx0Var.animate().translationY(sx0Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(d53.h).start();
            }
            this.E.f();
            nx0 nx0Var = this.x;
            int height = nx0Var.getHeight();
            if (sx0Var != null) {
                i = sx0Var.getTotalHeight();
            } else {
                i = 0;
            }
            int i3 = height + i;
            Rect rect = this.n;
            int Q = this.f.Q() + i3 + rect.top + rect.bottom;
            if (p()) {
                i2 = gm.L(200.0f);
            } else {
                i2 = 0;
            }
            nx0Var.e(Q + i2, true, new vw0(this, (byte) 0));
        }
        b1.remove(this);
    }

    public final Activity n() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        if (ownerActivity == null) {
            return gm.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean o() {
        rwc rwcVar = this.x0;
        if (rwcVar != null && rwcVar.g == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            zna znaVar = new zna(this, c1);
            aoa aoaVar = new aoa();
            aoaVar.b(1200.0f);
            aoaVar.a(1.0f);
            znaVar.m = aoaVar;
            this.d = znaVar;
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
        sx0 sx0Var;
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
        vx0 vx0Var = this.f;
        vx0Var.setFitsSystemWindows(true);
        vx0Var.setSystemUiVisibility(1792);
        vx0Var.setOnApplyWindowInsetsListener(new ex0(this, (byte) 0));
        if (this.f0 && ((sx0Var = this.n0) == null || sx0Var.getTotalHeight() <= 0)) {
            vx0Var.setSystemUiVisibility(vx0Var.getSystemUiVisibility() | 2);
        } else {
            vx0Var.setSystemUiVisibility(vx0Var.getSystemUiVisibility() & (-3));
        }
        if (i >= 26) {
            if (on2.h(this.T) < 0.7210000157356262d) {
                z = false;
            }
            gm.i3(this, z);
        }
        nm7.e().b(this, nm7.r4);
        nm7.f(this.I).b(this, nm7.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        zna znaVar = this.d;
        if (znaVar != null) {
            znaVar.d();
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
        tzc tzcVar = wzc.h(view, windowInsets).a;
        iq5 f = tzcVar.f(2);
        this.h.set(f.a, f.b, f.c, f.d);
        iq5 f2 = tzcVar.f(647);
        int max = Math.max(f2.a, windowInsets.getStableInsetLeft());
        int max2 = Math.max(f2.b, windowInsets.getStableInsetTop());
        int max3 = Math.max(f2.c, windowInsets.getStableInsetRight());
        int max4 = Math.max(f2.d, windowInsets.getStableInsetBottom());
        Rect rect = this.n;
        rect.set(max, max2, max3, max4);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            Activity W = gm.W(getContext());
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
            Typeface typeface = gm.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            rect.top = Math.max(i3, i);
        }
        int i4 = tzcVar.f(8).d;
        if (i4 > rect.bottom && i4 > gm.L(20.0f)) {
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
            fc4.g(e, true);
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
                hs6 d0 = hs6.d0(this.I);
                long j = this.x0.c;
                TLRPC.User W1 = d0.getMessagesController().W1(Long.valueOf(j));
                if (W1 != null && W1.bot) {
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
                    Collections.sort(d0.m1, new tk6((byte) 5));
                    if (d0.m1.size() > 20) {
                        td4.w(1, d0.m1);
                    }
                    d0.getMessagesStorage().a.c(new pq6(d0, j, 2, tL_topPeer.rating));
                    d0.getNotificationCenter().k(nm7.V0, new Object[0]);
                }
                this.E.q(this.I, str, z);
            }
            gm.d3(this.v0, max);
            nx0 nx0Var = this.x;
            if (nx0Var != null) {
                nx0Var.setFullSize(p());
            }
        }
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        E(true);
        vx0 vx0Var = this.f;
        vx0Var.setAlpha(0.0f);
        vx0Var.addOnLayoutChangeListener(new ix0(this, (byte) 0));
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
            gm.d2(n());
        } else {
            gm.K3(n());
        }
    }

    public final boolean v() {
        String str;
        if (this.t0) {
            TLRPC.User W1 = oc7.r1(this.I).W1(Long.valueOf(this.J));
            if (W1 != null) {
                str = bw2.m(0, W1.first_name, W1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            he heVar = alertDialog$Builder.a;
            heVar.S = str;
            heVar.U = jb6.M0(2131752870, null);
            alertDialog$Builder.j(jb6.M0(2131752869, null), new ww0(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.show();
            ((TextView) heVar.c(-1)).setTextColor(cmb.v0(cmb.p7, this.G));
            return false;
        }
        m(false);
        return true;
    }

    public final void w() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx0.w():void");
    }

    public final void x(d dVar, rwc rwcVar) {
        boolean z;
        TLRPC.User W1;
        CharSequence charSequence;
        TLRPC.UserFull X1;
        TLRPC.User user;
        r6 r6Var;
        tx0 tx0Var;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        r6 r6Var2;
        boolean z2;
        boolean z3;
        TLRPC.InputPeer m1;
        TLRPC.InputPeer i1;
        boolean z4;
        boolean z5;
        TL_bots.botAppSettings botappsettings;
        String r;
        boolean z6;
        this.x0 = rwcVar;
        int i = rwcVar.a;
        this.I = i;
        this.K = rwcVar.b;
        this.J = rwcVar.c;
        this.M = rwcVar.h;
        this.N = rwcVar.i;
        String str = rwcVar.e;
        this.O = str;
        if (rwcVar.g == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            W1 = null;
            charSequence = str;
        } else {
            W1 = oc7.r1(i).W1(Long.valueOf(this.J));
            charSequence = m9c.r(W1);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gm.L(20.0f));
            charSequence = gw3.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        tx0 tx0Var2 = this.Y;
        tx0Var2.setTitle(charSequence);
        if (z) {
            X1 = null;
        } else {
            X1 = oc7.r1(this.I).X1(this.J);
        }
        ylb ylbVar = this.G;
        if ((W1 != null && W1.verified) || (X1 != null && (user = X1.user) != null && user.verified)) {
            this.N0 = getContext().getResources().getDrawable(2131232811).mutate();
            anb.x(tx0Var2.getTitleTextView(), this.N0, cmb.Ei, ylbVar, PorterDuff.Mode.SRC_IN);
            this.N0.setAlpha(255);
            tx0Var2.getTitleTextView().setDrawablePadding(gm.L(2.0f));
            tx0Var2.getTitleTextView().i(new f6(this, (byte) 1));
        }
        yq0 yq0Var = this.o0;
        if (yq0Var != null) {
            if (z) {
                r = rwcVar.e;
            } else {
                r = m9c.r(W1);
            }
            if (W1 != null && W1.verified) {
                z6 = true;
            } else {
                z6 = false;
            }
            yq0Var.U = new uib(r, 13.0f, gm.o());
            if (!z6) {
                yq0Var.V = null;
                yq0Var.W = null;
            } else {
                yq0Var.V = yq0Var.getContext().getResources().getDrawable(2131232809).mutate();
                yq0Var.W = yq0Var.getContext().getResources().getDrawable(2131232810).mutate();
            }
        }
        r6 t = tx0Var2.t();
        t.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(this.I).b.bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                i2++;
                tL_attachMenuBot = tL_attachMenuBot2;
                r6Var = t;
                tx0Var = tx0Var2;
                if (tL_attachMenuBot.bot_id == this.J) {
                    break;
                }
                t = r6Var;
                tx0Var2 = tx0Var;
            } else {
                r6Var = t;
                tx0Var = tx0Var2;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.G0 && !z) {
            if (X1 != null) {
                TL_bots.BotInfo botInfo = X1.bot_info;
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
                oc7.r1(this.I).b3(W1, 0, true, new yw0(this, (byte) 1));
            }
            if (rwcVar.p) {
                C(z5, z4, this.g0);
            }
        }
        if (this.M0 == null) {
            r6Var2 = r6Var;
            r6Var2.a(2131296494, 2131230872);
        } else {
            r6Var2 = r6Var;
        }
        xq0 xq0Var = new xq0(getContext());
        this.c0 = xq0Var;
        r7 d = r6Var2.d(0, xq0Var);
        this.b0 = d;
        d.setOnClickListener(new ax0(this, (byte) 1));
        tx0Var.setActionBarMenuOnItemClick(new gx0(this, (byte) 0));
        JSONObject u = u(ylbVar, false);
        ox0 ox0Var = this.E;
        ox0Var.setBotUser(W1);
        if (!z) {
            ox0Var.p(this.I, this.J);
            TLRPC.User user2 = rwcVar.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                hs6.d0(this.I);
                if (!hs6.B0(hs6.f2 ? 1 : 0, this.J)) {
                    if (user2 == null) {
                        user2 = oc7.r1(this.I).W1(Long.valueOf(this.J));
                    }
                    if (user2 != null && user2.photo != null) {
                        bc4.G(this.I);
                        if (!bc4.J(user2.photo.photo_small, null, true, true).exists()) {
                            hs6.d0(this.I).m1(gn5.l(this.I, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (rwcVar.q != null) {
            s();
            return;
        }
        int i3 = rwcVar.g;
        int i4 = nm7.z1;
        switch (i3) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = oc7.r1(this.I).i1(this.K);
                tL_messages_requestWebView.bot = oc7.r1(this.I).n1(this.J);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = rwcVar.o;
                tL_messages_requestWebView.fullscreen = rwcVar.p;
                String str2 = rwcVar.f;
                if (str2 != null) {
                    tL_messages_requestWebView.url = str2;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.M != 0) {
                    a6a.B(this.I);
                    int i5 = this.M;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i5;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.N != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = oc7.r1(this.I).i1(this.N);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.N != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = oc7.r1(this.I).i1(this.N);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView, new sw0(this, (byte) 4));
                nm7.f(this.I).b(this, i4);
                return;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((rwcVar.n & 1) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z2;
                tL_messages_requestSimpleWebView.bot = oc7.r1(this.I).n1(this.J);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((rwcVar.n & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z3;
                tL_messages_requestSimpleWebView.compact = rwcVar.o;
                tL_messages_requestSimpleWebView.fullscreen = rwcVar.p;
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(rwcVar.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = rwcVar.f;
                }
                if (!TextUtils.isEmpty(rwcVar.l)) {
                    tL_messages_requestSimpleWebView.start_param = rwcVar.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestSimpleWebView, new sw0(this, (byte) 3));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = oc7.r1(this.I).n1(this.J);
                tL_messages_requestWebView2.peer = oc7.r1(this.I).i1(this.J);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = rwcVar.o;
                tL_messages_requestWebView2.fullscreen = rwcVar.p;
                tL_messages_requestWebView2.url = rwcVar.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestWebView2, new sw0(this, (byte) 2));
                nm7.f(this.I).b(this, i4);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = rwcVar.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = rwcVar.k;
                tL_messages_requestAppWebView.platform = "android";
                if (dVar instanceof yv1) {
                    yv1 yv1Var = (yv1) dVar;
                    if (yv1Var.h() != null) {
                        m1 = oc7.m1(yv1Var.h());
                    } else {
                        m1 = oc7.k1(yv1Var.e);
                    }
                } else {
                    m1 = oc7.m1(rwcVar.m);
                }
                tL_messages_requestAppWebView.peer = m1;
                tL_messages_requestAppWebView.compact = rwcVar.o;
                tL_messages_requestAppWebView.fullscreen = rwcVar.p;
                if (!TextUtils.isEmpty(rwcVar.l)) {
                    tL_messages_requestAppWebView.start_param = rwcVar.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestAppWebView, new sw0(this, (byte) 5), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = oc7.r1(this.I).n1(rwcVar.c);
                tL_messages_requestMainWebView.platform = "android";
                if (dVar instanceof yv1) {
                    yv1 yv1Var2 = (yv1) dVar;
                    if (yv1Var2.h() != null) {
                        i1 = oc7.m1(yv1Var2.h());
                    } else {
                        i1 = oc7.k1(yv1Var2.e);
                    }
                } else {
                    i1 = oc7.r1(this.I).i1(rwcVar.b);
                }
                tL_messages_requestMainWebView.peer = i1;
                tL_messages_requestMainWebView.compact = rwcVar.o;
                tL_messages_requestMainWebView.fullscreen = rwcVar.p;
                if (!TextUtils.isEmpty(rwcVar.l)) {
                    tL_messages_requestMainWebView.start_param = rwcVar.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.I).sendRequest(tL_messages_requestMainWebView, new sw0(this, (byte) 0), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = rwcVar.d;
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u.toString();
                }
                ConnectionsManager.getInstance(this.I).sendRequestTyped(tL_messages_requestChatJoinWebView, new kc((byte) 0), new f(this, (byte) 19), 66);
                return;
            case 6:
                if (!this.G0) {
                    ox0Var.q(this.I, rwcVar.f, false);
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
        cmb.a(0.35f, -0.1f, i);
        final rw0 rw0Var = new rw0();
        int i4 = 0;
        if (this.W) {
            i2 = this.S;
        } else {
            i2 = 0;
        }
        SparseIntArray sparseIntArray = rw0Var.a;
        ylb ylbVar = this.G;
        rw0Var.c(sparseIntArray, i2, ylbVar);
        this.W = z;
        if (on2.h(i) < 0.7210000157356262d) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.U = z3;
        if (this.W) {
            i4 = i;
        }
        rw0Var.c(rw0Var.b, i4, ylbVar);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(d53.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f = on2.f(floatValue, i3, i);
                    wx0 wx0Var = wx0.this;
                    wx0Var.S = f;
                    wx0Var.h();
                    vx0 vx0Var = wx0Var.f;
                    vx0Var.invalidate();
                    tx0 tx0Var = wx0Var.Y;
                    tx0Var.setBackgroundColor(wx0Var.S);
                    rw0 rw0Var2 = rw0Var;
                    rw0Var2.b(tx0Var, floatValue);
                    wx0Var.a = rw0Var2.a(cmb.yj);
                    vx0Var.invalidate();
                }
            });
            duration.addListener(new mx0(this, i3, i, rw0Var));
            duration.start();
        } else {
            this.S = i;
            h();
            vx0 vx0Var = this.f;
            vx0Var.invalidate();
            int i5 = this.S;
            tx0 tx0Var = this.Y;
            tx0Var.setBackgroundColor(i5);
            rw0Var.b(tx0Var, 1.0f);
            this.a = rw0Var.a(cmb.yj);
            vx0Var.invalidate();
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
            gm.d2(n());
        } else {
            gm.K3(n());
        }
    }

    @Override
    public final void b(boolean z) {
    }
}
