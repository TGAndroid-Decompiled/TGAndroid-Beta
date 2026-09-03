package j7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class c9 {
    public static n9 f8945j;
    public static final d f8946k;
    public final String f8947a;
    public final String f8948b;
    public final a9 f8949c;
    public final cb.l d;
    public final Task e;
    public final Task f8950f;
    public final String f8951g;
    public final int h;
    public final HashMap f8952i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f8946k = new d(objArr);
    }

    public c9(Context context, cb.l lVar, a9 a9Var, String str) {
        int i10;
        new HashMap();
        this.f8947a = context.getPackageName();
        this.f8948b = cb.c.a(context);
        this.d = lVar;
        this.f8949c = a9Var;
        h9.b();
        this.f8951g = str;
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 4);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 1);
        a10.getClass();
        this.f8950f = cb.g.b(pVar);
        d dVar = f8946k;
        if (dVar.containsKey(str)) {
            i10 = m6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
