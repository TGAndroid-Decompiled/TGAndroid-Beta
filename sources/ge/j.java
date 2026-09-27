package ge;

import zd.e0;
public final class j extends i {
    public final Runnable f9631c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f9631c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f9631c.run();
        } finally {
            this.f9630b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f9631c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f9629a);
        sb2.append(", ");
        sb2.append(this.f9630b);
        sb2.append(']');
        return sb2.toString();
    }
}
