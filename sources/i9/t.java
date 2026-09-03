package i9;
public final class t extends d {
    public final Runnable f7423a;

    public t(Runnable runnable) {
        this.f7423a = runnable;
    }

    @Override
    public final void a() {
        this.f7423a.run();
    }
}
