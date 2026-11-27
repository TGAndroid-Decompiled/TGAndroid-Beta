package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
public final class ah3 implements Runnable {
    public final byte a = 0;
    public final uj3 b;
    public final ArrayList c;
    public final int d;
    public final boolean e;
    public final HashSet f;

    public ah3(uj3 uj3Var, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.b = uj3Var;
        this.d = i;
        this.c = arrayList;
        this.e = z;
        this.f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y3(this.d, this.c, this.e, this.f);
                return;
            default:
                this.b.K4(this.c, this.d, false, this.e, this.f);
                return;
        }
    }

    public ah3(uj3 uj3Var, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.b = uj3Var;
        this.c = arrayList;
        this.d = i;
        this.e = z;
        this.f = hashSet;
    }
}
