package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

public final class NotificationsController$$ExternalSyntheticLambda1 implements PostProcessor {
    public static final NotificationsController$$ExternalSyntheticLambda1 INSTANCE = new NotificationsController$$ExternalSyntheticLambda1();

    private NotificationsController$$ExternalSyntheticLambda1() {
    }

    @Override
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$35;
        lambda$loadRoundAvatar$35 = NotificationsController.lambda$loadRoundAvatar$35(canvas);
        return lambda$loadRoundAvatar$35;
    }
}
