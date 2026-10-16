package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class v extends l61 {
    public static final int f4795a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        w wVar = (w) view;
        TranslateController.Language language = (TranslateController.Language) m61Var.G;
        wVar.f4796a.setText(language.displayName);
        wVar.f4797b.setText(language.ownDisplayName);
        if (wVar.f4798c != z10) {
            wVar.invalidate();
        }
        wVar.f4798c = z10;
        wVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new w(context);
    }
}
