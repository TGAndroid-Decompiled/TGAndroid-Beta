package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
public final class m3 extends mh.g5 {
    public final int f12854o1;
    public final Object f12855p1;

    public m3(n3 n3Var, Context context, int i10, long j10, g6 g6Var, int i11) {
        super(context, i10, j10, g6Var, null);
        this.f12854o1 = i11;
        this.f12855p1 = n3Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f12854o1) {
            case 3:
                return ((mh.g5) this.f12855p1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public qc getBulletinFactory() {
        switch (this.f12854o1) {
            case 0:
                return qc.a0(((n3) this.f12855p1).f12862a.f13100a);
            case 1:
                return qc.a0(((n3) this.f12855p1).f12862a.f13100a);
            case 2:
                return qc.a0(((n3) this.f12855p1).f12862a.f13100a);
            default:
                return super.getBulletinFactory();
        }
    }

    public m3(mh.g5 g5Var, Context context, int i10, long j10, g6 g6Var, View view) {
        super(context, i10, j10, g6Var, view);
        this.f12854o1 = 3;
        this.f12855p1 = g5Var;
    }
}
