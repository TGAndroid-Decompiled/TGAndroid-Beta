package f5;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class s extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final u f6629a;

    public s(u uVar) {
        this.f6629a = uVar;
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
        u uVar = this.f6629a;
        if (z10) {
            i10 = 10;
        }
        u.c(uVar, i10);
    }
}
