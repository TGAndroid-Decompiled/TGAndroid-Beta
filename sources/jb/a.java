package jb;

import b6.m;
import java.util.Arrays;
import l7.w0;
public final class a {
    public final String f9989a;
    public final float f9990b;
    public final int f9991c;
    public final String d;

    public a(float f10, int i10, String str, String str2) {
        int i11 = m7.b.f13480a;
        this.f9989a = str == null ? "" : str;
        this.f9990b = f10;
        this.f9991c = i10;
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
        if (m.l(this.f9989a, aVar.f9989a) && Float.compare(this.f9990b, aVar.f9990b) == 0 && this.f9991c == aVar.f9991c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9989a, Float.valueOf(this.f9990b), Integer.valueOf(this.f9991c), this.d});
    }

    public final String toString() {
        w0 w0Var = new w0(a.class.getSimpleName());
        w0 w0Var2 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var2;
        w0Var.d = w0Var2;
        w0Var2.f12081c = this.f9989a;
        w0Var2.f12080b = "text";
        String valueOf = String.valueOf(this.f9990b);
        w0 w0Var3 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var3;
        w0Var.d = w0Var3;
        w0Var3.f12081c = valueOf;
        w0Var3.f12080b = "confidence";
        String valueOf2 = String.valueOf(this.f9991c);
        w0 w0Var4 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var4;
        w0Var4.f12081c = valueOf2;
        w0Var4.f12080b = "index";
        w0 w0Var5 = new w0(4, false);
        w0Var4.d = w0Var5;
        w0Var.d = w0Var5;
        w0Var5.f12081c = this.d;
        w0Var5.f12080b = "mid";
        return w0Var.toString();
    }
}
