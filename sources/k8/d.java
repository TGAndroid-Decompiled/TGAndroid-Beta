package k8;
public final class d implements j8.c {
    public final m5.i f13482a;

    public d(m5.i iVar) {
        this.f13482a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f13482a.equals(((d) obj).f13482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13482a.hashCode();
    }

    @Override
    public final void onChannelClosed(j8.b bVar, int i10, int i11) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.f13482a.f16880b).onChannelClosed((j8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(j8.b bVar) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.f13482a.f16880b).onChannelOpened((j8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(j8.b bVar, int i10, int i11) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.f13482a.f16880b).onInputClosed((j8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(j8.b bVar, int i10, int i11) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.f13482a.f16880b).onOutputClosed((j8.d) ((f) bVar), i10, i11);
    }
}
