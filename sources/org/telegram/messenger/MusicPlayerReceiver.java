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
                                    MediaController.B().R(MediaController.B().f21348v0, true);
                                    return;
                                }
                                return;
                            }
                            MediaController.B().S(MediaController.B().f21348v0);
                            return;
                        }
                        MediaController.B().V();
                        return;
                    }
                    MediaController.B().U(false);
                    return;
                } else if (MediaController.B().H()) {
                    MediaController.B().S(MediaController.B().f21348v0);
                    return;
                } else {
                    MediaController.B().R(MediaController.B().f21348v0, true);
                    return;
                }
            }
            return;
        }
        String action = intent.getAction();
        action.getClass();
        char c2 = 65535;
        switch (action.hashCode()) {
            case -1925342171:
                if (action.equals("org.telegram.android.musicplayer.repeat")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1461225938:
                if (action.equals("org.telegram.android.musicplayer.close")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1449542100:
                if (action.equals("org.telegram.android.musicplayer.pause")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1293741059:
                if (action.equals("org.telegram.android.musicplayer.next")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1293675458:
                if (action.equals("org.telegram.android.musicplayer.play")) {
                    c2 = 4;
                    break;
                }
                break;
            case -549244379:
                if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                    c2 = 5;
                    break;
                }
                break;
            case 40087297:
                if (action.equals("org.telegram.android.musicplayer.previous")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1421978031:
                if (action.equals("org.telegram.android.musicplayer.shuffle")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                az.E((az.S0 + 1) % 3);
                return;
            case 1:
                MediaController.B().q(true, true, false, false);
                return;
            case 2:
            case 5:
                MediaController.B().R(MediaController.B().f21348v0, true);
                return;
            case 3:
                MediaController.B().U(false);
                return;
            case 4:
                MediaController.B().S(MediaController.B().f21348v0);
                return;
            case 6:
                MediaController.B().V();
                return;
            case 7:
                if (az.N0) {
                    MediaController.B().l0(0);
                    return;
                } else {
                    MediaController.B().l0(2);
                    return;
                }
            default:
                return;
        }
    }
}
