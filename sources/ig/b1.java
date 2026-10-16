package ig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Wallet.j8;
public final class b1 extends EditTextBoldCursor {
    public final int f11447b = 0;
    public int f11448c;
    public final j5 d;
    public final r6 e;
    public final NotificationCenter.NotificationCenterDelegate f11449f;

    public b1(e1 e1Var, Activity activity) {
        super(activity);
        this.f11449f = e1Var;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f28435b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        switch (this.f11447b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.f11448c < 0) {
                    i10 = g6.f19822p7;
                } else {
                    i10 = g6.P5;
                }
                int a2 = this.d.a(g6.w0(i10, ((e1) this.f11449f).getResourceProvider()), false);
                r6 r6Var = this.e;
                r6Var.u(a2);
                r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                r6Var.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.f11448c <= 0) {
                    i11 = g6.f19822p7;
                } else {
                    i11 = g6.P5;
                }
                int a10 = this.d.a(g6.w0(i11, ((cl) this.f11449f).f27359a), false);
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
                if (this.f11448c <= 0) {
                    i12 = g6.f19822p7;
                } else {
                    i12 = g6.P5;
                }
                int a11 = this.d.a(g6.w0(i12, ((j8) this.f11449f).getResourceProvider()), false);
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
        switch (this.f11447b) {
            case 0:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var = this.e;
                if (r6Var != null) {
                    this.f11448c = 96 - charSequence.length();
                    r6Var.a();
                    String str3 = "";
                    if (this.f11448c <= 12) {
                        str3 = "" + this.f11448c;
                    }
                    r6Var.t(str3, true, true);
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i10, i11, i12);
                r6 r6Var2 = this.e;
                if (r6Var2 != null) {
                    this.f11448c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    r6Var2.a();
                    int i13 = this.f11448c;
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
                    this.f11448c = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    r6Var3.a();
                    int i14 = this.f11448c;
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
        switch (this.f11447b) {
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

    public b1(cl clVar, Context context) {
        super(context);
        this.f11449f = clVar;
        this.f11448c = 960;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f28435b = 5;
        r6Var.setCallback(this);
    }

    public b1(j8 j8Var, Activity activity) {
        super(activity);
        this.f11449f = j8Var;
        this.f11448c = 960;
        this.d = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.f28435b = 5;
        r6Var.setCallback(this);
    }
}
