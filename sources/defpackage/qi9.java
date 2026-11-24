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
public abstract class qi9 implements mi7 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public u51 K;
    public oi7 L;
    public wi9 M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final uj9 a;
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

    public qi9(uj9 uj9Var, Rect rect, int i) {
        this.a = uj9Var;
        this.b = new Rect(rect);
        this.c = (i - rect.left) - rect.right;
    }

    public static CharSequence g0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        lkb[] lkbVarArr = (lkb[]) spanned.getSpans(0, spanned.length(), lkb.class);
        if (lkbVarArr != null && lkbVarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(lkbVarArr, new yb2(spanned, (byte) 1));
            for (lkb lkbVar : lkbVarArr) {
                int spanStart = spanned.getSpanStart(lkbVar);
                int spanEnd = spanned.getSpanEnd(lkbVar);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    String str = lkbVar.a;
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

    public static void k(SpannableStringBuilder spannableStringBuilder, tj9 tj9Var, tj9[] tj9VarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (tj9Var != null && (staticLayout2 = tj9Var.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
        } else if (tj9VarArr != null) {
            for (tj9 tj9Var2 : tj9VarArr) {
                if (tj9Var2 != null && (staticLayout = tj9Var2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(g0(staticLayout.getText()));
                }
            }
        }
    }

    public int B() {
        return 0;
    }

    public CharSequence C() {
        return null;
    }

    public CharSequence D(int i) {
        return null;
    }

    public final RectF E() {
        uj9 uj9Var = this.a;
        float textY = uj9Var.E.getTextY() + this.N;
        Rect rect = this.b;
        float f = textY + rect.top;
        return new RectF(gm.L(4.0f) + (uj9Var.E.getTextX() - uj9Var.S), f, ((uj9Var.E.getTextX() + uj9Var.C) + uj9Var.T) - gm.L(4.0f), ((H() + f) - rect.top) - rect.bottom);
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
        return gm.L(62.0f) + rect.top + rect.bottom;
    }

    public int I() {
        return J();
    }

    public int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public qkb[] K() {
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
        if ((this.r == null || i != 0) && (this instanceof wi9)) {
            return true;
        }
        return false;
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        uj9 uj9Var = this.a;
        if (uj9Var.h.isEmpty() || (indexOf = uj9Var.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i = 0; i < uj9Var.h.size(); i++) {
            ni9 ni9Var = (ni9) uj9Var.h.get(i);
            if (indexOf >= ni9Var.a && indexOf <= ni9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        wi9 wi9Var = this.M;
        if (wi9Var == null) {
            return true;
        }
        if (!wi9Var.X.open) {
            return false;
        }
        return wi9Var.R();
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
        qkb[] K = K();
        if (K != null) {
            for (qkb qkbVar : K) {
                if (qkbVar instanceof tj9) {
                    tj9 tj9Var = (tj9) qkbVar;
                    tj9Var.c = i - tj9Var.f;
                    tj9Var.d = i2;
                    tj9Var.e = i3;
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
            checkBoxBase.h(cmb.Xl, cmb.y5, cmb.j7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(gm.L(5.0f));
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
        uj9 uj9Var = this.a;
        uj9Var.x.setTextSize(gm.L(gda.S0));
        Layout a = a();
        if (a == null) {
            text = null;
        } else {
            text = a.getText();
        }
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (rj9 rj9Var : (rj9[]) ((Spanned) text).getSpans(0, 1, rj9.class)) {
                if (TLObject.hasFlag(rj9Var.b, 16)) {
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
            boolean H = uj9Var.H();
            Rect rect = this.b;
            if (H) {
                i = rect.right;
            } else {
                i = rect.left;
            }
            i2 = Math.max(i, gm.L(uj9Var.M + 4));
        }
        int i3 = i2;
        TextPaint textPaint = uj9Var.x;
        if (uj9Var.H()) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        this.d = new StaticLayout(str2, textPaint, i3, alignment, 1.0f, 0.0f, false);
        this.f = gm.L(uj9Var.M + 4);
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
        uj9 uj9Var = this.a;
        if (!oc7.r1(uj9Var.a).x4()) {
            new kj8(43, uj9Var.D, uj9Var.E.getContext()).show();
            return;
        }
        boolean z = !F();
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            ((TL_iv.PageListItem) tLObject).checked = z;
        } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
            ((TL_iv.PageListOrderedItem) tLObject).checked = z;
        }
        View view = uj9Var.Q;
        if (view != null) {
            this.r.a = view;
        }
        this.r.f(-1, z, true);
        View view2 = uj9Var.Q;
        if (view2 != null) {
            view2.invalidate();
        }
        View view3 = uj9Var.Q;
        if (view3 != null) {
            view3.performHapticFeedback(3, 2);
        }
        uj9Var.F.P1(uj9Var.E, new n28((byte) 5, this, z));
    }

    @Override
    public final View e() {
        return null;
    }

    public final boolean e0(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi9.e0(android.view.MotionEvent):boolean");
    }

    public final void f0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        uj9 uj9Var = this.a;
        if (staticLayout != null) {
            if (a() != null && a().getLineCount() > 0 && this.d.getLineCount() > 0) {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            } else {
                this.e = (Math.min(gm.L(uj9Var.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            }
        }
        if (this.r != null) {
            if (a() != null && a().getLineCount() > 0) {
                this.s = (a().getLineBaseline(0) + G()) - (gm.L(20.0f) * 0.7f);
                return;
            }
            this.s = (Math.min(gm.L(uj9Var.M + 14), (H() - rect.top) - rect.bottom) - gm.L(20.0f)) / 2.0f;
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
        uj9 uj9Var;
        rc2 rc2Var;
        mc2 mc2Var;
        if (this.r != null && this.H != null && (rc2Var = (uj9Var = this.a).E) != null && (mc2Var = uj9Var.F) != null && mc2Var.x0(rc2Var)) {
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
        uj9 uj9Var = this.a;
        boolean H = uj9Var.H();
        TextPaint textPaint = uj9Var.x;
        float L = (((uj9Var.C + uj9Var.T) - gm.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(gm.L(gda.S0));
            if (uj9Var.D()) {
                i3 = cmb.Vc;
            } else {
                i3 = cmb.Uc;
            }
            textPaint.setColor(cmb.v0(i3, uj9Var.D));
            canvas.save();
            int i4 = 0;
            if (!this.x && !this.y) {
                float N2 = gm.N(5.0f);
                if (H) {
                    N = (this.n + L) - gm.N(0.5f);
                    f3 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + gm.N(0.5f);
                    f3 = this.n;
                }
                canvas.drawCircle(N - f3, (this.e + this.d.getLineBaseline(0)) - (gm.L(gda.S0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (H) {
                float L2 = (gm.L(0.0f) + L) - this.f;
                if (this.r != null) {
                    i4 = gm.L(26.0f);
                }
                canvas.translate(L2 + i4, this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((gm.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            if (H) {
                i2 = (int) (L + gm.L(6.0f));
            } else {
                i2 = -gm.L(26.0f);
            }
            this.I.set(i2 - gm.L(6.0f), this.s - gm.L(6.0f), gm.L(6.0f) + gm.L(20.0f) + i2, this.s + gm.L(20.0f) + gm.L(6.0f));
            View view = uj9Var.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            u51 u51Var = this.K;
            if (u51Var != null) {
                f2 = u51Var.a(0.1f);
            } else {
                f2 = 1.0f;
            }
            canvas.save();
            canvas.scale(f2, f2, gm.L(10.0f) + i2, this.s + gm.L(10.0f));
            this.r.e(i2, (int) this.s, gm.L(20.0f), gm.L(20.0f));
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
        tj9 tj9Var;
        cn cnVar;
        qkb[] K = K();
        if (K == null) {
            return false;
        }
        boolean z = false;
        for (qkb qkbVar : K) {
            if ((qkbVar instanceof tj9) && (cnVar = (tj9Var = (tj9) qkbVar).F) != null && !cnVar.a.isEmpty()) {
                canvas.save();
                canvas.translate(tj9Var.c, tj9Var.d - this.N);
                gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, tj9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z = true;
            }
        }
        return z;
    }

    public void s(Canvas canvas) {
        int i;
        oi7 oi7Var = this.L;
        if (oi7Var != null && oi7Var.h && oi7Var.d(this) >= 0) {
            if (oi7Var.i(this)) {
                float f = 0.0f;
                if (oi7Var.g(this)) {
                    if (oi7Var.g(this)) {
                        i = oi7Var.e;
                    } else {
                        i = -1;
                    }
                    if (oi7Var.g(this)) {
                        f = oi7Var.f;
                    }
                    q(canvas, i, f);
                    return;
                }
                float c = oi7Var.c(this);
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

    public boolean t(CharacterStyle characterStyle, int i, ii9 ii9Var) {
        tj9 tj9Var;
        qkb[] K = K();
        if (K != null) {
            for (qkb qkbVar : K) {
                if (qkbVar instanceof tj9) {
                    if (((tj9) qkbVar).o(characterStyle, ii9Var)) {
                        Rect rect = this.b;
                        ii9Var.e = rect.left - tj9Var.f;
                        ii9Var.f = i + rect.top;
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
        uj9 uj9Var = this.a;
        int i4 = uj9Var.C + uj9Var.T;
        int min = Math.min(i4, Math.max(rect.left, -uj9Var.S));
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
            return jb6.M0(2131754903, null);
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
            M0 = jb6.M0(i, null);
        }
        int i2 = this.G;
        if (i2 != 0) {
            str = jb6.M0(i2, null);
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
