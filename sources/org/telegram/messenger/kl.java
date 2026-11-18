package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class kl implements Consumer {
    public final mp f25046a;
    public final long f25047b;

    public kl(mp mpVar, long j3) {
        this.f25046a = mpVar;
        this.f25047b = j3;
    }

    @Override
    public final void accept(Object obj) {
        mp mpVar = this.f25046a;
        mpVar.getClass();
        g0.g3(new ck(mpVar, (ArrayList) obj, this.f25047b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
