package defpackage;

import android.os.Bundle;
public abstract class jn7 {
    public an7 a;
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

    public abstract void b(p41 p41Var);

    public String c() {
        return null;
    }
}
