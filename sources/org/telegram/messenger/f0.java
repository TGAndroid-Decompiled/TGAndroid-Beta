package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class f0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f17557a;

    public f0(BillingController billingController) {
        this.f17557a = billingController;
    }

    @Override
    public void a(c5.h hVar, List list) {
        this.f17557a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.f17557a.onQueriedPremiumProductDetails(hVar, list);
    }
}
