package b8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class hg {
    public static r f2656k;
    public static final w f2657l;
    public final String f2658a;
    public final String f2659b;
    public final bg f2660c;
    public final mb.k d;
    public final Task f2661e;
    public final Task f2662f;
    public final String f2663g;
    public final int h;
    public final HashMap f2664i = new HashMap();
    public final HashMap f2665j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f2657l = new w(objArr);
    }

    public hg(Context context, mb.k kVar, bg bgVar) {
        int i3;
        this.f2658a = context.getPackageName();
        this.f2659b = mb.c.a(context);
        this.d = kVar;
        this.f2660c = bgVar;
        pg.b();
        this.f2663g = "subject-segmentation";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 0);
        a10.getClass();
        this.f2661e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 0);
        a11.getClass();
        this.f2662f = mb.f.b(egVar);
        w wVar = f2657l;
        if (wVar.containsKey("subject-segmentation")) {
            i3 = a7.f.d(context, (String) wVar.get("subject-segmentation"), false);
        } else {
            i3 = -1;
        }
        this.h = i3;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(gg ggVar, ob obVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(obVar, elapsedRealtime)) {
            return;
        }
        this.f2664i.put(obVar, Long.valueOf(elapsedRealtime));
        mb.m.f19245a.execute(new cg(this, ggVar.zza(), obVar, c(), 0));
    }

    public final String c() {
        Task task = this.f2661e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return p6.j.f53268c.a(this.f2663g);
    }

    public final boolean d(ob obVar, long j10) {
        HashMap hashMap = this.f2664i;
        if (hashMap.get(obVar) == null || j10 - ((Long) hashMap.get(obVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
