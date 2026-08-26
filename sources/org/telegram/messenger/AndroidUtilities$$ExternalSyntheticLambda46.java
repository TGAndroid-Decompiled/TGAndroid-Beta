package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.RecyclerListView;

public final class AndroidUtilities$$ExternalSyntheticLambda46 implements RecyclerListView.IntReturnCallback, ConsumeResponseListener {
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public AndroidUtilities$$ExternalSyntheticLambda46(Object obj, Object obj2, Object obj3) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public void onConsumeResponse(BillingResult billingResult, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f$0, (Purchase) this.f$1, (Runnable) this.f$2, billingResult, str);
    }

    @Override
    public int run() {
        return AndroidUtilities.lambda$scrollToFragmentRow$24((BaseFragment) this.f$0, (String) this.f$1, (RecyclerListView) this.f$2);
    }
}
