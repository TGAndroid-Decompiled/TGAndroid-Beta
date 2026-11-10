package a8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ta {
    public static a0 f662k;
    public static final f0 f663l;
    public final String f664a;
    public final String f665b;
    public final na f666c;
    public final pb.k d;
    public final Task f667e;
    public final Task f668f;
    public final String f669g;
    public final int h;
    public final HashMap f670i = new HashMap();
    public final HashMap f671j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f663l = new f0(objArr);
    }

    public ta(Context context, pb.k kVar, na naVar) {
        int i7;
        this.f664a = context.getPackageName();
        this.f665b = pb.c.a(context);
        this.d = kVar;
        this.f666c = naVar;
        bb.b();
        this.f669g = "play-services-mlkit-image-labeling";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 1);
        a10.getClass();
        this.f667e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        oa oaVar = new oa(kVar, 0);
        a11.getClass();
        this.f668f = pb.f.b(oaVar);
        f0 f0Var = f663l;
        if (f0Var.containsKey("play-services-mlkit-image-labeling")) {
            i7 = b7.f.d(context, (String) f0Var.get("play-services-mlkit-image-labeling"), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.f667e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f53903c.a(this.f669g);
    }

    public final boolean c(a8 a8Var, long j3) {
        HashMap hashMap = this.f670i;
        if (hashMap.get(a8Var) == null || j3 - ((Long) hashMap.get(a8Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
