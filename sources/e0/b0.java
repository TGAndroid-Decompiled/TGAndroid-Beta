package e0;

import android.os.Bundle;
public abstract class b0 {
    public t f4775a;
    public CharSequence f4776b;
    public CharSequence f4777c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f4777c);
        }
        CharSequence charSequence = this.f4776b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c3 = c();
        if (c3 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c3);
        }
    }

    public abstract void b(a4.k kVar);

    public String c() {
        return null;
    }
}
