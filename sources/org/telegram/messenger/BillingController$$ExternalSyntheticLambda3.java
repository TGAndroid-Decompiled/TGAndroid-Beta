package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda3 implements ProductDetailsResponseListener {
    public final BillingController f$0;

    public BillingController$$ExternalSyntheticLambda3(BillingController billingController) {
        this.f$0 = billingController;
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        BillingController.$r8$lambda$u3eoWsyAOzUwIiUdGHizRuGgAaQ(this.f$0, billingResult, list);
    }
}
