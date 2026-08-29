package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class p0 {
    public CharSequence f5719a;
    public IconCompat f5720b;
    public String f5721c;
    public String d;
    public boolean f5722e;
    public boolean f5723f;

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
        obj.f5719a = charSequence;
        obj.f5720b = iconCompat;
        obj.f5721c = string;
        obj.d = string2;
        obj.f5722e = z10;
        obj.f5723f = z11;
        return obj;
    }

    public final CharSequence b() {
        return this.f5719a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f5719a);
        IconCompat iconCompat = this.f5720b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f5721c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.f5722e);
        bundle2.putBoolean("isImportant", this.f5723f);
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
            if (!Objects.equals(Objects.toString(this.f5719a), Objects.toString(p0Var.f5719a)) || !Objects.equals(this.f5721c, p0Var.f5721c) || !Boolean.valueOf(this.f5722e).equals(Boolean.valueOf(p0Var.f5722e)) || !Boolean.valueOf(this.f5723f).equals(Boolean.valueOf(p0Var.f5723f))) {
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
        return Objects.hash(this.f5719a, this.f5721c, Boolean.valueOf(this.f5722e), Boolean.valueOf(this.f5723f));
    }
}
