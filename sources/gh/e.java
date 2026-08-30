package gh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class e extends h51 {
    public static final int f6837a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        kg.c cVar = (kg.c) view;
        cVar.f10413s = (TLRPC.TL_help_country) i51Var.G;
        cVar.f();
        cVar.setDivider(z4);
        cVar.c(i51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.H(i51Var2);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        kg.c cVar = new kg.c(context, f6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.I(i51Var2);
    }
}
