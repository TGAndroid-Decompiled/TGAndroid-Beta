package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19844a;
    public final VoIPService f19845b;
    public final AudioManager f19846c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19844a = i10;
        this.f19845b = voIPService;
        this.f19846c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19844a) {
            case 0:
                VoIPService.C(this.f19845b, this.f19846c);
                return;
            default:
                VoIPService.g1(this.f19845b, this.f19846c);
                return;
        }
    }
}
