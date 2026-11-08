package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class ue extends PhoneStateListener {
    public final MediaController f25774a;

    public ue(MediaController mediaController) {
        this.f25774a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i7, String str) {
        g0.h3(new x0(this, i7, 4));
    }
}
