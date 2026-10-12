package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class w extends t61 {
    public static final int f3935a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) u61Var.G;
        xVar.f3936a.setText(language.displayName);
        xVar.f3937b.setText(language.ownDisplayName);
        if (xVar.f3938c != z10) {
            xVar.invalidate();
        }
        xVar.f3938c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new x(context);
    }
}
