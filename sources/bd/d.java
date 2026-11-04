package bd;

import gf.p;
import gf.s;
public final class d extends h {
    public final int f3225e;

    @Override
    public final p b() {
        switch (this.f3225e) {
            case 0:
                int i3 = this.d + 1;
                this.d = i3;
                if (c() == '[') {
                    this.d++;
                    s f10 = f("![");
                    j jVar = this.f3229a;
                    df.d dVar = jVar.f3246i;
                    df.d dVar2 = new df.d(f10, i3, dVar, jVar.h, true);
                    if (dVar != null) {
                        dVar.d = true;
                    }
                    jVar.f3246i = dVar2;
                    return f10;
                }
                return null;
            default:
                int i10 = this.d;
                this.d = i10 + 1;
                s f11 = f("[");
                j jVar2 = this.f3229a;
                df.d dVar3 = jVar2.f3246i;
                df.d dVar4 = new df.d(f11, i10, dVar3, jVar2.h, false);
                if (dVar3 != null) {
                    dVar3.d = true;
                }
                jVar2.f3246i = dVar4;
                return f11;
        }
    }

    @Override
    public final char d() {
        switch (this.f3225e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
