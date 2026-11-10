package h2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class t extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final w f14152a;

    public t(w wVar) {
        this.f14152a = wVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z9;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i7 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            i7 = 10;
        }
        this.f14152a.c(i7);
    }
}
