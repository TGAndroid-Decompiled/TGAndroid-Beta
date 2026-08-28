package e9;
public final class u extends d {
    public final Runnable f5069a;

    public u(Runnable runnable) {
        this.f5069a = runnable;
    }

    @Override
    public final void a() {
        this.f5069a.run();
    }
}
