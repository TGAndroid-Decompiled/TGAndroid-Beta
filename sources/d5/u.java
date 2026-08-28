package d5;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class u extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final w f4399a;

    public u(w wVar) {
        this.f4399a = wVar;
    }

    @Override
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i9 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar = this.f4399a;
        if (z10) {
            i9 = 10;
        }
        w.a(wVar, i9);
    }
}
