package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class w extends x51 {
    public static final int f3602a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) y51Var.G;
        xVar.f3603a.setText(language.displayName);
        xVar.f3604b.setText(language.ownDisplayName);
        if (xVar.f3605c != z10) {
            xVar.invalidate();
        }
        xVar.f3605c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new x(context);
    }
}
