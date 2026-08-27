package org.telegram.messenger;

import j$.util.function.Function$CC;
import java.util.function.Function;

public final class ia implements Function {

    public final int f20561a;

    public ia(int i10) {
        this.f20561a = i10;
    }

    public Function andThen(Function function) {
        int i10 = this.f20561a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f20561a) {
            case 0:
                return String.valueOf((Long) obj);
            case 1:
                return MessagesController.lambda$applyAppConfig$35((int[]) obj);
            case 2:
                return MessagesController.lambda$new$14((String) obj);
            case 3:
                return MessagesController.lambda$new$15((String) obj);
            default:
                return ((TranslateController.Language) obj).displayName;
        }
    }

    public Function compose(Function function) {
        int i10 = this.f20561a;
        return Function$CC.$default$compose(this, function);
    }
}
