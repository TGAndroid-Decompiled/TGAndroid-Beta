package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class e0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.q {
    public final BillingController f18227a;

    public e0(BillingController billingController) {
        this.f18227a = billingController;
    }

    @Override
    public void b(c5.i iVar, List list) {
        this.f18227a.onPurchasesUpdated(iVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.f18227a.onQueriedPremiumProductDetails(iVar, list);
    }
}
