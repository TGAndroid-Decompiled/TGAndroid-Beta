package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
public final class th3 implements Runnable {
    public final byte a = 1;
    public final nk3 b;
    public final int c;
    public final ArrayList d;
    public final boolean e;
    public final HashSet f;

    public th3(nk3 nk3Var, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.b = nk3Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K4(this.d, this.c, false, this.e, this.f);
                return;
            default:
                this.b.Y3(this.c, this.d, this.e, this.f);
                return;
        }
    }

    public th3(nk3 nk3Var, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.b = nk3Var;
        this.d = arrayList;
        this.c = i;
        this.e = z;
        this.f = hashSet;
    }
}
