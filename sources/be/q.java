package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3181a;
    public final Object f3182b;

    public q(Object obj, int i7) {
        this.f3181a = i7;
        this.f3182b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3181a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13488a;
                ((zd.m) this.f3182b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3182b).cancel();
                return gd.k.f13488a;
        }
    }
}
