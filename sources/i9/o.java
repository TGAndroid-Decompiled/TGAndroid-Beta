package i9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f7414a;
    public final p f7415b;

    public o(p pVar, int i10) {
        this.f7414a = i10;
        this.f7415b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f7414a) {
            case 0:
                try {
                    f7.b bVar = this.f7415b.d;
                    n9.b bVar2 = (n9.b) bVar.f6013c;
                    bVar2.getClass();
                    boolean delete = new File(bVar2.f14862b, (String) bVar.f6012b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f7415b.f7419f;
                f7.b bVar3 = nVar.f7402c;
                n9.b bVar4 = (n9.b) bVar3.f6013c;
                String str = (String) bVar3.f6012b;
                bVar4.getClass();
                boolean z4 = true;
                if (!new File(bVar4.f14862b, str).exists()) {
                    String e6 = nVar.e();
                    if (e6 == null || !nVar.f7406j.c(e6)) {
                        z4 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    n9.b bVar5 = (n9.b) bVar3.f6013c;
                    bVar5.getClass();
                    new File(bVar5.f14862b, str).delete();
                }
                return Boolean.valueOf(z4);
        }
    }
}
