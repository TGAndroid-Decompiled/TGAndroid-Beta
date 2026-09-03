package i9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f7396a;
    public final p f7397b;

    public o(p pVar, int i10) {
        this.f7396a = i10;
        this.f7397b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f7396a) {
            case 0:
                try {
                    f7.b bVar = this.f7397b.d;
                    n9.b bVar2 = (n9.b) bVar.f6002c;
                    bVar2.getClass();
                    boolean delete = new File(bVar2.f14847b, (String) bVar.f6001b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f7397b.f7401f;
                f7.b bVar3 = nVar.f7384c;
                n9.b bVar4 = (n9.b) bVar3.f6002c;
                String str = (String) bVar3.f6001b;
                bVar4.getClass();
                boolean z4 = true;
                if (!new File(bVar4.f14847b, str).exists()) {
                    String e6 = nVar.e();
                    if (e6 == null || !nVar.f7388j.c(e6)) {
                        z4 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    n9.b bVar5 = (n9.b) bVar3.f6002c;
                    bVar5.getClass();
                    new File(bVar5.f14847b, str).delete();
                }
                return Boolean.valueOf(z4);
        }
    }
}
