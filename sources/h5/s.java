package h5;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
public final class s extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final u f6979a;

    public s(u uVar) {
        this.f6979a = uVar;
    }

    @Override
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z4;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z4 = false;
        } else {
            z4 = true;
        }
        u uVar = this.f6979a;
        if (z4) {
            i10 = 10;
        }
        u.b(uVar, i10);
    }
}
