package defpackage;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class jb2 extends RadioButton {
    public final kb2 y;

    public jb2(kb2 kb2Var, Context context) {
        super(context);
        this.y = kb2Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
