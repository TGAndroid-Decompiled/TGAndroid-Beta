package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3194a;
    public final Object f3195b;

    public q(Object obj, int i7) {
        this.f3194a = i7;
        this.f3195b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3194a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13514a;
                ((zd.m) this.f3195b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3195b).cancel();
                return gd.k.f13514a;
        }
    }
}
