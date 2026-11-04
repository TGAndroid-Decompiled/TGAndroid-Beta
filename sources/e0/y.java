package e0;

import android.os.Bundle;
public abstract class y {
    public q f9310a;
    public CharSequence f9311b;
    public CharSequence f9312c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f9312c);
        }
        CharSequence charSequence = this.f9311b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c2 = c();
        if (c2 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c2);
        }
    }

    public abstract void b(e0 e0Var);

    public String c() {
        return null;
    }
}
