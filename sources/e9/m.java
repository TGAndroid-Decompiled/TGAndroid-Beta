package e9;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import g7.fa;
import g7.ga;
import g7.na;
import g7.oa;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
public final class m implements Callable {
    public final int f5017a;
    public final Object f5018b;
    public final Object f5019c;

    public m(int i9, Object obj, Object obj2) {
        this.f5017a = i9;
        this.f5019c = obj;
        this.f5018b = obj2;
    }

    @Override
    public final Object call() {
        ga gaVar;
        int i9 = this.f5017a;
        Object obj = this.f5018b;
        Object obj2 = this.f5019c;
        switch (i9) {
            case 0:
                we.b bVar = (we.b) obj2;
                o oVar = (o) bVar.f48794c;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : j9.c.e(oVar.f5028g.f14245b.listFiles(o.f5022r))) {
                        file.delete();
                    }
                    j9.c cVar = ((j9.b) oVar.f5033m.f4161b).f14242b;
                    j9.b.a(j9.c.e(cVar.d.listFiles()));
                    j9.b.a(j9.c.e(cVar.f14247e.listFiles()));
                    j9.b.a(j9.c.e(cVar.f14248f.listFiles()));
                    oVar.f5037q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                t tVar = oVar.f5024b;
                if (booleanValue) {
                    tVar.h.trySetResult(null);
                    Executor executor = (Executor) oVar.f5026e.f4177b;
                    return ((Task) bVar.f48793b).onSuccessTask(executor, new we.b(22, this, executor));
                }
                tVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case 1:
                o.a((o) obj2, (String) obj, Boolean.FALSE);
                return null;
            case 2:
                return q.a((q) obj2, (c3.h) obj);
            case 3:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                db.a aVar = (db.a) obj2;
                HashMap hashMap = ga.f7232f;
                oa.b();
                int i10 = na.f7322a;
                oa.b();
                if (!Boolean.parseBoolean("")) {
                    gaVar = fa.h;
                } else {
                    HashMap hashMap2 = ga.f7232f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) hashMap2.get("detectorTaskWithResource#run");
                }
                gaVar.a();
                try {
                    Object e10 = mobileVisionBase.f4222b.e(aVar);
                    gaVar.close();
                    return e10;
                } catch (Throwable th) {
                    try {
                        gaVar.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            default:
                return (h2.f) ((ShortcutInfoCompatSaverImpl) obj2).f1376b.get((String) obj);
        }
    }

    public m(MobileVisionBase mobileVisionBase, db.a aVar) {
        this.f5017a = 3;
        this.f5018b = mobileVisionBase;
        this.f5019c = aVar;
    }
}
