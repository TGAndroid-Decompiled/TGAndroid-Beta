package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class kl implements Consumer {
    public final mp f25145a;
    public final long f25146b;

    public kl(mp mpVar, long j3) {
        this.f25145a = mpVar;
        this.f25146b = j3;
    }

    @Override
    public final void accept(Object obj) {
        mp mpVar = this.f25145a;
        mpVar.getClass();
        g0.g3(new ck(mpVar, (ArrayList) obj, this.f25146b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
