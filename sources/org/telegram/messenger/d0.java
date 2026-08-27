package org.telegram.messenger;

import java.util.List;

public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, n2.m {

    public final BillingController f20004a;

    public d0(BillingController billingController) {
        this.f20004a = billingController;
    }

    @Override
    public void c(n2.g gVar, List list) {
        this.f20004a.onPurchasesUpdated(gVar, list);
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        this.f20004a.onQueriedPremiumProductDetails(gVar, list);
    }
}
