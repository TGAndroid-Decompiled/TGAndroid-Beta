package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class ja extends qie {
    public final byte a = 0;
    public ArrayList b;
    public ArrayList c;

    public ja(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.b.get(i);
                ka kaVar2 = (ka) this.c.get(i2);
                if (kaVar.a != kaVar2.a) {
                    return false;
                }
                return kaVar.a(kaVar2);
            default:
                return true;
        }
    }

    @Override
    public final boolean b(int i, int i2) {
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.b.get(i);
                ka kaVar2 = (ka) this.c.get(i2);
                if (kaVar.a != kaVar2.a) {
                    return false;
                }
                return kaVar.equals(kaVar2);
            default:
                k0c k0cVar = (k0c) this.b.get(i);
                k0c k0cVar2 = (k0c) this.c.get(i2);
                if (k0cVar.a != k0cVar2.a || !Objects.equals(k0cVar.b, k0cVar2.b)) {
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

    public ja() {
    }
}
