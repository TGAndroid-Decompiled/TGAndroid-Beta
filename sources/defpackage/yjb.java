package defpackage;
public final class yjb extends vjb {
    public final Runnable c;

    public yjb(long j, boolean z, Runnable runnable) {
        super(j, z);
        this.c = runnable;
    }

    @Override
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(l93.a(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        if (this.b) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
