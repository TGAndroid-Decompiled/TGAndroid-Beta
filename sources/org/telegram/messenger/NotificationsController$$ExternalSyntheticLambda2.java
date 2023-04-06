package org.telegram.messenger;

import android.media.SoundPool;
public final class NotificationsController$$ExternalSyntheticLambda2 implements SoundPool.OnLoadCompleteListener {
    public static final NotificationsController$$ExternalSyntheticLambda2 INSTANCE = new NotificationsController$$ExternalSyntheticLambda2();

    private NotificationsController$$ExternalSyntheticLambda2() {
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        NotificationsController.lambda$playOutChatSound$37(soundPool, i, i2);
    }
}
