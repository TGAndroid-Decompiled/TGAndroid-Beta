package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.wg0;
import org.telegram.ui.yg0;
public abstract class au implements wg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.mc K;
    public yg0 L;
    public gu M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final fv f22932a;
    public final Rect f22933b;
    public final int f22934c;
    public StaticLayout d;
    public float f22935e;
    public int f22936f;
    public int h;
    public int f22937n;
    public CheckBoxBase f22938r;
    public float f22939s;
    public int f22940w;
    public boolean f22941x;
    public boolean f22942y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public au(fv fvVar, Rect rect, int i7) {
        this.f22932a = fvVar;
        this.f22933b = new Rect(rect);
        this.f22934c = (i7 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.p9[] p9VarArr = (org.telegram.ui.Cells.p9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.p9.class);
        if (p9VarArr != null && p9VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(p9VarArr, new zt(spanned, 0));
            for (org.telegram.ui.Cells.p9 p9Var : p9VarArr) {
                int spanStart = spanned.getSpanStart(p9Var);
                int spanEnd = spanned.getSpanEnd(p9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = p9Var.f31256a;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
                }
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, ev evVar, ev[] evVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (evVar != null && (staticLayout2 = evVar.f23734b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
        } else if (evVarArr != null) {
            for (ev evVar2 : evVarArr) {
                if (evVar2 != null && (staticLayout = evVar2.f23734b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i7, Rect rect) {
        int i10 = this.f22933b.left;
        float f10 = this.N;
        rect.set(i10, (int) f10, this.f22934c + i10, (int) (f10 + I()));
    }

    public int B() {
        return 0;
    }

    public CharSequence D() {
        return null;
    }

    public CharSequence E(int i7) {
        return null;
    }

    public final RectF F() {
        fv fvVar = this.f22932a;
        float textY = fvVar.E.getTextY() + this.N;
        Rect rect = this.f22933b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (fvVar.E.getTextX() - fvVar.S), f10, ((fvVar.E.getTextX() + fvVar.C) + fvVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
    }

    public final boolean G() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.f22938r;
        if (checkBoxBase != null && checkBoxBase.f32840q) {
            return true;
        }
        return false;
    }

    public int H() {
        return 0;
    }

    public abstract int I();

    public int J() {
        return K();
    }

    public int K() {
        Rect rect = this.f22933b;
        return rect.left + this.f22934c + rect.right;
    }

    public org.telegram.ui.Cells.u9[] L() {
        return null;
    }

    public final boolean M(int i7) {
        if (this.f22938r != null && i7 == 0 && G()) {
            return true;
        }
        return false;
    }

    public final boolean O(int i7) {
        if (this.f22938r != null && i7 == 0 && !n()) {
            return false;
        }
        return true;
    }

    public final boolean P(int i7) {
        if ((this.f22938r == null || i7 != 0) && (this instanceof gu)) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        fv fvVar = this.f22932a;
        if (fvVar.h.isEmpty() || (indexOf = fvVar.f23945g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < fvVar.h.size(); i7++) {
            wt wtVar = (wt) fvVar.h.get(i7);
            if (indexOf >= wtVar.f27763a && indexOf <= wtVar.f27764b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        gu guVar = this.M;
        if (guVar == null) {
            return true;
        }
        if (!guVar.X.open) {
            return false;
        }
        return guVar.S();
    }

    public boolean U(int i7, View view) {
        return false;
    }

    public void X(Canvas canvas, int i7, float f10) {
        W(canvas);
    }

    public boolean Y(MotionEvent motionEvent) {
        return false;
    }

    public void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        org.telegram.ui.Cells.u9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.u9 u9Var : L) {
                if (u9Var instanceof ev) {
                    ev evVar = (ev) u9Var;
                    evVar.f23735c = i7 - evVar.f23737f;
                    evVar.d = i10;
                    evVar.f23736e = i11;
                }
            }
        }
    }

    @Override
    public Layout a() {
        return null;
    }

    public final void a0(boolean z10) {
        View view = this.W;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z10);
            }
        }
    }

    public void b(boolean z10) {
        a0(z10);
    }

    public final void b0(TLObject tLObject, boolean z10) {
        this.H = tLObject;
        if (this.f22938r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.f22932a.D);
            this.f22938r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.m6.Yl, org.telegram.ui.ActionBar.m6.f29757z5, org.telegram.ui.ActionBar.m6.f29477k7);
            this.f22938r.d(10);
            this.f22938r.k(true);
            this.f22938r.i(g0.L(5.0f));
        }
        this.f22938r.f(-1, z10, false);
        g0();
    }

    public final void c0(String str) {
        CharSequence text;
        String str2;
        int i7;
        Layout.Alignment alignment;
        fv fvVar = this.f22932a;
        fvVar.f23960x.setTextSize(g0.L(cz.W0));
        Layout a10 = a();
        if (a10 == null) {
            text = null;
        } else {
            text = a10.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (bv bvVar : (bv[]) ((Spanned) text).getSpans(0, 1, bv.class)) {
                if (TLObject.hasFlag(bvVar.f23149b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i10 = this.f22937n;
        if (i10 <= 0) {
            boolean I = fvVar.I();
            Rect rect = this.f22933b;
            if (I) {
                i7 = rect.right;
            } else {
                i7 = rect.left;
            }
            i10 = Math.max(i7, g0.L(fvVar.M + 4));
        }
        int i11 = i10;
        TextPaint textPaint = fvVar.f23960x;
        if (fvVar.I()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i11, alignment, 1.0f, 0.0f, false);
        this.f22936f = g0.L(fvVar.M + 4);
        this.h = 0;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f22936f = Math.min(this.f22936f, (int) this.d.getLineLeft(i12));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i12));
        }
        g0();
    }

    public void d0() {
        this.P = this.N;
        this.Q = this.O;
        this.S = this.R;
    }

    @Override
    public final View e() {
        return null;
    }

    public final void e0() {
        if (!n()) {
            return;
        }
        fv fvVar = this.f22932a;
        if (!np.u1(fvVar.f23940a).B4()) {
            new ug.y0(43, fvVar.E.getContext(), fvVar.D).show();
            return;
        }
        boolean z10 = !G();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z10;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
        }
        View view = fvVar.Q;
        if (view != null) {
            this.f22938r.f32826a = view;
        }
        this.f22938r.f(-1, z10, true);
        View view2 = fvVar.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = fvVar.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        fvVar.F.a2(fvVar.E, new j10(5, this, z10));
    }

    public final boolean f0(MotionEvent motionEvent) {
        boolean z10;
        View view;
        Rect rect = this.f22933b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.f22938r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                fv fvVar = this.f22932a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = fvVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.mc(view);
                        }
                        org.telegram.ui.Components.mc mcVar = this.K;
                        if (mcVar != null) {
                            mcVar.c(true);
                        }
                        View view2 = fvVar.Q;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        motionEvent.offsetLocation(rect.left, rect.top);
                        return true;
                    }
                } else if (this.J) {
                    if (actionMasked == 2) {
                        if (!contains) {
                            this.J = false;
                            org.telegram.ui.Components.mc mcVar2 = this.K;
                            if (mcVar2 != null) {
                                mcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (actionMasked == 1 && contains) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.J = false;
                        org.telegram.ui.Components.mc mcVar3 = this.K;
                        if (mcVar3 != null) {
                            mcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = fvVar.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return true;
                }
            }
            boolean Y = Y(motionEvent);
            motionEvent.offsetLocation(rect.left, rect.top);
            return Y;
        } catch (Throwable th2) {
            motionEvent.offsetLocation(rect.left, rect.top);
            throw th2;
        }
    }

    public final void g0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.f22933b;
        fv fvVar = this.f22932a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.f22935e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            } else {
                this.f22935e = (Math.min(g0.L(fvVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.f22938r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.f22939s = (a().getLineBaseline(0) + H()) - (g0.L(20.0f) * 0.7f);
                return;
            }
            this.f22939s = (Math.min(g0.L(fvVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
            CheckBoxBase checkBoxBase = this.f22938r;
            if (checkBoxBase != null) {
                checkBoxBase.f32835l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.f22938r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32826a = view;
            checkBoxBase2.f32835l = true;
        }
        T();
    }

    public final boolean n() {
        fv fvVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        if (this.f22938r != null && this.H != null && (r1Var = (fvVar = this.f22932a).E) != null && (m1Var = fvVar.F) != null && m1Var.U(r1Var)) {
            return true;
        }
        return false;
    }

    public void p(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void q(Canvas canvas) {
        r(canvas, Integer.MIN_VALUE, 0.0f);
    }

    public final void r(Canvas canvas, int i7, float f10) {
        int i10;
        float f11;
        int i11;
        float N;
        float f12;
        canvas.save();
        Rect rect = this.f22933b;
        canvas.translate(rect.left, rect.top);
        fv fvVar = this.f22932a;
        boolean I = fvVar.I();
        TextPaint textPaint = fvVar.f23960x;
        float L = (((fvVar.C + fvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(cz.W0));
            if (fvVar.E()) {
                i11 = org.telegram.ui.ActionBar.m6.Wc;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i11, fvVar.D));
            canvas.save();
            int i12 = 0;
            if (!this.f22941x && !this.f22942y) {
                float N2 = g0.N(5.0f);
                if (I) {
                    N = (this.f22937n + L) - g0.N(0.5f);
                    f12 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + g0.N(0.5f);
                    f12 = this.f22937n;
                }
                canvas.drawCircle(N - f12, (this.f22935e + this.d.getLineBaseline(0)) - (g0.L(cz.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                float L2 = (g0.L(0.0f) + L) - this.f22936f;
                if (this.f22938r != null) {
                    i12 = g0.L(26.0f);
                }
                canvas.translate(L2 + i12, this.f22935e);
                this.d.draw(canvas);
            } else {
                canvas.translate((g0.L(0.0f) - this.f22937n) - this.f22936f, this.f22935e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f22938r != null) {
            if (I) {
                i10 = (int) (L + g0.L(6.0f));
            } else {
                i10 = -g0.L(26.0f);
            }
            this.I.set(i10 - g0.L(6.0f), this.f22939s - g0.L(6.0f), g0.L(6.0f) + g0.L(20.0f) + i10, this.f22939s + g0.L(20.0f) + g0.L(6.0f));
            View view = fvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.f22938r;
                if (checkBoxBase.f32826a == null) {
                    checkBoxBase.f32826a = view;
                }
            }
            org.telegram.ui.Components.mc mcVar = this.K;
            if (mcVar != null) {
                f11 = mcVar.a(0.1f);
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            canvas.scale(f11, f11, g0.L(10.0f) + i10, this.f22939s + g0.L(10.0f));
            this.f22938r.e(i10, (int) this.f22939s, g0.L(20.0f), g0.L(20.0f));
            this.f22938r.a(canvas);
            canvas.restore();
        }
        if (i7 == Integer.MIN_VALUE) {
            W(canvas);
        } else {
            X(canvas, i7, f10);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        ev evVar;
        org.telegram.ui.Components.u5 u5Var;
        org.telegram.ui.Cells.u9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.u9 u9Var : L) {
            if ((u9Var instanceof ev) && (u5Var = (evVar = (ev) u9Var).F) != null && !u5Var.f40244a.isEmpty()) {
                canvas.save();
                canvas.translate(evVar.f23735c, evVar.d - this.N);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar.f23734b, evVar.F, 0.0f, evVar.f23742x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        int i7;
        yg0 yg0Var = this.L;
        if (yg0Var != null && yg0Var.h && yg0Var.d(this) >= 0) {
            if (yg0Var.i(this)) {
                float f10 = 0.0f;
                if (yg0Var.g(this)) {
                    if (yg0Var.g(this)) {
                        i7 = yg0Var.f54174e;
                    } else {
                        i7 = -1;
                    }
                    if (yg0Var.g(this)) {
                        f10 = yg0Var.f54175f;
                    }
                    r(canvas, i7, f10);
                    return;
                }
                float c10 = yg0Var.c(this);
                if (c10 <= 0.0f) {
                    return;
                }
                if (c10 < 1.0f) {
                    Rect rect = this.f22933b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.f22934c + rect.right, I(), (int) (c10 * 255.0f));
                    q(canvas);
                    canvas.restoreToCount(saveLayerAlpha);
                    return;
                }
            } else {
                return;
            }
        }
        q(canvas);
    }

    public boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        ev evVar;
        org.telegram.ui.Cells.u9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.u9 u9Var : L) {
                if (u9Var instanceof ev) {
                    if (((ev) u9Var).o(characterStyle, rtVar)) {
                        Rect rect = this.f22933b;
                        rtVar.f26625e = rect.left - evVar.f23737f;
                        rtVar.f26626f = i7 + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean v() {
        if (J() >= K()) {
            return true;
        }
        return false;
    }

    public final void w(int i7, Rect rect) {
        int i10;
        CheckBoxBase checkBoxBase = this.f22938r;
        if (checkBoxBase != null && i7 == 0) {
            int i11 = this.f22933b.left;
            float f10 = this.N;
            rect.set(i11, (int) f10, this.f22934c + i11, (int) (f10 + I()));
        } else {
            if (checkBoxBase == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            A(i7 - i10, rect);
        }
        fv fvVar = this.f22932a;
        int i12 = fvVar.C + fvVar.T;
        int min = Math.min(i12, Math.max(rect.left, -fvVar.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i7) {
        int i10;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.f22938r;
        if (checkBoxBase != null && i7 == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f22941x && (staticLayout = this.d) != null) {
                charSequence = staticLayout.getText();
            } else {
                charSequence = null;
            }
            CharSequence y10 = y();
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(charSequence).append(' ');
            }
            if (!TextUtils.isEmpty(y10)) {
                spannableStringBuilder.append(y10).append(", ");
            }
            k(spannableStringBuilder);
            if (spannableStringBuilder.length() > 0) {
                return spannableStringBuilder;
            }
            return hd.N0(2131754903, null);
        }
        if (checkBoxBase == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return E(i7 - i10);
    }

    public CharSequence y() {
        String N0;
        int i7 = this.F;
        String str = null;
        if (i7 == 0) {
            N0 = null;
        } else {
            N0 = hd.N0(i7, null);
        }
        int i10 = this.G;
        if (i10 != 0) {
            str = hd.N0(i10, null);
        }
        if (TextUtils.isEmpty(N0)) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return N0;
        }
        return TextUtils.concat(N0, ", ", str);
    }

    public float z() {
        return 1.0f;
    }

    public void T() {
    }

    public void V() {
    }

    public void W(Canvas canvas) {
    }

    public void k(SpannableStringBuilder spannableStringBuilder) {
    }
}
