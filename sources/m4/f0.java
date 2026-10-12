package m4;
public final class f0 implements l0 {
    public final int f15814a;
    public final m0 f15815b;
    public final int f15816c;

    public f0(m0 m0Var, int i10, int i11) {
        this.f15814a = i11;
        this.f15815b = m0Var;
        this.f15816c = i10;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f15814a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f15816c;
        m0 m0Var = this.f15815b;
        switch (i10) {
            case 0:
                g1 g1Var = m0Var.f15905g.f15748t;
                int i13 = k.f15868a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            e2.a.n("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i12 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 1;
                    }
                }
                g1Var.j(i11);
                return;
            default:
                g1 g1Var2 = m0Var.f15905g.f15748t;
                int i14 = k.f15868a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hg.c.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                g1Var2.x(z10);
                return;
        }
    }
}
