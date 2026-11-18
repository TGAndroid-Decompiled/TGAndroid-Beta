package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class uf {
    public static m f5003k;
    public static final r f5004l;
    public final String f5005a;
    public final String f5006b;
    public final sf f5007c;
    public final pb.k d;
    public final Task f5008e;
    public final Task f5009f;
    public final String f5010g;
    public final int h;
    public final HashMap f5011i = new HashMap();
    public final HashMap f5012j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f5004l = new r(objArr);
    }

    public uf(Context context, pb.k kVar, sf sfVar) {
        int i7;
        this.f5005a = context.getPackageName();
        this.f5006b = pb.c.a(context);
        this.d = kVar;
        this.f5007c = sfVar;
        xf.b();
        this.f5010g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.f5008e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 1);
        a11.getClass();
        this.f5009f = pb.f.b(paVar);
        r rVar = f5004l;
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
        this.f5011i.put(fbVar, Long.valueOf(elapsedRealtime));
        pb.n.f55540a.execute(new a8.qa(this, tfVar.zza(), fbVar, c(), 1));
    }

    public final String c() {
        Task task = this.f5008e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f55914c.a(this.f5010g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.f5011i;
        if (hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
