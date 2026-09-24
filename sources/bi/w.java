package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class w extends u51 {
    public static final int f3595a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) v51Var.G;
        xVar.f3596a.setText(language.displayName);
        xVar.f3597b.setText(language.ownDisplayName);
        if (xVar.f3598c != z10) {
            xVar.invalidate();
        }
        xVar.f3598c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
