package ge;

import zd.e0;
public final class j extends i {
    public final Runnable f10614c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f10614c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f10614c.run();
        } finally {
            this.f10613b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10614c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f10612a);
        sb2.append(", ");
        sb2.append(this.f10613b);
        sb2.append(']');
        return sb2.toString();
    }
}
