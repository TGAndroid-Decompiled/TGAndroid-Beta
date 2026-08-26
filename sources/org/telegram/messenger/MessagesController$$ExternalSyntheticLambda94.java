package org.telegram.messenger;

import java.util.function.ToLongFunction;

public final class MessagesController$$ExternalSyntheticLambda94 implements ToLongFunction {
    public final int $r8$classId;

    public MessagesController$$ExternalSyntheticLambda94(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((NotificationsController.StoryNotification) obj).date;
            default:
                return ((NotificationsController.StoryNotification) obj).date;
        }
    }
}
