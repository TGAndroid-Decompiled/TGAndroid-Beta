package mc;

import a4.l;
import android.os.AsyncTask;
import java.util.Locale;
import li.k;
import nc.g;
import org.telegram.messenger.i0;
import org.telegram.ui.e;
import org.telegram.ui.mg0;
import org.telegram.ui.sm0;
import w7.l7;
public final class a extends AsyncTask {
    public final String f13048a;
    public final oc.a f13049b;
    public final e f13050c;
    public final l d;

    public a(l lVar, String str, oc.a aVar, e eVar) {
        this.d = lVar;
        this.f13048a = str;
        this.f13049b = aVar;
        this.f13050c = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        l lVar = this.d;
        try {
            k c10 = pc.b.c(l7.a(this.f13049b), new f2.a(this.f13048a));
            Object obj = lVar.f279b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = lVar.f279b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f279b;
        k kVar = bVar.f13051a;
        e eVar = this.f13050c;
        if (kVar != null) {
            sm0 sm0Var = (sm0) eVar.f36877b;
            if (sm0Var.Q0) {
                return;
            }
            sm0Var.f41581w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.f12101c, (String) kVar.f12100b);
            i0.g3(new mg0(eVar, 11));
            return;
        }
        Exception exc = bVar.f13052b;
        if (exc != null) {
            eVar.d2(exc);
        } else {
            eVar.d2(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
