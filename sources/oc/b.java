package oc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.Wallet.w0;
import org.telegram.ui.Wallet.x0;
public final class b extends a0 {
    public final int f20960b;

    public b(String str, u uVar, int i3, int i10) {
        super(str, uVar, i3);
        this.f20960b = i10;
    }

    @Override
    public final void a() {
        switch (this.f20960b) {
            case 0:
                u uVar = this.f20959a;
                try {
                    uVar.b();
                    return;
                } catch (v e10) {
                    b4.n nVar = uVar.d;
                    nVar.d(e10);
                    ArrayList arrayList = (ArrayList) nVar.q();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        w0 w0Var = (w0) obj;
                        try {
                            try {
                                u uVar2 = (u) nVar.f2378b;
                                x0 x0Var = w0Var.f43308c;
                                int i10 = w0Var.f43306a;
                                g0.h3(new zo0(x0Var, uVar2, i10, "connect error: " + x0.a(e10), 19));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            w0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.f20959a.d();
                return;
        }
    }
}
