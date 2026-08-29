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
            if (intent.getExtras() != null && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    if (keyCode != 87) {
                        if (keyCode != 88) {
                            if (keyCode != 126) {
                                if (keyCode == 127) {
                                    MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                    return;
                                }
                                return;
                            }
                            MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            return;
                        }
                        MediaController.getInstance().playPreviousMessage();
                        return;
                    }
                    MediaController.getInstance().playNextMessage();
                    return;
                } else if (MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                    return;
                } else {
                    MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                    return;
                }
            }
            return;
        }
        String action = intent.getAction();
        action.getClass();
        char c3 = 65535;
        switch (action.hashCode()) {
            case -1925342171:
                if (action.equals("org.telegram.android.musicplayer.repeat")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1461225938:
                if (action.equals("org.telegram.android.musicplayer.close")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1449542100:
                if (action.equals("org.telegram.android.musicplayer.pause")) {
                    c3 = 2;
                    break;
                }
                break;
            case -1293741059:
                if (action.equals("org.telegram.android.musicplayer.next")) {
                    c3 = 3;
                    break;
                }
                break;
            case -1293675458:
                if (action.equals("org.telegram.android.musicplayer.play")) {
                    c3 = 4;
                    break;
                }
                break;
            case -549244379:
                if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                    c3 = 5;
                    break;
                }
                break;
            case 40087297:
                if (action.equals("org.telegram.android.musicplayer.previous")) {
                    c3 = 6;
                    break;
                }
                break;
            case 1421978031:
                if (action.equals("org.telegram.android.musicplayer.shuffle")) {
                    c3 = 7;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                return;
            case 1:
                MediaController.getInstance().cleanupPlayer(true, true);
                return;
            case 2:
            case 5:
                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                return;
            case 3:
                MediaController.getInstance().playNextMessage();
                return;
            case 4:
                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                return;
            case 6:
                MediaController.getInstance().playPreviousMessage();
                return;
            case 7:
                if (SharedConfig.shuffleMusic) {
                    MediaController.getInstance().setPlaybackOrderType(0);
                    return;
                } else {
                    MediaController.getInstance().setPlaybackOrderType(2);
                    return;
                }
            default:
                return;
        }
    }
}
