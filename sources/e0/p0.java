package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f4749a;
    public IconCompat f4750b;
    public String f4751c;
    public String d;
    public boolean f4752e;
    public boolean f4753f;

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
        obj.f4749a = charSequence;
        obj.f4750b = iconCompat;
        obj.f4751c = string;
        obj.d = string2;
        obj.f4752e = z10;
        obj.f4753f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f4749a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f4749a);
        IconCompat iconCompat = this.f4750b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f4751c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f4752e);
        bundle2.putBoolean("isImportant", this.f4753f);
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
            if (!Objects.equals(Objects.toString(this.f4749a), Objects.toString(p0Var.f4749a)) || !Objects.equals(this.f4751c, p0Var.f4751c) || !Boolean.valueOf(this.f4752e).equals(Boolean.valueOf(p0Var.f4752e)) || !Boolean.valueOf(this.f4753f).equals(Boolean.valueOf(p0Var.f4753f))) {
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
        return Objects.hash(this.f4749a, this.f4751c, Boolean.valueOf(this.f4752e), Boolean.valueOf(this.f4753f));
    }
}
