package defpackage;

import java.util.concurrent.Callable;
public final class kze implements Callable {
    public final byte a;
    public final uha b;

    public kze(uha uhaVar, byte b) {
        this.a = b;
        this.b = uhaVar;
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
