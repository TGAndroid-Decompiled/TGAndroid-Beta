package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class f0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final BillingController f18327a;

    public f0(BillingController billingController) {
        this.f18327a = billingController;
    }

    @Override
    public void b(c5.i iVar, List list) {
        this.f18327a.onPurchasesUpdated(iVar, list);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.f18327a.onQueriedPremiumProductDetails(iVar, list);
    }
}
