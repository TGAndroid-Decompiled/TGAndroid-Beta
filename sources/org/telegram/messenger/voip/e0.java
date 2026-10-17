package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class e0 implements Runnable {
    public final int f19845a;
    public final VoIPService f19846b;
    public final AudioManager f19847c;

    public e0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19845a = i10;
        this.f19846b = voIPService;
        this.f19847c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19845a) {
            case 0:
                VoIPService.C(this.f19846b, this.f19847c);
                return;
            default:
                VoIPService.g1(this.f19846b, this.f19847c);
                return;
        }
    }
}
