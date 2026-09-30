package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f16178a;

    public d0(BillingController billingController) {
        this.f16178a = billingController;
    }

    @Override
    public void a(c5.h hVar, List list) {
        this.f16178a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.f16178a.onQueriedPremiumProductDetails(hVar, list);
    }
}
