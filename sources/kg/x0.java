package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Wallet.o9;
public final class x0 extends EditTextBoldCursor {
    public final int G1 = 1;
    public final y4 H1;
    public int I1;
    public final h6 J1;
    public final Object K1;

    public x0(a1 a1Var, Activity activity) {
        super(activity);
        this.K1 = a1Var;
        this.H1 = new y4(this);
        h6 h6Var = new h6(false, true, true);
        this.J1 = h6Var;
        h6Var.n(0.2f, 160L, wq.h);
        h6Var.w(org.telegram.messenger.g0.L(15.33f));
        h6Var.setCallback(this);
        h6Var.f34187b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.G1) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.I1 < 0) {
                    i7 = m6.f28111p7;
                } else {
                    i7 = m6.P5;
                }
                int a10 = this.H1.a(m6.w0(i7, ((a1) this.K1).getResourceProvider()), false);
                h6 h6Var = this.J1;
                h6Var.u(a10);
                h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                h6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.I1 < 0) {
                    i10 = m6.f28111p7;
                } else {
                    i10 = m6.P5;
                }
                int a11 = this.H1.a(m6.w0(i10, (org.telegram.ui.ActionBar.h6) this.K1), false);
                h6 h6Var2 = this.J1;
                h6Var2.u(a11);
                h6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                h6Var2.draw(canvas);
                return;
            case 2:
                super.dispatchDraw(canvas);
                if (this.I1 <= 0) {
                    i11 = m6.f28111p7;
                } else {
                    i11 = m6.P5;
                }
                int a12 = this.H1.a(m6.w0(i11, ((hk) this.K1).f38655a), false);
                h6 h6Var3 = this.J1;
                h6Var3.u(a12);
                int scrollX = getScrollX();
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                h6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                h6Var3.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.I1 <= 0) {
                    i12 = m6.f28111p7;
                } else {
                    i12 = m6.P5;
                }
                int a13 = this.H1.a(m6.w0(i12, ((o9) this.K1).getResourceProvider()), false);
                h6 h6Var4 = this.J1;
                h6Var4.u(a13);
                int scrollX2 = getScrollX();
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                h6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                h6Var4.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.G1) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String str;
        String str2;
        switch (this.G1) {
            case 0:
                super.onTextChanged(charSequence, i7, i10, i11);
                h6 h6Var = this.J1;
                if (h6Var != null) {
                    this.I1 = 96 - charSequence.length();
                    h6Var.a();
                    String str3 = "";
                    if (this.I1 <= 12) {
                        str3 = "" + this.I1;
                    }
                    h6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i7, i10, i11);
                h6 h6Var2 = this.J1;
                if (h6Var2 != null) {
                    this.I1 = 32 - charSequence.length();
                    h6Var2.a();
                    String str4 = "";
                    if (this.I1 <= 4) {
                        str4 = "" + this.I1;
                    }
                    h6Var2.t(str4, true, true);
                    return;
                }
                return;
            case 2:
                super.onTextChanged(charSequence, i7, i10, i11);
                h6 h6Var3 = this.J1;
                if (h6Var3 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    h6Var3.a();
                    int i12 = this.I1;
                    if (i12 <= 100) {
                        str = Integer.toString(i12);
                    } else {
                        str = "";
                    }
                    h6Var3.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                h6 h6Var4 = this.J1;
                if (h6Var4 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    h6Var4.a();
                    int i13 = this.I1;
                    if (i13 <= 100) {
                        str2 = Integer.toString(i13);
                    } else {
                        str2 = "";
                    }
                    h6Var4.t(str2, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.G1) {
            case 0:
                if (drawable != this.J1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 1:
                if (drawable != this.J1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.J1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                if (drawable != this.J1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
        }
    }

    public x0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.K1 = h6Var;
        this.H1 = new y4(this);
        h6 h6Var2 = new h6(false, true, true);
        this.J1 = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.setCallback(this);
        h6Var2.f34187b = 5;
    }

    public x0(hk hkVar, Context context) {
        super(context);
        this.K1 = hkVar;
        this.I1 = 960;
        this.H1 = new y4(this);
        h6 h6Var = new h6(false, true, true);
        this.J1 = h6Var;
        h6Var.n(0.2f, 160L, wq.h);
        h6Var.w(org.telegram.messenger.g0.L(15.33f));
        h6Var.f34187b = 5;
        h6Var.setCallback(this);
    }

    public x0(o9 o9Var, Activity activity) {
        super(activity);
        this.K1 = o9Var;
        this.I1 = 960;
        this.H1 = new y4(this);
        h6 h6Var = new h6(false, true, true);
        this.J1 = h6Var;
        h6Var.n(0.2f, 160L, wq.h);
        h6Var.w(org.telegram.messenger.g0.L(15.33f));
        h6Var.f34187b = 5;
        h6Var.setCallback(this);
    }
}
