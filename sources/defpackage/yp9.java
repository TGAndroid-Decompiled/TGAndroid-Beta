package defpackage;

import android.os.Bundle;
import java.util.Map;
public final class yp9 implements cq9 {
    public final oo a;
    public boolean b;
    public Bundle c;
    public final ycb d;

    public yp9(oo ooVar, tdc tdcVar) {
        ooVar.getClass();
        this.a = ooVar;
        this.d = new ycb(new db4(tdcVar, (byte) 3));
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
            zp9 zp9Var = (zp9) this.d.getValue();
        }
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((zp9) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle c = ((wp9) entry.getValue()).e.c();
            if (!rp5.a(c, Bundle.EMPTY)) {
                bundle.putBundle(str, c);
            }
        }
        this.b = false;
        return bundle;
    }
}
