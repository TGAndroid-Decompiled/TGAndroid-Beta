package m4;

import ai.g3;
public final class b implements Runnable {
    public final int f14485a;
    public final a0 f14486b;
    public final r f14487c;

    public b(a0 a0Var, r rVar, int i10) {
        this.f14485a = i10;
        this.f14486b = a0Var;
        this.f14487c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f14485a) {
            case 0:
                a0 a0Var = this.f14486b;
                if (!a0Var.j()) {
                    if (a0Var.f14479x) {
                        r rVar = this.f14487c;
                        if (!a0.k(rVar)) {
                            if (a0Var.i(rVar)) {
                                a0Var.f14479x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    a0Var.e.getClass();
                    return;
                }
                return;
            case 1:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 7, g1.P0(new ai.i(9)));
                return;
            case 2:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 12, g1.P0(new ai.i(11)));
                return;
            case 3:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 11, g1.P0(new ai.i(8)));
                return;
            case 4:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 3, g1.P0(new ai.i(14)));
                return;
            case 5:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 1, g1.P0(new ai.i(5)));
                return;
            case 6:
                g1 g1Var = this.f14486b.f14464g;
                g1Var.getClass();
                r rVar2 = this.f14487c;
                g1Var.N0(rVar2, Integer.MIN_VALUE, 1, g1.P0(new g3(2, g1Var, rVar2)));
                return;
            case 7:
                g1 g1Var2 = this.f14486b.f14464g;
                g1Var2.getClass();
                r rVar3 = this.f14487c;
                g1Var2.N0(rVar3, Integer.MIN_VALUE, 1, g1.P0(new g3(2, g1Var2, rVar3)));
                return;
            case 8:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 1, g1.P0(new ai.i(5)));
                return;
            default:
                this.f14486b.f14464g.N0(this.f14487c, Integer.MIN_VALUE, 9, g1.P0(new ai.i(12)));
                return;
        }
    }
}
