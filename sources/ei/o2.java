package ei;

import org.telegram.messenger.AndroidUtilities;
public final class o2 implements Runnable {
    public final int f9559a;
    public final s2 f9560b;
    public final ai.r0 f9561c;

    public o2(s2 s2Var, ai.r0 r0Var, int i10) {
        this.f9559a = i10;
        this.f9560b = s2Var;
        this.f9561c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f9559a) {
            case 0:
                s2 s2Var = this.f9560b;
                s2Var.getClass();
                AndroidUtilities.runOnUIThread(new o2(s2Var, this.f9561c, 1), 320L);
                return;
            default:
                s2 s2Var2 = this.f9560b;
                s2Var2.getClass();
                this.f9561c.run(new ai.r0(s2Var2, 14));
                return;
        }
    }
}
