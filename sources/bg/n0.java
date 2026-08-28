package bg;

import android.app.Activity;
import fh.w5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class n0 implements RequestDelegate {
    public final int f1884a;
    public final Object f1885b;
    public final Object f1886c;
    public final Object d;
    public final Object f1887e;
    public final Object f1888f;
    public final Object f1889g;

    public n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f1884a = i9;
        this.f1887e = obj;
        this.f1885b = obj2;
        this.f1886c = obj3;
        this.f1888f = obj4;
        this.d = obj5;
        this.f1889g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1884a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(tL_error, (z0) this.f1887e, tLObject, (List) this.f1885b, (n2.g) this.f1886c, (z0) this.f1888f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1889g, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p0(tL_error, (Utilities.Callback) this.f1887e, tLObject, (List) this.f1885b, (n2.g) this.f1886c, (Utilities.Callback) this.f1888f, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1889g, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new p0(tLObject, (n2.l) this.f1887e, (n2.g) this.f1886c, (Utilities.Callback2) ((y0) this.f1888f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1889g), (List) this.f1885b, tL_error, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new p0(tLObject, (n2.l) this.f1887e, (n2.g) this.f1886c, (Utilities.Callback2) ((w5) this.f1888f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) this.f1889g), (List) this.f1885b, tL_error, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p0((UserInfoActivity) this.f1887e, tL_error, (TLObject) this.f1885b, (TL_account.TL_birthday) this.f1886c, (TLRPC.UserFull) this.f1888f, tLObject, (int[]) this.d, (ArrayList) this.f1889g));
                return;
        }
    }

    public n0(n2.l lVar, n2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i9) {
        this.f1884a = i9;
        this.f1887e = lVar;
        this.f1886c = gVar;
        this.f1888f = callback2;
        this.d = activity;
        this.f1889g = inputStorePaymentPurpose;
        this.f1885b = list;
    }
}
