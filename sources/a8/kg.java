package a8;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public final class kg {
    public static r f577k;
    public static final w f578l;
    public final String f579a;
    public final String f580b;
    public final eg f581c;
    public final sb.k d;
    public final Task e;
    public final Task f582f;
    public final String f583g;
    public final int h;
    public final HashMap f584i = new HashMap();
    public final HashMap f585j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f578l = new w(objArr);
    }

    public kg(Context context, sb.k kVar, eg egVar) {
        int i10;
        this.f579a = context.getPackageName();
        this.f580b = sb.c.a(context);
        this.d = kVar;
        this.f581c = egVar;
        sg.b();
        this.f583g = "subject-segmentation";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 0);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 0);
        a10.getClass();
        this.f582f = sb.f.b(hgVar);
        w wVar = f578l;
        if (wVar.containsKey("subject-segmentation")) {
            i10 = z6.e.d(context, (String) wVar.get("subject-segmentation"), false);
        } else {
            i10 = -1;
        }
        this.h = i10;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(jg jgVar, rb rbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(rbVar, elapsedRealtime)) {
            return;
        }
        this.f584i.put(rbVar, Long.valueOf(elapsedRealtime));
        sb.m.f48061a.execute(new fg(this, jgVar.zza(), rbVar, c(), 0));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return o6.i.f19141c.a(this.f583g);
    }

    public final boolean d(rb rbVar, long j10) {
        HashMap hashMap = this.f584i;
        if (hashMap.get(rbVar) == null || j10 - ((Long) hashMap.get(rbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
