package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class w extends q61 {
    public static final int f3936a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) r61Var.G;
        xVar.f3937a.setText(language.displayName);
        xVar.f3938b.setText(language.ownDisplayName);
        if (xVar.f3939c != z10) {
            xVar.invalidate();
        }
        xVar.f3939c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
