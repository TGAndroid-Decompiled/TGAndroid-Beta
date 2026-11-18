package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
public final class h1 implements fs {
    public final String f1217a;
    public final long[] f1218b;
    public final i1 f1219c;
    public final File[] d;
    public final File f1220e;
    public final CountDownLatch f1221f;

    public h1(String str, long[] jArr, i1 i1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.f1217a = str;
        this.f1218b = jArr;
        this.f1219c = i1Var;
        this.d = fileArr;
        this.f1220e = file;
        this.f1221f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.f1217a;
            if (str.equals(obj2)) {
                this.f1218b[0] = SystemClock.elapsedRealtime();
                if (i7 == ks.X1) {
                    this.f1219c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i7 == ks.Y1) {
                    if (objArr.length > 1) {
                        Object obj3 = objArr[1];
                        if (obj3 instanceof File) {
                            file = (File) obj3;
                            this.d[0] = file;
                        }
                    }
                    file = this.f1220e;
                    this.d[0] = file;
                } else if (i7 == ks.Z1) {
                    StringBuilder u10 = a8.p0.u("speech models: ", str, " download failed (");
                    if (objArr.length > 1) {
                        obj = objArr[1];
                    } else {
                        obj = "";
                    }
                    u10.append(obj);
                    u10.append(")");
                    Log.d("Dictation", u10.toString());
                    mp.g1().edit().remove("speech_models_checked").apply();
                } else {
                    return;
                }
                this.f1221f.countDown();
            }
        }
    }
}
