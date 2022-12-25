package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda2 implements ProductDetailsResponseListener {
    public static final BillingController$$ExternalSyntheticLambda2 INSTANCE = new BillingController$$ExternalSyntheticLambda2();

    private BillingController$$ExternalSyntheticLambda2() {
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        BillingController.lambda$onBillingSetupFinished$6(billingResult, list);
    }
}
