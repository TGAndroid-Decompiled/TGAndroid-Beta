package o7;

import b8.bf;
public final class c extends e {
    public final transient e f20920c;

    public c(e eVar) {
        this.f20920c = eVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f20920c.contains(obj);
    }

    @Override
    public final Object get(int i3) {
        e eVar = this.f20920c;
        bf.a(i3, eVar.size());
        return eVar.get((eVar.size() - 1) - i3);
    }

    @Override
    public final int indexOf(Object obj) {
        e eVar = this.f20920c;
        int lastIndexOf = eVar.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (eVar.size() - 1) - lastIndexOf;
    }

    @Override
    public final e l() {
        return this.f20920c;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        e eVar = this.f20920c;
        int indexOf = eVar.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (eVar.size() - 1) - indexOf;
    }

    @Override
    public final e subList(int i3, int i10) {
        e eVar = this.f20920c;
        bf.b(i3, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i3).l();
    }

    @Override
    public final int size() {
        return this.f20920c.size();
    }
}
