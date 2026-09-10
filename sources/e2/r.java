package e2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class r extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final u f7225a;

    public r(u uVar) {
        this.f7225a = uVar;
    }

    @Override
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        u uVar = this.f7225a;
        if (z10) {
            i10 = 10;
        }
        uVar.c(i10);
    }
}
