package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
public final class xm3 implements gk7 {
    public final String a;
    public final long[] b;
    public final ym3 c;
    public final File[] d;
    public final File e;
    public final CountDownLatch f;

    public xm3(String str, long[] jArr, ym3 ym3Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = jArr;
        this.c = ym3Var;
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
                if (i == kk7.W1) {
                    this.c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i == kk7.X1) {
                    if (objArr.length > 1) {
                        Object obj3 = objArr[1];
                        if (obj3 instanceof File) {
                            file = (File) obj3;
                            this.d[0] = file;
                        }
                    }
                    file = this.e;
                    this.d[0] = file;
                } else if (i == kk7.Y1) {
                    StringBuilder p = ug8.p("speech models: ", str, " download failed (");
                    if (objArr.length > 1) {
                        obj = objArr[1];
                    } else {
                        obj = "";
                    }
                    p.append(obj);
                    p.append(")");
                    Log.d("Dictation", p.toString());
                    na7.c1().edit().remove("speech_models_checked").apply();
                } else {
                    return;
                }
                this.f.countDown();
            }
        }
    }
}
