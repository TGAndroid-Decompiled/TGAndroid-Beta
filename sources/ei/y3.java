package ei;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p80;
public final class y3 extends ClickableSpan {
    public final int f9510a;
    public final yh.m f9511b;
    public final e4 f9512c;

    public y3(e4 e4Var, int i10, yh.m mVar) {
        this.f9512c = e4Var;
        this.f9510a = i10;
        this.f9511b = mVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        p80 H = p80.H(this.f9512c, view);
        boolean z12 = true;
        int i10 = this.f9510a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final yh.m mVar = this.f9511b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yh.m mVar2 = mVar;
                        if (mVar2.f52856g != 3) {
                            mVar2.f52856g = 3;
                            mVar2.f52853c = 0;
                            mVar2.d = false;
                            mVar2.f52857i = false;
                            mVar2.f52855f = 0L;
                            mVar2.f52858j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f52856g != 2) {
                            mVar3.f52856g = 2;
                            mVar3.f52853c = 0;
                            mVar3.d = false;
                            mVar3.f52857i = false;
                            mVar3.f52855f = 0L;
                            mVar3.f52858j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f52856g != 1) {
                            mVar4.f52856g = 1;
                            mVar4.f52853c = 0;
                            mVar4.d = false;
                            mVar4.f52857i = false;
                            mVar4.f52855f = 0L;
                            mVar4.f52858j = null;
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
                        if (mVar2.f52856g != 3) {
                            mVar2.f52856g = 3;
                            mVar2.f52853c = 0;
                            mVar2.d = false;
                            mVar2.f52857i = false;
                            mVar2.f52855f = 0L;
                            mVar2.f52858j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f52856g != 2) {
                            mVar3.f52856g = 2;
                            mVar3.f52853c = 0;
                            mVar3.d = false;
                            mVar3.f52857i = false;
                            mVar3.f52855f = 0L;
                            mVar3.f52858j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f52856g != 1) {
                            mVar4.f52856g = 1;
                            mVar4.f52853c = 0;
                            mVar4.d = false;
                            mVar4.f52857i = false;
                            mVar4.f52855f = 0L;
                            mVar4.f52858j = null;
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
                        if (mVar2.f52856g != 3) {
                            mVar2.f52856g = 3;
                            mVar2.f52853c = 0;
                            mVar2.d = false;
                            mVar2.f52857i = false;
                            mVar2.f52855f = 0L;
                            mVar2.f52858j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f52856g != 2) {
                            mVar3.f52856g = 2;
                            mVar3.f52853c = 0;
                            mVar3.d = false;
                            mVar3.f52857i = false;
                            mVar3.f52855f = 0L;
                            mVar3.f52858j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f52856g != 1) {
                            mVar4.f52856g = 1;
                            mVar4.f52853c = 0;
                            mVar4.d = false;
                            mVar4.f52857i = false;
                            mVar4.f52855f = 0L;
                            mVar4.f52858j = null;
                            mVar4.h = false;
                            mVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f29790t = false;
        H.f29789s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
