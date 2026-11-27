package defpackage;

import android.net.Uri;
import java.util.ArrayList;
public final class tb9 extends ub9 {
    public final n29 f;
    public final ve9 h;

    public tb9(ko4 ko4Var, po5 po5Var, mz9 mz9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ko4Var, po5Var, mz9Var, arrayList, arrayList2, arrayList3);
        n29 n29Var;
        Uri.parse(((xg0) po5Var.get(0)).a);
        long j = mz9Var.e;
        if (j <= 0) {
            n29Var = null;
        } else {
            n29Var = new n29(mz9Var.d, j, null);
        }
        this.f = n29Var;
        this.h = n29Var == null ? new ve9(new n29(0L, -1L, null), (byte) 10) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final j63 b() {
        return this.h;
    }

    @Override
    public final n29 c() {
        return this.f;
    }
}
