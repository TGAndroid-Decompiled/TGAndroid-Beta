package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;
public final class xbd {
    public final Context a;
    public final String b;
    public final kad c;
    public final ld1 d;
    public final hhd e;

    public xbd(Context context, ld1 ld1Var, hhd hhdVar) {
        String u;
        boolean isEmpty = DesugarCollections.unmodifiableList(ld1Var.b).isEmpty();
        String str = ld1Var.a;
        if (isEmpty) {
            u = bvd.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(ld1Var.b);
            if (str != null) {
                if (unmodifiableList != null) {
                    u = k7b.u(new k7b(str, unmodifiableList));
                } else {
                    lq5.j("namespaces cannot be null");
                    throw null;
                }
            } else {
                lq5.j("applicationId cannot be null");
                throw null;
            }
        }
        this.c = new kad(this);
        this.a = context.getApplicationContext();
        xve.f(u);
        this.b = u;
        this.d = ld1Var;
        this.e = hhdVar;
    }
}
