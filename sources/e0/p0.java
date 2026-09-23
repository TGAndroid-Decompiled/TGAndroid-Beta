package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f7807a;
    public IconCompat f7808b;
    public String f7809c;
    public String d;
    public boolean e;
    public boolean f7810f;

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
        obj.f7807a = charSequence;
        obj.f7808b = iconCompat;
        obj.f7809c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f7810f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f7807a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f7807a);
        IconCompat iconCompat = this.f7808b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f7809c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f7810f);
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
            if (!Objects.equals(Objects.toString(this.f7807a), Objects.toString(p0Var.f7807a)) || !Objects.equals(this.f7809c, p0Var.f7809c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(p0Var.e)) || !Boolean.valueOf(this.f7810f).equals(Boolean.valueOf(p0Var.f7810f))) {
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
        return Objects.hash(this.f7807a, this.f7809c, Boolean.valueOf(this.e), Boolean.valueOf(this.f7810f));
    }
}
