package e1;

import kotlin.jvm.internal.j;
import v0.i;
public final class c implements Runnable {
    public final int f4881a;
    public final d f4882b;
    public final w0.d f4883c;

    public c(d dVar, w0.d dVar2, int i10) {
        this.f4881a = i10;
        this.f4882b = dVar;
        this.f4883c = dVar2;
    }

    @Override
    public final void run() {
        switch (this.f4881a) {
            case 0:
                i iVar = this.f4882b.f4885f;
                if (iVar != null) {
                    iVar.onError(this.f4883c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4882b.f4885f;
                if (iVar2 != null) {
                    Object obj = this.f4883c;
                    if (obj == null) {
                        obj = new w0.c("No provider data returned", 2);
                    }
                    iVar2.onError(obj);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}
