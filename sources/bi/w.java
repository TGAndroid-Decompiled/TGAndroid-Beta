package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class w extends o61 {
    public static final int f3936a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) p61Var.G;
        xVar.f3937a.setText(language.displayName);
        xVar.f3938b.setText(language.ownDisplayName);
        if (xVar.f3939c != z10) {
            xVar.invalidate();
        }
        xVar.f3939c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new x(context);
    }
}
