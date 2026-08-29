package org.telegram.messenger;

import android.media.SoundPool;
public final class dh implements SoundPool.OnLoadCompleteListener {
    public final int f20059a;

    public dh(int i10) {
        this.f20059a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f20059a) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i10, i11);
                return;
        }
    }
}
