package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

public final class dh implements PostProcessor {
    @Override
    public final int onPostProcess(Canvas canvas) {
        return NotificationsController.lambda$loadRoundAvatar$46(canvas);
    }
}
