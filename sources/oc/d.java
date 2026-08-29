package oc;

import le.p;
import le.s;
public final class d extends h {
    public final int f19475e;

    @Override
    public final p b() {
        switch (this.f19475e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() == '[') {
                    this.d++;
                    s f9 = f("![");
                    j jVar = this.f19479a;
                    ie.b bVar = jVar.f19496i;
                    ie.b bVar2 = new ie.b(f9, i10, bVar, jVar.h, true);
                    if (bVar != null) {
                        bVar.d = true;
                    }
                    jVar.f19496i = bVar2;
                    return f9;
                }
                return null;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                j jVar2 = this.f19479a;
                ie.b bVar3 = jVar2.f19496i;
                ie.b bVar4 = new ie.b(f10, i11, bVar3, jVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                jVar2.f19496i = bVar4;
                return f10;
        }
    }

    @Override
    public final char d() {
        switch (this.f19475e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
