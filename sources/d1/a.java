package d1;

import kotlin.jvm.internal.j;
import v0.i;
public final class a implements Runnable {
    public final int f4084a;
    public final e f4085b;
    public final w0.d f4086c;

    public a(e eVar, w0.d dVar, int i10) {
        this.f4084a = i10;
        this.f4085b = eVar;
        this.f4086c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f4084a) {
            case 0:
                i iVar = this.f4085b.f4095f;
                if (iVar != null) {
                    iVar.onError(this.f4086c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f4085b.f4095f;
                if (iVar2 != null) {
                    iVar2.onError(this.f4086c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f4085b.f4095f;
                if (iVar3 != null) {
                    iVar3.onError(this.f4086c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
