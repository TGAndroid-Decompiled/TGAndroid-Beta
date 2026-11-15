package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class ol implements Consumer {
    public final np f25777a;
    public final long f25778b;

    public ol(np npVar, long j3) {
        this.f25777a = npVar;
        this.f25778b = j3;
    }

    @Override
    public final void accept(Object obj) {
        np npVar = this.f25777a;
        npVar.getClass();
        g0.h3(new dk(npVar, (ArrayList) obj, this.f25778b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
