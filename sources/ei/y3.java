package ei;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o70;
public final class y3 extends ClickableSpan {
    public final int f8736a;
    public final yh.m f8737b;
    public final e4 f8738c;

    public y3(e4 e4Var, int i10, yh.m mVar) {
        this.f8738c = e4Var;
        this.f8736a = i10;
        this.f8737b = mVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        o70 H = o70.H(this.f8738c, view);
        boolean z12 = true;
        int i10 = this.f8736a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final yh.m mVar = this.f8737b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yh.m mVar2 = mVar;
                        if (mVar2.f47382g != 3) {
                            mVar2.f47382g = 3;
                            mVar2.f47380c = 0;
                            mVar2.d = false;
                            mVar2.f47383i = false;
                            mVar2.f47381f = 0L;
                            mVar2.f47384j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f47382g != 2) {
                            mVar3.f47382g = 2;
                            mVar3.f47380c = 0;
                            mVar3.d = false;
                            mVar3.f47383i = false;
                            mVar3.f47381f = 0L;
                            mVar3.f47384j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f47382g != 1) {
                            mVar4.f47382g = 1;
                            mVar4.f47380c = 0;
                            mVar4.d = false;
                            mVar4.f47383i = false;
                            mVar4.f47381f = 0L;
                            mVar4.f47384j = null;
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
                        if (mVar2.f47382g != 3) {
                            mVar2.f47382g = 3;
                            mVar2.f47380c = 0;
                            mVar2.d = false;
                            mVar2.f47383i = false;
                            mVar2.f47381f = 0L;
                            mVar2.f47384j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f47382g != 2) {
                            mVar3.f47382g = 2;
                            mVar3.f47380c = 0;
                            mVar3.d = false;
                            mVar3.f47383i = false;
                            mVar3.f47381f = 0L;
                            mVar3.f47384j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f47382g != 1) {
                            mVar4.f47382g = 1;
                            mVar4.f47380c = 0;
                            mVar4.d = false;
                            mVar4.f47383i = false;
                            mVar4.f47381f = 0L;
                            mVar4.f47384j = null;
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
                        if (mVar2.f47382g != 3) {
                            mVar2.f47382g = 3;
                            mVar2.f47380c = 0;
                            mVar2.d = false;
                            mVar2.f47383i = false;
                            mVar2.f47381f = 0L;
                            mVar2.f47384j = null;
                            mVar2.h = false;
                            mVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.m mVar3 = mVar;
                        if (mVar3.f47382g != 2) {
                            mVar3.f47382g = 2;
                            mVar3.f47380c = 0;
                            mVar3.d = false;
                            mVar3.f47383i = false;
                            mVar3.f47381f = 0L;
                            mVar3.f47384j = null;
                            mVar3.h = false;
                            mVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.m mVar4 = mVar;
                        if (mVar4.f47382g != 1) {
                            mVar4.f47382g = 1;
                            mVar4.f47380c = 0;
                            mVar4.d = false;
                            mVar4.f47383i = false;
                            mVar4.f47381f = 0L;
                            mVar4.f47384j = null;
                            mVar4.h = false;
                            mVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f26670t = false;
        H.f26669s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
