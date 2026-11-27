package defpackage;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class oa2 extends RadioButton {
    public final pa2 y;

    public oa2(pa2 pa2Var, Context context) {
        super(context);
        this.y = pa2Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
