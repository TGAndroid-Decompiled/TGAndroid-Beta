package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;
public final class ch implements PostProcessor {
    @Override
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$47;
        lambda$loadRoundAvatar$47 = NotificationsController.lambda$loadRoundAvatar$47(canvas);
        return lambda$loadRoundAvatar$47;
    }
}
