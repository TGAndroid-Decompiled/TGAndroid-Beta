package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class jq5 {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public jq5(int i, Bitmap bitmap) {
        xve.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        xve.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        this.d = i;
    }

    public static jq5 a(int i, Bitmap bitmap) {
        w5f a;
        String a2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jq5 jq5Var = new jq5(i, bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (q6f.class) {
            a = q6f.a(new Object());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        lqe lqeVar = lqe.INPUT_IMAGE_CONSTRUCTION;
        Task task = a.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a.i;
        if (hashMap.get(lqeVar) != null && elapsedRealtime3 - ((Long) hashMap.get(lqeVar)).longValue() <= 30000) {
            return jq5Var;
        }
        hashMap.put(lqeVar, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.c = eoe.BITMAP;
        obj.b = fpe.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.a = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
        obj.g = Integer.valueOf(i & Integer.MAX_VALUE);
        ope opeVar = new ope(obj);
        htd htdVar = new htd((byte) 7);
        htdVar.d = opeVar;
        zhc zhcVar = new zhc(htdVar);
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = v26.c.a(a.g);
        }
        xnb.c(1, new uy1(a, zhcVar, a2));
        return jq5Var;
    }
}
