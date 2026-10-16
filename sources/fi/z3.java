package fi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l80;
public final class z3 extends ClickableSpan {
    public final int f9707a;
    public final zh.n f9708b;
    public final f4 f9709c;

    public z3(f4 f4Var, int i10, zh.n nVar) {
        this.f9709c = f4Var;
        this.f9707a = i10;
        this.f9708b = nVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        l80 H = l80.H(this.f9709c, view);
        boolean z12 = true;
        int i10 = this.f9707a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final zh.n nVar = this.f9708b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        zh.n nVar2 = nVar;
                        if (nVar2.f50848g != 3) {
                            nVar2.f50848g = 3;
                            nVar2.f50846c = 0;
                            nVar2.d = false;
                            nVar2.f50849i = false;
                            nVar2.f50847f = 0L;
                            nVar2.f50850j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        zh.n nVar3 = nVar;
                        if (nVar3.f50848g != 2) {
                            nVar3.f50848g = 2;
                            nVar3.f50846c = 0;
                            nVar3.d = false;
                            nVar3.f50849i = false;
                            nVar3.f50847f = 0L;
                            nVar3.f50850j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        zh.n nVar4 = nVar;
                        if (nVar4.f50848g != 1) {
                            nVar4.f50848g = 1;
                            nVar4.f50846c = 0;
                            nVar4.d = false;
                            nVar4.f50849i = false;
                            nVar4.f50847f = 0L;
                            nVar4.f50850j = null;
                            nVar4.h = false;
                            nVar4.a();
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
                        zh.n nVar2 = nVar;
                        if (nVar2.f50848g != 3) {
                            nVar2.f50848g = 3;
                            nVar2.f50846c = 0;
                            nVar2.d = false;
                            nVar2.f50849i = false;
                            nVar2.f50847f = 0L;
                            nVar2.f50850j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        zh.n nVar3 = nVar;
                        if (nVar3.f50848g != 2) {
                            nVar3.f50848g = 2;
                            nVar3.f50846c = 0;
                            nVar3.d = false;
                            nVar3.f50849i = false;
                            nVar3.f50847f = 0L;
                            nVar3.f50850j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        zh.n nVar4 = nVar;
                        if (nVar4.f50848g != 1) {
                            nVar4.f50848g = 1;
                            nVar4.f50846c = 0;
                            nVar4.d = false;
                            nVar4.f50849i = false;
                            nVar4.f50847f = 0L;
                            nVar4.f50850j = null;
                            nVar4.h = false;
                            nVar4.a();
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
                        zh.n nVar2 = nVar;
                        if (nVar2.f50848g != 3) {
                            nVar2.f50848g = 3;
                            nVar2.f50846c = 0;
                            nVar2.d = false;
                            nVar2.f50849i = false;
                            nVar2.f50847f = 0L;
                            nVar2.f50850j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        zh.n nVar3 = nVar;
                        if (nVar3.f50848g != 2) {
                            nVar3.f50848g = 2;
                            nVar3.f50846c = 0;
                            nVar3.d = false;
                            nVar3.f50849i = false;
                            nVar3.f50847f = 0L;
                            nVar3.f50850j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        zh.n nVar4 = nVar;
                        if (nVar4.f50848g != 1) {
                            nVar4.f50848g = 1;
                            nVar4.f50846c = 0;
                            nVar4.d = false;
                            nVar4.f50849i = false;
                            nVar4.f50847f = 0L;
                            nVar4.f50850j = null;
                            nVar4.h = false;
                            nVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f26669t = false;
        H.f26668s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
