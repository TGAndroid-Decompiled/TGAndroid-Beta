package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.mc;

public final class s3 extends hh.i5 {

    public final int f7524n1;

    public final Object f7525o1;

    public s3(t3 t3Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, j10, c6Var, null);
        this.f7524n1 = i11;
        this.f7525o1 = t3Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f7524n1) {
            case 3:
                return ((hh.i5) this.f7525o1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public mc getBulletinFactory() {
        switch (this.f7524n1) {
            case 0:
                return mc.a0(((t3) this.f7525o1).f7533a.f7197a);
            case 1:
                return mc.a0(((t3) this.f7525o1).f7533a.f7197a);
            case 2:
                return mc.a0(((t3) this.f7525o1).f7533a.f7197a);
            default:
                return super.getBulletinFactory();
        }
    }

    public s3(hh.i5 i5Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, i10, j10, c6Var, view);
        this.f7524n1 = 3;
        this.f7525o1 = i5Var;
    }
}
