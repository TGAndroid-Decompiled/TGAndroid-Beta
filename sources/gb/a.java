package gb;

import a5.n;
import java.util.Arrays;
import y5.l;

public final class a {

    public final String f6835a;

    public final float f6836b;

    public final int f6837c;
    public final String d;

    public a(float f10, int i10, String str, String str2) {
        int i11 = j7.b.f12741a;
        this.f6835a = str == null ? "" : str;
        this.f6836b = f10;
        this.f6837c = i10;
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
        return l.l(this.f6835a, aVar.f6835a) && Float.compare(this.f6836b, aVar.f6836b) == 0 && this.f6837c == aVar.f6837c && l.l(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6835a, Float.valueOf(this.f6836b), Integer.valueOf(this.f6837c), this.d});
    }

    public final String toString() {
        n nVar = new n(a.class.getSimpleName(), 29);
        n nVar2 = new n(28, false);
        ((n) nVar.d).d = nVar2;
        nVar.d = nVar2;
        nVar2.f101c = this.f6835a;
        nVar2.f100b = "text";
        String strValueOf = String.valueOf(this.f6836b);
        boolean z10 = false;
        j7.a aVar = new j7.a(28, z10);
        ((n) nVar.d).d = aVar;
        nVar.d = aVar;
        aVar.f101c = strValueOf;
        aVar.f100b = "confidence";
        String strValueOf2 = String.valueOf(this.f6837c);
        j7.a aVar2 = new j7.a(28, z10);
        ((n) nVar.d).d = aVar2;
        aVar2.f101c = strValueOf2;
        aVar2.f100b = "index";
        n nVar3 = new n(28, z10);
        aVar2.d = nVar3;
        nVar.d = nVar3;
        nVar3.f101c = this.d;
        nVar3.f100b = "mid";
        return nVar.toString();
    }
}
