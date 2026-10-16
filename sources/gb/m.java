package gb;

import java.util.AbstractSet;
import java.util.Iterator;
public final class m extends AbstractSet {
    public final int f10062a;
    public final o f10063b;

    public m(o oVar, int i10) {
        this.f10062a = i10;
        this.f10063b = oVar;
    }

    @Override
    public final void clear() {
        switch (this.f10062a) {
            case 0:
                this.f10063b.clear();
                return;
            default:
                this.f10063b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: gb.m.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10062a) {
            case 0:
                return new l(this.f10063b, 0);
            default:
                return new l(this.f10063b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: gb.m.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f10062a) {
            case 0:
                return this.f10063b.d;
            default:
                return this.f10063b.d;
        }
    }
}
