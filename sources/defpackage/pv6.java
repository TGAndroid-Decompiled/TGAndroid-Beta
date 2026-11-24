package defpackage;
public final class pv6 implements sq4 {
    public final byte a = 0;
    public final su6 b;
    public final boolean c;
    public final tv6 d;

    public pv6(tv6 tv6Var, su6 su6Var, boolean z) {
        this.d = tv6Var;
        this.b = su6Var;
        this.c = z;
    }

    @Override
    public final void k(Throwable th) {
        switch (this.a) {
            case 0:
                lad.d("MediaSessionImpl", "Failed calling onPlayRequested", th);
                return;
            default:
                if (th instanceof UnsupportedOperationException) {
                    lad.g("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    lad.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                tv6 tv6Var = this.d;
                g8c.L(tv6Var.t);
                if (this.c) {
                    tv6Var.n(this.b);
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
        tv6 tv6Var = this.d;
        boolean z3 = this.c;
        su6 su6Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    if (tv6Var.t.m0(16) && tv6Var.t.u() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!tv6Var.t.m0(31) && !tv6Var.t.m0(20)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    su6 q = tv6Var.q(su6Var);
                    jc8 jc8Var = new jc8();
                    jc8Var.a.b(1);
                    kc8 b2 = jc8Var.b();
                    if (!z) {
                        if (!z2) {
                            lad.f("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                        } else {
                            tv6Var.e.getClass();
                            zl5 b3 = jie.b(new UnsupportedOperationException());
                            b3.b(new tq4(b3, new pv6(tv6Var, q, z3, b2), (byte) 0), new ge2(tv6Var, (byte) 3));
                            return;
                        }
                    }
                    g8c.L(tv6Var.t);
                    if (z3) {
                        tv6Var.n(q);
                        return;
                    }
                    return;
                }
                return;
            default:
                woe.b(tv6Var.t, (tu6) obj);
                g8c.L(tv6Var.t);
                if (z3) {
                    tv6Var.n(su6Var);
                    return;
                }
                return;
        }
    }

    public pv6(tv6 tv6Var, su6 su6Var, boolean z, kc8 kc8Var) {
        this.d = tv6Var;
        this.b = su6Var;
        this.c = z;
    }
}
