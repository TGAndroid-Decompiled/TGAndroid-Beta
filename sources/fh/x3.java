package fh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.oc;
public final class x3 extends gh.k5 {
    public final int f6864n1;
    public final Object f6865o1;

    public x3(y3 y3Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, i9, j10, b6Var, null);
        this.f6864n1 = i10;
        this.f6865o1 = y3Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f6864n1) {
            case 3:
                return ((gh.k5) this.f6865o1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public oc getBulletinFactory() {
        switch (this.f6864n1) {
            case 0:
                return oc.a0(((y3) this.f6865o1).f6880a.f6545a);
            case 1:
                return oc.a0(((y3) this.f6865o1).f6880a.f6545a);
            case 2:
                return oc.a0(((y3) this.f6865o1).f6880a.f6545a);
            default:
                return super.getBulletinFactory();
        }
    }

    public x3(gh.k5 k5Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        super(context, i9, j10, b6Var, view);
        this.f6864n1 = 3;
        this.f6865o1 = k5Var;
    }
}
