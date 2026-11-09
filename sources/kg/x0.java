package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Wallet.l9;
public final class x0 extends EditTextBoldCursor {
    public final int G1 = 1;
    public final z4 H1;
    public int I1;
    public final i6 J1;
    public final Object K1;

    public x0(a1 a1Var, Activity activity) {
        super(activity);
        this.K1 = a1Var;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.f34587b = 5;
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
                    i7 = l6.f28086p7;
                } else {
                    i7 = l6.P5;
                }
                int a10 = this.H1.a(l6.w0(i7, ((a1) this.K1).getResourceProvider()), false);
                i6 i6Var = this.J1;
                i6Var.u(a10);
                i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                i6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.I1 < 0) {
                    i10 = l6.f28086p7;
                } else {
                    i10 = l6.P5;
                }
                int a11 = this.H1.a(l6.w0(i10, (g6) this.K1), false);
                i6 i6Var2 = this.J1;
                i6Var2.u(a11);
                i6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                i6Var2.draw(canvas);
                return;
            case 2:
                super.dispatchDraw(canvas);
                if (this.I1 <= 0) {
                    i11 = l6.f28086p7;
                } else {
                    i11 = l6.P5;
                }
                int a12 = this.H1.a(l6.w0(i11, ((ik) this.K1).f39070a), false);
                i6 i6Var3 = this.J1;
                i6Var3.u(a12);
                int scrollX = getScrollX();
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                i6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                i6Var3.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.I1 <= 0) {
                    i12 = l6.f28086p7;
                } else {
                    i12 = l6.P5;
                }
                int a13 = this.H1.a(l6.w0(i12, ((l9) this.K1).getResourceProvider()), false);
                i6 i6Var4 = this.J1;
                i6Var4.u(a13);
                int scrollX2 = getScrollX();
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                i6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                i6Var4.draw(canvas);
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
                i6 i6Var = this.J1;
                if (i6Var != null) {
                    this.I1 = 96 - charSequence.length();
                    i6Var.a();
                    String str3 = "";
                    if (this.I1 <= 12) {
                        str3 = "" + this.I1;
                    }
                    i6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var2 = this.J1;
                if (i6Var2 != null) {
                    this.I1 = 32 - charSequence.length();
                    i6Var2.a();
                    String str4 = "";
                    if (this.I1 <= 4) {
                        str4 = "" + this.I1;
                    }
                    i6Var2.t(str4, true, true);
                    return;
                }
                return;
            case 2:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var3 = this.J1;
                if (i6Var3 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    i6Var3.a();
                    int i12 = this.I1;
                    if (i12 <= 100) {
                        str = Integer.toString(i12);
                    } else {
                        str = "";
                    }
                    i6Var3.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                i6 i6Var4 = this.J1;
                if (i6Var4 != null) {
                    this.I1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    i6Var4.a();
                    int i13 = this.I1;
                    if (i13 <= 100) {
                        str2 = Integer.toString(i13);
                    } else {
                        str2 = "";
                    }
                    i6Var4.t(str2, isAttachedToWindow(), true);
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

    public x0(Context context, g6 g6Var) {
        super(context);
        this.K1 = g6Var;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.f34587b = 5;
    }

    public x0(ik ikVar, Context context) {
        super(context);
        this.K1 = ikVar;
        this.I1 = 960;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.f34587b = 5;
        i6Var.setCallback(this);
    }

    public x0(l9 l9Var, Activity activity) {
        super(activity);
        this.K1 = l9Var;
        this.I1 = 960;
        this.H1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.J1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.f34587b = 5;
        i6Var.setCallback(this);
    }
}
