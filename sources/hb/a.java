package hb;

import androidx.biometric.e;
import java.util.Arrays;
import z5.l;
public final class a {
    public final String f7982a;
    public final float f7983b;
    public final int f7984c;
    public final String d;

    public a(float f9, int i10, String str, String str2) {
        int i11 = k7.b.f13464a;
        this.f7982a = str == null ? "" : str;
        this.f7983b = f9;
        this.f7984c = i10;
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
        if (l.l(this.f7982a, aVar.f7982a) && Float.compare(this.f7983b, aVar.f7983b) == 0 && this.f7984c == aVar.f7984c && l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7982a, Float.valueOf(this.f7983b), Integer.valueOf(this.f7984c), this.d});
    }

    public final String toString() {
        e eVar = new e(a.class.getSimpleName(), 27);
        e eVar2 = new e(26, false);
        ((e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.f1031c = this.f7982a;
        eVar2.f1030b = "text";
        String valueOf = String.valueOf(this.f7983b);
        e eVar3 = new e(26, false);
        ((e) eVar.d).d = eVar3;
        eVar.d = eVar3;
        eVar3.f1031c = valueOf;
        eVar3.f1030b = "confidence";
        String valueOf2 = String.valueOf(this.f7984c);
        e eVar4 = new e(26, false);
        ((e) eVar.d).d = eVar4;
        eVar4.f1031c = valueOf2;
        eVar4.f1030b = "index";
        e eVar5 = new e(26, false);
        eVar4.d = eVar5;
        eVar.d = eVar5;
        eVar5.f1031c = this.d;
        eVar5.f1030b = "mid";
        return eVar.toString();
    }
}
