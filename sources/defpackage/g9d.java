package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;
public final class g9d {
    public final Context a;
    public final String b;
    public final t7d c;
    public final le1 d;
    public final qed e;

    public g9d(Context context, le1 le1Var, qed qedVar) {
        String r;
        boolean isEmpty = DesugarCollections.unmodifiableList(le1Var.b).isEmpty();
        String str = le1Var.a;
        if (isEmpty) {
            r = osd.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(le1Var.b);
            if (str != null) {
                if (unmodifiableList != null) {
                    r = xab.r(new xab(str, unmodifiableList));
                } else {
                    u36.j("namespaces cannot be null");
                    throw null;
                }
            } else {
                u36.j("applicationId cannot be null");
                throw null;
            }
        }
        this.c = new t7d(this);
        this.a = context.getApplicationContext();
        ite.f(r);
        this.b = r;
        this.d = le1Var;
        this.e = qedVar;
    }
}
