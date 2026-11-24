package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
public final class afc {
    public final WeakReference a;

    public afc(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(dfc dfcVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (dfcVar != null) {
                view.animate().setListener(new eh8((Object) dfcVar, view, (byte) 20));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
