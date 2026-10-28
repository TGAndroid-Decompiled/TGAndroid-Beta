package a8;

import java.util.Arrays;
public final class ab {
    public final za f356a;
    public final Integer f357b;

    public ab(n4.s sVar) {
        this.f356a = (za) sVar.f18695b;
        this.f357b = (Integer) sVar.f18696c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (o6.l.l(this.f356a, abVar.f356a) && o6.l.l(this.f357b, abVar.f357b) && o6.l.l(null, null) && o6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f356a, this.f357b, null, null});
    }
}
