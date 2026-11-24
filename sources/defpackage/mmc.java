package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;
public final class mmc {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public zna F;
    public ValueAnimator G;
    public boolean H;
    public final jmc I;
    public final ln J;
    public final ln K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final ln Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final u51 Y;
    public zna Z;
    public final cm1 a;
    public float a0;
    public final ylb b;
    public zna b0;
    public float c0;
    public kmc d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final uoc k;
    public ho1 k0;
    public final p09 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public lmc m;
    public boolean m0;
    public boolean n;
    public uib n0;
    public boolean o;
    public uib o0;
    public float p;
    public uib p0;
    public float q;
    public uib q0;
    public float r;
    public boolean r0;
    public float s;
    public vl1 s0;
    public float t;
    public int t0;
    public final yl u0;
    public long v;
    public int v0;
    public final ln w0;
    public final hmc x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final trc u = new trc();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public mmc(cm1 cm1Var, ylb ylbVar) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.a0 = 1.0f;
        this.t0 = -10624001;
        this.u0 = new yl(this, (byte) 3);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new Object();
        this.a = cm1Var;
        this.b = ylbVar;
        this.i = cm1Var.getResources().getDrawable(2131232824).mutate();
        Context context = cm1Var.getContext();
        uoc uocVar = uoc.H;
        if (uocVar == null) {
            uocVar = new uoc(context.getApplicationContext());
            uoc.H = uocVar;
        }
        this.k = uocVar;
        p09 p09Var = new p09(2131624352, gm.L(42.0f), gm.L(42.0f), false, null);
        this.l = p09Var;
        p09Var.M(cm1Var);
        p09Var.F(0);
        cm1Var.addOnAttachStateChangeListener(new um0(this, cm1Var, (byte) 2));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.N(1.0f));
        vl1 vl1Var = new vl1(cm1Var, (byte) 7);
        d53 d53Var = d53.h;
        this.Q = new ln(1.0f, vl1Var, 0L, 180L, d53Var);
        this.K = new ln(new vl1(cm1Var, (byte) 7), 320L, d53Var, 0);
        this.J = new ln(new vl1(cm1Var, (byte) 7), 320L, d53Var, 0);
        jmc jmcVar = new jmc(cm1Var, cm1Var);
        this.I = jmcVar;
        jmcVar.y = -1;
        rx4.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gm.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(gm.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, gm.L(48.0f), gm.L(48.0f), new int[]{16777215, cmb.p1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-gm.L(10.0f), 0.0f, gm.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        u51 u51Var = new u51(cm1Var);
        this.Y = u51Var;
        u51Var.f = new imc(this, (byte) 0);
        this.w0 = new ln(1.0f, new vl1(cm1Var, (byte) 7), 0L, 400L, d53Var);
    }

    public static int h() {
        return gm.L(206.0f);
    }

    public final void a(float f) {
        if (this.F == null) {
            zna znaVar = new zna(new xk4(this.C));
            this.F = znaVar;
            aoa aoaVar = new aoa(f);
            aoaVar.a(0.55f);
            aoaVar.b(280.0f);
            znaVar.m = aoaVar;
            this.F.f(0.001f);
            this.F.b(new gmc(this, (byte) 0));
        }
        this.F.c(f);
    }

    public final void b() {
        cm1 cm1Var = this.a;
        if (cm1Var.isShown()) {
            gm.W3(cm1Var);
        }
        zna znaVar = this.Z;
        if (znaVar != null) {
            znaVar.d();
        }
        zna znaVar2 = new zna(new xk4(this.a0));
        this.Z = znaVar2;
        aoa aoaVar = new aoa(1.0f);
        aoaVar.a(0.55f);
        aoaVar.b(280.0f);
        znaVar2.m = aoaVar;
        this.Z.f(0.001f);
        zna znaVar3 = this.Z;
        znaVar3.a = -3.0f;
        znaVar3.b(new gmc(this, (byte) 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f, float f2) {
        canvas.translate(0.0f, gm.L(4.0f) * this.c0);
        u51 u51Var = this.Y;
        canvas.scale(mlb.A(this.c0, 0.012f, 1.0f, u51Var.a(0.025f) * this.a0), mlb.B(this.c0, 0.04f, 1.0f, u51Var.a(0.025f) * this.a0), (gm.L(206.0f) / 2.0f) + f, f2 + gm.L(70.0f));
    }

    public final void d(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmc.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        kmc kmcVar = new kmc(this, this.b);
        this.d0 = kmcVar;
        kmcVar.g(4969977, cmb.p1(0.125f, -11807239), 4969977, cmb.p1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(gm.N(2.0f));
        kmc kmcVar2 = this.d0;
        kmcVar2.t = 2.0f;
        kmcVar2.y = this.h;
        kmcVar2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            this.j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            ln lnVar = this.K;
            if (lnVar.i) {
                this.M = false;
                this.N = 0L;
            }
            lnVar.e(true, 1.0f);
            this.t = 0.0f;
            ((ArrayList) this.u.b).clear();
            ho1 ho1Var = this.k0;
            this.k0 = null;
            this.a.invalidate();
            if (ho1Var != null) {
                gm.d3(ho1Var, 1L);
            }
        }
    }

    public final float g() {
        float f;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.v;
        if (j != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j)) / 1000.0f);
            if (this.h0) {
                f = 1.7883515f;
            } else {
                f = 0.0f;
            }
            float f2 = -min;
            float exp = (float) Math.exp(f2 / 0.2f);
            float f3 = (min * f) + this.r;
            float f4 = this.s - f;
            this.r = (((1.0f - exp) * (0.2f * f4)) + f3) % 6.2831855f;
            this.s = (f4 * exp) + f;
            float exp2 = (float) Math.exp(f2 / 0.75f);
            float f5 = this.r;
            float f6 = this.t;
            this.r = (((1.0f - exp2) * (0.75f * f6)) + f5) % 6.2831855f;
            float f7 = f6 * exp2;
            this.t = f7;
            if (f7 < 0.001f) {
                this.t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z) {
        float f = 0.0f;
        if (z) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z;
        lmc lmcVar = this.m;
        if (lmcVar != null) {
            if (!z) {
                f = 1.0f;
            }
            lmcVar.setAlpha(f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        cm1 cm1Var = this.a;
        if (cm1Var.getParent() != null) {
            cm1Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(d53.h);
        this.G.addUpdateListener(new dz1(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.k.F * 0.14f), 6.283185307179586d), (byte) 7));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            cm1 cm1Var = this.a;
            if (cm1Var.getParent() != null) {
                cm1Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        zna znaVar = this.F;
        if (znaVar != null) {
            znaVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.t = 0.0f;
        this.s = 0.0f;
        this.r = 0.0f;
        ((ArrayList) this.u.b).clear();
        lmc lmcVar = this.m;
        if (lmcVar != null) {
            lmcVar.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        zna znaVar = this.b0;
        if (znaVar != null) {
            znaVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        cm1 cm1Var = this.a;
        cm1Var.invalidate();
        if (cm1Var.getParent() instanceof View) {
            ((View) cm1Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        int i2;
        String M0;
        String str2;
        cm1 cm1Var = this.a;
        if (z2) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            zna znaVar = this.Z;
            if (znaVar != null) {
                znaVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            cm1Var.invalidate();
            if (cm1Var.getParent() instanceof View) {
                ((View) cm1Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.l.stop();
            this.H = false;
        }
        this.g0 = z;
        this.l0 = tL_messageActionGramTransfer;
        if (!z && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.i0 = z4;
        ln lnVar = this.K;
        if (z4) {
            lnVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z2) {
            lnVar.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        if (z && i == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z && i == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.h0 && z && i == 0) {
            b();
            g();
            this.t = 18.0f;
            this.u.z();
            cm1Var.invalidate();
        }
        if (z6) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            lnVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z5) {
            lnVar.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z6;
        if (z6) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        this.S = j;
        if (z6) {
            e();
            kmc kmcVar = this.d0;
            kmcVar.v = 0L;
            if (kmcVar.d() || this.d0.c()) {
                kmc kmcVar2 = this.d0;
                kmcVar2.b = -1L;
                kmcVar2.c = -1L;
            }
            cm1Var.invalidate();
        } else {
            kmc kmcVar3 = this.d0;
            if (kmcVar3 != null && this.e0 == 0 && !kmcVar3.d() && !this.d0.c()) {
                this.d0.a();
                cm1Var.invalidate();
            }
        }
        if (z5) {
            i2 = cmb.v0(cmb.p7, this.b);
        } else if (z) {
            i2 = -15352320;
        } else {
            i2 = -11814402;
        }
        this.y0 = z5;
        int i3 = this.U;
        if (i3 == 0) {
            this.V = i2;
            this.U = i2;
            this.T = i2;
        } else if (i2 != i3) {
            this.T = this.V;
            this.U = i2;
            this.J.e(true, 0.0f);
            cm1Var.invalidate();
        }
        if (z5) {
            M0 = jb6.M0(2131742642, null);
        } else if (z) {
            M0 = jb6.M0(2131742640, null);
        } else {
            M0 = jb6.M0(2131742641, null);
        }
        jmc jmcVar = this.I;
        if (z6) {
            jmcVar.g(10, M0, true);
        } else {
            jmcVar.h(10, M0);
        }
        SpannableStringBuilder u = c.u(c.s(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) u.getSpans(0, u.length(), RelativeSizeSpan.class)) {
            u.removeSpan(relativeSizeSpan);
        }
        if (z) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        u.insert(0, (CharSequence) str2);
        int indexOf = u.toString().indexOf(46);
        if (indexOf >= 0) {
            u.setSpan(new RelativeSizeSpan(0.75f), indexOf, u.length(), 33);
        }
        Object obj = new Object();
        u.setSpan(obj, 0, u.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.p("Grams", u, 2131749264));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        yl ylVar = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(ylVar), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(ylVar), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new uib(spannableStringBuilder, 16.0f, gm.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f = soc.f(soc.d(str3.toUpperCase(locale)));
        uib uibVar = new uib("", 9.3f, gm.n1("fonts/rmono.ttf"));
        uibVar.l(2);
        this.o0 = uibVar;
        uibVar.p(f);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            uib uibVar2 = new uib("", 10.0f, Typeface.create(gm.n1("fonts/rmono.ttf"), 1));
            this.p0 = uibVar2;
            uibVar2.p(TextUtils.ellipsize(gm.J2(str.toUpperCase(locale)), this.p0.a, gm.L(206.0f) - gm.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        uib uibVar3 = new uib("", 12.0f, null);
        uibVar3.l(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        uibVar3.a();
        uibVar3.o(gm.L(184.0f));
        this.q0 = uibVar3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb = new StringBuilder(25);
            for (int i4 = 0; i4 < 25; i4++) {
                sb.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
            ?? obj2 = new Object();
            obj2.a |= 256;
            spannableStringBuilder2.setSpan(new xkb(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.q0.p(spannableStringBuilder2);
            rna.c(cm1Var, this.q0.b, stack, arrayList);
            n(this.e);
            return;
        }
        uibVar3.p(gw3.m(tL_messageActionGramTransfer.comment, uibVar3.a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z) {
        this.e = z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rna) obj).invalidateSelf();
        }
    }

    public final void o(float f, float f2) {
        this.p = f;
        this.q = f2;
    }

    public final void p() {
        boolean z;
        if (this.m == null) {
            return;
        }
        if (this.x == -1 && !this.D) {
            this.A = g();
            this.B = this.k.F * 0.14f;
        }
        boolean z2 = true;
        if (this.x == -1 && !this.D && this.C <= 1.001f) {
            z = false;
        } else {
            z = true;
        }
        lmc lmcVar = this.m;
        float f = this.A;
        float f2 = this.B;
        if (!z && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z2 = false;
        }
        lmcVar.r = f;
        lmcVar.s = f2;
        lmcVar.w = z2;
        lmcVar.x = z;
    }

    public final void q() {
        if (this.h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
