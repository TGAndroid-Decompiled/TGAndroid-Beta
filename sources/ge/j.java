package ge;

import zd.b0;
public final class j extends i {
    public final Runnable f13858c;

    public j(long j3, boolean z9, Runnable runnable) {
        super(j3, z9);
        this.f13858c = runnable;
    }

    @Override
    public final void run() {
        this.f13858c.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f13858c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.j(runnable));
        sb2.append(", ");
        sb2.append(this.f13856a);
        sb2.append(", ");
        if (this.f13857b) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
