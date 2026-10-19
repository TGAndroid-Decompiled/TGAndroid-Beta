package e0;

import android.os.Bundle;
public abstract class y {
    public q f8170a;
    public CharSequence f8171b;
    public CharSequence f8172c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f8172c);
        }
        CharSequence charSequence = this.f8171b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(f0 f0Var);

    public String c() {
        return null;
    }
}
