package ie;

import be.f0;
public final class j extends i {
    public final Runnable f12802c;

    public j(Runnable runnable, long j10, com.google.android.gms.internal.cast.a aVar) {
        super(j10, aVar);
        this.f12802c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f12802c.run();
        } finally {
            this.f12801b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f12802c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f12800a);
        sb2.append(", ");
        sb2.append(this.f12801b);
        sb2.append(']');
        return sb2.toString();
    }
}
