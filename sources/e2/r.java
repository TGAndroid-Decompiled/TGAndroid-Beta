package e2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class r extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final u f8573a;

    public r(u uVar) {
        this.f8573a = uVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i10 = 10;
        }
        this.f8573a.c(i10);
    }
}
