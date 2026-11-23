package a8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class ua {
    public static a0 f665k;
    public static final f0 f666l;
    public final String f667a;
    public final String f668b;
    public final oa f669c;
    public final pb.k d;
    public final Task f670e;
    public final Task f671f;
    public final String f672g;
    public final int h;
    public final HashMap f673i = new HashMap();
    public final HashMap f674j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f666l = new f0(objArr);
    }

    public ua(Context context, pb.k kVar, oa oaVar) {
        int i7;
        this.f667a = context.getPackageName();
        this.f668b = pb.c.a(context);
        this.d = kVar;
        this.f669c = oaVar;
        cb.b();
        this.f672g = "play-services-mlkit-image-labeling";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 1);
        a10.getClass();
        this.f670e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 0);
        a11.getClass();
        this.f671f = pb.f.b(paVar);
        f0 f0Var = f666l;
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
        Task task = this.f670e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f55924c.a(this.f672g);
    }

    public final boolean c(a8 a8Var, long j3) {
        HashMap hashMap = this.f673i;
        if (hashMap.get(a8Var) == null || j3 - ((Long) hashMap.get(a8Var)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
