package mc;

import a4.l;
import android.os.AsyncTask;
import java.util.Locale;
import li.k;
import nc.g;
import org.telegram.messenger.i0;
import org.telegram.ui.e;
import org.telegram.ui.kg0;
import org.telegram.ui.qm0;
import w7.l7;
public final class a extends AsyncTask {
    public final String f13049a;
    public final oc.a f13050b;
    public final e f13051c;
    public final l d;

    public a(l lVar, String str, oc.a aVar, e eVar) {
        this.d = lVar;
        this.f13049a = str;
        this.f13050b = aVar;
        this.f13051c = eVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        l lVar = this.d;
        try {
            k c10 = pc.b.c(l7.a(this.f13050b), new f2.a(this.f13049a));
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
        k kVar = bVar.f13052a;
        e eVar = this.f13051c;
        if (kVar != null) {
            qm0 qm0Var = (qm0) eVar.f36703b;
            if (qm0Var.Q0) {
                return;
            }
            qm0Var.f40847w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.f12102c, (String) kVar.f12101b);
            i0.g3(new kg0(eVar, 11));
            return;
        }
        Exception exc = bVar.f13053b;
        if (exc != null) {
            eVar.d2(exc);
        } else {
            eVar.d2(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
