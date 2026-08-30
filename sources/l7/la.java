package l7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class la {
    public static w f11537k;
    public static final b0 f11538l;
    public final String f11539a;
    public final String f11540b;
    public final ia f11541c;
    public final cb.l d;
    public final Task e;
    public final Task f11542f;
    public final String f11543g;
    public final int h;
    public final HashMap f11544i = new HashMap();
    public final HashMap f11545j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f11538l = new b0(objArr);
    }

    public la(Context context, cb.l lVar, ia iaVar) {
        int i10;
        this.f11539a = context.getPackageName();
        this.f11540b = cb.c.a(context);
        this.d = lVar;
        this.f11541c = iaVar;
        oa.b();
        this.f11543g = "play-services-mlkit-image-labeling";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 6);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 3);
        a10.getClass();
        this.f11542f = cb.g.b(pVar);
        b0 b0Var = f11538l;
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
        return b6.j.f1608c.a(this.f11543g);
    }

    public final boolean c(u7 u7Var, long j10) {
        HashMap hashMap = this.f11544i;
        if (hashMap.get(u7Var) == null || j10 - ((Long) hashMap.get(u7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
