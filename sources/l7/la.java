package l7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class la {
    public static w f11647k;
    public static final b0 f11648l;
    public final String f11649a;
    public final String f11650b;
    public final ia f11651c;
    public final cb.l d;
    public final Task e;
    public final Task f11652f;
    public final String f11653g;
    public final int h;
    public final HashMap f11654i = new HashMap();
    public final HashMap f11655j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f11648l = new b0(objArr);
    }

    public la(Context context, cb.l lVar, ia iaVar) {
        int i10;
        this.f11649a = context.getPackageName();
        this.f11650b = cb.c.a(context);
        this.d = lVar;
        this.f11651c = iaVar;
        oa.b();
        this.f11653g = "play-services-mlkit-image-labeling";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 6);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 3);
        a10.getClass();
        this.f11652f = cb.g.b(pVar);
        b0 b0Var = f11648l;
        if (b0Var.containsKey("play-services-mlkit-image-labeling")) {
            i10 = m6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return b6.j.f1619c.a(this.f11653g);
    }

    public final boolean c(u7 u7Var, long j10) {
        HashMap hashMap = this.f11654i;
        if (hashMap.get(u7Var) == null || j10 - ((Long) hashMap.get(u7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
