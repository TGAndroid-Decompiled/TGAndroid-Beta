package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, p2.m {
    public final BillingController f19987a;

    public d0(BillingController billingController) {
        this.f19987a = billingController;
    }

    @Override
    public void b(p2.g gVar, List list) {
        this.f19987a.onPurchasesUpdated(gVar, list);
    }

    @Override
    public void onProductDetailsResponse(p2.g gVar, List list) {
        this.f19987a.onQueriedPremiumProductDetails(gVar, list);
    }
}
