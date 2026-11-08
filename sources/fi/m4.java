package fi;

import java.util.List;
public final class m4 implements Runnable {
    public final int f12451a;
    public final o5 f12452b;

    public m4(o5 o5Var, int i7) {
        this.f12451a = i7;
        this.f12452b = o5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f12451a) {
            case 0:
                tg.m1 m1Var = this.f12452b.M0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4(this.f12452b, 4), 14, true).show();
                return;
            case 2:
                this.f12452b.w0(false);
                return;
            default:
                o5 o5Var = this.f12452b;
                boolean z9 = sg.l0.e(o5Var.f12538o1).f55134k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f55051c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z9) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        ai.e0 e0Var = new ai.e0(o5Var, gVar, e10, 11);
                        l5 l5Var = new l5(o5Var, o5Var.getContext());
                        l5Var.setIcon(e10);
                        l5Var.setText(n10);
                        l5Var.setSelected(false);
                        l5Var.setOnClickListener(new ah.d(e0Var, 23));
                        l5Var.setOnLongClickListener(new s4(o5Var, 0));
                        o5Var.f12544r1.a(l5Var, c8.ha.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
