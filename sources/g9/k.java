package g9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class k {
    public final u f7165a;
    public final j f7166b;

    public k(u uVar, l9.b bVar) {
        this.f7165a = uVar;
        this.f7166b = new j(bVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.f7166b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f7163b, str)) {
                return jVar.f7164c;
            }
            l9.b bVar = jVar.f7162a;
            i iVar = j.d;
            File file = new File(bVar.f15104c, str);
            file.mkdirs();
            List e10 = l9.b.e(file.listFiles(iVar));
            if (e10.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e10, j.f7161e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        j jVar = this.f7166b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f7163b, str)) {
                j.a(jVar.f7162a, str, jVar.f7164c);
                jVar.f7163b = str;
            }
        }
    }
}
