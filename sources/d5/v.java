package d5;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

public final class v extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    public final x f4847a;

    public v(x xVar) {
        this.f4847a = xVar;
    }

    @Override
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        x.a(this.f4847a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
