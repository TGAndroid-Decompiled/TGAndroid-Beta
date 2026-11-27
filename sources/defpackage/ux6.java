package defpackage;
public final class ux6 implements ws4 {
    public final byte a = 0;
    public final xw6 b;
    public final boolean c;
    public final yx6 d;

    public ux6(yx6 yx6Var, xw6 xw6Var, boolean z) {
        this.d = yx6Var;
        this.b = xw6Var;
        this.c = z;
    }

    @Override
    public final void k(Throwable th) {
        switch (this.a) {
            case 0:
                efd.d("MediaSessionImpl", "Failed calling onPlayRequested", th);
                return;
            default:
                if (th instanceof UnsupportedOperationException) {
                    efd.g("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    efd.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                yx6 yx6Var = this.d;
                gcc.L(yx6Var.t);
                if (this.c) {
                    yx6Var.n(this.b);
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
        yx6 yx6Var = this.d;
        boolean z3 = this.c;
        xw6 xw6Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    if (yx6Var.t.m0(16) && yx6Var.t.u() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!yx6Var.t.m0(31) && !yx6Var.t.m0(20)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    xw6 q = yx6Var.q(xw6Var);
                    yf8 yf8Var = new yf8();
                    yf8Var.a.b(1);
                    zf8 b2 = yf8Var.b();
                    if (!z) {
                        if (!z2) {
                            efd.f("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                        } else {
                            yx6Var.e.getClass();
                            co5 b3 = fne.b(new UnsupportedOperationException());
                            b3.b(new xs4(b3, new ux6(yx6Var, q, z3, b2), (byte) 0), new pe2(yx6Var, (byte) 3));
                            return;
                        }
                    }
                    gcc.L(yx6Var.t);
                    if (z3) {
                        yx6Var.n(q);
                        return;
                    }
                    return;
                }
                return;
            default:
                ote.b(yx6Var.t, (yw6) obj);
                gcc.L(yx6Var.t);
                if (z3) {
                    yx6Var.n(xw6Var);
                    return;
                }
                return;
        }
    }

    public ux6(yx6 yx6Var, xw6 xw6Var, boolean z, zf8 zf8Var) {
        this.d = yx6Var;
        this.b = xw6Var;
        this.c = z;
    }
}
