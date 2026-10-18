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
public final class e8 implements RequestDelegate {
    public final int f1249a;
    public final Object f1250b;
    public final Object f1251c;
    public final Object d;
    public final List e;
    public final Object f1252f;
    public final Object f1253g;

    public e8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i10) {
        this.f1249a = i10;
        this.f1250b = obj;
        this.f1251c = obj2;
        this.f1252f = obj3;
        this.d = obj4;
        this.f1253g = obj5;
        this.e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1249a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l8(tLObject, (c5.o) this.f1250b, (c5.i) this.f1251c, (org.telegram.ui.Wallet.s1) this.f1252f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1253g, this.e, tL_error, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l8(tLObject, (c5.o) this.f1250b, (c5.i) this.f1251c, (tc) this.f1252f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f1253g, this.e, tL_error, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new l8((UserInfoActivity) this.f1250b, tL_error, (TLObject) this.f1251c, (TL_account.TL_birthday) this.f1252f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f1253g, (ArrayList) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new l8(tL_error, (Utilities.Callback) ((ug.u) this.f1250b), tLObject, this.e, (c5.i) this.f1251c, (Utilities.Callback) ((ug.u) this.f1252f), (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1253g), 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l8(tL_error, (Utilities.Callback) this.f1250b, tLObject, this.e, (c5.i) this.f1251c, (Utilities.Callback) this.f1252f, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1253g), 10));
                return;
        }
    }

    public e8(Utilities.Callback callback, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f1249a = i10;
        this.f1250b = callback;
        this.e = list;
        this.f1251c = iVar;
        this.f1252f = callback2;
        this.d = n2Var;
        this.f1253g = inputStorePaymentPurpose;
    }
}
