package n7;
public final class k extends m {
    public final transient m f17288c;

    public k(m mVar) {
        this.f17288c = mVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f17288c.contains(obj);
    }

    @Override
    public final Object get(int i10) {
        m mVar = this.f17288c;
        a.e(i10, mVar.size());
        return mVar.get((mVar.size() - 1) - i10);
    }

    @Override
    public final int indexOf(Object obj) {
        m mVar = this.f17288c;
        int lastIndexOf = mVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (mVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        m mVar = this.f17288c;
        int indexOf = mVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (mVar.size() - 1) - indexOf;
    }

    @Override
    public final m q() {
        return this.f17288c;
    }

    @Override
    public final m subList(int i10, int i11) {
        m mVar = this.f17288c;
        a.m(i10, i11, mVar.size());
        return mVar.subList(mVar.size() - i11, mVar.size() - i10).q();
    }

    @Override
    public final int size() {
        return this.f17288c.size();
    }
}
