package a9;

import android.content.Context;
import com.google.android.gms.internal.play_billing.u;
import java.util.ArrayList;
import y8.p;
public final class c {
    public final Object f117a;
    public volatile Object f118b;
    public volatile Object f119c;

    public c(Object obj) {
        this.f117a = obj;
    }

    public boolean a() {
        try {
            Context context = (Context) this.f117a;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e10) {
            u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }

    public c(p pVar) {
        v9.d dVar = new v9.d(5);
        d7.u uVar = new d7.u(4);
        this.f119c = dVar;
        this.f117a = new ArrayList();
        this.f118b = uVar;
        pVar.a(new b(this, 0));
    }
}
