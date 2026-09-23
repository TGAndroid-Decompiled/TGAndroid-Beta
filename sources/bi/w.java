package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class w extends g51 {
    public static final int f3595a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) h51Var.G;
        xVar.f3596a.setText(language.displayName);
        xVar.f3597b.setText(language.ownDisplayName);
        if (xVar.f3598c != z10) {
            xVar.invalidate();
        }
        xVar.f3598c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
