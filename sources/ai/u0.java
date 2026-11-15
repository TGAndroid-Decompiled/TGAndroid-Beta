package ai;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationLid;
public final class u0 implements Runnable {
    public final int f1561a;
    public final File f1562b;

    public u0(File file, int i7) {
        this.f1561a = i7;
        this.f1562b = file;
    }

    @Override
    public final void run() {
        CountDownLatch e10;
        switch (this.f1561a) {
            case 0:
                File file = this.f1562b;
                ExecutorService executorService = DictationLid.f42585a;
                SharedPreferences e12 = np.e1();
                long[] jArr = {0};
                try {
                    if (i1.d() && (e10 = i1.e()) != null) {
                        try {
                            e10.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f10 = i1.f(i1.a(), "tinylid");
                    if (f10 == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    int c10 = i1.c(f10, file, new a1.c(jArr, 8));
                    if (c10 >= 0) {
                        e12.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                    if (c10 > 0) {
                        DictationLid.f42588e = true;
                        DictationLid.f42590g = true;
                        DictationLid.f42585a.execute(new u0(file, 2));
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 1:
                DictationLid.g(this.f1562b);
                return;
            default:
                DictationLid.g(this.f1562b);
                return;
        }
    }
}
