package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class sk {
    public volatile Object a;
    public final Object b;
    public volatile Object c;

    public sk(xs7 xs7Var) {
        k1f k1fVar = new k1f((byte) 18);
        nf5 nf5Var = new nf5((byte) 28);
        this.c = k1fVar;
        this.b = new ArrayList();
        this.a = nf5Var;
        xs7Var.a(new zg(this));
    }

    public final boolean a() {
        try {
            Context context = (Context) this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            yid.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public sk(Object obj) {
        this.b = obj;
    }
}
