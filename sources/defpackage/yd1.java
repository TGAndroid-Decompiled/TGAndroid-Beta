package defpackage;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yd1 extends EditTextBoldCursor {
    public final byte M1;
    public final zd1 N1;

    public yd1(zd1 zd1Var, Context context, byte b) {
        super(context);
        this.M1 = b;
        this.N1 = zd1Var;
    }

    @Override
    public final wjb getResourcesProvider() {
        byte b = this.M1;
        zd1 zd1Var = this.N1;
        switch (b) {
            case 0:
                return zd1Var.d;
            default:
                return zd1Var.d;
        }
    }
}
