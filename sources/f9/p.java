package f9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

public final class p implements Callable {

    public final int f5970a;

    public final q f5971b;

    public p(q qVar, int i10) {
        this.f5970a = i10;
        this.f5971b = qVar;
    }

    @Override
    public final Object call() {
        switch (this.f5970a) {
            case 0:
                try {
                    xe.b bVar = this.f5971b.d;
                    k9.c cVar = (k9.c) bVar.f49393c;
                    String str = (String) bVar.f49392b;
                    cVar.getClass();
                    boolean zDelete = new File(cVar.f15099b, str).delete();
                    if (!zDelete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(zDelete);
                } catch (Exception e9) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e9);
                    return Boolean.FALSE;
                }
            default:
                o oVar = this.f5971b.f5976f;
                xe.b bVar2 = oVar.f5957c;
                k9.c cVar2 = (k9.c) bVar2.f49393c;
                String str2 = (String) bVar2.f49392b;
                cVar2.getClass();
                boolean z10 = true;
                if (new File(cVar2.f15099b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    k9.c cVar3 = (k9.c) bVar2.f49393c;
                    cVar3.getClass();
                    new File(cVar3.f15099b, str2).delete();
                } else {
                    String strE = oVar.e();
                    if (strE == null || !oVar.f5962j.c(strE)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
