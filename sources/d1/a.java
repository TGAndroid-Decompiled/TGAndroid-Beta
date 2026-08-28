package d1;

import v0.i;
public final class a implements Runnable {
    public final int f4238a;
    public final e f4239b;
    public final w0.d f4240c;

    public a(e eVar, w0.d dVar, int i9) {
        this.f4238a = i9;
        this.f4239b = eVar;
        this.f4240c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f4238a) {
            case 0:
                i iVar = this.f4239b.f4250f;
                if (iVar != null) {
                    iVar.onError(this.f4240c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.f4239b.f4250f;
                if (iVar2 != null) {
                    iVar2.onError(this.f4240c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.f4239b.f4250f;
                if (iVar3 != null) {
                    iVar3.onError(this.f4240c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}
