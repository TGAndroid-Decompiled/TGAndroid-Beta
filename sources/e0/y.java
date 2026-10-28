package e0;

import android.os.Bundle;
public abstract class y {
    public q f9604a;
    public CharSequence f9605b;
    public CharSequence f9606c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f9606c);
        }
        CharSequence charSequence = this.f9605b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(e0 e0Var);

    public String c() {
        return null;
    }
}
