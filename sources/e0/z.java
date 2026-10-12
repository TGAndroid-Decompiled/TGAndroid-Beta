package e0;

import android.os.Bundle;
public abstract class z {
    public r f8292a;
    public CharSequence f8293b;
    public CharSequence f8294c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f8294c);
        }
        CharSequence charSequence = this.f8293b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(g0 g0Var);

    public String c() {
        return null;
    }
}
