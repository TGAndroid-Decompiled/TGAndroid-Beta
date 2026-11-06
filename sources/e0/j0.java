package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class j0 {
    public CharSequence f10077a;
    public IconCompat f10078b;
    public String f10079c;
    public String d;
    public boolean f10080e;
    public boolean f10081f;

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
        boolean z9 = bundle.getBoolean("isBot");
        boolean z10 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.f10077a = charSequence;
        obj.f10078b = iconCompat;
        obj.f10079c = string;
        obj.d = string2;
        obj.f10080e = z9;
        obj.f10081f = z10;
        return obj;
    }

    public final CharSequence b() {
        return this.f10077a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f10077a);
        IconCompat iconCompat = this.f10078b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f10079c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f10080e);
        bundle2.putBoolean("isImportant", this.f10081f);
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
            if (!Objects.equals(Objects.toString(this.f10077a), Objects.toString(j0Var.f10077a)) || !Objects.equals(this.f10079c, j0Var.f10079c) || !Boolean.valueOf(this.f10080e).equals(Boolean.valueOf(j0Var.f10080e)) || !Boolean.valueOf(this.f10081f).equals(Boolean.valueOf(j0Var.f10081f))) {
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
        return Objects.hash(this.f10077a, this.f10079c, Boolean.valueOf(this.f10080e), Boolean.valueOf(this.f10081f));
    }
}
