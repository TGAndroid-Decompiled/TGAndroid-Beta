package m8;
public final class d implements l8.c {
    public final androidx.biometric.f0 f13505a;

    public d(androidx.biometric.f0 f0Var) {
        this.f13505a = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f13505a.equals(((d) obj).f13505a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13505a.hashCode();
    }

    @Override
    public final void onChannelClosed(l8.b bVar, int i10, int i11) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.f13505a.f532b).onChannelClosed((l8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onChannelOpened(l8.b bVar) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.f13505a.f532b).onChannelOpened((l8.d) ((f) bVar));
    }

    @Override
    public final void onInputClosed(l8.b bVar, int i10, int i11) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.f13505a.f532b).onInputClosed((l8.d) ((f) bVar), i10, i11);
    }

    @Override
    public final void onOutputClosed(l8.b bVar, int i10, int i11) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.f13505a.f532b).onOutputClosed((l8.d) ((f) bVar), i10, i11);
    }
}
