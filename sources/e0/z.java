package e0;

import android.os.Bundle;
public abstract class z {
    public r f6086a;
    public CharSequence f6087b;
    public CharSequence f6088c;
    public boolean d = false;

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.f6088c);
        }
        CharSequence charSequence = this.f6087b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(cc.f fVar);

    public String c() {
        return null;
    }
}
