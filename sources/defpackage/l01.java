package defpackage;
public class l01 {
    public Runnable a;
    public Runnable b;
    public Runnable c;

    public final void a(boolean z) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        c(z);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z) {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }
}
