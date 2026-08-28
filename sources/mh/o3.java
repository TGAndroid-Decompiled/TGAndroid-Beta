package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.x60;
public final class o3 extends ClickableSpan {
    public final int f18019a;
    public final gh.a0 f18020b;
    public final u3 f18021c;

    public o3(u3 u3Var, int i9, gh.a0 a0Var) {
        this.f18021c = u3Var;
        this.f18019a = i9;
        this.f18020b = a0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        x60 H = x60.H(this.f18021c, view);
        boolean z12 = true;
        int i9 = this.f18019a;
        if (i9 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final gh.a0 a0Var = this.f18020b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        gh.a0 a0Var2 = a0Var;
                        if (a0Var2.f7767g != 3) {
                            a0Var2.f7767g = 3;
                            a0Var2.f7764c = 0;
                            a0Var2.d = false;
                            a0Var2.f7768i = false;
                            a0Var2.f7766f = 0L;
                            a0Var2.f7769j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        gh.a0 a0Var3 = a0Var;
                        if (a0Var3.f7767g != 2) {
                            a0Var3.f7767g = 2;
                            a0Var3.f7764c = 0;
                            a0Var3.d = false;
                            a0Var3.f7768i = false;
                            a0Var3.f7766f = 0L;
                            a0Var3.f7769j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                            return;
                        }
                        return;
                    default:
                        gh.a0 a0Var4 = a0Var;
                        if (a0Var4.f7767g != 1) {
                            a0Var4.f7767g = 1;
                            a0Var4.f7764c = 0;
                            a0Var4.d = false;
                            a0Var4.f7768i = false;
                            a0Var4.f7766f = 0L;
                            a0Var4.f7769j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, string, z10);
        if (i9 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        gh.a0 a0Var2 = a0Var;
                        if (a0Var2.f7767g != 3) {
                            a0Var2.f7767g = 3;
                            a0Var2.f7764c = 0;
                            a0Var2.d = false;
                            a0Var2.f7768i = false;
                            a0Var2.f7766f = 0L;
                            a0Var2.f7769j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        gh.a0 a0Var3 = a0Var;
                        if (a0Var3.f7767g != 2) {
                            a0Var3.f7767g = 2;
                            a0Var3.f7764c = 0;
                            a0Var3.d = false;
                            a0Var3.f7768i = false;
                            a0Var3.f7766f = 0L;
                            a0Var3.f7769j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                            return;
                        }
                        return;
                    default:
                        gh.a0 a0Var4 = a0Var;
                        if (a0Var4.f7767g != 1) {
                            a0Var4.f7767g = 1;
                            a0Var4.f7764c = 0;
                            a0Var4.d = false;
                            a0Var4.f7768i = false;
                            a0Var4.f7766f = 0L;
                            a0Var4.f7769j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), z11);
        if (i9 != 1) {
            z12 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        gh.a0 a0Var2 = a0Var;
                        if (a0Var2.f7767g != 3) {
                            a0Var2.f7767g = 3;
                            a0Var2.f7764c = 0;
                            a0Var2.d = false;
                            a0Var2.f7768i = false;
                            a0Var2.f7766f = 0L;
                            a0Var2.f7769j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                            return;
                        }
                        return;
                    case 1:
                        gh.a0 a0Var3 = a0Var;
                        if (a0Var3.f7767g != 2) {
                            a0Var3.f7767g = 2;
                            a0Var3.f7764c = 0;
                            a0Var3.d = false;
                            a0Var3.f7768i = false;
                            a0Var3.f7766f = 0L;
                            a0Var3.f7769j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                            return;
                        }
                        return;
                    default:
                        gh.a0 a0Var4 = a0Var;
                        if (a0Var4.f7767g != 1) {
                            a0Var4.f7767g = 1;
                            a0Var4.f7764c = 0;
                            a0Var4.d = false;
                            a0Var4.f7768i = false;
                            a0Var4.f7766f = 0L;
                            a0Var4.f7769j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f34581t = false;
        H.f34580s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
