package bi;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class b8 implements RequestDelegate {
    public final int f4378a;
    public final Object f4379b;
    public final Object f4380c;
    public final Object d;
    public final List e;
    public final Object f4381f;
    public final Object f4382g;

    public b8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i10) {
        this.f4378a = i10;
        this.f4379b = obj;
        this.f4380c = obj2;
        this.f4381f = obj3;
        this.d = obj4;
        this.f4382g = obj5;
        this.e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4378a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i8(tLObject, (d5.o) this.f4379b, (d5.i) this.f4380c, (org.telegram.ui.Wallet.r1) this.f4381f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f4382g, this.e, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i8(tLObject, (d5.o) this.f4379b, (d5.i) this.f4380c, (lc) this.f4381f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f4382g, this.e, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i8((UserInfoActivity) this.f4379b, tL_error, (TLObject) this.f4380c, (TL_account.TL_birthday) this.f4381f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f4382g, (ArrayList) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i8(tL_error, (Utilities.Callback) ((vg.v) this.f4379b), tLObject, this.e, (d5.i) this.f4380c, (Utilities.Callback) ((vg.v) this.f4381f), (org.telegram.ui.ActionBar.r2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f4382g), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i8(tL_error, (Utilities.Callback) this.f4379b, tLObject, this.e, (d5.i) this.f4380c, (Utilities.Callback) this.f4381f, (org.telegram.ui.ActionBar.r2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f4382g), 10));
                return;
        }
    }

    public b8(Utilities.Callback callback, List list, d5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f4378a = i10;
        this.f4379b = callback;
        this.e = list;
        this.f4380c = iVar;
        this.f4381f = callback2;
        this.d = r2Var;
        this.f4382g = inputStorePaymentPurpose;
    }
}
