package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class n0 {
    public CharSequence f8454a;
    public IconCompat f8455b;
    public String f8456c;
    public String d;
    public boolean f8457e;
    public boolean f8458f;

    public static n0 a(Bundle bundle) {
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
        obj.f8454a = charSequence;
        obj.f8455b = iconCompat;
        obj.f8456c = string;
        obj.d = string2;
        obj.f8457e = z10;
        obj.f8458f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8454a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8454a);
        IconCompat iconCompat = this.f8455b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8456c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f8457e);
        bundle2.putBoolean("isImportant", this.f8458f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        String str = this.d;
        String str2 = n0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f8454a), Objects.toString(n0Var.f8454a)) || !Objects.equals(this.f8456c, n0Var.f8456c) || !Boolean.valueOf(this.f8457e).equals(Boolean.valueOf(n0Var.f8457e)) || !Boolean.valueOf(this.f8458f).equals(Boolean.valueOf(n0Var.f8458f))) {
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
        return Objects.hash(this.f8454a, this.f8456c, Boolean.valueOf(this.f8457e), Boolean.valueOf(this.f8458f));
    }
}
