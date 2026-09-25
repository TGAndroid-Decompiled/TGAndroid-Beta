package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f17934a;
    public final VoIPService f17935b;
    public final AudioManager f17936c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f17934a = i10;
        this.f17935b = voIPService;
        this.f17936c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f17934a) {
            case 0:
                VoIPService.z(this.f17935b, this.f17936c);
                return;
            default:
                VoIPService.s1(this.f17935b, this.f17936c);
                return;
        }
    }
}
