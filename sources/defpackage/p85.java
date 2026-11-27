package defpackage;

import org.telegram.tgnet.TLRPC;
public final class p85 extends qie {
    public final j95 a;

    public p85(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final boolean a(int i, int i2) {
        return true;
    }

    @Override
    public final boolean b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        j95 j95Var = this.a;
        e95 e95Var = j95Var.I1;
        int i8 = e95Var.x;
        if (i8 >= 0) {
            if (i == j95Var.W4) {
                if (i2 != i8) {
                    if (i2 != i8) {
                        return false;
                    }
                }
                return true;
            } else if (i2 == i8) {
                return false;
            }
        }
        int i9 = e95Var.y;
        if (i9 >= 0) {
            if (i == j95Var.j5) {
                if (i2 != i9) {
                    if (i2 != i9) {
                        return false;
                    }
                }
                return true;
            } else if (i2 == i9) {
                return false;
            }
        }
        int i10 = e95Var.E;
        if (i10 >= 0) {
            if (i == j95Var.k5) {
                if (i2 != i10) {
                    if (i2 != i10) {
                        return false;
                    }
                }
                return true;
            } else if (i2 == i10) {
                return false;
            }
        }
        int i11 = e95Var.L;
        if (i11 >= 0) {
            if (i == j95Var.V4) {
                if (i2 != i11) {
                    if (i2 != i11) {
                        return false;
                    }
                }
                return true;
            } else if (i2 == i11) {
                return false;
            }
        }
        int i12 = e95Var.K;
        if (i12 >= 0) {
            if (i == j95Var.i5) {
                if (i2 != i12) {
                    if (i2 != i12) {
                        return false;
                    }
                }
                return true;
            } else if (i2 == i12) {
                return false;
            }
        }
        int i13 = e95Var.J;
        if (i13 < 0 || i13 != i2 || i != j95Var.h5) {
            int i14 = j95Var.C2 - 1;
            int i15 = e95Var.G - 1;
            if (i == i14) {
                if (i2 != i15) {
                    return false;
                }
            } else if (i2 != i15) {
                if (i2 >= e95Var.H && i2 < e95Var.I && i >= (i7 = j95Var.f5) && i < j95Var.g5) {
                    return ((wc2) j95Var.y2.get(i - i7)).equals((wc2) j95Var.j2.get(i2 - e95Var.H));
                }
                if (i2 >= e95Var.d && i2 < e95Var.e && i >= (i6 = j95Var.X4) && i < j95Var.Y4) {
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) j95Var.x2.get(i - i6);
                    if (r47.B1(groupCallParticipant.peer) == r47.B1(((TLRPC.GroupCallParticipant) j95Var.T2.g.get(i2 - e95Var.d)).peer)) {
                        if (i != i2 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (i2 >= e95Var.f && i2 < e95Var.h && i >= (i5 = j95Var.Z4) && i < j95Var.a5) {
                    return ((Long) j95Var.z2.get(i - i5)).equals((Long) j95Var.T2.j.get(i2 - e95Var.f));
                } else {
                    if (i2 >= e95Var.n && i2 < e95Var.r && i >= (i4 = j95Var.b5) && i < j95Var.c5) {
                        return ((Long) j95Var.A2.get(i - i4)).equals((Long) j95Var.T2.m.get(i2 - e95Var.n));
                    }
                    if (i2 >= e95Var.s && i2 < e95Var.w && i >= (i3 = j95Var.d5) && i < j95Var.e5) {
                        return ((Long) j95Var.B2.get(i - i3)).equals((Long) j95Var.T2.l.get(i2 - e95Var.s));
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int c() {
        return this.a.I1.G;
    }

    @Override
    public final int d() {
        return this.a.C2;
    }
}
