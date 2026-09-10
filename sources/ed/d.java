package ed;

import bf.p;
import bf.s;
public final class d extends h {
    public final int e;

    @Override
    public final p b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() == '[') {
                    this.d++;
                    s f7 = f("![");
                    i iVar = this.f7454a;
                    f6.f fVar = iVar.f7467i;
                    f6.f fVar2 = new f6.f(f7, i10, fVar, iVar.h, true);
                    if (fVar != null) {
                        fVar.d = true;
                    }
                    iVar.f7467i = fVar2;
                    return f7;
                }
                return null;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                i iVar2 = this.f7454a;
                f6.f fVar3 = iVar2.f7467i;
                f6.f fVar4 = new f6.f(f10, i11, fVar3, iVar2.h, false);
                if (fVar3 != null) {
                    fVar3.d = true;
                }
                iVar2.f7467i = fVar4;
                return f10;
        }
    }

    @Override
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
