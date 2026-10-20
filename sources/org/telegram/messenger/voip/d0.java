package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19841a;
    public final VoIPService f19842b;
    public final AudioManager f19843c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19841a = i10;
        this.f19842b = voIPService;
        this.f19843c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19841a) {
            case 0:
                VoIPService.C(this.f19842b, this.f19843c);
                return;
            default:
                VoIPService.g1(this.f19842b, this.f19843c);
                return;
        }
    }
}
