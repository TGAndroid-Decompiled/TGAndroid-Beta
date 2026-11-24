package defpackage;

import android.net.Uri;
import java.util.ArrayList;
public final class ja9 extends ka9 {
    public final b19 f;
    public final x59 h;

    public ja9(go4 go4Var, mo5 mo5Var, vx9 vx9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(go4Var, mo5Var, vx9Var, arrayList, arrayList2, arrayList3);
        b19 b19Var;
        Uri.parse(((wh0) mo5Var.get(0)).a);
        long j = vx9Var.e;
        if (j <= 0) {
            b19Var = null;
        } else {
            b19Var = new b19(vx9Var.d, null, j);
        }
        this.f = b19Var;
        this.h = b19Var == null ? new x59(new b19(0L, null, -1L), (byte) 13) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final d73 b() {
        return this.h;
    }

    @Override
    public final b19 c() {
        return this.f;
    }
}
