package od;

import hd.f0;
public final class j extends i {
    public final Runnable f19223c;

    public j(Runnable runnable, long j10, com.google.android.gms.internal.cast.a aVar) {
        super(j10, aVar);
        this.f19223c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f19223c.run();
        } finally {
            this.f19222b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f19223c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f19221a);
        sb2.append(", ");
        sb2.append(this.f19222b);
        sb2.append(']');
        return sb2.toString();
    }
}
