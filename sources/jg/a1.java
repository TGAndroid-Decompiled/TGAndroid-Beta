package jg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Wallet.i9;
public final class a1 extends EditTextBoldCursor {
    public final int f15620b = 0;
    public int f15621c;
    public final j5 d;
    public final r6 e;
    public final NotificationCenter.NotificationCenterDelegate f15622f;

    public a1(d1 d1Var, Activity activity) {
        super(activity);
        this.f15622f = d1Var;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f32121b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        switch (this.f15620b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.f15621c < 0) {
                    i10 = y6.f23581p7;
                } else {
                    i10 = y6.P5;
                }
                int a2 = this.d.a(y6.w0(i10, ((d1) this.f15622f).getResourceProvider()), false);
                r6 r6Var = this.e;
                r6Var.u(a2);
                r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                r6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.f15621c <= 0) {
                    i11 = y6.f23581p7;
                } else {
                    i11 = y6.P5;
                }
                int a10 = this.d.a(y6.w0(i11, ((al) this.f15622f).f30214a), false);
                r6 r6Var2 = this.e;
                r6Var2.u(a10);
                int scrollX = getScrollX();
                int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
                int height = getHeight() + getScrollY();
                r6Var2.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
                r6Var2.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.f15621c <= 0) {
                    i12 = y6.f23581p7;
                } else {
                    i12 = y6.P5;
                }
                int a11 = this.d.a(y6.w0(i12, ((i9) this.f15622f).getResourceProvider()), false);
                r6 r6Var3 = this.e;
                r6Var3.u(a11);
                int scrollX2 = getScrollX();
                int dp2 = AndroidUtilities.dp(48.0f) + ((getWidth() + scrollX2) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                r6Var3.setBounds(dp2 - AndroidUtilities.dp(48.0f), height2 - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp2, height2);
                r6Var3.draw(canvas);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String str;
        String str2;
        switch (this.f15620b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var = this.e;
                if (r6Var != null) {
                    this.f15621c = 96 - charSequence.length();
                    r6Var.a();
                    String str3 = "";
                    if (this.f15621c <= 12) {
                        str3 = "" + this.f15621c;
                    }
                    r6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var2 = this.e;
                if (r6Var2 != null) {
                    this.f15621c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    r6Var2.a();
                    int i13 = this.f15621c;
                    if (i13 <= 100) {
                        str = Integer.toString(i13);
                    } else {
                        str = "";
                    }
                    r6Var2.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var3 = this.e;
                if (r6Var3 != null) {
                    this.f15621c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    r6Var3.a();
                    int i14 = this.f15621c;
                    if (i14 <= 100) {
                        str2 = Integer.toString(i14);
                    } else {
                        str2 = "";
                    }
                    r6Var3.t(str2, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.f15620b) {
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
        this.f15622f = alVar;
        this.f15621c = 960;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f32121b = 5;
        r6Var.setCallback(this);
    }

    public a1(i9 i9Var, Activity activity) {
        super(activity);
        this.f15622f = i9Var;
        this.f15621c = 960;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f32121b = 5;
        r6Var.setCallback(this);
    }
}
