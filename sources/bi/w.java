package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class w extends w51 {
    public static final int f3603a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) x51Var.G;
        xVar.f3604a.setText(language.displayName);
        xVar.f3605b.setText(language.ownDisplayName);
        if (xVar.f3606c != z10) {
            xVar.invalidate();
        }
        xVar.f3606c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        return new x(context);
    }
}
