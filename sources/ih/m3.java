package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tc;
public final class m3 extends jh.h5 {
    public final int f9283n1;
    public final Object f9284o1;

    public m3(n3 n3Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, j10, c6Var, null);
        this.f9283n1 = i11;
        this.f9284o1 = n3Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f9283n1) {
            case 3:
                return ((jh.h5) this.f9284o1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public tc getBulletinFactory() {
        switch (this.f9283n1) {
            case 0:
                return tc.a0(((n3) this.f9284o1).f9293a.f9501a);
            case 1:
                return tc.a0(((n3) this.f9284o1).f9293a.f9501a);
            case 2:
                return tc.a0(((n3) this.f9284o1).f9293a.f9501a);
            default:
                return super.getBulletinFactory();
        }
    }

    public m3(jh.h5 h5Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, i10, j10, c6Var, view);
        this.f9283n1 = 3;
        this.f9284o1 = h5Var;
    }
}
