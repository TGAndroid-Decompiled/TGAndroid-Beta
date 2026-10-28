package org.telegram.messenger;

import android.media.SoundPool;
public final class bh implements SoundPool.OnLoadCompleteListener {
    public final int f19720a;

    public bh(int i10) {
        this.f19720a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f19720a) {
            case 0:
                NotificationsController.lambda$playInChatSound$40(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playOutChatSound$49(soundPool, i10, i11);
                return;
        }
    }
}
