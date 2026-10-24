package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class s extends k61 {
    public static final int f8071a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) l61Var.G;
        tVar.f8072a.setText(language.displayName);
        tVar.f8073b.setText(language.ownDisplayName);
        if (tVar.f8074c != z10) {
            tVar.invalidate();
        }
        tVar.f8074c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new t(context);
    }
}
