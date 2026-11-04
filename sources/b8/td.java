package b8;
public abstract class td {
    public static int a(c4.f fVar, int i3, int i10, int i11) {
        boolean z10;
        if (Math.max(Math.max(i3, i10), i11) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int i12 = (1 << i3) - 1;
        int i13 = (1 << i10) - 1;
        wc.a(wc.a(i12, i13), 1 << i11);
        if (fVar.b() >= i3) {
            int j10 = fVar.j(i3);
            if (j10 == i12) {
                if (fVar.b() >= i10) {
                    int j11 = fVar.j(i10);
                    j10 += j11;
                    if (j11 == i13) {
                        if (fVar.b() < i11) {
                            return -1;
                        }
                        return fVar.j(i11) + j10;
                    }
                } else {
                    return -1;
                }
            }
            return j10;
        }
        return -1;
    }

    public static void b(c4.f fVar) {
        fVar.L(3);
        fVar.L(8);
        boolean i3 = fVar.i();
        boolean i10 = fVar.i();
        if (i3) {
            fVar.L(5);
        }
        if (i10) {
            fVar.L(6);
        }
    }

    public static void c(c4.f fVar) {
        int i3;
        int j10;
        int j11 = fVar.j(2);
        int i10 = 6;
        if (j11 == 0) {
            fVar.L(6);
            return;
        }
        int i11 = 5;
        int a10 = a(fVar, 5, 8, 16) + 1;
        if (j11 == 1) {
            fVar.L(a10 * 7);
        } else if (j11 == 2) {
            boolean i12 = fVar.i();
            if (i12) {
                i3 = 1;
            } else {
                i3 = 5;
            }
            if (i12) {
                i11 = 7;
            }
            if (i12) {
                i10 = 8;
            }
            int i13 = 0;
            while (i13 < a10) {
                if (fVar.i()) {
                    fVar.L(7);
                    j10 = 0;
                } else {
                    if (fVar.j(2) == 3 && fVar.j(i11) * i3 != 0) {
                        fVar.K();
                    }
                    j10 = fVar.j(i10) * i3;
                    if (j10 != 0 && j10 != 180) {
                        fVar.K();
                    }
                    fVar.K();
                }
                if (j10 != 0 && j10 != 180 && fVar.i()) {
                    i13++;
                }
                i13++;
            }
        }
    }
}
