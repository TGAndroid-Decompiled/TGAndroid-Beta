package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
public final class f1 implements fs {
    public final String f1190a;
    public final long[] f1191b;
    public final g1 f1192c;
    public final File[] d;
    public final File f1193e;
    public final CountDownLatch f1194f;

    public f1(String str, long[] jArr, g1 g1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.f1190a = str;
        this.f1191b = jArr;
        this.f1192c = g1Var;
        this.d = fileArr;
        this.f1193e = file;
        this.f1194f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.f1190a;
            if (str.equals(obj2)) {
                this.f1191b[0] = SystemClock.elapsedRealtime();
                if (i7 == ks.X1) {
                    this.f1192c.b(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
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
                    file = this.f1193e;
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
                this.f1194f.countDown();
            }
        }
    }
}
