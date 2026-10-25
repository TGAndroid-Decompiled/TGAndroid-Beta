package fi;

import org.telegram.messenger.AndroidUtilities;
public final class m2 implements Runnable {
    public final int f11243a;
    public final q2 f11244b;
    public final ai.i f11245c;

    public m2(q2 q2Var, ai.i iVar, int i10) {
        this.f11243a = i10;
        this.f11244b = q2Var;
        this.f11245c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f11243a) {
            case 0:
                q2 q2Var = this.f11244b;
                q2Var.getClass();
                AndroidUtilities.runOnUIThread(new m2(q2Var, this.f11245c, 1), 320L);
                return;
            default:
                q2 q2Var2 = this.f11244b;
                q2Var2.getClass();
                this.f11245c.run(new ai.i(q2Var2, 18));
                return;
        }
    }
}
