package e9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class k {
    public final t f5011a;
    public final j f5012b;

    public k(t tVar, j9.c cVar) {
        this.f5011a = tVar;
        this.f5012b = new j(cVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.f5012b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f5009b, str)) {
                return jVar.f5010c;
            }
            j9.c cVar = jVar.f5008a;
            i iVar = j.d;
            File file = new File(cVar.f14246c, str);
            file.mkdirs();
            List e10 = j9.c.e(file.listFiles(iVar));
            if (e10.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e10, j.f5007e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        j jVar = this.f5012b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f5009b, str)) {
                j.a(jVar.f5008a, str, jVar.f5010c);
                jVar.f5009b = str;
            }
        }
    }
}
