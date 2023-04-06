package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
public final class BillingController$$ExternalSyntheticLambda1 implements ConsumeResponseListener {
    public static final BillingController$$ExternalSyntheticLambda1 INSTANCE = new BillingController$$ExternalSyntheticLambda1();

    private BillingController$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void onConsumeResponse(BillingResult billingResult, String str) {
        BillingController.lambda$onPurchasesUpdated$3(billingResult, str);
    }
}
