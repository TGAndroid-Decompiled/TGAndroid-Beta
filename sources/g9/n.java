package g9;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import i7.fa;
import i7.ga;
import i7.na;
import i7.oa;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
public final class n implements Callable {
    public final int f7174a;
    public final Object f7175b;
    public final Object f7176c;

    public n(int i10, Object obj, Object obj2) {
        this.f7174a = i10;
        this.f7176c = obj;
        this.f7175b = obj2;
    }

    @Override
    public final Object call() {
        ga gaVar;
        int i10 = this.f7174a;
        Object obj = this.f7175b;
        Object obj2 = this.f7176c;
        switch (i10) {
            case 0:
                l lVar = (l) obj2;
                p pVar = (p) lVar.f7169c;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : l9.b.e(pVar.f7185g.f15103b.listFiles(p.f7179r))) {
                        file.delete();
                    }
                    l9.b bVar = ((l9.a) pVar.f7190m.f2119b).f15100b;
                    l9.a.a(l9.b.e(bVar.d.listFiles()));
                    l9.a.a(l9.b.e(bVar.f15105e.listFiles()));
                    l9.a.a(l9.b.e(bVar.f15106f.listFiles()));
                    pVar.f7194q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                u uVar = pVar.f7181b;
                if (booleanValue) {
                    uVar.h.trySetResult(null);
                    Executor executor = (Executor) pVar.f7183e.f5185b;
                    return ((Task) lVar.f7168b).onSuccessTask(executor, new l(1, this, executor));
                }
                uVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 1:
                p.a((p) obj2, (String) obj, Boolean.FALSE);
                return null;
            case 2:
                return r.a((r) obj2, (e3.f) obj);
            case 3:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                fb.a aVar = (fb.a) obj2;
                HashMap hashMap = ga.f8377f;
                oa.b();
                int i11 = na.f8463a;
                oa.b();
                if (!Boolean.parseBoolean("")) {
                    gaVar = fa.h;
                } else {
                    HashMap hashMap2 = ga.f8377f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) hashMap2.get("detectorTaskWithResource#run");
                }
                gaVar.a();
                try {
                    Object e10 = mobileVisionBase.f5231b.e(aVar);
                    gaVar.close();
                    return e10;
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
            default:
                return (h2.f) ((ShortcutInfoCompatSaverImpl) obj2).f1866b.get((String) obj);
        }
    }

    public n(MobileVisionBase mobileVisionBase, fb.a aVar) {
        this.f7174a = 3;
        this.f7175b = mobileVisionBase;
        this.f7176c = aVar;
    }
}
