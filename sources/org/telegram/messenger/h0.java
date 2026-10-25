package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;
public final class h0 implements BillingController.ProductDetailsResponseListenerLegacy, d5.p {
    public final BillingController f20214a;

    public h0(BillingController billingController) {
        this.f20214a = billingController;
    }

    @Override
    public void a(d5.i iVar, List list) {
        this.f20214a.onPurchasesUpdated(iVar, list);
    }

    @Override
    public void onProductDetailsResponse(d5.i iVar, List list) {
        this.f20214a.onQueriedPremiumProductDetails(iVar, list);
    }
}
