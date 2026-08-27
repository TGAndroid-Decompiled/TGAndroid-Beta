package hh;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;

public final class g6 implements Runnable {

    public final int f9321a = 1;

    public final u7 f9322b;

    public final TLObject f9323c;
    public final TLRPC.TL_error d;

    public final Utilities.Callback2 f9324e;

    public final Context f9325f;
    public final org.telegram.ui.ActionBar.c6 h;

    public final long f9326n;

    public final String f9327r;

    public final long f9328s;
    public final TLObject v;

    public final TLObject f9329w;

    public g6(u7 u7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9322b = u7Var;
        this.f9323c = tLObject;
        this.d = tL_error;
        this.f9324e = callback2;
        this.f9325f = context;
        this.h = c6Var;
        this.f9326n = j10;
        this.f9327r = str;
        this.f9328s = j11;
        this.v = tLObject2;
        this.f9329w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        pa0 pa0Var;
        pa0 pa0Var2;
        switch (this.f9321a) {
            case 0:
                u7 u7Var = this.f9322b;
                TLObject tLObject = this.f9323c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f9324e;
                Context context = this.f9325f;
                org.telegram.ui.ActionBar.c6 c6Var = this.h;
                long j10 = this.f9326n;
                String str = this.f9327r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f9329w;
                long j11 = this.f9328s;
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                mc mcVarX = (n2VarR == null || n2VarR.visibleDialog != null) ? mc.X() : mc.a0(n2VarR);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(u7Var.f10151a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            u7.e0(context, c6Var);
                        } else {
                            boolean[] zArr = {false};
                            ea eaVar = new ea(context, c6Var, j10, 6, str, new p2(u7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                            eaVar.setOnDismissListener(new i6(callback2, zArr, 2));
                            eaVar.show();
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, mcVarX, R.raw.error, 36);
                    }
                    break;
                } else {
                    Utilities.stageQueue.postRunnable(new h6(u7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    u7Var.D = false;
                    u7Var.E = true;
                    u7Var.G = 0L;
                    u7Var.V();
                    u7Var.Q(j11);
                    u7Var.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(u7Var.f10151a).contains(j11)) {
                        MessagesController.getInstance(u7Var.f10151a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    MessagesController.getInstance(u7Var.f10151a).getMainSettings().edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null && (pa0Var = launchActivity.f35535t0) != null) {
                        pa0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                u7 u7Var2 = this.f9322b;
                TLObject tLObject2 = this.f9323c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback3 = this.f9324e;
                Context context2 = this.f9325f;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                long j12 = this.f9326n;
                String str2 = this.f9327r;
                long j13 = this.f9328s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f9329w;
                org.telegram.ui.ActionBar.n2 n2VarR2 = LaunchActivity.R();
                mc mcVarX2 = (n2VarR2 == null || n2VarR2.visibleDialog != null) ? mc.X() : mc.a0(n2VarR2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(u7Var2.f10151a).starsPurchaseAvailable()) {
                            callback3.run(Boolean.FALSE, null);
                            u7.e0(context2, c6Var2);
                        } else {
                            boolean[] zArr2 = {false};
                            ea eaVar2 = new ea(context2, c6Var2, j12, 6, str2, new p2(u7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback3), 0L);
                            eaVar2.setOnDismissListener(new i6(callback3, zArr2, 1));
                            eaVar2.show();
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback3.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    } else {
                        callback3.run(Boolean.FALSE, null);
                        org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, mcVarX2, R.raw.error, 36);
                    }
                    break;
                } else {
                    Utilities.stageQueue.postRunnable(new h6(u7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    u7Var2.T(true);
                    callback3.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(u7Var2.f10151a).contains(j13)) {
                        MessagesController.getInstance(u7Var2.f10151a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    MessagesController.getInstance(u7Var2.f10151a).getMainSettings().edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.C1;
                    if (launchActivity2 != null && (pa0Var2 = launchActivity2.f35535t0) != null) {
                        pa0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public g6(u7 u7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f9322b = u7Var;
        this.f9323c = tLObject;
        this.d = tL_error;
        this.f9324e = callback2;
        this.f9325f = context;
        this.h = c6Var;
        this.f9326n = j10;
        this.f9327r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f9329w = starGift;
        this.f9328s = j11;
    }
}
