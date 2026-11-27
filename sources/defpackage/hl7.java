package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class hl7 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final yv2 a;

    public hl7(yv2 yv2Var) {
        this.a = yv2Var;
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
