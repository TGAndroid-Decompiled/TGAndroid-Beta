package ec;

import a3.c;
import android.os.AsyncTask;
import androidx.biometric.e;
import fc.g;
import j7.o8;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.el0;
import org.telegram.ui.jo0;
import org.telegram.ui.yn0;
public final class a extends AsyncTask {
    public final String f5180a;
    public final gc.a f5181b;
    public final yn0 f5182c;
    public final c d;

    public a(c cVar, String str, gc.a aVar, yn0 yn0Var) {
        this.d = cVar;
        this.f5180a = str;
        this.f5181b = aVar;
        this.f5182c = yn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c cVar = this.d;
        try {
            e c3 = hc.b.c(o8.a(this.f5181b), new com.google.android.gms.internal.clearcut.e(this.f5180a));
            Object obj = cVar.f46b;
            return new b(c3, null);
        } catch (g e) {
            Object obj2 = cVar.f46b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f46b;
        e eVar = bVar.f5183a;
        yn0 yn0Var = this.f5182c;
        if (eVar != null) {
            jo0 jo0Var = yn0Var.f40546a;
            if (jo0Var.N0) {
                return;
            }
            jo0Var.f35416t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) eVar.f479c, (String) eVar.f478b);
            AndroidUtilities.runOnUIThread(new el0(yn0Var, 8));
            return;
        }
        Exception exc = bVar.f5184b;
        if (exc != null) {
            yn0Var.a(exc);
        } else {
            yn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
