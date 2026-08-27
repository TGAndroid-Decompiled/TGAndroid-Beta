package e0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

public final class p0 {

    public CharSequence f5106a;

    public IconCompat f5107b;

    public String f5108c;
    public String d;

    public boolean f5109e;

    public boolean f5110f;

    public static p0 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z10 = bundle.getBoolean("isBot");
        boolean z11 = bundle.getBoolean("isImportant");
        p0 p0Var = new p0();
        p0Var.f5106a = charSequence;
        p0Var.f5107b = iconCompatA;
        p0Var.f5108c = string;
        p0Var.d = string2;
        p0Var.f5109e = z10;
        p0Var.f5110f = z11;
        return p0Var;
    }

    public final CharSequence b() {
        return this.f5106a;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f5106a);
        IconCompat iconCompat = this.f5107b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.l() : null);
        bundle.putString("uri", this.f5108c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.f5109e);
        bundle.putBoolean("isImportant", this.f5110f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        String str = this.d;
        String str2 = p0Var.d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f5106a), Objects.toString(p0Var.f5106a)) && Objects.equals(this.f5108c, p0Var.f5108c) && Boolean.valueOf(this.f5109e).equals(Boolean.valueOf(p0Var.f5109e)) && Boolean.valueOf(this.f5110f).equals(Boolean.valueOf(p0Var.f5110f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.f5106a, this.f5108c, Boolean.valueOf(this.f5109e), Boolean.valueOf(this.f5110f));
    }
}
