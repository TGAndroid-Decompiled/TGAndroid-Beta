package e9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class p implements Callable {
    public final int f5038a;
    public final q f5039b;

    public p(q qVar, int i9) {
        this.f5038a = i9;
        this.f5039b = qVar;
    }

    @Override
    public final Object call() {
        switch (this.f5038a) {
            case 0:
                try {
                    we.b bVar = this.f5039b.d;
                    j9.c cVar = (j9.c) bVar.f48794c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f14245b, (String) bVar.f48793b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                    return Boolean.FALSE;
                }
            default:
                o oVar = this.f5039b.f5044f;
                we.b bVar2 = oVar.f5025c;
                j9.c cVar2 = (j9.c) bVar2.f48794c;
                String str = (String) bVar2.f48793b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f14245b, str).exists()) {
                    String e11 = oVar.e();
                    if (e11 == null || !oVar.f5030j.c(e11)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    j9.c cVar3 = (j9.c) bVar2.f48794c;
                    cVar3.getClass();
                    new File(cVar3.f14245b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
