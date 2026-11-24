package defpackage;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class y92 extends RadioButton {
    public final z92 y;

    public y92(z92 z92Var, Context context) {
        super(context);
        this.y = z92Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
