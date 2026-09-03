package ec;

import af.d;
import android.os.AsyncTask;
import com.google.android.gms.internal.clearcut.e;
import fc.g;
import j7.p8;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ao0;
import org.telegram.ui.gl0;
import org.telegram.ui.lo0;
public final class a extends AsyncTask {
    public final String f5186a;
    public final gc.a f5187b;
    public final ao0 f5188c;
    public final bb.b d;

    public a(bb.b bVar, String str, gc.a aVar, ao0 ao0Var) {
        this.d = bVar;
        this.f5186a = str;
        this.f5187b = aVar;
        this.f5188c = ao0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        bb.b bVar = this.d;
        try {
            d c3 = hc.b.c(p8.a(this.f5187b), new e(this.f5186a));
            Object obj = bVar.f1772b;
            return new b(c3, null);
        } catch (g e) {
            Object obj2 = bVar.f1772b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f1772b;
        d dVar = bVar.f5189a;
        ao0 ao0Var = this.f5188c;
        if (dVar != null) {
            lo0 lo0Var = ao0Var.f32618a;
            if (lo0Var.N0) {
                return;
            }
            lo0Var.f35843t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.f160c, (String) dVar.f159b);
            AndroidUtilities.runOnUIThread(new gl0(ao0Var, 8));
            return;
        }
        Exception exc = bVar.f5190b;
        if (exc != null) {
            ao0Var.a(exc);
        } else {
            ao0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
