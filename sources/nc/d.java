package nc;

import je.p;
import je.s;

public final class d extends h {

    public final int f18451e;

    @Override
    public final p b() {
        switch (this.f18451e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s sVarF = f("![");
                i iVar = this.f18455a;
                ge.b bVar = iVar.f18469i;
                ge.b bVar2 = new ge.b(sVarF, i10, bVar, iVar.h, true);
                if (bVar != null) {
                    bVar.d = true;
                }
                iVar.f18469i = bVar2;
                return sVarF;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s sVarF2 = f("[");
                i iVar2 = this.f18455a;
                ge.b bVar3 = iVar2.f18469i;
                ge.b bVar4 = new ge.b(sVarF2, i11, bVar3, iVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                iVar2.f18469i = bVar4;
                return sVarF2;
        }
    }

    @Override
    public final char d() {
        switch (this.f18451e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
