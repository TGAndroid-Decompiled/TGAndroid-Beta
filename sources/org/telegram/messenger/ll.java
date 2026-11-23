package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class ll implements Consumer {
    public final np f25204a;
    public final long f25205b;

    public ll(np npVar, long j3) {
        this.f25204a = npVar;
        this.f25205b = j3;
    }

    @Override
    public final void accept(Object obj) {
        np npVar = this.f25204a;
        npVar.getClass();
        g0.g3(new dk(npVar, (ArrayList) obj, this.f25205b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
