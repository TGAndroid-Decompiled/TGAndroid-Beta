package org.telegram.messenger;

import java.util.function.IntFunction;

public final class MessagesController$$ExternalSyntheticLambda46 implements IntFunction {
    public final int $r8$classId;

    public MessagesController$$ExternalSyntheticLambda46(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final Object apply(int i) {
        switch (this.$r8$classId) {
            case 0:
                return String.valueOf(i);
            default:
                return MessagesController.lambda$new$16(i);
        }
    }
}
