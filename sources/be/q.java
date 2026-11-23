package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3201a;
    public final Object f3202b;

    public q(Object obj, int i7) {
        this.f3201a = i7;
        this.f3202b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3201a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13517a;
                ((zd.m) this.f3202b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3202b).cancel();
                return gd.k.f13517a;
        }
    }
}
