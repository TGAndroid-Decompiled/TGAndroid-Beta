package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.messenger.NotificationsController;
public final class ie implements ToLongFunction {
    public final int f18630a;

    public ie(int i10) {
        this.f18630a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        long j10;
        long j11;
        switch (this.f18630a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                j10 = ((NotificationsController.StoryNotification) obj).date;
                return j10;
            default:
                j11 = ((NotificationsController.StoryNotification) obj).date;
                return j11;
        }
    }
}
