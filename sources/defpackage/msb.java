package defpackage;

import java.util.concurrent.CancellationException;
public final class msb extends CancellationException {
    public final transient nsb a;

    public msb(String str, nsb nsbVar) {
        super(str);
        this.a = nsbVar;
    }
}
