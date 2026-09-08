package of;
public class e {
    public Runnable f17030a;
    public Runnable f17031b;
    public Runnable f17032c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f17030a = runnable;
        this.f17032c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f17031b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f17032c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f17030a;
        if (runnable != null) {
            runnable.run();
            this.f17030a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f17031b = runnable;
    }
}
