package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class vl implements Consumer {
    public final vp f18597a;
    public final long f18598b;

    public vl(vp vpVar, long j10) {
        this.f18597a = vpVar;
        this.f18598b = j10;
    }

    @Override
    public final void accept(Object obj) {
        vp vpVar = this.f18597a;
        vpVar.getClass();
        i0.g3(new ok(vpVar, (ArrayList) obj, this.f18598b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
