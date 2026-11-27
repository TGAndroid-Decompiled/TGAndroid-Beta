package defpackage;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class he1 extends EditTextBoldCursor {
    public final byte N1;
    public final ie1 O1;

    public he1(ie1 ie1Var, Context context, byte b) {
        super(context);
        this.N1 = b;
        this.O1 = ie1Var;
    }

    @Override
    public final vnb getResourcesProvider() {
        byte b = this.N1;
        ie1 ie1Var = this.O1;
        switch (b) {
            case 0:
                return ie1Var.d;
            default:
                return ie1Var.d;
        }
    }
}
