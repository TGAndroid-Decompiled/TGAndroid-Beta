package org.telegram.messenger;

import android.media.SoundPool;
public final class NotificationsController$$ExternalSyntheticLambda3 implements SoundPool.OnLoadCompleteListener {
    public static final NotificationsController$$ExternalSyntheticLambda3 INSTANCE = new NotificationsController$$ExternalSyntheticLambda3();

    private NotificationsController$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        NotificationsController.lambda$playInChatSound$28(soundPool, i, i2);
    }
}
