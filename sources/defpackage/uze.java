package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class uze {
    public static tjf j;
    public static final e8d k;
    public final String a;
    public final String b;
    public final bze c;
    public final uha d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new e8d(objArr);
    }

    public uze(Context context, uha uhaVar, bze bzeVar, String str) {
        int i;
        this.a = context.getPackageName();
        this.b = ao2.a(context);
        this.d = uhaVar;
        this.c = bzeVar;
        k1f.o();
        this.g = str;
        ni6.q();
        this.e = ni6.E(new mg7(this, (byte) 5));
        ni6.q();
        uhaVar.getClass();
        this.f = ni6.E(new kze(uhaVar, (byte) 0));
        e8d e8dVar = k;
        if (e8dVar.containsKey(str)) {
            i = nt3.d(context, (String) e8dVar.get(str), false);
        } else {
            i = -1;
        }
        this.h = i;
    }
}
