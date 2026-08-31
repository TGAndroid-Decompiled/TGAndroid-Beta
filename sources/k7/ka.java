package k7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ka {
    public static ta f10634j;
    public static final ya f10635k;
    public final String f10636a;
    public final String f10637b;
    public final ja f10638c;
    public final cb.l d;
    public final Task f10639e;
    public final Task f10640f;
    public final String f10641g;
    public final int h;
    public final HashMap f10642i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f10635k = new ya(objArr);
    }

    public ka(Context context, cb.l lVar, ja jaVar) {
        int i10;
        new HashMap();
        this.f10636a = context.getPackageName();
        this.f10637b = cb.c.a(context);
        this.d = lVar;
        this.f10638c = jaVar;
        oa.b();
        this.f10641g = "vision-common";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 5);
        a2.getClass();
        this.f10639e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 2);
        a10.getClass();
        this.f10640f = cb.g.b(pVar);
        ya yaVar = f10635k;
        if (yaVar.containsKey("vision-common")) {
            i10 = m6.e.d(context, (String) yaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
