package defpackage;

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;
public final class tl6 extends PhoneStateListener {
    public final MediaController a;

    public tl6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i, String str) {
        gl.d3(new sm3(this, i, (byte) 20));
    }
}
