package f2;

import android.database.Observable;

public final class r0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((s0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((s0) ((Observable) this).mObservers.get(size)).e(i10, i11);
        }
    }

    public final void d(int i10, int i11, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((s0) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
        }
    }

    public final void e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((s0) ((Observable) this).mObservers.get(size)).d(i10, i11);
        }
    }

    public final void f(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((s0) ((Observable) this).mObservers.get(size)).f(i10, i11);
        }
    }
}
