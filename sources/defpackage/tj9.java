package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
public final class tj9 implements qkb, wgb {
    public static Paint U;
    public final AtomicReference E;
    public cn F;
    public final b66 G;
    public b66 H;
    public qa6 I;
    public i66 J;
    public kf9 K;
    public boolean L;
    public rna M;
    public CharacterStyle N;
    public int O;
    public int P;
    public gn Q;
    public ti9 R;
    public final RectF S;
    public View T;
    public final uj9 a;
    public final StaticLayout b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public final int h;
    public final int n;
    public boolean r;
    public final int s;
    public boolean w;
    public final ArrayList x;
    public final Stack y;

    public tj9(uj9 uj9Var, CharSequence charSequence, int i, Layout.Alignment alignment, float f) {
        Paint.FontMetricsInt fontMetricsInt;
        boolean z;
        float f2;
        rj9[] rj9VarArr;
        int i2;
        int i3;
        int i4;
        float f3;
        rj9[] rj9VarArr2;
        ti9[] ti9VarArr;
        boolean z2;
        TextPaint textPaint;
        int i5;
        dw3[] dw3VarArr;
        rj9[] rj9VarArr3;
        this.x = new ArrayList();
        this.y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.a = uj9Var;
        TextPaint textPaint2 = uj9Var.w;
        Paint.FontMetricsInt fontMetricsInt2 = textPaint2.getFontMetricsInt();
        boolean z3 = true;
        boolean z4 = false;
        if (wi8.A(charSequence)) {
            for (rj9 rj9Var : (rj9[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), rj9.class)) {
                int i6 = rj9Var.b & 15;
                if (i6 >= 1 && i6 <= 6) {
                    TextPaint textPaint3 = new TextPaint(textPaint2);
                    rj9Var.a(textPaint3);
                    fontMetricsInt = textPaint3.getFontMetricsInt();
                    z = true;
                    break;
                }
            }
        }
        fontMetricsInt = fontMetricsInt2;
        z = false;
        if (z) {
            f2 = 0.85f;
        } else {
            f2 = 1.0f;
        }
        CharSequence n = gw3.n(charSequence, fontMetricsInt, false, null, 0, f2, 0);
        if (n instanceof Spanned) {
            Spanned spanned = (Spanned) n;
            if (((gn[]) spanned.getSpans(0, spanned.length(), gn.class)).length != 0 || ((dw3[]) spanned.getSpans(0, spanned.length(), dw3.class)).length != 0 || ((ti9[]) spanned.getSpans(0, spanned.length(), ti9.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n);
                for (gn gnVar : (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class)) {
                    gnVar.setPreserveFontMetrics(true);
                }
                for (dw3 dw3Var : (dw3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dw3.class)) {
                    dw3Var.e = true;
                }
                for (ti9 ti9Var : (ti9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ti9.class)) {
                    if (ti9Var.a.a.s > 0) {
                        ti9Var.e = true;
                    }
                }
                int i7 = 0;
                while (i7 < spannableStringBuilder.length()) {
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i7);
                    if (indexOf >= 0) {
                        z2 = z3;
                    } else {
                        z2 = z4;
                    }
                    indexOf = z2 ? indexOf : spannableStringBuilder.length();
                    pd0 s = s(spannableStringBuilder, i7, indexOf, textPaint2);
                    int i8 = s.b;
                    if (i8 > 0 && s.a * 100 >= i8 * 70 && (i5 = s.c) > 0) {
                        gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(i7, indexOf, gn.class);
                        int length = gnVarArr.length;
                        int i9 = 0;
                        while (i9 < length) {
                            gn gnVar2 = gnVarArr[i9];
                            TextPaint textPaint4 = textPaint2;
                            int spanStart = spannableStringBuilder.getSpanStart(gnVar2);
                            if (spanStart >= i7 && spanStart < indexOf) {
                                gnVar2.setMinimumLineHeight(i5);
                            }
                            i9++;
                            textPaint2 = textPaint4;
                        }
                        textPaint = textPaint2;
                        for (dw3 dw3Var2 : (dw3[]) spannableStringBuilder.getSpans(i7, indexOf, dw3.class)) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(dw3Var2);
                            if (spanStart2 >= i7 && spanStart2 < indexOf) {
                                dw3Var2.f = i5;
                            }
                        }
                        ti9[] ti9VarArr2 = (ti9[]) spannableStringBuilder.getSpans(i7, indexOf, ti9.class);
                        int length2 = ti9VarArr2.length;
                        int i10 = 0;
                        while (i10 < length2) {
                            ti9 ti9Var2 = ti9VarArr2[i10];
                            int spanStart3 = spannableStringBuilder.getSpanStart(ti9Var2);
                            ti9[] ti9VarArr3 = ti9VarArr2;
                            if (ti9Var2.a.a.s > 0 && spanStart3 >= i7 && spanStart3 < indexOf) {
                                ti9Var2.f = i5;
                            }
                            i10++;
                            ti9VarArr2 = ti9VarArr3;
                        }
                    } else {
                        textPaint = textPaint2;
                    }
                    if (!z2) {
                        break;
                    }
                    i7 = indexOf + 1;
                    textPaint2 = textPaint;
                    z3 = true;
                    z4 = false;
                }
                n = spannableStringBuilder;
            }
        }
        int d = zk9.d(n);
        this.s = d;
        if (d == 0 && (n instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n;
            ti9[] ti9VarArr4 = (ti9[]) spanned2.getSpans(0, n.length(), ti9.class);
            if (ti9VarArr4.length > 0) {
                Arrays.sort(ti9VarArr4, new yb2(spanned2, (byte) 2));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n);
                int length3 = ti9VarArr4.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length3) {
                        ti9 ti9Var3 = ti9VarArr4[i11];
                        int spanStart4 = spanned2.getSpanStart(ti9Var3);
                        int spanEnd = spanned2.getSpanEnd(ti9Var3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        tj9 tj9Var = ti9Var3.a.a;
                        if (tj9Var.s == 0) {
                            break;
                        }
                        spannableStringBuilder2.replace(spanStart4, spanEnd, tj9Var.b.getText());
                        i11++;
                    } else {
                        this.s = zk9.d(spannableStringBuilder2);
                        break;
                    }
                }
            }
        }
        if (this.s > 0 && (n instanceof Spanned)) {
            for (rj9 rj9Var2 : (rj9[]) ((Spanned) n).getSpans(0, n.length(), rj9.class)) {
                if ((rj9Var2.b & 15) == 14) {
                    rj9Var2.d = true;
                }
            }
        }
        if (n instanceof Spanned) {
            rj9[] rj9VarArr4 = (rj9[]) ((Spanned) n).getSpans(0, n.length(), rj9.class);
            int length4 = rj9VarArr4.length;
            for (int i12 = 0; i12 < length4 && (rj9VarArr4[i12].b & 15) == 0; i12++) {
            }
        }
        this.b = k47.f5(f, 0.0f, i, alignment, uj9Var.w, n, false);
        this.f = i;
        this.h = 0;
        for (int i13 = 0; i13 < this.b.getLineCount(); i13++) {
            this.f = Math.min(this.f, (int) Math.floor(this.b.getLineLeft(i13)));
            this.h = Math.max(this.h, (int) Math.ceil(this.b.getLineRight(i13)));
        }
        this.n = 0;
        if (this.b.getLineCount() > 0) {
            StaticLayout staticLayout = this.b;
            this.n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        b66 b66Var = null;
        rna.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (rj9 rj9Var3 : (rj9[]) spanned3.getSpans(0, spanned3.length(), rj9.class)) {
                int i14 = rj9Var3.b;
                if (TLObject.hasFlag(i14, 8192)) {
                    int spanStart5 = spanned3.getSpanStart(rj9Var3);
                    int spanEnd2 = spanned3.getSpanEnd(rj9Var3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (b66Var == null) {
                            i2 = 0;
                            b66Var = new b66(0);
                            b66Var.n = false;
                        } else {
                            i2 = 0;
                        }
                        b66Var.d(this.b, spanStart5, 0.0f);
                        if (TLObject.hasFlag(i14, 4096)) {
                            i3 = -gm.L(6.0f);
                        } else if (TLObject.hasFlag(i14, 2048)) {
                            i3 = gm.L(2.0f);
                        } else {
                            i3 = i2;
                        }
                        if (i3 != 0) {
                            if (i3 > 0) {
                                f3 = 5.0f;
                            } else {
                                f3 = -2.0f;
                            }
                            i4 = i3 + gm.L(f3);
                        } else {
                            i4 = i2;
                        }
                        b66Var.o = i4;
                        this.b.getSelectionPath(spanStart5, spanEnd2, b66Var);
                    }
                }
            }
            if (b66Var != null) {
                b66Var.n = true;
                this.G = b66Var;
            }
        }
    }

    public static pd0 s(Spanned spanned, int i, int i2, TextPaint textPaint) {
        int[] iArr;
        ti9[] ti9VarArr;
        ti9 ti9Var;
        int i3;
        int i4;
        ?? obj = new Object();
        int i5 = i2 - i;
        if (i5 > 0) {
            gn[] gnVarArr = (gn[]) spanned.getSpans(i, i2, gn.class);
            dw3[] dw3VarArr = (dw3[]) spanned.getSpans(i, i2, dw3.class);
            if (gnVarArr.length == 0 && dw3VarArr.length == 0) {
                iArr = null;
            } else {
                iArr = new int[i5];
            }
            int length = gnVarArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i6;
                gn gnVar = gnVarArr[i7];
                int spanStart = spanned.getSpanStart(gnVar);
                int min = Math.min(i2, spanned.getSpanEnd(gnVar));
                if (spanStart >= i && spanStart < i2 && min > spanStart) {
                    int i8 = spanStart - i;
                    iArr[i8] = Math.max(iArr[i8], min);
                    i4 = i7;
                    obj.c = Math.max(obj.c, gnVar.getSize(textPaint, spanned, spanStart, min, null) + 1);
                } else {
                    i4 = i7;
                }
                i6 = i4 + 1;
            }
            for (dw3 dw3Var : dw3VarArr) {
                int spanStart2 = spanned.getSpanStart(dw3Var);
                int min2 = Math.min(i2, spanned.getSpanEnd(dw3Var));
                if (spanStart2 >= i && spanStart2 < i2 && min2 > spanStart2) {
                    int i9 = spanStart2 - i;
                    iArr[i9] = Math.max(iArr[i9], min2);
                    obj.c = Math.max(obj.c, dw3Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            ti9[] ti9VarArr2 = (ti9[]) spanned.getSpans(i, i2, ti9.class);
            if (ti9VarArr2.length > 0) {
                ti9VarArr = null;
                for (ti9 ti9Var2 : ti9VarArr2) {
                    int spanStart3 = spanned.getSpanStart(ti9Var2);
                    if (ti9Var2.a.a.s > 0 && spanStart3 >= i && spanStart3 < i2) {
                        if (ti9VarArr == null) {
                            ti9VarArr = new ti9[i5];
                        }
                        ti9VarArr[spanStart3 - i] = ti9Var2;
                    }
                }
            } else {
                ti9VarArr = null;
            }
            if (iArr != null || ti9VarArr != null) {
                int i10 = i;
                while (i10 < i2) {
                    int i11 = i10 - i;
                    if (ti9VarArr == null) {
                        ti9Var = null;
                    } else {
                        ti9Var = ti9VarArr[i11];
                    }
                    if (ti9Var != null) {
                        ri9 ri9Var = ti9Var.a;
                        tj9 tj9Var = ri9Var.a;
                        tj9 tj9Var2 = ri9Var.a;
                        if (tj9Var.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) tj9Var2.b.getText();
                            pd0 s = s(spanned2, 0, spanned2.length(), tj9Var2.b.getPaint());
                            obj.a += s.a;
                            obj.b += Math.max(1, s.b);
                            obj.c = Math.max(obj.c, s.c);
                            i10 = Math.min(i2, spanned.getSpanEnd(ti9Var));
                        }
                    }
                    if (iArr == null) {
                        i3 = 0;
                    } else {
                        i3 = iArr[i11];
                    }
                    if (i3 > i10) {
                        obj.a++;
                        obj.b++;
                        i10 = i3;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i10);
                        if (!Character.isWhitespace(codePointAt)) {
                            obj.b++;
                        }
                        i10 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return obj;
    }

    @Override
    public final Layout a() {
        return this.b;
    }

    @Override
    public final int b() {
        return this.s;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        int i;
        int i2;
        View view2;
        boolean z;
        int i3;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        uj9 uj9Var = this.a;
        boolean D = uj9Var.D();
        TextPaint textPaint = uj9Var.w;
        if (D) {
            i = cmb.Vc;
        } else {
            i = cmb.Uc;
        }
        int v0 = cmb.v0(i, uj9Var.D);
        textPaint.setColor(v0);
        if (uj9Var.D()) {
            i2 = cmb.Xc;
        } else {
            i2 = cmb.Wc;
        }
        textPaint.linkColor = cmb.v0(i2, uj9Var.D);
        b66 b66Var = this.G;
        if (b66Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(b66.c());
            }
            U.setColor((uj9Var.y.h() & 16777215) | 855638016);
            canvas.drawPath(b66Var, U);
        }
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.T;
        }
        i66 i66Var = this.J;
        if (i66Var != null && i66Var.g(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.x;
        rna.g(view2, false, v0, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        boa.a(canvas, staticLayout2);
        if (!uj9Var.E()) {
            gn.drawAnimatedEmojis(canvas, this.b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f = uj9Var.V;
        if (f > 0.0f) {
            k47 k47Var = uj9Var.b;
            if (!uj9Var.O && (k47Var == null || !oc7.r1(uj9Var.a).i4.z(k47Var))) {
                z = false;
            } else {
                z = true;
            }
            if (this.I == null) {
                qa6 qa6Var = new qa6();
                this.I = qa6Var;
                qa6Var.D = true;
                b66 b66Var2 = new b66(0);
                this.H = b66Var2;
                b66Var2.c = true;
                qa6 qa6Var2 = this.I;
                qa6Var2.y = b66Var2;
                qa6Var2.j(5.0f);
                this.I.b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                b66 b66Var3 = this.H;
                b66Var3.n = true;
                b66Var3.a();
                this.I.k();
            }
            qa6 qa6Var3 = this.I;
            if (z) {
                if (qa6Var3.d() || this.I.c()) {
                    qa6 qa6Var4 = this.I;
                    qa6Var4.b = -1L;
                    qa6Var4.c = -1L;
                }
            } else if (!qa6Var3.d() && !this.I.c()) {
                this.I.a();
            }
            if (uj9Var.D()) {
                i3 = cmb.Xc;
            } else {
                i3 = cmb.Wc;
            }
            int v02 = cmb.v0(i3, uj9Var.D);
            this.I.g(cmb.p1(0.05f, v02), cmb.p1(0.15f, v02), cmb.p1(0.1f, v02), cmb.p1(0.3f, v02));
            this.I.setAlpha((int) (f * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(ti9 ti9Var, float f, float f2) {
        float L = gm.L(8.0f);
        RectF rectF = ti9Var.c;
        if (f < rectF.left - L || f >= rectF.right + L || f2 < rectF.top - L || f2 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            ti9 ti9Var2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                ti9[] ti9VarArr = (ti9[]) spanned.getSpans(0, spanned.length(), ti9.class);
                if (ti9VarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(ti9VarArr[0]);
                    int spanEnd = spanned.getSpanEnd(ti9VarArr[0]);
                    int i = 0;
                    while (true) {
                        if (i < spanned.length()) {
                            if ((i < spanStart || i >= spanEnd) && !Character.isWhitespace(spanned.charAt(i))) {
                                break;
                            }
                            i++;
                        } else {
                            ti9Var2 = ti9VarArr[0];
                            break;
                        }
                    }
                }
            }
            if (ti9Var != ti9Var2 || !this.S.contains(f, f2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void f(View view) {
        View view2 = this.T;
        if (view2 == view && view2 != null) {
            this.T = null;
            gn.release((View) null, this.F);
            this.F = null;
            i66 i66Var = this.J;
            if (i66Var != null) {
                i66Var.c = null;
            }
            ti9[] p = p();
            if (p != null) {
                for (ti9 ti9Var : p) {
                    View view3 = this.T;
                    ti9Var.h = null;
                    ti9Var.a.a.f(view3);
                }
            }
        }
    }

    @Override
    public final void g(int i) {
        this.e = i;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.e;
    }

    @Override
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override
    public final int getX() {
        return this.c;
    }

    @Override
    public final int getY() {
        return this.d;
    }

    @Override
    public final void h(int i) {
        this.d = i;
    }

    @Override
    public final void i(View view) {
        boolean z;
        View view2 = this.T;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.T = view;
            if (this.a.v && !this.w) {
                z = true;
            } else {
                z = false;
            }
            this.F = gn.update(0, view, z, this.F, this.b);
            i66 i66Var = this.J;
            if (i66Var != null) {
                i66Var.c = this.T;
            }
            ti9[] p = p();
            if (p != null) {
                for (ti9 ti9Var : p) {
                    View view3 = this.T;
                    ti9Var.h = view3;
                    ti9Var.a.a(view3);
                }
            }
        }
    }

    @Override
    public final void j(int i) {
        this.c = i;
    }

    public final void k() {
        kf9 kf9Var = this.K;
        if (kf9Var != null) {
            gm.r(kf9Var);
            this.K = null;
        }
    }

    public final void l(android.text.style.CharacterStyle r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj9.l(android.text.style.CharacterStyle, boolean):void");
    }

    public final void m(Canvas canvas, int i, float f) {
        int i2;
        int i3;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        uj9 uj9Var = this.a;
        boolean D = uj9Var.D();
        TextPaint textPaint = uj9Var.w;
        if (D) {
            i2 = cmb.Vc;
        } else {
            i2 = cmb.Uc;
        }
        int v0 = cmb.v0(i2, uj9Var.D);
        textPaint.setColor(v0);
        if (uj9Var.D()) {
            i3 = cmb.Xc;
        } else {
            i3 = cmb.Wc;
        }
        textPaint.linkColor = cmb.v0(i3, uj9Var.D);
        oi7.b(canvas, this.b, i, f, new yg(this, this.T, v0, (byte) 13));
        canvas.restore();
    }

    public final int n() {
        if (this.r) {
            return 0;
        }
        return this.f;
    }

    public final boolean o(CharacterStyle characterStyle, ii9 ii9Var) {
        StaticLayout staticLayout = this.b;
        if (staticLayout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) staticLayout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart >= 0 && spanEnd > spanStart) {
                ii9Var.a = staticLayout;
                ii9Var.b = spanStart;
                ii9Var.c = spanEnd;
                ii9Var.d = staticLayout.getWidth();
                return true;
            }
            return false;
        }
        return false;
    }

    public final ti9[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (ti9[]) spanned.getSpans(0, spanned.length(), ti9.class);
    }

    public final int q() {
        return Math.max(0, this.n - this.f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        rj9 rj9Var;
        rj9 rj9Var2;
        int spanEnd;
        rj9 rj9Var3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n = n() + ((int) motionEvent.getX());
        int y = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        uj9 uj9Var = this.a;
        StaticLayout staticLayout = this.b;
        boolean z3 = true;
        int i = 0;
        if (actionMasked == 0) {
            this.M = null;
            this.N = null;
            this.Q = null;
            this.R = null;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                rna rnaVar = (rna) obj;
                if (rnaVar.getBounds().contains(n, y)) {
                    this.M = rnaVar;
                    return true;
                }
            }
            ti9[] p = p();
            if (p != null) {
                for (ti9 ti9Var : p) {
                    if (e(ti9Var, n, y)) {
                        ri9 ri9Var = ti9Var.a;
                        if (ri9Var.b) {
                            return true;
                        }
                        this.R = ti9Var;
                        this.L = false;
                        ri9Var.n(true);
                        View view = this.T;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y >= 0 && y < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f = n;
                if (f >= lineLeft && f <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.N = clickableSpan;
                        this.O = spannable.getSpanStart(clickableSpan);
                        this.P = spannable.getSpanEnd(this.N);
                        this.L = false;
                        m66 m66Var = new m66(this.N, uj9Var.D, f, y, 0);
                        b66 b = m66Var.b();
                        b.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b);
                        i66 i66Var = this.J;
                        if (i66Var == null) {
                            i66Var = new i66(this.T);
                            this.J = i66Var;
                        }
                        i66Var.a(m66Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    rj9[] rj9VarArr = (rj9[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, rj9.class);
                    if (rj9VarArr != null) {
                        int length = rj9VarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            z2 = z3;
                            rj9Var = rj9VarArr[i3];
                            if (TLObject.hasFlag(rj9Var.b, 256)) {
                                break;
                            }
                            i3++;
                            z3 = z2;
                        }
                    }
                    z2 = z3;
                    rj9Var = null;
                    if (rj9Var != null) {
                        int spanStart2 = spannable.getSpanStart(rj9Var);
                        int spanEnd2 = spannable.getSpanEnd(rj9Var);
                        while (spanStart2 > 0) {
                            int i4 = spanStart2 - 1;
                            rj9[] rj9VarArr2 = (rj9[]) spannable.getSpans(i4, i4, rj9.class);
                            int length2 = rj9VarArr2.length;
                            int i5 = i;
                            while (true) {
                                if (i5 < length2) {
                                    rj9Var3 = rj9VarArr2[i5];
                                    if (TLObject.hasFlag(rj9Var3.b, 256)) {
                                        break;
                                    }
                                    i5++;
                                } else {
                                    rj9Var3 = null;
                                    break;
                                }
                            }
                            if (rj9Var3 == null || (spanStart = spannable.getSpanStart(rj9Var3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            rj9[] rj9VarArr3 = (rj9[]) spannable.getSpans(spanEnd2, spanEnd2, rj9.class);
                            int length3 = rj9VarArr3.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length3) {
                                    rj9Var2 = rj9VarArr3[i6];
                                    if (TLObject.hasFlag(rj9Var2.b, 256)) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    rj9Var2 = null;
                                    break;
                                }
                            }
                            if (rj9Var2 == null || (spanEnd = spannable.getSpanEnd(rj9Var2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = rj9Var;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        m66 m66Var2 = new m66(rj9Var, uj9Var.D, f, y, 0);
                        b66 b2 = m66Var2.b();
                        b2.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b2);
                        i66 i66Var2 = this.J;
                        if (i66Var2 == null) {
                            i66Var2 = new i66(this.T);
                            this.J = i66Var2;
                        }
                        i66Var2.a(m66Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z2;
                    }
                    gn[] gnVarArr = (gn[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gn.class);
                    if (gnVarArr != null && gnVarArr.length > 0) {
                        this.Q = gnVarArr[0];
                        return z2;
                    }
                }
            }
            return false;
        } else if (actionMasked == 2) {
            ti9 ti9Var2 = this.R;
            if (ti9Var2 != null) {
                if (e(ti9Var2, n, y)) {
                    return true;
                }
                k();
                this.R.a.n(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.R != null) {
                k();
                ti9 ti9Var3 = this.R;
                this.R = null;
                ti9Var3.a.n(false);
                if (!this.L) {
                    View view4 = this.T;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    rc2 rc2Var = uj9Var.E;
                    mc2 mc2Var = uj9Var.F;
                    if (rc2Var != null && mc2Var != null) {
                        mc2Var.L0(rc2Var, ti9Var3.b);
                    }
                    z = false;
                } else {
                    z = false;
                }
                this.L = z;
                return true;
            } else if (this.M != null) {
                float width = staticLayout.getWidth();
                float height = staticLayout.getHeight();
                float sqrt = (float) Math.sqrt((height * height) + (width * width));
                View view5 = this.T;
                this.M.q = new sj9(this, view5, uj9Var);
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ((rna) obj2).j(n, y, sqrt, false);
                }
                if (view5 != null) {
                    view5.playSoundEffect(0);
                }
                this.M = null;
                return true;
            } else if (this.N != null) {
                k();
                if (!this.L) {
                    l(this.N, false);
                }
                i66 i66Var3 = this.J;
                if (i66Var3 != null) {
                    i66Var3.e(true);
                }
                this.N = null;
                this.L = false;
                return true;
            } else {
                gn gnVar = this.Q;
                if (gnVar == null) {
                    return false;
                }
                this.Q = null;
                rc2 rc2Var2 = uj9Var.E;
                mc2 mc2Var2 = uj9Var.F;
                if (rc2Var2 != null && mc2Var2 != null) {
                    View view6 = this.T;
                    if (view6 != null) {
                        view6.playSoundEffect(0);
                    }
                    mc2Var2.D1(gnVar);
                    return true;
                }
                return true;
            }
        } else if (actionMasked == 3) {
            this.M = null;
            this.Q = null;
            if (this.R != null) {
                k();
                this.R.a.n(false);
                this.R = null;
                this.L = false;
            }
            if (this.N != null) {
                k();
                i66 i66Var4 = this.J;
                if (i66Var4 != null) {
                    i66Var4.e(true);
                }
                this.N = null;
                this.L = false;
                return false;
            }
        }
        return false;
    }

    public final void u() {
        k();
        kf9 kf9Var = new kf9(this, (byte) 5);
        this.K = kf9Var;
        gm.d3(kf9Var, ViewConfiguration.getLongPressTimeout());
    }

    public tj9(uj9 uj9Var, SpannableStringBuilder spannableStringBuilder, int i, Layout.Alignment alignment) {
        this(uj9Var, spannableStringBuilder, i, alignment, 1.0f);
    }

    public tj9(uj9 uj9Var, SpannableStringBuilder spannableStringBuilder, int i) {
        this(uj9Var, spannableStringBuilder, i, Layout.Alignment.ALIGN_NORMAL);
    }
}
