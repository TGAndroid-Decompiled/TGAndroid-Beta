package org.telegram.messenger.voip;

import android.media.AudioManager;
public final class g0 implements Runnable {
    public final int f19559a;
    public final VoIPService f19560b;
    public final AudioManager f19561c;

    public g0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.f19559a = i10;
        this.f19560b = voIPService;
        this.f19561c = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f19559a) {
            case 0:
                VoIPService.C(this.f19560b, this.f19561c);
                return;
            default:
                VoIPService.g1(this.f19560b, this.f19561c);
                return;
        }
    }
}
