package be;

import android.os.CancellationSignal;
public final class q implements rd.l {
    public final int f3182a;
    public final Object f3183b;

    public q(Object obj, int i7) {
        this.f3182a = i7;
        this.f3183b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3182a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                gd.k kVar = gd.k.f13485a;
                ((zd.m) this.f3183b).resumeWith(kVar);
                return kVar;
            default:
                Throwable th3 = (Throwable) obj;
                ((CancellationSignal) this.f3183b).cancel();
                return gd.k.f13485a;
        }
    }
}
