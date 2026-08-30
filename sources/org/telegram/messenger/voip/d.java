package org.telegram.messenger.voip;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.voip.ConferenceCall;
public final class d implements Function {
    public Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        String lambda$poll$9;
        lambda$poll$9 = ConferenceCall.lambda$poll$9((ConferenceCall.CallParticipant) obj);
        return lambda$poll$9;
    }

    public Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
