package defpackage;
public final class jbd extends tbd {
    public final transient tbd r;

    public jbd(tbd tbdVar) {
        super((byte) 3);
        this.r = tbdVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override
    public final Object get(int i) {
        tbd tbdVar = this.r;
        t8f.a(i, tbdVar.size());
        return tbdVar.get((tbdVar.size() - 1) - i);
    }

    @Override
    public final int indexOf(Object obj) {
        tbd tbdVar = this.r;
        int lastIndexOf = tbdVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (tbdVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        tbd tbdVar = this.r;
        int indexOf = tbdVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (tbdVar.size() - 1) - indexOf;
    }

    @Override
    public final int size() {
        return this.r.size();
    }

    @Override
    public final tbd y() {
        return this.r;
    }

    @Override
    public final tbd subList(int i, int i2) {
        tbd tbdVar = this.r;
        t8f.b(i, i2, tbdVar.size());
        return tbdVar.subList(tbdVar.size() - i2, tbdVar.size() - i).y();
    }
}
