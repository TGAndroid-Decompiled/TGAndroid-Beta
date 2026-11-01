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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.wh0;
import org.telegram.ui.xh0;
public final class vv implements org.telegram.ui.Cells.u9, iy0 {
    public static Paint T;
    public final AtomicReference D;
    public org.telegram.ui.Components.k5 E;
    public final k80 F;
    public k80 G;
    public t80 H;
    public ji.a I;
    public ns J;
    public boolean K;
    public nh.i L;
    public CharacterStyle M;
    public int N;
    public int O;
    public org.telegram.ui.Components.o5 P;
    public uu Q;
    public final RectF R;
    public View S;
    public final wv f18903a;
    public final StaticLayout f18904b;
    public int f18905c;
    public int d;
    public int e;
    public final int f18906f;
    public final int h;
    public final int f18907n;
    public boolean f18908r;
    public final int f18909s;
    public boolean f18910w;
    public final ArrayList f18911x;
    public final Stack f18912y;

    public vv(wv wvVar, CharSequence charSequence, int i10) {
        this(wvVar, charSequence, i10, Layout.Alignment.ALIGN_NORMAL);
    }

    public static a3.l s(Spanned spanned, int i10, int i11, TextPaint textPaint) {
        int[] iArr;
        uu[] uuVarArr;
        uu uuVar;
        int i12;
        int i13;
        ?? obj = new Object();
        int i14 = i11 - i10;
        if (i14 > 0) {
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(i10, i11, org.telegram.ui.Components.o5.class);
            h6[] h6VarArr = (h6[]) spanned.getSpans(i10, i11, h6.class);
            if (o5VarArr.length == 0 && h6VarArr.length == 0) {
                iArr = null;
            } else {
                iArr = new int[i14];
            }
            int length = o5VarArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i15;
                org.telegram.ui.Components.o5 o5Var = o5VarArr[i16];
                int spanStart = spanned.getSpanStart(o5Var);
                int min = Math.min(i11, spanned.getSpanEnd(o5Var));
                if (spanStart >= i10 && spanStart < i11 && min > spanStart) {
                    int i17 = spanStart - i10;
                    iArr[i17] = Math.max(iArr[i17], min);
                    i13 = i16;
                    obj.f141c = Math.max(obj.f141c, o5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                } else {
                    i13 = i16;
                }
                i15 = i13 + 1;
            }
            for (h6 h6Var : h6VarArr) {
                int spanStart2 = spanned.getSpanStart(h6Var);
                int min2 = Math.min(i11, spanned.getSpanEnd(h6Var));
                if (spanStart2 >= i10 && spanStart2 < i11 && min2 > spanStart2) {
                    int i18 = spanStart2 - i10;
                    iArr[i18] = Math.max(iArr[i18], min2);
                    obj.f141c = Math.max(obj.f141c, h6Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            uu[] uuVarArr2 = (uu[]) spanned.getSpans(i10, i11, uu.class);
            if (uuVarArr2.length > 0) {
                uuVarArr = null;
                for (uu uuVar2 : uuVarArr2) {
                    int spanStart3 = spanned.getSpanStart(uuVar2);
                    if (uuVar2.f18476a.f18144a.f18909s > 0 && spanStart3 >= i10 && spanStart3 < i11) {
                        if (uuVarArr == null) {
                            uuVarArr = new uu[i14];
                        }
                        uuVarArr[spanStart3 - i10] = uuVar2;
                    }
                }
            } else {
                uuVarArr = null;
            }
            if (iArr != null || uuVarArr != null) {
                int i19 = i10;
                while (i19 < i11) {
                    int i20 = i19 - i10;
                    if (uuVarArr == null) {
                        uuVar = null;
                    } else {
                        uuVar = uuVarArr[i20];
                    }
                    if (uuVar != null) {
                        su suVar = uuVar.f18476a;
                        vv vvVar = suVar.f18144a;
                        vv vvVar2 = suVar.f18144a;
                        if (vvVar.f18904b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) vvVar2.f18904b.getText();
                            a3.l s10 = s(spanned2, 0, spanned2.length(), vvVar2.f18904b.getPaint());
                            obj.f139a += s10.f139a;
                            obj.f140b += Math.max(1, s10.f140b);
                            obj.f141c = Math.max(obj.f141c, s10.f141c);
                            i19 = Math.min(i11, spanned.getSpanEnd(uuVar));
                        }
                    }
                    if (iArr == null) {
                        i12 = 0;
                    } else {
                        i12 = iArr[i20];
                    }
                    if (i12 > i19) {
                        obj.f139a++;
                        obj.f140b++;
                        i19 = i12;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i19);
                        if (!Character.isWhitespace(codePointAt)) {
                            obj.f140b++;
                        }
                        i19 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return obj;
    }

    @Override
    public final Layout a() {
        return this.f18904b;
    }

    @Override
    public final int b() {
        return this.f18909s;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        int i10;
        int i11;
        View view2;
        boolean z10;
        int i12;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        wv wvVar = this.f18903a;
        boolean E = wvVar.E();
        TextPaint textPaint = wvVar.f19347w;
        if (E) {
            i10 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        textPaint.setColor(w02);
        if (wvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D);
        k80 k80Var = this.F;
        if (k80Var != null) {
            if (T == null) {
                Paint paint = new Paint(1);
                T = paint;
                paint.setPathEffect(k80.c());
            }
            T.setColor((wvVar.f19349y.i() & 16777215) | 855638016);
            canvas.drawPath(k80Var, T);
        }
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.S;
        }
        ji.a aVar = this.I;
        if (aVar != null && aVar.h(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.f18904b;
        AtomicReference atomicReference = this.D;
        ArrayList arrayList = this.f18911x;
        nh.i.g(view2, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.f18904b;
        hv0.a(canvas, staticLayout2);
        if (!wvVar.F()) {
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.f18904b, this.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f7 = wvVar.V;
        if (f7 > 0.0f) {
            kj kjVar = wvVar.f19330b;
            if (!wvVar.O && (kjVar == null || !wp.r1(wvVar.f19329a).f19253t7.A(kjVar))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.H == null) {
                t80 t80Var = new t80();
                this.H = t80Var;
                t80Var.D = true;
                k80 k80Var2 = new k80(0);
                this.G = k80Var2;
                k80Var2.f27550c = true;
                t80 t80Var2 = this.H;
                t80Var2.f30593y = k80Var2;
                t80Var2.k(5.0f);
                this.H.f30574b = -1L;
                this.G.reset();
                this.G.d(staticLayout2, 0, 0.0f);
                this.G.f27779n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.G);
                k80 k80Var3 = this.G;
                k80Var3.f27779n = true;
                k80Var3.a();
                this.H.l();
            }
            if (z10 && (this.H.d() || this.H.c())) {
                t80 t80Var3 = this.H;
                t80Var3.f30574b = -1L;
                t80Var3.f30575c = -1L;
            } else if (!z10 && !this.H.d() && !this.H.c()) {
                this.H.a();
            }
            if (wvVar.E()) {
                i12 = org.telegram.ui.ActionBar.t6.Vc;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i12, wvVar.D);
            this.H.g(org.telegram.ui.ActionBar.t6.r1(0.05f, w03), org.telegram.ui.ActionBar.t6.r1(0.15f, w03), org.telegram.ui.ActionBar.t6.r1(0.1f, w03), org.telegram.ui.ActionBar.t6.r1(0.3f, w03));
            this.H.setAlpha((int) (f7 * 255.0f));
            this.H.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(uu uuVar, float f7, float f10) {
        float L = i0.L(8.0f);
        RectF rectF = uuVar.f18478c;
        if (f7 < rectF.left - L || f7 >= rectF.right + L || f10 < rectF.top - L || f10 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.f18904b;
            uu uuVar2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                uu[] uuVarArr = (uu[]) spanned.getSpans(0, spanned.length(), uu.class);
                if (uuVarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(uuVarArr[0]);
                    int spanEnd = spanned.getSpanEnd(uuVarArr[0]);
                    int i10 = 0;
                    while (true) {
                        if (i10 < spanned.length()) {
                            if ((i10 < spanStart || i10 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i10))) {
                                break;
                            }
                            i10++;
                        } else {
                            uuVar2 = uuVarArr[0];
                            break;
                        }
                    }
                }
            }
            if (uuVar != uuVar2 || !this.R.contains(f7, f10)) {
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
            org.telegram.ui.Components.o5.release((View) null, this.E);
            this.E = null;
            ji.a aVar = this.I;
            if (aVar != null) {
                aVar.f10424c = null;
            }
            uu[] p5 = p();
            if (p5 != null) {
                for (uu uuVar : p5) {
                    View view3 = this.S;
                    uuVar.h = null;
                    uuVar.f18476a.f18144a.f(view3);
                }
            }
        }
    }

    @Override
    public final void g(int i10) {
        this.e = i10;
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
        return this.f18905c;
    }

    @Override
    public final int getY() {
        return this.d;
    }

    @Override
    public final void h(int i10) {
        this.d = i10;
    }

    @Override
    public final void i(View view) {
        boolean z10;
        View view2 = this.S;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.S = view;
            if (this.f18903a.v && !this.f18910w) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.E = org.telegram.ui.Components.o5.update(0, view, z10, this.E, this.f18904b);
            ji.a aVar = this.I;
            if (aVar != null) {
                aVar.f10424c = this.S;
            }
            uu[] p5 = p();
            if (p5 != null) {
                for (uu uuVar : p5) {
                    uuVar.a(this.S);
                }
            }
        }
    }

    @Override
    public final void j(int i10) {
        this.f18905c = i10;
    }

    public final void k() {
        ns nsVar = this.J;
        if (nsVar != null) {
            i0.r(nsVar);
            this.J = null;
        }
    }

    public final void l(android.text.style.CharacterStyle r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vv.l(android.text.style.CharacterStyle, boolean):void");
    }

    public final void m(Canvas canvas, int i10, float f7) {
        int i11;
        int i12;
        canvas.save();
        canvas.translate(-n(), 0.0f);
        wv wvVar = this.f18903a;
        boolean E = wvVar.E();
        TextPaint textPaint = wvVar.f19347w;
        if (E) {
            i11 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.Sc;
        }
        final int w02 = org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D);
        textPaint.setColor(w02);
        if (wvVar.E()) {
            i12 = org.telegram.ui.ActionBar.t6.Vc;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(i12, wvVar.D);
        final View view = this.S;
        xh0.b(canvas, this.f18904b, i10, f7, new wh0() {
            @Override
            public final void d(Canvas canvas2) {
                vv vvVar = vv.this;
                AtomicReference atomicReference = vvVar.D;
                StaticLayout staticLayout = vvVar.f18904b;
                ArrayList arrayList = vvVar.f18911x;
                nh.i.g(view, false, w02, 0, atomicReference, 0, staticLayout, arrayList, canvas2, false);
                hv0.a(canvas2, vvVar.f18904b);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, vvVar.f18904b, vvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        });
        canvas.restore();
    }

    public final int n() {
        if (this.f18908r) {
            return 0;
        }
        return this.f18906f;
    }

    public final boolean o(CharacterStyle characterStyle, iu iuVar) {
        StaticLayout staticLayout = this.f18904b;
        if (staticLayout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) staticLayout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart >= 0 && spanEnd > spanStart) {
                iuVar.f16345a = staticLayout;
                iuVar.f16346b = spanStart;
                iuVar.f16347c = spanEnd;
                iuVar.d = staticLayout.getWidth();
                return true;
            }
            return false;
        }
        return false;
    }

    public final uu[] p() {
        StaticLayout staticLayout = this.f18904b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (uu[]) spanned.getSpans(0, spanned.length(), uu.class);
    }

    public final int q() {
        return Math.max(0, this.f18907n - this.f18906f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f18906f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        sv svVar;
        sv svVar2;
        int spanEnd;
        sv svVar3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n10 = n() + ((int) motionEvent.getX());
        int y3 = (int) motionEvent.getY();
        ArrayList arrayList = this.f18911x;
        wv wvVar = this.f18903a;
        StaticLayout staticLayout = this.f18904b;
        boolean z12 = true;
        int i10 = 0;
        if (actionMasked == 0) {
            this.L = null;
            this.M = null;
            this.P = null;
            this.Q = null;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                nh.i iVar = (nh.i) obj;
                if (iVar.getBounds().contains(n10, y3)) {
                    this.L = iVar;
                    return true;
                }
            }
            uu[] p5 = p();
            if (p5 != null) {
                for (uu uuVar : p5) {
                    if (e(uuVar, n10, y3)) {
                        su suVar = uuVar.f18476a;
                        if (suVar.f18145b) {
                            return true;
                        }
                        this.Q = uuVar;
                        this.K = false;
                        suVar.m(true);
                        View view = this.S;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y3 >= 0 && y3 < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y3);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f7 = n10;
                if (f7 >= lineLeft && f7 <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f7);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.M = clickableSpan;
                        this.N = spannable.getSpanStart(clickableSpan);
                        this.O = spannable.getSpanEnd(this.M);
                        this.K = false;
                        q80 q80Var = new q80(this.M, wvVar.D, f7, y3, 0);
                        k80 b10 = q80Var.b();
                        b10.d(staticLayout, this.N, 0.0f);
                        staticLayout.getSelectionPath(this.N, this.O, b10);
                        if (this.I == null) {
                            this.I = new ji.a(this.S);
                        }
                        this.I.b(q80Var, null);
                        View view2 = this.S;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    sv[] svVarArr = (sv[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, sv.class);
                    if (svVarArr != null) {
                        int length = svVarArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            z11 = z12;
                            svVar = svVarArr[i12];
                            if (TLObject.hasFlag(svVar.f18167b, 256)) {
                                break;
                            }
                            i12++;
                            z12 = z11;
                        }
                    }
                    z11 = z12;
                    svVar = null;
                    if (svVar != null) {
                        int spanStart2 = spannable.getSpanStart(svVar);
                        int spanEnd2 = spannable.getSpanEnd(svVar);
                        while (spanStart2 > 0) {
                            int i13 = spanStart2 - 1;
                            sv[] svVarArr2 = (sv[]) spannable.getSpans(i13, i13, sv.class);
                            int length2 = svVarArr2.length;
                            int i14 = i10;
                            while (true) {
                                if (i14 < length2) {
                                    svVar3 = svVarArr2[i14];
                                    if (TLObject.hasFlag(svVar3.f18167b, 256)) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    svVar3 = null;
                                    break;
                                }
                            }
                            if (svVar3 == null || (spanStart = spannable.getSpanStart(svVar3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i10 = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            sv[] svVarArr3 = (sv[]) spannable.getSpans(spanEnd2, spanEnd2, sv.class);
                            int length3 = svVarArr3.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 < length3) {
                                    svVar2 = svVarArr3[i15];
                                    if (TLObject.hasFlag(svVar2.f18167b, 256)) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    svVar2 = null;
                                    break;
                                }
                            }
                            if (svVar2 == null || (spanEnd = spannable.getSpanEnd(svVar2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.M = svVar;
                        this.N = spanStart2;
                        this.O = spanEnd2;
                        this.K = false;
                        q80 q80Var2 = new q80(svVar, wvVar.D, f7, y3, 0);
                        k80 b11 = q80Var2.b();
                        b11.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b11);
                        if (this.I == null) {
                            this.I = new ji.a(this.S);
                        }
                        this.I.b(q80Var2, null);
                        View view3 = this.S;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z11;
                    }
                    org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.o5.class);
                    if (o5VarArr != null && o5VarArr.length > 0) {
                        this.P = o5VarArr[0];
                        return z11;
                    }
                }
            }
            return false;
        } else if (actionMasked == 2) {
            uu uuVar2 = this.Q;
            if (uuVar2 != null) {
                if (e(uuVar2, n10, y3)) {
                    return true;
                }
                k();
                this.Q.f18476a.m(false);
                this.Q = null;
                this.K = false;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.Q != null) {
                k();
                uu uuVar3 = this.Q;
                this.Q = null;
                uuVar3.f18476a.m(false);
                if (!this.K) {
                    View view4 = this.S;
                    if (view4 != null) {
                        view4.playSoundEffect(0);
                    }
                    org.telegram.ui.Cells.q1 q1Var = wvVar.E;
                    org.telegram.ui.Cells.l1 l1Var = wvVar.F;
                    TL_iv.textButton textbutton = uuVar3.f18477b;
                    if (q1Var != null && l1Var != null) {
                        l1Var.W0(q1Var, textbutton);
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                this.K = z10;
                return true;
            } else if (this.L != null) {
                float width = staticLayout.getWidth();
                float height = staticLayout.getHeight();
                float sqrt = (float) Math.sqrt((height * height) + (width * width));
                View view5 = this.S;
                this.L.f13853q = new tv(this, view5, wvVar);
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((nh.i) obj2).j(n10, y3, sqrt, false);
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
                ji.a aVar = this.I;
                if (aVar != null) {
                    aVar.f(true);
                }
                this.M = null;
                this.K = false;
                return true;
            } else {
                org.telegram.ui.Components.o5 o5Var = this.P;
                if (o5Var == null) {
                    return false;
                }
                this.P = null;
                org.telegram.ui.Cells.q1 q1Var2 = wvVar.E;
                org.telegram.ui.Cells.l1 l1Var2 = wvVar.F;
                if (q1Var2 != null && l1Var2 != null) {
                    View view6 = this.S;
                    if (view6 != null) {
                        view6.playSoundEffect(0);
                    }
                    l1Var2.m0(o5Var);
                    return true;
                }
                return true;
            }
        } else if (actionMasked == 3) {
            this.L = null;
            this.P = null;
            if (this.Q != null) {
                k();
                this.Q.f18476a.m(false);
                this.Q = null;
                this.K = false;
            }
            if (this.M != null) {
                k();
                ji.a aVar2 = this.I;
                if (aVar2 != null) {
                    aVar2.f(true);
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
        ns nsVar = new ns(this, 9);
        this.J = nsVar;
        i0.h3(nsVar, ViewConfiguration.getLongPressTimeout());
    }

    public vv(wv wvVar, CharSequence charSequence, int i10, Layout.Alignment alignment) {
        this(wvVar, charSequence, i10, alignment, 1.0f);
    }

    public vv(wv wvVar, CharSequence charSequence, int i10, Layout.Alignment alignment, float f7) {
        boolean z10;
        sv[] svVarArr;
        int i11;
        int L;
        int i12;
        sv[] svVarArr2;
        uu[] uuVarArr;
        SpannableStringBuilder spannableStringBuilder;
        Class<org.telegram.ui.Components.o5> cls;
        int i13;
        h6[] h6VarArr;
        sv[] svVarArr3;
        this.f18911x = new ArrayList();
        this.f18912y = new Stack();
        this.D = new AtomicReference();
        this.R = new RectF();
        this.f18903a = wvVar;
        TextPaint textPaint = wvVar.f19347w;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        boolean z11 = true;
        boolean z12 = false;
        if (charSequence instanceof Spanned) {
            for (sv svVar : (sv[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), sv.class)) {
                int i14 = svVar.f18167b & 15;
                if (i14 >= 1 && i14 <= 6) {
                    TextPaint textPaint2 = new TextPaint(textPaint);
                    svVar.a(textPaint2);
                    fontMetricsInt = textPaint2.getFontMetricsInt();
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        CharSequence n10 = k6.n(charSequence, fontMetricsInt, false, null, 0, z10 ? 0.85f : 1.0f, 0);
        if (n10 instanceof Spanned) {
            Spanned spanned = (Spanned) n10;
            Class<org.telegram.ui.Components.o5> cls2 = org.telegram.ui.Components.o5.class;
            if (((org.telegram.ui.Components.o5[]) spanned.getSpans(0, spanned.length(), cls2)).length != 0 || ((h6[]) spanned.getSpans(0, spanned.length(), h6.class)).length != 0 || ((uu[]) spanned.getSpans(0, spanned.length(), uu.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cls2)) {
                    o5Var.setPreserveFontMetrics(true);
                }
                for (h6 h6Var : (h6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), h6.class)) {
                    h6Var.e = true;
                }
                for (uu uuVar : (uu[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), uu.class)) {
                    if (uuVar.f18476a.f18144a.f18909s > 0) {
                        uuVar.e = true;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        break;
                    }
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i15);
                    boolean z13 = indexOf >= 0 ? z11 : z12;
                    indexOf = z13 ? indexOf : spannableStringBuilder2.length();
                    a3.l s10 = s(spannableStringBuilder2, i15, indexOf, textPaint);
                    int i16 = s10.f140b;
                    if (i16 <= 0 || s10.f139a * 100 < i16 * 70 || (i13 = s10.f141c) <= 0) {
                        spannableStringBuilder = spannableStringBuilder2;
                        cls = cls2;
                    } else {
                        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(i15, indexOf, cls2);
                        int length = o5VarArr.length;
                        int i17 = 0;
                        while (i17 < length) {
                            org.telegram.ui.Components.o5 o5Var2 = o5VarArr[i17];
                            Class<org.telegram.ui.Components.o5> cls3 = cls2;
                            int spanStart = spannableStringBuilder2.getSpanStart(o5Var2);
                            if (spanStart >= i15 && spanStart < indexOf) {
                                o5Var2.setMinimumLineHeight(i13);
                            }
                            i17++;
                            cls2 = cls3;
                        }
                        cls = cls2;
                        for (h6 h6Var2 : (h6[]) spannableStringBuilder2.getSpans(i15, indexOf, h6.class)) {
                            int spanStart2 = spannableStringBuilder2.getSpanStart(h6Var2);
                            if (spanStart2 >= i15 && spanStart2 < indexOf) {
                                h6Var2.f16027f = i13;
                            }
                        }
                        uu[] uuVarArr2 = (uu[]) spannableStringBuilder2.getSpans(i15, indexOf, uu.class);
                        int length2 = uuVarArr2.length;
                        int i18 = 0;
                        while (i18 < length2) {
                            uu uuVar2 = uuVarArr2[i18];
                            int spanStart3 = spannableStringBuilder2.getSpanStart(uuVar2);
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            if (uuVar2.f18476a.f18144a.f18909s > 0 && spanStart3 >= i15 && spanStart3 < indexOf) {
                                uuVar2.f18479f = i13;
                            }
                            i18++;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (!z13) {
                        break;
                    }
                    i15 = indexOf + 1;
                    cls2 = cls;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z11 = true;
                    z12 = false;
                }
                n10 = spannableStringBuilder;
            }
        }
        int d = bi.s6.d(n10);
        this.f18909s = d;
        if (d == 0 && (n10 instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n10;
            uu[] uuVarArr3 = (uu[]) spanned2.getSpans(0, n10.length(), uu.class);
            if (uuVarArr3.length > 0) {
                Arrays.sort(uuVarArr3, new qu(spanned2, 1));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(n10);
                int length3 = uuVarArr3.length;
                int i19 = 0;
                while (true) {
                    if (i19 < length3) {
                        uu uuVar3 = uuVarArr3[i19];
                        int spanStart4 = spanned2.getSpanStart(uuVar3);
                        int spanEnd = spanned2.getSpanEnd(uuVar3);
                        if (spanStart4 < 0 || spanEnd <= spanStart4) {
                            break;
                        }
                        vv vvVar = uuVar3.f18476a.f18144a;
                        if (vvVar.f18909s == 0) {
                            break;
                        }
                        spannableStringBuilder4.replace(spanStart4, spanEnd, vvVar.f18904b.getText());
                        i19++;
                    } else {
                        this.f18909s = bi.s6.d(spannableStringBuilder4);
                        break;
                    }
                }
            }
        }
        if (this.f18909s > 0 && (n10 instanceof Spanned)) {
            for (sv svVar2 : (sv[]) ((Spanned) n10).getSpans(0, n10.length(), sv.class)) {
                if ((svVar2.f18167b & 15) == 14) {
                    svVar2.d = true;
                }
            }
        }
        if (n10 instanceof Spanned) {
            sv[] svVarArr4 = (sv[]) ((Spanned) n10).getSpans(0, n10.length(), sv.class);
            int length4 = svVarArr4.length;
            for (int i20 = 0; i20 < length4 && (svVarArr4[i20].f18167b & 15) == 0; i20++) {
            }
        }
        this.f18904b = kj.g5(n10, wvVar.f19347w, i10, f7, 0.0f, false, alignment);
        this.f18906f = i10;
        this.h = 0;
        for (int i21 = 0; i21 < this.f18904b.getLineCount(); i21++) {
            this.f18906f = Math.min(this.f18906f, (int) Math.floor(this.f18904b.getLineLeft(i21)));
            this.h = Math.max(this.h, (int) Math.ceil(this.f18904b.getLineRight(i21)));
        }
        this.f18907n = 0;
        if (this.f18904b.getLineCount() > 0) {
            StaticLayout staticLayout = this.f18904b;
            this.f18907n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        k80 k80Var = null;
        nh.i.c(null, this.f18904b, this.f18912y, this.f18911x);
        if (this.f18904b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.f18904b.getText();
            for (sv svVar3 : (sv[]) spanned3.getSpans(0, spanned3.length(), sv.class)) {
                int i22 = svVar3.f18167b;
                if (TLObject.hasFlag(i22, 8192)) {
                    int spanStart5 = spanned3.getSpanStart(svVar3);
                    int spanEnd2 = spanned3.getSpanEnd(svVar3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (k80Var == null) {
                            i11 = 0;
                            k80Var = new k80(0);
                            k80Var.f27779n = false;
                        } else {
                            i11 = 0;
                        }
                        k80Var.d(this.f18904b, spanStart5, 0.0f);
                        if (TLObject.hasFlag(i22, 4096)) {
                            L = -i0.L(6.0f);
                        } else {
                            L = TLObject.hasFlag(i22, 2048) ? i0.L(2.0f) : i11;
                        }
                        if (L != 0) {
                            i12 = L + i0.L(L > 0 ? 5.0f : -2.0f);
                        } else {
                            i12 = i11;
                        }
                        k80Var.f27780o = i12;
                        this.f18904b.getSelectionPath(spanStart5, spanEnd2, k80Var);
                    }
                }
            }
            if (k80Var != null) {
                k80Var.f27779n = true;
                this.F = k80Var;
            }
        }
    }
}
