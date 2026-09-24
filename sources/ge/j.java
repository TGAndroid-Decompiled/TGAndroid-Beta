package ge;

import zd.e0;
public final class j extends i {
    public final Runnable f9625c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f9625c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f9625c.run();
        } finally {
            this.f9624b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f9625c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f9623a);
        sb2.append(", ");
        sb2.append(this.f9624b);
        sb2.append(']');
        return sb2.toString();
    }
}
