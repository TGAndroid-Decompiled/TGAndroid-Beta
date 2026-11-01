package org.telegram.messenger;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class wl implements Consumer {
    public final wp f19066a;
    public final long f19067b;

    public wl(wp wpVar, long j10) {
        this.f19066a = wpVar;
        this.f19067b = j10;
    }

    @Override
    public final void accept(Object obj) {
        wp wpVar = this.f19066a;
        wpVar.getClass();
        i0.g3(new pk(wpVar, (ArrayList) obj, this.f19067b, 2));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
