package of;
public class e {
    public Runnable f17117a;
    public Runnable f17118b;
    public Runnable f17119c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f17117a = runnable;
        this.f17119c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f17118b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f17119c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f17117a;
        if (runnable != null) {
            runnable.run();
            this.f17117a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f17118b = runnable;
    }
}
