package org.telegram.messenger;

import java.util.function.ToLongFunction;

public final class ie implements ToLongFunction {

    public final int f20578a;

    public ie(int i10) {
        this.f20578a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f20578a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((NotificationsController.StoryNotification) obj).date;
            default:
                return ((NotificationsController.StoryNotification) obj).date;
        }
    }
}
