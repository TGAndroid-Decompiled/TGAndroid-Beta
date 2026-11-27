package defpackage;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;
public final class lw extends URLSpan {
    public final byte a;
    public final mw b;

    public lw(mw mwVar, String str, byte b) {
        super(str);
        this.a = b;
        this.b = mwVar;
    }

    @Override
    public final void onClick(View view) {
        wt wtVar;
        byte b = this.a;
        mw mwVar = this.b;
        switch (b) {
            case 0:
                o oVar = mwVar.c;
                String url = getURL();
                q66 q66Var = oVar.b;
                cw cwVar = oVar.d;
                HashSet hashSet = o.d1;
                if (q66Var == null) {
                    wtVar = null;
                } else {
                    wtVar = new wt(oVar, cwVar, q66Var);
                }
                oVar.O(url, null, wtVar);
                return;
            default:
                mwVar.c.O(getURL(), null, null);
                return;
        }
    }
}
