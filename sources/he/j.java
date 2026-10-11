package he;

import ae.g0;
public final class j extends i {
    public final Runnable f11117c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f11117c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f11117c.run();
        } finally {
            this.f11116b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f11117c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(g0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f11115a);
        sb2.append(", ");
        sb2.append(this.f11116b);
        sb2.append(']');
        return sb2.toString();
    }
}
