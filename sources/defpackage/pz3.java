package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class pz3 extends tx3 {
    public final WeakReference a;

    public pz3(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        qz3.a((EditText) this.a.get(), 1);
    }
}
