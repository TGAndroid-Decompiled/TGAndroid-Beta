package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class f0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.q {
    public final BillingController f17200a;

    public f0(BillingController billingController) {
        this.f17200a = billingController;
    }

    @Override
    public void b(c5.i iVar, List list) {
        this.f17200a.onPurchasesUpdated(iVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.f17200a.onQueriedPremiumProductDetails(iVar, list);
    }
}
