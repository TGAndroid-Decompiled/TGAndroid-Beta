package ig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Wallet.i9;
public final class a1 extends EditTextBoldCursor {
    public final int f12821b = 0;
    public int f12822c;
    public final i5 d;
    public final p6 e;
    public final NotificationCenter.NotificationCenterDelegate f12823f;

    public a1(d1 d1Var, Activity activity) {
        super(activity);
        this.f12823f = d1Var;
        this.d = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29226b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        switch (this.f12821b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.f12822c < 0) {
                    i10 = h6.f21211p7;
                } else {
                    i10 = h6.P5;
                }
                int a2 = this.d.a(h6.w0(i10, ((d1) this.f12823f).getResourceProvider()), false);
                p6 p6Var = this.e;
                p6Var.u(a2);
                p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                p6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.f12822c <= 0) {
                    i11 = h6.f21211p7;
                } else {
                    i11 = h6.P5;
                }
                int a10 = this.d.a(h6.w0(i11, ((al) this.f12823f).f28172a), false);
                p6 p6Var2 = this.e;
                p6Var2.u(a10);
                int scrollX = getScrollX();
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                p6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                p6Var2.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.f12822c <= 0) {
                    i12 = h6.f21211p7;
                } else {
                    i12 = h6.P5;
                }
                int a11 = this.d.a(h6.w0(i12, ((i9) this.f12823f).getResourceProvider()), false);
                p6 p6Var3 = this.e;
                p6Var3.u(a11);
                int scrollX2 = getScrollX();
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                p6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                p6Var3.draw(canvas);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String str;
        String str2;
        switch (this.f12821b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                p6 p6Var = this.e;
                if (p6Var != null) {
                    this.f12822c = 96 - charSequence.length();
                    p6Var.a();
                    String str3 = "";
                    if (this.f12822c <= 12) {
                        str3 = "" + this.f12822c;
                    }
                    p6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                p6 p6Var2 = this.e;
                if (p6Var2 != null) {
                    this.f12822c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    p6Var2.a();
                    int i13 = this.f12822c;
                    if (i13 <= 100) {
                        str = Integer.toString(i13);
                    } else {
                        str = "";
                    }
                    p6Var2.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                p6 p6Var3 = this.e;
                if (p6Var3 != null) {
                    this.f12822c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    p6Var3.a();
                    int i14 = this.f12822c;
                    if (i14 <= 100) {
                        str2 = Integer.toString(i14);
                    } else {
                        str2 = "";
                    }
                    p6Var3.t(str2, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.f12821b) {
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

    public a1(al alVar, Context context) {
        super(context);
        this.f12823f = alVar;
        this.f12822c = 960;
        this.d = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.f29226b = 5;
        p6Var.setCallback(this);
    }

    public a1(i9 i9Var, Activity activity) {
        super(activity);
        this.f12823f = i9Var;
        this.f12822c = 960;
        this.d = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.f29226b = 5;
        p6Var.setCallback(this);
    }
}
