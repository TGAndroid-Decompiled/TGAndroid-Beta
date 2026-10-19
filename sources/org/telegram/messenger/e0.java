package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class e0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.q {
    public final BillingController f18233a;

    public e0(BillingController billingController) {
        this.f18233a = billingController;
    }

    @Override
    public void b(c5.i iVar, List list) {
        this.f18233a.onPurchasesUpdated(iVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.f18233a.onQueriedPremiumProductDetails(iVar, list);
    }
}
