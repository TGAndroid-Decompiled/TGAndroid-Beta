package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
public final class xwc extends efc {
    public final byte a;
    public final zwc b;

    public xwc(zwc zwcVar, byte b) {
        this.a = b;
        this.b = zwcVar;
    }

    @Override
    public final void c() {
        View view;
        byte b = this.a;
        zwc zwcVar = this.b;
        switch (b) {
            case 0:
                if (zwcVar.o && (view = zwcVar.g) != null) {
                    view.setTranslationY(0.0f);
                    zwcVar.d.setTranslationY(0.0f);
                }
                zwcVar.d.setVisibility(8);
                zwcVar.d.setTransitioning(false);
                zwcVar.s = null;
                tg2 tg2Var = zwcVar.k;
                if (tg2Var != null) {
                    tg2Var.S(zwcVar.j);
                    zwcVar.j = null;
                    zwcVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = zwcVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                zwcVar.s = null;
                zwcVar.d.requestLayout();
                return;
        }
    }
}
