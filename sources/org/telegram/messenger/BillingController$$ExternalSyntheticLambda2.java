package org.telegram.messenger;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import java.util.List;

public final class BillingController$$ExternalSyntheticLambda2 implements ProductDetailsResponseListener {
    public final BillingController f$0;

    public BillingController$$ExternalSyntheticLambda2(BillingController billingController) {
        this.f$0 = billingController;
    }

    @Override
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        BillingController.m174$r8$lambda$cekiSqMCb909zQh6w2CpEt3xZs(this.f$0, billingResult, list);
    }
}
