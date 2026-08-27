package n4;

import h7.e0;
import java.util.Arrays;

public final class b {

    public final String f18214a;

    public final String f18215b;

    public final int f18216c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f18214a = str;
        this.f18215b = str2;
        this.f18216c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18216c == bVar.f18216c && this.d == bVar.d && e0.a(this.f18214a, bVar.f18214a) && e0.a(this.f18215b, bVar.f18215b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18214a, this.f18215b, Integer.valueOf(this.f18216c), Integer.valueOf(this.d)});
    }
}
