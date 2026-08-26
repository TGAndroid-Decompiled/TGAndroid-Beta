package org.telegram.messenger;

import android.media.SoundPool;

public final class NotificationsController$$ExternalSyntheticLambda48 implements SoundPool.OnLoadCompleteListener {
    public final int $r8$classId;

    public NotificationsController$$ExternalSyntheticLambda48(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i, i2);
                break;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i, i2);
                break;
        }
    }
}
