package di;

import org.telegram.messenger.AndroidUtilities;
public final class s2 implements Runnable {
    public final int f7746a;
    public final w2 f7747b;
    public final bi.o1 f7748c;

    public s2(w2 w2Var, bi.o1 o1Var, int i10) {
        this.f7746a = i10;
        this.f7747b = w2Var;
        this.f7748c = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f7746a) {
            case 0:
                w2 w2Var = this.f7747b;
                w2Var.getClass();
                AndroidUtilities.runOnUIThread(new s2(w2Var, this.f7748c, 1), 320L);
                return;
            default:
                w2 w2Var2 = this.f7747b;
                w2Var2.getClass();
                this.f7748c.run(new bi.o1(w2Var2, 8));
                return;
        }
    }
}
