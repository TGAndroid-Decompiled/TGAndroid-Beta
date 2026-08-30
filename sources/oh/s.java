package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class s extends h51 {
    public static final int f16611a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) i51Var.G;
        tVar.f16612a.setText(language.displayName);
        tVar.f16613b.setText(language.ownDisplayName);
        if (tVar.f16614c != z4) {
            tVar.invalidate();
        }
        tVar.f16614c = z4;
        tVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new t(context);
    }
}
