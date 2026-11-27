package defpackage;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class y97 implements Consumer {
    public final uc7 a;
    public final long b;

    public y97(uc7 uc7Var, long j) {
        this.a = uc7Var;
        this.b = j;
    }

    @Override
    public final void accept(Object obj) {
        uc7 uc7Var = this.a;
        uc7Var.getClass();
        hl.c3(new p77(uc7Var, (ArrayList) obj, this.b, (byte) 2));
    }

    public final Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
