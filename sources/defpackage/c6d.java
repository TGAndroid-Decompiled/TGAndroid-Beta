package defpackage;

import java.lang.ref.WeakReference;
public final class c6d extends p3f {
    public final WeakReference a;

    public c6d(d6d d6dVar) {
        this.a = new WeakReference(d6dVar);
    }

    @Override
    public final void a() {
        d6d d6dVar = (d6d) this.a.get();
        if (d6dVar == null) {
            return;
        }
        d6dVar.g();
    }
}
