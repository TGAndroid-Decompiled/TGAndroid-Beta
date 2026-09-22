package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class w extends h51 {
    public static final int f3600a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) i51Var.G;
        xVar.f3601a.setText(language.displayName);
        xVar.f3602b.setText(language.ownDisplayName);
        if (xVar.f3603c != z10) {
            xVar.invalidate();
        }
        xVar.f3603c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new x(context);
    }
}
