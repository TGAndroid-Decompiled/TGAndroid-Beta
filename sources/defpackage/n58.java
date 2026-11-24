package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class n58 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static n58 a(Bundle bundle) {
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
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.a = charSequence;
        obj.b = iconCompat;
        obj.c = string;
        obj.d = string2;
        obj.e = z;
        obj.f = z2;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n58)) {
            return false;
        }
        n58 n58Var = (n58) obj;
        String str = this.d;
        String str2 = n58Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.a), Objects.toString(n58Var.a)) || !Objects.equals(this.c, n58Var.c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(n58Var.e)) || !Boolean.valueOf(this.f).equals(Boolean.valueOf(n58Var.f))) {
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
        return Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
