package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class hl implements Consumer {
    public final hp f22943a;
    public final long f22944b;

    public hl(hp hpVar, long j10) {
        this.f22943a = hpVar;
        this.f22944b = j10;
    }

    @Override
    public final void accept(Object obj) {
        hp hpVar = this.f22943a;
        hpVar.getClass();
        g0.h3(new wj(hpVar, (ArrayList) obj, this.f22944b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
