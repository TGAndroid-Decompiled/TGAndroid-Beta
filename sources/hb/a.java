package hb;

import af.d;
import android.graphics.Bitmap;
import android.os.SystemClock;
import b6.j;
import b6.m;
import cb.o;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.tasks.Task;
import f7.b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k7.d7;
import k7.e7;
import k7.j7;
import k7.ka;
import k7.ma;
import k7.y6;
public final class a {
    public volatile Bitmap f7038a;
    public final int f7039b;
    public final int f7040c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        m.h(bitmap);
        this.f7038a = bitmap;
        this.f7039b = bitmap.getWidth();
        this.f7040c = bitmap.getHeight();
        boolean z4 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z4 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z4);
        this.d = i10;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ka a2;
        Task task;
        a aVar;
        String a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = ma.a(new Object());
            } else {
                StringBuilder sb = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        j7 j7Var = j7.INPUT_IMAGE_CONSTRUCTION;
        Task task2 = a2.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f9892i;
        if (hashMap.get(j7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(j7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(j7Var, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.f13627c = y6.BITMAP;
        obj.f13626b = d7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f13628f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f13625a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        e7 e7Var = new e7(obj);
        d dVar = new d(27, false);
        dVar.d = e7Var;
        b bVar = new b(dVar);
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = j.f1619c.a(a2.f9891g);
        }
        o.f2260a.execute(new s1(a2, bVar, a10));
        return aVar;
    }
}
