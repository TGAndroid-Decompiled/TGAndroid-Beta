package defpackage;

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;
public final class vn6 extends PhoneStateListener {
    public final MediaController a;

    public vn6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override
    public final void onCallStateChanged(int i, String str) {
        gm.c3(new bm3(this, i, (byte) 22));
    }
}
