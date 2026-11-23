package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class ll implements Consumer {
    public final np f25240a;
    public final long f25241b;

    public ll(np npVar, long j3) {
        this.f25240a = npVar;
        this.f25241b = j3;
    }

    @Override
    public final void accept(Object obj) {
        np npVar = this.f25240a;
        npVar.getClass();
        g0.g3(new dk(npVar, (ArrayList) obj, this.f25241b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
