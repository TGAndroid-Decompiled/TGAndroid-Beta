package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class e0 implements BillingController.ProductDetailsResponseListenerLegacy, p2.o {
    public final BillingController f17076a;

    public e0(BillingController billingController) {
        this.f17076a = billingController;
    }

    @Override
    public void b(p2.h hVar, List list) {
        this.f17076a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        this.f17076a.onQueriedPremiumProductDetails(hVar, list);
    }
}
