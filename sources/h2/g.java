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
    public final int f6904a;
    public final Object f6905b;
    public final Object f6906c;

    public g(int i10, Object obj, Object obj2) {
        this.f6904a = i10;
        this.f6906c = obj;
        this.f6905b = obj2;
    }

    @Override
    public final Object call() {
        ga gaVar;
        int i10 = this.f6904a;
        Object obj = this.f6906c;
        Object obj2 = this.f6905b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).f1258b.get((String) obj2);
            case 1:
                f7.b bVar = (f7.b) obj;
                n nVar = (n) bVar.f6013c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : n9.b.e(nVar.f7404g.f14862b.listFiles(n.f7399r))) {
                        file.delete();
                    }
                    n9.b bVar2 = ((n9.a) nVar.f7409m.f144b).f14859b;
                    n9.a.a(n9.b.e(bVar2.d.listFiles()));
                    n9.a.a(n9.b.e(bVar2.e.listFiles()));
                    n9.a.a(n9.b.e(bVar2.f14864f.listFiles()));
                    nVar.f7413q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.f7401b;
                if (booleanValue) {
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.e.f4028b;
                    return ((Task) bVar.f6012b).onSuccessTask(executor, new f7.b(this, executor, false, 12));
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
                HashMap hashMap = ga.f9863f;
                oa.b();
                int i11 = na.f9949a;
                oa.b();
                if (!Boolean.parseBoolean("")) {
                    gaVar = fa.h;
                } else {
                    HashMap hashMap2 = ga.f9863f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) hashMap2.get("detectorTaskWithResource#run");
                }
                gaVar.a();
                try {
                    Object e = mobileVisionBase.f4070b.e(aVar);
                    gaVar.close();
                    return e;
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
        this.f6904a = 4;
        this.f6905b = mobileVisionBase;
        this.f6906c = aVar;
    }
}
