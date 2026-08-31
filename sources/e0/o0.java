package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class o0 {
    public CharSequence f4835a;
    public IconCompat f4836b;
    public String f4837c;
    public String d;
    public boolean f4838e;
    public boolean f4839f;

    public static o0 a(Bundle bundle) {
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
        boolean z4 = bundle.getBoolean("isBot");
        boolean z10 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.f4835a = charSequence;
        obj.f4836b = iconCompat;
        obj.f4837c = string;
        obj.d = string2;
        obj.f4838e = z4;
        obj.f4839f = z10;
        return obj;
    }

    public final CharSequence b() {
        return this.f4835a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f4835a);
        IconCompat iconCompat = this.f4836b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f4837c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f4838e);
        bundle2.putBoolean("isImportant", this.f4839f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        String str = this.d;
        String str2 = o0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f4835a), Objects.toString(o0Var.f4835a)) || !Objects.equals(this.f4837c, o0Var.f4837c) || !Boolean.valueOf(this.f4838e).equals(Boolean.valueOf(o0Var.f4838e)) || !Boolean.valueOf(this.f4839f).equals(Boolean.valueOf(o0Var.f4839f))) {
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
        return Objects.hash(this.f4835a, this.f4837c, Boolean.valueOf(this.f4838e), Boolean.valueOf(this.f4839f));
    }
}
