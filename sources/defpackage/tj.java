package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class tj {
    public volatile Object a;
    public final Object b;
    public volatile Object c;

    public tj(au7 au7Var) {
        z3f z3fVar = new z3f((byte) 18);
        qf5 qf5Var = new qf5((byte) 28);
        this.c = z3fVar;
        this.b = new ArrayList();
        this.a = qf5Var;
        au7Var.a(new bg(this));
    }

    public final boolean a() {
        try {
            Context context = (Context) this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            old.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public tj(Object obj) {
        this.b = obj;
    }
}
