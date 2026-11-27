package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class az3 extends dx3 {
    public final WeakReference a;

    public az3(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        bz3.a((EditText) this.a.get(), 1);
    }
}
