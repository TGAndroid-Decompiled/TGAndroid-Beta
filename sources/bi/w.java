package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class w extends g61 {
    public static final int f3887a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) h61Var.G;
        xVar.f3888a.setText(language.displayName);
        xVar.f3889b.setText(language.ownDisplayName);
        if (xVar.f3890c != z10) {
            xVar.invalidate();
        }
        xVar.f3890c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
