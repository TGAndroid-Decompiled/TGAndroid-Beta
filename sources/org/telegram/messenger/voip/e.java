package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class e implements Runnable {
    public final byte a;
    public final Object b;

    public e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((VoIPService.AnonymousClass1) obj).lambda$run$0();
                return;
            case 1:
                VoIPService.AnonymousClass1.lambda$run$1((AudioManager) obj);
                return;
            default:
                ((VoIPService.AnonymousClass10) obj).lambda$run$0();
                return;
        }
    }
}
