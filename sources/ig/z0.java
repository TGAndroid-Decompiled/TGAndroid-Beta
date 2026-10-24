package ig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.yk;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.j9;
public final class z0 extends EditTextBoldCursor {
    public final int f13134b = 0;
    public int f13135c;
    public final g5 d;
    public final n6 e;
    public final NotificationCenter.NotificationCenterDelegate f13136f;

    public z0(c1 c1Var, Activity activity) {
        super(activity);
        this.f13136f = c1Var;
        this.d = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.e = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f28797b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        switch (this.f13134b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.f13135c < 0) {
                    i10 = k6.f21405p7;
                } else {
                    i10 = k6.P5;
                }
                int a2 = this.d.a(k6.w0(i10, ((c1) this.f13136f).getResourceProvider()), false);
                n6 n6Var = this.e;
                n6Var.u(a2);
                n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                n6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.f13135c <= 0) {
                    i11 = k6.f21405p7;
                } else {
                    i11 = k6.P5;
                }
                int a10 = this.d.a(k6.w0(i11, ((yk) this.f13136f).f27703a), false);
                n6 n6Var2 = this.e;
                n6Var2.u(a10);
                int scrollX = getScrollX();
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                n6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                n6Var2.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.f13135c <= 0) {
                    i12 = k6.f21405p7;
                } else {
                    i12 = k6.P5;
                }
                int a11 = this.d.a(k6.w0(i12, ((j9) this.f13136f).getResourceProvider()), false);
                n6 n6Var3 = this.e;
                n6Var3.u(a11);
                int scrollX2 = getScrollX();
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                n6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                n6Var3.draw(canvas);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String str;
        String str2;
        switch (this.f13134b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                n6 n6Var = this.e;
                if (n6Var != null) {
                    this.f13135c = 96 - charSequence.length();
                    n6Var.a();
                    String str3 = "";
                    if (this.f13135c <= 12) {
                        str3 = "" + this.f13135c;
                    }
                    n6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                n6 n6Var2 = this.e;
                if (n6Var2 != null) {
                    this.f13135c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    n6Var2.a();
                    int i13 = this.f13135c;
                    if (i13 <= 100) {
                        str = Integer.toString(i13);
                    } else {
                        str = "";
                    }
                    n6Var2.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                n6 n6Var3 = this.e;
                if (n6Var3 != null) {
                    this.f13135c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    n6Var3.a();
                    int i14 = this.f13135c;
                    if (i14 <= 100) {
                        str2 = Integer.toString(i14);
                    } else {
                        str2 = "";
                    }
                    n6Var3.t(str2, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.f13134b) {
            case 0:
                if (drawable != this.e && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 1:
                if (drawable != this.e && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                if (drawable != this.e && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
        }
    }

    public z0(yk ykVar, Context context) {
        super(context);
        this.f13136f = ykVar;
        this.f13135c = 960;
        this.d = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.e = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.f28797b = 5;
        n6Var.setCallback(this);
    }

    public z0(j9 j9Var, Activity activity) {
        super(activity);
        this.f13136f = j9Var;
        this.f13135c = 960;
        this.d = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.e = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.f28797b = 5;
        n6Var.setCallback(this);
    }
}
