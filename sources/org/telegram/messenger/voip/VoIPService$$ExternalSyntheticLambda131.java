package org.telegram.messenger.voip;

import android.media.AudioManager;

public final class VoIPService$$ExternalSyntheticLambda131 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final AudioManager f$1;

    public VoIPService$$ExternalSyntheticLambda131(VoIPService voIPService, AudioManager audioManager, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = audioManager;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$configureDeviceForCall$111(this.f$1);
                break;
            default:
                this.f$0.lambda$configureDeviceForCall$110(this.f$1);
                break;
        }
    }
}
