package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class j0 {
    public CharSequence f9913a;
    public IconCompat f9914b;
    public String f9915c;
    public String d;
    public boolean f9916e;
    public boolean f9917f;

    public static j0 a(Bundle bundle) {
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
        obj.f9913a = charSequence;
        obj.f9914b = iconCompat;
        obj.f9915c = string;
        obj.d = string2;
        obj.f9916e = z10;
        obj.f9917f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f9913a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f9913a);
        IconCompat iconCompat = this.f9914b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f9915c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f9916e);
        bundle2.putBoolean("isImportant", this.f9917f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        String str = this.d;
        String str2 = j0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f9913a), Objects.toString(j0Var.f9913a)) || !Objects.equals(this.f9915c, j0Var.f9915c) || !Boolean.valueOf(this.f9916e).equals(Boolean.valueOf(j0Var.f9916e)) || !Boolean.valueOf(this.f9917f).equals(Boolean.valueOf(j0Var.f9917f))) {
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
        return Objects.hash(this.f9913a, this.f9915c, Boolean.valueOf(this.f9916e), Boolean.valueOf(this.f9917f));
    }
}
