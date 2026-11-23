package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3152a;
    public final Object f3153b;

    public q(Object obj, int i7) {
        this.f3152a = i7;
        this.f3153b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3152a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13480a;
                ((zd.m) this.f3153b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3153b).cancel();
                return gd.k.f13480a;
        }
    }
}
