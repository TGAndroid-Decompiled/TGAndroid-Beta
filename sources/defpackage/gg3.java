package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
public final class gg3 implements Runnable {
    public final byte a = 1;
    public final cj3 b;
    public final int c;
    public final ArrayList d;
    public final boolean e;
    public final HashSet f;

    public gg3(cj3 cj3Var, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.b = cj3Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G4(this.d, this.c, false, this.e, this.f);
                return;
            default:
                this.b.V3(this.c, this.d, this.e, this.f);
                return;
        }
    }

    public gg3(cj3 cj3Var, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.b = cj3Var;
        this.d = arrayList;
        this.c = i;
        this.e = z;
        this.f = hashSet;
    }
}
