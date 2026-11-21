package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class j0 {
    public CharSequence f10257a;
    public IconCompat f10258b;
    public String f10259c;
    public String d;
    public boolean f10260e;
    public boolean f10261f;

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
        obj.f10257a = charSequence;
        obj.f10258b = iconCompat;
        obj.f10259c = string;
        obj.d = string2;
        obj.f10260e = z10;
        obj.f10261f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f10257a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f10257a);
        IconCompat iconCompat = this.f10258b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f10259c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f10260e);
        bundle2.putBoolean("isImportant", this.f10261f);
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
            if (!Objects.equals(Objects.toString(this.f10257a), Objects.toString(j0Var.f10257a)) || !Objects.equals(this.f10259c, j0Var.f10259c) || !Boolean.valueOf(this.f10260e).equals(Boolean.valueOf(j0Var.f10260e)) || !Boolean.valueOf(this.f10261f).equals(Boolean.valueOf(j0Var.f10261f))) {
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
        return Objects.hash(this.f10257a, this.f10259c, Boolean.valueOf(this.f10260e), Boolean.valueOf(this.f10261f));
    }
}
