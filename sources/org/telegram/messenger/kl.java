package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class kl implements Consumer {
    public final mp f25074a;
    public final long f25075b;

    public kl(mp mpVar, long j3) {
        this.f25074a = mpVar;
        this.f25075b = j3;
    }

    @Override
    public final void accept(Object obj) {
        mp mpVar = this.f25074a;
        mpVar.getClass();
        g0.g3(new ck(mpVar, (ArrayList) obj, this.f25075b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
