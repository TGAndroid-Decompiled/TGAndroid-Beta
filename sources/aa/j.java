package aa;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final x f817a;
    public final i f818b;

    public j(x xVar, ga.d dVar) {
        this.f817a = xVar;
        this.f818b = new i(dVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f818b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f815b, str)) {
                return iVar.f816c;
            }
            ga.d dVar = iVar.f814a;
            h hVar = i.d;
            File file = new File((File) dVar.f13618e, str);
            file.mkdirs();
            List i7 = ga.d.i(file.listFiles(hVar));
            if (i7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(i7, i.f813e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f818b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f815b, str)) {
                i.a(iVar.f814a, str, iVar.f816c);
                iVar.f815b = str;
            }
        }
    }
}
