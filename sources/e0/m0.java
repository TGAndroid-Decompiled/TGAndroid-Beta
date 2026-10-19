package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class m0 {
    public CharSequence f8130a;
    public IconCompat f8131b;
    public String f8132c;
    public String d;
    public boolean e;
    public boolean f8133f;

    public static m0 a(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        if (bundle2 != null) {
            iconCompat = IconCompat.a(bundle2);
        } else {
            iconCompat = null;
        }
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z10 = bundle.getBoolean("isBot");
        boolean z11 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.f8130a = charSequence;
        obj.f8131b = iconCompat;
        obj.f8132c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f8133f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8130a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8130a);
        IconCompat iconCompat = this.f8131b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8132c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f8133f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        String str = this.d;
        String str2 = m0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f8130a), Objects.toString(m0Var.f8130a)) || !Objects.equals(this.f8132c, m0Var.f8132c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(m0Var.e)) || !Boolean.valueOf(this.f8133f).equals(Boolean.valueOf(m0Var.f8133f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f8130a, this.f8132c, Boolean.valueOf(this.e), Boolean.valueOf(this.f8133f));
    }
}
