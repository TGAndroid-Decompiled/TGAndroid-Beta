package org.telegram.messenger;

import android.media.SoundPool;
public final class gh implements SoundPool.OnLoadCompleteListener {
    public final int f18781a;

    public gh(int i10) {
        this.f18781a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f18781a) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i10, i11);
                return;
        }
    }
}
