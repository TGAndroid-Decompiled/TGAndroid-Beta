package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class gq5 {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public gq5(int i, Bitmap bitmap) {
        ite.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        ite.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        this.d = i;
    }

    public static gq5 a(int i, Bitmap bitmap) {
        h3f b;
        String a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gq5 gq5Var = new gq5(i, bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (b4f.class) {
            b = b4f.b(new Object());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        wne wneVar = wne.INPUT_IMAGE_CONSTRUCTION;
        Task task = b.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = b.i;
        if (hashMap.get(wneVar) != null && elapsedRealtime3 - ((Long) hashMap.get(wneVar)).longValue() <= 30000) {
            return gq5Var;
        }
        hashMap.put(wneVar, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.c = ple.BITMAP;
        obj.b = qme.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.a = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
        obj.g = Integer.valueOf(i & Integer.MAX_VALUE);
        zme zmeVar = new zme(obj);
        uqd uqdVar = new uqd((byte) 7);
        uqdVar.d = zmeVar;
        rhb rhbVar = new rhb(uqdVar);
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = r26.c.a(b.g);
        }
        mlb.c(1, new rz1(b, rhbVar, a));
        return gq5Var;
    }
}
