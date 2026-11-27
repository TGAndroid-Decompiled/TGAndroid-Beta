package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
public abstract class dj4 {
    public static zi4 a;

    public static defpackage.mh0 a(android.content.Context r8, defpackage.vdc r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj4.a(android.content.Context, vdc):mh0");
    }

    public static int b(Context context, int i) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                return SubscriptionManager.getSubscriptionId(i);
            }
            boolean z = false;
            SubscriptionInfo subscriptionInfo = null;
            int[] iArr = null;
            if (i2 >= 29) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                if (subscriptionManager != null) {
                    iArr = subscriptionManager.getSubscriptionIds(i);
                }
                if (iArr != null && iArr.length > 0) {
                    return iArr[0];
                }
            } else {
                if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    z = true;
                }
                if (z) {
                    SubscriptionManager subscriptionManager2 = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                    if (subscriptionManager2 != null) {
                        subscriptionInfo = subscriptionManager2.getActiveSubscriptionInfoForSimSlotIndex(i);
                    }
                    if (subscriptionInfo != null) {
                        return subscriptionInfo.getSubscriptionId();
                    }
                }
            }
            return -1;
        } catch (Exception e) {
            cc4.g(e, true);
            return -1;
        }
    }
}
