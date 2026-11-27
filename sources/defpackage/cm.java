package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
public final class cm implements em {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public hm d;
    public Rect e;
    public wl f;
    public lv3 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public cm(View view, boolean z) {
        this.a = new WeakReference(view);
        this.b = z;
    }

    @Override
    public final void invalidate() {
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        if (this.b && view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        } else {
            view.invalidate();
        }
    }
}
