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
public abstract class fu implements rg0 {
    public boolean D;
    public int E;
    public int F;
    public TLObject G;
    public boolean I;
    public org.telegram.ui.Components.ic J;
    public tg0 K;
    public lu L;
    public float M;
    public int N;
    public float O;
    public int P;
    public int S;
    public int T;
    public int U;
    public View V;
    public final kv f22443a;
    public final Rect f22444b;
    public final int f22445c;
    public StaticLayout d;
    public float f22446e;
    public int f22447f;
    public int h;
    public int f22448n;
    public CheckBoxBase f22449r;
    public float f22450s;
    public int f22451w;
    public boolean f22452x;
    public boolean f22453y;
    public final RectF H = new RectF();
    public boolean Q = true;
    public boolean R = true;

    public fu(kv kvVar, Rect rect, int i7) {
        this.f22443a = kvVar;
        this.f22444b = new Rect(rect);
        this.f22445c = (i7 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.o9[] o9VarArr = (org.telegram.ui.Cells.o9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.o9.class);
        if (o9VarArr != null && o9VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(o9VarArr, new eu(spanned, 0));
            for (org.telegram.ui.Cells.o9 o9Var : o9VarArr) {
                int spanStart = spanned.getSpanStart(o9Var);
                int spanEnd = spanned.getSpanEnd(o9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = o9Var.f29693a;
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

    public static void l(SpannableStringBuilder spannableStringBuilder, jv jvVar, jv[] jvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (jvVar != null && (staticLayout2 = jvVar.f23586b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
        } else if (jvVarArr != null) {
            for (jv jvVar2 : jvVarArr) {
                if (jvVar2 != null && (staticLayout = jvVar2.f23586b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i7, Rect rect) {
        int i10 = this.f22444b.left;
        float f10 = this.M;
        rect.set(i10, (int) f10, this.f22445c + i10, (int) (f10 + I()));
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
        kv kvVar = this.f22443a;
        float textY = kvVar.E.getTextY() + this.M;
        Rect rect = this.f22444b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (kvVar.E.getTextX() - kvVar.S), f10, ((kvVar.E.getTextX() + kvVar.C) + kvVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
    }

    public final boolean G() {
        TLObject tLObject = this.G;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.f22449r;
        if (checkBoxBase != null && checkBoxBase.f31258q) {
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
        Rect rect = this.f22444b;
        return rect.left + this.f22445c + rect.right;
    }

    public org.telegram.ui.Cells.t9[] L() {
        return null;
    }

    public final boolean N(int i7) {
        if (this.f22449r != null && i7 == 0 && G()) {
            return true;
        }
        return false;
    }

    public final boolean O(int i7) {
        if (this.f22449r != null && i7 == 0 && !n()) {
            return false;
        }
        return true;
    }

    public final boolean P(int i7) {
        if ((this.f22449r == null || i7 != 0) && (this instanceof lu)) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        kv kvVar = this.f22443a;
        if (kvVar.h.isEmpty() || (indexOf = kvVar.f23761g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < kvVar.h.size(); i7++) {
            bu buVar = (bu) kvVar.h.get(i7);
            if (indexOf >= buVar.f21696a && indexOf <= buVar.f21697b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        lu luVar = this.L;
        if (luVar == null) {
            return true;
        }
        if (!luVar.W.open) {
            return false;
        }
        return luVar.S();
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
        this.S = i7;
        this.T = i10;
        this.U = i11;
        org.telegram.ui.Cells.t9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof jv) {
                    jv jvVar = (jv) t9Var;
                    jvVar.f23587c = i7 - jvVar.f23589f;
                    jvVar.d = i10;
                    jvVar.f23588e = i11;
                }
            }
        }
    }

    @Override
    public Layout a() {
        return null;
    }

    public final void a0(boolean z9) {
        View view = this.V;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z9);
            }
        }
    }

    public void b(boolean z9) {
        a0(z9);
    }

    public final void b0(TLObject tLObject, boolean z9) {
        this.G = tLObject;
        if (this.f22449r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.f22443a.D);
            this.f22449r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.f28257z5, org.telegram.ui.ActionBar.k6.f27978k7);
            this.f22449r.d(10);
            this.f22449r.k(true);
            this.f22449r.i(g0.L(5.0f));
        }
        this.f22449r.f(-1, z9, false);
        g0();
    }

    public final void c0(String str) {
        CharSequence text;
        String str2;
        int i7;
        Layout.Alignment alignment;
        kv kvVar = this.f22443a;
        kvVar.f23776x.setTextSize(g0.L(iz.W0));
        Layout a10 = a();
        if (a10 == null) {
            text = null;
        } else {
            text = a10.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (gv gvVar : (gv[]) ((Spanned) text).getSpans(0, 1, gv.class)) {
                if (TLObject.hasFlag(gvVar.f22722b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i10 = this.f22448n;
        if (i10 <= 0) {
            boolean I = kvVar.I();
            Rect rect = this.f22444b;
            if (I) {
                i7 = rect.right;
            } else {
                i7 = rect.left;
            }
            i10 = Math.max(i7, g0.L(kvVar.M + 4));
        }
        int i11 = i10;
        TextPaint textPaint = kvVar.f23776x;
        if (kvVar.I()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i11, alignment, 1.0f, 0.0f, false);
        this.f22447f = g0.L(kvVar.M + 4);
        this.h = 0;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f22447f = Math.min(this.f22447f, (int) this.d.getLineLeft(i12));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i12));
        }
        g0();
    }

    public void d0() {
        this.O = this.M;
        this.P = this.N;
        this.R = this.Q;
    }

    @Override
    public final View e() {
        return null;
    }

    public final void e0() {
        if (!n()) {
            return;
        }
        kv kvVar = this.f22443a;
        if (!qp.s1(kvVar.f23756a).s4()) {
            new ug.w0(43, kvVar.E.getContext(), kvVar.D).show();
            return;
        }
        boolean z9 = !G();
        TLObject tLObject = this.G;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z9;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z9;
        }
        View view = kvVar.Q;
        if (view != null) {
            this.f22449r.f31244a = view;
        }
        this.f22449r.f(-1, z9, true);
        View view2 = kvVar.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = kvVar.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        kvVar.F.K1(kvVar.E, new o10(5, this, z9));
    }

    public final boolean f0(MotionEvent motionEvent) {
        boolean z9;
        View view;
        Rect rect = this.f22444b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.f22449r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.H.contains(motionEvent.getX(), motionEvent.getY());
                kv kvVar = this.f22443a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.I = true;
                        if (this.J == null && (view = kvVar.Q) != null) {
                            this.J = new org.telegram.ui.Components.ic(view);
                        }
                        org.telegram.ui.Components.ic icVar = this.J;
                        if (icVar != null) {
                            icVar.c(true);
                        }
                        View view2 = kvVar.Q;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        motionEvent.offsetLocation(rect.left, rect.top);
                        return true;
                    }
                } else if (this.I) {
                    if (actionMasked == 2) {
                        if (!contains) {
                            this.I = false;
                            org.telegram.ui.Components.ic icVar2 = this.J;
                            if (icVar2 != null) {
                                icVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (actionMasked == 1 && contains) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.I = false;
                        org.telegram.ui.Components.ic icVar3 = this.J;
                        if (icVar3 != null) {
                            icVar3.c(false);
                        }
                        if (z9) {
                            e0();
                        }
                        View view3 = kvVar.Q;
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
        Rect rect = this.f22444b;
        kv kvVar = this.f22443a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.f22446e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            } else {
                this.f22446e = (Math.min(g0.L(kvVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.f22449r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.f22450s = (a().getLineBaseline(0) + H()) - (g0.L(20.0f) * 0.7f);
                return;
            }
            this.f22450s = (Math.min(g0.L(kvVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.V;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
            CheckBoxBase checkBoxBase = this.f22449r;
            if (checkBoxBase != null) {
                checkBoxBase.f31253l = false;
            }
            this.V = null;
        }
        this.V = view;
        CheckBoxBase checkBoxBase2 = this.f22449r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f31244a = view;
            checkBoxBase2.f31253l = true;
        }
        T();
    }

    public final boolean n() {
        kv kvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.f22449r != null && this.G != null && (q1Var = (kvVar = this.f22443a).E) != null && (l1Var = kvVar.F) != null && l1Var.S(q1Var)) {
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
        Rect rect = this.f22444b;
        canvas.translate(rect.left, rect.top);
        kv kvVar = this.f22443a;
        boolean I = kvVar.I();
        TextPaint textPaint = kvVar.f23776x;
        float L = (((kvVar.C + kvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(iz.W0));
            if (kvVar.E()) {
                i11 = org.telegram.ui.ActionBar.k6.Tc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, kvVar.D));
            canvas.save();
            int i12 = 0;
            if (!this.f22452x && !this.f22453y) {
                float N2 = g0.N(5.0f);
                if (I) {
                    N = (this.f22448n + L) - g0.N(0.5f);
                    f12 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + g0.N(0.5f);
                    f12 = this.f22448n;
                }
                canvas.drawCircle(N - f12, (this.f22446e + this.d.getLineBaseline(0)) - (g0.L(iz.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                float L2 = (g0.L(0.0f) + L) - this.f22447f;
                if (this.f22449r != null) {
                    i12 = g0.L(26.0f);
                }
                canvas.translate(L2 + i12, this.f22446e);
                this.d.draw(canvas);
            } else {
                canvas.translate((g0.L(0.0f) - this.f22448n) - this.f22447f, this.f22446e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f22449r != null) {
            if (I) {
                i10 = (int) (L + g0.L(6.0f));
            } else {
                i10 = -g0.L(26.0f);
            }
            this.H.set(i10 - g0.L(6.0f), this.f22450s - g0.L(6.0f), g0.L(6.0f) + g0.L(20.0f) + i10, this.f22450s + g0.L(20.0f) + g0.L(6.0f));
            View view = kvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.f22449r;
                if (checkBoxBase.f31244a == null) {
                    checkBoxBase.f31244a = view;
                }
            }
            org.telegram.ui.Components.ic icVar = this.J;
            if (icVar != null) {
                f11 = icVar.a(0.1f);
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            canvas.scale(f11, f11, g0.L(10.0f) + i10, this.f22450s + g0.L(10.0f));
            this.f22449r.e(i10, (int) this.f22450s, g0.L(20.0f), g0.L(20.0f));
            this.f22449r.a(canvas);
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
        jv jvVar;
        org.telegram.ui.Components.n5 n5Var;
        org.telegram.ui.Cells.t9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z9 = false;
        for (org.telegram.ui.Cells.t9 t9Var : L) {
            if ((t9Var instanceof jv) && (n5Var = (jvVar = (jv) t9Var).E) != null && !n5Var.f36278a.isEmpty()) {
                canvas.save();
                canvas.translate(jvVar.f23587c, jvVar.d - this.M);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar.f23586b, jvVar.E, 0.0f, jvVar.f23594x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z9 = true;
            }
        }
        return z9;
    }

    public void t(Canvas canvas) {
        int i7;
        tg0 tg0Var = this.K;
        if (tg0Var != null && tg0Var.h && tg0Var.d(this) >= 0) {
            if (tg0Var.i(this)) {
                float f10 = 0.0f;
                if (tg0Var.g(this)) {
                    if (tg0Var.g(this)) {
                        i7 = tg0Var.f50029e;
                    } else {
                        i7 = -1;
                    }
                    if (tg0Var.g(this)) {
                        f10 = tg0Var.f50030f;
                    }
                    r(canvas, i7, f10);
                    return;
                }
                float c10 = tg0Var.c(this);
                if (c10 <= 0.0f) {
                    return;
                }
                if (c10 < 1.0f) {
                    Rect rect = this.f22444b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.f22445c + rect.right, I(), (int) (c10 * 255.0f));
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

    public boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        jv jvVar;
        org.telegram.ui.Cells.t9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof jv) {
                    if (((jv) t9Var).o(characterStyle, wtVar)) {
                        Rect rect = this.f22444b;
                        wtVar.f26360e = rect.left - jvVar.f23589f;
                        wtVar.f26361f = i7 + rect.top;
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
        CheckBoxBase checkBoxBase = this.f22449r;
        if (checkBoxBase != null && i7 == 0) {
            int i11 = this.f22444b.left;
            float f10 = this.M;
            rect.set(i11, (int) f10, this.f22445c + i11, (int) (f10 + I()));
        } else {
            if (checkBoxBase == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            A(i7 - i10, rect);
        }
        kv kvVar = this.f22443a;
        int i12 = kvVar.C + kvVar.T;
        int min = Math.min(i12, Math.max(rect.left, -kvVar.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i7) {
        int i10;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.f22449r;
        if (checkBoxBase != null && i7 == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f22452x && (staticLayout = this.d) != null) {
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
        int i7 = this.E;
        String str = null;
        if (i7 == 0) {
            M0 = null;
        } else {
            M0 = hd.M0(i7, null);
        }
        int i10 = this.F;
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
