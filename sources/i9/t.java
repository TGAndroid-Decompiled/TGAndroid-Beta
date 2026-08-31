package i9;
public final class t extends d {
    public final Runnable f8011a;

    public t(Runnable runnable) {
        this.f8011a = runnable;
    }

    @Override
    public final void a() {
        this.f8011a.run();
    }
}
