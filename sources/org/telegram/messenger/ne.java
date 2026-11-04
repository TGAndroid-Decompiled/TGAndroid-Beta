package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class ne extends PhoneStateListener {
    public final MediaController f24367a;

    public ne(MediaController mediaController) {
        this.f24367a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i3, String str) {
        g0.h3(new x0(this, i3, 4));
    }
}
