package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
public final class ho3 implements jm7 {
    public final String a;
    public final long[] b;
    public final io3 c;
    public final File[] d;
    public final File e;
    public final CountDownLatch f;

    public ho3(String str, long[] jArr, io3 io3Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = jArr;
        this.c = io3Var;
        this.d = fileArr;
        this.e = file;
        this.f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.a;
            if (str.equals(obj2)) {
                this.b[0] = SystemClock.elapsedRealtime();
                if (i == nm7.X1) {
                    this.c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i == nm7.Y1) {
                    if (objArr.length > 1) {
                        Object obj3 = objArr[1];
                        if (obj3 instanceof File) {
                            file = (File) obj3;
                            this.d[0] = file;
                        }
                    }
                    file = this.e;
                    this.d[0] = file;
                } else if (i == nm7.Z1) {
                    StringBuilder p = wi8.p("speech models: ", str, " download failed (");
                    if (objArr.length > 1) {
                        obj = objArr[1];
                    } else {
                        obj = "";
                    }
                    p.append(obj);
                    p.append(")");
                    Log.d("Dictation", p.toString());
                    oc7.d1().edit().remove("speech_models_checked").apply();
                } else {
                    return;
                }
                this.f.countDown();
            }
        }
    }
}
