package f9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

public final class k {

    public final t f5943a;

    public final j f5944b;

    public k(t tVar, k9.c cVar) {
        this.f5943a = tVar;
        this.f5944b = new j(cVar);
    }

    public final String a(String str) {
        String strSubstring;
        j jVar = this.f5944b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f5941b, str)) {
                return jVar.f5942c;
            }
            k9.c cVar = jVar.f5940a;
            i iVar = j.d;
            File file = new File(cVar.f15100c, str);
            file.mkdirs();
            List listE = k9.c.e(file.listFiles(iVar));
            if (listE.isEmpty()) {
                strSubstring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                strSubstring = ((File) Collections.min(listE, j.f5939e)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    public final void b(String str) {
        j jVar = this.f5944b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f5941b, str)) {
                j.a(jVar.f5940a, str, jVar.f5942c);
                jVar.f5941b = str;
            }
        }
    }
}
