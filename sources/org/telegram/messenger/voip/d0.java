package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class d0 implements Runnable {
    public final int f19847a;
    public final VoIPService f19848b;
    public final AudioManager f19849c;

    public d0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19847a = i10;
        this.f19848b = voIPService;
        this.f19849c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19847a) {
            case 0:
                VoIPService.C(this.f19848b, this.f19849c);
                return;
            default:
                VoIPService.g1(this.f19848b, this.f19849c);
                return;
        }
    }
}
