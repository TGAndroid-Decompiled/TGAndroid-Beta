package ai;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
public final class g1 implements is {
    public final String f1214a;
    public final long[] f1215b;
    public final h1 f1216c;
    public final File[] d;
    public final File f1217e;
    public final CountDownLatch f1218f;

    public g1(String str, long[] jArr, h1 h1Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.f1214a = str;
        this.f1215b = jArr;
        this.f1216c = h1Var;
        this.d = fileArr;
        this.f1217e = file;
        this.f1218f = countDownLatch;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        File file;
        if (objArr.length != 0) {
            Object obj2 = objArr[0];
            String str = this.f1214a;
            if (str.equals(obj2)) {
                this.f1215b[0] = SystemClock.elapsedRealtime();
                if (i7 == ns.X1) {
                    this.f1216c.b(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i7 == ns.Y1) {
                    if (objArr.length > 1) {
                        Object obj3 = objArr[1];
                        if (obj3 instanceof File) {
                            file = (File) obj3;
                            this.d[0] = file;
                        }
                    }
                    file = this.f1217e;
                    this.d[0] = file;
                } else if (i7 == ns.Z1) {
                    StringBuilder u10 = a8.p0.u("speech models: ", str, " download failed (");
                    if (objArr.length > 1) {
                        obj = objArr[1];
                    } else {
                        obj = "";
                    }
                    u10.append(obj);
                    u10.append(")");
                    Log.d("Dictation", u10.toString());
                    np.e1().edit().remove("speech_models_checked").apply();
                } else {
                    return;
                }
                this.f1218f.countDown();
            }
        }
    }
}
