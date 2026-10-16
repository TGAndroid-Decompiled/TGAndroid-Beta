package m4;
public final class j0 implements o0 {
    public final int f15230a;
    public final p0 f15231b;
    public final int f15232c;

    public j0(p0 p0Var, int i10, int i11) {
        this.f15230a = i11;
        this.f15231b = p0Var;
        this.f15232c = i10;
    }

    @Override
    public final void e(v vVar) {
        int i10 = this.f15230a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f15232c;
        p0 p0Var = this.f15231b;
        switch (i10) {
            case 0:
                m1 m1Var = p0Var.f15303g.f15170t;
                int i13 = n.f15285a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            e2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i12 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 1;
                    }
                }
                m1Var.j(i11);
                return;
            default:
                m1 m1Var2 = p0Var.f15303g.f15170t;
                int i14 = n.f15285a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(i2.d.j(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                m1Var2.w(z10);
                return;
        }
    }
}
