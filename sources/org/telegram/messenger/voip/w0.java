package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class w0 implements Runnable {
    public final int f18718a;
    public final AudioManager f18719b;

    public w0(AudioManager audioManager, int i10) {
        this.f18718a = i10;
        this.f18719b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18718a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f18719b);
                return;
            case 1:
                VoIPService.K(this.f18719b);
                return;
            default:
                VoipAudioManager.a(this.f18719b);
                return;
        }
    }
}
