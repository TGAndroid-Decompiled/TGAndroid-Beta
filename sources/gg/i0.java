package gg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class i0 implements RequestDelegate {
    public final int f6652a;
    public final Object f6653b;
    public final Object f6654c;
    public final Object d;
    public final Object e;
    public final Object f6655f;
    public final Object f6656g;

    public i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6652a = i10;
        this.e = obj;
        this.f6653b = obj2;
        this.f6654c = obj3;
        this.f6655f = obj4;
        this.d = obj5;
        this.f6656g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6652a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (t0) this.e, tLObject, (List) this.f6653b, (p2.h) this.f6654c, (t0) this.f6655f, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f6656g, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.e, tLObject, (List) this.f6653b, (p2.h) this.f6654c, (Utilities.Callback) this.f6655f, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f6656g, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (p2.n) this.e, (p2.h) this.f6654c, (Utilities.Callback2) ((dh.v) this.f6655f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) this.f6656g), (List) this.f6653b, tL_error, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (p2.n) this.e, (p2.h) this.f6654c, (Utilities.Callback2) ((h5) this.f6655f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) this.f6656g), (List) this.f6653b, tL_error, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0((UserInfoActivity) this.e, tL_error, (TLObject) this.f6653b, (TL_account.TL_birthday) this.f6654c, (TLRPC.UserFull) this.f6655f, tLObject, (int[]) this.d, (ArrayList) this.f6656g));
                return;
        }
    }

    public i0(p2.n nVar, p2.h hVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f6652a = i10;
        this.e = nVar;
        this.f6654c = hVar;
        this.f6655f = callback2;
        this.d = activity;
        this.f6656g = inputStorePaymentPurpose;
        this.f6653b = list;
    }
}
