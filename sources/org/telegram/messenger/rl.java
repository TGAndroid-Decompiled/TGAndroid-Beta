package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class rl implements Consumer {
    public final qp f25307a;
    public final long f25308b;

    public rl(qp qpVar, long j3) {
        this.f25307a = qpVar;
        this.f25308b = j3;
    }

    @Override
    public final void accept(Object obj) {
        qp qpVar = this.f25307a;
        qpVar.getClass();
        g0.h3(new fk(qpVar, (ArrayList) obj, this.f25308b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
