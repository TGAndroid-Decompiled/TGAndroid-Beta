package mc;

import ie.p;
import ie.s;
public final class d extends h {
    public final int f17615e;

    @Override
    public final p b() {
        switch (this.f17615e) {
            case 0:
                int i9 = this.d + 1;
                this.d = i9;
                if (c() == '[') {
                    this.d++;
                    s f10 = f("![");
                    i iVar = this.f17619a;
                    fe.b bVar = iVar.f17633i;
                    fe.b bVar2 = new fe.b(f10, i9, bVar, iVar.h, true);
                    if (bVar != null) {
                        bVar.d = true;
                    }
                    iVar.f17633i = bVar2;
                    return f10;
                }
                return null;
            default:
                int i10 = this.d;
                this.d = i10 + 1;
                s f11 = f("[");
                i iVar2 = this.f17619a;
                fe.b bVar3 = iVar2.f17633i;
                fe.b bVar4 = new fe.b(f11, i10, bVar3, iVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                iVar2.f17633i = bVar4;
                return f11;
        }
    }

    @Override
    public final char d() {
        switch (this.f17615e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
