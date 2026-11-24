package defpackage;

import java.util.ArrayList;
public final class xr2 extends huc {
    public final byte b;

    public xr2(String str, buc bucVar, int i, byte b) {
        super(str, bucVar, i);
        this.b = b;
    }

    @Override
    public final void a() {
        byte b = this.b;
        buc bucVar = this.a;
        switch (b) {
            case 0:
                try {
                    bucVar.b();
                    return;
                } catch (cuc e) {
                    xf4 xf4Var = bucVar.d;
                    xf4Var.f(e);
                    ArrayList arrayList = (ArrayList) xf4Var.u();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        o15 o15Var = (o15) obj;
                        try {
                            try {
                                gl.d3(new tn6(o15Var.c, (buc) xf4Var.b, o15Var.a, "connect error: ".concat(p15.b(e)), (byte) 24));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            o15Var.getClass();
                        }
                    }
                    return;
                }
            default:
                bucVar.d();
                return;
        }
    }
}
