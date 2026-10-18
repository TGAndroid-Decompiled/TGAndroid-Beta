package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class m0 {
    public CharSequence f8133a;
    public IconCompat f8134b;
    public String f8135c;
    public String d;
    public boolean e;
    public boolean f8136f;

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
        obj.f8133a = charSequence;
        obj.f8134b = iconCompat;
        obj.f8135c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f8136f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8133a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8133a);
        IconCompat iconCompat = this.f8134b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8135c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f8136f);
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
            if (!Objects.equals(Objects.toString(this.f8133a), Objects.toString(m0Var.f8133a)) || !Objects.equals(this.f8135c, m0Var.f8135c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(m0Var.e)) || !Boolean.valueOf(this.f8136f).equals(Boolean.valueOf(m0Var.f8136f))) {
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
        return Objects.hash(this.f8133a, this.f8135c, Boolean.valueOf(this.e), Boolean.valueOf(this.f8136f));
    }
}
