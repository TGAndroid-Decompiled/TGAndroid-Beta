package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class n0 {
    public CharSequence f8252a;
    public IconCompat f8253b;
    public String f8254c;
    public String d;
    public boolean e;
    public boolean f8255f;

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
        obj.f8252a = charSequence;
        obj.f8253b = iconCompat;
        obj.f8254c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f8255f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8252a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8252a);
        IconCompat iconCompat = this.f8253b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8254c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f8255f);
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
            if (!Objects.equals(Objects.toString(this.f8252a), Objects.toString(n0Var.f8252a)) || !Objects.equals(this.f8254c, n0Var.f8254c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(n0Var.e)) || !Boolean.valueOf(this.f8255f).equals(Boolean.valueOf(n0Var.f8255f))) {
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
        return Objects.hash(this.f8252a, this.f8254c, Boolean.valueOf(this.e), Boolean.valueOf(this.f8255f));
    }
}
