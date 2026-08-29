package eg;

import android.app.Activity;
import ih.i5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class j0 implements RequestDelegate {
    public final int f6044a;
    public final Object f6045b;
    public final Object f6046c;
    public final Object d;
    public final Object f6047e;
    public final Object f6048f;
    public final Object f6049g;

    public j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6044a = i10;
        this.f6047e = obj;
        this.f6045b = obj2;
        this.f6046c = obj3;
        this.f6048f = obj4;
        this.d = obj5;
        this.f6049g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6044a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l0(tL_error, (u0) this.f6047e, tLObject, (List) this.f6045b, (p2.g) this.f6046c, (u0) this.f6048f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f6049g, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l0(tL_error, (Utilities.Callback) this.f6047e, tLObject, (List) this.f6045b, (p2.g) this.f6046c, (Utilities.Callback) this.f6048f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f6049g, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new l0(tLObject, (p2.l) this.f6047e, (p2.g) this.f6046c, (Utilities.Callback2) ((bh.v) this.f6048f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) this.f6049g), (List) this.f6045b, tL_error, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new l0(tLObject, (p2.l) this.f6047e, (p2.g) this.f6046c, (Utilities.Callback2) ((i5) this.f6048f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) this.f6049g), (List) this.f6045b, tL_error, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l0((UserInfoActivity) this.f6047e, tL_error, (TLObject) this.f6045b, (TL_account.TL_birthday) this.f6046c, (TLRPC.UserFull) this.f6048f, tLObject, (int[]) this.d, (ArrayList) this.f6049g));
                return;
        }
    }

    public j0(p2.l lVar, p2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f6044a = i10;
        this.f6047e = lVar;
        this.f6046c = gVar;
        this.f6048f = callback2;
        this.d = activity;
        this.f6049g = inputStorePaymentPurpose;
        this.f6045b = list;
    }
}
