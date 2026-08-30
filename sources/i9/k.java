package i9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class k {
    public final s f7392a;
    public final j f7393b;

    public k(s sVar, n9.b bVar) {
        this.f7392a = sVar;
        this.f7393b = new j(bVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.f7393b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f7390b, str)) {
                return jVar.f7391c;
            }
            n9.b bVar = jVar.f7389a;
            i iVar = j.d;
            File file = new File(bVar.f14863c, str);
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
        j jVar = this.f7393b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f7390b, str)) {
                j.a(jVar.f7389a, str, jVar.f7391c);
                jVar.f7390b = str;
            }
        }
    }
}
