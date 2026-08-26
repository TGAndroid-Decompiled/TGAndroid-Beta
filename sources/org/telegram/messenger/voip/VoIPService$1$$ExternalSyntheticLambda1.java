package org.telegram.messenger.voip;

import android.media.AudioManager;

public final class VoIPService$1$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final AudioManager f$0;

    public VoIPService$1$$ExternalSyntheticLambda1(AudioManager audioManager, int i) {
        this.$r8$classId = i;
        this.f$0 = audioManager;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                VoIPService.AnonymousClass1.lambda$run$1(this.f$0);
                break;
            case 1:
                VoIPService.lambda$onDestroy$98(this.f$0);
                break;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$112(this.f$0);
                break;
        }
    }
}
