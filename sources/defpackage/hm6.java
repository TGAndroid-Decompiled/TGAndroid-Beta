package defpackage;

import java.util.ArrayList;
public final class hm6 implements Runnable {
    public final byte a;
    public final jm6 b;

    public hm6(jm6 jm6Var, byte b) {
        this.a = b;
        this.b = jm6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jm6 jm6Var = this.b;
        switch (b) {
            case 0:
                jm6Var.d();
                gl.d3(new hm6(jm6Var, (byte) 1));
                return;
            default:
                jm6Var.X = false;
                ArrayList arrayList = jm6Var.Y;
                jm6Var.Y = null;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Runnable) arrayList.get(i)).run();
                    }
                    return;
                }
                return;
        }
    }
}
