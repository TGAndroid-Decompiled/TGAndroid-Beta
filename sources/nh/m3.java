package nh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b70;

public final class m3 extends ClickableSpan {

    public final int f18814a;

    public final hh.a0 f18815b;

    public final s3 f18816c;

    public m3(s3 s3Var, int i10, hh.a0 a0Var) {
        this.f18816c = s3Var;
        this.f18814a = i10;
        this.f18815b = a0Var;
    }

    @Override
    public final void onClick(View view) {
        b70 b70VarH = b70.H(this.f18816c, view);
        int i10 = this.f18814a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final hh.a0 a0Var = this.f18815b;
        b70VarH.i(new Runnable() {
            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        hh.a0 a0Var2 = a0Var;
                        if (a0Var2.f8939g != 3) {
                            a0Var2.f8939g = 3;
                            a0Var2.f8936c = 0;
                            a0Var2.d = false;
                            a0Var2.f8940i = false;
                            a0Var2.f8938f = 0L;
                            a0Var2.f8941j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                        }
                        break;
                    case 1:
                        hh.a0 a0Var3 = a0Var;
                        if (a0Var3.f8939g != 2) {
                            a0Var3.f8939g = 2;
                            a0Var3.f8936c = 0;
                            a0Var3.d = false;
                            a0Var3.f8940i = false;
                            a0Var3.f8938f = 0L;
                            a0Var3.f8941j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                        }
                        break;
                    default:
                        hh.a0 a0Var4 = a0Var;
                        if (a0Var4.f8939g != 1) {
                            a0Var4.f8939g = 1;
                            a0Var4.f8936c = 0;
                            a0Var4.d = false;
                            a0Var4.f8940i = false;
                            a0Var4.f8938f = 0L;
                            a0Var4.f8941j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                        }
                        break;
                }
            }
        }, string, z10);
        final int i12 = 1;
        b70VarH.i(new Runnable() {
            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        hh.a0 a0Var2 = a0Var;
                        if (a0Var2.f8939g != 3) {
                            a0Var2.f8939g = 3;
                            a0Var2.f8936c = 0;
                            a0Var2.d = false;
                            a0Var2.f8940i = false;
                            a0Var2.f8938f = 0L;
                            a0Var2.f8941j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                        }
                        break;
                    case 1:
                        hh.a0 a0Var3 = a0Var;
                        if (a0Var3.f8939g != 2) {
                            a0Var3.f8939g = 2;
                            a0Var3.f8936c = 0;
                            a0Var3.d = false;
                            a0Var3.f8940i = false;
                            a0Var3.f8938f = 0L;
                            a0Var3.f8941j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                        }
                        break;
                    default:
                        hh.a0 a0Var4 = a0Var;
                        if (a0Var4.f8939g != 1) {
                            a0Var4.f8939g = 1;
                            a0Var4.f8936c = 0;
                            a0Var4.d = false;
                            a0Var4.f8940i = false;
                            a0Var4.f8938f = 0L;
                            a0Var4.f8941j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        b70VarH.i(new Runnable() {
            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        hh.a0 a0Var2 = a0Var;
                        if (a0Var2.f8939g != 3) {
                            a0Var2.f8939g = 3;
                            a0Var2.f8936c = 0;
                            a0Var2.d = false;
                            a0Var2.f8940i = false;
                            a0Var2.f8938f = 0L;
                            a0Var2.f8941j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                        }
                        break;
                    case 1:
                        hh.a0 a0Var3 = a0Var;
                        if (a0Var3.f8939g != 2) {
                            a0Var3.f8939g = 2;
                            a0Var3.f8936c = 0;
                            a0Var3.d = false;
                            a0Var3.f8940i = false;
                            a0Var3.f8938f = 0L;
                            a0Var3.f8941j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                        }
                        break;
                    default:
                        hh.a0 a0Var4 = a0Var;
                        if (a0Var4.f8939g != 1) {
                            a0Var4.f8939g = 1;
                            a0Var4.f8936c = 0;
                            a0Var4.d = false;
                            a0Var4.f8940i = false;
                            a0Var4.f8938f = 0L;
                            a0Var4.f8941j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), i10 == 1);
        b70VarH.V(5);
        b70VarH.f26993t = false;
        b70VarH.f26992s = 0;
        b70VarH.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        b70VarH.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
