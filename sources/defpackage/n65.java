package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n65 extends zde {
    public final h75 a;

    public n65(h75 h75Var) {
        this.a = h75Var;
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
        h75 h75Var = this.a;
        c75 c75Var = h75Var.I1;
        int i8 = c75Var.x;
        if (i8 >= 0) {
            if (i == h75Var.W4) {
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
        int i9 = c75Var.y;
        if (i9 >= 0) {
            if (i == h75Var.j5) {
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
        int i10 = c75Var.E;
        if (i10 >= 0) {
            if (i == h75Var.k5) {
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
        int i11 = c75Var.L;
        if (i11 >= 0) {
            if (i == h75Var.V4) {
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
        int i12 = c75Var.K;
        if (i12 >= 0) {
            if (i == h75Var.i5) {
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
        int i13 = c75Var.J;
        if (i13 < 0 || i13 != i2 || i != h75Var.h5) {
            int i14 = h75Var.C2 - 1;
            int i15 = c75Var.G - 1;
            if (i == i14) {
                if (i2 != i15) {
                    return false;
                }
            } else if (i2 != i15) {
                if (i2 >= c75Var.H && i2 < c75Var.I && i >= (i7 = h75Var.f5) && i < h75Var.g5) {
                    return ((gc2) h75Var.y2.get(i - i7)).equals((gc2) h75Var.j2.get(i2 - c75Var.H));
                }
                if (i2 >= c75Var.d && i2 < c75Var.e && i >= (i6 = h75Var.X4) && i < h75Var.Y4) {
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) h75Var.x2.get(i - i6);
                    if (k27.B1(groupCallParticipant.peer) == k27.B1(((TLRPC.GroupCallParticipant) h75Var.T2.g.get(i2 - c75Var.d)).peer)) {
                        if (i != i2 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (i2 >= c75Var.f && i2 < c75Var.h && i >= (i5 = h75Var.Z4) && i < h75Var.a5) {
                    return ((Long) h75Var.z2.get(i - i5)).equals((Long) h75Var.T2.j.get(i2 - c75Var.f));
                } else {
                    if (i2 >= c75Var.n && i2 < c75Var.r && i >= (i4 = h75Var.b5) && i < h75Var.c5) {
                        return ((Long) h75Var.A2.get(i - i4)).equals((Long) h75Var.T2.m.get(i2 - c75Var.n));
                    }
                    if (i2 >= c75Var.s && i2 < c75Var.w && i >= (i3 = h75Var.d5) && i < h75Var.e5) {
                        return ((Long) h75Var.B2.get(i - i3)).equals((Long) h75Var.T2.l.get(i2 - c75Var.s));
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
