package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f7823a;
    public IconCompat f7824b;
    public String f7825c;
    public String d;
    public boolean e;
    public boolean f7826f;

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
        obj.f7823a = charSequence;
        obj.f7824b = iconCompat;
        obj.f7825c = string;
        obj.d = string2;
        obj.e = z10;
        obj.f7826f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f7823a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f7823a);
        IconCompat iconCompat = this.f7824b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f7825c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f7826f);
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
            if (!Objects.equals(Objects.toString(this.f7823a), Objects.toString(p0Var.f7823a)) || !Objects.equals(this.f7825c, p0Var.f7825c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(p0Var.e)) || !Boolean.valueOf(this.f7826f).equals(Boolean.valueOf(p0Var.f7826f))) {
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
        return Objects.hash(this.f7823a, this.f7825c, Boolean.valueOf(this.e), Boolean.valueOf(this.f7826f));
    }
}
