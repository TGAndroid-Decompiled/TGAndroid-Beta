package defpackage;

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;
public final class ao6 extends PhoneStateListener {
    public final MediaController a;

    public ao6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i, String str) {
        hl.c3(new hl3(this, i, (byte) 22));
    }
}
