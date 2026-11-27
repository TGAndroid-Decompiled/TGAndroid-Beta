package defpackage;

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
public abstract class dk9 implements ti7 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public v41 K;
    public vi7 L;
    public jk9 M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final hl9 a;
    public final Rect b;
    public final int c;
    public StaticLayout d;
    public float e;
    public int f;
    public int h;
    public int n;
    public CheckBoxBase r;
    public float s;
    public int w;
    public boolean x;
    public boolean y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public dk9(hl9 hl9Var, Rect rect, int i) {
        this.a = hl9Var;
        this.b = new Rect(rect);
        this.c = (i - rect.left) - rect.right;
    }

    public static CharSequence g0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        fmb[] fmbVarArr = (fmb[]) spanned.getSpans(0, spanned.length(), fmb.class);
        if (fmbVarArr != null && fmbVarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(fmbVarArr, new db2(spanned, (byte) 1));
            for (fmb fmbVar : fmbVarArr) {
                int spanStart = spanned.getSpanStart(fmbVar);
                int spanEnd = spanned.getSpanEnd(fmbVar);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    String str = fmbVar.a;
                    if (str == null) {
                        str = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) str);
                }
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, gl9 gl9Var, gl9[] gl9VarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (gl9Var != null && (staticLayout2 = gl9Var.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
        } else if (gl9VarArr != null) {
            for (gl9 gl9Var2 : gl9VarArr) {
                if (gl9Var2 != null && (staticLayout = gl9Var2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(g0(staticLayout.getText()));
                }
            }
        }
    }

    public int A() {
        return 0;
    }

    public CharSequence C() {
        return null;
    }

    public CharSequence D(int i) {
        return null;
    }

    public final RectF E() {
        hl9 hl9Var = this.a;
        float textY = hl9Var.E.getTextY() + this.N;
        Rect rect = this.b;
        float f = textY + rect.top;
        return new RectF(hl.L(4.0f) + (hl9Var.E.getTextX() - hl9Var.S), f, ((hl9Var.E.getTextX() + hl9Var.C) + hl9Var.T) - hl.L(4.0f), ((H() + f) - rect.top) - rect.bottom);
    }

    public final boolean F() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase != null && checkBoxBase.q) {
            return true;
        }
        return false;
    }

    public int G() {
        return 0;
    }

    public int H() {
        Rect rect = this.b;
        return hl.L(62.0f) + rect.top + rect.bottom;
    }

    public int I() {
        return J();
    }

    public int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public kmb[] K() {
        return null;
    }

    public final boolean L(int i) {
        if (this.r != null && i == 0 && F()) {
            return true;
        }
        return false;
    }

    public final boolean M(int i) {
        if (this.r != null && i == 0 && !n()) {
            return false;
        }
        return true;
    }

    public final boolean O(int i) {
        if ((this.r == null || i != 0) && (this instanceof jk9)) {
            return true;
        }
        return false;
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        hl9 hl9Var = this.a;
        if (hl9Var.h.isEmpty() || (indexOf = hl9Var.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i = 0; i < hl9Var.h.size(); i++) {
            ak9 ak9Var = (ak9) hl9Var.h.get(i);
            if (indexOf >= ak9Var.a && indexOf <= ak9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        jk9 jk9Var = this.M;
        if (jk9Var == null) {
            return true;
        }
        if (!jk9Var.X.open) {
            return false;
        }
        return jk9Var.R();
    }

    public boolean T(int i, View view) {
        return false;
    }

    public void W(Canvas canvas, int i, float f) {
        V(canvas);
    }

    public boolean X(MotionEvent motionEvent) {
        return false;
    }

    public void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        kmb[] K = K();
        if (K != null) {
            for (kmb kmbVar : K) {
                if (kmbVar instanceof gl9) {
                    gl9 gl9Var = (gl9) kmbVar;
                    gl9Var.c = i - gl9Var.f;
                    gl9Var.d = i2;
                    gl9Var.e = i3;
                }
            }
        }
    }

    public final void Z(boolean z) {
        View view = this.W;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override
    public Layout a() {
        return null;
    }

    public final void a0(TLObject tLObject, boolean z) {
        this.H = tLObject;
        if (this.r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, this.a.D, null);
            this.r = checkBoxBase;
            checkBoxBase.h(aob.Yl, aob.z5, aob.k7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(hl.L(5.0f));
        }
        this.r.f(-1, z, false);
        f0();
    }

    public final void b(boolean z) {
        Z(z);
    }

    public final void b0(String str) {
        CharSequence text;
        String str2;
        int i;
        Layout.Alignment alignment;
        hl9 hl9Var = this.a;
        hl9Var.x.setTextSize(hl.L(xea.S0));
        Layout a = a();
        if (a == null) {
            text = null;
        } else {
            text = a.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (el9 el9Var : (el9[]) ((Spanned) text).getSpans(0, 1, el9.class)) {
                if (TLObject.hasFlag(el9Var.b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i2 = this.n;
        if (i2 <= 0) {
            boolean H = hl9Var.H();
            Rect rect = this.b;
            if (H) {
                i = rect.right;
            } else {
                i = rect.left;
            }
            i2 = Math.max(i, hl.L(hl9Var.M + 4));
        }
        int i3 = i2;
        TextPaint textPaint = hl9Var.x;
        if (hl9Var.H()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i3, alignment, 1.0f, 0.0f, false);
        this.f = hl.L(hl9Var.M + 4);
        this.h = 0;
        for (int i4 = 0; i4 < this.d.getLineCount(); i4++) {
            this.f = Math.min(this.f, (int) this.d.getLineLeft(i4));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i4));
        }
        f0();
    }

    public void c0() {
        this.P = this.N;
        this.Q = this.O;
        this.S = this.R;
    }

    public final void d0() {
        if (!n()) {
            return;
        }
        hl9 hl9Var = this.a;
        if (!uc7.s1(hl9Var.a).D4()) {
            new xk8(43, hl9Var.D, hl9Var.E.getContext()).show();
            return;
        }
        boolean z = !F();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z;
        }
        View view = hl9Var.Q;
        if (view != null) {
            this.r.a = view;
        }
        this.r.f(-1, z, true);
        View view2 = hl9Var.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = hl9Var.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        hl9Var.F.M1(hl9Var.E, new q38((byte) 5, this, z));
    }

    @Override
    public final View e() {
        return null;
    }

    public final boolean e0(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk9.e0(android.view.MotionEvent):boolean");
    }

    public final void f0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        hl9 hl9Var = this.a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            } else {
                this.e = (Math.min(hl.L(hl9Var.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.s = (a().getLineBaseline(0) + G()) - (hl.L(20.0f) * 0.7f);
                return;
            }
            this.s = (Math.min(hl.L(hl9Var.M + 14), (H() - rect.top) - rect.bottom) - hl.L(20.0f)) / 2.0f;
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            U();
            CheckBoxBase checkBoxBase = this.r;
            if (checkBoxBase != null) {
                checkBoxBase.l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.a = view;
            checkBoxBase2.l = true;
        }
        S();
    }

    public final boolean n() {
        hl9 hl9Var;
        wb2 wb2Var;
        rb2 rb2Var;
        if (this.r != null && this.H != null && (wb2Var = (hl9Var = this.a).E) != null && (rb2Var = hl9Var.F) != null && rb2Var.w0(wb2Var)) {
            return true;
        }
        return false;
    }

    public void o(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void p(Canvas canvas) {
        q(canvas, Integer.MIN_VALUE, 0.0f);
    }

    public final void q(Canvas canvas, int i, float f) {
        int i2;
        float f2;
        int i3;
        float N;
        float f3;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        hl9 hl9Var = this.a;
        boolean H = hl9Var.H();
        TextPaint textPaint = hl9Var.x;
        float L = (((hl9Var.C + hl9Var.T) - hl.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(hl.L(xea.S0));
            if (hl9Var.D()) {
                i3 = aob.Wc;
            } else {
                i3 = aob.Vc;
            }
            textPaint.setColor(aob.v0(i3, hl9Var.D));
            canvas.save();
            int i4 = 0;
            if (!this.x && !this.y) {
                float N2 = hl.N(5.0f);
                if (H) {
                    N = (this.n + L) - hl.N(0.5f);
                    f3 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + hl.N(0.5f);
                    f3 = this.n;
                }
                canvas.drawCircle(N - f3, (this.e + this.d.getLineBaseline(0)) - (hl.L(xea.S0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (H) {
                float L2 = (hl.L(0.0f) + L) - this.f;
                if (this.r != null) {
                    i4 = hl.L(26.0f);
                }
                canvas.translate(L2 + i4, this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((hl.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            if (H) {
                i2 = (int) (L + hl.L(6.0f));
            } else {
                i2 = -hl.L(26.0f);
            }
            this.I.set(i2 - hl.L(6.0f), this.s - hl.L(6.0f), hl.L(6.0f) + hl.L(20.0f) + i2, this.s + hl.L(20.0f) + hl.L(6.0f));
            View view = hl9Var.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            v41 v41Var = this.K;
            if (v41Var != null) {
                f2 = v41Var.a(0.1f);
            } else {
                f2 = 1.0f;
            }
            canvas.save();
            canvas.scale(f2, f2, hl.L(10.0f) + i2, this.s + hl.L(10.0f));
            this.r.e(i2, (int) this.s, hl.L(20.0f), hl.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i == Integer.MIN_VALUE) {
            V(canvas);
        } else {
            W(canvas, i, f);
        }
        canvas.restore();
    }

    public boolean r(Canvas canvas, ColorFilter colorFilter) {
        gl9 gl9Var;
        dm dmVar;
        kmb[] K = K();
        if (K == null) {
            return false;
        }
        boolean z = false;
        for (kmb kmbVar : K) {
            if ((kmbVar instanceof gl9) && (dmVar = (gl9Var = (gl9) kmbVar).F) != null && !dmVar.a.isEmpty()) {
                canvas.save();
                canvas.translate(gl9Var.c, gl9Var.d - this.N);
                hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, gl9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z = true;
            }
        }
        return z;
    }

    public void s(Canvas canvas) {
        int i;
        vi7 vi7Var = this.L;
        if (vi7Var != null && vi7Var.h && vi7Var.d(this) >= 0) {
            if (vi7Var.i(this)) {
                float f = 0.0f;
                if (vi7Var.g(this)) {
                    if (vi7Var.g(this)) {
                        i = vi7Var.e;
                    } else {
                        i = -1;
                    }
                    if (vi7Var.g(this)) {
                        f = vi7Var.f;
                    }
                    q(canvas, i, f);
                    return;
                }
                float c = vi7Var.c(this);
                if (c <= 0.0f) {
                    return;
                }
                if (c < 1.0f) {
                    Rect rect = this.b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, H(), (int) (c * 255.0f));
                    p(canvas);
                    canvas.restoreToCount(saveLayerAlpha);
                    return;
                }
            } else {
                return;
            }
        }
        p(canvas);
    }

    public boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        gl9 gl9Var;
        kmb[] K = K();
        if (K != null) {
            for (kmb kmbVar : K) {
                if (kmbVar instanceof gl9) {
                    if (((gl9) kmbVar).o(characterStyle, vj9Var)) {
                        Rect rect = this.b;
                        vj9Var.e = rect.left - gl9Var.f;
                        vj9Var.f = i + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean u() {
        if (I() >= J()) {
            return true;
        }
        return false;
    }

    public final void v(int i, Rect rect) {
        int i2;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase != null && i == 0) {
            int i3 = this.b.left;
            float f = this.N;
            rect.set(i3, (int) f, this.c + i3, (int) (f + H()));
        } else {
            if (checkBoxBase == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            z(i - i2, rect);
        }
        hl9 hl9Var = this.a;
        int i4 = hl9Var.C + hl9Var.T;
        int min = Math.min(i4, Math.max(rect.left, -hl9Var.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i4));
    }

    public final CharSequence w(int i) {
        int i2;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase != null && i == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.x && (staticLayout = this.d) != null) {
                charSequence = staticLayout.getText();
            } else {
                charSequence = null;
            }
            CharSequence x = x();
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(charSequence).append(' ');
            }
            if (!TextUtils.isEmpty(x)) {
                spannableStringBuilder.append(x).append(", ");
            }
            j(spannableStringBuilder);
            if (spannableStringBuilder.length() > 0) {
                return spannableStringBuilder;
            }
            return ob6.M0(2131754899, null);
        }
        if (checkBoxBase == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return D(i - i2);
    }

    public CharSequence x() {
        String M0;
        int i = this.F;
        String str = null;
        if (i == 0) {
            M0 = null;
        } else {
            M0 = ob6.M0(i, null);
        }
        int i2 = this.G;
        if (i2 != 0) {
            str = ob6.M0(i2, null);
        }
        if (TextUtils.isEmpty(M0)) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return M0;
        }
        return TextUtils.concat(M0, ", ", str);
    }

    public float y() {
        return 1.0f;
    }

    public void z(int i, Rect rect) {
        int i2 = this.b.left;
        float f = this.N;
        rect.set(i2, (int) f, this.c + i2, (int) (f + H()));
    }

    public void S() {
    }

    public void U() {
    }

    public void V(Canvas canvas) {
    }

    public void j(SpannableStringBuilder spannableStringBuilder) {
    }
}
