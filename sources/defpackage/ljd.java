package defpackage;
public final class ljd extends yjd {
    public final transient yjd r;

    public ljd(yjd yjdVar) {
        super((byte) 4);
        this.r = yjdVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override
    public final Object get(int i) {
        yjd yjdVar = this.r;
        m2f.a(i, yjdVar.size());
        return yjdVar.get((yjdVar.size() - 1) - i);
    }

    @Override
    public final int indexOf(Object obj) {
        yjd yjdVar = this.r;
        int lastIndexOf = yjdVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (yjdVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        yjd yjdVar = this.r;
        int indexOf = yjdVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (yjdVar.size() - 1) - indexOf;
    }

    @Override
    public final int size() {
        return this.r.size();
    }

    @Override
    public final yjd y() {
        return this.r;
    }

    @Override
    public final yjd subList(int i, int i2) {
        yjd yjdVar = this.r;
        m2f.b(i, i2, yjdVar.size());
        return yjdVar.subList(yjdVar.size() - i2, yjdVar.size() - i).y();
    }
}
