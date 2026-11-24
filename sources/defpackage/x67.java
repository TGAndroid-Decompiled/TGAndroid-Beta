package defpackage;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
public final class x67 implements Consumer {
    public final na7 a;
    public final long b;

    public x67(na7 na7Var, long j) {
        this.a = na7Var;
        this.b = j;
    }

    @Override
    public final void accept(Object obj) {
        na7 na7Var = this.a;
        na7Var.getClass();
        gl.d3(new m57(na7Var, (ArrayList) obj, this.b, (byte) 2));
    }

    public final Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
