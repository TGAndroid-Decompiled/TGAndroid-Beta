package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class zi7 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final ev2 a;

    public zi7(ev2 ev2Var) {
        this.a = ev2Var;
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
