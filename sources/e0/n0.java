package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class n0 {
    public CharSequence f8453a;
    public IconCompat f8454b;
    public String f8455c;
    public String d;
    public boolean f8456e;
    public boolean f8457f;

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
        obj.f8453a = charSequence;
        obj.f8454b = iconCompat;
        obj.f8455c = string;
        obj.d = string2;
        obj.f8456e = z10;
        obj.f8457f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f8453a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f8453a);
        IconCompat iconCompat = this.f8454b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f8455c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f8456e);
        bundle2.putBoolean("isImportant", this.f8457f);
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
            if (!Objects.equals(Objects.toString(this.f8453a), Objects.toString(n0Var.f8453a)) || !Objects.equals(this.f8455c, n0Var.f8455c) || !Boolean.valueOf(this.f8456e).equals(Boolean.valueOf(n0Var.f8456e)) || !Boolean.valueOf(this.f8457f).equals(Boolean.valueOf(n0Var.f8457f))) {
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
        return Objects.hash(this.f8453a, this.f8455c, Boolean.valueOf(this.f8456e), Boolean.valueOf(this.f8457f));
    }
}
