package g9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class q implements Callable {
    public final int f7195a;
    public final r f7196b;

    public q(r rVar, int i10) {
        this.f7195a = i10;
        this.f7196b = rVar;
    }

    @Override
    public final Object call() {
        switch (this.f7195a) {
            case 0:
                try {
                    l lVar = this.f7196b.d;
                    l9.b bVar = (l9.b) lVar.f7169c;
                    bVar.getClass();
                    boolean delete = new File(bVar.f15103b, (String) lVar.f7168b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                    return Boolean.FALSE;
                }
            default:
                p pVar = this.f7196b.f7201f;
                l lVar2 = pVar.f7182c;
                l9.b bVar2 = (l9.b) lVar2.f7169c;
                String str = (String) lVar2.f7168b;
                bVar2.getClass();
                boolean z10 = true;
                if (!new File(bVar2.f15103b, str).exists()) {
                    String e11 = pVar.e();
                    if (e11 == null || !pVar.f7187j.c(e11)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    l9.b bVar3 = (l9.b) lVar2.f7169c;
                    bVar3.getClass();
                    new File(bVar3.f15103b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
