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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
public final class bv implements org.telegram.ui.Cells.s9, dx0 {
    public static Paint U;
    public final AtomicReference E;
    public org.telegram.ui.Components.l5 F;
    public final n70 G;
    public n70 H;
    public w70 I;
    public m2.p0 J;
    public vs K;
    public boolean L;
    public yh.f M;
    public CharacterStyle N;
    public int O;
    public int P;
    public org.telegram.ui.Components.p5 Q;
    public au R;
    public final RectF S;
    public View T;
    public final cv f21887a;
    public final StaticLayout f21888b;
    public int f21889c;
    public int d;
    public int f21890e;
    public final int f21891f;
    public final int h;
    public final int f21892n;
    public boolean f21893r;
    public final int f21894s;
    public boolean f21895w;
    public final ArrayList f21896x;
    public final Stack f21897y;

    public bv(cv cvVar, CharSequence charSequence, int i3) {
        this(cvVar, charSequence, i3, Layout.Alignment.ALIGN_NORMAL);
    }

    public static a7.d s(Spanned spanned, int i3, int i10, TextPaint textPaint) {
        int[] iArr;
        au[] auVarArr;
        au auVar;
        int i11;
        int i12;
        ?? obj = new Object();
        int i13 = i10 - i3;
        if (i13 > 0) {
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(i3, i10, org.telegram.ui.Components.p5.class);
            f6[] f6VarArr = (f6[]) spanned.getSpans(i3, i10, f6.class);
            if (p5VarArr.length == 0 && f6VarArr.length == 0) {
                iArr = null;
            } else {
                iArr = new int[i13];
            }
            int length = p5VarArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                org.telegram.ui.Components.p5 p5Var = p5VarArr[i15];
                int spanStart = spanned.getSpanStart(p5Var);
                int min = Math.min(i10, spanned.getSpanEnd(p5Var));
                if (spanStart >= i3 && spanStart < i10 && min > spanStart) {
                    int i16 = spanStart - i3;
                    iArr[i16] = Math.max(iArr[i16], min);
                    i12 = i15;
                    obj.f140c = Math.max(obj.f140c, p5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                } else {
                    i12 = i15;
                }
                i14 = i12 + 1;
            }
            for (f6 f6Var : f6VarArr) {
                int spanStart2 = spanned.getSpanStart(f6Var);
                int min2 = Math.min(i10, spanned.getSpanEnd(f6Var));
                if (spanStart2 >= i3 && spanStart2 < i10 && min2 > spanStart2) {
                    int i17 = spanStart2 - i3;
                    iArr[i17] = Math.max(iArr[i17], min2);
                    obj.f140c = Math.max(obj.f140c, f6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            au[] auVarArr2 = (au[]) spanned.getSpans(i3, i10, au.class);
            if (auVarArr2.length > 0) {
                auVarArr = null;
                for (au auVar2 : auVarArr2) {
                    int spanStart3 = spanned.getSpanStart(auVar2);
                    if (auVar2.f21585a.f26633a.f21894s > 0 && spanStart3 >= i3 && spanStart3 < i10) {
                        if (auVarArr == null) {
                            auVarArr = new au[i13];
                        }
                        auVarArr[spanStart3 - i3] = auVar2;
                    }
                }
            } else {
                auVarArr = null;
            }
            if (iArr != null || auVarArr != null) {
                int i18 = i3;
                while (i18 < i10) {
                    int i19 = i18 - i3;
                    if (auVarArr == null) {
                        auVar = null;
                    } else {
                        auVar = auVarArr[i19];
                    }
                    if (auVar != null) {
                        yt ytVar = auVar.f21585a;
                        bv bvVar = ytVar.f26633a;
                        bv bvVar2 = ytVar.f26633a;
                        if (bvVar.f21888b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) bvVar2.f21888b.getText();
                            a7.d s6 = s(spanned2, 0, spanned2.length(), bvVar2.f21888b.getPaint());
                            obj.f138a += s6.f138a;
                            obj.f139b += Math.max(1, s6.f139b);
                            obj.f140c = Math.max(obj.f140c, s6.f140c);
                            i18 = Math.min(i10, spanned.getSpanEnd(auVar));
                        }
                    }
                    if (iArr == null) {
                        i11 = 0;
                    } else {
                        i11 = iArr[i19];
                    }
                    if (i11 > i18) {
                        obj.f138a++;
                        obj.f139b++;
                        i18 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i18);
                        if (!Character.isWhitespace(codePointAt)) {
                            obj.f139b++;
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
        return this.f21888b;
    }

    @Override
    public final int b() {
        return this.f21894s;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        int i3;
        int i10;
        View view2;
        boolean z10;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        cv cvVar = this.f21887a;
        boolean E = cvVar.E();
        TextPaint textPaint = cvVar.f22084w;
        if (E) {
            i3 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        textPaint.setColor(w02);
        if (cvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.Vc;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D);
        n70 n70Var = this.G;
        if (n70Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(n70.c());
            }
            U.setColor((cvVar.f22086y.i() & 16777215) | 855638016);
            canvas.drawPath(n70Var, U);
        }
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.T;
        }
        m2.p0 p0Var = this.J;
        if (p0Var != null && p0Var.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.f21888b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.f21896x;
        yh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.f21888b;
        du0.a(canvas, staticLayout2);
        if (!cvVar.F()) {
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f21888b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = cvVar.V;
        if (f10 > 0.0f) {
            zi ziVar = cvVar.f22066b;
            if (!cvVar.O && (ziVar == null || !hp.s1(cvVar.f22065a).f23120s7.A(ziVar))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.I == null) {
                w70 w70Var = new w70();
                this.I = w70Var;
                w70Var.D = true;
                n70 n70Var2 = new n70(0);
                this.H = n70Var2;
                n70Var2.f32362c = true;
                w70 w70Var2 = this.I;
                w70Var2.f39945y = n70Var2;
                w70Var2.k(5.0f);
                this.I.f39925b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.f36403n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                n70 n70Var3 = this.H;
                n70Var3.f36403n = true;
                n70Var3.a();
                this.I.l();
            }
            if (z10 && (this.I.d() || this.I.c())) {
                w70 w70Var3 = this.I;
                w70Var3.f39925b = -1L;
                w70Var3.f39926c = -1L;
            } else if (!z10 && !this.I.d() && !this.I.c()) {
                this.I.a();
            }
            if (cvVar.E()) {
                i11 = org.telegram.ui.ActionBar.k6.Vc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
            this.I.g(org.telegram.ui.ActionBar.k6.r1(0.05f, w03), org.telegram.ui.ActionBar.k6.r1(0.15f, w03), org.telegram.ui.ActionBar.k6.r1(0.1f, w03), org.telegram.ui.ActionBar.k6.r1(0.3f, w03));
            this.I.setAlpha((int) (f10 * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(au auVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = auVar.f21587c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.f21888b;
            au auVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                au[] auVarArr = (au[]) spanned.getSpans(0, spanned.length(), au.class);
                if (auVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(auVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(auVarArr[0]);
                    int i3 = 0;
                    while (true) {
                        if (i3 < spanned.length()) {
                            if ((i3 < spanStart || i3 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            auVar2 = auVarArr[0];
                            break;
                        }
                    }
                }
            }
            if (auVar != auVar2 || !this.S.contains(f10, f11)) {
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
            org.telegram.ui.Components.p5.release((View) null, this.F);
            this.F = null;
            m2.p0 p0Var = this.J;
            if (p0Var != null) {
                p0Var.f18961c = null;
            }
            au[] p10 = p();
            if (p10 != null) {
                for (au auVar : p10) {
                    View view3 = this.T;
                    auVar.h = null;
                    auVar.f21585a.f26633a.f(view3);
                }
            }
        }
    }

    @Override
    public final void g(int i3) {
        this.f21890e = i3;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.f21890e;
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
        return this.f21889c;
    }

    @Override
    public final int getY() {
        return this.d;
    }

    @Override
    public final void h(int i3) {
        this.d = i3;
    }

    @Override
    public final void i(View view) {
        boolean z10;
        View view2 = this.T;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.T = view;
            if (this.f21887a.v && !this.f21895w) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F = org.telegram.ui.Components.p5.update(0, view, z10, this.F, this.f21888b);
            m2.p0 p0Var = this.J;
            if (p0Var != null) {
                p0Var.f18961c = this.T;
            }
            au[] p10 = p();
            if (p10 != null) {
                for (au auVar : p10) {
                    auVar.a(this.T);
                }
            }
        }
    }

    @Override
    public final void j(int i3) {
        this.f21889c = i3;
    }

    public final void k() {
        vs vsVar = this.K;
        if (vsVar != null) {
            g0.r(vsVar);
            this.K = null;
        }
    }

    public final void l(android.text.style.CharacterStyle r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bv.l(android.text.style.CharacterStyle, boolean):void");
    }

    public final void m(Canvas canvas, int i3, float f10) {
        int i10;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        cv cvVar = this.f21887a;
        boolean E = cvVar.E();
        TextPaint textPaint = cvVar.f22084w;
        if (E) {
            i10 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.Sc;
        }
        final int w02 = org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D);
        textPaint.setColor(w02);
        if (cvVar.E()) {
            i11 = org.telegram.ui.ActionBar.k6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
        final View view = this.T;
        ng0.b(canvas, this.f21888b, i3, f10, new mg0() {
            @Override
            public final void d(Canvas canvas2) {
                bv bvVar = bv.this;
                AtomicReference atomicReference = bvVar.E;
                StaticLayout staticLayout = bvVar.f21888b;
                ArrayList arrayList = bvVar.f21896x;
                yh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                du0.a(canvas2, bvVar.f21888b);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, bvVar.f21888b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        });
        canvas.restore();
    }

    public final int n() {
        if (this.f21893r) {
            return 0;
        }
        return this.f21891f;
    }

    public final boolean o(CharacterStyle characterStyle, ot otVar) {
        StaticLayout staticLayout = this.f21888b;
        if (staticLayout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) staticLayout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart >= 0 && spanEnd > spanStart) {
                otVar.f24594a = staticLayout;
                otVar.f24595b = spanStart;
                otVar.f24596c = spanEnd;
                otVar.d = staticLayout.getWidth();
                return true;
            }
            return false;
        }
        return false;
    }

    public final au[] p() {
        StaticLayout staticLayout = this.f21888b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (au[]) spanned.getSpans(0, spanned.length(), au.class);
    }

    public final int q() {
        return Math.max(0, this.f21892n - this.f21891f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f21891f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        yu yuVar;
        yu yuVar2;
        int spanEnd;
        yu yuVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n4 = n() + ((int) motionEvent.getX());
        int y9 = (int) motionEvent.getY();
        ArrayList arrayList = this.f21896x;
        cv cvVar = this.f21887a;
        StaticLayout staticLayout = this.f21888b;
        boolean z12 = true;
        int i3 = 0;
        if (actionMasked == 0) {
            this.M = null;
            this.N = null;
            this.Q = null;
            this.R = null;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                yh.f fVar = (yh.f) obj;
                if (fVar.getBounds().contains(n4, y9)) {
                    this.M = fVar;
                    return true;
                }
            }
            au[] p10 = p();
            if (p10 != null) {
                for (au auVar : p10) {
                    if (e(auVar, n4, y9)) {
                        yt ytVar = auVar.f21585a;
                        if (ytVar.f26634b) {
                            return true;
                        }
                        this.R = auVar;
                        this.L = false;
                        ytVar.m(true);
                        View view = this.T;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y9 >= 0 && y9 < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y9);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f10 = n4;
                if (f10 >= lineLeft && f10 <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.N = clickableSpan;
                        this.O = spannable.getSpanStart(clickableSpan);
                        this.P = spannable.getSpanEnd(this.N);
                        this.L = false;
                        t70 t70Var = new t70(this.N, cvVar.D, f10, y9, 0);
                        n70 b10 = t70Var.b();
                        b10.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b10);
                        if (this.J == null) {
                            this.J = new m2.p0(this.T);
                        }
                        this.J.b(t70Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    yu[] yuVarArr = (yu[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, yu.class);
                    if (yuVarArr != null) {
                        int length = yuVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z11 = z12;
                            yuVar = yuVarArr[i11];
                            if (TLObject.hasFlag(yuVar.f26657b, 256)) {
                                break;
                            }
                            i11++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    yuVar = null;
                    if (yuVar != null) {
                        int spanStart2 = spannable.getSpanStart(yuVar);
                        int spanEnd2 = spannable.getSpanEnd(yuVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            yu[] yuVarArr2 = (yu[]) spannable.getSpans(i12, i12, yu.class);
                            int length2 = yuVarArr2.length;
                            int i13 = i3;
                            while (true) {
                                if (i13 < length2) {
                                    yuVar3 = yuVarArr2[i13];
                                    if (TLObject.hasFlag(yuVar3.f26657b, 256)) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    yuVar3 = null;
                                    break;
                                }
                            }
                            if (yuVar3 == null || (spanStart = spannable.getSpanStart(yuVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i3 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            yu[] yuVarArr3 = (yu[]) spannable.getSpans(spanEnd2, spanEnd2, yu.class);
                            int length3 = yuVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 < length3) {
                                    yuVar2 = yuVarArr3[i14];
                                    if (TLObject.hasFlag(yuVar2.f26657b, 256)) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    yuVar2 = null;
                                    break;
                                }
                            }
                            if (yuVar2 == null || (spanEnd = spannable.getSpanEnd(yuVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = yuVar;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        t70 t70Var2 = new t70(yuVar, cvVar.D, f10, y9, 0);
                        n70 b11 = t70Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.J == null) {
                            this.J = new m2.p0(this.T);
                        }
                        this.J.b(t70Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z11;
                    }
                    org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.p5.class);
                    if (p5VarArr != null && p5VarArr.length > 0) {
                        this.Q = p5VarArr[0];
                        return z11;
                    }
                }
            }
            return false;
        } else if (actionMasked == 2) {
            au auVar2 = this.R;
            if (auVar2 != null) {
                if (e(auVar2, n4, y9)) {
                    return true;
                }
                k();
                this.R.f21585a.m(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.R != null) {
                k();
                au auVar3 = this.R;
                this.R = null;
                auVar3.f21585a.m(false);
                if (!this.L) {
                    View view4 = this.T;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    org.telegram.ui.Cells.q1 q1Var = cvVar.E;
                    org.telegram.ui.Cells.l1 l1Var = cvVar.F;
                    TL_iv.textButton textbutton = auVar3.f21586b;
                    if (q1Var != null && l1Var != null) {
                        l1Var.d1(q1Var, textbutton);
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                this.L = z10;
                return true;
            } else if (this.M != null) {
                float width = staticLayout.getWidth();
                float height = staticLayout.getHeight();
                float sqrt = (float) Math.sqrt((height * height) + (width * width));
                View view5 = this.T;
                this.M.f59521q = new zu(this, view5, cvVar);
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((yh.f) obj2).j(n4, y9, sqrt, false);
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
                m2.p0 p0Var = this.J;
                if (p0Var != null) {
                    p0Var.f(true);
                }
                this.N = null;
                this.L = false;
                return true;
            } else {
                org.telegram.ui.Components.p5 p5Var = this.Q;
                if (p5Var == null) {
                    return false;
                }
                this.Q = null;
                org.telegram.ui.Cells.q1 q1Var2 = cvVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = cvVar.F;
                if (q1Var2 != null && l1Var2 != null) {
                    View view6 = this.T;
                    if (view6 != null) {
                        view6.playSoundEffect(0);
                    }
                    l1Var2.o0(p5Var);
                    return true;
                }
                return true;
            }
        } else if (actionMasked == 3) {
            this.M = null;
            this.Q = null;
            if (this.R != null) {
                k();
                this.R.f21585a.m(false);
                this.R = null;
                this.L = false;
            }
            if (this.N != null) {
                k();
                m2.p0 p0Var2 = this.J;
                if (p0Var2 != null) {
                    p0Var2.f(true);
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
        vs vsVar = new vs(this, 8);
        this.K = vsVar;
        g0.i3(vsVar, ViewConfiguration.getLongPressTimeout());
    }

    public bv(cv cvVar, CharSequence charSequence, int i3, Layout.Alignment alignment) {
        this(cvVar, charSequence, i3, alignment, 1.0f);
    }

    public bv(cv cvVar, CharSequence charSequence, int i3, Layout.Alignment alignment, float f10) {
        boolean z10;
        yu[] yuVarArr;
        int i10;
        int L;
        int i11;
        yu[] yuVarArr2;
        au[] auVarArr;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.p5> cls;
        int i12;
        f6[] f6VarArr;
        yu[] yuVarArr3;
        this.f21896x = new ArrayList();
        this.f21897y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.f21887a = cvVar;
        TextPaint textPaint = cvVar.f22084w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (yu yuVar : (yu[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), yu.class)) {
                int i13 = yuVar.f26657b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    yuVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        CharSequence n4 = i6.n(charSequence, fontMetricsInt, false, null, 0, z10 ? 0.85f : 1.0f, 0);
        if (n4 instanceof Spanned) {
            Spanned spanned = (Spanned) n4;
            Class<org.telegram.ui.Components.p5> cls2 = org.telegram.ui.Components.p5.class;
            if (((org.telegram.ui.Components.p5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((f6[]) spanned.getSpans(0, spanned.length(), f6.class)).length != 0 || ((au[]) spanned.getSpans(0, spanned.length(), au.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n4);
                for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    p5Var.setPreserveFontMetrics(true);
                }
                for (f6 f6Var : (f6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), f6.class)) {
                    f6Var.f22455e = true;
                }
                for (au auVar : (au[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), au.class)) {
                    if (auVar.f21585a.f26633a.f21894s > 0) {
                        auVar.f21588e = true;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        break;
                    }
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i14);
                    boolean z13 = indexOf >= 0 ? z11 : z12;
                    indexOf = z13 ? indexOf : spannableStringBuilder2.length();
                    a7.d s6 = s(spannableStringBuilder2, i14, indexOf, textPaint);
                    int i15 = s6.f139b;
                    if (i15 <= 0 || s6.f138a * 100 < i15 * 70 || (i12 = s6.f140c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder2.getSpans(i14, indexOf, cls2);
                        int length = p5VarArr.length;
                        int i16 = 0;
                        while (i16 < length) {
                            org.telegram.ui.Components.p5 p5Var2 = p5VarArr[i16];
                            Class<org.telegram.ui.Components.p5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(p5Var2);
                            if (spanStart >= i14 && spanStart < indexOf) {
                                p5Var2.setMinimumLineHeight(i12);
                            }
                            i16++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (f6 f6Var2 : (f6[]) spannableStringBuilder2.getSpans(i14, indexOf, f6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(f6Var2);
                            if (spanStart2 >= i14 && spanStart2 < indexOf) {
                                f6Var2.f22456f = i12;
                            }
                        }
                        au[] auVarArr2 = (au[]) spannableStringBuilder2.getSpans(i14, indexOf, au.class);
                        int length2 = auVarArr2.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            au auVar2 = auVarArr2[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(auVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (auVar2.f21585a.f26633a.f21894s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                auVar2.f21589f = i12;
                            }
                            i17++;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (!z13) {
                        break;
                    }
                    i14 = indexOf + 1;
                    cls2 = cls;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z11 = true;
                    z12 = false;
                }
                n4 = spannableStringBuilder;
            }
        }
        int d = mi.d6.d(n4);
        this.f21894s = d;
        if (d == 0 && (n4 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n4;
            au[] auVarArr3 = (au[]) spanned2.getSpans(0, n4.length(), au.class);
            if (auVarArr3.length > 0) {
                Arrays.sort(auVarArr3, new wt(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n4);
                int length3 = auVarArr3.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        au auVar3 = auVarArr3[i18];
                        int spanStart4 = spanned2.getSpanStart(auVar3);
                        int spanEnd = spanned2.getSpanEnd(auVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        bv bvVar = auVar3.f21585a.f26633a;
                        if (bvVar.f21894s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, bvVar.f21888b.getText());
                        i18++;
                    } else {
                        this.f21894s = mi.d6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.f21894s > 0 && (n4 instanceof Spanned)) {
            for (yu yuVar2 : (yu[]) ((Spanned) n4).getSpans(0, n4.length(), yu.class)) {
                if ((yuVar2.f26657b & 15) == 14) {
                    yuVar2.d = true;
                }
            }
        }
        if (n4 instanceof Spanned) {
            yu[] yuVarArr4 = (yu[]) ((Spanned) n4).getSpans(0, n4.length(), yu.class);
            int length4 = yuVarArr4.length;
            for (int i19 = 0; i19 < length4 && (yuVarArr4[i19].f26657b & 15) == 0; i19++) {
            }
        }
        this.f21888b = zi.h5(n4, cvVar.f22084w, i3, f10, 0.0f, false, alignment);
        this.f21891f = i3;
        this.h = 0;
        for (int i20 = 0; i20 < this.f21888b.getLineCount(); i20++) {
            this.f21891f = Math.min(this.f21891f, (int) Math.floor(this.f21888b.getLineLeft(i20)));
            this.h = Math.max(this.h, (int) Math.ceil(this.f21888b.getLineRight(i20)));
        }
        this.f21892n = 0;
        if (this.f21888b.getLineCount() > 0) {
            StaticLayout staticLayout = this.f21888b;
            this.f21892n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        n70 n70Var = null;
        yh.f.c(null, this.f21888b, this.f21897y, this.f21896x);
        if (this.f21888b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.f21888b.getText();
            for (yu yuVar3 : (yu[]) spanned3.getSpans(0, spanned3.length(), yu.class)) {
                int i21 = yuVar3.f26657b;
                if (TLObject.hasFlag(i21, 8192)) {
                    int spanStart5 = spanned3.getSpanStart(yuVar3);
                    int spanEnd2 = spanned3.getSpanEnd(yuVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (n70Var == null) {
                            i10 = 0;
                            n70Var = new n70(0);
                            n70Var.f36403n = false;
                        } else {
                            i10 = 0;
                        }
                        n70Var.d(this.f21888b, spanStart5, 0.0f);
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
                        n70Var.f36404o = i11;
                        this.f21888b.getSelectionPath(spanStart5, spanEnd2, n70Var);
                    }
                }
            }
            if (n70Var != null) {
                n70Var.f36403n = true;
                this.G = n70Var;
            }
        }
    }
}
