package i9;
public final class e implements Runnable {
    public final c0 f11904a;
    public final w f11905b;

    public e(c0 c0Var, w wVar) {
        this.f11904a = c0Var;
        this.f11905b = wVar;
    }

    @Override
    public final void run() {
        if (this.f11904a.f11917a == this) {
            if (o.f11916f.b(this.f11904a, this, o.j(this.f11905b))) {
                o.g(this.f11904a, false);
            }
        }
    }
}
