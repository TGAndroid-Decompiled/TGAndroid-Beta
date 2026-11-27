package defpackage;
public final class pjc implements Runnable {
    public final anb a;

    public pjc(anb anbVar) {
        this.a = anbVar;
    }

    @Override
    public final void run() {
        synchronized (this.a.c) {
            this.a.d = null;
        }
    }
}
