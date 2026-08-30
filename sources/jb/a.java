package jb;

import b6.m;
import java.util.Arrays;
import l7.w0;
public final class a {
    public final String f9355a;
    public final float f9356b;
    public final int f9357c;
    public final String d;

    public a(float f10, int i10, String str, String str2) {
        int i11 = m7.b.f13768a;
        this.f9355a = str == null ? "" : str;
        this.f9356b = f10;
        this.f9357c = i10;
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
        if (m.l(this.f9355a, aVar.f9355a) && Float.compare(this.f9356b, aVar.f9356b) == 0 && this.f9357c == aVar.f9357c && m.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9355a, Float.valueOf(this.f9356b), Integer.valueOf(this.f9357c), this.d});
    }

    public final String toString() {
        w0 w0Var = new w0(a.class.getSimpleName());
        w0 w0Var2 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var2;
        w0Var.d = w0Var2;
        w0Var2.f11677c = this.f9355a;
        w0Var2.f11676b = "text";
        String valueOf = String.valueOf(this.f9356b);
        w0 w0Var3 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var3;
        w0Var.d = w0Var3;
        w0Var3.f11677c = valueOf;
        w0Var3.f11676b = "confidence";
        String valueOf2 = String.valueOf(this.f9357c);
        w0 w0Var4 = new w0(4, false);
        ((w0) w0Var.d).d = w0Var4;
        w0Var4.f11677c = valueOf2;
        w0Var4.f11676b = "index";
        w0 w0Var5 = new w0(4, false);
        w0Var4.d = w0Var5;
        w0Var.d = w0Var5;
        w0Var5.f11677c = this.d;
        w0Var5.f11676b = "mid";
        return w0Var.toString();
    }
}
