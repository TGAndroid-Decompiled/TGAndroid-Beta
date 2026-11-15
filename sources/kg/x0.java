package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Wallet.p9;
public final class x0 extends EditTextBoldCursor {
    public final int M1 = 1;
    public final x4 N1;
    public int O1;
    public final g6 P1;
    public final Object Q1;

    public x0(a1 a1Var, Activity activity) {
        super(activity);
        this.Q1 = a1Var;
        this.N1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.P1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f34829b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.M1) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.O1 < 0) {
                    i7 = j6.f29070p7;
                } else {
                    i7 = j6.P5;
                }
                int a10 = this.N1.a(j6.w0(i7, ((a1) this.Q1).getResourceProvider()), false);
                g6 g6Var = this.P1;
                g6Var.u(a10);
                g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                g6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.O1 < 0) {
                    i10 = j6.f29070p7;
                } else {
                    i10 = j6.P5;
                }
                int a11 = this.N1.a(j6.w0(i10, (e6) this.Q1), false);
                g6 g6Var2 = this.P1;
                g6Var2.u(a11);
                g6Var2.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                g6Var2.draw(canvas);
                return;
            case 2:
                super.dispatchDraw(canvas);
                if (this.O1 <= 0) {
                    i11 = j6.f29070p7;
                } else {
                    i11 = j6.P5;
                }
                int a12 = this.N1.a(j6.w0(i11, ((qk) this.Q1).f33606a), false);
                g6 g6Var3 = this.P1;
                g6Var3.u(a12);
                int scrollX = getScrollX();
                int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                g6Var3.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
                g6Var3.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.O1 <= 0) {
                    i12 = j6.f29070p7;
                } else {
                    i12 = j6.P5;
                }
                int a13 = this.N1.a(j6.w0(i12, ((p9) this.Q1).getResourceProvider()), false);
                g6 g6Var4 = this.P1;
                g6Var4.u(a13);
                int scrollX2 = getScrollX();
                int L2 = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                g6Var4.setBounds(L2 - org.telegram.messenger.g0.L(48.0f), height2 - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L2, height2);
                g6Var4.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.M1) {
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
        switch (this.M1) {
            case 0:
                super.onTextChanged(charSequence, i7, i10, i11);
                g6 g6Var = this.P1;
                if (g6Var != null) {
                    this.O1 = 96 - charSequence.length();
                    g6Var.a();
                    String str3 = "";
                    if (this.O1 <= 12) {
                        str3 = "" + this.O1;
                    }
                    g6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i7, i10, i11);
                g6 g6Var2 = this.P1;
                if (g6Var2 != null) {
                    this.O1 = 32 - charSequence.length();
                    g6Var2.a();
                    String str4 = "";
                    if (this.O1 <= 4) {
                        str4 = "" + this.O1;
                    }
                    g6Var2.t(str4, true, true);
                    return;
                }
                return;
            case 2:
                super.onTextChanged(charSequence, i7, i10, i11);
                g6 g6Var3 = this.P1;
                if (g6Var3 != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    g6Var3.a();
                    int i12 = this.O1;
                    if (i12 <= 100) {
                        str = Integer.toString(i12);
                    } else {
                        str = "";
                    }
                    g6Var3.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                g6 g6Var4 = this.P1;
                if (g6Var4 != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    g6Var4.a();
                    int i13 = this.O1;
                    if (i13 <= 100) {
                        str2 = Integer.toString(i13);
                    } else {
                        str2 = "";
                    }
                    g6Var4.t(str2, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.M1) {
            case 0:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 1:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
        }
    }

    public x0(Context context, e6 e6Var) {
        super(context);
        this.Q1 = e6Var;
        this.N1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.P1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f34829b = 5;
    }

    public x0(qk qkVar, Context context) {
        super(context);
        this.Q1 = qkVar;
        this.O1 = 960;
        this.N1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.P1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f34829b = 5;
        g6Var.setCallback(this);
    }

    public x0(p9 p9Var, Activity activity) {
        super(activity);
        this.Q1 = p9Var;
        this.O1 = 960;
        this.N1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.P1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f34829b = 5;
        g6Var.setCallback(this);
    }
}
