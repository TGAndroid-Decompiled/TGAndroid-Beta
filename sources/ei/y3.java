package ei;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n70;
public final class y3 extends ClickableSpan {
    public final int f8753a;
    public final yh.m f8754b;
    public final e4 f8755c;

    public y3(e4 e4Var, int i10, yh.m mVar) {
        this.f8755c = e4Var;
        this.f8753a = i10;
        this.f8754b = mVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        n70 H = n70.H(this.f8755c, view);
        boolean z12 = true;
        int i10 = this.f8753a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final yh.m mVar = this.f8754b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yh.m mVar2 = mVar;
                        if (mVar2.f47454g != 3) {
                            mVar2.f47454g = 3;
                            mVar2.f47452c = 0;
                            mVar2.d = false;
                            mVar2.f47455i = false;
                            mVar2.f47453f = 0L;
                            mVar2.f47456j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f47454g != 2) {
                            mVar3.f47454g = 2;
                            mVar3.f47452c = 0;
                            mVar3.d = false;
                            mVar3.f47455i = false;
                            mVar3.f47453f = 0L;
                            mVar3.f47456j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f47454g != 1) {
                            mVar4.f47454g = 1;
                            mVar4.f47452c = 0;
                            mVar4.d = false;
                            mVar4.f47455i = false;
                            mVar4.f47453f = 0L;
                            mVar4.f47456j = null;
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
                        if (mVar2.f47454g != 3) {
                            mVar2.f47454g = 3;
                            mVar2.f47452c = 0;
                            mVar2.d = false;
                            mVar2.f47455i = false;
                            mVar2.f47453f = 0L;
                            mVar2.f47456j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f47454g != 2) {
                            mVar3.f47454g = 2;
                            mVar3.f47452c = 0;
                            mVar3.d = false;
                            mVar3.f47455i = false;
                            mVar3.f47453f = 0L;
                            mVar3.f47456j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f47454g != 1) {
                            mVar4.f47454g = 1;
                            mVar4.f47452c = 0;
                            mVar4.d = false;
                            mVar4.f47455i = false;
                            mVar4.f47453f = 0L;
                            mVar4.f47456j = null;
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
                        if (mVar2.f47454g != 3) {
                            mVar2.f47454g = 3;
                            mVar2.f47452c = 0;
                            mVar2.d = false;
                            mVar2.f47455i = false;
                            mVar2.f47453f = 0L;
                            mVar2.f47456j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f47454g != 2) {
                            mVar3.f47454g = 2;
                            mVar3.f47452c = 0;
                            mVar3.d = false;
                            mVar3.f47455i = false;
                            mVar3.f47453f = 0L;
                            mVar3.f47456j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f47454g != 1) {
                            mVar4.f47454g = 1;
                            mVar4.f47452c = 0;
                            mVar4.d = false;
                            mVar4.f47455i = false;
                            mVar4.f47453f = 0L;
                            mVar4.f47456j = null;
                            mVar4.h = false;
                            mVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f26385t = false;
        H.f26384s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
