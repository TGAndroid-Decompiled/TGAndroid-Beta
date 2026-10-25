package hd;

import ef.p;
import ef.s;
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
                    i iVar = this.f12773a;
                    bf.d dVar = iVar.f12786i;
                    bf.d dVar2 = new bf.d(f7, i10, dVar, iVar.h, true);
                    if (dVar != null) {
                        dVar.d = true;
                    }
                    iVar.f12786i = dVar2;
                    return f7;
                }
                return null;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                i iVar2 = this.f12773a;
                bf.d dVar3 = iVar2.f12786i;
                bf.d dVar4 = new bf.d(f10, i11, dVar3, iVar2.h, false);
                if (dVar3 != null) {
                    dVar3.d = true;
                }
                iVar2.f12786i = dVar4;
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
