package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class o0 implements Runnable {
    public final int f19400a;
    public final VoIPService f19401b;
    public final AudioManager f19402c;

    public o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19400a = i10;
        this.f19401b = voIPService;
        this.f19402c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19400a) {
            case 0:
                VoIPService.z(this.f19401b, this.f19402c);
                return;
            default:
                VoIPService.s1(this.f19401b, this.f19402c);
                return;
        }
    }
}
