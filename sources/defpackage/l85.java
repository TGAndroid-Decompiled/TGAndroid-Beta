package defpackage;

import org.telegram.tgnet.TLRPC;
public final class l85 extends age {
    public final g95 a;

    public l85(g95 g95Var) {
        this.a = g95Var;
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
        g95 g95Var = this.a;
        b95 b95Var = g95Var.I1;
        int i8 = b95Var.x;
        if (i8 >= 0) {
            if (i == g95Var.W4) {
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
        int i9 = b95Var.y;
        if (i9 >= 0) {
            if (i == g95Var.j5) {
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
        int i10 = b95Var.E;
        if (i10 >= 0) {
            if (i == g95Var.k5) {
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
        int i11 = b95Var.L;
        if (i11 >= 0) {
            if (i == g95Var.V4) {
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
        int i12 = b95Var.K;
        if (i12 >= 0) {
            if (i == g95Var.i5) {
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
        int i13 = b95Var.J;
        if (i13 < 0 || i13 != i2 || i != g95Var.h5) {
            int i14 = g95Var.C2 - 1;
            int i15 = b95Var.G - 1;
            if (i == i14) {
                if (i2 != i15) {
                    return false;
                }
            } else if (i2 != i15) {
                if (i2 >= b95Var.H && i2 < b95Var.I && i >= (i7 = g95Var.f5) && i < g95Var.g5) {
                    return ((rd2) g95Var.y2.get(i - i7)).equals((rd2) g95Var.j2.get(i2 - b95Var.H));
                }
                if (i2 >= b95Var.d && i2 < b95Var.e && i >= (i6 = g95Var.X4) && i < g95Var.Y4) {
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) g95Var.x2.get(i - i6);
                    if (k47.B1(groupCallParticipant.peer) == k47.B1(((TLRPC.GroupCallParticipant) g95Var.T2.g.get(i2 - b95Var.d)).peer)) {
                        if (i != i2 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (i2 >= b95Var.f && i2 < b95Var.h && i >= (i5 = g95Var.Z4) && i < g95Var.a5) {
                    return ((Long) g95Var.z2.get(i - i5)).equals((Long) g95Var.T2.j.get(i2 - b95Var.f));
                } else {
                    if (i2 >= b95Var.n && i2 < b95Var.r && i >= (i4 = g95Var.b5) && i < g95Var.c5) {
                        return ((Long) g95Var.A2.get(i - i4)).equals((Long) g95Var.T2.m.get(i2 - b95Var.n));
                    }
                    if (i2 >= b95Var.s && i2 < b95Var.w && i >= (i3 = g95Var.d5) && i < g95Var.e5) {
                        return ((Long) g95Var.B2.get(i - i3)).equals((Long) g95Var.T2.l.get(i2 - b95Var.s));
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
