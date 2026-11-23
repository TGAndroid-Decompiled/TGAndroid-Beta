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
public final class x0 implements Runnable {
    public final int f1612a;
    public final File f1613b;

    public x0(File file, int i7) {
        this.f1612a = i7;
        this.f1613b = file;
    }

    @Override
    public final void run() {
        CountDownLatch e10;
        switch (this.f1612a) {
            case 0:
                File file = this.f1613b;
                ExecutorService executorService = DictationLid.f43075a;
                SharedPreferences g12 = np.g1();
                long[] jArr = {0};
                try {
                    if (m1.d() && (e10 = m1.e()) != null) {
                        try {
                            e10.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f10 = m1.f(m1.a(), "tinylid");
                    if (f10 == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    int c10 = m1.c(f10, file, false, new a1.c(jArr, 8));
                    if (c10 >= 0) {
                        g12.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                    if (c10 > 0) {
                        DictationLid.f43078e = true;
                        DictationLid.f43080g = true;
                        DictationLid.f43075a.execute(new x0(file, 2));
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 1:
                DictationLid.g(this.f1613b);
                return;
            default:
                DictationLid.g(this.f1613b);
                return;
        }
    }
}
