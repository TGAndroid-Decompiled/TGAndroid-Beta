package j8;

public final class d implements i8.c {

    public final k5.i f12766a;

    public d(k5.i iVar) {
        this.f12766a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f12766a.equals(((d) obj).f12766a);
    }

    public final int hashCode() {
        return this.f12766a.hashCode();
    }

    @Override
    public final void onChannelClosed(i8.b bVar, int i10, int i11) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.f12766a.f14480b).onChannelClosed((i8.d) bVar, i10, i11);
    }

    @Override
    public final void onChannelOpened(i8.b bVar) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.f12766a.f14480b).onChannelOpened((i8.d) bVar);
    }

    @Override
    public final void onInputClosed(i8.b bVar, int i10, int i11) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.f12766a.f14480b).onInputClosed((i8.d) bVar, i10, i11);
    }

    @Override
    public final void onOutputClosed(i8.b bVar, int i10, int i11) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.f12766a.f14480b).onOutputClosed((i8.d) bVar, i10, i11);
    }
}
