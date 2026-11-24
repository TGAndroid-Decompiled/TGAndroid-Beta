package defpackage;

import android.os.Bundle;
import java.util.Map;
public final class zr9 implements ds9 {
    public final op a;
    public boolean b;
    public Bundle c;
    public final zeb d;

    public zr9(op opVar, ufc ufcVar) {
        opVar.getClass();
        this.a = opVar;
        this.d = new zeb(new dd4(ufcVar, (byte) 3));
    }

    public final void a() {
        if (!this.b) {
            Bundle c = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (c != null) {
                bundle.putAll(c);
            }
            this.c = bundle;
            this.b = true;
            as9 as9Var = (as9) this.d.getValue();
        }
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((as9) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle c = ((xr9) entry.getValue()).e.c();
            if (!rr5.a(c, Bundle.EMPTY)) {
                bundle.putBundle(str, c);
            }
        }
        this.b = false;
        return bundle;
    }
}
