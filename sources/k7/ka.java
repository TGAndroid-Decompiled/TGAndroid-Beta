package k7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ka {
    public static ta f9885j;
    public static final ya f9886k;
    public final String f9887a;
    public final String f9888b;
    public final ja f9889c;
    public final cb.l d;
    public final Task e;
    public final Task f9890f;
    public final String f9891g;
    public final int h;
    public final HashMap f9892i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f9886k = new ya(objArr);
    }

    public ka(Context context, cb.l lVar, ja jaVar) {
        int i10;
        new HashMap();
        this.f9887a = context.getPackageName();
        this.f9888b = cb.c.a(context);
        this.d = lVar;
        this.f9889c = jaVar;
        oa.b();
        this.f9891g = "vision-common";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 5);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 2);
        a10.getClass();
        this.f9890f = cb.g.b(pVar);
        ya yaVar = f9886k;
        if (yaVar.containsKey("vision-common")) {
            i10 = m6.e.d(context, (String) yaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
