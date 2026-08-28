package kh;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f15785a;
    public final s2 f15786b;
    public final i9 f15787c;

    public o2(s2 s2Var, i9 i9Var, int i9) {
        this.f15785a = i9;
        this.f15786b = s2Var;
        this.f15787c = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f15785a) {
            case 0:
                s2 s2Var = this.f15786b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.f15787c, 1), 320L);
                return;
            default:
                s2 s2Var2 = this.f15786b;
                s2Var2.getClass();
                this.f15787c.run(new bg.i(s2Var2, 25));
                return;
        }
    }
}
