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
import org.telegram.ui.xh0;
import org.telegram.ui.zh0;
public abstract class qu implements xh0 {
    public boolean D;
    public int E;
    public int F;
    public TLObject G;
    public boolean I;
    public org.telegram.ui.Components.dc J;
    public zh0 K;
    public wu L;
    public float M;
    public int N;
    public float O;
    public int P;
    public int S;
    public int T;
    public int U;
    public View V;
    public final vv f17621a;
    public final Rect f17622b;
    public final int f17623c;
    public StaticLayout d;
    public float e;
    public int f17624f;
    public int h;
    public int f17625n;
    public CheckBoxBase f17626r;
    public float f17627s;
    public int f17628w;
    public boolean f17629x;
    public boolean f17630y;
    public final RectF H = new RectF();
    public boolean Q = true;
    public boolean R = true;

    public qu(vv vvVar, Rect rect, int i10) {
        this.f17621a = vvVar;
        this.f17622b = new Rect(rect);
        this.f17623c = (i10 - rect.left) - rect.right;
    }

    public static CharSequence g0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.p9[] p9VarArr = (org.telegram.ui.Cells.p9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.p9.class);
        if (p9VarArr != null && p9VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(p9VarArr, new pu(spanned, 0));
            for (org.telegram.ui.Cells.p9 p9Var : p9VarArr) {
                int spanStart = spanned.getSpanStart(p9Var);
                int spanEnd = spanned.getSpanEnd(p9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = p9Var.f22467a;
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

    public static void l(SpannableStringBuilder spannableStringBuilder, uv uvVar, uv[] uvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (uvVar != null && (staticLayout2 = uvVar.f18396b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
        } else if (uvVarArr != null) {
            for (uv uvVar2 : uvVarArr) {
                if (uvVar2 != null && (staticLayout = uvVar2.f18396b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(g0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i10, Rect rect) {
        int i11 = this.f17622b.left;
        float f7 = this.M;
        rect.set(i11, (int) f7, this.f17623c + i11, (int) (f7 + H()));
    }

    public int B() {
        return 0;
    }

    public CharSequence D() {
        return null;
    }

    public CharSequence E(int i10) {
        return null;
    }

    public final boolean F() {
        TLObject tLObject = this.G;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.f17626r;
        if (checkBoxBase != null && checkBoxBase.f23919q) {
            return true;
        }
        return false;
    }

    public int G() {
        return 0;
    }

    public abstract int H();

    public int I() {
        return J();
    }

    public int J() {
        Rect rect = this.f17622b;
        return rect.left + this.f17623c + rect.right;
    }

    public org.telegram.ui.Cells.u9[] K() {
        return null;
    }

    public final boolean L(int i10) {
        if (this.f17626r != null && i10 == 0 && F()) {
            return true;
        }
        return false;
    }

    public final boolean N(int i10) {
        if (this.f17626r != null && i10 == 0 && !o()) {
            return false;
        }
        return true;
    }

    public final boolean O(int i10) {
        if ((this.f17626r == null || i10 != 0) && (this instanceof wu)) {
            return true;
        }
        return false;
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        vv vvVar = this.f17621a;
        if (vvVar.h.isEmpty() || (indexOf = vvVar.f18990g.indexOf(this)) < 0) {
            return false;
        }
        for (int i10 = 0; i10 < vvVar.h.size(); i10++) {
            mu muVar = (mu) vvVar.h.get(i10);
            if (indexOf >= muVar.f17001a && indexOf <= muVar.f17002b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        wu wuVar = this.L;
        if (wuVar == null) {
            return true;
        }
        if (!wuVar.W.open) {
            return false;
        }
        return wuVar.R();
    }

    public boolean T(int i10, View view) {
        return false;
    }

    public void W(Canvas canvas, int i10, float f7) {
        V(canvas);
    }

    public boolean X(MotionEvent motionEvent) {
        return false;
    }

    public void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        org.telegram.ui.Cells.u9[] K = K();
        if (K != null) {
            for (org.telegram.ui.Cells.u9 u9Var : K) {
                if (u9Var instanceof uv) {
                    uv uvVar = (uv) u9Var;
                    uvVar.f18397c = i10 - uvVar.f18398f;
                    uvVar.d = i11;
                    uvVar.e = i12;
                }
            }
        }
    }

    public final void Z(boolean z10) {
        View view = this.V;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z10);
            }
        }
    }

    @Override
    public Layout a() {
        return null;
    }

    public final void a0(TLObject tLObject, boolean z10) {
        this.G = tLObject;
        if (this.f17626r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.f17621a.D);
            this.f17626r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.f21329z5, org.telegram.ui.ActionBar.t6.f21059k7);
            this.f17626r.d(10);
            this.f17626r.k(true);
            this.f17626r.i(i0.L(5.0f));
        }
        this.f17626r.f(-1, z10, false);
        f0();
    }

    public void b(boolean z10) {
        Z(z10);
    }

    public final void b0(String str) {
        CharSequence text;
        String str2;
        int i10;
        Layout.Alignment alignment;
        vv vvVar = this.f17621a;
        vvVar.f19005x.setTextSize(i0.L(tz.W0));
        Layout a2 = a();
        if (a2 == null) {
            text = null;
        } else {
            text = a2.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (rv rvVar : (rv[]) ((Spanned) text).getSpans(0, 1, rv.class)) {
                if (TLObject.hasFlag(rvVar.f17803b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i11 = this.f17625n;
        if (i11 <= 0) {
            boolean I = vvVar.I();
            Rect rect = this.f17622b;
            if (I) {
                i10 = rect.right;
            } else {
                i10 = rect.left;
            }
            i11 = Math.max(i10, i0.L(vvVar.M + 4));
        }
        int i12 = i11;
        TextPaint textPaint = vvVar.f19005x;
        if (vvVar.I()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i12, alignment, 1.0f, 0.0f, false);
        this.f17624f = i0.L(vvVar.M + 4);
        this.h = 0;
        for (int i13 = 0; i13 < this.d.getLineCount(); i13++) {
            this.f17624f = Math.min(this.f17624f, (int) this.d.getLineLeft(i13));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i13));
        }
        f0();
    }

    public void c0() {
        this.O = this.M;
        this.P = this.N;
        this.R = this.Q;
    }

    public final void d0() {
        if (!o()) {
            return;
        }
        vv vvVar = this.f17621a;
        if (!vp.r1(vvVar.f18986a).p4()) {
            new kg.i1(43, vvVar.E.getContext(), vvVar.D).show();
            return;
        }
        boolean z10 = !F();
        TLObject tLObject = this.G;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z10;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
        }
        View view = vvVar.Q;
        if (view != null) {
            this.f17626r.f23906a = view;
        }
        this.f17626r.f(-1, z10, true);
        View view2 = vvVar.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = vvVar.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        vvVar.F.F1(vvVar.E, new c20(5, this, z10));
    }

    @Override
    public final View e() {
        return null;
    }

    public final boolean e0(MotionEvent motionEvent) {
        boolean z10;
        View view;
        Rect rect = this.f17622b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.f17626r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.H.contains(motionEvent.getX(), motionEvent.getY());
                vv vvVar = this.f17621a;
                if (actionMasked == 0) {
                    if (contains && o()) {
                        this.I = true;
                        if (this.J == null && (view = vvVar.Q) != null) {
                            this.J = new org.telegram.ui.Components.dc(view);
                        }
                        org.telegram.ui.Components.dc dcVar = this.J;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        View view2 = vvVar.Q;
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
                            org.telegram.ui.Components.dc dcVar2 = this.J;
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
                        this.I = false;
                        org.telegram.ui.Components.dc dcVar3 = this.J;
                        if (dcVar3 != null) {
                            dcVar3.c(false);
                        }
                        if (z10) {
                            d0();
                        }
                        View view3 = vvVar.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return true;
                }
            }
            boolean X = X(motionEvent);
            motionEvent.offsetLocation(rect.left, rect.top);
            return X;
        } catch (Throwable th2) {
            motionEvent.offsetLocation(rect.left, rect.top);
            throw th2;
        }
    }

    public final void f0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.f17622b;
        vv vvVar = this.f17621a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            } else {
                this.e = (Math.min(i0.L(vvVar.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.f17626r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.f17627s = (a().getLineBaseline(0) + G()) - (i0.L(20.0f) * 0.7f);
                return;
            }
            this.f17627s = (Math.min(i0.L(vvVar.M + 14), (H() - rect.top) - rect.bottom) - i0.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.V;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            U();
            CheckBoxBase checkBoxBase = this.f17626r;
            if (checkBoxBase != null) {
                checkBoxBase.f23914l = false;
            }
            this.V = null;
        }
        this.V = view;
        CheckBoxBase checkBoxBase2 = this.f17626r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23906a = view;
            checkBoxBase2.f23914l = true;
        }
        S();
    }

    public final boolean o() {
        vv vvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        if (this.f17626r != null && this.G != null && (q1Var = (vvVar = this.f17621a).E) != null && (l1Var = vvVar.F) != null && l1Var.R(q1Var)) {
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

    public final void r(Canvas canvas, int i10, float f7) {
        int i11;
        float f10;
        int i12;
        float N;
        float f11;
        canvas.save();
        Rect rect = this.f17622b;
        canvas.translate(rect.left, rect.top);
        vv vvVar = this.f17621a;
        boolean I = vvVar.I();
        TextPaint textPaint = vvVar.f19005x;
        float L = (((vvVar.C + vvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(i0.L(tz.W0));
            if (vvVar.E()) {
                i12 = org.telegram.ui.ActionBar.t6.Tc;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Sc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i12, vvVar.D));
            canvas.save();
            int i13 = 0;
            if (!this.f17629x && !this.f17630y) {
                float N2 = i0.N(5.0f);
                if (I) {
                    N = (this.f17625n + L) - i0.N(0.5f);
                    f11 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + i0.N(0.5f);
                    f11 = this.f17625n;
                }
                canvas.drawCircle(N - f11, (this.e + this.d.getLineBaseline(0)) - (i0.L(tz.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                float L2 = (i0.L(0.0f) + L) - this.f17624f;
                if (this.f17626r != null) {
                    i13 = i0.L(26.0f);
                }
                canvas.translate(L2 + i13, this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((i0.L(0.0f) - this.f17625n) - this.f17624f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f17626r != null) {
            if (I) {
                i11 = (int) (L + i0.L(6.0f));
            } else {
                i11 = -i0.L(26.0f);
            }
            this.H.set(i11 - i0.L(6.0f), this.f17627s - i0.L(6.0f), i0.L(6.0f) + i0.L(20.0f) + i11, this.f17627s + i0.L(20.0f) + i0.L(6.0f));
            View view = vvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.f17626r;
                if (checkBoxBase.f23906a == null) {
                    checkBoxBase.f23906a = view;
                }
            }
            org.telegram.ui.Components.dc dcVar = this.J;
            if (dcVar != null) {
                f10 = dcVar.a(0.1f);
            } else {
                f10 = 1.0f;
            }
            canvas.save();
            canvas.scale(f10, f10, i0.L(10.0f) + i11, this.f17627s + i0.L(10.0f));
            this.f17626r.e(i11, (int) this.f17627s, i0.L(20.0f), i0.L(20.0f));
            this.f17626r.a(canvas);
            canvas.restore();
        }
        if (i10 == Integer.MIN_VALUE) {
            V(canvas);
        } else {
            W(canvas, i10, f7);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        uv uvVar;
        org.telegram.ui.Components.k5 k5Var;
        org.telegram.ui.Cells.u9[] K = K();
        if (K == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.u9 u9Var : K) {
            if ((u9Var instanceof uv) && (k5Var = (uvVar = (uv) u9Var).E) != null && !k5Var.f27636a.isEmpty()) {
                canvas.save();
                canvas.translate(uvVar.f18397c, uvVar.d - this.M);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.f18396b, uvVar.E, 0.0f, uvVar.f18403x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        int i10;
        zh0 zh0Var = this.K;
        if (zh0Var != null && zh0Var.h && zh0Var.d(this) >= 0) {
            if (zh0Var.i(this)) {
                float f7 = 0.0f;
                if (zh0Var.g(this)) {
                    if (zh0Var.g(this)) {
                        i10 = zh0Var.e;
                    } else {
                        i10 = -1;
                    }
                    if (zh0Var.g(this)) {
                        f7 = zh0Var.f44155f;
                    }
                    r(canvas, i10, f7);
                    return;
                }
                float c10 = zh0Var.c(this);
                if (c10 <= 0.0f) {
                    return;
                }
                if (c10 < 1.0f) {
                    Rect rect = this.f17622b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.f17623c + rect.right, H(), (int) (c10 * 255.0f));
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

    public boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        uv uvVar;
        org.telegram.ui.Cells.u9[] K = K();
        if (K != null) {
            for (org.telegram.ui.Cells.u9 u9Var : K) {
                if (u9Var instanceof uv) {
                    if (((uv) u9Var).o(characterStyle, huVar)) {
                        Rect rect = this.f17622b;
                        huVar.e = rect.left - uvVar.f18398f;
                        huVar.f15956f = i10 + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean v() {
        if (I() >= J()) {
            return true;
        }
        return false;
    }

    public final void w(int i10, Rect rect) {
        int i11;
        CheckBoxBase checkBoxBase = this.f17626r;
        if (checkBoxBase != null && i10 == 0) {
            int i12 = this.f17622b.left;
            float f7 = this.M;
            rect.set(i12, (int) f7, this.f17623c + i12, (int) (f7 + H()));
        } else {
            if (checkBoxBase == null) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            A(i10 - i11, rect);
        }
        vv vvVar = this.f17621a;
        int i13 = vvVar.C + vvVar.T;
        int min = Math.min(i13, Math.max(rect.left, -vvVar.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i13));
    }

    public final CharSequence x(int i10) {
        int i11;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.f17626r;
        if (checkBoxBase != null && i10 == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f17629x && (staticLayout = this.d) != null) {
                charSequence = staticLayout.getText();
            } else {
                charSequence = null;
            }
            CharSequence y3 = y();
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(charSequence).append(' ');
            }
            if (!TextUtils.isEmpty(y3)) {
                spannableStringBuilder.append(y3).append(", ");
            }
            k(spannableStringBuilder);
            if (spannableStringBuilder.length() > 0) {
                return spannableStringBuilder;
            }
            return cd.L0(2131754903, null);
        }
        if (checkBoxBase == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        return E(i10 - i11);
    }

    public CharSequence y() {
        String L0;
        int i10 = this.E;
        String str = null;
        if (i10 == 0) {
            L0 = null;
        } else {
            L0 = cd.L0(i10, null);
        }
        int i11 = this.F;
        if (i11 != 0) {
            str = cd.L0(i11, null);
        }
        if (TextUtils.isEmpty(L0)) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return L0;
        }
        return TextUtils.concat(L0, ", ", str);
    }

    public float z() {
        return 1.0f;
    }

    public void S() {
    }

    public void U() {
    }

    public void V(Canvas canvas) {
    }

    public void k(SpannableStringBuilder spannableStringBuilder) {
    }
}
