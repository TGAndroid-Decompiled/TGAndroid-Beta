package e0;

import android.os.Bundle;
public abstract class b0 {
    public t f7753a;
    public CharSequence f7754b;
    public CharSequence f7755c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f7755c);
        }
        CharSequence charSequence = this.f7754b;
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
