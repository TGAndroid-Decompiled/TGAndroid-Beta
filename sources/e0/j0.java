package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class j0 {
    public CharSequence f10260a;
    public IconCompat f10261b;
    public String f10262c;
    public String d;
    public boolean f10263e;
    public boolean f10264f;

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
        obj.f10260a = charSequence;
        obj.f10261b = iconCompat;
        obj.f10262c = string;
        obj.d = string2;
        obj.f10263e = z10;
        obj.f10264f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f10260a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f10260a);
        IconCompat iconCompat = this.f10261b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f10262c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f10263e);
        bundle2.putBoolean("isImportant", this.f10264f);
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
            if (!Objects.equals(Objects.toString(this.f10260a), Objects.toString(j0Var.f10260a)) || !Objects.equals(this.f10262c, j0Var.f10262c) || !Boolean.valueOf(this.f10263e).equals(Boolean.valueOf(j0Var.f10263e)) || !Boolean.valueOf(this.f10264f).equals(Boolean.valueOf(j0Var.f10264f))) {
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
        return Objects.hash(this.f10260a, this.f10262c, Boolean.valueOf(this.f10263e), Boolean.valueOf(this.f10264f));
    }
}
