package org.telegram.messenger;

import android.media.SoundPool;
public final class wg implements SoundPool.OnLoadCompleteListener {
    public final int f22040a;

    public wg(int i9) {
        this.f22040a = i9;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i9, int i10) {
        switch (this.f22040a) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i9, i10);
                return;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i9, i10);
                return;
        }
    }
}
