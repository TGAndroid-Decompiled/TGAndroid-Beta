package g2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class u extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final x f11911a;

    public u(x xVar) {
        this.f11911a = xVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i3 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i3 = 10;
        }
        this.f11911a.c(i3);
    }
}
