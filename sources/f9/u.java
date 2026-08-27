package f9;

public final class u extends d {

    public final Runnable f6001a;

    public u(Runnable runnable) {
        this.f6001a = runnable;
    }

    @Override
    public final void a() {
        this.f6001a.run();
    }
}
