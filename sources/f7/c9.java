package f7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class c9 {
    public static n9 f5624j;
    public static final d f5625k;
    public final String f5626a;
    public final String f5627b;
    public final a9 f5628c;
    public final ya.k d;
    public final Task f5629e;
    public final Task f5630f;
    public final String f5631g;
    public final int h;
    public final HashMap f5632i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f5625k = new d(objArr);
    }

    public c9(Context context, ya.k kVar, a9 a9Var, String str) {
        int i9;
        new HashMap();
        this.f5626a = context.getPackageName();
        this.f5627b = ya.c.a(context);
        this.d = kVar;
        this.f5628c = a9Var;
        h9.b();
        this.f5631g = str;
        ya.f a2 = ya.f.a();
        d7.p pVar = new d7.p(this, 2);
        a2.getClass();
        this.f5629e = ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        kVar.getClass();
        d7.q qVar = new d7.q(kVar, 1);
        a3.getClass();
        this.f5630f = ya.f.b(qVar);
        d dVar = f5625k;
        if (dVar.containsKey(str)) {
            i9 = i6.e.d(context, (String) dVar.get(str), false);
        } else {
            i9 = -1;
        }
        this.h = i9;
    }
}
