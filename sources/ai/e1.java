package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
public final class e1 implements gs {
    public final String f1176a;
    public final long[] f1177b;
    public final f1 f1178c;
    public final File[] d;
    public final File f1179e;
    public final CountDownLatch f1180f;

    public e1(String str, long[] jArr, f1 f1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.f1176a = str;
        this.f1177b = jArr;
        this.f1178c = f1Var;
        this.d = fileArr;
        this.f1179e = file;
        this.f1180f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.f1176a;
            if (str.equals(obj2)) {
                this.f1177b[0] = SystemClock.elapsedRealtime();
                if (i7 == ls.X1) {
                    this.f1178c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
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
                    file = this.f1179e;
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
                this.f1180f.countDown();
            }
        }
    }
}
