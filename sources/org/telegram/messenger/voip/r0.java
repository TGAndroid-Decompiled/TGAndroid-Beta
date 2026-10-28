package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f21675a;
    public final AudioManager f21676b;

    public r0(AudioManager audioManager, int i10) {
        this.f21675a = i10;
        this.f21676b = audioManager;
    }

    @Override
    public final void run() {
        switch (this.f21675a) {
            case 0:
                VoIPService.AnonymousClass1.b(this.f21676b);
                return;
            case 1:
                VoIPService.K(this.f21676b);
                return;
            default:
                VoipAudioManager.a(this.f21676b);
                return;
        }
    }
}
