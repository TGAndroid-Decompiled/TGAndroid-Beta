package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class uf {
    public static m f5000k;
    public static final r f5001l;
    public final String f5002a;
    public final String f5003b;
    public final sf f5004c;
    public final pb.k d;
    public final Task f5005e;
    public final Task f5006f;
    public final String f5007g;
    public final int h;
    public final HashMap f5008i = new HashMap();
    public final HashMap f5009j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f5001l = new r(objArr);
    }

    public uf(Context context, pb.k kVar, sf sfVar) {
        int i7;
        this.f5002a = context.getPackageName();
        this.f5003b = pb.c.a(context);
        this.d = kVar;
        this.f5004c = sfVar;
        xf.b();
        this.f5007g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.f5005e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 1);
        a11.getClass();
        this.f5006f = pb.f.b(paVar);
        r rVar = f5001l;
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
        this.f5008i.put(fbVar, Long.valueOf(elapsedRealtime));
        pb.n.f55540a.execute(new a8.qa(this, tfVar.zza(), fbVar, c(), 1));
    }

    public final String c() {
        Task task = this.f5005e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f55914c.a(this.f5007g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.f5008i;
        if (hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
