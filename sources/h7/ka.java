package h7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ka {
    public static w f9997k;
    public static final b0 f9998l;
    public final String f9999a;
    public final String f10000b;
    public final ha f10001c;
    public final ya.k d;
    public final Task f10002e;
    public final Task f10003f;
    public final String f10004g;
    public final int h;
    public final HashMap f10005i = new HashMap();
    public final HashMap f10006j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f9998l = new b0(objArr);
    }

    public ka(Context context, ya.k kVar, ha haVar) {
        int i9;
        this.f9999a = context.getPackageName();
        this.f10000b = ya.c.a(context);
        this.d = kVar;
        this.f10001c = haVar;
        na.b();
        this.f10004g = "play-services-mlkit-image-labeling";
        ya.f a2 = ya.f.a();
        d7.p pVar = new d7.p(this, 6);
        a2.getClass();
        this.f10002e = ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        kVar.getClass();
        d7.q qVar = new d7.q(kVar, 3);
        a3.getClass();
        this.f10003f = ya.f.b(qVar);
        b0 b0Var = f9998l;
        if (b0Var.containsKey("play-services-mlkit-image-labeling")) {
            i9 = i6.e.d(context, (String) b0Var.get("play-services-mlkit-image-labeling"), false);
        } else {
            i9 = -1;
        }
        this.h = i9;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.f10002e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return x5.i.f48933c.a(this.f10004g);
    }

    public final boolean c(t7 t7Var, long j10) {
        HashMap hashMap = this.f10005i;
        if (hashMap.get(t7Var) == null || j10 - ((Long) hashMap.get(t7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
