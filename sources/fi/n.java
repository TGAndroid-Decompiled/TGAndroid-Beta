package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.q00;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class n extends q31 {
    public static final int f11627b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        o oVar = (o) view;
        q00 q00Var = (q00) r31Var.G;
        oVar.f11628a.setText(q00Var.f24845b);
        oVar.f11629b.setText(q00Var.f24846c);
        if (oVar.f11630c != z10) {
            oVar.invalidate();
        }
        oVar.f11630c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new o(context);
    }
}
