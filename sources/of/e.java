package of;
public class e {
    public Runnable f17203a;
    public Runnable f17204b;
    public Runnable f17205c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f17203a = runnable;
        this.f17205c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f17204b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f17205c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f17203a;
        if (runnable != null) {
            runnable.run();
            this.f17203a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f17204b = runnable;
    }
}
