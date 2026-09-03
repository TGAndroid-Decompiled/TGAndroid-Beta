package ec;

import android.os.AsyncTask;
import androidx.biometric.e;
import fc.g;
import hc.c;
import j7.p8;
import java.util.Locale;
import o5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ao0;
import org.telegram.ui.gl0;
import org.telegram.ui.lo0;
public final class a extends AsyncTask {
    public final String f5022a;
    public final gc.a f5023b;
    public final ao0 f5024c;
    public final i d;

    public a(i iVar, String str, gc.a aVar, ao0 ao0Var) {
        this.d = iVar;
        this.f5022a = str;
        this.f5023b = aVar;
        this.f5024c = ao0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        i iVar = this.d;
        try {
            e c3 = c.c(p8.a(this.f5023b), new hc.a(this.f5022a));
            Object obj = iVar.f16617b;
            return new b(c3, null);
        } catch (g e6) {
            Object obj2 = iVar.f16617b;
            return new b(null, e6);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16617b;
        e eVar = bVar.f5025a;
        ao0 ao0Var = this.f5024c;
        if (eVar != null) {
            lo0 lo0Var = ao0Var.f35231a;
            if (lo0Var.N0) {
                return;
            }
            lo0Var.f38736t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) eVar.f528c, (String) eVar.f527b);
            AndroidUtilities.runOnUIThread(new gl0(ao0Var, 8));
            return;
        }
        Exception exc = bVar.f5026b;
        if (exc != null) {
            ao0Var.a(exc);
        } else {
            ao0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
