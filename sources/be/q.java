package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3229a;
    public final Object f3230b;

    public q(Object obj, int i7) {
        this.f3229a = i7;
        this.f3230b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3229a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13829a;
                ((zd.m) this.f3230b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3230b).cancel();
                return gd.k.f13829a;
        }
    }
}
