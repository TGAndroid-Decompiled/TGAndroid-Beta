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
import org.telegram.ui.rg0;
import org.telegram.ui.tg0;
public abstract class cu implements rg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.dc K;
    public tg0 L;
    public iu M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final iv f22933a;
    public final Rect f22934b;
    public final int f22935c;
    public StaticLayout d;
    public float f22936e;
    public int f22937f;
    public int h;
    public int f22938n;
    public CheckBoxBase f22939r;
    public float f22940s;
    public int f22941w;
    public boolean f22942x;
    public boolean f22943y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public cu(iv ivVar, Rect rect, int i7) {
        this.f22933a = ivVar;
        this.f22934b = new Rect(rect);
        this.f22935c = (i7 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.n9[] n9VarArr = (org.telegram.ui.Cells.n9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.n9.class);
        if (n9VarArr != null && n9VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(n9VarArr, new bu(spanned, 0));
            for (org.telegram.ui.Cells.n9 n9Var : n9VarArr) {
                int spanStart = spanned.getSpanStart(n9Var);
                int spanEnd = spanned.getSpanEnd(n9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = n9Var.f30777a;
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

    public static void l(SpannableStringBuilder spannableStringBuilder, hv hvVar, hv[] hvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (hvVar != null && (staticLayout2 = hvVar.f24222b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
        } else if (hvVarArr != null) {
            for (hv hvVar2 : hvVarArr) {
                if (hvVar2 != null && (staticLayout = hvVar2.f24222b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i7, Rect rect) {
        int i10 = this.f22934b.left;
        float f10 = this.N;
        rect.set(i10, (int) f10, this.f22935c + i10, (int) (f10 + I()));
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
        iv ivVar = this.f22933a;
        float textY = ivVar.E.getTextY() + this.N;
        Rect rect = this.f22934b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (ivVar.E.getTextX() - ivVar.S), f10, ((ivVar.E.getTextX() + ivVar.C) + ivVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
    }

    public final boolean G() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.f22939r;
        if (checkBoxBase != null && checkBoxBase.f32441q) {
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
        Rect rect = this.f22934b;
        return rect.left + this.f22935c + rect.right;
    }

    public org.telegram.ui.Cells.s9[] L() {
        return null;
    }

    public final boolean M(int i7) {
        if (this.f22939r != null && i7 == 0 && G()) {
            return true;
        }
        return false;
    }

    public final boolean O(int i7) {
        if (this.f22939r != null && i7 == 0 && !n()) {
            return false;
        }
        return true;
    }

    public final boolean P(int i7) {
        if ((this.f22939r == null || i7 != 0) && (this instanceof iu)) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        iv ivVar = this.f22933a;
        if (ivVar.h.isEmpty() || (indexOf = ivVar.f24445g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < ivVar.h.size(); i7++) {
            yt ytVar = (yt) ivVar.h.get(i7);
            if (indexOf >= ytVar.f27813a && indexOf <= ytVar.f27814b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        iu iuVar = this.M;
        if (iuVar == null) {
            return true;
        }
        if (!iuVar.X.open) {
            return false;
        }
        return iuVar.S();
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
        org.telegram.ui.Cells.s9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof hv) {
                    hv hvVar = (hv) s9Var;
                    hvVar.f24223c = i7 - hvVar.f24225f;
                    hvVar.d = i10;
                    hvVar.f24224e = i11;
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
        if (this.f22939r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.f22933a.D);
            this.f22939r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.j6.Yl, org.telegram.ui.ActionBar.j6.f29259z5, org.telegram.ui.ActionBar.j6.f28979k7);
            this.f22939r.d(10);
            this.f22939r.k(true);
            this.f22939r.i(g0.L(5.0f));
        }
        this.f22939r.f(-1, z10, false);
        g0();
    }

    public final void c0(String str) {
        CharSequence text;
        String str2;
        int i7;
        Layout.Alignment alignment;
        iv ivVar = this.f22933a;
        ivVar.f24460x.setTextSize(g0.L(gz.W0));
        Layout a10 = a();
        if (a10 == null) {
            text = null;
        } else {
            text = a10.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (ev evVar : (ev[]) ((Spanned) text).getSpans(0, 1, ev.class)) {
                if (TLObject.hasFlag(evVar.f23368b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i10 = this.f22938n;
        if (i10 <= 0) {
            boolean I = ivVar.I();
            Rect rect = this.f22934b;
            if (I) {
                i7 = rect.right;
            } else {
                i7 = rect.left;
            }
            i10 = Math.max(i7, g0.L(ivVar.M + 4));
        }
        int i11 = i10;
        TextPaint textPaint = ivVar.f24460x;
        if (ivVar.I()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i11, alignment, 1.0f, 0.0f, false);
        this.f22937f = g0.L(ivVar.M + 4);
        this.h = 0;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f22937f = Math.min(this.f22937f, (int) this.d.getLineLeft(i12));
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
        iv ivVar = this.f22933a;
        if (!np.s1(ivVar.f24440a).s4()) {
            new ug.x0(43, ivVar.E.getContext(), ivVar.D).show();
            return;
        }
        boolean z10 = !G();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z10;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
        }
        View view = ivVar.Q;
        if (view != null) {
            this.f22939r.f32427a = view;
        }
        this.f22939r.f(-1, z10, true);
        View view2 = ivVar.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = ivVar.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        ivVar.F.a2(ivVar.E, new l10(5, this, z10));
    }

    public final boolean f0(MotionEvent motionEvent) {
        boolean z10;
        View view;
        Rect rect = this.f22934b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.f22939r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                iv ivVar = this.f22933a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = ivVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.dc(view);
                        }
                        org.telegram.ui.Components.dc dcVar = this.K;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        View view2 = ivVar.Q;
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
                            org.telegram.ui.Components.dc dcVar2 = this.K;
                            if (dcVar2 != null) {
                                dcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (actionMasked == 1 && contains) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.J = false;
                        org.telegram.ui.Components.dc dcVar3 = this.K;
                        if (dcVar3 != null) {
                            dcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = ivVar.Q;
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
        Rect rect = this.f22934b;
        iv ivVar = this.f22933a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.f22936e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            } else {
                this.f22936e = (Math.min(g0.L(ivVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.f22939r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.f22940s = (a().getLineBaseline(0) + H()) - (g0.L(20.0f) * 0.7f);
                return;
            }
            this.f22940s = (Math.min(g0.L(ivVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
            CheckBoxBase checkBoxBase = this.f22939r;
            if (checkBoxBase != null) {
                checkBoxBase.f32436l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.f22939r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f32427a = view;
            checkBoxBase2.f32436l = true;
        }
        T();
    }

    public final boolean n() {
        iv ivVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.f22939r != null && this.H != null && (q1Var = (ivVar = this.f22933a).E) != null && (l1Var = ivVar.F) != null && l1Var.S(q1Var)) {
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
        Rect rect = this.f22934b;
        canvas.translate(rect.left, rect.top);
        iv ivVar = this.f22933a;
        boolean I = ivVar.I();
        TextPaint textPaint = ivVar.f24460x;
        float L = (((ivVar.C + ivVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(gz.W0));
            if (ivVar.E()) {
                i11 = org.telegram.ui.ActionBar.j6.Wc;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Vc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i11, ivVar.D));
            canvas.save();
            int i12 = 0;
            if (!this.f22942x && !this.f22943y) {
                float N2 = g0.N(5.0f);
                if (I) {
                    N = (this.f22938n + L) - g0.N(0.5f);
                    f12 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + g0.N(0.5f);
                    f12 = this.f22938n;
                }
                canvas.drawCircle(N - f12, (this.f22936e + this.d.getLineBaseline(0)) - (g0.L(gz.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                float L2 = (g0.L(0.0f) + L) - this.f22937f;
                if (this.f22939r != null) {
                    i12 = g0.L(26.0f);
                }
                canvas.translate(L2 + i12, this.f22936e);
                this.d.draw(canvas);
            } else {
                canvas.translate((g0.L(0.0f) - this.f22938n) - this.f22937f, this.f22936e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f22939r != null) {
            if (I) {
                i10 = (int) (L + g0.L(6.0f));
            } else {
                i10 = -g0.L(26.0f);
            }
            this.I.set(i10 - g0.L(6.0f), this.f22940s - g0.L(6.0f), g0.L(6.0f) + g0.L(20.0f) + i10, this.f22940s + g0.L(20.0f) + g0.L(6.0f));
            View view = ivVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.f22939r;
                if (checkBoxBase.f32427a == null) {
                    checkBoxBase.f32427a = view;
                }
            }
            org.telegram.ui.Components.dc dcVar = this.K;
            if (dcVar != null) {
                f11 = dcVar.a(0.1f);
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            canvas.scale(f11, f11, g0.L(10.0f) + i10, this.f22940s + g0.L(10.0f));
            this.f22939r.e(i10, (int) this.f22940s, g0.L(20.0f), g0.L(20.0f));
            this.f22939r.a(canvas);
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
        hv hvVar;
        org.telegram.ui.Components.l5 l5Var;
        org.telegram.ui.Cells.s9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.s9 s9Var : L) {
            if ((s9Var instanceof hv) && (l5Var = (hvVar = (hv) s9Var).F) != null && !l5Var.f36726a.isEmpty()) {
                canvas.save();
                canvas.translate(hvVar.f24223c, hvVar.d - this.N);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar.f24222b, hvVar.F, 0.0f, hvVar.f24230x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        int i7;
        tg0 tg0Var = this.L;
        if (tg0Var != null && tg0Var.h && tg0Var.d(this) >= 0) {
            if (tg0Var.i(this)) {
                float f10 = 0.0f;
                if (tg0Var.g(this)) {
                    if (tg0Var.g(this)) {
                        i7 = tg0Var.f51579e;
                    } else {
                        i7 = -1;
                    }
                    if (tg0Var.g(this)) {
                        f10 = tg0Var.f51580f;
                    }
                    r(canvas, i7, f10);
                    return;
                }
                float c10 = tg0Var.c(this);
                if (c10 <= 0.0f) {
                    return;
                }
                if (c10 < 1.0f) {
                    Rect rect = this.f22934b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.f22935c + rect.right, I(), (int) (c10 * 255.0f));
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

    public boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        hv hvVar;
        org.telegram.ui.Cells.s9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof hv) {
                    if (((hv) s9Var).o(characterStyle, ttVar)) {
                        Rect rect = this.f22934b;
                        ttVar.f26731e = rect.left - hvVar.f24225f;
                        ttVar.f26732f = i7 + rect.top;
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
        CheckBoxBase checkBoxBase = this.f22939r;
        if (checkBoxBase != null && i7 == 0) {
            int i11 = this.f22934b.left;
            float f10 = this.N;
            rect.set(i11, (int) f10, this.f22935c + i11, (int) (f10 + I()));
        } else {
            if (checkBoxBase == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            A(i7 - i10, rect);
        }
        iv ivVar = this.f22933a;
        int i12 = ivVar.C + ivVar.T;
        int min = Math.min(i12, Math.max(rect.left, -ivVar.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i7) {
        int i10;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.f22939r;
        if (checkBoxBase != null && i7 == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f22942x && (staticLayout = this.d) != null) {
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
            return hd.M0(2131754903, null);
        }
        if (checkBoxBase == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return E(i7 - i10);
    }

    public CharSequence y() {
        String M0;
        int i7 = this.F;
        String str = null;
        if (i7 == 0) {
            M0 = null;
        } else {
            M0 = hd.M0(i7, null);
        }
        int i10 = this.G;
        if (i10 != 0) {
            str = hd.M0(i10, null);
        }
        if (TextUtils.isEmpty(M0)) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return M0;
        }
        return TextUtils.concat(M0, ", ", str);
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
