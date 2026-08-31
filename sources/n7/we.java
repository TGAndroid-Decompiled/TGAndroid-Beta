package n7;

import java.util.Arrays;
public final class we {
    public final Boolean f15783a;
    public final Boolean f15784b;
    public final Boolean f15785c;
    public final Boolean d;
    public final Boolean f15786e;

    public we(c5.j jVar) {
        this.f15783a = (Boolean) jVar.f2315a;
        this.f15784b = (Boolean) jVar.f2316b;
        this.f15785c = (Boolean) jVar.f2317c;
        this.d = (Boolean) jVar.d;
        this.f15786e = (Boolean) jVar.f2318e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (b6.m.l(this.f15783a, weVar.f15783a) && b6.m.l(this.f15784b, weVar.f15784b) && b6.m.l(this.f15785c, weVar.f15785c) && b6.m.l(this.d, weVar.d) && b6.m.l(this.f15786e, weVar.f15786e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15783a, this.f15784b, this.f15785c, this.d, this.f15786e});
    }
}
