package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class r extends k41 {
    public static final int f14374a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        s sVar = (s) view;
        TranslateController.Language language = (TranslateController.Language) l41Var.G;
        sVar.f14375a.setText(language.displayName);
        sVar.f14376b.setText(language.ownDisplayName);
        if (sVar.f14377c != z10) {
            sVar.invalidate();
        }
        sVar.f14377c = z10;
        sVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new s(context);
    }
}
