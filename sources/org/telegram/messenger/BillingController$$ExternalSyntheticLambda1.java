package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda1 implements BillingController.ProductDetailsResponseListenerLegacy, PurchasesResponseListener {
    public final BillingController f$0;

    public BillingController$$ExternalSyntheticLambda1(BillingController billingController) {
        this.f$0 = billingController;
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f$0.onQueriedPremiumProductDetails(billingResult, list);
    }

    @Override
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f$0.onPurchasesUpdated(billingResult, list);
    }
}
