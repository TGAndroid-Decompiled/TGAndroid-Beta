package defpackage;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gf1 extends EditTextBoldCursor {
    public final byte M1;
    public final hf1 N1;

    public gf1(hf1 hf1Var, Context context, byte b) {
        super(context);
        this.M1 = b;
        this.N1 = hf1Var;
    }

    @Override
    public final ylb getResourcesProvider() {
        byte b = this.M1;
        hf1 hf1Var = this.N1;
        switch (b) {
            case 0:
                return hf1Var.d;
            default:
                return hf1Var.d;
        }
    }
}
