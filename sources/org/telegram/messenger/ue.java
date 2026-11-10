package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class ue extends PhoneStateListener {
    public final MediaController f25778a;

    public ue(MediaController mediaController) {
        this.f25778a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i7, String str) {
        g0.h3(new x0(this, i7, 4));
    }
}
