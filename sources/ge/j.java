package ge;

import zd.e0;
public final class j extends i {
    public final Runnable f9640c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f9640c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f9640c.run();
        } finally {
            this.f9639b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f9640c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f9638a);
        sb2.append(", ");
        sb2.append(this.f9639b);
        sb2.append(']');
        return sb2.toString();
    }
}
