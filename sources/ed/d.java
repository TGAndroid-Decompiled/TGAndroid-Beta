package ed;

import kf.p;
import kf.s;
public final class d extends h {
    public final int f10740e;

    @Override
    public final p b() {
        switch (this.f10740e) {
            case 0:
                int i7 = this.d + 1;
                this.d = i7;
                if (c() == '[') {
                    this.d++;
                    s f10 = f("![");
                    i iVar = this.f10744a;
                    gf.d dVar = iVar.f10758i;
                    gf.d dVar2 = new gf.d(f10, i7, dVar, iVar.h, true);
                    if (dVar != null) {
                        dVar.d = true;
                    }
                    iVar.f10758i = dVar2;
                    return f10;
                }
                return null;
            default:
                int i10 = this.d;
                this.d = i10 + 1;
                s f11 = f("[");
                i iVar2 = this.f10744a;
                gf.d dVar3 = iVar2.f10758i;
                gf.d dVar4 = new gf.d(f11, i10, dVar3, iVar2.h, false);
                if (dVar3 != null) {
                    dVar3.d = true;
                }
                iVar2.f10758i = dVar4;
                return f11;
        }
    }

    @Override
    public final char d() {
        switch (this.f10740e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
