package org.telegram.messenger;

import android.media.SoundPool;
public final class vg implements SoundPool.OnLoadCompleteListener {
    public final int f19761a;

    public vg(int i10) {
        this.f19761a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f19761a) {
            case 0:
                NotificationsController.lambda$playInChatSound$40(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playOutChatSound$49(soundPool, i10, i11);
                return;
        }
    }
}
