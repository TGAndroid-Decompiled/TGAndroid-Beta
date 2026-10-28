package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class s extends t61 {
    public static final int f10010a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) u61Var.G;
        tVar.f10011a.setText(language.displayName);
        tVar.f10012b.setText(language.ownDisplayName);
        if (tVar.f10013c != z10) {
            tVar.invalidate();
        }
        tVar.f10013c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new t(context);
    }
}
