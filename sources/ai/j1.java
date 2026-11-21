package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
public final class j1 implements fs {
    public final String f1242a;
    public final long[] f1243b;
    public final k1 f1244c;
    public final File[] d;
    public final File f1245e;
    public final CountDownLatch f1246f;

    public j1(String str, long[] jArr, k1 k1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.f1242a = str;
        this.f1243b = jArr;
        this.f1244c = k1Var;
        this.d = fileArr;
        this.f1245e = file;
        this.f1246f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.f1242a;
            if (str.equals(obj2)) {
                this.f1243b[0] = SystemClock.elapsedRealtime();
                if (i7 == ks.X1) {
                    this.f1244c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
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
                    file = this.f1245e;
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
                this.f1246f.countDown();
            }
        }
    }
}
