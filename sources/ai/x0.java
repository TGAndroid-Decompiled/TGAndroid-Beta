package ai;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationLid;
public final class x0 implements Runnable {
    public final int f1601a;
    public final File f1602b;

    public x0(File file, int i7) {
        this.f1601a = i7;
        this.f1602b = file;
    }

    @Override
    public final void run() {
        CountDownLatch e10;
        switch (this.f1601a) {
            case 0:
                File file = this.f1602b;
                ExecutorService executorService = DictationLid.f43071a;
                SharedPreferences g12 = mp.g1();
                long[] jArr = {0};
                try {
                    if (l1.d() && (e10 = l1.e()) != null) {
                        try {
                            e10.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f10 = l1.f(l1.a(), "tinylid");
                    if (f10 == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    int c10 = l1.c(f10, file, false, new a1.c(jArr, 8));
                    if (c10 >= 0) {
                        g12.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                    if (c10 > 0) {
                        DictationLid.f43074e = true;
                        DictationLid.f43076g = true;
                        DictationLid.f43071a.execute(new x0(file, 2));
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 1:
                DictationLid.g(this.f1602b);
                return;
            default:
                DictationLid.g(this.f1602b);
                return;
        }
    }
}
