package defpackage;

import java.util.ArrayList;
public final class it2 extends iwc {
    public final byte b;

    public it2(String str, cwc cwcVar, int i, byte b) {
        super(str, cwcVar, i);
        this.b = b;
    }

    @Override
    public final void a() {
        byte b = this.b;
        cwc cwcVar = this.a;
        switch (b) {
            case 0:
                try {
                    cwcVar.b();
                    return;
                } catch (dwc e) {
                    yh4 yh4Var = cwcVar.d;
                    yh4Var.f(e);
                    ArrayList arrayList = (ArrayList) yh4Var.u();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        o35 o35Var = (o35) obj;
                        try {
                            try {
                                gm.c3(new up6(o35Var.c, (cwc) yh4Var.b, o35Var.a, "connect error: ".concat(p35.b(e)), (byte) 25));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            o35Var.getClass();
                        }
                    }
                    return;
                }
            default:
                cwcVar.d();
                return;
        }
    }
}
