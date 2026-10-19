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
    public final int f1296a;
    public final Object f1297b;
    public final Object f1298c;
    public final Object d;
    public final List e;
    public final Object f1299f;
    public final Object f1300g;

    public f8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i10) {
        this.f1296a = i10;
        this.f1297b = obj;
        this.f1298c = obj2;
        this.f1299f = obj3;
        this.d = obj4;
        this.f1300g = obj5;
        this.e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1296a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m8(tLObject, (c5.p) this.f1297b, (c5.i) this.f1298c, (org.telegram.ui.Wallet.s1) this.f1299f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1300g, this.e, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m8(tLObject, (c5.p) this.f1297b, (c5.i) this.f1298c, (tc) this.f1299f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f1300g, this.e, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m8((UserInfoActivity) this.f1297b, tL_error, (TLObject) this.f1298c, (TL_account.TL_birthday) this.f1299f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f1300g, (ArrayList) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new m8(tL_error, (Utilities.Callback) ((ug.u) this.f1297b), tLObject, this.e, (c5.i) this.f1298c, (Utilities.Callback) ((ug.u) this.f1299f), (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1300g), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m8(tL_error, (Utilities.Callback) this.f1297b, tLObject, this.e, (c5.i) this.f1298c, (Utilities.Callback) this.f1299f, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1300g), 10));
                return;
        }
    }

    public f8(Utilities.Callback callback, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f1296a = i10;
        this.f1297b = callback;
        this.e = list;
        this.f1298c = iVar;
        this.f1299f = callback2;
        this.d = n2Var;
        this.f1300g = inputStorePaymentPurpose;
    }
}
