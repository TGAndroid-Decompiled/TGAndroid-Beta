package defpackage;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;
public final class kw extends URLSpan {
    public final byte a;
    public final lw b;

    public kw(lw lwVar, String str, byte b) {
        super(str);
        this.a = b;
        this.b = lwVar;
    }

    @Override
    public final void onClick(View view) {
        vt vtVar;
        byte b = this.a;
        lw lwVar = this.b;
        switch (b) {
            case 0:
                o oVar = lwVar.c;
                String url = getURL();
                m46 m46Var = oVar.b;
                bw bwVar = oVar.d;
                HashSet hashSet = o.d1;
                if (m46Var == null) {
                    vtVar = null;
                } else {
                    vtVar = new vt(oVar, bwVar, m46Var);
                }
                oVar.O(url, null, vtVar);
                return;
            default:
                lwVar.c.O(getURL(), null, null);
                return;
        }
    }
}
