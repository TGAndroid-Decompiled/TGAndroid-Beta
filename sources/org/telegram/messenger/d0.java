package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f17617a;

    public d0(BillingController billingController) {
        this.f17617a = billingController;
    }

    @Override
    public void b(c5.h hVar, List list) {
        this.f17617a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.f17617a.onQueriedPremiumProductDetails(hVar, list);
    }
}
