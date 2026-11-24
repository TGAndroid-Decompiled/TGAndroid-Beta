package defpackage;
public final class q6d extends a7d {
    public final transient a7d r;

    public q6d(a7d a7dVar) {
        super((byte) 3);
        this.r = a7dVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override
    public final Object get(int i) {
        a7d a7dVar = this.r;
        u3f.a(i, a7dVar.size());
        return a7dVar.get((a7dVar.size() - 1) - i);
    }

    @Override
    public final int indexOf(Object obj) {
        a7d a7dVar = this.r;
        int lastIndexOf = a7dVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (a7dVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        a7d a7dVar = this.r;
        int indexOf = a7dVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (a7dVar.size() - 1) - indexOf;
    }

    @Override
    public final int size() {
        return this.r.size();
    }

    @Override
    public final a7d y() {
        return this.r;
    }

    @Override
    public final a7d subList(int i, int i2) {
        a7d a7dVar = this.r;
        u3f.b(i, i2, a7dVar.size());
        return a7dVar.subList(a7dVar.size() - i2, a7dVar.size() - i).y();
    }
}
