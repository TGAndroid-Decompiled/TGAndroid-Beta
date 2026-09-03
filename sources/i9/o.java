package i9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f7980a;
    public final p f7981b;

    public o(p pVar, int i10) {
        this.f7980a = i10;
        this.f7981b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f7980a) {
            case 0:
                try {
                    f7.b bVar = this.f7981b.d;
                    n9.b bVar2 = (n9.b) bVar.f6121c;
                    bVar2.getClass();
                    boolean delete = new File(bVar2.f15874b, (String) bVar.f6120b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e6) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e6);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f7981b.f7986f;
                f7.b bVar3 = nVar.f7967c;
                n9.b bVar4 = (n9.b) bVar3.f6121c;
                String str = (String) bVar3.f6120b;
                bVar4.getClass();
                boolean z4 = true;
                if (!new File(bVar4.f15874b, str).exists()) {
                    String e10 = nVar.e();
                    if (e10 == null || !nVar.f7972j.c(e10)) {
                        z4 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    n9.b bVar5 = (n9.b) bVar3.f6121c;
                    bVar5.getClass();
                    new File(bVar5.f15874b, str).delete();
                }
                return Boolean.valueOf(z4);
        }
    }
}
