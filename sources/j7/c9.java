package j7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class c9 {
    public static n9 f8963j;
    public static final d f8964k;
    public final String f8965a;
    public final String f8966b;
    public final a9 f8967c;
    public final cb.l d;
    public final Task e;
    public final Task f8968f;
    public final String f8969g;
    public final int h;
    public final HashMap f8970i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f8964k = new d(objArr);
    }

    public c9(Context context, cb.l lVar, a9 a9Var, String str) {
        int i10;
        new HashMap();
        this.f8965a = context.getPackageName();
        this.f8966b = cb.c.a(context);
        this.d = lVar;
        this.f8967c = a9Var;
        h9.b();
        this.f8969g = str;
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 4);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 1);
        a10.getClass();
        this.f8968f = cb.g.b(pVar);
        d dVar = f8964k;
        if (dVar.containsKey(str)) {
            i10 = m6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
