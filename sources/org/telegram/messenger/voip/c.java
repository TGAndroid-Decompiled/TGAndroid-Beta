package org.telegram.messenger.voip;

import j$.util.function.Function$CC;
import java.util.function.Function;

public final class c implements Function {
    public Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        return ConferenceCall.lambda$poll$9((ConferenceCall.CallParticipant) obj);
    }

    public Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
