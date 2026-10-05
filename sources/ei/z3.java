package ei;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b80;
public final class z3 extends ClickableSpan {
    public final int f9512a;
    public final yh.n f9513b;
    public final f4 f9514c;

    public z3(f4 f4Var, int i10, yh.n nVar) {
        this.f9514c = f4Var;
        this.f9512a = i10;
        this.f9513b = nVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        b80 H = b80.H(this.f9514c, view);
        boolean z12 = true;
        int i10 = this.f9512a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final yh.n nVar = this.f9513b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yh.n nVar2 = nVar;
                        if (nVar2.f51671g != 3) {
                            nVar2.f51671g = 3;
                            nVar2.f51668c = 0;
                            nVar2.d = false;
                            nVar2.f51672i = false;
                            nVar2.f51670f = 0L;
                            nVar2.f51673j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.n nVar3 = nVar;
                        if (nVar3.f51671g != 2) {
                            nVar3.f51671g = 2;
                            nVar3.f51668c = 0;
                            nVar3.d = false;
                            nVar3.f51672i = false;
                            nVar3.f51670f = 0L;
                            nVar3.f51673j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.n nVar4 = nVar;
                        if (nVar4.f51671g != 1) {
                            nVar4.f51671g = 1;
                            nVar4.f51668c = 0;
                            nVar4.d = false;
                            nVar4.f51672i = false;
                            nVar4.f51670f = 0L;
                            nVar4.f51673j = null;
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
                        yh.n nVar2 = nVar;
                        if (nVar2.f51671g != 3) {
                            nVar2.f51671g = 3;
                            nVar2.f51668c = 0;
                            nVar2.d = false;
                            nVar2.f51672i = false;
                            nVar2.f51670f = 0L;
                            nVar2.f51673j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.n nVar3 = nVar;
                        if (nVar3.f51671g != 2) {
                            nVar3.f51671g = 2;
                            nVar3.f51668c = 0;
                            nVar3.d = false;
                            nVar3.f51672i = false;
                            nVar3.f51670f = 0L;
                            nVar3.f51673j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.n nVar4 = nVar;
                        if (nVar4.f51671g != 1) {
                            nVar4.f51671g = 1;
                            nVar4.f51668c = 0;
                            nVar4.d = false;
                            nVar4.f51672i = false;
                            nVar4.f51670f = 0L;
                            nVar4.f51673j = null;
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
                        yh.n nVar2 = nVar;
                        if (nVar2.f51671g != 3) {
                            nVar2.f51671g = 3;
                            nVar2.f51668c = 0;
                            nVar2.d = false;
                            nVar2.f51672i = false;
                            nVar2.f51670f = 0L;
                            nVar2.f51673j = null;
                            nVar2.h = false;
                            nVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        yh.n nVar3 = nVar;
                        if (nVar3.f51671g != 2) {
                            nVar3.f51671g = 2;
                            nVar3.f51668c = 0;
                            nVar3.d = false;
                            nVar3.f51672i = false;
                            nVar3.f51670f = 0L;
                            nVar3.f51673j = null;
                            nVar3.h = false;
                            nVar3.a();
                            return;
                        }
                        return;
                    default:
                        yh.n nVar4 = nVar;
                        if (nVar4.f51671g != 1) {
                            nVar4.f51671g = 1;
                            nVar4.f51668c = 0;
                            nVar4.d = false;
                            nVar4.f51672i = false;
                            nVar4.f51670f = 0L;
                            nVar4.f51673j = null;
                            nVar4.h = false;
                            nVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f24886t = false;
        H.f24885s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
