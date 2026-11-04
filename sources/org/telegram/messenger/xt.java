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
import org.telegram.ui.lg0;
import org.telegram.ui.ng0;
public abstract class xt implements lg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.gc K;
    public ng0 L;
    public du M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final cv f26434a;
    public final Rect f26435b;
    public final int f26436c;
    public StaticLayout d;
    public float f26437e;
    public int f26438f;
    public int h;
    public int f26439n;
    public CheckBoxBase f26440r;
    public float f26441s;
    public int f26442w;
    public boolean f26443x;
    public boolean f26444y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public xt(cv cvVar, Rect rect, int i3) {
        this.f26434a = cvVar;
        this.f26435b = new Rect(rect);
        this.f26436c = (i3 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.n9[] n9VarArr = (org.telegram.ui.Cells.n9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.n9.class);
        if (n9VarArr != null && n9VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(n9VarArr, new wt(spanned, 0));
            for (org.telegram.ui.Cells.n9 n9Var : n9VarArr) {
                int spanStart = spanned.getSpanStart(n9Var);
                int spanEnd = spanned.getSpanEnd(n9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = n9Var.f29716a;
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

    public static void l(SpannableStringBuilder spannableStringBuilder, bv bvVar, bv[] bvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (bvVar != null && (staticLayout2 = bvVar.f21888b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
        } else if (bvVarArr != null) {
            for (bv bvVar2 : bvVarArr) {
                if (bvVar2 != null && (staticLayout = bvVar2.f21888b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i3, Rect rect) {
        int i10 = this.f26435b.left;
        float f10 = this.N;
        rect.set(i10, (int) f10, this.f26436c + i10, (int) (f10 + I()));
    }

    public int B() {
        return 0;
    }

    public CharSequence D() {
        return null;
    }

    public CharSequence E(int i3) {
        return null;
    }

    public final RectF F() {
        cv cvVar = this.f26434a;
        float textY = cvVar.E.getTextY() + this.N;
        Rect rect = this.f26435b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (cvVar.E.getTextX() - cvVar.S), f10, ((cvVar.E.getTextX() + cvVar.C) + cvVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
    }

    public final boolean G() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.f26440r;
        if (checkBoxBase != null && checkBoxBase.f31334q) {
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
        Rect rect = this.f26435b;
        return rect.left + this.f26436c + rect.right;
    }

    public org.telegram.ui.Cells.s9[] L() {
        return null;
    }

    public final boolean N(int i3) {
        if (this.f26440r != null && i3 == 0 && G()) {
            return true;
        }
        return false;
    }

    public final boolean O(int i3) {
        if (this.f26440r != null && i3 == 0 && !n()) {
            return false;
        }
        return true;
    }

    public final boolean P(int i3) {
        if ((this.f26440r == null || i3 != 0) && (this instanceof du)) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        cv cvVar = this.f26434a;
        if (cvVar.h.isEmpty() || (indexOf = cvVar.f22070g.indexOf(this)) < 0) {
            return false;
        }
        for (int i3 = 0; i3 < cvVar.h.size(); i3++) {
            tt ttVar = (tt) cvVar.h.get(i3);
            if (indexOf >= ttVar.f25591a && indexOf <= ttVar.f25592b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        du duVar = this.M;
        if (duVar == null) {
            return true;
        }
        if (!duVar.X.open) {
            return false;
        }
        return duVar.S();
    }

    public boolean U(int i3, View view) {
        return false;
    }

    public void X(Canvas canvas, int i3, float f10) {
        W(canvas);
    }

    public boolean Y(MotionEvent motionEvent) {
        return false;
    }

    public void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        org.telegram.ui.Cells.s9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof bv) {
                    bv bvVar = (bv) s9Var;
                    bvVar.f21889c = i3 - bvVar.f21891f;
                    bvVar.d = i10;
                    bvVar.f21890e = i11;
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
        if (this.f26440r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.f26434a.D);
            this.f26440r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.f28289z5, org.telegram.ui.ActionBar.k6.f28008k7);
            this.f26440r.d(10);
            this.f26440r.k(true);
            this.f26440r.i(g0.L(5.0f));
        }
        this.f26440r.f(-1, z10, false);
        g0();
    }

    public final void c0(String str) {
        CharSequence text;
        String str2;
        int i3;
        Layout.Alignment alignment;
        cv cvVar = this.f26434a;
        cvVar.f22085x.setTextSize(g0.L(az.W0));
        Layout a10 = a();
        if (a10 == null) {
            text = null;
        } else {
            text = a10.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (yu yuVar : (yu[]) ((Spanned) text).getSpans(0, 1, yu.class)) {
                if (TLObject.hasFlag(yuVar.f26657b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i10 = this.f26439n;
        if (i10 <= 0) {
            boolean I = cvVar.I();
            Rect rect = this.f26435b;
            if (I) {
                i3 = rect.right;
            } else {
                i3 = rect.left;
            }
            i10 = Math.max(i3, g0.L(cvVar.M + 4));
        }
        int i11 = i10;
        TextPaint textPaint = cvVar.f22085x;
        if (cvVar.I()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i11, alignment, 1.0f, 0.0f, false);
        this.f26438f = g0.L(cvVar.M + 4);
        this.h = 0;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.f26438f = Math.min(this.f26438f, (int) this.d.getLineLeft(i12));
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
        cv cvVar = this.f26434a;
        if (!hp.s1(cvVar.f22065a).s4()) {
            new vg.v0(43, cvVar.E.getContext(), cvVar.D).show();
            return;
        }
        boolean z10 = !G();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z10;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
        }
        View view = cvVar.Q;
        if (view != null) {
            this.f26440r.f31320a = view;
        }
        this.f26440r.f(-1, z10, true);
        View view2 = cvVar.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = cvVar.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        cvVar.F.Q1(cvVar.E, new g10(5, this, z10));
    }

    public final boolean f0(MotionEvent motionEvent) {
        boolean z10;
        View view;
        Rect rect = this.f26435b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.f26440r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                cv cvVar = this.f26434a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = cvVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.gc(view);
                        }
                        org.telegram.ui.Components.gc gcVar = this.K;
                        if (gcVar != null) {
                            gcVar.c(true);
                        }
                        View view2 = cvVar.Q;
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
                            org.telegram.ui.Components.gc gcVar2 = this.K;
                            if (gcVar2 != null) {
                                gcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (actionMasked == 1 && contains) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.J = false;
                        org.telegram.ui.Components.gc gcVar3 = this.K;
                        if (gcVar3 != null) {
                            gcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = cvVar.Q;
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
        Rect rect = this.f26435b;
        cv cvVar = this.f26434a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.f26437e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            } else {
                this.f26437e = (Math.min(g0.L(cvVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.f26440r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.f26441s = (a().getLineBaseline(0) + H()) - (g0.L(20.0f) * 0.7f);
                return;
            }
            this.f26441s = (Math.min(g0.L(cvVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
            CheckBoxBase checkBoxBase = this.f26440r;
            if (checkBoxBase != null) {
                checkBoxBase.f31329l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.f26440r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f31320a = view;
            checkBoxBase2.f31329l = true;
        }
        T();
    }

    public final boolean n() {
        cv cvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.f26440r != null && this.H != null && (q1Var = (cvVar = this.f26434a).E) != null && (l1Var = cvVar.F) != null && l1Var.S(q1Var)) {
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

    public final void r(Canvas canvas, int i3, float f10) {
        int i10;
        float f11;
        int i11;
        float N;
        float f12;
        canvas.save();
        Rect rect = this.f26435b;
        canvas.translate(rect.left, rect.top);
        cv cvVar = this.f26434a;
        boolean I = cvVar.I();
        TextPaint textPaint = cvVar.f22085x;
        float L = (((cvVar.C + cvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(az.W0));
            if (cvVar.E()) {
                i11 = org.telegram.ui.ActionBar.k6.Tc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D));
            canvas.save();
            int i12 = 0;
            if (!this.f26443x && !this.f26444y) {
                float N2 = g0.N(5.0f);
                if (I) {
                    N = (this.f26439n + L) - g0.N(0.5f);
                    f12 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + g0.N(0.5f);
                    f12 = this.f26439n;
                }
                canvas.drawCircle(N - f12, (this.f26437e + this.d.getLineBaseline(0)) - (g0.L(az.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                float L2 = (g0.L(0.0f) + L) - this.f26438f;
                if (this.f26440r != null) {
                    i12 = g0.L(26.0f);
                }
                canvas.translate(L2 + i12, this.f26437e);
                this.d.draw(canvas);
            } else {
                canvas.translate((g0.L(0.0f) - this.f26439n) - this.f26438f, this.f26437e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f26440r != null) {
            if (I) {
                i10 = (int) (L + g0.L(6.0f));
            } else {
                i10 = -g0.L(26.0f);
            }
            this.I.set(i10 - g0.L(6.0f), this.f26441s - g0.L(6.0f), g0.L(6.0f) + g0.L(20.0f) + i10, this.f26441s + g0.L(20.0f) + g0.L(6.0f));
            View view = cvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.f26440r;
                if (checkBoxBase.f31320a == null) {
                    checkBoxBase.f31320a = view;
                }
            }
            org.telegram.ui.Components.gc gcVar = this.K;
            if (gcVar != null) {
                f11 = gcVar.a(0.1f);
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            canvas.scale(f11, f11, g0.L(10.0f) + i10, this.f26441s + g0.L(10.0f));
            this.f26440r.e(i10, (int) this.f26441s, g0.L(20.0f), g0.L(20.0f));
            this.f26440r.a(canvas);
            canvas.restore();
        }
        if (i3 == Integer.MIN_VALUE) {
            W(canvas);
        } else {
            X(canvas, i3, f10);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        bv bvVar;
        org.telegram.ui.Components.l5 l5Var;
        org.telegram.ui.Cells.s9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.s9 s9Var : L) {
            if ((s9Var instanceof bv) && (l5Var = (bvVar = (bv) s9Var).F) != null && !l5Var.f35600a.isEmpty()) {
                canvas.save();
                canvas.translate(bvVar.f21889c, bvVar.d - this.N);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.f21888b, bvVar.F, 0.0f, bvVar.f21896x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        int i3;
        ng0 ng0Var = this.L;
        if (ng0Var != null && ng0Var.h && ng0Var.d(this) >= 0) {
            if (ng0Var.i(this)) {
                float f10 = 0.0f;
                if (ng0Var.g(this)) {
                    if (ng0Var.g(this)) {
                        i3 = ng0Var.f47995e;
                    } else {
                        i3 = -1;
                    }
                    if (ng0Var.g(this)) {
                        f10 = ng0Var.f47996f;
                    }
                    r(canvas, i3, f10);
                    return;
                }
                float c2 = ng0Var.c(this);
                if (c2 <= 0.0f) {
                    return;
                }
                if (c2 < 1.0f) {
                    Rect rect = this.f26435b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.f26436c + rect.right, I(), (int) (c2 * 255.0f));
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

    public boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        bv bvVar;
        org.telegram.ui.Cells.s9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof bv) {
                    if (((bv) s9Var).o(characterStyle, otVar)) {
                        Rect rect = this.f26435b;
                        otVar.f24597e = rect.left - bvVar.f21891f;
                        otVar.f24598f = i3 + rect.top;
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

    public final void w(int i3, Rect rect) {
        int i10;
        CheckBoxBase checkBoxBase = this.f26440r;
        if (checkBoxBase != null && i3 == 0) {
            int i11 = this.f26435b.left;
            float f10 = this.N;
            rect.set(i11, (int) f10, this.f26436c + i11, (int) (f10 + I()));
        } else {
            if (checkBoxBase == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            A(i3 - i10, rect);
        }
        cv cvVar = this.f26434a;
        int i12 = cvVar.C + cvVar.T;
        int min = Math.min(i12, Math.max(rect.left, -cvVar.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i3) {
        int i10;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.f26440r;
        if (checkBoxBase != null && i3 == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f26443x && (staticLayout = this.d) != null) {
                charSequence = staticLayout.getText();
            } else {
                charSequence = null;
            }
            CharSequence y9 = y();
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(charSequence).append(' ');
            }
            if (!TextUtils.isEmpty(y9)) {
                spannableStringBuilder.append(y9).append(", ");
            }
            k(spannableStringBuilder);
            if (spannableStringBuilder.length() > 0) {
                return spannableStringBuilder;
            }
            return bd.M0(2131754903, null);
        }
        if (checkBoxBase == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return E(i3 - i10);
    }

    public CharSequence y() {
        String M0;
        int i3 = this.F;
        String str = null;
        if (i3 == 0) {
            M0 = null;
        } else {
            M0 = bd.M0(i3, null);
        }
        int i10 = this.G;
        if (i10 != 0) {
            str = bd.M0(i10, null);
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
