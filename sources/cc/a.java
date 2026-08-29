package cc;

import android.os.AsyncTask;
import androidx.biometric.e;
import dc.g;
import fc.c;
import h7.y7;
import java.util.Locale;
import m5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bo0;
import org.telegram.ui.qn0;
import org.telegram.ui.vk0;
public final class a extends AsyncTask {
    public final String f3029a;
    public final ec.a f3030b;
    public final qn0 f3031c;
    public final i d;

    public a(i iVar, String str, ec.a aVar, qn0 qn0Var) {
        this.d = iVar;
        this.f3029a = str;
        this.f3030b = aVar;
        this.f3031c = qn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        i iVar = this.d;
        try {
            e c3 = c.c(y7.a(this.f3030b), new fc.a(this.f3029a, 0));
            Object obj = iVar.f16880b;
            return new b(c3, null);
        } catch (g e10) {
            Object obj2 = iVar.f16880b;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16880b;
        e eVar = bVar.f3032a;
        qn0 qn0Var = this.f3031c;
        if (eVar != null) {
            bo0 bo0Var = qn0Var.f41755a;
            if (bo0Var.M0) {
                return;
            }
            bo0Var.f36865s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) eVar.f1031c, (String) eVar.f1030b);
            AndroidUtilities.runOnUIThread(new vk0(qn0Var, 8));
            return;
        }
        Exception exc = bVar.f3033b;
        if (exc != null) {
            qn0Var.a(exc);
        } else {
            qn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
