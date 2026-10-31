package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class l0 {
    public CharSequence f6045a;
    public IconCompat f6046b;
    public String f6047c;
    public String d;
    public boolean e;
    public boolean f6048f;

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
        obj.f6045a = charSequence;
        obj.f6046b = iconCompat;
        obj.f6047c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f6048f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f6045a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f6045a);
        IconCompat iconCompat = this.f6046b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f6047c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f6048f);
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
            if (!Objects.equals(Objects.toString(this.f6045a), Objects.toString(l0Var.f6045a)) || !Objects.equals(this.f6047c, l0Var.f6047c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(l0Var.e)) || !Boolean.valueOf(this.f6048f).equals(Boolean.valueOf(l0Var.f6048f))) {
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
        return Objects.hash(this.f6045a, this.f6047c, Boolean.valueOf(this.e), Boolean.valueOf(this.f6048f));
    }
}
