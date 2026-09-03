package i9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class k {
    public final s f7374a;
    public final j f7375b;

    public k(s sVar, n9.b bVar) {
        this.f7374a = sVar;
        this.f7375b = new j(bVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.f7375b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f7372b, str)) {
                return jVar.f7373c;
            }
            n9.b bVar = jVar.f7371a;
            i iVar = j.d;
            File file = new File(bVar.f14848c, str);
            file.mkdirs();
            List e = n9.b.e(file.listFiles(iVar));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, j.e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        j jVar = this.f7375b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f7372b, str)) {
                j.a(jVar.f7371a, str, jVar.f7373c);
                jVar.f7372b = str;
            }
        }
    }
}
