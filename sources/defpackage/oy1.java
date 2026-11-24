package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oy1 extends j67 {
    public final byte E0;
    public final Object F0;

    public oy1(Object obj, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
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
                i22 i22Var = (i22) obj;
                p12 p12Var = i22Var.F2;
                i22Var.K2 = j;
                p12Var.setEffect(j);
                return;
        }
    }
}
