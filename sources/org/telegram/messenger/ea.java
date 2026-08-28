package org.telegram.messenger;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.TranslateController;
public final class ea implements Function {
    public final int f20171a;

    public ea(int i9) {
        this.f20171a = i9;
    }

    public Function andThen(Function function) {
        int i9 = this.f20171a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        String valueOf;
        String lambda$applyAppConfig$35;
        Long lambda$new$14;
        int[] lambda$new$15;
        String str;
        switch (this.f20171a) {
            case 0:
                valueOf = String.valueOf((Long) obj);
                return valueOf;
            case 1:
                lambda$applyAppConfig$35 = MessagesController.lambda$applyAppConfig$35((int[]) obj);
                return lambda$applyAppConfig$35;
            case 2:
                lambda$new$14 = MessagesController.lambda$new$14((String) obj);
                return lambda$new$14;
            case 3:
                lambda$new$15 = MessagesController.lambda$new$15((String) obj);
                return lambda$new$15;
            default:
                str = ((TranslateController.Language) obj).displayName;
                return str;
        }
    }

    public Function compose(Function function) {
        int i9 = this.f20171a;
        return Function$CC.$default$compose(this, function);
    }
}
