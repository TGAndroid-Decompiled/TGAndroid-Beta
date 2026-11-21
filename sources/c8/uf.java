package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class uf {
    public static m f5029k;
    public static final r f5030l;
    public final String f5031a;
    public final String f5032b;
    public final sf f5033c;
    public final pb.k d;
    public final Task f5034e;
    public final Task f5035f;
    public final String f5036g;
    public final int h;
    public final HashMap f5037i = new HashMap();
    public final HashMap f5038j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f5030l = new r(objArr);
    }

    public uf(Context context, pb.k kVar, sf sfVar) {
        int i7;
        this.f5031a = context.getPackageName();
        this.f5032b = pb.c.a(context);
        this.d = kVar;
        this.f5033c = sfVar;
        xf.b();
        this.f5036g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.f5034e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 1);
        a11.getClass();
        this.f5035f = pb.f.b(paVar);
        r rVar = f5030l;
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
        this.f5037i.put(fbVar, Long.valueOf(elapsedRealtime));
        pb.n.f55581a.execute(new a8.qa(this, tfVar.zza(), fbVar, c(), 1));
    }

    public final String c() {
        Task task = this.f5034e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f55955c.a(this.f5036g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.f5037i;
        if (hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
