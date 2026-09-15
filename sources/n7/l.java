package n7;
public final class l extends n {
    public final transient n f15145c;

    public l(n nVar) {
        this.f15145c = nVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f15145c.contains(obj);
    }

    @Override
    public final Object get(int i10) {
        n nVar = this.f15145c;
        a.e(i10, nVar.size());
        return nVar.get((nVar.size() - 1) - i10);
    }

    @Override
    public final int indexOf(Object obj) {
        n nVar = this.f15145c;
        int lastIndexOf = nVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (nVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        n nVar = this.f15145c;
        int indexOf = nVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (nVar.size() - 1) - indexOf;
    }

    @Override
    public final n r() {
        return this.f15145c;
    }

    @Override
    public final n subList(int i10, int i11) {
        n nVar = this.f15145c;
        a.m(i10, i11, nVar.size());
        return nVar.subList(nVar.size() - i11, nVar.size() - i10).r();
    }

    @Override
    public final int size() {
        return this.f15145c.size();
    }
}
