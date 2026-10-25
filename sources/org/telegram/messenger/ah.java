package org.telegram.messenger;

import android.media.SoundPool;
public final class ah implements SoundPool.OnLoadCompleteListener {
    public final int f19645a;

    public ah(int i10) {
        this.f19645a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f19645a) {
            case 0:
                NotificationsController.I(soundPool, i10, i11);
                return;
            default:
                NotificationsController.j(soundPool, i10, i11);
                return;
        }
    }
}
