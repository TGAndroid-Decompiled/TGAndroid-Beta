package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class f0 implements Runnable {
    public final int f19543a;
    public final VoIPService f19544b;
    public final AudioManager f19545c;

    public f0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19543a = i10;
        this.f19544b = voIPService;
        this.f19545c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19543a) {
            case 0:
                VoIPService.C(this.f19544b, this.f19545c);
                return;
            default:
                VoIPService.g1(this.f19544b, this.f19545c);
                return;
        }
    }
}
