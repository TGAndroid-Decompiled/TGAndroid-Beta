package h7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

public final class ka {

    public static ta f8447j;

    public static final ya f8448k;

    public final String f8449a;

    public final String f8450b;

    public final ja f8451c;
    public final za.k d;

    public final Task f8452e;

    public final Task f8453f;

    public final String f8454g;
    public final int h;

    public final HashMap f8455i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f8448k = new ya(objArr);
    }

    public ka(Context context, za.k kVar, ja jaVar) {
        new HashMap();
        this.f8449a = context.getPackageName();
        this.f8450b = za.c.a(context);
        this.d = kVar;
        this.f8451c = jaVar;
        oa.b();
        this.f8454g = "vision-common";
        za.f fVarA = za.f.a();
        e7.p pVar = new e7.p(this, 5);
        fVarA.getClass();
        this.f8452e = za.f.b(pVar);
        za.f fVarA2 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 2);
        fVarA2.getClass();
        this.f8453f = za.f.b(qVar);
        ya yaVar = f8448k;
        this.h = yaVar.containsKey("vision-common") ? j6.e.d(context, (String) yaVar.get("vision-common"), false) : -1;
    }
}
