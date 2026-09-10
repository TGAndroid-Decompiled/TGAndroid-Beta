package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f7124a;
    public IconCompat f7125b;
    public String f7126c;
    public String d;
    public boolean e;
    public boolean f7127f;

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
        obj.f7124a = charSequence;
        obj.f7125b = iconCompat;
        obj.f7126c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f7127f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f7124a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f7124a);
        IconCompat iconCompat = this.f7125b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f7126c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f7127f);
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
            if (!Objects.equals(Objects.toString(this.f7124a), Objects.toString(p0Var.f7124a)) || !Objects.equals(this.f7126c, p0Var.f7126c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(p0Var.e)) || !Boolean.valueOf(this.f7127f).equals(Boolean.valueOf(p0Var.f7127f))) {
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
        return Objects.hash(this.f7124a, this.f7126c, Boolean.valueOf(this.e), Boolean.valueOf(this.f7127f));
    }
}
