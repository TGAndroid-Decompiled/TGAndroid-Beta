package defpackage;

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;
public final class kjc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final AudioManager c;

    public kjc(VoIPService voIPService, AudioManager audioManager, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = audioManager;
    }

    @Override
    public final void run() {
        byte b = this.a;
        AudioManager audioManager = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$configureDeviceForCall$107(audioManager);
                return;
            default:
                voIPService.lambda$configureDeviceForCall$108(audioManager);
                return;
        }
    }
}
