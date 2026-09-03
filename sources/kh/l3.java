package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;
public final class l3 extends lh.g5 {
    public final int f10806o1;
    public final Object f10807p1;

    public l3(m3 m3Var, Context context, int i10, long j10, f6 f6Var, int i11) {
        super(context, i10, j10, f6Var, null);
        this.f10806o1 = i11;
        this.f10807p1 = m3Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f10806o1) {
            case 3:
                return ((lh.g5) this.f10807p1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public qc getBulletinFactory() {
        switch (this.f10806o1) {
            case 0:
                return qc.a0(((m3) this.f10807p1).f10817a.f11015a);
            case 1:
                return qc.a0(((m3) this.f10807p1).f10817a.f11015a);
            case 2:
                return qc.a0(((m3) this.f10807p1).f10817a.f11015a);
            default:
                return super.getBulletinFactory();
        }
    }

    public l3(lh.g5 g5Var, Context context, int i10, long j10, f6 f6Var, View view) {
        super(context, i10, j10, f6Var, view);
        this.f10806o1 = 3;
        this.f10807p1 = g5Var;
    }
}
