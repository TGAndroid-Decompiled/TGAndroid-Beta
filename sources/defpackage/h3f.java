package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class h3f {
    public static lhf j;
    public static final bkf k;
    public final String a;
    public final String b;
    public final y2f c;
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
        k = new bkf(objArr);
    }

    public h3f(Context context, uha uhaVar, y2f y2fVar) {
        int i;
        this.a = context.getPackageName();
        this.b = ao2.a(context);
        this.d = uhaVar;
        this.c = y2fVar;
        k4f.O3();
        this.g = "vision-common";
        ni6.q();
        this.e = ni6.E(new mg7(this, (byte) 6));
        ni6.q();
        uhaVar.getClass();
        this.f = ni6.E(new kze(uhaVar, (byte) 1));
        bkf bkfVar = k;
        if (bkfVar.containsKey("vision-common")) {
            i = nt3.d(context, (String) bkfVar.get("vision-common"), false);
        } else {
            i = -1;
        }
        this.h = i;
    }
}
