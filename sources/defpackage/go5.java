package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class go5 {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public go5(int i, Bitmap bitmap) {
        fre.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        fre.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        this.d = i;
    }

    public static go5 a(int i, Bitmap bitmap) {
        f1f b;
        String a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        go5 go5Var = new go5(i, bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (z1f.class) {
            b = z1f.b(new Object());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        ule uleVar = ule.INPUT_IMAGE_CONSTRUCTION;
        Task task = b.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = b.i;
        if (hashMap.get(uleVar) != null && elapsedRealtime3 - ((Long) hashMap.get(uleVar)).longValue() <= 30000) {
            return go5Var;
        }
        hashMap.put(uleVar, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.c = nje.BITMAP;
        obj.b = oke.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.a = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
        obj.g = Integer.valueOf(i & Integer.MAX_VALUE);
        xke xkeVar = new xke(obj);
        rod rodVar = new rod((byte) 7);
        rodVar.d = xkeVar;
        aec aecVar = new aec(rodVar);
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = r06.c.a(b.g);
        }
        yjb.c(1, new ey1(b, aecVar, a));
        return go5Var;
    }
}
