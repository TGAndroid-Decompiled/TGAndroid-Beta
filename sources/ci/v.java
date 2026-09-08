package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class v extends g51 {
    public static final int f4871a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        w wVar = (w) view;
        TranslateController.Language language = (TranslateController.Language) h51Var.G;
        wVar.f4872a.setText(language.displayName);
        wVar.f4873b.setText(language.ownDisplayName);
        if (wVar.f4874c != z10) {
            wVar.invalidate();
        }
        wVar.f4874c = z10;
        wVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new w(context);
    }
}
