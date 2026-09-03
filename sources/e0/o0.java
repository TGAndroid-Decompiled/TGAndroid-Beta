package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
public final class o0 {
    public CharSequence f5012a;
    public IconCompat f5013b;
    public String f5014c;
    public String d;
    public boolean e;
    public boolean f5015f;

    public static o0 a(Bundle bundle) {
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
        boolean z4 = bundle.getBoolean("isBot");
        boolean z10 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.f5012a = charSequence;
        obj.f5013b = iconCompat;
        obj.f5014c = string;
        obj.d = string2;
        obj.e = z4;
        obj.f5015f = z10;
        return obj;
    }

    public final CharSequence b() {
        return this.f5012a;
    }

    public final Bundle c() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f5012a);
        IconCompat iconCompat = this.f5013b;
        if (iconCompat != null) {
            bundle = iconCompat.l();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f5014c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f5015f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        String str = this.d;
        String str2 = o0Var.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f5012a), Objects.toString(o0Var.f5012a)) || !Objects.equals(this.f5014c, o0Var.f5014c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(o0Var.e)) || !Boolean.valueOf(this.f5015f).equals(Boolean.valueOf(o0Var.f5015f))) {
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
        return Objects.hash(this.f5012a, this.f5014c, Boolean.valueOf(this.e), Boolean.valueOf(this.f5015f));
    }
}
