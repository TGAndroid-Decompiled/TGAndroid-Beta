package defpackage;

import android.view.View;
import java.io.Serializable;
public final class ta implements ee, oac {
    public final eb a;

    public ta(eb ebVar) {
        this.a = ebVar;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        xt xtVar;
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        boolean H = c6cVar.H(wa.class);
        eb ebVar = this.a;
        if (H) {
            String charSequence = c6cVar.m.toString();
            iu iuVar = ebVar.M;
            if (iuVar != null) {
                iuVar.a(charSequence);
            }
        } else if (c6cVar.H(ab.class) && (xtVar = ebVar.O) != null) {
            try {
                xtVar.a(eb.a((k47) c6cVar.I));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        eb ebVar = this.a;
        ebVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        ebVar.x.g3.O(true);
    }
}
