package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class rl implements Consumer {
    public final qp f25304a;
    public final long f25305b;

    public rl(qp qpVar, long j3) {
        this.f25304a = qpVar;
        this.f25305b = j3;
    }

    @Override
    public final void accept(Object obj) {
        qp qpVar = this.f25304a;
        qpVar.getClass();
        g0.h3(new gk(qpVar, (ArrayList) obj, this.f25305b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
