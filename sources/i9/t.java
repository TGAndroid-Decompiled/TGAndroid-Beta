package i9;
public final class t extends d {
    public final Runnable f7441a;

    public t(Runnable runnable) {
        this.f7441a = runnable;
    }

    @Override
    public final void a() {
        this.f7441a.run();
    }
}
