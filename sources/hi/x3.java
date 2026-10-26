package hi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k80;
public final class x3 extends ClickableSpan {
    public final int f13361a;
    public final bi.k0 f13362b;
    public final d4 f13363c;

    public x3(d4 d4Var, int i10, bi.k0 k0Var) {
        this.f13363c = d4Var;
        this.f13361a = i10;
        this.f13362b = k0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        k80 H = k80.H(this.f13363c, view);
        boolean z12 = true;
        int i10 = this.f13361a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final bi.k0 k0Var = this.f13362b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.k0 k0Var2 = k0Var;
                        if (k0Var2.f4930g != 3) {
                            k0Var2.f4930g = 3;
                            k0Var2.f4928c = 0;
                            k0Var2.d = false;
                            k0Var2.f4931i = false;
                            k0Var2.f4929f = 0L;
                            k0Var2.f4932j = null;
                            k0Var2.h = false;
                            k0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        bi.k0 k0Var3 = k0Var;
                        if (k0Var3.f4930g != 2) {
                            k0Var3.f4930g = 2;
                            k0Var3.f4928c = 0;
                            k0Var3.d = false;
                            k0Var3.f4931i = false;
                            k0Var3.f4929f = 0L;
                            k0Var3.f4932j = null;
                            k0Var3.h = false;
                            k0Var3.a();
                            return;
                        }
                        return;
                    default:
                        bi.k0 k0Var4 = k0Var;
                        if (k0Var4.f4930g != 1) {
                            k0Var4.f4930g = 1;
                            k0Var4.f4928c = 0;
                            k0Var4.d = false;
                            k0Var4.f4931i = false;
                            k0Var4.f4929f = 0L;
                            k0Var4.f4932j = null;
                            k0Var4.h = false;
                            k0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, string, z10);
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.k0 k0Var2 = k0Var;
                        if (k0Var2.f4930g != 3) {
                            k0Var2.f4930g = 3;
                            k0Var2.f4928c = 0;
                            k0Var2.d = false;
                            k0Var2.f4931i = false;
                            k0Var2.f4929f = 0L;
                            k0Var2.f4932j = null;
                            k0Var2.h = false;
                            k0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        bi.k0 k0Var3 = k0Var;
                        if (k0Var3.f4930g != 2) {
                            k0Var3.f4930g = 2;
                            k0Var3.f4928c = 0;
                            k0Var3.d = false;
                            k0Var3.f4931i = false;
                            k0Var3.f4929f = 0L;
                            k0Var3.f4932j = null;
                            k0Var3.h = false;
                            k0Var3.a();
                            return;
                        }
                        return;
                    default:
                        bi.k0 k0Var4 = k0Var;
                        if (k0Var4.f4930g != 1) {
                            k0Var4.f4930g = 1;
                            k0Var4.f4928c = 0;
                            k0Var4.d = false;
                            k0Var4.f4931i = false;
                            k0Var4.f4929f = 0L;
                            k0Var4.f4932j = null;
                            k0Var4.h = false;
                            k0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), z11);
        if (i10 != 1) {
            z12 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        bi.k0 k0Var2 = k0Var;
                        if (k0Var2.f4930g != 3) {
                            k0Var2.f4930g = 3;
                            k0Var2.f4928c = 0;
                            k0Var2.d = false;
                            k0Var2.f4931i = false;
                            k0Var2.f4929f = 0L;
                            k0Var2.f4932j = null;
                            k0Var2.h = false;
                            k0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        bi.k0 k0Var3 = k0Var;
                        if (k0Var3.f4930g != 2) {
                            k0Var3.f4930g = 2;
                            k0Var3.f4928c = 0;
                            k0Var3.d = false;
                            k0Var3.f4931i = false;
                            k0Var3.f4929f = 0L;
                            k0Var3.f4932j = null;
                            k0Var3.h = false;
                            k0Var3.a();
                            return;
                        }
                        return;
                    default:
                        bi.k0 k0Var4 = k0Var;
                        if (k0Var4.f4930g != 1) {
                            k0Var4.f4930g = 1;
                            k0Var4.f4928c = 0;
                            k0Var4.d = false;
                            k0Var4.f4931i = false;
                            k0Var4.f4929f = 0L;
                            k0Var4.f4932j = null;
                            k0Var4.h = false;
                            k0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f29869t = false;
        H.f29868s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
