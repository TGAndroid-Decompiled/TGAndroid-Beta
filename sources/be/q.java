package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3184a;
    public final Object f3185b;

    public q(Object obj, int i7) {
        this.f3184a = i7;
        this.f3185b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3184a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13173a;
                ((zd.m) this.f3185b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3185b).cancel();
                return gd.k.f13173a;
        }
    }
}
