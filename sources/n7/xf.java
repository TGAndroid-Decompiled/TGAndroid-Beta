package n7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class xf {
    public static m f14791k;
    public static final r f14792l;
    public final String f14793a;
    public final String f14794b;
    public final vf f14795c;
    public final cb.l d;
    public final Task e;
    public final Task f14796f;
    public final String f14797g;
    public final int h;
    public final HashMap f14798i = new HashMap();
    public final HashMap f14799j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f14792l = new r(objArr);
    }

    public xf(Context context, cb.l lVar, vf vfVar) {
        int i10;
        this.f14793a = context.getPackageName();
        this.f14794b = cb.c.a(context);
        this.d = lVar;
        this.f14795c = vfVar;
        ag.b();
        this.f14797g = "subject-segmentation";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 7);
        a2.getClass();
        this.e = cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        lVar.getClass();
        h7.p pVar = new h7.p(lVar, 4);
        a10.getClass();
        this.f14796f = cb.g.b(pVar);
        r rVar = f14792l;
        if (rVar.containsKey("subject-segmentation")) {
            i10 = m6.e.d(context, (String) rVar.get("subject-segmentation"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(wf wfVar, ib ibVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(ibVar, elapsedRealtime)) {
            return;
        }
        this.f14798i.put(ibVar, Long.valueOf(elapsedRealtime));
        cb.o.f2260a.execute(new c2.p(this, wfVar.zza(), ibVar, c(), false, 7));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return b6.j.f1619c.a(this.f14797g);
    }

    public final boolean d(ib ibVar, long j10) {
        HashMap hashMap = this.f14798i;
        if (hashMap.get(ibVar) == null || j10 - ((Long) hashMap.get(ibVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
