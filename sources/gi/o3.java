package gi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i80;
public final class o3 extends ClickableSpan {
    public final int f11372a;
    public final ai.i0 f11373b;
    public final u3 f11374c;

    public o3(u3 u3Var, int i10, ai.i0 i0Var) {
        this.f11374c = u3Var;
        this.f11372a = i10;
        this.f11373b = i0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        i80 H = i80.H(this.f11374c, view);
        boolean z12 = true;
        int i10 = this.f11372a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final ai.i0 i0Var = this.f11373b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        ai.i0 i0Var2 = i0Var;
                        if (i0Var2.f1457g != 3) {
                            i0Var2.f1457g = 3;
                            i0Var2.f1455c = 0;
                            i0Var2.d = false;
                            i0Var2.f1458i = false;
                            i0Var2.f1456f = 0L;
                            i0Var2.f1459j = null;
                            i0Var2.h = false;
                            i0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        ai.i0 i0Var3 = i0Var;
                        if (i0Var3.f1457g != 2) {
                            i0Var3.f1457g = 2;
                            i0Var3.f1455c = 0;
                            i0Var3.d = false;
                            i0Var3.f1458i = false;
                            i0Var3.f1456f = 0L;
                            i0Var3.f1459j = null;
                            i0Var3.h = false;
                            i0Var3.a();
                            return;
                        }
                        return;
                    default:
                        ai.i0 i0Var4 = i0Var;
                        if (i0Var4.f1457g != 1) {
                            i0Var4.f1457g = 1;
                            i0Var4.f1455c = 0;
                            i0Var4.d = false;
                            i0Var4.f1458i = false;
                            i0Var4.f1456f = 0L;
                            i0Var4.f1459j = null;
                            i0Var4.h = false;
                            i0Var4.a();
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
                        ai.i0 i0Var2 = i0Var;
                        if (i0Var2.f1457g != 3) {
                            i0Var2.f1457g = 3;
                            i0Var2.f1455c = 0;
                            i0Var2.d = false;
                            i0Var2.f1458i = false;
                            i0Var2.f1456f = 0L;
                            i0Var2.f1459j = null;
                            i0Var2.h = false;
                            i0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        ai.i0 i0Var3 = i0Var;
                        if (i0Var3.f1457g != 2) {
                            i0Var3.f1457g = 2;
                            i0Var3.f1455c = 0;
                            i0Var3.d = false;
                            i0Var3.f1458i = false;
                            i0Var3.f1456f = 0L;
                            i0Var3.f1459j = null;
                            i0Var3.h = false;
                            i0Var3.a();
                            return;
                        }
                        return;
                    default:
                        ai.i0 i0Var4 = i0Var;
                        if (i0Var4.f1457g != 1) {
                            i0Var4.f1457g = 1;
                            i0Var4.f1455c = 0;
                            i0Var4.d = false;
                            i0Var4.f1458i = false;
                            i0Var4.f1456f = 0L;
                            i0Var4.f1459j = null;
                            i0Var4.h = false;
                            i0Var4.a();
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
                        ai.i0 i0Var2 = i0Var;
                        if (i0Var2.f1457g != 3) {
                            i0Var2.f1457g = 3;
                            i0Var2.f1455c = 0;
                            i0Var2.d = false;
                            i0Var2.f1458i = false;
                            i0Var2.f1456f = 0L;
                            i0Var2.f1459j = null;
                            i0Var2.h = false;
                            i0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        ai.i0 i0Var3 = i0Var;
                        if (i0Var3.f1457g != 2) {
                            i0Var3.f1457g = 2;
                            i0Var3.f1455c = 0;
                            i0Var3.d = false;
                            i0Var3.f1458i = false;
                            i0Var3.f1456f = 0L;
                            i0Var3.f1459j = null;
                            i0Var3.h = false;
                            i0Var3.a();
                            return;
                        }
                        return;
                    default:
                        ai.i0 i0Var4 = i0Var;
                        if (i0Var4.f1457g != 1) {
                            i0Var4.f1457g = 1;
                            i0Var4.f1455c = 0;
                            i0Var4.d = false;
                            i0Var4.f1458i = false;
                            i0Var4.f1456f = 0L;
                            i0Var4.f1459j = null;
                            i0Var4.h = false;
                            i0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f27135t = false;
        H.f27134s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
