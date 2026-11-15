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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.sg0;
import org.telegram.ui.tg0;
public final class hv implements org.telegram.ui.Cells.s9, hx0 {
    public static Paint U;
    public final AtomicReference E;
    public org.telegram.ui.Components.l5 F;
    public final u70 G;
    public u70 H;
    public d80 I;
    public n2.o0 J;
    public as K;
    public boolean L;
    public xh.f M;
    public CharacterStyle N;
    public int O;
    public int P;
    public org.telegram.ui.Components.p5 Q;
    public fu R;
    public final RectF S;
    public View T;
    public final iv f24221a;
    public final StaticLayout f24222b;
    public int f24223c;
    public int d;
    public int f24224e;
    public final int f24225f;
    public final int h;
    public final int f24226n;
    public boolean f24227r;
    public final int f24228s;
    public boolean f24229w;
    public final ArrayList f24230x;
    public final Stack f24231y;

    public hv(iv ivVar, CharSequence charSequence, int i7) {
        this(ivVar, charSequence, i7, Layout.Alignment.ALIGN_NORMAL);
    }

    public static b7.d s(Spanned spanned, int i7, int i10, TextPaint textPaint) {
        int[] iArr;
        fu[] fuVarArr;
        fu fuVar;
        int i11;
        int i12;
        ?? obj = new Object();
        int i13 = i10 - i7;
        if (i13 > 0) {
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(i7, i10, org.telegram.ui.Components.p5.class);
            g6[] g6VarArr = (g6[]) spanned.getSpans(i7, i10, g6.class);
            if (p5VarArr.length == 0 && g6VarArr.length == 0) {
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
                if (spanStart >= i7 && spanStart < i10 && min > spanStart) {
                    int i16 = spanStart - i7;
                    iArr[i16] = Math.max(iArr[i16], min);
                    i12 = i15;
                    obj.f2950c = Math.max(obj.f2950c, p5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                } else {
                    i12 = i15;
                }
                i14 = i12 + 1;
            }
            for (g6 g6Var : g6VarArr) {
                int spanStart2 = spanned.getSpanStart(g6Var);
                int min2 = Math.min(i10, spanned.getSpanEnd(g6Var));
                if (spanStart2 >= i7 && spanStart2 < i10 && min2 > spanStart2) {
                    int i17 = spanStart2 - i7;
                    iArr[i17] = Math.max(iArr[i17], min2);
                    obj.f2950c = Math.max(obj.f2950c, g6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            fu[] fuVarArr2 = (fu[]) spanned.getSpans(i7, i10, fu.class);
            if (fuVarArr2.length > 0) {
                fuVarArr = null;
                for (fu fuVar2 : fuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(fuVar2);
                    if (fuVar2.f23550a.f23141a.f24228s > 0 && spanStart3 >= i7 && spanStart3 < i10) {
                        if (fuVarArr == null) {
                            fuVarArr = new fu[i13];
                        }
                        fuVarArr[spanStart3 - i7] = fuVar2;
                    }
                }
            } else {
                fuVarArr = null;
            }
            if (iArr != null || fuVarArr != null) {
                int i18 = i7;
                while (i18 < i10) {
                    int i19 = i18 - i7;
                    if (fuVarArr == null) {
                        fuVar = null;
                    } else {
                        fuVar = fuVarArr[i19];
                    }
                    if (fuVar != null) {
                        du duVar = fuVar.f23550a;
                        hv hvVar = duVar.f23141a;
                        hv hvVar2 = duVar.f23141a;
                        if (hvVar.f24222b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) hvVar2.f24222b.getText();
                            b7.d s5 = s(spanned2, 0, spanned2.length(), hvVar2.f24222b.getPaint());
                            obj.f2948a += s5.f2948a;
                            obj.f2949b += Math.max(1, s5.f2949b);
                            obj.f2950c = Math.max(obj.f2950c, s5.f2950c);
                            i18 = Math.min(i10, spanned.getSpanEnd(fuVar));
                        }
                    }
                    if (iArr == null) {
                        i11 = 0;
                    } else {
                        i11 = iArr[i19];
                    }
                    if (i11 > i18) {
                        obj.f2948a++;
                        obj.f2949b++;
                        i18 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i18);
                        if (!Character.isWhitespace(codePointAt)) {
                            obj.f2949b++;
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
        return this.f24222b;
    }

    @Override
    public final int b() {
        return this.f24228s;
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
        boolean z10;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        iv ivVar = this.f24221a;
        boolean E = ivVar.E();
        TextPaint textPaint = ivVar.f24464w;
        if (E) {
            i7 = org.telegram.ui.ActionBar.j6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Vc;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        textPaint.setColor(w02);
        if (ivVar.E()) {
            i10 = org.telegram.ui.ActionBar.j6.Yc;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D);
        u70 u70Var = this.G;
        if (u70Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(u70.c());
            }
            U.setColor((ivVar.f24466y.i() & 16777215) | 855638016);
            canvas.drawPath(u70Var, U);
        }
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.T;
        }
        n2.o0 o0Var = this.J;
        if (o0Var != null && o0Var.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.f24222b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.f24230x;
        xh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.f24222b;
        fu0.a(canvas, staticLayout2);
        if (!ivVar.F()) {
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f24222b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = ivVar.V;
        if (f10 > 0.0f) {
            gj gjVar = ivVar.f24446b;
            if (!ivVar.O && (gjVar == null || !np.s1(ivVar.f24445a).f25403t7.A(gjVar))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.I == null) {
                d80 d80Var = new d80();
                this.I = d80Var;
                d80Var.D = true;
                u70 u70Var2 = new u70(0);
                this.H = u70Var2;
                u70Var2.f35683c = true;
                d80 d80Var2 = this.I;
                d80Var2.f33887y = u70Var2;
                d80Var2.k(5.0f);
                this.I.f33867b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.f39946n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                u70 u70Var3 = this.H;
                u70Var3.f39946n = true;
                u70Var3.a();
                this.I.l();
            }
            if (z10 && (this.I.d() || this.I.c())) {
                d80 d80Var3 = this.I;
                d80Var3.f33867b = -1L;
                d80Var3.f33868c = -1L;
            } else if (!z10 && !this.I.d() && !this.I.c()) {
                this.I.a();
            }
            if (ivVar.E()) {
                i11 = org.telegram.ui.ActionBar.j6.Yc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Xc;
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(i11, ivVar.D);
            this.I.g(org.telegram.ui.ActionBar.j6.r1(0.05f, w03), org.telegram.ui.ActionBar.j6.r1(0.15f, w03), org.telegram.ui.ActionBar.j6.r1(0.1f, w03), org.telegram.ui.ActionBar.j6.r1(0.3f, w03));
            this.I.setAlpha((int) (f10 * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(fu fuVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = fuVar.f23552c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.f24222b;
            fu fuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                fu[] fuVarArr = (fu[]) spanned.getSpans(0, spanned.length(), fu.class);
                if (fuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(fuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(fuVarArr[0]);
                    int i7 = 0;
                    while (true) {
                        if (i7 < spanned.length()) {
                            if ((i7 < spanStart || i7 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i7))) {
                                break;
                            }
                            i7++;
                        } else {
                            fuVar2 = fuVarArr[0];
                            break;
                        }
                    }
                }
            }
            if (fuVar != fuVar2 || !this.S.contains(f10, f11)) {
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
            n2.o0 o0Var = this.J;
            if (o0Var != null) {
                o0Var.f20831c = null;
            }
            fu[] p10 = p();
            if (p10 != null) {
                for (fu fuVar : p10) {
                    fuVar.b(this.T);
                }
            }
        }
    }

    @Override
    public final void g(int i7) {
        this.f24224e = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.f24224e;
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
        return this.f24223c;
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
        boolean z10;
        View view2 = this.T;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.T = view;
            if (this.f24221a.v && !this.f24229w) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F = org.telegram.ui.Components.p5.update(0, view, z10, this.F, this.f24222b);
            n2.o0 o0Var = this.J;
            if (o0Var != null) {
                o0Var.f20831c = this.T;
            }
            fu[] p10 = p();
            if (p10 != null) {
                for (fu fuVar : p10) {
                    fuVar.a(this.T);
                }
            }
        }
    }

    @Override
    public final void j(int i7) {
        this.f24223c = i7;
    }

    public final void k() {
        as asVar = this.K;
        if (asVar != null) {
            g0.r(asVar);
            this.K = null;
        }
    }

    public final void l(android.text.style.CharacterStyle r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hv.l(android.text.style.CharacterStyle, boolean):void");
    }

    public final void m(Canvas canvas, int i7, float f10) {
        int i10;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        iv ivVar = this.f24221a;
        boolean E = ivVar.E();
        TextPaint textPaint = ivVar.f24464w;
        if (E) {
            i10 = org.telegram.ui.ActionBar.j6.Wc;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Vc;
        }
        final int w02 = org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D);
        textPaint.setColor(w02);
        if (ivVar.E()) {
            i11 = org.telegram.ui.ActionBar.j6.Yc;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.j6.w0(i11, ivVar.D);
        final View view = this.T;
        tg0.b(canvas, this.f24222b, i7, f10, new sg0() {
            @Override
            public final void a(Canvas canvas2) {
                hv hvVar = hv.this;
                AtomicReference atomicReference = hvVar.E;
                StaticLayout staticLayout = hvVar.f24222b;
                ArrayList arrayList = hvVar.f24230x;
                xh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                fu0.a(canvas2, hvVar.f24222b);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, hvVar.f24222b, hvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        });
        canvas.restore();
    }

    public final int n() {
        if (this.f24227r) {
            return 0;
        }
        return this.f24225f;
    }

    public final boolean o(CharacterStyle characterStyle, tt ttVar) {
        StaticLayout staticLayout = this.f24222b;
        if (staticLayout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) staticLayout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart >= 0 && spanEnd > spanStart) {
                ttVar.f26730a = staticLayout;
                ttVar.f26731b = spanStart;
                ttVar.f26732c = spanEnd;
                ttVar.d = staticLayout.getWidth();
                return true;
            }
            return false;
        }
        return false;
    }

    public final fu[] p() {
        StaticLayout staticLayout = this.f24222b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (fu[]) spanned.getSpans(0, spanned.length(), fu.class);
    }

    public final int q() {
        return Math.max(0, this.f24226n - this.f24225f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f24225f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        ev evVar;
        ev evVar2;
        int spanEnd;
        ev evVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y10 = (int) motionEvent.getY();
        ArrayList arrayList = this.f24230x;
        iv ivVar = this.f24221a;
        StaticLayout staticLayout = this.f24222b;
        boolean z12 = true;
        int i7 = 0;
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
                xh.f fVar = (xh.f) obj;
                if (fVar.getBounds().contains(n10, y10)) {
                    this.M = fVar;
                    return true;
                }
            }
            fu[] p10 = p();
            if (p10 != null) {
                for (fu fuVar : p10) {
                    if (e(fuVar, n10, y10)) {
                        du duVar = fuVar.f23550a;
                        if (duVar.f23142b) {
                            return true;
                        }
                        this.R = fuVar;
                        this.L = false;
                        duVar.m(true);
                        View view = this.T;
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
                        this.N = clickableSpan;
                        this.O = spannable.getSpanStart(clickableSpan);
                        this.P = spannable.getSpanEnd(this.N);
                        this.L = false;
                        a80 a80Var = new a80(this.N, ivVar.D, f10, y10, 0);
                        u70 b10 = a80Var.b();
                        b10.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b10);
                        if (this.J == null) {
                            this.J = new n2.o0(this.T);
                        }
                        this.J.b(a80Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    ev[] evVarArr = (ev[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ev.class);
                    if (evVarArr != null) {
                        int length = evVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z11 = z12;
                            evVar = evVarArr[i11];
                            if (TLObject.hasFlag(evVar.f23371b, 256)) {
                                break;
                            }
                            i11++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    evVar = null;
                    if (evVar != null) {
                        int spanStart2 = spannable.getSpanStart(evVar);
                        int spanEnd2 = spannable.getSpanEnd(evVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            ev[] evVarArr2 = (ev[]) spannable.getSpans(i12, i12, ev.class);
                            int length2 = evVarArr2.length;
                            int i13 = i7;
                            while (true) {
                                if (i13 < length2) {
                                    evVar3 = evVarArr2[i13];
                                    if (TLObject.hasFlag(evVar3.f23371b, 256)) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    evVar3 = null;
                                    break;
                                }
                            }
                            if (evVar3 == null || (spanStart = spannable.getSpanStart(evVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i7 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            ev[] evVarArr3 = (ev[]) spannable.getSpans(spanEnd2, spanEnd2, ev.class);
                            int length3 = evVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 < length3) {
                                    evVar2 = evVarArr3[i14];
                                    if (TLObject.hasFlag(evVar2.f23371b, 256)) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    evVar2 = null;
                                    break;
                                }
                            }
                            if (evVar2 == null || (spanEnd = spannable.getSpanEnd(evVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = evVar;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        a80 a80Var2 = new a80(evVar, ivVar.D, f10, y10, 0);
                        u70 b11 = a80Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.J == null) {
                            this.J = new n2.o0(this.T);
                        }
                        this.J.b(a80Var2, null);
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
            fu fuVar2 = this.R;
            if (fuVar2 != null) {
                if (e(fuVar2, n10, y10)) {
                    return true;
                }
                k();
                this.R.f23550a.m(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.R != null) {
                k();
                fu fuVar3 = this.R;
                this.R = null;
                fuVar3.f23550a.m(false);
                if (!this.L) {
                    View view4 = this.T;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    org.telegram.ui.Cells.q1 q1Var = ivVar.E;
                    org.telegram.ui.Cells.l1 l1Var = ivVar.F;
                    TL_iv.textButton textbutton = fuVar3.f23551b;
                    if (q1Var != null && l1Var != null) {
                        l1Var.k1(q1Var, textbutton);
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
                this.M.f59995q = new fv(this, view5, ivVar);
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
                this.M = null;
                return true;
            } else if (this.N != null) {
                k();
                if (!this.L) {
                    l(this.N, false);
                }
                n2.o0 o0Var = this.J;
                if (o0Var != null) {
                    o0Var.f(true);
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
                org.telegram.ui.Cells.q1 q1Var2 = ivVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = ivVar.F;
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
                this.R.f23550a.m(false);
                this.R = null;
                this.L = false;
            }
            if (this.N != null) {
                k();
                n2.o0 o0Var2 = this.J;
                if (o0Var2 != null) {
                    o0Var2.f(true);
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
        as asVar = new as(this, 8);
        this.K = asVar;
        g0.i3(asVar, ViewConfiguration.getLongPressTimeout());
    }

    public hv(iv ivVar, CharSequence charSequence, int i7, Layout.Alignment alignment) {
        this(ivVar, charSequence, i7, alignment, 1.0f);
    }

    public hv(iv ivVar, CharSequence charSequence, int i7, Layout.Alignment alignment, float f10) {
        boolean z10;
        ev[] evVarArr;
        int i10;
        int L;
        int i11;
        ev[] evVarArr2;
        fu[] fuVarArr;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.p5> cls;
        int i12;
        g6[] g6VarArr;
        ev[] evVarArr3;
        this.f24230x = new ArrayList();
        this.f24231y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.f24221a = ivVar;
        TextPaint textPaint = ivVar.f24464w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (ev evVar : (ev[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ev.class)) {
                int i13 = evVar.f23371b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    evVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        CharSequence n10 = j6.n(charSequence, fontMetricsInt, false, null, 0, z10 ? 0.85f : 1.0f, 0);
        if (n10 instanceof Spanned) {
            Spanned spanned = (Spanned) n10;
            Class<org.telegram.ui.Components.p5> cls2 = org.telegram.ui.Components.p5.class;
            if (((org.telegram.ui.Components.p5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((g6[]) spanned.getSpans(0, spanned.length(), g6.class)).length != 0 || ((fu[]) spanned.getSpans(0, spanned.length(), fu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    p5Var.setPreserveFontMetrics(true);
                }
                for (g6 g6Var : (g6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), g6.class)) {
                    g6Var.f23698e = true;
                }
                for (fu fuVar : (fu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), fu.class)) {
                    if (fuVar.f23550a.f23141a.f24228s > 0) {
                        fuVar.f23553e = true;
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
                    b7.d s5 = s(spannableStringBuilder2, i14, indexOf, textPaint);
                    int i15 = s5.f2949b;
                    if (i15 <= 0 || s5.f2948a * 100 < i15 * 70 || (i12 = s5.f2950c) <= 0) {
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
                        for (g6 g6Var2 : (g6[]) spannableStringBuilder2.getSpans(i14, indexOf, g6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(g6Var2);
                            if (spanStart2 >= i14 && spanStart2 < indexOf) {
                                g6Var2.f23699f = i12;
                            }
                        }
                        fu[] fuVarArr2 = (fu[]) spannableStringBuilder2.getSpans(i14, indexOf, fu.class);
                        int length2 = fuVarArr2.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            fu fuVar2 = fuVarArr2[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(fuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (fuVar2.f23550a.f23141a.f24228s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                fuVar2.f23554f = i12;
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
                n10 = spannableStringBuilder;
            }
        }
        int d = oi.a6.d(n10);
        this.f24228s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            fu[] fuVarArr3 = (fu[]) spanned2.getSpans(0, n10.length(), fu.class);
            if (fuVarArr3.length > 0) {
                Arrays.sort(fuVarArr3, new bu(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = fuVarArr3.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        fu fuVar3 = fuVarArr3[i18];
                        int spanStart4 = spanned2.getSpanStart(fuVar3);
                        int spanEnd = spanned2.getSpanEnd(fuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        hv hvVar = fuVar3.f23550a.f23141a;
                        if (hvVar.f24228s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, hvVar.f24222b.getText());
                        i18++;
                    } else {
                        this.f24228s = oi.a6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.f24228s > 0 && (n10 instanceof Spanned)) {
            for (ev evVar2 : (ev[]) ((Spanned) n10).getSpans(0, n10.length(), ev.class)) {
                if ((evVar2.f23371b & 15) == 14) {
                    evVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            ev[] evVarArr4 = (ev[]) ((Spanned) n10).getSpans(0, n10.length(), ev.class);
            int length4 = evVarArr4.length;
            for (int i19 = 0; i19 < length4 && (evVarArr4[i19].f23371b & 15) == 0; i19++) {
            }
        }
        this.f24222b = gj.g5(n10, ivVar.f24464w, i7, f10, 0.0f, false, alignment);
        this.f24225f = i7;
        this.h = 0;
        for (int i20 = 0; i20 < this.f24222b.getLineCount(); i20++) {
            this.f24225f = Math.min(this.f24225f, (int) Math.floor(this.f24222b.getLineLeft(i20)));
            this.h = Math.max(this.h, (int) Math.ceil(this.f24222b.getLineRight(i20)));
        }
        this.f24226n = 0;
        if (this.f24222b.getLineCount() > 0) {
            StaticLayout staticLayout = this.f24222b;
            this.f24226n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        u70 u70Var = null;
        xh.f.c(null, this.f24222b, this.f24231y, this.f24230x);
        if (this.f24222b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.f24222b.getText();
            for (ev evVar3 : (ev[]) spanned3.getSpans(0, spanned3.length(), ev.class)) {
                int i21 = evVar3.f23371b;
                if (TLObject.hasFlag(i21, 8192)) {
                    int spanStart5 = spanned3.getSpanStart(evVar3);
                    int spanEnd2 = spanned3.getSpanEnd(evVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (u70Var == null) {
                            i10 = 0;
                            u70Var = new u70(0);
                            u70Var.f39946n = false;
                        } else {
                            i10 = 0;
                        }
                        u70Var.d(this.f24222b, spanStart5, 0.0f);
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
                        u70Var.f39947o = i11;
                        this.f24222b.getSelectionPath(spanStart5, spanEnd2, u70Var);
                    }
                }
            }
            if (u70Var != null) {
                u70Var.f39946n = true;
                this.G = u70Var;
            }
        }
    }
}
