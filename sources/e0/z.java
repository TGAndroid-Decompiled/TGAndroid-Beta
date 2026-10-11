package e0;

import android.os.Bundle;
public abstract class z {
    public r f8497a;
    public CharSequence f8498b;
    public CharSequence f8499c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f8499c);
        }
        CharSequence charSequence = this.f8498b;
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
