package n7;

import java.util.Arrays;
public final class we {
    public final Boolean f15785a;
    public final Boolean f15786b;
    public final Boolean f15787c;
    public final Boolean d;
    public final Boolean f15788e;

    public we(c5.j jVar) {
        this.f15785a = (Boolean) jVar.f2315a;
        this.f15786b = (Boolean) jVar.f2316b;
        this.f15787c = (Boolean) jVar.f2317c;
        this.d = (Boolean) jVar.d;
        this.f15788e = (Boolean) jVar.f2318e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (b6.m.l(this.f15785a, weVar.f15785a) && b6.m.l(this.f15786b, weVar.f15786b) && b6.m.l(this.f15787c, weVar.f15787c) && b6.m.l(this.d, weVar.d) && b6.m.l(this.f15788e, weVar.f15788e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15785a, this.f15786b, this.f15787c, this.d, this.f15788e});
    }
}
