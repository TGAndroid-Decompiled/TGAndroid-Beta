package defpackage;

import java.util.concurrent.Callable;
public final class ixe implements Callable {
    public final byte a;
    public final sfa b;

    public ixe(sfa sfaVar, byte b) {
        this.a = b;
        this.b = sfaVar;
    }

    @Override
    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.a();
            case 1:
                return this.b.a();
            case 2:
                return this.b.a();
            case 3:
                return this.b.a();
            default:
                return this.b.a();
        }
    }
}
