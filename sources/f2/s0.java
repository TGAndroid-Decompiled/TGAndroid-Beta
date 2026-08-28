package f2;

import android.database.Observable;
public final class s0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((t0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i9, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((t0) ((Observable) this).mObservers.get(size)).e(i9, i10);
        }
    }

    public final void d(int i9, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((t0) ((Observable) this).mObservers.get(size)).c(i9, i10, obj);
        }
    }

    public final void e(int i9, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((t0) ((Observable) this).mObservers.get(size)).d(i9, i10);
        }
    }

    public final void f(int i9, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((t0) ((Observable) this).mObservers.get(size)).f(i9, i10);
        }
    }
}
