package i7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ka {
    public static ta f8421j;
    public static final ya f8422k;
    public final String f8423a;
    public final String f8424b;
    public final ja f8425c;
    public final ab.l d;
    public final Task f8426e;
    public final Task f8427f;
    public final String f8428g;
    public final int h;
    public final HashMap f8429i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f8422k = new ya(objArr);
    }

    public ka(Context context, ab.l lVar, ja jaVar) {
        int i10;
        new HashMap();
        this.f8423a = context.getPackageName();
        this.f8424b = ab.c.a(context);
        this.d = lVar;
        this.f8425c = jaVar;
        oa.b();
        this.f8428g = "vision-common";
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 5);
        a2.getClass();
        this.f8426e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 2);
        a10.getClass();
        this.f8427f = ab.g.b(qVar);
        ya yaVar = f8422k;
        if (yaVar.containsKey("vision-common")) {
            i10 = k6.e.d(context, (String) yaVar.get("vision-common"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
