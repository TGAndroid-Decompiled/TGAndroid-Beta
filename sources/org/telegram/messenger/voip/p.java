package org.telegram.messenger.voip;

import android.media.MediaPlayer;
public final class p implements MediaPlayer.OnPreparedListener {
    @Override
    public final void onPrepared(MediaPlayer mediaPlayer) {
        VoIPPreNotificationService.lambda$startRinging$0(mediaPlayer);
    }
}
