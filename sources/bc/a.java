package bc;

import a5.n;
import android.os.AsyncTask;
import cc.g;
import ec.c;
import g7.l7;
import java.util.Locale;
import k5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.do0;
import org.telegram.ui.sn0;
import org.telegram.ui.zk0;

public final class a extends AsyncTask {

    public final String f2068a;

    public final dc.a f2069b;

    public final sn0 f2070c;
    public final i d;

    public a(i iVar, String str, dc.a aVar, sn0 sn0Var) {
        this.d = iVar;
        this.f2068a = str;
        this.f2069b = aVar;
        this.f2070c = sn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.d;
        try {
            n nVarC = c.c(l7.a(this.f2069b), new ec.a(this.f2068a, 0));
            Object obj = iVar.f14480b;
            return new b(nVarC, null);
        } catch (g e9) {
            Object obj2 = iVar.f14480b;
            return new b(null, e9);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f14480b;
        n nVar = bVar.f2071a;
        sn0 sn0Var = this.f2070c;
        if (nVar != null) {
            do0 do0Var = sn0Var.f42671a;
            if (do0Var.M0) {
                return;
            }
            do0Var.f37478s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) nVar.f101c, (String) nVar.f100b);
            AndroidUtilities.runOnUIThread(new zk0(sn0Var, 8));
            return;
        }
        Exception exc = bVar.f2072b;
        if (exc != null) {
            sn0Var.a(exc);
        } else {
            sn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
