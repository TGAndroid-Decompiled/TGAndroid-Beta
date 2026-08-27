package g7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

public final class b9 {

    public static m9 f6418j;

    public static final d f6419k;

    public final String f6420a;

    public final String f6421b;

    public final z8 f6422c;
    public final za.k d;

    public final Task f6423e;

    public final Task f6424f;

    public final String f6425g;
    public final int h;

    public final HashMap f6426i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f6419k = new d(objArr);
    }

    public b9(Context context, za.k kVar, z8 z8Var, String str) {
        new HashMap();
        this.f6420a = context.getPackageName();
        this.f6421b = za.c.a(context);
        this.d = kVar;
        this.f6422c = z8Var;
        g9.b();
        this.f6425g = str;
        za.f fVarA = za.f.a();
        e7.p pVar = new e7.p(this, 2);
        fVarA.getClass();
        this.f6423e = za.f.b(pVar);
        za.f fVarA2 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 1);
        fVarA2.getClass();
        this.f6424f = za.f.b(qVar);
        d dVar = f6419k;
        this.h = dVar.containsKey(str) ? j6.e.d(context, (String) dVar.get(str), false) : -1;
    }
}
