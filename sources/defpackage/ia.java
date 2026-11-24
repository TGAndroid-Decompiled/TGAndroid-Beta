package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class ia extends age {
    public final byte a = 0;
    public ArrayList b;
    public ArrayList c;

    public ia(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                ja jaVar = (ja) this.b.get(i);
                ja jaVar2 = (ja) this.c.get(i2);
                if (jaVar.a != jaVar2.a) {
                    return false;
                }
                return jaVar.a(jaVar2);
            default:
                return true;
        }
    }

    @Override
    public final boolean b(int i, int i2) {
        switch (this.a) {
            case 0:
                ja jaVar = (ja) this.b.get(i);
                ja jaVar2 = (ja) this.c.get(i2);
                if (jaVar.a != jaVar2.a) {
                    return false;
                }
                return jaVar.equals(jaVar2);
            default:
                lyb lybVar = (lyb) this.b.get(i);
                lyb lybVar2 = (lyb) this.c.get(i2);
                if (lybVar.a != lybVar2.a || !Objects.equals(lybVar.b, lybVar2.b)) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int c() {
        switch (this.a) {
            case 0:
                return this.c.size();
            default:
                return this.c.size();
        }
    }

    @Override
    public final int d() {
        switch (this.a) {
            case 0:
                return this.b.size();
            default:
                return this.b.size();
        }
    }

    public ia() {
    }
}
