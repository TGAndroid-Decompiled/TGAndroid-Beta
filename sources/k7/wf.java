package k7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class wf {

    public static m f15018k;

    public static final r f15019l;

    public final String f15020a;

    public final String f15021b;

    public final uf f15022c;
    public final za.k d;

    public final Task f15023e;

    public final Task f15024f;

    public final String f15025g;
    public final int h;

    public final HashMap f15026i = new HashMap();

    public final HashMap f15027j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f15019l = new r(objArr);
    }

    public wf(Context context, za.k kVar, uf ufVar) {
        this.f15020a = context.getPackageName();
        this.f15021b = za.c.a(context);
        this.d = kVar;
        this.f15022c = ufVar;
        zf.b();
        this.f15025g = "subject-segmentation";
        za.f fVarA = za.f.a();
        e7.p pVar = new e7.p(this, 7);
        fVarA.getClass();
        this.f15023e = za.f.b(pVar);
        za.f fVarA2 = za.f.a();
        kVar.getClass();
        e7.q qVar = new e7.q(kVar, 4);
        fVarA2.getClass();
        this.f15024f = za.f.b(qVar);
        r rVar = f15019l;
        this.h = rVar.containsKey("subject-segmentation") ? j6.e.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (d(hbVar, jElapsedRealtime)) {
            this.f15026i.put(hbVar, Long.valueOf(jElapsedRealtime));
            za.m.f50301a.execute(new bf.e(this, vfVar.zza(), hbVar, c(), false, 6));
        }
    }

    public final String c() {
        Task task = this.f15023e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return y5.i.f49650c.a(this.f15025g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap map = this.f15026i;
        return map.get(hbVar) == null || j10 - ((Long) map.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
