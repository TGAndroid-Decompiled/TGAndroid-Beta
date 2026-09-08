package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f8695a;
    public IconCompat f8696b;
    public String f8697c;
    public String d;
    public boolean f8698e;
    public boolean f8699f;

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
        obj.f8695a = charSequence;
        obj.f8696b = iconCompat;
        obj.f8697c = string;
        obj.d = string2;
        obj.f8698e = z10;
        obj.f8699f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8695a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8695a);
        IconCompat iconCompat = this.f8696b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8697c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f8698e);
        bundle2.putBoolean("isImportant", this.f8699f);
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
            if (!Objects.equals(Objects.toString(this.f8695a), Objects.toString(p0Var.f8695a)) || !Objects.equals(this.f8697c, p0Var.f8697c) || !Boolean.valueOf(this.f8698e).equals(Boolean.valueOf(p0Var.f8698e)) || !Boolean.valueOf(this.f8699f).equals(Boolean.valueOf(p0Var.f8699f))) {
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
        return Objects.hash(this.f8695a, this.f8697c, Boolean.valueOf(this.f8698e), Boolean.valueOf(this.f8699f));
    }
}
