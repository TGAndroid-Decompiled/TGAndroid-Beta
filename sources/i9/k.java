package i9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class k {
    public final s f7956a;
    public final j f7957b;

    public k(s sVar, n9.b bVar) {
        this.f7956a = sVar;
        this.f7957b = new j(bVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.f7957b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f7954b, str)) {
                return jVar.f7955c;
            }
            n9.b bVar = jVar.f7953a;
            i iVar = j.d;
            File file = new File(bVar.f15873c, str);
            file.mkdirs();
            List e6 = n9.b.e(file.listFiles(iVar));
            if (e6.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e6, j.f7952e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        j jVar = this.f7957b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f7954b, str)) {
                j.a(jVar.f7953a, str, jVar.f7955c);
                jVar.f7954b = str;
            }
        }
    }
}
