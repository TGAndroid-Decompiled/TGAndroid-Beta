package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class a implements Runnable {
    public final int f4065a;
    public final e f4066b;
    public final w0.d f4067c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f4065a = i10;
        this.f4066b = eVar;
        this.f4067c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f4065a) {
            case 0:
                i iVar = this.f4066b.f4076f;
                if (iVar != null) {
                    iVar.onError(this.f4067c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f4066b.f4076f;
                if (iVar2 != null) {
                    iVar2.onError(this.f4067c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f4066b.f4076f;
                if (iVar3 != null) {
                    iVar3.onError(this.f4067c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
