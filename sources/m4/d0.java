package m4;
public final class d0 implements j0 {
    public final int f15864a;
    public final k0 f15865b;
    public final int f15866c;

    public d0(k0 k0Var, int i10, int i11) {
        this.f15864a = i11;
        this.f15865b = k0Var;
        this.f15866c = i10;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f15864a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f15866c;
        k0 k0Var = this.f15865b;
        switch (i10) {
            case 0:
                j1 j1Var = k0Var.f15970g.f15843t;
                int i13 = k.f15967a;
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
                j1Var.j(i11);
                return;
            default:
                j1 j1Var2 = k0Var.f15970g.f15843t;
                int i14 = k.f15967a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(i2.g.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                j1Var2.x(z10);
                return;
        }
    }
}
