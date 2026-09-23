package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;
public final class gh implements PostProcessor {
    @Override
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$46;
        lambda$loadRoundAvatar$46 = NotificationsController.lambda$loadRoundAvatar$46(canvas);
        return lambda$loadRoundAvatar$46;
    }
}
