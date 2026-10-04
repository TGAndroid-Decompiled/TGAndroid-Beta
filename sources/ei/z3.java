package ei;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b80;
public final class z3 extends ClickableSpan {
    public final int f9511a;
    public final yh.m f9512b;
    public final f4 f9513c;

    public z3(f4 f4Var, int i10, yh.m mVar) {
        this.f9513c = f4Var;
        this.f9511a = i10;
        this.f9512b = mVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        b80 H = b80.H(this.f9513c, view);
        boolean z12 = true;
        int i10 = this.f9511a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final yh.m mVar = this.f9512b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yh.m mVar2 = mVar;
                        if (mVar2.f51599g != 3) {
                            mVar2.f51599g = 3;
                            mVar2.f51596c = 0;
                            mVar2.d = false;
                            mVar2.f51600i = false;
                            mVar2.f51598f = 0L;
                            mVar2.f51601j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f51599g != 2) {
                            mVar3.f51599g = 2;
                            mVar3.f51596c = 0;
                            mVar3.d = false;
                            mVar3.f51600i = false;
                            mVar3.f51598f = 0L;
                            mVar3.f51601j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f51599g != 1) {
                            mVar4.f51599g = 1;
                            mVar4.f51596c = 0;
                            mVar4.d = false;
                            mVar4.f51600i = false;
                            mVar4.f51598f = 0L;
                            mVar4.f51601j = null;
                            mVar4.h = false;
                            mVar4.a();
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
                        yh.m mVar2 = mVar;
                        if (mVar2.f51599g != 3) {
                            mVar2.f51599g = 3;
                            mVar2.f51596c = 0;
                            mVar2.d = false;
                            mVar2.f51600i = false;
                            mVar2.f51598f = 0L;
                            mVar2.f51601j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f51599g != 2) {
                            mVar3.f51599g = 2;
                            mVar3.f51596c = 0;
                            mVar3.d = false;
                            mVar3.f51600i = false;
                            mVar3.f51598f = 0L;
                            mVar3.f51601j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f51599g != 1) {
                            mVar4.f51599g = 1;
                            mVar4.f51596c = 0;
                            mVar4.d = false;
                            mVar4.f51600i = false;
                            mVar4.f51598f = 0L;
                            mVar4.f51601j = null;
                            mVar4.h = false;
                            mVar4.a();
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
                        yh.m mVar2 = mVar;
                        if (mVar2.f51599g != 3) {
                            mVar2.f51599g = 3;
                            mVar2.f51596c = 0;
                            mVar2.d = false;
                            mVar2.f51600i = false;
                            mVar2.f51598f = 0L;
                            mVar2.f51601j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f51599g != 2) {
                            mVar3.f51599g = 2;
                            mVar3.f51596c = 0;
                            mVar3.d = false;
                            mVar3.f51600i = false;
                            mVar3.f51598f = 0L;
                            mVar3.f51601j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f51599g != 1) {
                            mVar4.f51599g = 1;
                            mVar4.f51596c = 0;
                            mVar4.d = false;
                            mVar4.f51600i = false;
                            mVar4.f51598f = 0L;
                            mVar4.f51601j = null;
                            mVar4.h = false;
                            mVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f24845t = false;
        H.f24844s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
