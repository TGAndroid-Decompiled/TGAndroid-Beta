package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class w0 implements Runnable {
    public final int f18878a;
    public final AudioManager f18879b;

    public w0(AudioManager audioManager, int i10) {
        this.f18878a = i10;
        this.f18879b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f18878a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f18879b);
                return;
            case 1:
                VoIPService.K(this.f18879b);
                return;
            default:
                VoipAudioManager.a(this.f18879b);
                return;
        }
    }
}
