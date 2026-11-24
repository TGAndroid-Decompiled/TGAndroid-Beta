package defpackage;
public final class px6 implements ts4 {
    public final byte a = 0;
    public final sw6 b;
    public final boolean c;
    public final tx6 d;

    public px6(tx6 tx6Var, sw6 sw6Var, boolean z) {
        this.d = tx6Var;
        this.b = sw6Var;
        this.c = z;
    }

    @Override
    public final void j(Throwable th) {
        switch (this.a) {
            case 0:
                ncd.d("MediaSessionImpl", "Failed calling onPlayRequested", th);
                return;
            default:
                if (th instanceof UnsupportedOperationException) {
                    ncd.g("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    ncd.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                tx6 tx6Var = this.d;
                hac.L(tx6Var.t);
                if (this.c) {
                    tx6Var.n(this.b);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z;
        boolean z2;
        byte b = this.a;
        tx6 tx6Var = this.d;
        boolean z3 = this.c;
        sw6 sw6Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    if (tx6Var.t.m0(16) && tx6Var.t.u() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!tx6Var.t.m0(31) && !tx6Var.t.m0(20)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    sw6 q = tx6Var.q(sw6Var);
                    me8 me8Var = new me8();
                    me8Var.a.b(1);
                    ne8 b2 = me8Var.b();
                    if (!z) {
                        if (!z2) {
                            ncd.f("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                        } else {
                            tx6Var.e.getClass();
                            zn5 b3 = kke.b(new UnsupportedOperationException());
                            b3.b(new us4(b3, new px6(tx6Var, q, z3, b2), (byte) 0), new rf2(tx6Var, (byte) 3));
                            return;
                        }
                    }
                    hac.L(tx6Var.t);
                    if (z3) {
                        tx6Var.n(q);
                        return;
                    }
                    return;
                }
                return;
            default:
                zqe.b(tx6Var.t, (tw6) obj);
                hac.L(tx6Var.t);
                if (z3) {
                    tx6Var.n(sw6Var);
                    return;
                }
                return;
        }
    }

    public px6(tx6 tx6Var, sw6 sw6Var, boolean z, ne8 ne8Var) {
        this.d = tx6Var;
        this.b = sw6Var;
        this.c = z;
    }
}
