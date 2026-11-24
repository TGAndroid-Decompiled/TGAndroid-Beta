package defpackage;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;
public final class kx extends URLSpan {
    public final byte a;
    public final lx b;

    public kx(lx lxVar, String str, byte b) {
        super(str);
        this.a = b;
        this.b = lxVar;
    }

    @Override
    public final void onClick(View view) {
        vu vuVar;
        byte b = this.a;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                o oVar = lxVar.c;
                String url = getURL();
                m66 m66Var = oVar.b;
                bx bxVar = oVar.d;
                HashSet hashSet = o.d1;
                if (m66Var == null) {
                    vuVar = null;
                } else {
                    vuVar = new vu(oVar, bxVar, m66Var);
                }
                oVar.O(url, null, vuVar);
                return;
            default:
                lxVar.c.O(getURL(), null, null);
                return;
        }
    }
}
