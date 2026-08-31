package b7;
public final class m extends o {
    public final transient o f1841c;

    public m(o oVar) {
        this.f1841c = oVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f1841c.contains(obj);
    }

    @Override
    public final Object get(int i10) {
        o oVar = this.f1841c;
        b.e(i10, oVar.size());
        return oVar.get((oVar.size() - 1) - i10);
    }

    @Override
    public final int indexOf(Object obj) {
        o oVar = this.f1841c;
        int lastIndexOf = oVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (oVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        o oVar = this.f1841c;
        int indexOf = oVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (oVar.size() - 1) - indexOf;
    }

    @Override
    public final o r() {
        return this.f1841c;
    }

    @Override
    public final o subList(int i10, int i11) {
        o oVar = this.f1841c;
        b.m(i10, i11, oVar.size());
        return oVar.subList(oVar.size() - i11, oVar.size() - i10).r();
    }

    @Override
    public final int size() {
        return this.f1841c.size();
    }
}
