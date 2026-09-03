package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class e0 implements BillingController.ProductDetailsResponseListenerLegacy, p2.n {
    public final BillingController f18531a;

    public e0(BillingController billingController) {
        this.f18531a = billingController;
    }

    @Override
    public void b(p2.h hVar, List list) {
        this.f18531a.onPurchasesUpdated(hVar, list);
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        this.f18531a.onQueriedPremiumProductDetails(hVar, list);
    }
}
