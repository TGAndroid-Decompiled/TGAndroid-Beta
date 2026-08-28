package g7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class ka {
    public static ta f7277j;
    public static final ya f7278k;
    public final String f7279a;
    public final String f7280b;
    public final ja f7281c;
    public final ya.k d;
    public final Task f7282e;
    public final Task f7283f;
    public final String f7284g;
    public final int h;
    public final HashMap f7285i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f7278k = new ya(objArr);
    }

    public ka(Context context, ya.k kVar, ja jaVar) {
        int i9;
        new HashMap();
        this.f7279a = context.getPackageName();
        this.f7280b = ya.c.a(context);
        this.d = kVar;
        this.f7281c = jaVar;
        oa.b();
        this.f7284g = "vision-common";
        ya.f a2 = ya.f.a();
        d7.p pVar = new d7.p(this, 3);
        a2.getClass();
        this.f7282e = ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        kVar.getClass();
        d7.q qVar = new d7.q(kVar, 2);
        a3.getClass();
        this.f7283f = ya.f.b(qVar);
        ya yaVar = f7278k;
        if (yaVar.containsKey("vision-common")) {
            i9 = i6.e.d(context, (String) yaVar.get("vision-common"), false);
        } else {
            i9 = -1;
        }
        this.h = i9;
    }
}
