package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
public final class ijf {
    public static lid k;
    public static final djd l;
    public final String a;
    public final String b;
    public final djf c;
    public final lja d;
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
        l = new djd(objArr);
    }

    public ijf(Context context, lja ljaVar, djf djfVar) {
        int i;
        this.a = context.getPackageName();
        this.b = in2.a(context);
        this.d = ljaVar;
        this.c = djfVar;
        sjf.S();
        this.g = "subject-segmentation";
        ri6.v();
        this.e = ri6.G(new tg7(this, (byte) 9));
        ri6.v();
        ljaVar.getClass();
        this.f = ri6.G(new z1f(ljaVar, (byte) 4));
        djd djdVar = l;
        if (djdVar.containsKey("subject-segmentation")) {
            i = vs3.d(context, (String) djdVar.get("subject-segmentation"), false);
        } else {
            i = -1;
        }
        this.h = i;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(gjf gjfVar, gaf gafVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(gafVar, elapsedRealtime)) {
            return;
        }
        this.i.put(gafVar, Long.valueOf(elapsedRealtime));
        xnb.c(1, new dd1(this, gjfVar.zza(), gafVar, c(), (byte) 4));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return v26.c.a(this.g);
    }

    public final boolean d(gaf gafVar, long j) {
        HashMap hashMap = this.i;
        if (hashMap.get(gafVar) == null || j - ((Long) hashMap.get(gafVar)).longValue() > 30000) {
            return true;
        }
        return false;
    }
}
