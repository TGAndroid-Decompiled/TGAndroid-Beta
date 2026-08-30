package k7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ka {
    public static ta f9905j;
    public static final ya f9906k;
    public final String f9907a;
    public final String f9908b;
    public final ja f9909c;
    public final cb.l d;
    public final Task e;
    public final Task f9910f;
    public final String f9911g;
    public final int h;
    public final HashMap f9912i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f9906k = new ya(objArr);
    }

    public ka(Context context, cb.l lVar, ja jaVar) {
        int i10;
        new HashMap();
        this.f9907a = context.getPackageName();
        this.f9908b = cb.c.a(context);
        this.d = lVar;
        this.f9909c = jaVar;
        oa.b();
        this.f9911g = "vision-common";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 5);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 2);
        a10.getClass();
        this.f9910f = cb.g.b(pVar);
        ya yaVar = f9906k;
        if (yaVar.containsKey("vision-common")) {
            i10 = m6.e.d(context, (String) yaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
