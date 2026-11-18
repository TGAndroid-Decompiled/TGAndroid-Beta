package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class kl implements Consumer {
    public final mp f25049a;
    public final long f25050b;

    public kl(mp mpVar, long j3) {
        this.f25049a = mpVar;
        this.f25050b = j3;
    }

    @Override
    public final void accept(Object obj) {
        mp mpVar = this.f25049a;
        mpVar.getClass();
        g0.g3(new ck(mpVar, (ArrayList) obj, this.f25050b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
