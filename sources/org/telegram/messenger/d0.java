package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f17462a;

    public d0(BillingController billingController) {
        this.f17462a = billingController;
    }

    @Override
    public void b(c5.h hVar, List list) {
        this.f17462a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.f17462a.onQueriedPremiumProductDetails(hVar, list);
    }
}
