package defpackage;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
public final class rjc implements Runnable {
    public final byte a;
    public final AudioManager b;

    public rjc(AudioManager audioManager, byte b) {
        this.a = b;
        this.b = audioManager;
    }

    @Override
    public final void run() {
        byte b = this.a;
        AudioManager audioManager = this.b;
        switch (b) {
            case 0:
                VoIPService.lambda$onDestroy$94(audioManager);
                return;
            default:
                VoipAudioManager.a(audioManager);
                return;
        }
    }
}
