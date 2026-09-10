package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.w70;
public final class b4 extends ClickableSpan {
    public final int f6545a;
    public final xh.n f6546b;
    public final h4 f6547c;

    public b4(h4 h4Var, int i10, xh.n nVar) {
        this.f6547c = h4Var;
        this.f6545a = i10;
        this.f6546b = nVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        w70 H = w70.H(this.f6547c, view);
        boolean z12 = true;
        int i10 = this.f6545a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final xh.n nVar = this.f6546b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        xh.n nVar2 = nVar;
                        if (nVar2.f45735g != 3) {
                            nVar2.f45735g = 3;
                            nVar2.f45733c = 0;
                            nVar2.d = false;
                            nVar2.f45736i = false;
                            nVar2.f45734f = 0L;
                            nVar2.f45737j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        xh.n nVar3 = nVar;
                        if (nVar3.f45735g != 2) {
                            nVar3.f45735g = 2;
                            nVar3.f45733c = 0;
                            nVar3.d = false;
                            nVar3.f45736i = false;
                            nVar3.f45734f = 0L;
                            nVar3.f45737j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        xh.n nVar4 = nVar;
                        if (nVar4.f45735g != 1) {
                            nVar4.f45735g = 1;
                            nVar4.f45733c = 0;
                            nVar4.d = false;
                            nVar4.f45736i = false;
                            nVar4.f45734f = 0L;
                            nVar4.f45737j = null;
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
                        xh.n nVar2 = nVar;
                        if (nVar2.f45735g != 3) {
                            nVar2.f45735g = 3;
                            nVar2.f45733c = 0;
                            nVar2.d = false;
                            nVar2.f45736i = false;
                            nVar2.f45734f = 0L;
                            nVar2.f45737j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        xh.n nVar3 = nVar;
                        if (nVar3.f45735g != 2) {
                            nVar3.f45735g = 2;
                            nVar3.f45733c = 0;
                            nVar3.d = false;
                            nVar3.f45736i = false;
                            nVar3.f45734f = 0L;
                            nVar3.f45737j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        xh.n nVar4 = nVar;
                        if (nVar4.f45735g != 1) {
                            nVar4.f45735g = 1;
                            nVar4.f45733c = 0;
                            nVar4.d = false;
                            nVar4.f45736i = false;
                            nVar4.f45734f = 0L;
                            nVar4.f45737j = null;
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
                        xh.n nVar2 = nVar;
                        if (nVar2.f45735g != 3) {
                            nVar2.f45735g = 3;
                            nVar2.f45733c = 0;
                            nVar2.d = false;
                            nVar2.f45736i = false;
                            nVar2.f45734f = 0L;
                            nVar2.f45737j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        xh.n nVar3 = nVar;
                        if (nVar3.f45735g != 2) {
                            nVar3.f45735g = 2;
                            nVar3.f45733c = 0;
                            nVar3.d = false;
                            nVar3.f45736i = false;
                            nVar3.f45734f = 0L;
                            nVar3.f45737j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        xh.n nVar4 = nVar;
                        if (nVar4.f45735g != 1) {
                            nVar4.f45735g = 1;
                            nVar4.f45733c = 0;
                            nVar4.d = false;
                            nVar4.f45736i = false;
                            nVar4.f45734f = 0L;
                            nVar4.f45737j = null;
                            nVar4.h = false;
                            nVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f28702t = false;
        H.f28701s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
