package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class ia extends zde {
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
                iwb iwbVar = (iwb) this.b.get(i);
                iwb iwbVar2 = (iwb) this.c.get(i2);
                if (iwbVar.a != iwbVar2.a || !Objects.equals(iwbVar.b, iwbVar2.b)) {
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
