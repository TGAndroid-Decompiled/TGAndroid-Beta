package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f8467a;
    public IconCompat f8468b;
    public String f8469c;
    public String d;
    public boolean f8470e;
    public boolean f8471f;

    public static p0 a(Bundle bundle) {
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
        obj.f8467a = charSequence;
        obj.f8468b = iconCompat;
        obj.f8469c = string;
        obj.d = string2;
        obj.f8470e = z10;
        obj.f8471f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8467a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8467a);
        IconCompat iconCompat = this.f8468b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8469c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f8470e);
        bundle2.putBoolean("isImportant", this.f8471f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        String str = this.d;
        String str2 = p0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f8467a), Objects.toString(p0Var.f8467a)) || !Objects.equals(this.f8469c, p0Var.f8469c) || !Boolean.valueOf(this.f8470e).equals(Boolean.valueOf(p0Var.f8470e)) || !Boolean.valueOf(this.f8471f).equals(Boolean.valueOf(p0Var.f8471f))) {
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
        return Objects.hash(this.f8467a, this.f8469c, Boolean.valueOf(this.f8470e), Boolean.valueOf(this.f8471f));
    }
}
