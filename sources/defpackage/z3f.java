package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
public final class z3f {
    public static hfd k;
    public static final ggd l;
    public final String a;
    public final String b;
    public final n3f c;
    public final sfa d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new ggd(objArr);
    }

    public z3f(Context context, sfa sfaVar, n3f n3fVar) {
        int i;
        this.a = context.getPackageName();
        this.b = om2.a(context);
        this.d = sfaVar;
        this.c = n3fVar;
        o5f.t0();
        this.g = "play-services-mlkit-image-labeling";
        l69.x();
        this.e = l69.I(new ke7(this, (byte) 7));
        l69.x();
        sfaVar.getClass();
        this.f = l69.I(new ixe(sfaVar, (byte) 2));
        ggd ggdVar = l;
        if (ggdVar.containsKey("play-services-mlkit-image-labeling")) {
            i = ds3.d(context, (String) ggdVar.get("play-services-mlkit-image-labeling"), false);
        } else {
            i = -1;
        }
        this.h = i;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return r06.c.a(this.g);
    }

    public final boolean c(ete eteVar, long j) {
        HashMap hashMap = this.i;
        if (hashMap.get(eteVar) == null || j - ((Long) hashMap.get(eteVar)).longValue() > 30000) {
            return true;
        }
        return false;
    }
}
