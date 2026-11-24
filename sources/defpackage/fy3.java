package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class fy3 extends iw3 {
    public final WeakReference a;

    public fy3(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        gy3.a((EditText) this.a.get(), 1);
    }
}
