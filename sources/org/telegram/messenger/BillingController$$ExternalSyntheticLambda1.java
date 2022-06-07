package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda1 implements ProductDetailsResponseListener {
    public static final BillingController$$ExternalSyntheticLambda1 INSTANCE = new BillingController$$ExternalSyntheticLambda1();

    private BillingController$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        BillingController.lambda$onBillingSetupFinished$4(billingResult, list);
    }
}
