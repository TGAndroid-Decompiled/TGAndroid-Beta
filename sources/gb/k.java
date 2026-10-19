package gb;

import java.util.AbstractSet;
import java.util.Iterator;
public final class k extends AbstractSet {
    public final int f10965a;
    public final m f10966b;

    public k(m mVar, int i10) {
        this.f10965a = i10;
        this.f10966b = mVar;
    }

    @Override
    public final void clear() {
        switch (this.f10965a) {
            case 0:
                this.f10966b.clear();
                return;
            default:
                this.f10966b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: gb.k.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10965a) {
            case 0:
                return new j(this.f10966b, 0);
            default:
                return new j(this.f10966b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: gb.k.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f10965a) {
            case 0:
                return this.f10966b.d;
            default:
                return this.f10966b.d;
        }
    }
}
