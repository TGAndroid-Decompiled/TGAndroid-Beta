package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class te extends PhoneStateListener {
    public final MediaController f18046a;

    public te(MediaController mediaController) {
        this.f18046a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i10, String str) {
        i0.g3(new a1(this, i10, 4));
    }
}
