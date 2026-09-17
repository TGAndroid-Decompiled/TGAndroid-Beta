package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f8667a;
    public IconCompat f8668b;
    public String f8669c;
    public String d;
    public boolean f8670e;
    public boolean f8671f;

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
        obj.f8667a = charSequence;
        obj.f8668b = iconCompat;
        obj.f8669c = string;
        obj.d = string2;
        obj.f8670e = z10;
        obj.f8671f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8667a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8667a);
        IconCompat iconCompat = this.f8668b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8669c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f8670e);
        bundle2.putBoolean("isImportant", this.f8671f);
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
            if (!Objects.equals(Objects.toString(this.f8667a), Objects.toString(p0Var.f8667a)) || !Objects.equals(this.f8669c, p0Var.f8669c) || !Boolean.valueOf(this.f8670e).equals(Boolean.valueOf(p0Var.f8670e)) || !Boolean.valueOf(this.f8671f).equals(Boolean.valueOf(p0Var.f8671f))) {
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
        return Objects.hash(this.f8667a, this.f8669c, Boolean.valueOf(this.f8670e), Boolean.valueOf(this.f8671f));
    }
}
