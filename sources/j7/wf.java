package j7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class wf {
    public static m f14164k;
    public static final r f14165l;
    public final String f14166a;
    public final String f14167b;
    public final uf f14168c;
    public final ya.k d;
    public final Task f14169e;
    public final Task f14170f;
    public final String f14171g;
    public final int h;
    public final HashMap f14172i = new HashMap();
    public final HashMap f14173j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f14165l = new r(objArr);
    }

    public wf(Context context, ya.k kVar, uf ufVar) {
        int i9;
        this.f14166a = context.getPackageName();
        this.f14167b = ya.c.a(context);
        this.d = kVar;
        this.f14168c = ufVar;
        zf.b();
        this.f14171g = "subject-segmentation";
        ya.f a2 = ya.f.a();
        d7.p pVar = new d7.p(this, 7);
        a2.getClass();
        this.f14169e = ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        kVar.getClass();
        d7.q qVar = new d7.q(kVar, 4);
        a3.getClass();
        this.f14170f = ya.f.b(qVar);
        r rVar = f14165l;
        if (rVar.containsKey("subject-segmentation")) {
            i9 = i6.e.d(context, (String) rVar.get("subject-segmentation"), false);
        } else {
            i9 = -1;
        }
        this.h = i9;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(vf vfVar, hb hbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(hbVar, elapsedRealtime)) {
            return;
        }
        this.f14172i.put(hbVar, Long.valueOf(elapsedRealtime));
        ya.m.f49706a.execute(new af.f(this, vfVar.zza(), hbVar, c(), false, 6));
    }

    public final String c() {
        Task task = this.f14169e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return x5.i.f48933c.a(this.f14171g);
    }

    public final boolean d(hb hbVar, long j10) {
        HashMap hashMap = this.f14172i;
        if (hashMap.get(hbVar) == null || j10 - ((Long) hashMap.get(hbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
