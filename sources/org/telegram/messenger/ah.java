package org.telegram.messenger;

import android.media.SoundPool;

public final class ah implements SoundPool.OnLoadCompleteListener {

    public final int f19724a;

    public ah(int i10) {
        this.f19724a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f19724a) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i10, i11);
                break;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i10, i11);
                break;
        }
    }
}
