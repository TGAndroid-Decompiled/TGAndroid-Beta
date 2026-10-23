package ai;

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
public final class f8 implements RequestDelegate {
    public final int f1299a;
    public final Object f1300b;
    public final Object f1301c;
    public final Object d;
    public final List e;
    public final Object f1302f;
    public final Object f1303g;

    public f8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i10) {
        this.f1299a = i10;
        this.f1300b = obj;
        this.f1301c = obj2;
        this.f1302f = obj3;
        this.d = obj4;
        this.f1303g = obj5;
        this.e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1299a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m8(tLObject, (c5.p) this.f1300b, (c5.i) this.f1301c, (org.telegram.ui.Wallet.r1) this.f1302f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1303g, this.e, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m8(tLObject, (c5.p) this.f1300b, (c5.i) this.f1301c, (uc) this.f1302f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f1303g, this.e, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m8((UserInfoActivity) this.f1300b, tL_error, (TLObject) this.f1301c, (TL_account.TL_birthday) this.f1302f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f1303g, (ArrayList) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new m8(tL_error, (Utilities.Callback) ((ug.t) this.f1300b), tLObject, this.e, (c5.i) this.f1301c, (Utilities.Callback) ((ug.t) this.f1302f), (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1303g), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m8(tL_error, (Utilities.Callback) this.f1300b, tLObject, this.e, (c5.i) this.f1301c, (Utilities.Callback) this.f1302f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1303g), 10));
                return;
        }
    }

    public f8(Utilities.Callback callback, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f1299a = i10;
        this.f1300b = callback;
        this.e = list;
        this.f1301c = iVar;
        this.f1302f = callback2;
        this.d = o2Var;
        this.f1303g = inputStorePaymentPurpose;
    }
}
