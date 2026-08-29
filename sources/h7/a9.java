package h7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class a9 {
    public static l9 f7552j;
    public static final d f7553k;
    public final String f7554a;
    public final String f7555b;
    public final y8 f7556c;
    public final ab.l d;
    public final Task f7557e;
    public final Task f7558f;
    public final String f7559g;
    public final int h;
    public final HashMap f7560i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f7553k = new d(objArr);
    }

    public a9(Context context, ab.l lVar, y8 y8Var, String str) {
        int i10;
        new HashMap();
        this.f7554a = context.getPackageName();
        this.f7555b = ab.c.a(context);
        this.d = lVar;
        this.f7556c = y8Var;
        f9.b();
        this.f7559g = str;
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 4);
        a2.getClass();
        this.f7557e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 1);
        a10.getClass();
        this.f7558f = ab.g.b(qVar);
        d dVar = f7553k;
        if (dVar.containsKey(str)) {
            i10 = k6.e.d(context, (String) dVar.get(str), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }
}
