package j7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class la {
    public static w f11086k;
    public static final b0 f11087l;
    public final String f11088a;
    public final String f11089b;
    public final ia f11090c;
    public final ab.l d;
    public final Task f11091e;
    public final Task f11092f;
    public final String f11093g;
    public final int h;
    public final HashMap f11094i = new HashMap();
    public final HashMap f11095j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f11087l = new b0(objArr);
    }

    public la(Context context, ab.l lVar, ia iaVar) {
        int i10;
        this.f11088a = context.getPackageName();
        this.f11089b = ab.c.a(context);
        this.d = lVar;
        this.f11090c = iaVar;
        oa.b();
        this.f11093g = "play-services-mlkit-image-labeling";
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 6);
        a2.getClass();
        this.f11091e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 3);
        a10.getClass();
        this.f11092f = ab.g.b(qVar);
        b0 b0Var = f11087l;
        if (b0Var.containsKey("play-services-mlkit-image-labeling")) {
            i10 = k6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.f11091e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return z5.i.f50633c.a(this.f11093g);
    }

    public final boolean c(u7 u7Var, long j10) {
        HashMap hashMap = this.f11094i;
        if (hashMap.get(u7Var) == null || j10 - ((Long) hashMap.get(u7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
