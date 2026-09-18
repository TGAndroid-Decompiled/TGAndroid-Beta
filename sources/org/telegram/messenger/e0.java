package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class e0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f16186a;

    public e0(BillingController billingController) {
        this.f16186a = billingController;
    }

    @Override
    public void a(c5.h hVar, List list) {
        this.f16186a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.f16186a.onQueriedPremiumProductDetails(hVar, list);
    }
}
