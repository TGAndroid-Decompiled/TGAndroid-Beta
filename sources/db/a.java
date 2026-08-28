package db;

import a5.m;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import g5.b;
import g7.c7;
import g7.d7;
import g7.i7;
import g7.ka;
import g7.ma;
import g7.x6;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import x5.i;
import x5.l;
public final class a {
    public volatile Bitmap f4466a;
    public final int f4467b;
    public final int f4468c;
    public final int d;
    public final int f4469e;

    public a(Bitmap bitmap, int i9) {
        l.h(bitmap);
        this.f4466a = bitmap;
        this.f4467b = bitmap.getWidth();
        this.f4468c = bitmap.getHeight();
        boolean z10 = true;
        if (i9 != 0 && i9 != 90 && i9 != 180 && i9 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i9;
        this.f4469e = -1;
    }

    public static a a(Bitmap bitmap, int i9) {
        ka a2;
        Task task;
        a aVar;
        String a3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i9);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = ma.a(new Object());
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
        Task task2 = a2.f7282e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f7285i;
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
        obj.f17100c = x6.BITMAP;
        obj.f17099b = c7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f17102f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.f17101e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f17098a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i9 & Integer.MAX_VALUE);
        d7 d7Var = new d7(obj);
        m mVar = new m(19, false);
        mVar.d = d7Var;
        b bVar = new b(mVar);
        if (task.isSuccessful()) {
            a3 = (String) task.getResult();
        } else {
            a3 = i.f48933c.a(a2.f7284g);
        }
        ya.m.f49706a.execute(new q1(a2, bVar, a3));
        return aVar;
    }
}
