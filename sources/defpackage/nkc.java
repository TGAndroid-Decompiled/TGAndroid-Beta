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
public final class nkc {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public yla F;
    public ValueAnimator G;
    public boolean H;
    public final kkc I;
    public final lm J;
    public final lm K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final lm Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final n41 Y;
    public yla Z;
    public final uk1 a;
    public float a0;
    public final wjb b;
    public yla b0;
    public float c0;
    public lkc d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final umc k;
    public vm1 k0;
    public final oy8 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public mkc m;
    public boolean m0;
    public boolean n;
    public tgb n0;
    public boolean o;
    public tgb o0;
    public float p;
    public tgb p0;
    public float q;
    public tgb q0;
    public float r;
    public boolean r0;
    public float s;
    public nk1 s0;
    public float t;
    public int t0;
    public final yk u0;
    public long v;
    public int v0;
    public final lm w0;
    public final ikc x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final spc u = new spc();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public nkc(uk1 uk1Var, wjb wjbVar) {
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
        this.u0 = new yk(this, (byte) 3);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new Object();
        this.a = uk1Var;
        this.b = wjbVar;
        this.i = uk1Var.getResources().getDrawable(2131232811).mutate();
        Context context = uk1Var.getContext();
        umc umcVar = umc.H;
        if (umcVar == null) {
            umcVar = new umc(context.getApplicationContext());
            umc.H = umcVar;
        }
        this.k = umcVar;
        oy8 oy8Var = new oy8(2131624352, gl.L(42.0f), gl.L(42.0f), false, null);
        this.l = oy8Var;
        oy8Var.M(uk1Var);
        oy8Var.F(0);
        uk1Var.addOnAttachStateChangeListener(new ul0(this, uk1Var, (byte) 2));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.N(1.0f));
        nk1 nk1Var = new nk1(uk1Var, (byte) 7);
        s33 s33Var = s33.h;
        this.Q = new lm(1.0f, nk1Var, 0L, 180L, s33Var);
        this.K = new lm(new nk1(uk1Var, (byte) 7), 320L, s33Var, 0);
        this.J = new lm(new nk1(uk1Var, (byte) 7), 320L, s33Var, 0);
        kkc kkcVar = new kkc(uk1Var, uk1Var);
        this.I = kkcVar;
        kkcVar.y = -1;
        qv4.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gl.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(gl.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, gl.L(48.0f), gl.L(48.0f), new int[]{16777215, bkb.p1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-gl.L(10.0f), 0.0f, gl.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        n41 n41Var = new n41(uk1Var);
        this.Y = n41Var;
        n41Var.f = new jkc(this, (byte) 0);
        this.w0 = new lm(1.0f, new nk1(uk1Var, (byte) 7), 0L, 400L, s33Var);
    }

    public static int h() {
        return gl.L(206.0f);
    }

    public final void a(float f) {
        if (this.F == null) {
            yla ylaVar = new yla(new ti4(this.C));
            this.F = ylaVar;
            zla zlaVar = new zla(f);
            zlaVar.a(0.55f);
            zlaVar.b(280.0f);
            ylaVar.m = zlaVar;
            this.F.f(0.001f);
            this.F.b(new hkc(this, (byte) 0));
        }
        this.F.c(f);
    }

    public final void b() {
        uk1 uk1Var = this.a;
        if (uk1Var.isShown()) {
            gl.X3(uk1Var);
        }
        yla ylaVar = this.Z;
        if (ylaVar != null) {
            ylaVar.d();
        }
        yla ylaVar2 = new yla(new ti4(this.a0));
        this.Z = ylaVar2;
        zla zlaVar = new zla(1.0f);
        zlaVar.a(0.55f);
        zlaVar.b(280.0f);
        ylaVar2.m = zlaVar;
        this.Z.f(0.001f);
        yla ylaVar3 = this.Z;
        ylaVar3.a = -3.0f;
        ylaVar3.b(new hkc(this, (byte) 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f, float f2) {
        canvas.translate(0.0f, gl.L(4.0f) * this.c0);
        n41 n41Var = this.Y;
        canvas.scale(yjb.z(this.c0, 0.012f, 1.0f, n41Var.a(0.025f) * this.a0), yjb.B(this.c0, 0.04f, 1.0f, n41Var.a(0.025f) * this.a0), (gl.L(206.0f) / 2.0f) + f, f2 + gl.L(70.0f));
    }

    public final void d(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkc.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        lkc lkcVar = new lkc(this, this.b);
        this.d0 = lkcVar;
        lkcVar.g(4969977, bkb.p1(0.125f, -11807239), 4969977, bkb.p1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(gl.N(2.0f));
        lkc lkcVar2 = this.d0;
        lkcVar2.t = 2.0f;
        lkcVar2.y = this.h;
        lkcVar2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            this.j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            lm lmVar = this.K;
            if (lmVar.i) {
                this.M = false;
                this.N = 0L;
            }
            lmVar.e(true, 1.0f);
            this.t = 0.0f;
            ((ArrayList) this.u.b).clear();
            vm1 vm1Var = this.k0;
            this.k0 = null;
            this.a.invalidate();
            if (vm1Var != null) {
                gl.e3(vm1Var, 1L);
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
        mkc mkcVar = this.m;
        if (mkcVar != null) {
            if (!z) {
                f = 1.0f;
            }
            mkcVar.setAlpha(f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        uk1 uk1Var = this.a;
        if (uk1Var.getParent() != null) {
            uk1Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(s33.h);
        this.G.addUpdateListener(new qx1(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.k.F * 0.14f), 6.283185307179586d), (byte) 7));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            uk1 uk1Var = this.a;
            if (uk1Var.getParent() != null) {
                uk1Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        yla ylaVar = this.F;
        if (ylaVar != null) {
            ylaVar.d();
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
        mkc mkcVar = this.m;
        if (mkcVar != null) {
            mkcVar.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        yla ylaVar = this.b0;
        if (ylaVar != null) {
            ylaVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        uk1 uk1Var = this.a;
        uk1Var.invalidate();
        if (uk1Var.getParent() instanceof View) {
            ((View) uk1Var.getParent()).invalidate();
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
        uk1 uk1Var = this.a;
        if (z2) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            yla ylaVar = this.Z;
            if (ylaVar != null) {
                ylaVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            uk1Var.invalidate();
            if (uk1Var.getParent() instanceof View) {
                ((View) uk1Var.getParent()).invalidate();
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
        lm lmVar = this.K;
        if (z4) {
            lmVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z2) {
            lmVar.e(true, 1.0f);
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
            uk1Var.invalidate();
        }
        if (z6) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            lmVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z5) {
            lmVar.e(true, 1.0f);
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
            lkc lkcVar = this.d0;
            lkcVar.v = 0L;
            if (lkcVar.d() || this.d0.c()) {
                lkc lkcVar2 = this.d0;
                lkcVar2.b = -1L;
                lkcVar2.c = -1L;
            }
            uk1Var.invalidate();
        } else {
            lkc lkcVar3 = this.d0;
            if (lkcVar3 != null && this.e0 == 0 && !lkcVar3.d() && !this.d0.c()) {
                this.d0.a();
                uk1Var.invalidate();
            }
        }
        if (z5) {
            i2 = bkb.v0(bkb.p7, this.b);
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
            uk1Var.invalidate();
        }
        if (z5) {
            M0 = k96.M0(2131742716, null);
        } else if (z) {
            M0 = k96.M0(2131742714, null);
        } else {
            M0 = k96.M0(2131742715, null);
        }
        kkc kkcVar = this.I;
        if (z6) {
            kkcVar.g(10, M0, true);
        } else {
            kkcVar.h(10, M0);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.p("Grams", u, 2131749315));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        yk ykVar = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(ykVar), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(ykVar), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new tgb(spannableStringBuilder, 16.0f, gl.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f = smc.f(smc.d(str3.toUpperCase(locale)));
        tgb tgbVar = new tgb("", 9.3f, gl.n1("fonts/rmono.ttf"));
        tgbVar.l(2);
        this.o0 = tgbVar;
        tgbVar.p(f);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            tgb tgbVar2 = new tgb("", 10.0f, Typeface.create(gl.n1("fonts/rmono.ttf"), 1));
            this.p0 = tgbVar2;
            tgbVar2.p(TextUtils.ellipsize(gl.K2(str.toUpperCase(locale)), this.p0.a, gl.L(206.0f) - gl.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        tgb tgbVar3 = new tgb("", 12.0f, null);
        tgbVar3.l(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        tgbVar3.a();
        tgbVar3.o(gl.L(184.0f));
        this.q0 = tgbVar3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb = new StringBuilder(25);
            for (int i4 = 0; i4 < 25; i4++) {
                sb.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
            ?? obj2 = new Object();
            obj2.a |= 256;
            spannableStringBuilder2.setSpan(new wib(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.q0.p(spannableStringBuilder2);
            qla.c(uk1Var, this.q0.b, stack, arrayList);
            n(this.e);
            return;
        }
        tgbVar3.p(vu3.m(tL_messageActionGramTransfer.comment, tgbVar3.a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z) {
        this.e = z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qla) obj).invalidateSelf();
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
        mkc mkcVar = this.m;
        float f = this.A;
        float f2 = this.B;
        if (!z && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z2 = false;
        }
        mkcVar.r = f;
        mkcVar.s = f2;
        mkcVar.w = z2;
        mkcVar.x = z;
    }

    public final void q() {
        if (this.h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
