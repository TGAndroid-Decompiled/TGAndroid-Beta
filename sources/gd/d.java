package gd;

import df.p;
import df.s;
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
                    i iVar = this.f10087a;
                    af.e eVar = iVar.f10100i;
                    af.e eVar2 = new af.e(f7, i10, eVar, iVar.h, true);
                    if (eVar != null) {
                        eVar.d = true;
                    }
                    iVar.f10100i = eVar2;
                    return f7;
                }
                return null;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                i iVar2 = this.f10087a;
                af.e eVar3 = iVar2.f10100i;
                af.e eVar4 = new af.e(f10, i11, eVar3, iVar2.h, false);
                if (eVar3 != null) {
                    eVar3.d = true;
                }
                iVar2.f10100i = eVar4;
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
