package defpackage;

import java.util.ArrayList;
public final class qs2 extends xyc {
    public final byte b;

    public qs2(String str, ryc rycVar, int i, byte b) {
        super(str, rycVar, i);
        this.b = b;
    }

    @Override
    public final void a() {
        byte b = this.b;
        ryc rycVar = this.a;
        switch (b) {
            case 0:
                try {
                    rycVar.b();
                    return;
                } catch (syc e) {
                    vh4 vh4Var = rycVar.d;
                    vh4Var.d(e);
                    ArrayList arrayList = (ArrayList) vh4Var.s();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        s35 s35Var = (s35) obj;
                        try {
                            try {
                                hl.c3(new gp6(s35Var.c, (ryc) vh4Var.b, s35Var.a, "connect error: ".concat(t35.b(e)), (byte) 25));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            s35Var.getClass();
                        }
                    }
                    return;
                }
            default:
                rycVar.d();
                return;
        }
    }
}
