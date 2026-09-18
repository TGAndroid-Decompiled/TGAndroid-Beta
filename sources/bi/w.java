package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class w extends i51 {
    public static final int f3603a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) j51Var.G;
        xVar.f3604a.setText(language.displayName);
        xVar.f3605b.setText(language.ownDisplayName);
        if (xVar.f3606c != z10) {
            xVar.invalidate();
        }
        xVar.f3606c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new x(context);
    }
}
