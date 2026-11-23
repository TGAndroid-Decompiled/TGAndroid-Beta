package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class uf {
    public static m f4997k;
    public static final r f4998l;
    public final String f4999a;
    public final String f5000b;
    public final sf f5001c;
    public final pb.k d;
    public final Task f5002e;
    public final Task f5003f;
    public final String f5004g;
    public final int h;
    public final HashMap f5005i = new HashMap();
    public final HashMap f5006j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f4998l = new r(objArr);
    }

    public uf(Context context, pb.k kVar, sf sfVar) {
        int i7;
        this.f4999a = context.getPackageName();
        this.f5000b = pb.c.a(context);
        this.d = kVar;
        this.f5001c = sfVar;
        xf.b();
        this.f5004g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.f5002e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 1);
        a11.getClass();
        this.f5003f = pb.f.b(paVar);
        r rVar = f4998l;
        if (rVar.containsKey("subject-segmentation")) {
            i7 = b7.f.d(context, (String) rVar.get("subject-segmentation"), false);
        } else {
            i7 = -1;
        }
        this.h = i7;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(tf tfVar, fb fbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(fbVar, elapsedRealtime)) {
            return;
        }
        this.f5005i.put(fbVar, Long.valueOf(elapsedRealtime));
        pb.n.f55550a.execute(new a8.qa(this, tfVar.zza(), fbVar, c(), 1));
    }

    public final String c() {
        Task task = this.f5002e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f55924c.a(this.f5004g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.f5005i;
        if (hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
