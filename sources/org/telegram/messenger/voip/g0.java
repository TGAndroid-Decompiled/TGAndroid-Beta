package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class g0 implements Runnable {
    public final int f19563a;
    public final VoIPService f19564b;
    public final AudioManager f19565c;

    public g0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19563a = i10;
        this.f19564b = voIPService;
        this.f19565c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                VoIPService.C(this.f19564b, this.f19565c);
                return;
            default:
                VoIPService.g1(this.f19564b, this.f19565c);
                return;
        }
    }
}
