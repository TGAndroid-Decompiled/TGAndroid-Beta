package org.telegram.messenger;

import android.telephony.PhoneStateListener;
public final class ue extends PhoneStateListener {
    public final MediaController f18415a;

    public ue(MediaController mediaController) {
        this.f18415a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i10, String str) {
        i0.g3(new a1(this, i10, 4));
    }
}
