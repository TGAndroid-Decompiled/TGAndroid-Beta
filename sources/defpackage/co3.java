package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class co3 implements Runnable {
    public final byte a;
    public final File b;

    public co3(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    @Override
    public final void run() {
        int c;
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                SharedPreferences d1 = oc7.d1();
                boolean z = true;
                long[] jArr = {0};
                try {
                    CountDownLatch e = jo3.e();
                    if (e != null) {
                        try {
                            e.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f = jo3.f(jo3.a(), "tinylid");
                    if (f == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    if (jo3.i(f, file)) {
                        Log.d("Dictation", "tinylid: a newer model on the server, updating");
                    }
                    c = jo3.c(f, file, true, new wm2(jArr, (byte) 28));
                    if (c >= 0) {
                        d1.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                if (c > 0) {
                    DictationLid.e = true;
                    DictationLid.g = true;
                    try {
                        DictationLid.a.execute(new co3(file, (byte) 2));
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Log.d("Dictation", "tinylid: download failed: " + th);
                            break;
                        } finally {
                            if (!z) {
                                DictationLid.h = false;
                            }
                            DictationLid.f = false;
                            DictationLid.f();
                            DictationAsr.I("tinylid.bin");
                        }
                    }
                    return;
                }
                return;
            case 1:
                DictationLid.e(file);
                return;
            default:
                DictationLid.e(file);
                DictationLid.h = false;
                DictationLid.f();
                return;
        }
    }
}
