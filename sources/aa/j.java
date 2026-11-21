package aa;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class j {
    public final w f815a;
    public final i f816b;

    public j(w wVar, ga.d dVar) {
        this.f815a = wVar;
        this.f816b = new i(dVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.f816b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f813b, str)) {
                return iVar.f814c;
            }
            ga.d dVar = iVar.f812a;
            h hVar = i.d;
            File file = new File((File) dVar.f13308e, str);
            file.mkdirs();
            List i7 = ga.d.i(file.listFiles(hVar));
            if (i7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(i7, i.f811e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.f816b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f813b, str)) {
                i.a(iVar.f812a, str, iVar.f814c);
                iVar.f813b = str;
            }
        }
    }
}
