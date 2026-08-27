package eb;

import a5.n;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import g5.b;
import h7.c7;
import h7.d7;
import h7.ha;
import h7.i7;
import h7.ka;
import h7.ma;
import h7.x6;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m.t3;
import y5.i;
import y5.l;
import za.m;

public final class a {

    public volatile Bitmap f5363a;

    public final int f5364b;

    public final int f5365c;
    public final int d;

    public final int f5366e;

    public a(Bitmap bitmap, int i10) {
        l.h(bitmap);
        this.f5363a = bitmap;
        this.f5364b = bitmap.getWidth();
        this.f5365c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.f5366e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ka kaVarA;
        a aVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            try {
                if (b10 != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((b10 & 1) == 0) {
                        sb2.append(" enableFirelog");
                    }
                    if ((b10 & 2) == 0) {
                        sb2.append(" firelogEventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                }
                kaVarA = ma.a(new ha());
            } catch (Throwable th) {
                throw th;
            }
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        i7 i7Var = i7.INPUT_IMAGE_CONSTRUCTION;
        Task task = kaVarA.f8452e;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap map = kaVarA.f8455i;
        if (map.get(i7Var) == null) {
            aVar = aVar2;
        } else {
            aVar = aVar2;
            if (jElapsedRealtime3 - ((Long) map.get(i7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        map.put(i7Var, Long.valueOf(jElapsedRealtime3));
        t3 t3Var = new t3();
        t3Var.f17475c = x6.BITMAP;
        t3Var.f17474b = c7.BITMAP;
        t3Var.d = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        t3Var.f17477f = Integer.valueOf(height & Integer.MAX_VALUE);
        t3Var.f17476e = Integer.valueOf(width & Integer.MAX_VALUE);
        t3Var.f17473a = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime2);
        t3Var.h = Integer.valueOf(i10 & Integer.MAX_VALUE);
        d7 d7Var = new d7(t3Var);
        n nVar = new n(20, false);
        nVar.d = d7Var;
        m.f50301a.execute(new q1(kaVarA, new b(nVar), task.isSuccessful() ? (String) task.getResult() : i.f49650c.a(kaVarA.f8454g)));
        return aVar;
    }
}
