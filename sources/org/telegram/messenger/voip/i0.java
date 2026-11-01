package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class i0 implements Runnable {
    public final int f18819a;
    public final VoIPService f18820b;
    public final AudioManager f18821c;

    public i0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f18819a = i10;
        this.f18820b = voIPService;
        this.f18821c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18819a) {
            case 0:
                VoIPService.C(this.f18820b, this.f18821c);
                return;
            default:
                VoIPService.g1(this.f18820b, this.f18821c);
                return;
        }
    }
}
