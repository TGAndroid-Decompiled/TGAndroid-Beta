package lh;

import java.util.List;

public final class v4 implements Runnable {

    public final int f16938a;

    public final f6 f16939b;

    public v4(f6 f6Var, int i10) {
        this.f16938a = i10;
        this.f16939b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f16938a) {
            case 0:
                zf.w1 w1Var = this.f16939b.Z0;
                if (w1Var != null) {
                    w1Var.invalidate();
                }
                break;
            case 1:
                new ag.g2((org.telegram.ui.ActionBar.n2) new ag.r2(this.f16939b, 7), 14, true).show();
                break;
            case 2:
                this.f16939b.z0(false);
                break;
            default:
                f6 f6Var = this.f16939b;
                boolean z10 = yf.r0.e(f6Var.B1).f50062k;
                int i10 = 0;
                while (true) {
                    List list = yf.l.f49973b;
                    if (i10 < list.size()) {
                        yf.l lVar = (yf.l) list.get(i10);
                        int iM = z10 ? lVar.m() : lVar.e();
                        String strN = lVar.n();
                        d5.i iVar = new d5.i(f6Var, lVar, iM, 13);
                        c6 c6Var = new c6(f6Var, f6Var.getContext());
                        c6Var.setIcon(iM);
                        c6Var.setText(strN);
                        c6Var.setSelected(false);
                        int i11 = 0;
                        c6Var.setOnClickListener(new c5(iVar, i11));
                        c6Var.setOnLongClickListener(new b5(f6Var, i11));
                        f6Var.E1.a(c6Var, h7.z5.n(-1, 48));
                        i10++;
                    }
                    break;
                }
                break;
        }
    }
}
