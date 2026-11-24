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
public abstract class mg9 implements jg7 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public n41 K;
    public lg7 L;
    public tg9 M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final rh9 a;
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

    public mg9(rh9 rh9Var, Rect rect, int i) {
        this.a = rh9Var;
        this.b = new Rect(rect);
        this.c = (i - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        kib[] kibVarArr = (kib[]) spanned.getSpans(0, spanned.length(), kib.class);
        if (kibVarArr != null && kibVarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(kibVarArr, new na2(spanned, (byte) 1));
            for (kib kibVar : kibVarArr) {
                int spanStart = spanned.getSpanStart(kibVar);
                int spanEnd = spanned.getSpanEnd(kibVar);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    String str = kibVar.a;
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

    public static void m(SpannableStringBuilder spannableStringBuilder, qh9 qh9Var, qh9[] qh9VarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (qh9Var != null && (staticLayout2 = qh9Var.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
        } else if (qh9VarArr != null) {
            for (qh9 qh9Var2 : qh9VarArr) {
                if (qh9Var2 != null && (staticLayout = qh9Var2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i, Rect rect) {
        int i2 = this.b.left;
        float f = this.N;
        rect.set(i2, (int) f, this.c + i2, (int) (f + I()));
    }

    public int C() {
        return 0;
    }

    public CharSequence D() {
        return null;
    }

    public CharSequence E(int i) {
        return null;
    }

    public final RectF F() {
        rh9 rh9Var = this.a;
        float textY = rh9Var.E.getTextY() + this.N;
        Rect rect = this.b;
        float f = textY + rect.top;
        return new RectF(gl.L(4.0f) + (rh9Var.E.getTextX() - rh9Var.S), f, ((rh9Var.E.getTextX() + rh9Var.C) + rh9Var.T) - gl.L(4.0f), ((I() + f) - rect.top) - rect.bottom);
    }

    public final boolean G() {
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

    public int H() {
        return 0;
    }

    public int I() {
        Rect rect = this.b;
        return gl.L(62.0f) + rect.top + rect.bottom;
    }

    public int J() {
        return K();
    }

    public int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public pib[] L() {
        return null;
    }

    public final boolean M(int i) {
        if (this.r != null && i == 0 && G()) {
            return true;
        }
        return false;
    }

    public final boolean O(int i) {
        if (this.r != null && i == 0 && !o()) {
            return false;
        }
        return true;
    }

    public final boolean P(int i) {
        if ((this.r == null || i != 0) && (this instanceof tg9)) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        rh9 rh9Var = this.a;
        if (rh9Var.h.isEmpty() || (indexOf = rh9Var.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i = 0; i < rh9Var.h.size(); i++) {
            jg9 jg9Var = (jg9) rh9Var.h.get(i);
            if (indexOf >= jg9Var.a && indexOf <= jg9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        tg9 tg9Var = this.M;
        if (tg9Var == null) {
            return true;
        }
        if (!tg9Var.X.open) {
            return false;
        }
        return tg9Var.S();
    }

    public boolean U(int i, View view) {
        return false;
    }

    public void X(Canvas canvas, int i, float f) {
        W(canvas);
    }

    public boolean Y(MotionEvent motionEvent) {
        return false;
    }

    public void Z(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        pib[] L = L();
        if (L != null) {
            for (pib pibVar : L) {
                if (pibVar instanceof qh9) {
                    qh9 qh9Var = (qh9) pibVar;
                    qh9Var.c = i - qh9Var.f;
                    qh9Var.d = i2;
                    qh9Var.e = i3;
                }
            }
        }
    }

    @Override
    public Layout a() {
        return null;
    }

    public final void a0(boolean z) {
        View view = this.W;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public final void b(boolean z) {
        a0(z);
    }

    public final void b0(TLObject tLObject, boolean z) {
        this.H = tLObject;
        if (this.r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, this.a.D, null);
            this.r = checkBoxBase;
            checkBoxBase.h(bkb.Xl, bkb.y5, bkb.j7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(gl.L(5.0f));
        }
        this.r.f(-1, z, false);
        g0();
    }

    public final void c0(String str) {
        CharSequence text;
        String str2;
        int i;
        Layout.Alignment alignment;
        rh9 rh9Var = this.a;
        rh9Var.x.setTextSize(gl.L(gba.S0));
        Layout a = a();
        if (a == null) {
            text = null;
        } else {
            text = a.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (oh9 oh9Var : (oh9[]) ((Spanned) text).getSpans(0, 1, oh9.class)) {
                if (TLObject.hasFlag(oh9Var.b, 16)) {
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
            boolean H = rh9Var.H();
            Rect rect = this.b;
            if (H) {
                i = rect.right;
            } else {
                i = rect.left;
            }
            i2 = Math.max(i, gl.L(rh9Var.M + 4));
        }
        int i3 = i2;
        TextPaint textPaint = rh9Var.x;
        if (rh9Var.H()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i3, alignment, 1.0f, 0.0f, false);
        this.f = gl.L(rh9Var.M + 4);
        this.h = 0;
        for (int i4 = 0; i4 < this.d.getLineCount(); i4++) {
            this.f = Math.min(this.f, (int) this.d.getLineLeft(i4));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i4));
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
        if (!o()) {
            return;
        }
        rh9 rh9Var = this.a;
        if (!na7.q1(rh9Var.a).v4()) {
            new jh8(43, rh9Var.D, rh9Var.E.getContext()).show();
            return;
        }
        boolean z = !G();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z;
        }
        View view = rh9Var.Q;
        if (view != null) {
            this.r.a = view;
        }
        this.r.f(-1, z, true);
        View view2 = rh9Var.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = rh9Var.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        rh9Var.F.d2(rh9Var.E, new k08((byte) 5, this, z));
    }

    public final boolean f0(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg9.f0(android.view.MotionEvent):boolean");
    }

    public final void g0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        rh9 rh9Var = this.a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            } else {
                this.e = (Math.min(gl.L(rh9Var.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.s = (a().getLineBaseline(0) + H()) - (gl.L(20.0f) * 0.7f);
                return;
            }
            this.s = (Math.min(gl.L(rh9Var.M + 14), (I() - rect.top) - rect.bottom) - gl.L(20.0f)) / 2.0f;
        }
    }

    public final void n(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
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
        T();
    }

    public final boolean o() {
        rh9 rh9Var;
        gb2 gb2Var;
        bb2 bb2Var;
        if (this.r != null && this.H != null && (gb2Var = (rh9Var = this.a).E) != null && (bb2Var = rh9Var.F) != null && bb2Var.F0(gb2Var)) {
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

    public final void r(Canvas canvas, int i, float f) {
        int i2;
        float f2;
        int i3;
        float N;
        float f3;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        rh9 rh9Var = this.a;
        boolean H = rh9Var.H();
        TextPaint textPaint = rh9Var.x;
        float L = (((rh9Var.C + rh9Var.T) - gl.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(gl.L(gba.S0));
            if (rh9Var.D()) {
                i3 = bkb.Vc;
            } else {
                i3 = bkb.Uc;
            }
            textPaint.setColor(bkb.v0(i3, rh9Var.D));
            canvas.save();
            int i4 = 0;
            if (!this.x && !this.y) {
                float N2 = gl.N(5.0f);
                if (H) {
                    N = (this.n + L) - gl.N(0.5f);
                    f3 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + gl.N(0.5f);
                    f3 = this.n;
                }
                canvas.drawCircle(N - f3, (this.e + this.d.getLineBaseline(0)) - (gl.L(gba.S0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (H) {
                float L2 = (gl.L(0.0f) + L) - this.f;
                if (this.r != null) {
                    i4 = gl.L(26.0f);
                }
                canvas.translate(L2 + i4, this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((gl.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            if (H) {
                i2 = (int) (L + gl.L(6.0f));
            } else {
                i2 = -gl.L(26.0f);
            }
            this.I.set(i2 - gl.L(6.0f), this.s - gl.L(6.0f), gl.L(6.0f) + gl.L(20.0f) + i2, this.s + gl.L(20.0f) + gl.L(6.0f));
            View view = rh9Var.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            n41 n41Var = this.K;
            if (n41Var != null) {
                f2 = n41Var.a(0.1f);
            } else {
                f2 = 1.0f;
            }
            canvas.save();
            canvas.scale(f2, f2, gl.L(10.0f) + i2, this.s + gl.L(10.0f));
            this.r.e(i2, (int) this.s, gl.L(20.0f), gl.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i == Integer.MIN_VALUE) {
            W(canvas);
        } else {
            X(canvas, i, f);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        qh9 qh9Var;
        cm cmVar;
        pib[] L = L();
        if (L == null) {
            return false;
        }
        boolean z = false;
        for (pib pibVar : L) {
            if ((pibVar instanceof qh9) && (cmVar = (qh9Var = (qh9) pibVar).F) != null && !cmVar.a.isEmpty()) {
                canvas.save();
                canvas.translate(qh9Var.c, qh9Var.d - this.N);
                gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, qh9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z = true;
            }
        }
        return z;
    }

    public void t(Canvas canvas) {
        int i;
        lg7 lg7Var = this.L;
        if (lg7Var != null && lg7Var.h && lg7Var.d(this) >= 0) {
            if (lg7Var.i(this)) {
                float f = 0.0f;
                if (lg7Var.g(this)) {
                    if (lg7Var.g(this)) {
                        i = lg7Var.e;
                    } else {
                        i = -1;
                    }
                    if (lg7Var.g(this)) {
                        f = lg7Var.f;
                    }
                    r(canvas, i, f);
                    return;
                }
                float c = lg7Var.c(this);
                if (c <= 0.0f) {
                    return;
                }
                if (c < 1.0f) {
                    Rect rect = this.b;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, I(), (int) (c * 255.0f));
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

    public boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        qh9 qh9Var;
        pib[] L = L();
        if (L != null) {
            for (pib pibVar : L) {
                if (pibVar instanceof qh9) {
                    if (((qh9) pibVar).o(characterStyle, eg9Var)) {
                        Rect rect = this.b;
                        eg9Var.e = rect.left - qh9Var.f;
                        eg9Var.f = i + rect.top;
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

    public final void w(int i, Rect rect) {
        int i2;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase != null && i == 0) {
            int i3 = this.b.left;
            float f = this.N;
            rect.set(i3, (int) f, this.c + i3, (int) (f + I()));
        } else {
            if (checkBoxBase == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            A(i - i2, rect);
        }
        rh9 rh9Var = this.a;
        int i4 = rh9Var.C + rh9Var.T;
        int min = Math.min(i4, Math.max(rect.left, -rh9Var.S));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i4));
    }

    public final CharSequence x(int i) {
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
            CharSequence y = y();
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append(charSequence).append(' ');
            }
            if (!TextUtils.isEmpty(y)) {
                spannableStringBuilder.append(y).append(", ");
            }
            k(spannableStringBuilder);
            if (spannableStringBuilder.length() > 0) {
                return spannableStringBuilder;
            }
            return k96.M0(2131754903, null);
        }
        if (checkBoxBase == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return E(i - i2);
    }

    public CharSequence y() {
        String M0;
        int i = this.F;
        String str = null;
        if (i == 0) {
            M0 = null;
        } else {
            M0 = k96.M0(i, null);
        }
        int i2 = this.G;
        if (i2 != 0) {
            str = k96.M0(i2, null);
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
