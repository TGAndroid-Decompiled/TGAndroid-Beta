package n4;

import g7.c0;
import java.util.Arrays;
public final class b {
    public final String f18387a;
    public final String f18388b;
    public final int f18389c;
    public final int d;

    public b(int i9, int i10, String str, String str2) {
        this.f18387a = str;
        this.f18388b = str2;
        this.f18389c = i9;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f18389c == bVar.f18389c && this.d == bVar.d && c0.a(this.f18387a, bVar.f18387a) && c0.a(this.f18388b, bVar.f18388b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18387a, this.f18388b, Integer.valueOf(this.f18389c), Integer.valueOf(this.d)});
    }
}
