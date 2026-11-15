package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class uf {
    public static m f4714k;
    public static final r f4715l;
    public final String f4716a;
    public final String f4717b;
    public final sf f4718c;
    public final pb.k d;
    public final Task f4719e;
    public final Task f4720f;
    public final String f4721g;
    public final int h;
    public final HashMap f4722i = new HashMap();
    public final HashMap f4723j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f4715l = new r(objArr);
    }

    public uf(Context context, pb.k kVar, sf sfVar) {
        int i7;
        this.f4716a = context.getPackageName();
        this.f4717b = pb.c.a(context);
        this.d = kVar;
        this.f4718c = sfVar;
        xf.b();
        this.f4721g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.f4719e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 1);
        a11.getClass();
        this.f4720f = pb.f.b(paVar);
        r rVar = f4715l;
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
        this.f4722i.put(fbVar, Long.valueOf(elapsedRealtime));
        pb.n.f54964a.execute(new a8.qa(this, tfVar.zza(), fbVar, c(), 1));
    }

    public final String c() {
        Task task = this.f4719e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f55340c.a(this.f4721g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.f4722i;
        if (hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
