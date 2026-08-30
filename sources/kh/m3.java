package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.qc;
public final class m3 extends lh.g5 {
    public final int f10710o1;
    public final Object f10711p1;

    public m3(n3 n3Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, j10, f6Var, null);
        this.f10710o1 = i11;
        this.f10711p1 = n3Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f10710o1) {
            case 3:
                return ((lh.g5) this.f10711p1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public qc getBulletinFactory() {
        switch (this.f10710o1) {
            case 0:
                return qc.a0(((n3) this.f10711p1).f10719a.f10939a);
            case 1:
                return qc.a0(((n3) this.f10711p1).f10719a.f10939a);
            case 2:
                return qc.a0(((n3) this.f10711p1).f10719a.f10939a);
            default:
                return super.getBulletinFactory();
        }
    }

    public m3(lh.g5 g5Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, i10, j10, f6Var, view);
        this.f10710o1 = 3;
        this.f10711p1 = g5Var;
    }
}
