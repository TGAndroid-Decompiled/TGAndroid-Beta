package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
public final class zic {
    public final WeakReference a;

    public zic(View view) {
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

    public final void d(cjc cjcVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (cjcVar != null) {
                view.animate().setListener(new wd8((Object) cjcVar, view, (byte) 21));
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
