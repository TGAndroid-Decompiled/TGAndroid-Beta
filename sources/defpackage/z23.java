package defpackage;

import android.os.CancellationSignal;
public final class z23 implements rr4 {
    public final byte a;
    public final Object b;

    public z23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((CancellationSignal) obj2).cancel();
                return g7cVar;
            default:
                Throwable th2 = (Throwable) obj;
                ((vb1) obj2).resumeWith(g7cVar);
                return g7cVar;
        }
    }
}
