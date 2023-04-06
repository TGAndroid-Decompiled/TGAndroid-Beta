package org.telegram.messenger;

import j$.util.function.Function;
import java.util.Objects;
import org.telegram.messenger.TranslateController;
public final class TranslateController$$ExternalSyntheticLambda13 implements Function {
    public static final TranslateController$$ExternalSyntheticLambda13 INSTANCE = new TranslateController$$ExternalSyntheticLambda13();

    private TranslateController$$ExternalSyntheticLambda13() {
    }

    @Override
    public Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override
    public final Object apply(Object obj) {
        String str;
        str = ((TranslateController.Language) obj).displayName;
        return str;
    }

    @Override
    public Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
