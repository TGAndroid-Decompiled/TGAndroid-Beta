package e0;

import android.os.Bundle;
public abstract class z {
    public r f8495a;
    public CharSequence f8496b;
    public CharSequence f8497c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f8497c);
        }
        CharSequence charSequence = this.f8496b;
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
