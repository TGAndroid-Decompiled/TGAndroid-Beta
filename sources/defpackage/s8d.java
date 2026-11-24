package defpackage;
public final class s8d extends c9d {
    public final transient c9d r;

    public s8d(c9d c9dVar) {
        super((byte) 3);
        this.r = c9dVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override
    public final Object get(int i) {
        c9d c9dVar = this.r;
        w5f.a(i, c9dVar.size());
        return c9dVar.get((c9dVar.size() - 1) - i);
    }

    @Override
    public final int indexOf(Object obj) {
        c9d c9dVar = this.r;
        int lastIndexOf = c9dVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (c9dVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        c9d c9dVar = this.r;
        int indexOf = c9dVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (c9dVar.size() - 1) - indexOf;
    }

    @Override
    public final int size() {
        return this.r.size();
    }

    @Override
    public final c9d y() {
        return this.r;
    }

    @Override
    public final c9d subList(int i, int i2) {
        c9d c9dVar = this.r;
        w5f.b(i, i2, c9dVar.size());
        return c9dVar.subList(c9dVar.size() - i2, c9dVar.size() - i).y();
    }
}
