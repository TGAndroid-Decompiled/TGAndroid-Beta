package ie;

import be.f0;
public final class j extends i {
    public final Runnable f11413c;

    public j(Runnable runnable, long j10, com.google.android.gms.internal.cast.a aVar) {
        super(j10, aVar);
        this.f11413c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f11413c.run();
        } finally {
            this.f11412b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f11413c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f11411a);
        sb2.append(", ");
        sb2.append(this.f11412b);
        sb2.append(']');
        return sb2.toString();
    }
}
