package defpackage;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class v87 implements Consumer {
    public final oc7 a;
    public final long b;

    public v87(oc7 oc7Var, long j) {
        this.a = oc7Var;
        this.b = j;
    }

    @Override
    public final void accept(Object obj) {
        oc7 oc7Var = this.a;
        oc7Var.getClass();
        gm.c3(new m77(oc7Var, (ArrayList) obj, this.b, (byte) 2));
    }

    public final Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
