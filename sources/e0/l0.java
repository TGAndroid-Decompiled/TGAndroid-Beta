package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class l0 {
    public CharSequence f9564a;
    public IconCompat f9565b;
    public String f9566c;
    public String d;
    public boolean e;
    public boolean f9567f;

    public static l0 a(Bundle bundle) {
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
        obj.f9564a = charSequence;
        obj.f9565b = iconCompat;
        obj.f9566c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f9567f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f9564a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f9564a);
        IconCompat iconCompat = this.f9565b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f9566c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f9567f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        String str = this.d;
        String str2 = l0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f9564a), Objects.toString(l0Var.f9564a)) || !Objects.equals(this.f9566c, l0Var.f9566c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(l0Var.e)) || !Boolean.valueOf(this.f9567f).equals(Boolean.valueOf(l0Var.f9567f))) {
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
        return Objects.hash(this.f9564a, this.f9566c, Boolean.valueOf(this.e), Boolean.valueOf(this.f9567f));
    }
}
