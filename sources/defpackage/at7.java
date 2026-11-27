package defpackage;

import org.telegram.messenger.voip.OpusDred;
public final class at7 implements Runnable {
    public final byte a = 1;
    public final jn7 b;
    public final fn7[] c;

    public at7(jn7 jn7Var, fn7[] fn7VarArr) {
        this.b = jn7Var;
        this.c = fn7VarArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fn7[] fn7VarArr = this.c;
        jn7 jn7Var = this.b;
        switch (b) {
            case 0:
                fn7 fn7Var = fn7VarArr[0];
                if (fn7Var != null) {
                    jn7Var.n(fn7Var, 1);
                    fn7VarArr[0] = null;
                    return;
                }
                return;
            default:
                OpusDred.lambda$loadDocument$12(jn7Var, fn7VarArr);
                return;
        }
    }

    public at7(fn7[] fn7VarArr, jn7 jn7Var) {
        this.c = fn7VarArr;
        this.b = jn7Var;
    }
}
