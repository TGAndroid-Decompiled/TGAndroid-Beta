package org.telegram.messenger;

import android.media.SoundPool;
public final class wg implements SoundPool.OnLoadCompleteListener {
    public final int f20003a;

    public wg(int i10) {
        this.f20003a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f20003a) {
            case 0:
                NotificationsController.lambda$playInChatSound$40(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playOutChatSound$49(soundPool, i10, i11);
                return;
        }
    }
}
