package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.messenger.NotificationsController;
public final class je implements ToLongFunction {
    public final int f18094a;

    public je(int i10) {
        this.f18094a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        long j3;
        long j10;
        switch (this.f18094a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                j3 = ((NotificationsController.StoryNotification) obj).date;
                return j3;
            default:
                j10 = ((NotificationsController.StoryNotification) obj).date;
                return j10;
        }
    }
}
