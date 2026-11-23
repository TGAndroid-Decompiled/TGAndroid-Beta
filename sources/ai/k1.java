package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
public final class k1 implements gs {
    public final String f1261a;
    public final long[] f1262b;
    public final l1 f1263c;
    public final File[] d;
    public final File f1264e;
    public final CountDownLatch f1265f;

    public k1(String str, long[] jArr, l1 l1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.f1261a = str;
        this.f1262b = jArr;
        this.f1263c = l1Var;
        this.d = fileArr;
        this.f1264e = file;
        this.f1265f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.f1261a;
            if (str.equals(obj2)) {
                this.f1262b[0] = SystemClock.elapsedRealtime();
                if (i7 == ls.X1) {
                    this.f1263c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i7 == ls.Y1) {
                    if (objArr.length > 1) {
                        Object obj3 = objArr[1];
                        if (obj3 instanceof File) {
                            file = (File) obj3;
                            this.d[0] = file;
                        }
                    }
                    file = this.f1264e;
                    this.d[0] = file;
                } else if (i7 == ls.Z1) {
                    StringBuilder u10 = a8.p0.u("speech models: ", str, " download failed (");
                    if (objArr.length > 1) {
                        obj = objArr[1];
                    } else {
                        obj = "";
                    }
                    u10.append(obj);
                    u10.append(")");
                    Log.d("Dictation", u10.toString());
                    np.g1().edit().remove("speech_models_checked").apply();
                } else {
                    return;
                }
                this.f1265f.countDown();
            }
        }
    }
}
