package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda1 implements BillingController.ProductDetailsResponseListenerLegacy {
    public final BillingController f$0;

    public BillingController$$ExternalSyntheticLambda1(BillingController billingController) {
        this.f$0 = billingController;
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f$0.onQueriedPremiumProductDetails(billingResult, list);
    }
}
