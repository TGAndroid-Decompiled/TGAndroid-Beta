package e0;

import android.os.Bundle;
public abstract class b0 {
    public t f5655a;
    public CharSequence f5656b;
    public CharSequence f5657c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f5657c);
        }
        CharSequence charSequence = this.f5656b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c3 = c();
        if (c3 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c3);
        }
    }

    public abstract void b(i0 i0Var);

    public String c() {
        return null;
    }
}
