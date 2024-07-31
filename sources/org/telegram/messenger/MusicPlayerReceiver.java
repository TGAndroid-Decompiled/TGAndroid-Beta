package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
public class MusicPlayerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        if (intent.getAction().equals("android.intent.action.MEDIA_BUTTON")) {
            if (intent.getExtras() == null || (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                    return;
                } else {
                    MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                    return;
                }
            } else if (keyCode == 87) {
                MediaController.getInstance().playNextMessage();
                return;
            } else if (keyCode == 88) {
                MediaController.getInstance().playPreviousMessage();
                return;
            } else if (keyCode == 126) {
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                return;
            } else if (keyCode != 127) {
                return;
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                return;
            }
        }
        String action = intent.getAction();
        action.hashCode();
        char c = 65535;
        switch (action.hashCode()) {
            case -1461225938:
                if (action.equals("org.telegram.android.musicplayer.close")) {
                    c = 0;
                    break;
                }
                break;
            case -1449542100:
                if (action.equals("org.telegram.android.musicplayer.pause")) {
                    c = 1;
                    break;
                }
                break;
            case -1293741059:
                if (action.equals("org.telegram.android.musicplayer.next")) {
                    c = 2;
                    break;
                }
                break;
            case -1293675458:
                if (action.equals("org.telegram.android.musicplayer.play")) {
                    c = 3;
                    break;
                }
                break;
            case -549244379:
                if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                    c = 4;
                    break;
                }
                break;
            case 40087297:
                if (action.equals("org.telegram.android.musicplayer.previous")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                MediaController.getInstance().cleanupPlayer(true, true);
                return;
            case 1:
            case 4:
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                return;
            case 2:
                MediaController.getInstance().playNextMessage();
                return;
            case 3:
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                return;
            case 5:
                MediaController.getInstance().playPreviousMessage();
                return;
            default:
                return;
        }
    }
}
