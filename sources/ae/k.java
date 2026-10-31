package ae;

import td.e0;
public final class k extends i {
    public final Runnable f426c;

    public k(Runnable runnable, long j10, j jVar) {
        super(j10, jVar);
        this.f426c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f426c.run();
        } finally {
            this.f424b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f426c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f423a);
        sb2.append(", ");
        sb2.append(this.f424b);
        sb2.append(']');
        return sb2.toString();
    }
}
