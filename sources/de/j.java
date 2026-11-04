package de;

import wd.b0;
public final class j extends i {
    public final Runnable f8828c;

    public j(long j10, boolean z10, Runnable runnable) {
        super(j10, z10);
        this.f8828c = runnable;
    }

    @Override
    public final void run() {
        this.f8828c.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f8828c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.j(runnable));
        sb2.append(", ");
        sb2.append(this.f8826a);
        sb2.append(", ");
        if (this.f8827b) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
