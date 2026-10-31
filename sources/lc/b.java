package lc;

import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;
public final class b extends b0 {
    public final int f11738b;

    public b(String str, v vVar, int i10, int i11) {
        super(str, vVar, i10);
        this.f11738b = i11;
    }

    @Override
    public final void a() {
        switch (this.f11738b) {
            case 0:
                v vVar = this.f11739a;
                try {
                    vVar.b();
                    return;
                } catch (w e) {
                    ac.a aVar = vVar.d;
                    aVar.d(e);
                    ArrayList arrayList = (ArrayList) aVar.o();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                v vVar2 = (v) aVar.f363b;
                                z0 z0Var = y0Var.f35403c;
                                int i11 = y0Var.f35401a;
                                i0.g3(new c11(z0Var, vVar2, i11, "connect error: " + z0.a(e), 13));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            y0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f11739a.d();
                return;
        }
    }
}
