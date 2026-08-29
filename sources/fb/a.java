package fb;

import ab.q;
import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.biometric.e;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import i7.d7;
import i7.e7;
import i7.j7;
import i7.ka;
import i7.ma;
import i7.y6;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import z5.i;
import z5.l;
public final class a {
    public volatile Bitmap f6699a;
    public final int f6700b;
    public final int f6701c;
    public final int d;
    public final int f6702e;

    public a(Bitmap bitmap, int i10) {
        l.h(bitmap);
        this.f6699a = bitmap;
        this.f6700b = bitmap.getWidth();
        this.f6701c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.f6702e = -1;
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
        j7 j7Var = j7.INPUT_IMAGE_CONSTRUCTION;
        Task task2 = a2.f8426e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.f8429i;
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
        obj.f16690c = y6.BITMAP;
        obj.f16689b = d7.BITMAP;
        obj.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        obj.f16692f = Integer.valueOf(height & Integer.MAX_VALUE);
        obj.f16691e = Integer.valueOf(width & Integer.MAX_VALUE);
        obj.f16688a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        obj.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        e7 e7Var = new e7(obj);
        e eVar = new e(19, false);
        eVar.d = e7Var;
        g9.l lVar = new g9.l(eVar);
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = i.f50633c.a(a2.f8428g);
        }
        q.f333a.execute(new q1(a2, lVar, a10));
        return aVar;
    }
}
