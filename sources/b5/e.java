package b5;

import d5.g0;
import h3.t0;

public final class e implements o8.f {

    public final q f1939a;

    public e(q qVar) {
        this.f1939a = qVar;
    }

    @Override
    public final boolean apply(Object obj) {
        boolean z10;
        l lVar;
        l lVar2;
        q qVar = this.f1939a;
        t0 t0Var = (t0) obj;
        synchronized (qVar.d) {
            try {
                z10 = true;
                if (qVar.h.V && !qVar.f1978g) {
                    if (t0Var.O > 2) {
                        String str = t0Var.B;
                        if (str != null) {
                            switch (str) {
                                case "audio/eac3-joc":
                                case "audio/ac3":
                                case "audio/ac4":
                                case "audio/eac3":
                                    if (g0.f4795a >= 32 && (lVar2 = qVar.f1979i) != null && lVar2.f1954b) {
                                    }
                                default:
                                    if (g0.f4795a < 32) {
                                        z10 = false;
                                        break;
                                    } else {
                                        z10 = false;
                                        break;
                                    }
                                    break;
                            }
                        } else if (g0.f4795a < 32 || (lVar = qVar.f1979i) == null || !lVar.f1954b || !lVar.c() || !qVar.f1979i.d() || !qVar.f1979i.a(t0Var, qVar.f1980j)) {
                            z10 = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
