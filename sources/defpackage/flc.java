package defpackage;

import android.media.MediaPlayer;
import org.telegram.messenger.voip.VoIPPreNotificationService;
public final class flc implements MediaPlayer.OnPreparedListener {
    @Override
    public final void onPrepared(MediaPlayer mediaPlayer) {
        VoIPPreNotificationService.lambda$startRinging$0(mediaPlayer);
    }
}
