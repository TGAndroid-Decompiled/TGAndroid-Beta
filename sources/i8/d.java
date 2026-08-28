package i8;
public final class d implements h8.c {
    public final fa.c f10959a;

    public d(fa.c cVar) {
        this.f10959a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f10959a.equals(((d) obj).f10959a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10959a.hashCode();
    }

    @Override
    public final void onChannelClosed(h8.b bVar, int i9, int i10) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.f10959a.f6034b).onChannelClosed((h8.d) ((f) bVar), i9, i10);
    }

    @Override
    public final void onChannelOpened(h8.b bVar) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.f10959a.f6034b).onChannelOpened((h8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(h8.b bVar, int i9, int i10) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.f10959a.f6034b).onInputClosed((h8.d) ((f) bVar), i9, i10);
    }

    @Override
    public final void onOutputClosed(h8.b bVar, int i9, int i10) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.f10959a.f6034b).onOutputClosed((h8.d) ((f) bVar), i9, i10);
    }
}
