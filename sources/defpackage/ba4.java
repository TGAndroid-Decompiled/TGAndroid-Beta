package defpackage;

import java.util.ArrayList;
public final class ba4 implements Runnable {
    public final byte a;
    public final bf b;

    public ba4(bf bfVar, byte b) {
        this.a = b;
        this.b = bfVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bf bfVar = this.b;
        switch (b) {
            case 0:
                ((ja4) bfVar.c).a(bfVar.b, -4, (ArrayList) bfVar.d);
                return;
            case 1:
                ((ja4) bfVar.c).a(bfVar.b, -3, (ArrayList) bfVar.d);
                return;
            default:
                ((ja4) bfVar.c).a(bfVar.b, -4, (ArrayList) bfVar.d);
                return;
        }
    }
}
