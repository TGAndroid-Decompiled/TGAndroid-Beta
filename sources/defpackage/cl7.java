package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class cl7 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final ow2 a;

    public cl7(ow2 ow2Var) {
        this.a = ow2Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 10;
        }
        this.a.i(i);
    }
}
