package h2;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import i9.n;
import i9.p;
import i9.s;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k7.fa;
import k7.ga;
import k7.na;
import k7.oa;
public final class g implements Callable {
    public final int f7202a;
    public final Object f7203b;
    public final Object f7204c;

    public g(int i10, Object obj, Object obj2) {
        this.f7202a = i10;
        this.f7204c = obj;
        this.f7203b = obj2;
    }

    @Override
    public final Object call() {
        ga gaVar;
        int i10 = this.f7202a;
        Object obj = this.f7204c;
        Object obj2 = this.f7203b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f1357b.get((String) obj2);
            case 1:
                f7.b bVar = (f7.b) obj;
                n nVar = (n) bVar.f6121c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : n9.b.e(nVar.f7970g.f15874b.listFiles(n.f7964r))) {
                        file.delete();
                    }
                    n9.b bVar2 = ((n9.a) nVar.f7975m.f156b).f15871b;
                    n9.a.a(n9.b.e(bVar2.d.listFiles()));
                    n9.a.a(n9.b.e(bVar2.f15876e.listFiles()));
                    n9.a.a(n9.b.e(bVar2.f15877f.listFiles()));
                    nVar.f7979q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f7966b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.f7968e.f47351b;
                    return ((Task) bVar.f6120b).onSuccessTask(executor, new f7.b(this, executor, false, 12));
                }
                sVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (e3.g) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                hb.a aVar = (hb.a) obj;
                HashMap hashMap = ga.f10589f;
                oa.b();
                int i11 = na.f10678a;
                oa.b();
                if (!Boolean.parseBoolean("")) {
                    gaVar = fa.h;
                } else {
                    HashMap hashMap2 = ga.f10589f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) hashMap2.get("detectorTaskWithResource#run");
                }
                gaVar.a();
                try {
                    Object e6 = mobileVisionBase.f4127b.e(aVar);
                    gaVar.close();
                    return e6;
                } catch (Throwable th2) {
                    try {
                        gaVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
        }
    }

    public g(MobileVisionBase mobileVisionBase, hb.a aVar) {
        this.f7202a = 4;
        this.f7203b = mobileVisionBase;
        this.f7204c = aVar;
    }
}
