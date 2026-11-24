package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bx1 extends j47 {
    public final byte E0;
    public final Object F0;

    public bx1(Object obj, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
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
                x02 x02Var = (x02) obj;
                e02 e02Var = x02Var.F2;
                x02Var.K2 = j;
                e02Var.setEffect(j);
                return;
        }
    }
}
