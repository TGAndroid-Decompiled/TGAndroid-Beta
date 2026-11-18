package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class se extends PhoneStateListener {
    public final MediaController f26794a;

    public se(MediaController mediaController) {
        this.f26794a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i7, String str) {
        g0.g3(new x0(this, i7, 4));
    }
}
