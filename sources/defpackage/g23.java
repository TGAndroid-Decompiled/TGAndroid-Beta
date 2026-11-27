package defpackage;

import android.os.CancellationSignal;
public final class g23 implements ur4 {
    public final byte a;
    public final Object b;

    public g23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((CancellationSignal) obj2).cancel();
                return g9cVar;
            default:
                Throwable th2 = (Throwable) obj;
                ((va1) obj2).resumeWith(g9cVar);
                return g9cVar;
        }
    }
}
