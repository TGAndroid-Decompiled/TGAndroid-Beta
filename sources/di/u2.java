package di;

import org.telegram.messenger.AndroidUtilities;
public final class u2 implements Runnable {
    public final int f8255a;
    public final y2 f8256b;
    public final bi.o1 f8257c;

    public u2(y2 y2Var, bi.o1 o1Var, int i10) {
        this.f8255a = i10;
        this.f8256b = y2Var;
        this.f8257c = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f8255a) {
            case 0:
                y2 y2Var = this.f8256b;
                y2Var.getClass();
                AndroidUtilities.runOnUIThread(new u2(y2Var, this.f8257c, 1), 320L);
                return;
            default:
                y2 y2Var2 = this.f8256b;
                y2Var2.getClass();
                this.f8257c.run(new bi.o1(y2Var2, 8));
                return;
        }
    }
}
