package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class te extends PhoneStateListener {
    public final MediaController f26984a;

    public te(MediaController mediaController) {
        this.f26984a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i7, String str) {
        g0.g3(new x0(this, i7, 4));
    }
}
