package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;
public final class e7d {
    public final Context a;
    public final String b;
    public final r5d c;
    public final dd1 d;
    public final ocd e;

    public e7d(Context context, dd1 dd1Var, ocd ocdVar) {
        String r;
        boolean isEmpty = DesugarCollections.unmodifiableList(dd1Var.b).isEmpty();
        String str = dd1Var.a;
        if (isEmpty) {
            r = lqd.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(dd1Var.b);
            if (str != null) {
                if (unmodifiableList != null) {
                    r = v8b.r(new v8b(str, unmodifiableList));
                } else {
                    w26.j("namespaces cannot be null");
                    throw null;
                }
            } else {
                w26.j("applicationId cannot be null");
                throw null;
            }
        }
        this.c = new r5d(this);
        this.a = context.getApplicationContext();
        fre.f(r);
        this.b = r;
        this.d = dd1Var;
        this.e = ocdVar;
    }
}
