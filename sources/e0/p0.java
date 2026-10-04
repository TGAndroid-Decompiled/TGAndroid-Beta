package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f8468a;
    public IconCompat f8469b;
    public String f8470c;
    public String d;
    public boolean f8471e;
    public boolean f8472f;

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
        obj.f8468a = charSequence;
        obj.f8469b = iconCompat;
        obj.f8470c = string;
        obj.d = string2;
        obj.f8471e = z10;
        obj.f8472f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8468a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8468a);
        IconCompat iconCompat = this.f8469b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8470c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f8471e);
        bundle2.putBoolean("isImportant", this.f8472f);
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
            if (!Objects.equals(Objects.toString(this.f8468a), Objects.toString(p0Var.f8468a)) || !Objects.equals(this.f8470c, p0Var.f8470c) || !Boolean.valueOf(this.f8471e).equals(Boolean.valueOf(p0Var.f8471e)) || !Boolean.valueOf(this.f8472f).equals(Boolean.valueOf(p0Var.f8472f))) {
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
        return Objects.hash(this.f8468a, this.f8470c, Boolean.valueOf(this.f8471e), Boolean.valueOf(this.f8472f));
    }
}
