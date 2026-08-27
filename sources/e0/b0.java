package e0;

import android.os.Bundle;

public abstract class b0 {

    public t f5042a;

    public CharSequence f5043b;

    public CharSequence f5044c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f5044c);
        }
        CharSequence charSequence = this.f5043b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strC = c();
        if (strC != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
    }

    public abstract void b(i0 i0Var);

    public String c() {
        return null;
    }
}
