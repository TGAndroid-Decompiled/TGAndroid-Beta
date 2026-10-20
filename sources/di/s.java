package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class s extends g61 {
    public static final int f8064a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) h61Var.G;
        tVar.f8065a.setText(language.displayName);
        tVar.f8066b.setText(language.ownDisplayName);
        if (tVar.f8067c != z10) {
            tVar.invalidate();
        }
        tVar.f8067c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new t(context);
    }
}
