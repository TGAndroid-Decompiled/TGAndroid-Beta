package hb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.biometric.e;
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
    public volatile Bitmap f7366a;
    public final int f7367b;
    public final int f7368c;
    public final int d;
    public final int f7369e;

    public a(Bitmap bitmap, int i10) {
        m.h(bitmap);
        this.f7366a = bitmap;
        this.f7367b = bitmap.getWidth();
        this.f7368c = bitmap.getHeight();
        boolean z4 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z4 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z4);
        this.d = i10;
        this.f7369e = -1;
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
        Task task2 = a2.f10639e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f10642i;
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
        obj.f13331c = y6.BITMAP;
        obj.f13330b = d7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f13333f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.f13332e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f13329a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        e7 e7Var = new e7(obj);
        e eVar = new e(27, false);
        eVar.d = e7Var;
        b bVar = new b(eVar);
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = j.f1739c.a(a2.f10641g);
        }
        o.f2429a.execute(new s1(a2, bVar, a10));
        return aVar;
    }
}
