package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f26108a;
    public final VoIPService f26109b;
    public final AudioManager f26110c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.f26108a = i7;
        this.f26109b = voIPService;
        this.f26110c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f26108a) {
            case 0:
                VoIPService.C(this.f26109b, this.f26110c);
                return;
            default:
                VoIPService.g1(this.f26109b, this.f26110c);
                return;
        }
    }
}
