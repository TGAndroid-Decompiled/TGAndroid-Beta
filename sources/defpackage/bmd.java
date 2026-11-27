package defpackage;
public final class bmd extends omd {
    public final transient omd r;

    public bmd(omd omdVar) {
        super((byte) 4);
        this.r = omdVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override
    public final Object get(int i) {
        omd omdVar = this.r;
        c5f.a(i, omdVar.size());
        return omdVar.get((omdVar.size() - 1) - i);
    }

    @Override
    public final int indexOf(Object obj) {
        omd omdVar = this.r;
        int lastIndexOf = omdVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (omdVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        omd omdVar = this.r;
        int indexOf = omdVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (omdVar.size() - 1) - indexOf;
    }

    @Override
    public final int size() {
        return this.r.size();
    }

    @Override
    public final omd y() {
        return this.r;
    }

    @Override
    public final omd subList(int i, int i2) {
        omd omdVar = this.r;
        c5f.b(i, i2, omdVar.size());
        return omdVar.subList(omdVar.size() - i2, omdVar.size() - i).y();
    }
}
