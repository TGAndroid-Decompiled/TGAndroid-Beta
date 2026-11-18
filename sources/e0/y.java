package e0;

import android.os.Bundle;
public abstract class y {
    public q f10277a;
    public CharSequence f10278b;
    public CharSequence f10279c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f10279c);
        }
        CharSequence charSequence = this.f10278b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(a4.k kVar);

    public String c() {
        return null;
    }
}
