package ac;

import a5.m;
import android.os.AsyncTask;
import bc.g;
import com.google.android.gms.internal.clearcut.e;
import f7.k7;
import java.util.Locale;
import k5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.co0;
import org.telegram.ui.rn0;
import org.telegram.ui.zk0;
public final class a extends AsyncTask {
    public final String f140a;
    public final cc.a f141b;
    public final rn0 f142c;
    public final i d;

    public a(i iVar, String str, cc.a aVar, rn0 rn0Var) {
        this.d = iVar;
        this.f140a = str;
        this.f141b = aVar;
        this.f142c = rn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        i iVar = this.d;
        try {
            m c10 = dc.b.c(k7.a(this.f141b), new e(this.f140a));
            Object obj = iVar.f14659b;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = iVar.f14659b;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f14659b;
        m mVar = bVar.f143a;
        rn0 rn0Var = this.f142c;
        if (mVar != null) {
            co0 co0Var = rn0Var.f42467a;
            if (co0Var.M0) {
                return;
            }
            co0Var.f37272s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) mVar.f99c, (String) mVar.f98b);
            AndroidUtilities.runOnUIThread(new zk0(rn0Var, 8));
            return;
        }
        Exception exc = bVar.f144b;
        if (exc != null) {
            rn0Var.a(exc);
        } else {
            rn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
