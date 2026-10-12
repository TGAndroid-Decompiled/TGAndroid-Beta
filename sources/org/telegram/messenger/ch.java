package org.telegram.messenger;

import android.media.SoundPool;
public final class ch implements SoundPool.OnLoadCompleteListener {
    public final int f17330a;

    public ch(int i10) {
        this.f17330a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f17330a) {
            case 0:
                NotificationsController.lambda$playInChatSound$40(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playOutChatSound$49(soundPool, i10, i11);
                return;
        }
    }
}
