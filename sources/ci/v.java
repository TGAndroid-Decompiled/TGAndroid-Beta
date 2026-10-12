package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class v extends k61 {
    public static final int f4792a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        w wVar = (w) view;
        TranslateController.Language language = (TranslateController.Language) l61Var.G;
        wVar.f4793a.setText(language.displayName);
        wVar.f4794b.setText(language.ownDisplayName);
        if (wVar.f4795c != z10) {
            wVar.invalidate();
        }
        wVar.f4795c = z10;
        wVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new w(context);
    }
}
