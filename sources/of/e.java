package of;
public class e {
    public Runnable f16868a;
    public Runnable f16869b;
    public Runnable f16870c;

    public e(Runnable runnable, Runnable runnable2) {
        this.f16868a = runnable;
        this.f16870c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f16869b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f16870c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f16868a;
        if (runnable != null) {
            runnable.run();
            this.f16868a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f16869b = runnable;
    }
}
