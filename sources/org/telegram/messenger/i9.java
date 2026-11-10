package org.telegram.messenger;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
public abstract class i9 {
    public static db.a f23132a;

    public static org.telegram.messenger.d1 a(android.content.Context r8, db.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i9.a(android.content.Context, db.c):org.telegram.messenger.d1");
    }

    public static int b(Context context, int i7) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                return SubscriptionManager.getSubscriptionId(i7);
            }
            boolean z9 = false;
            SubscriptionInfo subscriptionInfo = null;
            int[] subscriptionIds = null;
            if (i10 >= 29) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                if (subscriptionManager != null) {
                    subscriptionIds = subscriptionManager.getSubscriptionIds(i7);
                }
                if (subscriptionIds != null && subscriptionIds.length > 0) {
                    return subscriptionIds[0];
                }
            } else {
                if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    z9 = true;
                }
                if (z9) {
                    SubscriptionManager subscriptionManager2 = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                    if (subscriptionManager2 != null) {
                        subscriptionInfo = subscriptionManager2.getActiveSubscriptionInfoForSimSlotIndex(i7);
                    }
                    if (subscriptionInfo != null) {
                        return subscriptionInfo.getSubscriptionId();
                    }
                }
            }
            return -1;
        } catch (Exception e10) {
            a8.g(e10, true);
            return -1;
        }
    }
}
