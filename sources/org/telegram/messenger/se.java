package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class se extends PhoneStateListener {
    public final MediaController f26820a;

    public se(MediaController mediaController) {
        this.f26820a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i7, String str) {
        g0.g3(new x0(this, i7, 4));
    }
}
