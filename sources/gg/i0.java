package gg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kh.i5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class i0 implements RequestDelegate {
    public final int f6665a;
    public final Object f6666b;
    public final Object f6667c;
    public final Object d;
    public final Object e;
    public final Object f6668f;
    public final Object f6669g;

    public i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6665a = i10;
        this.e = obj;
        this.f6666b = obj2;
        this.f6667c = obj3;
        this.f6668f = obj4;
        this.d = obj5;
        this.f6669g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6665a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (t0) this.e, tLObject, (List) this.f6666b, (p2.h) this.f6667c, (t0) this.f6668f, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f6669g, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.e, tLObject, (List) this.f6666b, (p2.h) this.f6667c, (Utilities.Callback) this.f6668f, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f6669g, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (p2.n) this.e, (p2.h) this.f6667c, (Utilities.Callback2) ((dh.v) this.f6668f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) this.f6669g), (List) this.f6666b, tL_error, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (p2.n) this.e, (p2.h) this.f6667c, (Utilities.Callback2) ((i5) this.f6668f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) this.f6669g), (List) this.f6666b, tL_error, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0((UserInfoActivity) this.e, tL_error, (TLObject) this.f6666b, (TL_account.TL_birthday) this.f6667c, (TLRPC.UserFull) this.f6668f, tLObject, (int[]) this.d, (ArrayList) this.f6669g));
                return;
        }
    }

    public i0(p2.n nVar, p2.h hVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f6665a = i10;
        this.e = nVar;
        this.f6667c = hVar;
        this.f6668f = callback2;
        this.d = activity;
        this.f6669g = inputStorePaymentPurpose;
        this.f6666b = list;
    }
}
