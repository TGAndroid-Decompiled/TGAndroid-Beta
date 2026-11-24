package defpackage;

import android.os.Bundle;
public abstract class gl7 {
    public xk7 a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.c);
        }
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c = c();
        if (c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
        }
    }

    public abstract void b(h31 h31Var);

    public String c() {
        return null;
    }
}
