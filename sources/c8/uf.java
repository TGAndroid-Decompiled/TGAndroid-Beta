package c8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class uf {
    public static m f5888k;
    public static final r f5889l;
    public final String f5890a;
    public final String f5891b;
    public final sf f5892c;
    public final pb.k d;
    public final Task f5893e;
    public final Task f5894f;
    public final String f5895g;
    public final int h;
    public final HashMap f5896i = new HashMap();
    public final HashMap f5897j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f5889l = new r(objArr);
    }

    public uf(Context context, pb.k kVar, sf sfVar) {
        int i7;
        this.f5890a = context.getPackageName();
        this.f5891b = pb.c.a(context);
        this.d = kVar;
        this.f5892c = sfVar;
        xf.b();
        this.f5895g = "subject-segmentation";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 2);
        a10.getClass();
        this.f5893e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.oa oaVar = new a8.oa(kVar, 1);
        a11.getClass();
        this.f5894f = pb.f.b(oaVar);
        r rVar = f5889l;
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
        this.f5896i.put(fbVar, Long.valueOf(elapsedRealtime));
        pb.m.f53557a.execute(new a8.pa(this, tfVar.zza(), fbVar, c(), 1));
    }

    public final String c() {
        Task task = this.f5893e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return q6.j.f53904c.a(this.f5895g);
    }

    public final boolean d(fb fbVar, long j3) {
        HashMap hashMap = this.f5896i;
        if (hashMap.get(fbVar) == null || j3 - ((Long) hashMap.get(fbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
