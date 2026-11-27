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
public final class zoc {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public vpa F;
    public ValueAnimator G;
    public boolean H;
    public final woc I;
    public final mm J;
    public final mm K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final mm Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final v41 Y;
    public vpa Z;
    public final dl1 a;
    public float a0;
    public final vnb b;
    public vpa b0;
    public float c0;
    public xoc d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final hrc k;
    public gn1 k0;
    public final b29 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public yoc m;
    public boolean m0;
    public boolean n;
    public pkb n0;
    public boolean o;
    public pkb o0;
    public float p;
    public pkb p0;
    public float q;
    public pkb q0;
    public float r;
    public boolean r0;
    public float s;
    public wk1 s0;
    public float t;
    public int t0;
    public final zk u0;
    public long v;
    public int v0;
    public final mm w0;
    public final uoc x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final guc u = new guc();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public zoc(dl1 dl1Var, vnb vnbVar) {
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
        this.u0 = new zk(this, (byte) 3);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new Object();
        this.a = dl1Var;
        this.b = vnbVar;
        this.i = dl1Var.getResources().getDrawable(2131232830).mutate();
        Context context = dl1Var.getContext();
        hrc hrcVar = hrc.H;
        if (hrcVar == null) {
            hrcVar = new hrc(context.getApplicationContext());
            hrc.H = hrcVar;
        }
        this.k = hrcVar;
        b29 b29Var = new b29(2131624352, hl.L(42.0f), hl.L(42.0f), false, null);
        this.l = b29Var;
        b29Var.M(dl1Var);
        b29Var.F(0);
        dl1Var.addOnAttachStateChangeListener(new vl0(this, dl1Var, (byte) 2));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.N(1.0f));
        wk1 wk1Var = new wk1(dl1Var, (byte) 7);
        k43 k43Var = k43.h;
        this.Q = new mm(1.0f, wk1Var, 0L, 180L, k43Var);
        this.K = new mm(new wk1(dl1Var, (byte) 7), 320L, k43Var, 0);
        this.J = new mm(new wk1(dl1Var, (byte) 7), 320L, k43Var, 0);
        woc wocVar = new woc(dl1Var, dl1Var);
        this.I = wocVar;
        wocVar.y = -1;
        vx4.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(hl.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(hl.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, hl.L(48.0f), hl.L(48.0f), new int[]{16777215, aob.p1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-hl.L(10.0f), 0.0f, hl.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        v41 v41Var = new v41(dl1Var);
        this.Y = v41Var;
        v41Var.f = new voc(this, (byte) 0);
        this.w0 = new mm(1.0f, new wk1(dl1Var, (byte) 7), 0L, 400L, k43Var);
    }

    public static int h() {
        return hl.L(206.0f);
    }

    public final void a(float f) {
        if (this.F == null) {
            vpa vpaVar = new vpa(new xk4(this.C));
            this.F = vpaVar;
            wpa wpaVar = new wpa(f);
            wpaVar.a(0.55f);
            wpaVar.b(280.0f);
            vpaVar.m = wpaVar;
            this.F.f(0.001f);
            this.F.b(new toc(this, (byte) 0));
        }
        this.F.c(f);
    }

    public final void b() {
        dl1 dl1Var = this.a;
        if (dl1Var.isShown()) {
            hl.W3(dl1Var);
        }
        vpa vpaVar = this.Z;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = new vpa(new xk4(this.a0));
        this.Z = vpaVar2;
        wpa wpaVar = new wpa(1.0f);
        wpaVar.a(0.55f);
        wpaVar.b(280.0f);
        vpaVar2.m = wpaVar;
        this.Z.f(0.001f);
        vpa vpaVar3 = this.Z;
        vpaVar3.a = -3.0f;
        vpaVar3.b(new toc(this, (byte) 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f, float f2) {
        canvas.translate(0.0f, hl.L(4.0f) * this.c0);
        v41 v41Var = this.Y;
        canvas.scale(xnb.z(this.c0, 0.012f, 1.0f, v41Var.a(0.025f) * this.a0), xnb.B(this.c0, 0.04f, 1.0f, v41Var.a(0.025f) * this.a0), (hl.L(206.0f) / 2.0f) + f, f2 + hl.L(70.0f));
    }

    public final void d(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoc.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        xoc xocVar = new xoc(this, this.b);
        this.d0 = xocVar;
        xocVar.g(4969977, aob.p1(0.125f, -11807239), 4969977, aob.p1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(hl.N(2.0f));
        xoc xocVar2 = this.d0;
        xocVar2.t = 2.0f;
        xocVar2.y = this.h;
        xocVar2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            this.j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            mm mmVar = this.K;
            if (mmVar.i) {
                this.M = false;
                this.N = 0L;
            }
            mmVar.e(true, 1.0f);
            this.t = 0.0f;
            ((ArrayList) this.u.b).clear();
            gn1 gn1Var = this.k0;
            this.k0 = null;
            this.a.invalidate();
            if (gn1Var != null) {
                hl.d3(gn1Var, 1L);
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
        yoc yocVar = this.m;
        if (yocVar != null) {
            if (!z) {
                f = 1.0f;
            }
            yocVar.setAlpha(f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        dl1 dl1Var = this.a;
        if (dl1Var.getParent() != null) {
            dl1Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(k43.h);
        this.G.addUpdateListener(new gy1(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.k.F * 0.14f), 6.283185307179586d), (byte) 7));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            dl1 dl1Var = this.a;
            if (dl1Var.getParent() != null) {
                dl1Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        vpa vpaVar = this.F;
        if (vpaVar != null) {
            vpaVar.d();
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
        yoc yocVar = this.m;
        if (yocVar != null) {
            yocVar.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        vpa vpaVar = this.b0;
        if (vpaVar != null) {
            vpaVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        dl1 dl1Var = this.a;
        dl1Var.invalidate();
        if (dl1Var.getParent() instanceof View) {
            ((View) dl1Var.getParent()).invalidate();
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
        dl1 dl1Var = this.a;
        if (z2) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            vpa vpaVar = this.Z;
            if (vpaVar != null) {
                vpaVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            dl1Var.invalidate();
            if (dl1Var.getParent() instanceof View) {
                ((View) dl1Var.getParent()).invalidate();
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
        mm mmVar = this.K;
        if (z4) {
            mmVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z2) {
            mmVar.e(true, 1.0f);
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
            dl1Var.invalidate();
        }
        if (z6) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            mmVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z5) {
            mmVar.e(true, 1.0f);
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
            xoc xocVar = this.d0;
            xocVar.v = 0L;
            if (xocVar.d() || this.d0.c()) {
                xoc xocVar2 = this.d0;
                xocVar2.b = -1L;
                xocVar2.c = -1L;
            }
            dl1Var.invalidate();
        } else {
            xoc xocVar3 = this.d0;
            if (xocVar3 != null && this.e0 == 0 && !xocVar3.d() && !this.d0.c()) {
                this.d0.a();
                dl1Var.invalidate();
            }
        }
        if (z5) {
            i2 = aob.v0(aob.q7, this.b);
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
            dl1Var.invalidate();
        }
        if (z5) {
            M0 = ob6.M0(2131742610, null);
        } else if (z) {
            M0 = ob6.M0(2131742608, null);
        } else {
            M0 = ob6.M0(2131742609, null);
        }
        woc wocVar = this.I;
        if (z6) {
            wocVar.g(10, M0, true);
        } else {
            wocVar.h(10, M0);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.p("Grams", u, 2131749261));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        zk zkVar = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(zkVar), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(zkVar), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new pkb(spannableStringBuilder, 16.0f, hl.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f = frc.f(frc.d(str3.toUpperCase(locale)));
        pkb pkbVar = new pkb("", 9.3f, hl.n1("fonts/rmono.ttf"));
        pkbVar.l(2);
        this.o0 = pkbVar;
        pkbVar.p(f);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            pkb pkbVar2 = new pkb("", 10.0f, Typeface.create(hl.n1("fonts/rmono.ttf"), 1));
            this.p0 = pkbVar2;
            pkbVar2.p(TextUtils.ellipsize(hl.J2(str.toUpperCase(locale)), this.p0.a, hl.L(206.0f) - hl.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        pkb pkbVar3 = new pkb("", 12.0f, null);
        pkbVar3.l(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pkbVar3.a();
        pkbVar3.o(hl.L(184.0f));
        this.q0 = pkbVar3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb = new StringBuilder(25);
            for (int i4 = 0; i4 < 25; i4++) {
                sb.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
            ?? obj2 = new Object();
            obj2.a |= 256;
            spannableStringBuilder2.setSpan(new smb(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.q0.p(spannableStringBuilder2);
            npa.c(dl1Var, this.q0.b, stack, arrayList);
            n(this.e);
            return;
        }
        pkbVar3.p(pv3.m(tL_messageActionGramTransfer.comment, pkbVar3.a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z) {
        this.e = z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((npa) obj).invalidateSelf();
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
        yoc yocVar = this.m;
        float f = this.A;
        float f2 = this.B;
        if (!z && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z2 = false;
        }
        yocVar.r = f;
        yocVar.s = f2;
        yocVar.w = z2;
        yocVar.x = z;
    }

    public final void q() {
        if (this.h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
