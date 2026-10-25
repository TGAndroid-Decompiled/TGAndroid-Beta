package je;

import ce.f0;
public final class j extends i {
    public final Runnable f15603c;

    public j(Runnable runnable, long j10, ag.j jVar) {
        super(j10, jVar);
        this.f15603c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f15603c.run();
        } finally {
            this.f15602b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f15603c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f15601a);
        sb2.append(", ");
        sb2.append(this.f15602b);
        sb2.append(']');
        return sb2.toString();
    }
}
