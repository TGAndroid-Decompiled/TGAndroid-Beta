package na;

import java.util.AbstractSet;
import java.util.Iterator;
public final class k extends AbstractSet {
    public final int f18544a;
    public final m f18545b;

    public k(m mVar, int i9) {
        this.f18544a = i9;
        this.f18545b = mVar;
    }

    @Override
    public final void clear() {
        switch (this.f18544a) {
            case 0:
                this.f18545b.clear();
                return;
            default:
                this.f18545b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: na.k.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f18544a) {
            case 0:
                return new j(this.f18545b, 0);
            default:
                return new j(this.f18545b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: na.k.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f18544a) {
            case 0:
                return this.f18545b.d;
            default:
                return this.f18545b.d;
        }
    }
}
