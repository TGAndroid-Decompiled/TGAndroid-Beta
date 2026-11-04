package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class k0 {
    public CharSequence f9264a;
    public IconCompat f9265b;
    public String f9266c;
    public String d;
    public boolean f9267e;
    public boolean f9268f;

    public static k0 a(Bundle bundle) {
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
        obj.f9264a = charSequence;
        obj.f9265b = iconCompat;
        obj.f9266c = string;
        obj.d = string2;
        obj.f9267e = z10;
        obj.f9268f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f9264a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f9264a);
        IconCompat iconCompat = this.f9265b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f9266c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f9267e);
        bundle2.putBoolean("isImportant", this.f9268f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        String str = this.d;
        String str2 = k0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f9264a), Objects.toString(k0Var.f9264a)) || !Objects.equals(this.f9266c, k0Var.f9266c) || !Boolean.valueOf(this.f9267e).equals(Boolean.valueOf(k0Var.f9267e)) || !Boolean.valueOf(this.f9268f).equals(Boolean.valueOf(k0Var.f9268f))) {
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
        return Objects.hash(this.f9264a, this.f9266c, Boolean.valueOf(this.f9267e), Boolean.valueOf(this.f9268f));
    }
}
