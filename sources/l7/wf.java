package l7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class wf {
    public static m f15023k;
    public static final r f15024l;
    public final String f15025a;
    public final String f15026b;
    public final uf f15027c;
    public final ab.l d;
    public final Task f15028e;
    public final Task f15029f;
    public final String f15030g;
    public final int h;
    public final HashMap f15031i = new HashMap();
    public final HashMap f15032j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f15024l = new r(objArr);
    }

    public wf(Context context, ab.l lVar, uf ufVar) {
        int i10;
        this.f15025a = context.getPackageName();
        this.f15026b = ab.c.a(context);
        this.d = lVar;
        this.f15027c = ufVar;
        zf.b();
        this.f15030g = "subject-segmentation";
        ab.g a2 = ab.g.a();
        f7.p pVar = new f7.p(this, 7);
        a2.getClass();
        this.f15028e = ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        lVar.getClass();
        f7.q qVar = new f7.q(lVar, 4);
        a10.getClass();
        this.f15029f = ab.g.b(qVar);
        r rVar = f15024l;
        if (rVar.containsKey("subject-segmentation")) {
            i10 = k6.e.d(context, (String) rVar.get("subject-segmentation"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(hbVar, elapsedRealtime)) {
            return;
        }
        this.f15031i.put(hbVar, Long.valueOf(elapsedRealtime));
        ab.q.f333a.execute(new c2.p(this, vfVar.zza(), hbVar, c(), false, 7));
    }

    public final String c() {
        Task task = this.f15028e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return z5.i.f50633c.a(this.f15030g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.f15031i;
        if (hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
