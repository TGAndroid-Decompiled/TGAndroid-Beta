package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda0 implements ProductDetailsResponseListener {
    public static final BillingController$$ExternalSyntheticLambda0 INSTANCE = new BillingController$$ExternalSyntheticLambda0();

    private BillingController$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        BillingController.lambda$onBillingSetupFinished$2(billingResult, list);
    }
}
