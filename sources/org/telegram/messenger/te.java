package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class te extends PhoneStateListener {
    public final MediaController f26664a;

    public te(MediaController mediaController) {
        this.f26664a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i7, String str) {
        g0.h3(new x0(this, i7, 4));
    }
}
