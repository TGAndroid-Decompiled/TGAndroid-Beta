package j7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class c9 {
    public static n9 f9573j;
    public static final d f9574k;
    public final String f9575a;
    public final String f9576b;
    public final a9 f9577c;
    public final cb.l d;
    public final Task f9578e;
    public final Task f9579f;
    public final String f9580g;
    public final int h;
    public final HashMap f9581i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f9574k = new d(objArr);
    }

    public c9(Context context, cb.l lVar, a9 a9Var, String str) {
        int i10;
        new HashMap();
        this.f9575a = context.getPackageName();
        this.f9576b = cb.c.a(context);
        this.d = lVar;
        this.f9577c = a9Var;
        h9.b();
        this.f9580g = str;
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 4);
        a2.getClass();
        this.f9578e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 1);
        a10.getClass();
        this.f9579f = cb.g.b(pVar);
        d dVar = f9574k;
        if (dVar.containsKey(str)) {
            i10 = m6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
