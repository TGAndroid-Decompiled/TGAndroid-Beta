package m4;
public final class k0 implements p0 {
    public final int f15500a;
    public final q0 f15501b;
    public final int f15502c;

    public k0(q0 q0Var, int i10, int i11) {
        this.f15500a = i11;
        this.f15501b = q0Var;
        this.f15502c = i10;
    }

    @Override
    public final void f(w wVar) {
        int i10 = this.f15500a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.f15502c;
        q0 q0Var = this.f15501b;
        switch (i10) {
            case 0:
                n1 n1Var = q0Var.f15573g.f15440t;
                int i13 = o.f15555a;
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
                n1Var.j(i11);
                return;
            default:
                n1 n1Var2 = q0Var.f15573g.f15440t;
                int i14 = o.f15555a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(i2.d.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                n1Var2.w(z10);
                return;
        }
    }
}
