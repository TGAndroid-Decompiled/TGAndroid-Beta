package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
public class MusicPlayerReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        if (intent.getAction().equals("android.intent.action.MEDIA_BUTTON")) {
            if (intent.getExtras() != null && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    if (keyCode != 87) {
                        if (keyCode != 88) {
                            if (keyCode != 126) {
                                if (keyCode == 127) {
                                    MediaController.z().U(MediaController.z().v0, true);
                                    return;
                                }
                                return;
                            }
                            MediaController.z().V(MediaController.z().v0);
                            return;
                        }
                        MediaController.z().Y();
                        return;
                    }
                    MediaController.z().X(false);
                    return;
                } else if (MediaController.z().G()) {
                    MediaController.z().V(MediaController.z().v0);
                    return;
                } else {
                    MediaController.z().U(MediaController.z().v0, true);
                    return;
                }
            }
            return;
        }
        String action = intent.getAction();
        action.getClass();
        char c = 65535;
        switch (action.hashCode()) {
            case -1925342171:
                if (action.equals("org.telegram.android.musicplayer.repeat")) {
                    c = 0;
                    break;
                }
                break;
            case -1461225938:
                if (action.equals("org.telegram.android.musicplayer.close")) {
                    c = 1;
                    break;
                }
                break;
            case -1449542100:
                if (action.equals("org.telegram.android.musicplayer.pause")) {
                    c = 2;
                    break;
                }
                break;
            case -1293741059:
                if (action.equals("org.telegram.android.musicplayer.next")) {
                    c = 3;
                    break;
                }
                break;
            case -1293675458:
                if (action.equals("org.telegram.android.musicplayer.play")) {
                    c = 4;
                    break;
                }
                break;
            case -549244379:
                if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                    c = 5;
                    break;
                }
                break;
            case 40087297:
                if (action.equals("org.telegram.android.musicplayer.previous")) {
                    c = 6;
                    break;
                }
                break;
            case 1421978031:
                if (action.equals("org.telegram.android.musicplayer.shuffle")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                xea.D((xea.O0 + 1) % 3);
                return;
            case 1:
                MediaController.z().m(true, true, false, false);
                return;
            case 2:
            case 5:
                MediaController.z().U(MediaController.z().v0, true);
                return;
            case 3:
                MediaController.z().X(false);
                return;
            case 4:
                MediaController.z().V(MediaController.z().v0);
                return;
            case 6:
                MediaController.z().Y();
                return;
            case 7:
                if (xea.J0) {
                    MediaController.z().n0(0);
                    return;
                } else {
                    MediaController.z().n0(2);
                    return;
                }
            default:
                return;
        }
    }
}
