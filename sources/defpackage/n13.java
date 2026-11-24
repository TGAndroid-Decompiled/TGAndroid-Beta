package defpackage;

import android.os.CancellationSignal;
public final class n13 implements qp4 {
    public final byte a;
    public final Object b;

    public n13(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((CancellationSignal) obj2).cancel();
                return g5cVar;
            default:
                Throwable th2 = (Throwable) obj;
                ((na1) obj2).resumeWith(g5cVar);
                return g5cVar;
        }
    }
}
