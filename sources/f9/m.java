package f9;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import h7.fa;
import h7.ga;
import h7.na;
import h7.oa;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class m implements Callable {

    public final int f5949a;

    public final Object f5950b;

    public final Object f5951c;

    public m(int i10, Object obj, Object obj2) {
        this.f5949a = i10;
        this.f5951c = obj;
        this.f5950b = obj2;
    }

    @Override
    public final Object call() {
        ga gaVar;
        int i10 = this.f5949a;
        Object obj = this.f5950b;
        Object obj2 = this.f5951c;
        switch (i10) {
            case 0:
                xe.b bVar = (xe.b) obj2;
                o oVar = (o) bVar.f49393c;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    t tVar = oVar.f5956b;
                    if (!zBooleanValue) {
                        tVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    tVar.h.trySetResult(null);
                    Executor executor = (Executor) oVar.f5958e.f4619b;
                    return ((Task) bVar.f49392b).onSuccessTask(executor, new xe.b(25, this, executor));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = k9.c.e(oVar.f5960g.f15099b.listFiles(o.f5954r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                k9.c cVar = ((k9.b) oVar.f5965m.f4603b).f15096b;
                k9.b.a(k9.c.e(cVar.d.listFiles()));
                k9.b.a(k9.c.e(cVar.f15101e.listFiles()));
                k9.b.a(k9.c.e(cVar.f15102f.listFiles()));
                oVar.f5969q.trySetResult(null);
                return Tasks.forResult(null);
            case 1:
                o.a((o) obj2, (String) obj, Boolean.FALSE);
                return null;
            case 2:
                return q.a((q) obj2, (c3.g) obj);
            case 3:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                eb.a aVar = (eb.a) obj2;
                HashMap map = ga.f8403f;
                oa.b();
                int i11 = na.f8494a;
                oa.b();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = ga.f8403f;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) map2.get("detectorTaskWithResource#run");
                } else {
                    gaVar = fa.h;
                }
                gaVar.a();
                try {
                    Object objE = mobileVisionBase.f4664b.e(aVar);
                    gaVar.close();
                    return objE;
                } catch (Throwable th) {
                    try {
                        gaVar.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            default:
                return (h2.f) ((ShortcutInfoCompatSaverImpl) obj2).f1872b.get((String) obj);
        }
    }

    public m(MobileVisionBase mobileVisionBase, eb.a aVar) {
        this.f5949a = 3;
        this.f5950b = mobileVisionBase;
        this.f5951c = aVar;
    }
}
