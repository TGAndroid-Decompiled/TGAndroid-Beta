package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class m0 {
    public CharSequence f8132a;
    public IconCompat f8133b;
    public String f8134c;
    public String d;
    public boolean e;
    public boolean f8135f;

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
        obj.f8132a = charSequence;
        obj.f8133b = iconCompat;
        obj.f8134c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f8135f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8132a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8132a);
        IconCompat iconCompat = this.f8133b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8134c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f8135f);
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
            if (!Objects.equals(Objects.toString(this.f8132a), Objects.toString(m0Var.f8132a)) || !Objects.equals(this.f8134c, m0Var.f8134c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(m0Var.e)) || !Boolean.valueOf(this.f8135f).equals(Boolean.valueOf(m0Var.f8135f))) {
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
        return Objects.hash(this.f8132a, this.f8134c, Boolean.valueOf(this.e), Boolean.valueOf(this.f8135f));
    }
}
