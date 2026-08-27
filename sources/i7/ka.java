package i7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class ka {

    public static w f10706k;

    public static final b0 f10707l;

    public final String f10708a;

    public final String f10709b;

    public final ha f10710c;
    public final za.k d;

    public final Task f10711e;

    public final Task f10712f;

    public final String f10713g;
    public final int h;

    public final HashMap f10714i = new HashMap();

    public final HashMap f10715j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f10707l = new b0(objArr);
    }

    public ka(Context context, za.k kVar, ha haVar) {
        this.f10708a = context.getPackageName();
        this.f10709b = za.c.a(context);
        this.d = kVar;
        this.f10710c = haVar;
        na.b();
        this.f10713g = "play-services-mlkit-image-labeling";
        za.f fVarA = za.f.a();
        e7.p pVar = new e7.p(this, 6);
        fVarA.getClass();
        this.f10711e = za.f.b(pVar);
        za.f fVarA2 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 3);
        fVarA2.getClass();
        this.f10712f = za.f.b(qVar);
        b0 b0Var = f10707l;
        this.h = b0Var.containsKey("play-services-mlkit-image-labeling") ? j6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.f10711e;
        return task.isSuccessful() ? (String) task.getResult() : y5.i.f49650c.a(this.f10713g);
    }

    public final boolean c(t7 t7Var, long j10) {
        HashMap map = this.f10714i;
        return map.get(t7Var) == null || j10 - ((Long) map.get(t7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
