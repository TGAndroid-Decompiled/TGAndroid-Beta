package hb;

import java.util.AbstractSet;
import java.util.Iterator;
public final class k extends AbstractSet {
    public final int f12744a;
    public final m f12745b;

    public k(m mVar, int i10) {
        this.f12744a = i10;
        this.f12745b = mVar;
    }

    @Override
    public final void clear() {
        switch (this.f12744a) {
            case 0:
                this.f12745b.clear();
                return;
            default:
                this.f12745b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: hb.k.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f12744a) {
            case 0:
                return new j(this.f12745b, 0);
            default:
                return new j(this.f12745b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: hb.k.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f12744a) {
            case 0:
                return this.f12745b.d;
            default:
                return this.f12745b.d;
        }
    }
}
