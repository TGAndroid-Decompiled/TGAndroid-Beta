package org.telegram.messenger;

import android.media.SoundPool;
public final class ug implements SoundPool.OnLoadCompleteListener {
    public final int f19683a;

    public ug(int i10) {
        this.f19683a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f19683a) {
            case 0:
                NotificationsController.I(soundPool, i10, i11);
                return;
            default:
                NotificationsController.j(soundPool, i10, i11);
                return;
        }
    }
}
