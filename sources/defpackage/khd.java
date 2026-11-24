package defpackage;
public final class khd extends xhd {
    public final transient xhd r;

    public khd(xhd xhdVar) {
        super((byte) 4);
        this.r = xhdVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override
    public final Object get(int i) {
        xhd xhdVar = this.r;
        k0f.a(i, xhdVar.size());
        return xhdVar.get((xhdVar.size() - 1) - i);
    }

    @Override
    public final int indexOf(Object obj) {
        xhd xhdVar = this.r;
        int lastIndexOf = xhdVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (xhdVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        xhd xhdVar = this.r;
        int indexOf = xhdVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (xhdVar.size() - 1) - indexOf;
    }

    @Override
    public final int size() {
        return this.r.size();
    }

    @Override
    public final xhd y() {
        return this.r;
    }

    @Override
    public final xhd subList(int i, int i2) {
        xhd xhdVar = this.r;
        k0f.b(i, i2, xhdVar.size());
        return xhdVar.subList(xhdVar.size() - i2, xhdVar.size() - i).y();
    }
}
