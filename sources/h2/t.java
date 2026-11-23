package h2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class t extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final w f13853a;

    public t(w wVar) {
        this.f13853a = wVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i7 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i7 = 10;
        }
        this.f13853a.c(i7);
    }
}
