package ob;

import android.graphics.Bitmap;
import android.os.SystemClock;
import c5.w;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jb.m;
import m5.e;
import n6.i;
import n6.l;
import q5.d;
import w7.c7;
import w7.d7;
import w7.i7;
import w7.ja;
import w7.la;
import w7.x6;
public final class a {
    public volatile Bitmap f14122a;
    public final int f14123b;
    public final int f14124c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        l.g(bitmap);
        this.f14122a = bitmap;
        this.f14123b = bitmap.getWidth();
        this.f14124c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ja a2;
        Task task;
        a aVar;
        String a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (la.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = la.a(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        i7 i7Var = i7.INPUT_IMAGE_CONSTRUCTION;
        Task task2 = a2.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f52628i;
        if (hashMap.get(i7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(i7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(i7Var, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        obj.f12521c = x6.BITMAP;
        obj.f12520b = c7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f12522f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f12519a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        d7 d7Var = new d7(obj);
        d dVar = new d(17, false);
        dVar.d = d7Var;
        e eVar = new e(dVar);
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = i.f13600c.a(a2.f52627g);
        }
        m.f9798a.execute(new w(a2, eVar, a10));
        return aVar;
    }
}
