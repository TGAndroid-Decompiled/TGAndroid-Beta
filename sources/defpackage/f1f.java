package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class f1f {
    public static kff j;
    public static final aif k;
    public final String a;
    public final String b;
    public final w0f c;
    public final sfa d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new aif(objArr);
    }

    public f1f(Context context, sfa sfaVar, w0f w0fVar) {
        int i;
        this.a = context.getPackageName();
        this.b = om2.a(context);
        this.d = sfaVar;
        this.c = w0fVar;
        i2f.O3();
        this.g = "vision-common";
        l69.x();
        this.e = l69.I(new ke7(this, (byte) 6));
        l69.x();
        sfaVar.getClass();
        this.f = l69.I(new ixe(sfaVar, (byte) 1));
        aif aifVar = k;
        if (aifVar.containsKey("vision-common")) {
            i = ds3.d(context, (String) aifVar.get("vision-common"), false);
        } else {
            i = -1;
        }
        this.h = i;
    }
}
