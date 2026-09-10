package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f14954a;

    public d0(BillingController billingController) {
        this.f14954a = billingController;
    }

    @Override
    public void a(c5.h hVar, List list) {
        this.f14954a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.f14954a.onQueriedPremiumProductDetails(hVar, list);
    }
}
