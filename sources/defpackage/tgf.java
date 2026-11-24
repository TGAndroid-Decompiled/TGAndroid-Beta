package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
public final class tgf {
    public static vfd k;
    public static final ngd l;
    public final String a;
    public final String b;
    public final ogf c;
    public final uha d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new ngd(objArr);
    }

    public tgf(Context context, uha uhaVar, ogf ogfVar) {
        int i;
        this.a = context.getPackageName();
        this.b = ao2.a(context);
        this.d = uhaVar;
        this.c = ogfVar;
        dhf.S();
        this.g = "subject-segmentation";
        ni6.q();
        this.e = ni6.E(new mg7(this, (byte) 9));
        ni6.q();
        uhaVar.getClass();
        this.f = ni6.E(new kze(uhaVar, (byte) 4));
        ngd ngdVar = l;
        if (ngdVar.containsKey("subject-segmentation")) {
            i = nt3.d(context, (String) ngdVar.get("subject-segmentation"), false);
        } else {
            i = -1;
        }
        this.h = i;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(rgf rgfVar, r7f r7fVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(r7fVar, elapsedRealtime)) {
            return;
        }
        this.i.put(r7fVar, Long.valueOf(elapsedRealtime));
        mlb.c(1, new de1(this, rgfVar.zza(), r7fVar, c(), (byte) 4));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return r26.c.a(this.g);
    }

    public final boolean d(r7f r7fVar, long j) {
        HashMap hashMap = this.i;
        if (hashMap.get(r7fVar) == null || j - ((Long) hashMap.get(r7fVar)).longValue() > 30000) {
            return true;
        }
        return false;
    }
}
