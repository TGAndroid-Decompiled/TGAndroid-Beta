package ge;

import zd.e0;
public final class j extends i {
    public final Runnable f9637c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f9637c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f9637c.run();
        } finally {
            this.f9636b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f9637c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f9635a);
        sb2.append(", ");
        sb2.append(this.f9636b);
        sb2.append(']');
        return sb2.toString();
    }
}
