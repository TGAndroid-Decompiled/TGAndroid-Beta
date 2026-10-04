package e0;

import android.os.Bundle;
public abstract class b0 {
    public t f8403a;
    public CharSequence f8404b;
    public CharSequence f8405c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f8405c);
        }
        CharSequence charSequence = this.f8404b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(i0 i0Var);

    public String c() {
        return null;
    }
}
