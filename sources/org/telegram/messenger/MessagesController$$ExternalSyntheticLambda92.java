package org.telegram.messenger;

import j$.util.function.Function$CC;
import java.util.function.Function;

public final class MessagesController$$ExternalSyntheticLambda92 implements Function {
    public final int $r8$classId;

    public MessagesController$$ExternalSyntheticLambda92(int i) {
        this.$r8$classId = i;
    }

    public final Function andThen(Function function) {
        int i = this.$r8$classId;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return MessagesController.lambda$new$14((String) obj);
            case 1:
                return String.valueOf((Long) obj);
            case 2:
                return MessagesController.lambda$applyAppConfig$35((int[]) obj);
            case 3:
                return MessagesController.lambda$new$15((String) obj);
            default:
                return ((TranslateController.Language) obj).displayName;
        }
    }

    public final Function compose(Function function) {
        int i = this.$r8$classId;
        return Function$CC.$default$compose(this, function);
    }
}
