package defpackage;

import java.util.ArrayList;
public final class fa4 implements Runnable {
    public final byte a;
    public final yg b;

    public fa4(yg ygVar, byte b) {
        this.a = b;
        this.b = ygVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yg ygVar = this.b;
        switch (b) {
            case 0:
                ((na4) ygVar.c).a(ygVar.b, -4, (ArrayList) ygVar.d);
                return;
            case 1:
                ((na4) ygVar.c).a(ygVar.b, -3, (ArrayList) ygVar.d);
                return;
            default:
                ((na4) ygVar.c).a(ygVar.b, -4, (ArrayList) ygVar.d);
                return;
        }
    }
}
