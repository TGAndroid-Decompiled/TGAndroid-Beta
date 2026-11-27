package defpackage;

import android.view.View;
import java.io.Serializable;
public final class ua implements fd, ncc {
    public final fb a;

    public ua(fb fbVar) {
        this.a = fbVar;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        vs vsVar;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        boolean H = b8cVar.H(xa.class);
        fb fbVar = this.a;
        if (H) {
            String charSequence = b8cVar.m.toString();
            gt gtVar = fbVar.M;
            if (gtVar != null) {
                gtVar.a(charSequence);
            }
        } else if (b8cVar.H(bb.class) && (vsVar = fbVar.O) != null) {
            try {
                vsVar.a(fb.a((r47) b8cVar.I));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        fb fbVar = this.a;
        fbVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        fbVar.x.g3.O(true);
    }
}
