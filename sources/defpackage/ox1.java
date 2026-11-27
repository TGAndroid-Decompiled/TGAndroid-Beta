package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ox1 extends q67 {
    public final byte E0;
    public final Object F0;

    public ox1(Object obj, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.E0 = b;
        this.F0 = obj;
    }

    @Override
    public final void m(long j) {
        byte b = this.E0;
        Object obj = this.F0;
        switch (b) {
            case 0:
                ((ChatActivityEnterView) obj).setEffectId(j);
                return;
            default:
                n12 n12Var = (n12) obj;
                u02 u02Var = n12Var.F2;
                n12Var.K2 = j;
                u02Var.setEffect(j);
                return;
        }
    }
}
