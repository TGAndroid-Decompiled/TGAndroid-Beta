package hg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Wallet.j8;
public final class b1 extends EditTextBoldCursor {
    public final int f11170b = 0;
    public int f11171c;
    public final j5 d;
    public final q6 f11172e;
    public final NotificationCenter.NotificationCenterDelegate f11173f;

    public b1(e1 e1Var, Activity activity) {
        super(activity);
        this.f11173f = e1Var;
        this.d = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.f11172e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.setCallback(this);
        q6Var.f30065b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        switch (this.f11170b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.f11171c < 0) {
                    i10 = i6.f21018p7;
                } else {
                    i10 = i6.P5;
                }
                int a2 = this.d.a(i6.w0(i10, ((e1) this.f11173f).getResourceProvider()), false);
                q6 q6Var = this.f11172e;
                q6Var.u(a2);
                q6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                q6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.f11171c <= 0) {
                    i11 = i6.f21018p7;
                } else {
                    i11 = i6.P5;
                }
                int a10 = this.d.a(i6.w0(i11, ((gl) this.f11173f).f30172a), false);
                q6 q6Var2 = this.f11172e;
                q6Var2.u(a10);
                int scrollX = getScrollX();
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                q6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                q6Var2.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.f11171c <= 0) {
                    i12 = i6.f21018p7;
                } else {
                    i12 = i6.P5;
                }
                int a11 = this.d.a(i6.w0(i12, ((j8) this.f11173f).getResourceProvider()), false);
                q6 q6Var3 = this.f11172e;
                q6Var3.u(a11);
                int scrollX2 = getScrollX();
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                q6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                q6Var3.draw(canvas);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String str;
        String str2;
        switch (this.f11170b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                q6 q6Var = this.f11172e;
                if (q6Var != null) {
                    this.f11171c = 96 - charSequence.length();
                    q6Var.a();
                    String str3 = "";
                    if (this.f11171c <= 12) {
                        str3 = "" + this.f11171c;
                    }
                    q6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                q6 q6Var2 = this.f11172e;
                if (q6Var2 != null) {
                    this.f11171c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    q6Var2.a();
                    int i13 = this.f11171c;
                    if (i13 <= 100) {
                        str = Integer.toString(i13);
                    } else {
                        str = "";
                    }
                    q6Var2.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                q6 q6Var3 = this.f11172e;
                if (q6Var3 != null) {
                    this.f11171c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    q6Var3.a();
                    int i14 = this.f11171c;
                    if (i14 <= 100) {
                        str2 = Integer.toString(i14);
                    } else {
                        str2 = "";
                    }
                    q6Var3.t(str2, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.f11170b) {
            case 0:
                if (drawable != this.f11172e && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 1:
                if (drawable != this.f11172e && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                if (drawable != this.f11172e && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
        }
    }

    public b1(gl glVar, Context context) {
        super(context);
        this.f11173f = glVar;
        this.f11171c = 960;
        this.d = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.f11172e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.f30065b = 5;
        q6Var.setCallback(this);
    }

    public b1(j8 j8Var, Activity activity) {
        super(activity);
        this.f11173f = j8Var;
        this.f11171c = 960;
        this.d = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.f11172e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.f30065b = 5;
        q6Var.setCallback(this);
    }
}
