package ge;

import zd.e0;
public final class j extends i {
    public final Runnable f10642c;

    public j(Runnable runnable, long j3, com.google.android.gms.internal.cast.a aVar) {
        super(j3, aVar);
        this.f10642c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f10642c.run();
        } finally {
            this.f10641b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10642c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f10640a);
        sb2.append(", ");
        sb2.append(this.f10641b);
        sb2.append(']');
        return sb2.toString();
    }
}
