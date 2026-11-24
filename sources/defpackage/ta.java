package defpackage;

import android.view.View;
import java.io.Serializable;
public final class ta implements ed, n8c {
    public final eb a;

    public ta(eb ebVar) {
        this.a = ebVar;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        ws wsVar;
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        boolean H = c4cVar.H(wa.class);
        eb ebVar = this.a;
        if (H) {
            String charSequence = c4cVar.m.toString();
            ht htVar = ebVar.M;
            if (htVar != null) {
                htVar.a(charSequence);
            }
        } else if (c4cVar.H(ab.class) && (wsVar = ebVar.O) != null) {
            try {
                wsVar.a(eb.a((k27) c4cVar.I));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        eb ebVar = this.a;
        ebVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        ebVar.x.g3.O(true);
    }
}
