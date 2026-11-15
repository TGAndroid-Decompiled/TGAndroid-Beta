package aa;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final w f816a;
    public final i f817b;

    public j(w wVar, ga.d dVar) {
        this.f816a = wVar;
        this.f817b = new i(dVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f817b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f814b, str)) {
                return iVar.f815c;
            }
            ga.d dVar = iVar.f813a;
            h hVar = i.d;
            File file = new File((File) dVar.f12965e, str);
            file.mkdirs();
            List i7 = ga.d.i(file.listFiles(hVar));
            if (i7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(i7, i.f812e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f817b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f814b, str)) {
                i.a(iVar.f813a, str, iVar.f815c);
                iVar.f814b = str;
            }
        }
    }
}
