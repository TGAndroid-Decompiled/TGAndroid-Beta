package org.telegram.messenger;

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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.y70;
import org.telegram.ui.ug0;
import org.telegram.ui.vg0;
public final class jv implements org.telegram.ui.Cells.t9, fx0 {
    public static Paint T;
    public final AtomicReference D;
    public org.telegram.ui.Components.n5 E;
    public final s70 F;
    public s70 G;
    public b80 H;
    public n2.n0 I;
    public ds J;
    public boolean K;
    public xh.f L;
    public CharacterStyle M;
    public int N;
    public int O;
    public org.telegram.ui.Components.r5 P;
    public iu Q;
    public final RectF R;
    public View S;
    public final kv f23604a;
    public final StaticLayout f23605b;
    public int f23606c;
    public int d;
    public int f23607e;
    public final int f23608f;
    public final int h;
    public final int f23609n;
    public boolean f23610r;
    public final int f23611s;
    public boolean f23612w;
    public final ArrayList f23613x;
    public final Stack f23614y;

    public jv(kv kvVar, CharSequence charSequence, int i7) {
        this(kvVar, charSequence, i7, Layout.Alignment.ALIGN_NORMAL);
    }

    public static b7.d s(Spanned spanned, int i7, int i10, TextPaint textPaint) {
        int[] iArr;
        iu[] iuVarArr;
        iu iuVar;
        int i11;
        int i12;
        ?? obj = new Object();
        int i13 = i10 - i7;
        if (i13 > 0) {
            org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(i7, i10, org.telegram.ui.Components.r5.class);
            f6[] f6VarArr = (f6[]) spanned.getSpans(i7, i10, f6.class);
            if (r5VarArr.length == 0 && f6VarArr.length == 0) {
                iArr = null;
            } else {
                iArr = new int[i13];
            }
            int length = r5VarArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                org.telegram.ui.Components.r5 r5Var = r5VarArr[i15];
                int spanStart = spanned.getSpanStart(r5Var);
                int min = Math.min(i10, spanned.getSpanEnd(r5Var));
                if (spanStart >= i7 && spanStart < i10 && min > spanStart) {
                    int i16 = spanStart - i7;
                    iArr[i16] = Math.max(iArr[i16], min);
                    i12 = i15;
                    obj.f2993c = Math.max(obj.f2993c, r5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                } else {
                    i12 = i15;
                }
                i14 = i12 + 1;
            }
            for (f6 f6Var : f6VarArr) {
                int spanStart2 = spanned.getSpanStart(f6Var);
                int min2 = Math.min(i10, spanned.getSpanEnd(f6Var));
                if (spanStart2 >= i7 && spanStart2 < i10 && min2 > spanStart2) {
                    int i17 = spanStart2 - i7;
                    iArr[i17] = Math.max(iArr[i17], min2);
                    obj.f2993c = Math.max(obj.f2993c, f6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            iu[] iuVarArr2 = (iu[]) spanned.getSpans(i7, i10, iu.class);
            if (iuVarArr2.length > 0) {
                iuVarArr = null;
                for (iu iuVar2 : iuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(iuVar2);
                    if (iuVar2.f23365a.f22722a.f23611s > 0 && spanStart3 >= i7 && spanStart3 < i10) {
                        if (iuVarArr == null) {
                            iuVarArr = new iu[i13];
                        }
                        iuVarArr[spanStart3 - i7] = iuVar2;
                    }
                }
            } else {
                iuVarArr = null;
            }
            if (iArr != null || iuVarArr != null) {
                int i18 = i7;
                while (i18 < i10) {
                    int i19 = i18 - i7;
                    if (iuVarArr == null) {
                        iuVar = null;
                    } else {
                        iuVar = iuVarArr[i19];
                    }
                    if (iuVar != null) {
                        gu guVar = iuVar.f23365a;
                        jv jvVar = guVar.f22722a;
                        jv jvVar2 = guVar.f22722a;
                        if (jvVar.f23605b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) jvVar2.f23605b.getText();
                            b7.d s5 = s(spanned2, 0, spanned2.length(), jvVar2.f23605b.getPaint());
                            obj.f2991a += s5.f2991a;
                            obj.f2992b += Math.max(1, s5.f2992b);
                            obj.f2993c = Math.max(obj.f2993c, s5.f2993c);
                            i18 = Math.min(i10, spanned.getSpanEnd(iuVar));
                        }
                    }
                    if (iArr == null) {
                        i11 = 0;
                    } else {
                        i11 = iArr[i19];
                    }
                    if (i11 > i18) {
                        obj.f2991a++;
                        obj.f2992b++;
                        i18 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i18);
                        if (!Character.isWhitespace(codePointAt)) {
                            obj.f2992b++;
                        }
                        i18 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return obj;
    }

    @Override
    public final Layout a() {
        return this.f23605b;
    }

    @Override
    public final int b() {
        return this.f23611s;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        int i7;
        int i10;
        View view2;
        boolean z9;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        kv kvVar = this.f23604a;
        boolean E = kvVar.E();
        TextPaint textPaint = kvVar.f23782w;
        if (E) {
            i7 = org.telegram.ui.ActionBar.l6.Tc;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, kvVar.D);
        textPaint.setColor(w02);
        if (kvVar.E()) {
            i10 = org.telegram.ui.ActionBar.l6.Vc;
        } else {
            i10 = org.telegram.ui.ActionBar.l6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.l6.w0(i10, kvVar.D);
        s70 s70Var = this.F;
        if (s70Var != null) {
            if (T == null) {
                Paint paint = new Paint(1);
                T = paint;
                paint.setPathEffect(s70.c());
            }
            T.setColor((kvVar.f23784y.i() & 16777215) | 855638016);
            canvas.drawPath(s70Var, T);
        }
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.S;
        }
        n2.n0 n0Var = this.I;
        if (n0Var != null && n0Var.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.f23605b;
        AtomicReference atomicReference = this.D;
        ArrayList arrayList = this.f23613x;
        xh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.f23605b;
        gu0.a(canvas, staticLayout2);
        if (!kvVar.F()) {
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f23605b, this.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = kvVar.V;
        if (f10 > 0.0f) {
            ij ijVar = kvVar.f23764b;
            if (!kvVar.O && (ijVar == null || !qp.s1(kvVar.f23763a).f24896s7.A(ijVar))) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (this.H == null) {
                b80 b80Var = new b80();
                this.H = b80Var;
                b80Var.D = true;
                s70 s70Var2 = new s70(0);
                this.G = s70Var2;
                s70Var2.f31950c = true;
                b80 b80Var2 = this.H;
                b80Var2.f32187y = s70Var2;
                b80Var2.k(5.0f);
                this.H.f32167b = -1L;
                this.G.reset();
                this.G.d(staticLayout2, 0, 0.0f);
                this.G.f37952n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.G);
                s70 s70Var3 = this.G;
                s70Var3.f37952n = true;
                s70Var3.a();
                this.H.l();
            }
            if (z9 && (this.H.d() || this.H.c())) {
                b80 b80Var3 = this.H;
                b80Var3.f32167b = -1L;
                b80Var3.f32168c = -1L;
            } else if (!z9 && !this.H.d() && !this.H.c()) {
                this.H.a();
            }
            if (kvVar.E()) {
                i11 = org.telegram.ui.ActionBar.l6.Vc;
            } else {
                i11 = org.telegram.ui.ActionBar.l6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
            this.H.g(org.telegram.ui.ActionBar.l6.r1(0.05f, w03), org.telegram.ui.ActionBar.l6.r1(0.15f, w03), org.telegram.ui.ActionBar.l6.r1(0.1f, w03), org.telegram.ui.ActionBar.l6.r1(0.3f, w03));
            this.H.setAlpha((int) (f10 * 255.0f));
            this.H.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(iu iuVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = iuVar.f23367c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.f23605b;
            iu iuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                iu[] iuVarArr = (iu[]) spanned.getSpans(0, spanned.length(), iu.class);
                if (iuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(iuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(iuVarArr[0]);
                    int i7 = 0;
                    while (true) {
                        if (i7 < spanned.length()) {
                            if ((i7 < spanStart || i7 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i7))) {
                                break;
                            }
                            i7++;
                        } else {
                            iuVar2 = iuVarArr[0];
                            break;
                        }
                    }
                }
            }
            if (iuVar != iuVar2 || !this.R.contains(f10, f11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void f(View view) {
        View view2 = this.S;
        if (view2 == view && view2 != null) {
            this.S = null;
            org.telegram.ui.Components.r5.release((View) null, this.E);
            this.E = null;
            n2.n0 n0Var = this.I;
            if (n0Var != null) {
                n0Var.f20256c = null;
            }
            iu[] p10 = p();
            if (p10 != null) {
                for (iu iuVar : p10) {
                    iuVar.b(this.S);
                }
            }
        }
    }

    @Override
    public final void g(int i7) {
        this.f23607e = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.f23607e;
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
        return this.f23606c;
    }

    @Override
    public final int getY() {
        return this.d;
    }

    @Override
    public final void h(int i7) {
        this.d = i7;
    }

    @Override
    public final void i(View view) {
        boolean z9;
        View view2 = this.S;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.S = view;
            if (this.f23604a.v && !this.f23612w) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.E = org.telegram.ui.Components.r5.update(0, view, z9, this.E, this.f23605b);
            n2.n0 n0Var = this.I;
            if (n0Var != null) {
                n0Var.f20256c = this.S;
            }
            iu[] p10 = p();
            if (p10 != null) {
                for (iu iuVar : p10) {
                    iuVar.a(this.S);
                }
            }
        }
    }

    @Override
    public final void j(int i7) {
        this.f23606c = i7;
    }

    public final void k() {
        ds dsVar = this.J;
        if (dsVar != null) {
            g0.r(dsVar);
            this.J = null;
        }
    }

    public final void l(android.text.style.CharacterStyle r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jv.l(android.text.style.CharacterStyle, boolean):void");
    }

    public final void m(Canvas canvas, int i7, float f10) {
        int i10;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        kv kvVar = this.f23604a;
        boolean E = kvVar.E();
        TextPaint textPaint = kvVar.f23782w;
        if (E) {
            i10 = org.telegram.ui.ActionBar.l6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.l6.Sc;
        }
        final int w02 = org.telegram.ui.ActionBar.l6.w0(i10, kvVar.D);
        textPaint.setColor(w02);
        if (kvVar.E()) {
            i11 = org.telegram.ui.ActionBar.l6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.l6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
        final View view = this.S;
        vg0.b(canvas, this.f23605b, i7, f10, new ug0() {
            @Override
            public final void d(Canvas canvas2) {
                jv jvVar = jv.this;
                AtomicReference atomicReference = jvVar.D;
                StaticLayout staticLayout = jvVar.f23605b;
                ArrayList arrayList = jvVar.f23613x;
                xh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                gu0.a(canvas2, jvVar.f23605b);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, jvVar.f23605b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        });
        canvas.restore();
    }

    public final int n() {
        if (this.f23610r) {
            return 0;
        }
        return this.f23608f;
    }

    public final boolean o(CharacterStyle characterStyle, wt wtVar) {
        StaticLayout staticLayout = this.f23605b;
        if (staticLayout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) staticLayout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart >= 0 && spanEnd > spanStart) {
                wtVar.f26371a = staticLayout;
                wtVar.f26372b = spanStart;
                wtVar.f26373c = spanEnd;
                wtVar.d = staticLayout.getWidth();
                return true;
            }
            return false;
        }
        return false;
    }

    public final iu[] p() {
        StaticLayout staticLayout = this.f23605b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (iu[]) spanned.getSpans(0, spanned.length(), iu.class);
    }

    public final int q() {
        return Math.max(0, this.f23609n - this.f23608f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f23608f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        gv gvVar;
        gv gvVar2;
        int spanEnd;
        gv gvVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y10 = (int) motionEvent.getY();
        ArrayList arrayList = this.f23613x;
        kv kvVar = this.f23604a;
        StaticLayout staticLayout = this.f23605b;
        boolean z11 = true;
        int i7 = 0;
        if (actionMasked == 0) {
            this.L = null;
            this.M = null;
            this.P = null;
            this.Q = null;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xh.f fVar = (xh.f) obj;
                if (fVar.getBounds().contains(n10, y10)) {
                    this.L = fVar;
                    return true;
                }
            }
            iu[] p10 = p();
            if (p10 != null) {
                for (iu iuVar : p10) {
                    if (e(iuVar, n10, y10)) {
                        gu guVar = iuVar.f23365a;
                        if (guVar.f22723b) {
                            return true;
                        }
                        this.Q = iuVar;
                        this.K = false;
                        guVar.m(true);
                        View view = this.S;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y10 >= 0 && y10 < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y10);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f10 = n10;
                if (f10 >= lineLeft && f10 <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.M = clickableSpan;
                        this.N = spannable.getSpanStart(clickableSpan);
                        this.O = spannable.getSpanEnd(this.M);
                        this.K = false;
                        y70 y70Var = new y70(this.M, kvVar.D, f10, y10, 0);
                        s70 b10 = y70Var.b();
                        b10.d(staticLayout, this.N, 0.0f);
                        staticLayout.getSelectionPath(this.N, this.O, b10);
                        if (this.I == null) {
                            this.I = new n2.n0(this.S);
                        }
                        this.I.b(y70Var, null);
                        View view2 = this.S;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    gv[] gvVarArr = (gv[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gv.class);
                    if (gvVarArr != null) {
                        int length = gvVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z10 = z11;
                            gvVar = gvVarArr[i11];
                            if (TLObject.hasFlag(gvVar.f22746b, 256)) {
                                break;
                            }
                            i11++;
                            z11 = z10;
                        }
                    }
                    z10 = z11;
                    gvVar = null;
                    if (gvVar != null) {
                        int spanStart2 = spannable.getSpanStart(gvVar);
                        int spanEnd2 = spannable.getSpanEnd(gvVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            gv[] gvVarArr2 = (gv[]) spannable.getSpans(i12, i12, gv.class);
                            int length2 = gvVarArr2.length;
                            int i13 = i7;
                            while (true) {
                                if (i13 < length2) {
                                    gvVar3 = gvVarArr2[i13];
                                    if (TLObject.hasFlag(gvVar3.f22746b, 256)) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    gvVar3 = null;
                                    break;
                                }
                            }
                            if (gvVar3 == null || (spanStart = spannable.getSpanStart(gvVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i7 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            gv[] gvVarArr3 = (gv[]) spannable.getSpans(spanEnd2, spanEnd2, gv.class);
                            int length3 = gvVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 < length3) {
                                    gvVar2 = gvVarArr3[i14];
                                    if (TLObject.hasFlag(gvVar2.f22746b, 256)) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    gvVar2 = null;
                                    break;
                                }
                            }
                            if (gvVar2 == null || (spanEnd = spannable.getSpanEnd(gvVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.M = gvVar;
                        this.N = spanStart2;
                        this.O = spanEnd2;
                        this.K = false;
                        y70 y70Var2 = new y70(gvVar, kvVar.D, f10, y10, 0);
                        s70 b11 = y70Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.I == null) {
                            this.I = new n2.n0(this.S);
                        }
                        this.I.b(y70Var2, null);
                        View view3 = this.S;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z10;
                    }
                    org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.r5.class);
                    if (r5VarArr != null && r5VarArr.length > 0) {
                        this.P = r5VarArr[0];
                        return z10;
                    }
                }
            }
            return false;
        } else if (actionMasked == 2) {
            iu iuVar2 = this.Q;
            if (iuVar2 != null) {
                if (e(iuVar2, n10, y10)) {
                    return true;
                }
                k();
                this.Q.f23365a.m(false);
                this.Q = null;
                this.K = false;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.Q != null) {
                k();
                iu iuVar3 = this.Q;
                this.Q = null;
                iuVar3.f23365a.m(false);
                if (!this.K) {
                    View view4 = this.S;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    org.telegram.ui.Cells.q1 q1Var = kvVar.E;
                    org.telegram.ui.Cells.l1 l1Var = kvVar.F;
                    TL_iv.textButton textbutton = iuVar3.f23366b;
                    if (q1Var != null && l1Var != null) {
                        l1Var.b1(q1Var, textbutton);
                    }
                    z9 = false;
                } else {
                    z9 = false;
                }
                this.K = z9;
                return true;
            } else if (this.L != null) {
                float width = staticLayout.getWidth();
                float height = staticLayout.getHeight();
                float sqrt = (float) Math.sqrt((height * height) + (width * width));
                View view5 = this.S;
                this.L.f58813q = new hv(this, view5, kvVar);
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((xh.f) obj2).j(n10, y10, sqrt, false);
                }
                if (view5 != null) {
                    view5.playSoundEffect(0);
                }
                this.L = null;
                return true;
            } else if (this.M != null) {
                k();
                if (!this.K) {
                    l(this.M, false);
                }
                n2.n0 n0Var = this.I;
                if (n0Var != null) {
                    n0Var.f(true);
                }
                this.M = null;
                this.K = false;
                return true;
            } else {
                org.telegram.ui.Components.r5 r5Var = this.P;
                if (r5Var == null) {
                    return false;
                }
                this.P = null;
                org.telegram.ui.Cells.q1 q1Var2 = kvVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = kvVar.F;
                if (q1Var2 != null && l1Var2 != null) {
                    View view6 = this.S;
                    if (view6 != null) {
                        view6.playSoundEffect(0);
                    }
                    l1Var2.n0(r5Var);
                    return true;
                }
                return true;
            }
        } else if (actionMasked == 3) {
            this.L = null;
            this.P = null;
            if (this.Q != null) {
                k();
                this.Q.f23365a.m(false);
                this.Q = null;
                this.K = false;
            }
            if (this.M != null) {
                k();
                n2.n0 n0Var2 = this.I;
                if (n0Var2 != null) {
                    n0Var2.f(true);
                }
                this.M = null;
                this.K = false;
                return false;
            }
        }
        return false;
    }

    public final void u() {
        k();
        ds dsVar = new ds(this, 8);
        this.J = dsVar;
        g0.i3(dsVar, ViewConfiguration.getLongPressTimeout());
    }

    public jv(kv kvVar, CharSequence charSequence, int i7, Layout.Alignment alignment) {
        this(kvVar, charSequence, i7, alignment, 1.0f);
    }

    public jv(kv kvVar, CharSequence charSequence, int i7, Layout.Alignment alignment, float f10) {
        boolean z9;
        gv[] gvVarArr;
        int i10;
        int L;
        int i11;
        gv[] gvVarArr2;
        iu[] iuVarArr;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.r5> cls;
        int i12;
        f6[] f6VarArr;
        gv[] gvVarArr3;
        this.f23613x = new ArrayList();
        this.f23614y = new Stack();
        this.D = new AtomicReference();
        this.R = new RectF();
        this.f23604a = kvVar;
        TextPaint textPaint = kvVar.f23782w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z10 = true;
        boolean z11 = false;
        if (charSequence instanceof Spanned) {
            for (gv gvVar : (gv[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gv.class)) {
                int i13 = gvVar.f22746b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    gvVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        CharSequence n10 = i6.n(charSequence, fontMetricsInt, false, null, 0, z9 ? 0.85f : 1.0f, 0);
        if (n10 instanceof Spanned) {
            Spanned spanned = (Spanned) n10;
            Class<org.telegram.ui.Components.r5> cls2 = org.telegram.ui.Components.r5.class;
            if (((org.telegram.ui.Components.r5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((f6[]) spanned.getSpans(0, spanned.length(), f6.class)).length != 0 || ((iu[]) spanned.getSpans(0, spanned.length(), iu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.r5 r5Var : (org.telegram.ui.Components.r5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    r5Var.setPreserveFontMetrics(true);
                }
                for (f6 f6Var : (f6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), f6.class)) {
                    f6Var.f22372e = true;
                }
                for (iu iuVar : (iu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), iu.class)) {
                    if (iuVar.f23365a.f22722a.f23611s > 0) {
                        iuVar.f23368e = true;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        break;
                    }
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i14);
                    boolean z12 = indexOf >= 0 ? z10 : z11;
                    indexOf = z12 ? indexOf : spannableStringBuilder2.length();
                    b7.d s5 = s(spannableStringBuilder2, i14, indexOf, textPaint);
                    int i15 = s5.f2992b;
                    if (i15 <= 0 || s5.f2991a * 100 < i15 * 70 || (i12 = s5.f2993c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spannableStringBuilder2.getSpans(i14, indexOf, cls2);
                        int length = r5VarArr.length;
                        int i16 = 0;
                        while (i16 < length) {
                            org.telegram.ui.Components.r5 r5Var2 = r5VarArr[i16];
                            Class<org.telegram.ui.Components.r5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(r5Var2);
                            if (spanStart >= i14 && spanStart < indexOf) {
                                r5Var2.setMinimumLineHeight(i12);
                            }
                            i16++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (f6 f6Var2 : (f6[]) spannableStringBuilder2.getSpans(i14, indexOf, f6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(f6Var2);
                            if (spanStart2 >= i14 && spanStart2 < indexOf) {
                                f6Var2.f22373f = i12;
                            }
                        }
                        iu[] iuVarArr2 = (iu[]) spannableStringBuilder2.getSpans(i14, indexOf, iu.class);
                        int length2 = iuVarArr2.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            iu iuVar2 = iuVarArr2[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(iuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (iuVar2.f23365a.f22722a.f23611s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                iuVar2.f23369f = i12;
                            }
                            i17++;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (!z12) {
                        break;
                    }
                    i14 = indexOf + 1;
                    cls2 = cls;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z10 = true;
                    z11 = false;
                }
                n10 = spannableStringBuilder;
            }
        }
        int d = li.c6.d(n10);
        this.f23611s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            iu[] iuVarArr3 = (iu[]) spanned2.getSpans(0, n10.length(), iu.class);
            if (iuVarArr3.length > 0) {
                Arrays.sort(iuVarArr3, new eu(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = iuVarArr3.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        iu iuVar3 = iuVarArr3[i18];
                        int spanStart4 = spanned2.getSpanStart(iuVar3);
                        int spanEnd = spanned2.getSpanEnd(iuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        jv jvVar = iuVar3.f23365a.f22722a;
                        if (jvVar.f23611s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, jvVar.f23605b.getText());
                        i18++;
                    } else {
                        this.f23611s = li.c6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.f23611s > 0 && (n10 instanceof Spanned)) {
            for (gv gvVar2 : (gv[]) ((Spanned) n10).getSpans(0, n10.length(), gv.class)) {
                if ((gvVar2.f22746b & 15) == 14) {
                    gvVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            gv[] gvVarArr4 = (gv[]) ((Spanned) n10).getSpans(0, n10.length(), gv.class);
            int length4 = gvVarArr4.length;
            for (int i19 = 0; i19 < length4 && (gvVarArr4[i19].f22746b & 15) == 0; i19++) {
            }
        }
        this.f23605b = ij.g5(n10, kvVar.f23782w, i7, f10, 0.0f, false, alignment);
        this.f23608f = i7;
        this.h = 0;
        for (int i20 = 0; i20 < this.f23605b.getLineCount(); i20++) {
            this.f23608f = Math.min(this.f23608f, (int) Math.floor(this.f23605b.getLineLeft(i20)));
            this.h = Math.max(this.h, (int) Math.ceil(this.f23605b.getLineRight(i20)));
        }
        this.f23609n = 0;
        if (this.f23605b.getLineCount() > 0) {
            StaticLayout staticLayout = this.f23605b;
            this.f23609n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        s70 s70Var = null;
        xh.f.c(null, this.f23605b, this.f23614y, this.f23613x);
        if (this.f23605b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.f23605b.getText();
            for (gv gvVar3 : (gv[]) spanned3.getSpans(0, spanned3.length(), gv.class)) {
                int i21 = gvVar3.f22746b;
                if (TLObject.hasFlag(i21, 8192)) {
                    int spanStart5 = spanned3.getSpanStart(gvVar3);
                    int spanEnd2 = spanned3.getSpanEnd(gvVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (s70Var == null) {
                            i10 = 0;
                            s70Var = new s70(0);
                            s70Var.f37952n = false;
                        } else {
                            i10 = 0;
                        }
                        s70Var.d(this.f23605b, spanStart5, 0.0f);
                        if (TLObject.hasFlag(i21, 4096)) {
                            L = -g0.L(6.0f);
                        } else {
                            L = TLObject.hasFlag(i21, 2048) ? g0.L(2.0f) : i10;
                        }
                        if (L != 0) {
                            i11 = L + g0.L(L > 0 ? 5.0f : -2.0f);
                        } else {
                            i11 = i10;
                        }
                        s70Var.f37953o = i11;
                        this.f23605b.getSelectionPath(spanStart5, spanEnd2, s70Var);
                    }
                }
            }
            if (s70Var != null) {
                s70Var.f37952n = true;
                this.F = s70Var;
            }
        }
    }
}
