package defpackage;

import java.lang.ref.WeakReference;
public final class l1d extends wye {
    public final WeakReference a;

    public l1d(m1d m1dVar) {
        this.a = new WeakReference(m1dVar);
    }

    @Override
    public final void a() {
        m1d m1dVar = (m1d) this.a.get();
        if (m1dVar == null) {
            return;
        }
        m1dVar.g();
    }
}
