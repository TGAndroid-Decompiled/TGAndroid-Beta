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
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.wg0;
import org.telegram.ui.xg0;
public final class dv implements org.telegram.ui.Cells.t9, ox0 {
    public static Paint U;
    public final AtomicReference E;
    public org.telegram.ui.Components.t5 F;
    public final f80 G;
    public f80 H;
    public o80 I;
    public n2.o0 J;
    public xr K;
    public boolean L;
    public xh.f M;
    public CharacterStyle N;
    public int O;
    public int P;
    public org.telegram.ui.Components.x5 Q;
    public cu R;
    public final RectF S;
    public View T;
    public final ev f23579a;
    public final StaticLayout f23580b;
    public int f23581c;
    public int d;
    public int f23582e;
    public final int f23583f;
    public final int h;
    public final int f23584n;
    public boolean f23585r;
    public final int f23586s;
    public boolean f23587w;
    public final ArrayList f23588x;
    public final Stack f23589y;

    public dv(ev evVar, CharSequence charSequence, int i7) {
        this(evVar, charSequence, i7, Layout.Alignment.ALIGN_NORMAL);
    }

    public static b7.d s(Spanned spanned, int i7, int i10, TextPaint textPaint) {
        int[] iArr;
        cu[] cuVarArr;
        cu cuVar;
        int i11;
        int i12;
        ?? obj = new Object();
        int i13 = i10 - i7;
        if (i13 > 0) {
            org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned.getSpans(i7, i10, org.telegram.ui.Components.x5.class);
            g6[] g6VarArr = (g6[]) spanned.getSpans(i7, i10, g6.class);
            if (x5VarArr.length == 0 && g6VarArr.length == 0) {
                iArr = null;
            } else {
                iArr = new int[i13];
            }
            int length = x5VarArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                org.telegram.ui.Components.x5 x5Var = x5VarArr[i15];
                int spanStart = spanned.getSpanStart(x5Var);
                int min = Math.min(i10, spanned.getSpanEnd(x5Var));
                if (spanStart >= i7 && spanStart < i10 && min > spanStart) {
                    int i16 = spanStart - i7;
                    iArr[i16] = Math.max(iArr[i16], min);
                    i12 = i15;
                    obj.f2944c = Math.max(obj.f2944c, x5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
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
                    obj.f2944c = Math.max(obj.f2944c, g6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            cu[] cuVarArr2 = (cu[]) spanned.getSpans(i7, i10, cu.class);
            if (cuVarArr2.length > 0) {
                cuVarArr = null;
                for (cu cuVar2 : cuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(cuVar2);
                    if (cuVar2.f23422a.f22949a.f23586s > 0 && spanStart3 >= i7 && spanStart3 < i10) {
                        if (cuVarArr == null) {
                            cuVarArr = new cu[i13];
                        }
                        cuVarArr[spanStart3 - i7] = cuVar2;
                    }
                }
            } else {
                cuVarArr = null;
            }
            if (iArr != null || cuVarArr != null) {
                int i18 = i7;
                while (i18 < i10) {
                    int i19 = i18 - i7;
                    if (cuVarArr == null) {
                        cuVar = null;
                    } else {
                        cuVar = cuVarArr[i19];
                    }
                    if (cuVar != null) {
                        au auVar = cuVar.f23422a;
                        dv dvVar = auVar.f22949a;
                        dv dvVar2 = auVar.f22949a;
                        if (dvVar.f23580b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) dvVar2.f23580b.getText();
                            b7.d s5 = s(spanned2, 0, spanned2.length(), dvVar2.f23580b.getPaint());
                            obj.f2942a += s5.f2942a;
                            obj.f2943b += Math.max(1, s5.f2943b);
                            obj.f2944c = Math.max(obj.f2944c, s5.f2944c);
                            i18 = Math.min(i10, spanned.getSpanEnd(cuVar));
                        }
                    }
                    if (iArr == null) {
                        i11 = 0;
                    } else {
                        i11 = iArr[i19];
                    }
                    if (i11 > i18) {
                        obj.f2942a++;
                        obj.f2943b++;
                        i18 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i18);
                        if (!Character.isWhitespace(codePointAt)) {
                            obj.f2943b++;
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
        return this.f23580b;
    }

    @Override
    public final int b() {
        return this.f23586s;
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
        ev evVar = this.f23579a;
        boolean E = evVar.E();
        TextPaint textPaint = evVar.f23789w;
        if (E) {
            i7 = org.telegram.ui.ActionBar.n6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Vc;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, evVar.D);
        textPaint.setColor(w02);
        if (evVar.E()) {
            i10 = org.telegram.ui.ActionBar.n6.Yc;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.n6.w0(i10, evVar.D);
        f80 f80Var = this.G;
        if (f80Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(f80.c());
            }
            U.setColor((evVar.f23791y.i() & 16777215) | 855638016);
            canvas.drawPath(f80Var, U);
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
        StaticLayout staticLayout = this.f23580b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.f23588x;
        xh.f.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.f23580b;
        nu0.a(canvas, staticLayout2);
        if (!evVar.F()) {
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f23580b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f10 = evVar.V;
        if (f10 > 0.0f) {
            fj fjVar = evVar.f23771b;
            if (!evVar.O && (fjVar == null || !mp.u1(evVar.f23770a).f25789v7.A(fjVar))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.I == null) {
                o80 o80Var = new o80();
                this.I = o80Var;
                o80Var.D = true;
                f80 f80Var2 = new f80(0);
                this.H = f80Var2;
                f80Var2.f38523c = true;
                o80 o80Var2 = this.I;
                o80Var2.f38033y = f80Var2;
                o80Var2.k(5.0f);
                this.I.f38013b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.f35030n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                f80 f80Var3 = this.H;
                f80Var3.f35030n = true;
                f80Var3.a();
                this.I.l();
            }
            if (z10 && (this.I.d() || this.I.c())) {
                o80 o80Var3 = this.I;
                o80Var3.f38013b = -1L;
                o80Var3.f38014c = -1L;
            } else if (!z10 && !this.I.d() && !this.I.c()) {
                this.I.a();
            }
            if (evVar.E()) {
                i11 = org.telegram.ui.ActionBar.n6.Yc;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.Xc;
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(i11, evVar.D);
            this.I.g(org.telegram.ui.ActionBar.n6.r1(0.05f, w03), org.telegram.ui.ActionBar.n6.r1(0.15f, w03), org.telegram.ui.ActionBar.n6.r1(0.1f, w03), org.telegram.ui.ActionBar.n6.r1(0.3f, w03));
            this.I.setAlpha((int) (f10 * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(cu cuVar, float f10, float f11) {
        float L = g0.L(8.0f);
        RectF rectF = cuVar.f23424c;
        if (f10 < rectF.left - L || f10 >= rectF.right + L || f11 < rectF.top - L || f11 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.f23580b;
            cu cuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                cu[] cuVarArr = (cu[]) spanned.getSpans(0, spanned.length(), cu.class);
                if (cuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(cuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(cuVarArr[0]);
                    int i7 = 0;
                    while (true) {
                        if (i7 < spanned.length()) {
                            if ((i7 < spanStart || i7 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i7))) {
                                break;
                            }
                            i7++;
                        } else {
                            cuVar2 = cuVarArr[0];
                            break;
                        }
                    }
                }
            }
            if (cuVar != cuVar2 || !this.S.contains(f10, f11)) {
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
            org.telegram.ui.Components.x5.release((View) null, this.F);
            this.F = null;
            n2.o0 o0Var = this.J;
            if (o0Var != null) {
                o0Var.f21195c = null;
            }
            cu[] p10 = p();
            if (p10 != null) {
                for (cu cuVar : p10) {
                    cuVar.b(this.T);
                }
            }
        }
    }

    @Override
    public final void g(int i7) {
        this.f23582e = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.f23582e;
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
        return this.f23581c;
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
            if (this.f23579a.v && !this.f23587w) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F = org.telegram.ui.Components.x5.update(0, view, z10, this.F, this.f23580b);
            n2.o0 o0Var = this.J;
            if (o0Var != null) {
                o0Var.f21195c = this.T;
            }
            cu[] p10 = p();
            if (p10 != null) {
                for (cu cuVar : p10) {
                    cuVar.a(this.T);
                }
            }
        }
    }

    @Override
    public final void j(int i7) {
        this.f23581c = i7;
    }

    public final void k() {
        xr xrVar = this.K;
        if (xrVar != null) {
            g0.r(xrVar);
            this.K = null;
        }
    }

    public final void l(android.text.style.CharacterStyle r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dv.l(android.text.style.CharacterStyle, boolean):void");
    }

    public final void m(Canvas canvas, int i7, float f10) {
        int i10;
        int i11;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        ev evVar = this.f23579a;
        boolean E = evVar.E();
        TextPaint textPaint = evVar.f23789w;
        if (E) {
            i10 = org.telegram.ui.ActionBar.n6.Wc;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.Vc;
        }
        final int w02 = org.telegram.ui.ActionBar.n6.w0(i10, evVar.D);
        textPaint.setColor(w02);
        if (evVar.E()) {
            i11 = org.telegram.ui.ActionBar.n6.Yc;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.n6.w0(i11, evVar.D);
        final View view = this.T;
        xg0.b(canvas, this.f23580b, i7, f10, new wg0() {
            @Override
            public final void a(Canvas canvas2) {
                dv dvVar = dv.this;
                AtomicReference atomicReference = dvVar.E;
                StaticLayout staticLayout = dvVar.f23580b;
                ArrayList arrayList = dvVar.f23588x;
                xh.f.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                nu0.a(canvas2, dvVar.f23580b);
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.f23580b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        });
        canvas.restore();
    }

    public final int n() {
        if (this.f23585r) {
            return 0;
        }
        return this.f23583f;
    }

    public final boolean o(CharacterStyle characterStyle, qt qtVar) {
        StaticLayout staticLayout = this.f23580b;
        if (staticLayout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) staticLayout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart >= 0 && spanEnd > spanStart) {
                qtVar.f26449a = staticLayout;
                qtVar.f26450b = spanStart;
                qtVar.f26451c = spanEnd;
                qtVar.d = staticLayout.getWidth();
                return true;
            }
            return false;
        }
        return false;
    }

    public final cu[] p() {
        StaticLayout staticLayout = this.f23580b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (cu[]) spanned.getSpans(0, spanned.length(), cu.class);
    }

    public final int q() {
        return Math.max(0, this.f23584n - this.f23583f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f23583f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        av avVar;
        av avVar2;
        int spanEnd;
        av avVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y10 = (int) motionEvent.getY();
        ArrayList arrayList = this.f23588x;
        ev evVar = this.f23579a;
        StaticLayout staticLayout = this.f23580b;
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
            cu[] p10 = p();
            if (p10 != null) {
                for (cu cuVar : p10) {
                    if (e(cuVar, n10, y10)) {
                        au auVar = cuVar.f23422a;
                        if (auVar.f22950b) {
                            return true;
                        }
                        this.R = cuVar;
                        this.L = false;
                        auVar.m(true);
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
                        l80 l80Var = new l80(this.N, evVar.D, f10, y10, 0);
                        f80 b10 = l80Var.b();
                        b10.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b10);
                        if (this.J == null) {
                            this.J = new n2.o0(this.T);
                        }
                        this.J.b(l80Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    av[] avVarArr = (av[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, av.class);
                    if (avVarArr != null) {
                        int length = avVarArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            z11 = z12;
                            avVar = avVarArr[i11];
                            if (TLObject.hasFlag(avVar.f22973b, 256)) {
                                break;
                            }
                            i11++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    avVar = null;
                    if (avVar != null) {
                        int spanStart2 = spannable.getSpanStart(avVar);
                        int spanEnd2 = spannable.getSpanEnd(avVar);
                        while (spanStart2 > 0) {
                            int i12 = spanStart2 - 1;
                            av[] avVarArr2 = (av[]) spannable.getSpans(i12, i12, av.class);
                            int length2 = avVarArr2.length;
                            int i13 = i7;
                            while (true) {
                                if (i13 < length2) {
                                    avVar3 = avVarArr2[i13];
                                    if (TLObject.hasFlag(avVar3.f22973b, 256)) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    avVar3 = null;
                                    break;
                                }
                            }
                            if (avVar3 == null || (spanStart = spannable.getSpanStart(avVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i7 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            av[] avVarArr3 = (av[]) spannable.getSpans(spanEnd2, spanEnd2, av.class);
                            int length3 = avVarArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 < length3) {
                                    avVar2 = avVarArr3[i14];
                                    if (TLObject.hasFlag(avVar2.f22973b, 256)) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    avVar2 = null;
                                    break;
                                }
                            }
                            if (avVar2 == null || (spanEnd = spannable.getSpanEnd(avVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = avVar;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        l80 l80Var2 = new l80(avVar, evVar.D, f10, y10, 0);
                        f80 b11 = l80Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.J == null) {
                            this.J = new n2.o0(this.T);
                        }
                        this.J.b(l80Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z11;
                    }
                    org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.x5.class);
                    if (x5VarArr != null && x5VarArr.length > 0) {
                        this.Q = x5VarArr[0];
                        return z11;
                    }
                }
            }
            return false;
        } else if (actionMasked == 2) {
            cu cuVar2 = this.R;
            if (cuVar2 != null) {
                if (e(cuVar2, n10, y10)) {
                    return true;
                }
                k();
                this.R.f23422a.m(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.R != null) {
                k();
                cu cuVar3 = this.R;
                this.R = null;
                cuVar3.f23422a.m(false);
                if (!this.L) {
                    View view4 = this.T;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    org.telegram.ui.Cells.q1 q1Var = evVar.E;
                    org.telegram.ui.Cells.l1 l1Var = evVar.F;
                    TL_iv.textButton textbutton = cuVar3.f23423b;
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
                this.M.f60560q = new bv(this, view5, evVar);
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
                org.telegram.ui.Components.x5 x5Var = this.Q;
                if (x5Var == null) {
                    return false;
                }
                this.Q = null;
                org.telegram.ui.Cells.q1 q1Var2 = evVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = evVar.F;
                if (q1Var2 != null && l1Var2 != null) {
                    View view6 = this.T;
                    if (view6 != null) {
                        view6.playSoundEffect(0);
                    }
                    l1Var2.p0(x5Var);
                    return true;
                }
                return true;
            }
        } else if (actionMasked == 3) {
            this.M = null;
            this.Q = null;
            if (this.R != null) {
                k();
                this.R.f23422a.m(false);
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
        xr xrVar = new xr(this, 8);
        this.K = xrVar;
        g0.h3(xrVar, ViewConfiguration.getLongPressTimeout());
    }

    public dv(ev evVar, CharSequence charSequence, int i7, Layout.Alignment alignment) {
        this(evVar, charSequence, i7, alignment, 1.0f);
    }

    public dv(ev evVar, CharSequence charSequence, int i7, Layout.Alignment alignment, float f10) {
        boolean z10;
        av[] avVarArr;
        int i10;
        int L;
        int i11;
        av[] avVarArr2;
        cu[] cuVarArr;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.x5> cls;
        int i12;
        g6[] g6VarArr;
        av[] avVarArr3;
        this.f23588x = new ArrayList();
        this.f23589y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.f23579a = evVar;
        TextPaint textPaint = evVar.f23789w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (av avVar : (av[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), av.class)) {
                int i13 = avVar.f22973b & 15;
                if (i13 >= 1 && i13 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    avVar.a(textPaint2);
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
            Class<org.telegram.ui.Components.x5> cls2 = org.telegram.ui.Components.x5.class;
            if (((org.telegram.ui.Components.x5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((g6[]) spanned.getSpans(0, spanned.length(), g6.class)).length != 0 || ((cu[]) spanned.getSpans(0, spanned.length(), cu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    x5Var.setPreserveFontMetrics(true);
                }
                for (g6 g6Var : (g6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), g6.class)) {
                    g6Var.f24178e = true;
                }
                for (cu cuVar : (cu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cu.class)) {
                    if (cuVar.f23422a.f22949a.f23586s > 0) {
                        cuVar.f23425e = true;
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
                    int i15 = s5.f2943b;
                    if (i15 <= 0 || s5.f2942a * 100 < i15 * 70 || (i12 = s5.f2944c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannableStringBuilder2.getSpans(i14, indexOf, cls2);
                        int length = x5VarArr.length;
                        int i16 = 0;
                        while (i16 < length) {
                            org.telegram.ui.Components.x5 x5Var2 = x5VarArr[i16];
                            Class<org.telegram.ui.Components.x5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(x5Var2);
                            if (spanStart >= i14 && spanStart < indexOf) {
                                x5Var2.setMinimumLineHeight(i12);
                            }
                            i16++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (g6 g6Var2 : (g6[]) spannableStringBuilder2.getSpans(i14, indexOf, g6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(g6Var2);
                            if (spanStart2 >= i14 && spanStart2 < indexOf) {
                                g6Var2.f24179f = i12;
                            }
                        }
                        cu[] cuVarArr2 = (cu[]) spannableStringBuilder2.getSpans(i14, indexOf, cu.class);
                        int length2 = cuVarArr2.length;
                        int i17 = 0;
                        while (i17 < length2) {
                            cu cuVar2 = cuVarArr2[i17];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(cuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (cuVar2.f23422a.f22949a.f23586s > 0 && spanStart3 >= i14 && spanStart3 < indexOf) {
                                cuVar2.f23426f = i12;
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
        int d = oi.b6.d(n10);
        this.f23586s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            cu[] cuVarArr3 = (cu[]) spanned2.getSpans(0, n10.length(), cu.class);
            if (cuVarArr3.length > 0) {
                Arrays.sort(cuVarArr3, new yt(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = cuVarArr3.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length3) {
                        cu cuVar3 = cuVarArr3[i18];
                        int spanStart4 = spanned2.getSpanStart(cuVar3);
                        int spanEnd = spanned2.getSpanEnd(cuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        dv dvVar = cuVar3.f23422a.f22949a;
                        if (dvVar.f23586s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, dvVar.f23580b.getText());
                        i18++;
                    } else {
                        this.f23586s = oi.b6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.f23586s > 0 && (n10 instanceof Spanned)) {
            for (av avVar2 : (av[]) ((Spanned) n10).getSpans(0, n10.length(), av.class)) {
                if ((avVar2.f22973b & 15) == 14) {
                    avVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            av[] avVarArr4 = (av[]) ((Spanned) n10).getSpans(0, n10.length(), av.class);
            int length4 = avVarArr4.length;
            for (int i19 = 0; i19 < length4 && (avVarArr4[i19].f22973b & 15) == 0; i19++) {
            }
        }
        this.f23580b = fj.g5(n10, evVar.f23789w, i7, f10, 0.0f, false, alignment);
        this.f23583f = i7;
        this.h = 0;
        for (int i20 = 0; i20 < this.f23580b.getLineCount(); i20++) {
            this.f23583f = Math.min(this.f23583f, (int) Math.floor(this.f23580b.getLineLeft(i20)));
            this.h = Math.max(this.h, (int) Math.ceil(this.f23580b.getLineRight(i20)));
        }
        this.f23584n = 0;
        if (this.f23580b.getLineCount() > 0) {
            StaticLayout staticLayout = this.f23580b;
            this.f23584n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        f80 f80Var = null;
        xh.f.c(null, this.f23580b, this.f23589y, this.f23588x);
        if (this.f23580b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.f23580b.getText();
            for (av avVar3 : (av[]) spanned3.getSpans(0, spanned3.length(), av.class)) {
                int i21 = avVar3.f22973b;
                if (TLObject.hasFlag(i21, 8192)) {
                    int spanStart5 = spanned3.getSpanStart(avVar3);
                    int spanEnd2 = spanned3.getSpanEnd(avVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (f80Var == null) {
                            i10 = 0;
                            f80Var = new f80(0);
                            f80Var.f35030n = false;
                        } else {
                            i10 = 0;
                        }
                        f80Var.d(this.f23580b, spanStart5, 0.0f);
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
                        f80Var.f35031o = i11;
                        this.f23580b.getSelectionPath(spanStart5, spanEnd2, f80Var);
                    }
                }
            }
            if (f80Var != null) {
                f80Var.f35030n = true;
                this.G = f80Var;
            }
        }
    }
}
