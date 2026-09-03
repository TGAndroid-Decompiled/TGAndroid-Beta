package jb;

import b6.m;
import java.util.Arrays;
import l7.w0;
public final class a {
    public final String f9337a;
    public final float f9338b;
    public final int f9339c;
    public final String d;

    public a(float f10, int i10, String str, String str2) {
        int i11 = m7.b.f13752a;
        this.f9337a = str == null ? "" : str;
        this.f9338b = f10;
        this.f9339c = i10;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (m.l(this.f9337a, aVar.f9337a) && Float.compare(this.f9338b, aVar.f9338b) == 0 && this.f9339c == aVar.f9339c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9337a, Float.valueOf(this.f9338b), Integer.valueOf(this.f9339c), this.d});
    }

    public final String toString() {
        w0 w0Var = new w0(a.class.getSimpleName());
        w0 w0Var2 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var2;
        w0Var.d = w0Var2;
        w0Var2.f11787c = this.f9337a;
        w0Var2.f11786b = "text";
        String valueOf = String.valueOf(this.f9338b);
        w0 w0Var3 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var3;
        w0Var.d = w0Var3;
        w0Var3.f11787c = valueOf;
        w0Var3.f11786b = "confidence";
        String valueOf2 = String.valueOf(this.f9339c);
        w0 w0Var4 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var4;
        w0Var4.f11787c = valueOf2;
        w0Var4.f11786b = "index";
        w0 w0Var5 = new w0(4, false);
        w0Var4.d = w0Var5;
        w0Var.d = w0Var5;
        w0Var5.f11787c = this.d;
        w0Var5.f11786b = "mid";
        return w0Var.toString();
    }
}
