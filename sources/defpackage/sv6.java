package defpackage;

import java.util.ArrayList;
public final class sv6 implements Runnable {
    public final byte a;
    public final k44 b;
    public final zu6 c;
    public final ArrayList d;
    public final uv6 e;

    public sv6(uv6 uv6Var, k44 k44Var, zu6 zu6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.e = uv6Var;
        this.b = k44Var;
        this.c = zu6Var;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        zu6 zu6Var = this.c;
        uv6 uv6Var = this.e;
        k44 k44Var = this.b;
        switch (b) {
            case 0:
                k44Var.M(uv6Var, zu6Var, arrayList);
                return;
            default:
                k44Var.M(uv6Var, zu6Var, arrayList);
                return;
        }
    }
}
