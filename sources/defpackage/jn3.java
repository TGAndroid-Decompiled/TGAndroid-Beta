package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class jn3 implements Runnable {
    public final byte a;
    public final File b;

    public jn3(File file, byte b) {
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
                SharedPreferences e1 = uc7.e1();
                boolean z = true;
                long[] jArr = {0};
                try {
                    CountDownLatch e = qn3.e();
                    if (e != null) {
                        try {
                            e.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f = qn3.f(qn3.a(), "tinylid");
                    if (f == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    if (qn3.i(f, file)) {
                        Log.d("Dictation", "tinylid: a newer model on the server, updating");
                    }
                    c = qn3.c(f, file, true, new ht2(jArr, (byte) 27));
                    if (c >= 0) {
                        e1.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                if (c > 0) {
                    DictationLid.e = true;
                    DictationLid.g = true;
                    try {
                        DictationLid.a.execute(new jn3(file, (byte) 2));
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
                            DictationLid.g();
                            DictationAsr.K("tinylid.bin");
                        }
                    }
                    return;
                }
                return;
            case 1:
                DictationLid.f(file);
                return;
            case 2:
                DictationLid.f(file);
                DictationLid.h = false;
                DictationLid.g();
                return;
            default:
                OpusDred.lambda$loadDocument$10(file);
                return;
        }
    }
}
